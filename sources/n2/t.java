package n2;

import a8.yb;
import ag.t0;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import e2.n0;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import li.e3;
import m4.x0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class t implements q {
    public static final x0 d = new x0(18);
    public final UUID f18640a;
    public final MediaDrm f18641b;
    public int f18642c;

    public t(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        yb.f("Use C.CLEARKEY_UUID instead", !b2.n.f3285c.equals(uuid));
        this.f18640a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(b2.n.d)) ? uuid : uuid2);
        this.f18641b = mediaDrm;
        this.f18642c = 1;
        if (b2.n.e.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final void E(byte[] bArr, byte[] bArr2) {
        this.f18641b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void H(byte[] bArr) {
        this.f18641b.closeSession(bArr);
    }

    @Override
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        if (b2.n.d.equals(this.f18640a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(n0.r(bArr2));
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
                e2.a.d("ClearKeyUtil", "Failed to adjust response data: ".concat(n0.r(bArr2)), e);
            }
        }
        return this.f18641b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final void T(final e3 e3Var) {
        this.f18641b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                t tVar = t.this;
                e3 e3Var2 = e3Var;
                tVar.getClass();
                androidx.mediarouter.app.c cVar = ((e) e3Var2.f17210b).M;
                cVar.getClass();
                cVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final void U(byte[] bArr) {
        this.f18641b.provideProvisionResponse(bArr);
    }

    @Override
    public final n2.o Y(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: n2.t.Y(byte[], java.util.List, int, java.util.HashMap):n2.o");
    }

    @Override
    public final Map b(byte[] bArr) {
        return this.f18641b.queryKeyStatus(bArr);
    }

    @Override
    public final void e(byte[] bArr, j2.j jVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                t0.h(this.f18641b, bArr, jVar);
            } catch (UnsupportedOperationException unused) {
                e2.a.l("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final int i0() {
        return 2;
    }

    @Override
    public final p k() {
        MediaDrm.ProvisionRequest provisionRequest = this.f18641b.getProvisionRequest();
        return new p(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final boolean p0(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid2 = this.f18640a;
        if (i10 >= 31) {
            boolean equals2 = uuid2.equals(b2.n.e);
            MediaDrm mediaDrm = this.f18641b;
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
                return t0.f(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i10 < 27 && Objects.equals(uuid2, b2.n.d)) {
                    uuid = b2.n.f3285c;
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
    public final synchronized void release() {
        int i10 = this.f18642c - 1;
        this.f18642c = i10;
        if (i10 == 0) {
            this.f18641b.release();
        }
    }

    @Override
    public final h2.b y(byte[] bArr) {
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.f18640a;
        if (i10 < 27 && Objects.equals(uuid, b2.n.d)) {
            uuid = b2.n.f3285c;
        }
        return new r(uuid, bArr);
    }

    @Override
    public final byte[] z() {
        return this.f18641b.openSession();
    }
}
