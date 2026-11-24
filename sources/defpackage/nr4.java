package defpackage;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class nr4 implements t64 {
    public static final zo4 d = new zo4((byte) 5);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public nr4(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        jte.e("Use C.CLEARKEY_UUID instead", !n61.c.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(n61.d)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (n61.e.equals(uuid)) {
            HashSet hashSet = ct6.a;
            if ("ASUS_Z00AD".equals(Build.MODEL)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
            }
        }
    }

    @Override
    public final Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override
    public final s64 c() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new s64(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final lr4 f(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, n61.d)) {
            uuid = n61.c;
        }
        return new lr4(uuid, bArr);
    }

    @Override
    public final byte[] i() {
        return this.b.openSession();
    }

    @Override
    public final void j(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void k(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override
    public final byte[] l(byte[] bArr, byte[] bArr2) {
        if (n61.d.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(hac.r(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                ncd.d("ClearKeyUtil", "Failed to adjust response data: ".concat(hac.r(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final void m(final sz4 sz4Var) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                c1 c1Var = ((pb3) sz4Var.a).N;
                c1Var.getClass();
                c1Var.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final void o(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override
    public final defpackage.r64 q(byte[] r18, java.util.List r19, int r20, java.util.HashMap r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr4.q(byte[], java.util.List, int, java.util.HashMap):r64");
    }

    @Override
    public final int r() {
        return 2;
    }

    @Override
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override
    public final void t(byte[] bArr, we8 we8Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                y00.x(this.b, bArr, we8Var);
            } catch (UnsupportedOperationException unused) {
                ncd.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final boolean u(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid2 = this.a;
        if (i >= 31) {
            boolean equals2 = uuid2.equals(n61.e);
            MediaDrm mediaDrm = this.b;
            if (equals2) {
                if (i < 37) {
                    String propertyString = mediaDrm.getPropertyString("version");
                    if (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) {
                        equals = false;
                    }
                }
                equals = true;
            } else {
                equals = uuid2.equals(n61.d);
            }
            if (equals) {
                return y00.q(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i < 27 && Objects.equals(uuid2, n61.d)) {
                    uuid = n61.c;
                } else {
                    uuid = uuid2;
                }
                mediaCrypto = new MediaCrypto(uuid, bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !uuid2.equals(n61.d);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }
}
