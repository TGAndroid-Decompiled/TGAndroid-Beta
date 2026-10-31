package n2;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import e0.f0;
import e2.l0;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import m4.v0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.t6;
public final class t implements q {
    public static final v0 d = new v0(20);
    public final UUID f13476a;
    public final MediaDrm f13477b;
    public int f13478c;

    public t(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        t6.e("Use C.CLEARKEY_UUID instead", !b2.n.f2121c.equals(uuid));
        this.f13476a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(b2.n.d)) ? uuid : uuid2);
        this.f13477b = mediaDrm;
        this.f13478c = 1;
        if (b2.n.e.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final void B0(byte[] bArr) {
        this.f13477b.closeSession(bArr);
    }

    @Override
    public final byte[] P0(byte[] bArr, byte[] bArr2) {
        if (b2.n.d.equals(this.f13476a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(l0.r(bArr2));
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
                e2.a.d("ClearKeyUtil", "Failed to adjust response data: ".concat(l0.r(bArr2)), e);
            }
        }
        return this.f13477b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final h2.b X(byte[] bArr) {
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.f13476a;
        if (i10 < 27 && Objects.equals(uuid, b2.n.d)) {
            uuid = b2.n.f2121c;
        }
        return new r(uuid, bArr);
    }

    @Override
    public final void X0(byte[] bArr) {
        this.f13477b.provideProvisionResponse(bArr);
    }

    @Override
    public final n2.o Y0(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: n2.t.Y0(byte[], java.util.List, int, java.util.HashMap):n2.o");
    }

    @Override
    public final byte[] b0() {
        return this.f13477b.openSession();
    }

    @Override
    public final int d1() {
        return 2;
    }

    @Override
    public final Map k(byte[] bArr) {
        return this.f13477b.queryKeyStatus(bArr);
    }

    @Override
    public final void p(byte[] bArr, j2.l lVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                f0.h(this.f13477b, bArr, lVar);
            } catch (UnsupportedOperationException unused) {
                e2.a.l("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final void q0(byte[] bArr, byte[] bArr2) {
        this.f13477b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final synchronized void release() {
        int i10 = this.f13478c - 1;
        this.f13478c = i10;
        if (i10 == 0) {
            this.f13477b.release();
        }
    }

    @Override
    public final p u() {
        MediaDrm.ProvisionRequest provisionRequest = this.f13477b.getProvisionRequest();
        return new p(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final boolean x1(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid2 = this.f13476a;
        if (i10 >= 31) {
            boolean equals2 = uuid2.equals(b2.n.e);
            MediaDrm mediaDrm = this.f13477b;
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
                return f0.f(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i10 < 27 && Objects.equals(uuid2, b2.n.d)) {
                    uuid = b2.n.f2121c;
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
    public final void y(final m2.t tVar) {
        this.f13477b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                t tVar2 = t.this;
                m2.t tVar3 = tVar;
                tVar2.getClass();
                android.support.v4.media.session.q qVar = ((e) tVar3.f12684b).M;
                qVar.getClass();
                qVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }
}
