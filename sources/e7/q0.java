package e7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
public final class q0 extends q6.a {
    public static final Parcelable.Creator<q0> CREATOR = new w.a(27);
    public static final byte[] f9858b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] f9859a;

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
        p6.m.b(z10);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z11 = false;
        } else {
            z11 = true;
        }
        p6.m.b(z11);
        for (int i3 = 0; i3 < bArr.length; i3 += 2) {
            if (i3 == 0 || bArr[i3] != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            p6.m.b(z12);
            int i10 = i3 + 1;
            if (bArr[i10] != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            p6.m.b(z13);
            int length = bArr[i10].length;
            if (length == 32 || length == 64) {
                z14 = true;
            } else {
                z14 = false;
            }
            p6.m.b(z14);
        }
        this.f9859a = bArr;
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
                    arrayList.add(w6.b.b(next));
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
        throw new UnsupportedOperationException("Method not decompiled: e7.q0.d(byte[]):byte[]");
    }

    public static byte[] e(JSONObject jSONObject) {
        byte[] b10 = w6.b.b(jSONObject.getString("first"));
        if (b10.length == 32) {
            if (!jSONObject.has("second")) {
                return b10;
            }
            byte[] b11 = w6.b.b(jSONObject.getString("second"));
            if (b11.length == 32) {
                return p7.a.j(b10, b11);
            }
            throw new JSONException("hashed PRF value with wrong length");
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] d = d(w6.b.b(jSONObject.getString("first")));
        if (!jSONObject.has("second")) {
            return d;
        }
        return p7.a.j(d, d(w6.b.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        return Arrays.deepEquals(this.f9859a, ((q0) obj).f9859a);
    }

    public final int hashCode() {
        byte[][] bArr;
        int i3 = 0;
        for (byte[] bArr2 : this.f9859a) {
            if (bArr2 != null) {
                i3 ^= Arrays.hashCode(new Object[]{bArr2});
            }
        }
        return i3;
    }

    public final String toString() {
        byte[][] bArr = this.f9859a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i3 = 0; i3 < bArr.length; i3 += 2) {
                if (bArr[i3] == null) {
                    jSONObject.put("eval", c(bArr[i3 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(w6.b.c(bArr[i3]), c(bArr[i3 + 1]));
                }
            }
            String obj = jSONObject.toString();
            return "PrfExtension{" + obj + "}";
        } catch (JSONException e10) {
            return a1.g.q("PrfExtension{Exception:", e10.getMessage(), "}");
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.e(parcel, 1, this.f9859a);
        j8.a.t(parcel, s6);
    }
}
