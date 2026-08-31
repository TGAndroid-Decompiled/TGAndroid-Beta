package o3;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import h5.d0;
import java.util.Map;
import java.util.UUID;
import mh.c3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class z implements v {
    public static final c3 d = new c3(3);
    public final UUID f16425a;
    public final MediaDrm f16426b;
    public int f16427c;

    public z(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        h5.a.e("Use C.CLEARKEY_UUID instead", !j3.h.f9163b.equals(uuid));
        this.f16425a = uuid;
        MediaDrm mediaDrm = new MediaDrm((d0.f7237a >= 27 || !j3.h.f9164c.equals(uuid)) ? uuid : uuid2);
        this.f16426b = mediaDrm;
        this.f16427c = 1;
        if (j3.h.d.equals(uuid) && "ASUS_Z00AD".equals(d0.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final boolean C2(String str, byte[] bArr) {
        if (d0.f7237a >= 31) {
            return y.a(this.f16426b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f16425a, bArr);
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
    public final n3.b E0(byte[] bArr) {
        boolean z4;
        int i10 = d0.f7237a;
        UUID uuid = this.f16425a;
        if (i10 < 21 && j3.h.d.equals(uuid) && "L3".equals(this.f16426b.getPropertyString("securityLevel"))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 < 27 && j3.h.f9164c.equals(uuid)) {
            uuid = j3.h.f9163b;
        }
        return new w(uuid, bArr, z4);
    }

    @Override
    public final u J() {
        MediaDrm.ProvisionRequest provisionRequest = this.f16426b.getProvisionRequest();
        return new u(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final byte[] K1(byte[] bArr, byte[] bArr2) {
        if (j3.h.f9164c.equals(this.f16425a) && d0.f7237a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(d0.m(bArr2));
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
                bArr2 = sb.toString().getBytes(r8.d.f46738c);
            } catch (JSONException e6) {
                h5.a.p("ClearKeyUtil", "Failed to adjust response data: ".concat(d0.m(bArr2)), e6);
            }
        }
        return this.f16426b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final void M0(final ja.c cVar) {
        this.f16426b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                z zVar = z.this;
                ja.c cVar2 = cVar;
                zVar.getClass();
                androidx.mediarouter.app.d dVar = ((e) cVar2.f9988a).J;
                dVar.getClass();
                dVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final byte[] O0() {
        return this.f16426b.openSession();
    }

    @Override
    public final void U(byte[] bArr, k3.k kVar) {
        if (d0.f7237a >= 31) {
            try {
                y.b(this.f16426b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                h5.a.K("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final void V1(byte[] bArr) {
        this.f16426b.provideProvisionResponse(bArr);
    }

    @Override
    public final o3.t Z1(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: o3.z.Z1(byte[], java.util.List, int, java.util.HashMap):o3.t");
    }

    @Override
    public final int h2() {
        return 2;
    }

    @Override
    public final void k1(byte[] bArr, byte[] bArr2) {
        this.f16426b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void q1(byte[] bArr) {
        this.f16426b.closeSession(bArr);
    }

    @Override
    public final synchronized void release() {
        int i10 = this.f16427c - 1;
        this.f16427c = i10;
        if (i10 == 0) {
            this.f16426b.release();
        }
    }

    @Override
    public final Map w(byte[] bArr) {
        return this.f16426b.queryKeyStatus(bArr);
    }
}
