package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
public final class q0 extends o6.a {
    public static final Parcelable.Creator<q0> CREATOR = new w.a(23);
    public static final byte[] f4654b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] f4655a;

    public q0(byte[][] bArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (bArr != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.b(z10);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z11 = false;
        } else {
            z11 = true;
        }
        n6.l.b(z11);
        for (int i10 = 0; i10 < bArr.length; i10 += 2) {
            if (i10 == 0 || bArr[i10] != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            n6.l.b(z12);
            int i11 = i10 + 1;
            if (bArr[i11] != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            n6.l.b(z13);
            int length = bArr[i11].length;
            if (length == 32 || length == 64) {
                z14 = true;
            } else {
                z14 = false;
            }
            n6.l.b(z14);
        }
        this.f4655a = bArr;
    }

    public static q0 b(JSONObject jSONObject, boolean z10) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z10) {
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
                    arrayList.add(u6.b.b(next));
                    if (z10) {
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
        throw new UnsupportedOperationException("Method not decompiled: c7.q0.d(byte[]):byte[]");
    }

    public static byte[] e(JSONObject jSONObject) {
        byte[] b10 = u6.b.b(jSONObject.getString("first"));
        if (b10.length == 32) {
            if (!jSONObject.has("second")) {
                return b10;
            }
            byte[] b11 = u6.b.b(jSONObject.getString("second"));
            if (b11.length == 32) {
                return n7.a.j(b10, b11);
            }
            throw new JSONException("hashed PRF value with wrong length");
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] d = d(u6.b.b(jSONObject.getString("first")));
        if (!jSONObject.has("second")) {
            return d;
        }
        return n7.a.j(d, d(u6.b.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        return Arrays.deepEquals(this.f4655a, ((q0) obj).f4655a);
    }

    public final int hashCode() {
        byte[][] bArr;
        int i10 = 0;
        for (byte[] bArr2 : this.f4655a) {
            if (bArr2 != null) {
                i10 ^= Arrays.hashCode(new Object[]{bArr2});
            }
        }
        return i10;
    }

    public final String toString() {
        byte[][] bArr = this.f4655a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                if (bArr[i10] == null) {
                    jSONObject.put("eval", c(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(u6.b.c(bArr[i10]), c(bArr[i10 + 1]));
                }
            }
            String obj = jSONObject.toString();
            return "PrfExtension{" + obj + "}";
        } catch (JSONException e7) {
            return a4.a.p("PrfExtension{Exception:", e7.getMessage(), "}");
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.d(parcel, 1, this.f4655a);
        w7.e0.r(parcel, q6);
    }
}
