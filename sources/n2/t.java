package n2;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import e0.f0;
import e2.d0;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import m4.q0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class t implements q {
    public static final q0 d = new q0(19);
    public final UUID f16537a;
    public final MediaDrm f16538b;
    public int f16539c;

    public t(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        e2.d.a("Use C.CLEARKEY_UUID instead", !b2.i.f3334b.equals(uuid));
        this.f16537a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(b2.i.f3335c)) ? uuid : uuid2);
        this.f16538b = mediaDrm;
        this.f16539c = 1;
        if (b2.i.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final byte[] C(byte[] bArr, byte[] bArr2) {
        if (b2.i.f3335c.equals(this.f16537a) && Build.VERSION.SDK_INT < 27) {
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
            } catch (JSONException e7) {
                e2.a.f("ClearKeyUtil", "Failed to adjust response data: ".concat(d0.p(bArr2)), e7);
            }
        }
        return this.f16538b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final void H(byte[] bArr) {
        this.f16538b.provideProvisionResponse(bArr);
    }

    @Override
    public final n2.o J(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: n2.t.J(byte[], java.util.List, int, java.util.HashMap):n2.o");
    }

    @Override
    public final int K() {
        return 2;
    }

    @Override
    public final void V(final l2.f fVar) {
        this.f16538b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                t tVar = t.this;
                l2.f fVar2 = fVar;
                tVar.getClass();
                androidx.mediarouter.app.c cVar = ((e) fVar2.f15335b).M;
                cVar.getClass();
                cVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final boolean Z(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid2 = this.f16537a;
        if (i10 >= 31) {
            boolean equals2 = uuid2.equals(b2.i.d);
            MediaDrm mediaDrm = this.f16538b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!propertyString.startsWith("v5.") && !propertyString.startsWith("14.") && !propertyString.startsWith("15.") && !propertyString.startsWith("16.0")) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = uuid2.equals(b2.i.f3335c);
            }
            if (equals) {
                return f0.b(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i10 < 27 && Objects.equals(uuid2, b2.i.f3335c)) {
                    uuid = b2.i.f3334b;
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
            boolean z10 = !uuid2.equals(b2.i.f3335c);
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
    public final Map b(byte[] bArr) {
        return this.f16538b.queryKeyStatus(bArr);
    }

    @Override
    public final void h(byte[] bArr, j2.k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                f0.e(this.f16538b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                e2.a.n("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final p l() {
        MediaDrm.ProvisionRequest provisionRequest = this.f16538b.getProvisionRequest();
        return new p(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final h2.b q(byte[] bArr) {
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.f16537a;
        if (i10 < 27 && Objects.equals(uuid, b2.i.f3335c)) {
            uuid = b2.i.f3334b;
        }
        return new r(uuid, bArr);
    }

    @Override
    public final synchronized void release() {
        int i10 = this.f16539c - 1;
        this.f16539c = i10;
        if (i10 == 0) {
            this.f16538b.release();
        }
    }

    @Override
    public final byte[] v() {
        return this.f16538b.openSession();
    }

    @Override
    public final void x(byte[] bArr, byte[] bArr2) {
        this.f16538b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void y(byte[] bArr) {
        this.f16538b.closeSession(bArr);
    }
}
