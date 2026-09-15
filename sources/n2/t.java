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
import k2.c0;
import m4.u0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class t implements q {
    public static final u0 d = new u0(9);
    public final UUID f14920a;
    public final MediaDrm f14921b;
    public int f14922c;

    public t(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        e2.d.a("Use C.CLEARKEY_UUID instead", !b2.i.f3013b.equals(uuid));
        this.f14920a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(b2.i.f3014c)) ? uuid : uuid2);
        this.f14921b = mediaDrm;
        this.f14922c = 1;
        if (b2.i.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final h2.b B(byte[] bArr) {
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.f14920a;
        if (i10 < 27 && Objects.equals(uuid, b2.i.f3014c)) {
            uuid = b2.i.f3013b;
        }
        return new r(uuid, bArr);
    }

    @Override
    public final byte[] C() {
        return this.f14921b.openSession();
    }

    @Override
    public final void J(byte[] bArr, byte[] bArr2) {
        this.f14921b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void K(byte[] bArr) {
        this.f14921b.closeSession(bArr);
    }

    @Override
    public final byte[] X(byte[] bArr, byte[] bArr2) {
        if (b2.i.f3014c.equals(this.f14920a) && Build.VERSION.SDK_INT < 27) {
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
        return this.f14921b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final void a(final c0 c0Var) {
        this.f14921b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                t tVar = t.this;
                c0 c0Var2 = c0Var;
                tVar.getClass();
                androidx.mediarouter.app.c cVar = ((e) c0Var2.f13234b).M;
                cVar.getClass();
                cVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final Map d(byte[] bArr) {
        return this.f14921b.queryKeyStatus(bArr);
    }

    @Override
    public final void j0(byte[] bArr) {
        this.f14921b.provideProvisionResponse(bArr);
    }

    @Override
    public final n2.o k0(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: n2.t.k0(byte[], java.util.List, int, java.util.HashMap):n2.o");
    }

    @Override
    public final void l(byte[] bArr, j2.k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                h0.e(this.f14921b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                e2.a.n("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final p m() {
        MediaDrm.ProvisionRequest provisionRequest = this.f14921b.getProvisionRequest();
        return new p(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final int m0() {
        return 2;
    }

    @Override
    public final boolean r0(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid2 = this.f14920a;
        if (i10 >= 31) {
            boolean equals2 = uuid2.equals(b2.i.d);
            MediaDrm mediaDrm = this.f14921b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!propertyString.startsWith("v5.") && !propertyString.startsWith("14.") && !propertyString.startsWith("15.") && !propertyString.startsWith("16.0")) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = uuid2.equals(b2.i.f3014c);
            }
            if (equals) {
                return h0.b(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i10 < 27 && Objects.equals(uuid2, b2.i.f3014c)) {
                    uuid = b2.i.f3013b;
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
            boolean z10 = !uuid2.equals(b2.i.f3014c);
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
    public final synchronized void release() {
        int i10 = this.f14922c - 1;
        this.f14922c = i10;
        if (i10 == 0) {
            this.f14921b.release();
        }
    }
}
