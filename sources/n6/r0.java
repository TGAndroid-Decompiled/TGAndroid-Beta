package n6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import h7.r8;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class r0 extends z5.a {
    public static final Parcelable.Creator<r0> CREATOR = new o0(4);

    public static final byte[] f18405b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    public final byte[][] f18406a;

    public r0(byte[][] bArr) {
        y5.l.b(bArr != null);
        y5.l.b(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            y5.l.b(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            y5.l.b(bArr[i11] != null);
            int length = bArr[i11].length;
            y5.l.b(length == 32 || length == 64);
            i10 += 2;
        }
        this.f18406a = bArr;
    }

    public static r0 b(JSONObject jSONObject, boolean z10) throws JSONException {
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
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(f6.b.b(next));
                    if (z10) {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(f(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new r0((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject c(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] d(byte[] bArr) {
        m.a aVar;
        y6.e0 e0Var;
        int i10 = y6.h0.f49731a;
        y6.i0 i0Var = y6.g0.f49729a;
        int i11 = i0Var.f49737f;
        MessageDigest messageDigest = i0Var.f49736e;
        if (i0Var.h) {
            try {
                aVar = new m.a((MessageDigest) messageDigest.clone(), i11);
            } catch (CloneNotSupportedException unused) {
                try {
                    aVar = new m.a(MessageDigest.getInstance(messageDigest.getAlgorithm()), i11);
                } catch (NoSuchAlgorithmException e9) {
                    throw new AssertionError(e9);
                }
            }
        } else {
            aVar = new m.a(MessageDigest.getInstance(messageDigest.getAlgorithm()), i11);
        }
        MessageDigest messageDigest2 = (MessageDigest) aVar.f17259c;
        byte[] bArr2 = f18405b;
        bArr2.getClass();
        int length = bArr2.length;
        if (aVar.f17257a) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (aVar.f17257a) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr, 0, length2);
        if (aVar.f17257a) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        aVar.f17257a = true;
        int i12 = aVar.f17258b;
        if (i12 == messageDigest2.getDigestLength()) {
            byte[] bArrDigest = messageDigest2.digest();
            char[] cArr = y6.f0.f49725a;
            e0Var = new y6.e0(bArrDigest);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(messageDigest2.digest(), i12);
            char[] cArr2 = y6.f0.f49725a;
            e0Var = new y6.e0(bArrCopyOf);
        }
        return (byte[]) e0Var.f49720b.clone();
    }

    public static byte[] e(JSONObject jSONObject) throws JSONException {
        byte[] bArrB = f6.b.b(jSONObject.getString("first"));
        if (bArrB.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrB;
        }
        byte[] bArrB2 = f6.b.b(jSONObject.getString("second"));
        if (bArrB2.length == 32) {
            return y6.a.j(bArrB, bArrB2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] bArrD = d(f6.b.b(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrD : y6.a.j(bArrD, d(f6.b.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            return Arrays.deepEquals(this.f18406a, ((r0) obj).f18406a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f18406a) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() {
        byte[][] bArr = this.f18406a;
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
                    jSONObject2.put(f6.b.c(bArr[i10]), c(bArr[i10 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e9) {
            return a9.p.m("PrfExtension{Exception:", e9.getMessage(), "}");
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.d(parcel, 1, this.f18406a);
        r8.r(parcel, iQ);
    }
}
