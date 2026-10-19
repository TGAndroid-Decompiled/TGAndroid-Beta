package n2;

import ab.o0;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import e0.e0;
import e2.m0;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import m4.v0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.u6;
public final class u implements r {
    public static final v0 d = new v0(14);
    public final UUID f17072a;
    public final MediaDrm f17073b;
    public int f17074c;

    public u(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        u6.f("Use C.CLEARKEY_UUID instead", !b2.m.f3827c.equals(uuid));
        this.f17072a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(b2.m.d)) ? uuid : uuid2);
        this.f17073b = mediaDrm;
        this.f17074c = 1;
        if (b2.m.e.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final boolean B0(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid2 = this.f17072a;
        if (i10 >= 31) {
            boolean equals2 = uuid2.equals(b2.m.e);
            MediaDrm mediaDrm = this.f17073b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!propertyString.startsWith("v5.") && !propertyString.startsWith("14.") && !propertyString.startsWith("15.") && !propertyString.startsWith("16.0")) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = uuid2.equals(b2.m.d);
            }
            if (equals) {
                return e0.d(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i10 < 27 && Objects.equals(uuid2, b2.m.d)) {
                    uuid = b2.m.f3827c;
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
            boolean z10 = !uuid2.equals(b2.m.d);
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
    public final byte[] H() {
        return this.f17073b.openSession();
    }

    @Override
    public final void U(byte[] bArr, byte[] bArr2) {
        this.f17073b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void Y(byte[] bArr) {
        this.f17073b.closeSession(bArr);
    }

    @Override
    public final Map b(byte[] bArr) {
        return this.f17073b.queryKeyStatus(bArr);
    }

    @Override
    public final byte[] g0(byte[] bArr, byte[] bArr2) {
        if (b2.m.d.equals(this.f17072a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(m0.r(bArr2));
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
                e2.a.d("ClearKeyUtil", "Failed to adjust response data: ".concat(m0.r(bArr2)), e);
            }
        }
        return this.f17073b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final void h(byte[] bArr, j2.k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                e0.f(this.f17073b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                e2.a.l("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final void j0(byte[] bArr) {
        this.f17073b.provideProvisionResponse(bArr);
    }

    @Override
    public final n2.p k0(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: n2.u.k0(byte[], java.util.List, int, java.util.HashMap):n2.p");
    }

    @Override
    public final int m0() {
        return 2;
    }

    @Override
    public final q o() {
        MediaDrm.ProvisionRequest provisionRequest = this.f17073b.getProvisionRequest();
        return new q(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final h2.b r(byte[] bArr) {
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.f17072a;
        if (i10 < 27 && Objects.equals(uuid, b2.m.d)) {
            uuid = b2.m.f3827c;
        }
        return new s(uuid, bArr);
    }

    @Override
    public final synchronized void release() {
        int i10 = this.f17074c - 1;
        this.f17074c = i10;
        if (i10 == 0) {
            this.f17073b.release();
        }
    }

    @Override
    public final void t0(final l2.f fVar) {
        this.f17073b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                u uVar = u.this;
                l2.f fVar2 = fVar;
                uVar.getClass();
                o0 o0Var = ((f) fVar2.f15843b).M;
                o0Var.getClass();
                o0Var.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }
}
