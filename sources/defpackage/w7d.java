package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
public final class w7d extends b4 {
    public static final Parcelable.Creator<w7d> CREATOR = new t4d((byte) 21);
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public w7d(byte[][] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (bArr != null) {
            z = true;
        } else {
            z = false;
        }
        fre.b(z);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        fre.b(z2);
        for (int i = 0; i < bArr.length; i += 2) {
            if (i != 0 && bArr[i] == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            fre.b(z3);
            int i2 = i + 1;
            if (bArr[i2] != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            fre.b(z4);
            int length = bArr[i2].length;
            if (length != 32 && length != 64) {
                z5 = false;
            } else {
                z5 = true;
            }
            fre.b(z5);
        }
        this.a = bArr;
    }

    public static w7d b(JSONObject jSONObject, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
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
                    arrayList.add(und.a(next));
                    if (z) {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(f(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new w7d((byte[][]) arrayList.toArray(new byte[0]));
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

    public static byte[] d(byte[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7d.d(byte[]):byte[]");
    }

    public static byte[] e(JSONObject jSONObject) {
        byte[] a = und.a(jSONObject.getString("first"));
        if (a.length == 32) {
            if (!jSONObject.has("second")) {
                return a;
            }
            byte[] a2 = und.a(jSONObject.getString("second"));
            if (a2.length == 32) {
                return c2f.a(a, a2);
            }
            throw new JSONException("hashed PRF value with wrong length");
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] d = d(und.a(jSONObject.getString("first")));
        if (!jSONObject.has("second")) {
            return d;
        }
        return c2f.a(d, d(und.a(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w7d)) {
            return false;
        }
        return Arrays.deepEquals(this.a, ((w7d) obj).a);
    }

    public final int hashCode() {
        byte[][] bArr;
        int i = 0;
        for (byte[] bArr2 : this.a) {
            if (bArr2 != null) {
                i ^= Arrays.hashCode(new Object[]{bArr2});
            }
        }
        return i;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i = 0; i < bArr.length; i += 2) {
                if (bArr[i] == null) {
                    jSONObject.put("eval", c(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(und.b(bArr[i]), c(bArr[i + 1]));
                }
            }
            String obj = jSONObject.toString();
            return "PrfExtension{" + obj + "}";
        } catch (JSONException e) {
            return tb4.y("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.d(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
