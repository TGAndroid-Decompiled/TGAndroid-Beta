package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import c8.xb;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
public final class q0 extends r6.a {
    public static final Parcelable.Creator<q0> CREATOR = new db.k(12);
    public static final byte[] f11420b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] f11421a;

    public q0(byte[][] bArr) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (bArr != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        q6.m.b(z9);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        q6.m.b(z10);
        for (int i7 = 0; i7 < bArr.length; i7 += 2) {
            if (i7 == 0 || bArr[i7] != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            q6.m.b(z11);
            int i10 = i7 + 1;
            if (bArr[i10] != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            q6.m.b(z12);
            int length = bArr[i10].length;
            if (length == 32 || length == 64) {
                z13 = true;
            } else {
                z13 = false;
            }
            q6.m.b(z13);
        }
        this.f11421a = bArr;
    }

    public static q0 b(JSONObject jSONObject, boolean z9) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z9) {
                    arrayList.add(e(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(f(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(x6.b.b(next));
                    if (z9) {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(f(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new q0((byte[][]) arrayList.toArray(new byte[0]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject c(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] d(byte[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: f7.q0.d(byte[]):byte[]");
    }

    public static byte[] e(JSONObject jSONObject) {
        byte[] b10 = x6.b.b(jSONObject.getString("first"));
        if (b10.length == 32) {
            if (!jSONObject.has("second")) {
                return b10;
            }
            byte[] b11 = x6.b.b(jSONObject.getString("second"));
            if (b11.length == 32) {
                return q7.a.j(b10, b11);
            }
            throw new JSONException("hashed PRF value with wrong length");
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] d = d(x6.b.b(jSONObject.getString("first")));
        if (!jSONObject.has("second")) {
            return d;
        }
        return q7.a.j(d, d(x6.b.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        return Arrays.deepEquals(this.f11421a, ((q0) obj).f11421a);
    }

    public final int hashCode() {
        byte[][] bArr;
        int i7 = 0;
        for (byte[] bArr2 : this.f11421a) {
            if (bArr2 != null) {
                i7 ^= Arrays.hashCode(new Object[]{bArr2});
            }
        }
        return i7;
    }

    public final String toString() {
        byte[][] bArr = this.f11421a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i7 = 0; i7 < bArr.length; i7 += 2) {
                if (bArr[i7] == null) {
                    jSONObject.put("eval", c(bArr[i7 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(x6.b.c(bArr[i7]), c(bArr[i7 + 1]));
                }
            }
            String obj = jSONObject.toString();
            return "PrfExtension{" + obj + "}";
        } catch (JSONException e10) {
            return a8.p0.p("PrfExtension{Exception:", e10.getMessage(), "}");
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.d(parcel, 1, this.f11421a);
        xb.s(parcel, r10);
    }
}
