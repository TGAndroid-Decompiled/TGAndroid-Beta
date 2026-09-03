package o3;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import java.util.Map;
import java.util.UUID;
import m.j0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class a0 implements w {
    public static final j0 d = new j0(10);
    public final UUID f16204a;
    public final MediaDrm f16205b;
    public int f16206c;

    public a0(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        h5.a.e("Use C.CLEARKEY_UUID instead", !j3.h.f8576b.equals(uuid));
        this.f16204a = uuid;
        MediaDrm mediaDrm = new MediaDrm((h5.d0.f6924a >= 27 || !j3.h.f8577c.equals(uuid)) ? uuid : uuid2);
        this.f16205b = mediaDrm;
        this.f16206c = 1;
        if (j3.h.d.equals(uuid) && "ASUS_Z00AD".equals(h5.d0.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final byte[] B() {
        return this.f16205b.openSession();
    }

    @Override
    public final void C(final c cVar) {
        this.f16205b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                a0 a0Var = a0.this;
                c cVar2 = cVar;
                a0Var.getClass();
                androidx.mediarouter.app.d dVar = ((f) cVar2.f16228b).J;
                dVar.getClass();
                dVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final void G(byte[] bArr, byte[] bArr2) {
        this.f16205b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void H(byte[] bArr) {
        this.f16205b.closeSession(bArr);
    }

    @Override
    public final byte[] X(byte[] bArr, byte[] bArr2) {
        if (j3.h.f8577c.equals(this.f16204a) && h5.d0.f6924a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(h5.d0.m(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(r8.d.f43413c);
            } catch (JSONException e) {
                h5.a.p("ClearKeyUtil", "Failed to adjust response data: ".concat(h5.d0.m(bArr2)), e);
            }
        }
        return this.f16205b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final void Y(byte[] bArr) {
        this.f16205b.provideProvisionResponse(bArr);
    }

    @Override
    public final Map a(byte[] bArr) {
        return this.f16205b.queryKeyStatus(bArr);
    }

    @Override
    public final o3.u b0(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: o3.a0.b0(byte[], java.util.List, int, java.util.HashMap):o3.u");
    }

    @Override
    public final v d() {
        MediaDrm.ProvisionRequest provisionRequest = this.f16205b.getProvisionRequest();
        return new v(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final int h0() {
        return 2;
    }

    @Override
    public final boolean j0(String str, byte[] bArr) {
        if (h5.d0.f6924a >= 31) {
            return z.a(this.f16205b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f16204a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override
    public final void k(byte[] bArr, k3.k kVar) {
        if (h5.d0.f6924a >= 31) {
            try {
                z.b(this.f16205b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                h5.a.K("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final synchronized void release() {
        int i10 = this.f16206c - 1;
        this.f16206c = i10;
        if (i10 == 0) {
            this.f16205b.release();
        }
    }

    @Override
    public final n3.b z(byte[] bArr) {
        boolean z4;
        int i10 = h5.d0.f6924a;
        UUID uuid = this.f16204a;
        if (i10 < 21 && j3.h.d.equals(uuid) && "L3".equals(this.f16205b.getPropertyString("securityLevel"))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 < 27 && j3.h.f8577c.equals(uuid)) {
            uuid = j3.h.f8576b;
        }
        return new x(uuid, bArr, z4);
    }
}
