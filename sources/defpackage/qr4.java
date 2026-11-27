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
public final class qr4 implements d64 {
    public static final xi4 d = new xi4((byte) 15);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public qr4(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        yve.e("Use C.CLEARKEY_UUID instead", !o51.c.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(o51.d)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (o51.e.equals(uuid)) {
            HashSet hashSet = gt6.a;
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
    public final c64 d() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new c64(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final or4 g(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, o51.d)) {
            uuid = o51.c;
        }
        return new or4(uuid, bArr);
    }

    @Override
    public final byte[] h() {
        return this.b.openSession();
    }

    @Override
    public final void i(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void k(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override
    public final byte[] l(byte[] bArr, byte[] bArr2) {
        if (o51.d.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(gcc.r(bArr2));
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
                efd.d("ClearKeyUtil", "Failed to adjust response data: ".concat(gcc.r(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final void m(final wz4 wz4Var) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                d1 d1Var = ((wa3) wz4Var.a).N;
                d1Var.getClass();
                d1Var.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final void r(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
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
    public final defpackage.b64 u(byte[] r18, java.util.List r19, int r20, java.util.HashMap r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr4.u(byte[], java.util.List, int, java.util.HashMap):b64");
    }

    @Override
    public final int v() {
        return 2;
    }

    @Override
    public final void x(byte[] bArr, ig8 ig8Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                zz.x(this.b, bArr, ig8Var);
            } catch (UnsupportedOperationException unused) {
                efd.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final boolean z(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid2 = this.a;
        if (i >= 31) {
            boolean equals2 = uuid2.equals(o51.e);
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
                equals = uuid2.equals(o51.d);
            }
            if (equals) {
                return zz.q(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i < 27 && Objects.equals(uuid2, o51.d)) {
                    uuid = o51.c;
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
            boolean z = !uuid2.equals(o51.d);
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
