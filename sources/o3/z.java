package o3;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import androidx.biometric.f0;
import h5.d0;
import java.util.Map;
import java.util.UUID;
import m.j0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class z implements v {
    public static final j0 d = new j0(10);
    public final UUID f16284a;
    public final MediaDrm f16285b;
    public int f16286c;

    public z(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        h5.a.e("Use C.CLEARKEY_UUID instead", !j3.h.f8594b.equals(uuid));
        this.f16284a = uuid;
        MediaDrm mediaDrm = new MediaDrm((d0.f6937a >= 27 || !j3.h.f8595c.equals(uuid)) ? uuid : uuid2);
        this.f16285b = mediaDrm;
        this.f16286c = 1;
        if (j3.h.d.equals(uuid) && "ASUS_Z00AD".equals(d0.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final void B(final f0 f0Var) {
        this.f16285b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                z zVar = z.this;
                f0 f0Var2 = f0Var;
                zVar.getClass();
                androidx.mediarouter.app.d dVar = ((e) f0Var2.f483b).J;
                dVar.getClass();
                dVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final n3.b D0(byte[] bArr) {
        boolean z4;
        int i10 = d0.f6937a;
        UUID uuid = this.f16284a;
        if (i10 < 21 && j3.h.d.equals(uuid) && "L3".equals(this.f16285b.getPropertyString("securityLevel"))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 < 27 && j3.h.f8595c.equals(uuid)) {
            uuid = j3.h.f8594b;
        }
        return new w(uuid, bArr, z4);
    }

    @Override
    public final byte[] F1(byte[] bArr, byte[] bArr2) {
        if (j3.h.f8595c.equals(this.f16284a) && d0.f6937a < 27) {
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
                bArr2 = sb.toString().getBytes(r8.d.f43389c);
            } catch (JSONException e) {
                h5.a.p("ClearKeyUtil", "Failed to adjust response data: ".concat(d0.m(bArr2)), e);
            }
        }
        return this.f16285b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final u K() {
        MediaDrm.ProvisionRequest provisionRequest = this.f16285b.getProvisionRequest();
        return new u(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final byte[] M0() {
        return this.f16285b.openSession();
    }

    @Override
    public final void Q1(byte[] bArr) {
        this.f16285b.provideProvisionResponse(bArr);
    }

    @Override
    public final o3.t U1(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: o3.z.U1(byte[], java.util.List, int, java.util.HashMap):o3.t");
    }

    @Override
    public final void V(byte[] bArr, k3.k kVar) {
        if (d0.f6937a >= 31) {
            try {
                y.b(this.f16285b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                h5.a.K("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final int b2() {
        return 2;
    }

    @Override
    public final void h1(byte[] bArr, byte[] bArr2) {
        this.f16285b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void m1(byte[] bArr) {
        this.f16285b.closeSession(bArr);
    }

    @Override
    public final synchronized void release() {
        int i10 = this.f16286c - 1;
        this.f16286c = i10;
        if (i10 == 0) {
            this.f16285b.release();
        }
    }

    @Override
    public final Map v(byte[] bArr) {
        return this.f16285b.queryKeyStatus(bArr);
    }

    @Override
    public final boolean w2(String str, byte[] bArr) {
        if (d0.f6937a >= 31) {
            return y.a(this.f16285b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f16284a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }
}
