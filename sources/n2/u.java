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
import m4.o0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class u implements r {
    public static final o0 d = new o0(25);
    public final UUID f16559a;
    public final MediaDrm f16560b;
    public int f16561c;

    public u(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        e2.d.a("Use C.CLEARKEY_UUID instead", !b2.i.f3255b.equals(uuid));
        this.f16559a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(b2.i.f3256c)) ? uuid : uuid2);
        this.f16560b = mediaDrm;
        this.f16561c = 1;
        if (b2.i.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final byte[] B() {
        return this.f16560b.openSession();
    }

    @Override
    public final void I(byte[] bArr, byte[] bArr2) {
        this.f16560b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void K(byte[] bArr) {
        this.f16560b.closeSession(bArr);
    }

    @Override
    public final byte[] X(byte[] bArr, byte[] bArr2) {
        if (b2.i.f3256c.equals(this.f16559a) && Build.VERSION.SDK_INT < 27) {
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
        return this.f16560b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final Map b(byte[] bArr) {
        return this.f16560b.queryKeyStatus(bArr);
    }

    @Override
    public final void d(byte[] bArr, j2.k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                h0.g(this.f16560b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                e2.a.n("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final void i(final c cVar) {
        this.f16560b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                u uVar = u.this;
                c cVar2 = cVar;
                uVar.getClass();
                androidx.mediarouter.app.c cVar3 = ((f) cVar2.f16523b).M;
                cVar3.getClass();
                cVar3.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final void j0(byte[] bArr) {
        this.f16560b.provideProvisionResponse(bArr);
    }

    @Override
    public final n2.p k0(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: n2.u.k0(byte[], java.util.List, int, java.util.HashMap):n2.p");
    }

    @Override
    public final q m() {
        MediaDrm.ProvisionRequest provisionRequest = this.f16560b.getProvisionRequest();
        return new q(provisionRequest.getDefaultUrl(), provisionRequest.getData());
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
        UUID uuid2 = this.f16559a;
        if (i10 >= 31) {
            boolean equals2 = uuid2.equals(b2.i.d);
            MediaDrm mediaDrm = this.f16560b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!propertyString.startsWith("v5.") && !propertyString.startsWith("14.") && !propertyString.startsWith("15.") && !propertyString.startsWith("16.0")) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = uuid2.equals(b2.i.f3256c);
            }
            if (equals) {
                return h0.d(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i10 < 27 && Objects.equals(uuid2, b2.i.f3256c)) {
                    uuid = b2.i.f3255b;
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
            boolean z10 = !uuid2.equals(b2.i.f3256c);
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
        int i10 = this.f16561c - 1;
        this.f16561c = i10;
        if (i10 == 0) {
            this.f16560b.release();
        }
    }

    @Override
    public final h2.b y(byte[] bArr) {
        int i10 = Build.VERSION.SDK_INT;
        UUID uuid = this.f16559a;
        if (i10 < 27 && Objects.equals(uuid, b2.i.f3256c)) {
            uuid = b2.i.f3255b;
        }
        return new s(uuid, bArr);
    }
}
