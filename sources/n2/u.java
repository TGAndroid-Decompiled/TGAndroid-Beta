package n2;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import e0.h0;
import e2.d0;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import m.g3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class u implements r {
    public static final l d = new l(1);
    public final UUID f13750a;
    public final MediaDrm f13751b;
    public int f13752c;

    public u(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        e2.d.a("Use C.CLEARKEY_UUID instead", !b2.i.f1711b.equals(uuid));
        this.f13750a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(b2.i.f1712c)) ? uuid : uuid2);
        this.f13751b = mediaDrm;
        this.f13752c = 1;
        if (b2.i.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final byte[] B() {
        return this.f13751b.openSession();
    }

    @Override
    public final void F(byte[] bArr, byte[] bArr2) {
        this.f13751b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void G(byte[] bArr) {
        this.f13751b.closeSession(bArr);
    }

    @Override
    public final byte[] J(byte[] bArr, byte[] bArr2) {
        if (b2.i.f1712c.equals(this.f13750a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(d0.p(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                e2.a.f("ClearKeyUtil", "Failed to adjust response data: ".concat(d0.p(bArr2)), e);
            }
        }
        return this.f13751b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final void W(byte[] bArr) {
        this.f13751b.provideProvisionResponse(bArr);
    }

    @Override
    public final n2.p Z(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: n2.u.Z(byte[], java.util.List, int, java.util.HashMap):n2.p");
    }

    @Override
    public final int a0() {
        return 2;
    }

    @Override
    public final void c(final g3 g3Var) {
        this.f13751b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                u uVar = u.this;
                g3 g3Var2 = g3Var;
                uVar.getClass();
                androidx.mediarouter.app.c cVar = ((e) g3Var2.f13018b).M;
                cVar.getClass();
                cVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final Map h(byte[] bArr) {
        return this.f13751b.queryKeyStatus(bArr);
    }

    @Override
    public final boolean j0(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid2 = this.f13750a;
        if (i10 >= 31) {
            boolean equals2 = uuid2.equals(b2.i.d);
            MediaDrm mediaDrm = this.f13751b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!propertyString.startsWith("v5.") && !propertyString.startsWith("14.") && !propertyString.startsWith("15.") && !propertyString.startsWith("16.0")) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = uuid2.equals(b2.i.f1712c);
            }
            if (equals) {
                return h0.b(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i10 < 27 && Objects.equals(uuid2, b2.i.f1712c)) {
                    uuid = b2.i.f1711b;
                } else {
                    uuid = uuid2;
                }
                mediaCrypto = new MediaCrypto(uuid, bArr);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z10 = !uuid2.equals(b2.i.f1712c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z10;
        } catch (Throwable th3) {
            th = th3;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override
    public final void l(byte[] bArr, j2.k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                h0.e(this.f13751b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                e2.a.n("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final q p() {
        MediaDrm.ProvisionRequest provisionRequest = this.f13751b.getProvisionRequest();
        return new q(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final synchronized void release() {
        int i10 = this.f13752c - 1;
        this.f13752c = i10;
        if (i10 == 0) {
            this.f13751b.release();
        }
    }

    @Override
    public final h2.b x(byte[] bArr) {
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.f13750a;
        if (i10 < 27 && Objects.equals(uuid, b2.i.f1712c)) {
            uuid = b2.i.f1711b;
        }
        return new s(uuid, bArr);
    }
}
