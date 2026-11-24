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
public final class mp4 implements i54 {
    public static final wn4 d = new wn4((byte) 3);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public mp4(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        gre.e("Use C.CLEARKEY_UUID instead", !g51.c.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(g51.d)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (g51.e.equals(uuid)) {
            HashSet hashSet = cr6.a;
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
    public final h54 c() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new h54(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final kp4 g(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, g51.d)) {
            uuid = g51.c;
        }
        return new kp4(uuid, bArr);
    }

    @Override
    public final byte[] j() {
        return this.b.openSession();
    }

    @Override
    public final void k(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void l(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override
    public final void n(final lj9 lj9Var) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                c1 c1Var = ((da3) lj9Var.b).N;
                c1Var.getClass();
                c1Var.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final byte[] p(byte[] bArr, byte[] bArr2) {
        if (g51.d.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(g8c.r(bArr2));
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
                lad.d("ClearKeyUtil", "Failed to adjust response data: ".concat(g8c.r(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
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
    public final void s(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override
    public final defpackage.g54 t(byte[] r18, java.util.List r19, int r20, java.util.HashMap r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp4.t(byte[], java.util.List, int, java.util.HashMap):g54");
    }

    @Override
    public final int v() {
        return 2;
    }

    @Override
    public final void w(byte[] bArr, uc8 uc8Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                yz.x(this.b, bArr, uc8Var);
            } catch (UnsupportedOperationException unused) {
                lad.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final boolean x(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid2 = this.a;
        if (i >= 31) {
            boolean equals2 = uuid2.equals(g51.e);
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
                equals = uuid2.equals(g51.d);
            }
            if (equals) {
                return yz.q(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i < 27 && Objects.equals(uuid2, g51.d)) {
                    uuid = g51.c;
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
            boolean z = !uuid2.equals(g51.d);
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
