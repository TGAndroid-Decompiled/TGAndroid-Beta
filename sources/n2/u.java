package n2;

import ab.o0;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import e0.f0;
import e2.m0;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import ji.w4;
import m4.w0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.u6;
public final class u implements r {
    public static final w0 d = new w0(14);
    public final UUID f15978a;
    public final MediaDrm f15979b;
    public int f15980c;

    public u(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        u6.f("Use C.CLEARKEY_UUID instead", !b2.n.f2218c.equals(uuid));
        this.f15978a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(b2.n.d)) ? uuid : uuid2);
        this.f15979b = mediaDrm;
        this.f15980c = 1;
        if (b2.n.e.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final byte[] D() {
        return this.f15979b.openSession();
    }

    @Override
    public final boolean D0(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid2 = this.f15978a;
        if (i10 >= 31) {
            boolean equals2 = uuid2.equals(b2.n.e);
            MediaDrm mediaDrm = this.f15979b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!propertyString.startsWith("v5.") && !propertyString.startsWith("14.") && !propertyString.startsWith("15.") && !propertyString.startsWith("16.0")) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = uuid2.equals(b2.n.d);
            }
            if (equals) {
                return f0.d(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i10 < 27 && Objects.equals(uuid2, b2.n.d)) {
                    uuid = b2.n.f2218c;
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
            boolean z10 = !uuid2.equals(b2.n.d);
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
    public final void K(byte[] bArr, byte[] bArr2) {
        this.f15979b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void X(byte[] bArr) {
        this.f15979b.closeSession(bArr);
    }

    @Override
    public final Map b(byte[] bArr) {
        return this.f15979b.queryKeyStatus(bArr);
    }

    @Override
    public final void h(byte[] bArr, j2.k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                f0.f(this.f15979b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                e2.a.l("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final byte[] j0(byte[] bArr, byte[] bArr2) {
        if (b2.n.d.equals(this.f15978a) && Build.VERSION.SDK_INT < 27) {
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
        return this.f15979b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final void k0(byte[] bArr) {
        this.f15979b.provideProvisionResponse(bArr);
    }

    @Override
    public final q l() {
        MediaDrm.ProvisionRequest provisionRequest = this.f15979b.getProvisionRequest();
        return new q(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final n2.p m0(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: n2.u.m0(byte[], java.util.List, int, java.util.HashMap):n2.p");
    }

    @Override
    public final h2.b q(byte[] bArr) {
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.f15978a;
        if (i10 < 27 && Objects.equals(uuid, b2.n.d)) {
            uuid = b2.n.f2218c;
        }
        return new s(uuid, bArr);
    }

    @Override
    public final synchronized void release() {
        int i10 = this.f15980c - 1;
        this.f15980c = i10;
        if (i10 == 0) {
            this.f15979b.release();
        }
    }

    @Override
    public final int s0() {
        return 2;
    }

    @Override
    public final void t0(final w4 w4Var) {
        this.f15979b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                u uVar = u.this;
                w4 w4Var2 = w4Var;
                uVar.getClass();
                o0 o0Var = ((e) w4Var2.f13592b).M;
                o0Var.getClass();
                o0Var.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }
}
