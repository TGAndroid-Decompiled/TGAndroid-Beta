package n6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import h7.r8;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y6.b1;
import y6.c1;
import y6.e1;

public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new o0(27);

    public final y6.s0 f18369a;

    public final y6.s0 f18370b;

    public final y6.s0 f18371c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        y5.l.h(bArr);
        y6.s0 s0VarT = y6.s0.t(bArr.length, bArr);
        y5.l.h(bArr2);
        y6.s0 s0VarT2 = y6.s0.t(bArr2.length, bArr2);
        y5.l.h(bArr3);
        y6.s0 s0VarT3 = y6.s0.t(bArr3.length, bArr3);
        this.f18369a = s0VarT;
        this.f18370b = s0VarT2;
        this.f18371c = s0VarT3;
        y5.l.h(strArr);
        this.d = strArr;
    }

    public final JSONObject b() {
        c1 c1Var;
        long j10;
        c1 c1Var2;
        y6.s0 s0Var;
        String[] strArr = this.d;
        try {
            JSONObject jSONObject = new JSONObject();
            y6.s0 s0Var2 = this.f18370b;
            if (s0Var2 != null) {
                jSONObject.put("clientDataJSON", f6.b.c(s0Var2.u()));
            }
            y6.s0 s0Var3 = this.f18371c;
            if (s0Var3 != null) {
                jSONObject.put("attestationObject", f6.b.c(s0Var3.u()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (strArr[i10].equals("cable")) {
                    jSONArray.put(i10, "hybrid");
                } else {
                    jSONArray.put(i10, strArr[i10]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    c1 c1Var3 = (c1) ((y6.z0) c1.d(s0Var3.u()).b(y6.z0.class)).f49797b.get(new y6.a1("authData"));
                    if (c1Var3 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    y6.s0 s0Var4 = ((y6.w0) c1Var3.b(y6.w0.class)).f49786a;
                    byte[] bArr = s0Var4.f49776b;
                    ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr, 0, s0Var4.p()).asReadOnlyBuffer();
                    try {
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 32);
                        if ((byteBufferAsReadOnlyBuffer.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 4);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 16);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + byteBufferAsReadOnlyBuffer.getShort());
                        try {
                            try {
                                int iPosition = byteBufferAsReadOnlyBuffer.position();
                                int iS = y6.s0.s(iPosition, bArr.length, s0Var4.p());
                                e1 e1Var = new e1((iS == 0 ? y6.s0.f49774c : new y6.r0(bArr, iPosition, iS)).r());
                                try {
                                    c1 c1VarK = y6.a.k(e1Var);
                                    try {
                                        e1Var.close();
                                    } catch (IOException unused) {
                                    }
                                    y6.r rVar = ((y6.z0) c1VarK.b(y6.z0.class)).f49797b;
                                    c1 c1Var4 = (c1) rVar.get(new y6.y0(3L));
                                    c1 c1Var5 = (c1) rVar.get(new y6.y0(1L));
                                    if (c1Var4 == null || c1Var5 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j11 = ((y6.y0) c1Var4.b(y6.y0.class)).f49794a;
                                        long j12 = ((y6.y0) c1Var5.b(y6.y0.class)).f49794a;
                                        byte[] bArrJ = null;
                                        if (j12 == 1) {
                                            c1Var = (c1) rVar.get(new y6.y0(-1L));
                                            if (c1Var != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j13 = ((y6.y0) c1Var.b(y6.y0.class)).f49794a;
                                            j10 = j11;
                                            if (j12 != 2 && j13 == 1) {
                                                c1 c1Var6 = (c1) rVar.get(new y6.y0(-2L));
                                                c1 c1Var7 = (c1) rVar.get(new y6.y0(-3L));
                                                if (c1Var6 == null || c1Var7 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                y6.s0 s0Var5 = ((y6.w0) c1Var6.b(y6.w0.class)).f49786a;
                                                y6.s0 s0Var6 = ((y6.w0) c1Var7.b(y6.w0.class)).f49786a;
                                                if (s0Var5.f49776b.length != 32 || s0Var6.f49776b.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = y6.a.j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), s0Var5.u(), s0Var6.u());
                                            } else if (j12 == 1 && j13 == 6) {
                                                c1Var2 = (c1) rVar.get(new y6.y0(-2L));
                                                if (c1Var2 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                s0Var = ((y6.w0) c1Var2.b(y6.w0.class)).f49786a;
                                                if (s0Var.f49776b.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = y6.a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), s0Var.u());
                                            }
                                        } else if (j12 == 2) {
                                            j12 = 2;
                                            c1Var = (c1) rVar.get(new y6.y0(-1L));
                                            if (c1Var != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j14 = ((y6.y0) c1Var.b(y6.y0.class)).f49794a;
                                            j10 = j11;
                                            if (j12 != 2) {
                                                if (j12 == 1) {
                                                    c1Var2 = (c1) rVar.get(new y6.y0(-2L));
                                                    if (c1Var2 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    s0Var = ((y6.w0) c1Var2.b(y6.w0.class)).f49786a;
                                                    if (s0Var.f49776b.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArrJ = y6.a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), s0Var.u());
                                                }
                                            } else if (j12 == 1) {
                                                c1Var2 = (c1) rVar.get(new y6.y0(-2L));
                                                if (c1Var2 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                s0Var = ((y6.w0) c1Var2.b(y6.w0.class)).f49786a;
                                                if (s0Var.f49776b.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = y6.a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), s0Var.u());
                                            }
                                        } else {
                                            j10 = j11;
                                        }
                                        jSONObject.put("authenticatorData", f6.b.c(s0Var4.u()));
                                        jSONObject.put("publicKeyAlgorithm", j10);
                                        if (bArrJ != null) {
                                            jSONObject.put("publicKey", Base64.encodeToString(bArrJ, 11));
                                        }
                                        return jSONObject;
                                    } catch (b1 e9) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e9);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        e1Var.close();
                                    } catch (IOException unused2) {
                                    }
                                    throw th;
                                }
                            } catch (b1 e10) {
                                e = e10;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (y6.x0 e11) {
                            e = e11;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e12) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e12);
                    }
                } catch (b1 e13) {
                    throw new IllegalArgumentException("authData value has wrong type", e13);
                }
            } catch (b1 e14) {
                e = e14;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (y6.x0 e15) {
                e = e15;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e16) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e16);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return y5.l.l(this.f18369a, jVar.f18369a) && y5.l.l(this.f18370b, jVar.f18370b) && y5.l.l(this.f18371c, jVar.f18371c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f18369a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f18370b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f18371c}))});
    }

    public final String toString() {
        u2.b bVar = new u2.b(getClass().getSimpleName(), 12);
        y6.k0 k0Var = y6.m0.d;
        byte[] bArrU = this.f18369a.u();
        bVar.j(k0Var.c(bArrU.length, bArrU), "keyHandle");
        byte[] bArrU2 = this.f18370b.u();
        bVar.j(k0Var.c(bArrU2.length, bArrU2), "clientDataJSON");
        byte[] bArrU3 = this.f18371c.u();
        bVar.j(k0Var.c(bArrU3.length, bArrU3), "attestationObject");
        bVar.j(Arrays.toString(this.d), "transports");
        return bVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.c(parcel, 2, this.f18369a.u());
        r8.c(parcel, 3, this.f18370b.u());
        r8.c(parcel, 4, this.f18371c.u());
        r8.m(parcel, 5, this.d);
        r8.r(parcel, iQ);
    }
}
