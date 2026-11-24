package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class rcc {
    public lo6 A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public ArrayList G;
    public ao6 H;
    public boolean I;
    public boolean J;
    public f6b K;
    public sl2 L;
    public ArrayList M;
    public boolean N;
    public boolean O;
    public Integer P;
    public Integer Q;
    public int R;
    public boolean S;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean Z;
    public long a;
    public long b;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public String o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public boolean t;
    public long v;
    public TLRPC.InputFile w;
    public TLRPC.InputEncryptedFile x;
    public byte[] y;
    public byte[] z;
    public long c = -1;
    public int n = 24;
    public float u = 1.0f;
    public long T = Long.MIN_VALUE;
    public boolean X = false;
    public boolean Y = true;
    public final ArrayList a0 = new ArrayList();

    public final String a() {
        int i;
        byte[] bArr;
        String f;
        Object obj;
        ArrayList arrayList;
        if (this.c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
            f = "";
        } else {
            if (this.A != null) {
                i = 170;
            } else {
                i = 10;
            }
            String str = this.B;
            byte[] bArr2 = null;
            if (str != null) {
                bArr = str.getBytes();
                i += bArr.length;
            } else {
                bArr = null;
            }
            String str2 = this.C;
            if (str2 != null) {
                bArr2 = str2.getBytes();
                i += bArr2.length;
            }
            SerializedData serializedData = new SerializedData(i);
            serializedData.writeInt32(11);
            serializedData.writeInt64(this.c);
            serializedData.writeInt32(this.j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.a);
                serializedData.writeFloat(this.A.b);
                serializedData.writeFloat(this.A.c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.e);
                serializedData.writeFloat(this.A.f);
                serializedData.writeFloat(this.A.g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.i);
                serializedData.writeFloat(this.A.j);
                serializedData.writeFloat(this.A.k);
                serializedData.writeFloat(this.A.l);
                serializedData.writeFloat(this.A.m);
                serializedData.writeInt32(this.A.n);
                serializedData.writeFloat(this.A.o);
                serializedData.writeFloat(this.A.q);
                PointF pointF = this.A.r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.s);
                serializedData.writeFloat(this.A.t);
                for (int i2 = 0; i2 < 4; i2++) {
                    if (i2 == 0) {
                        obj = this.A.p.b;
                    } else {
                        lo6 lo6Var = this.A;
                        if (i2 == 1) {
                            obj = lo6Var.p.c;
                        } else if (i2 == 2) {
                            obj = lo6Var.p.d;
                        } else {
                            obj = lo6Var.p.e;
                        }
                    }
                    l78 l78Var = (l78) obj;
                    serializedData.writeFloat(l78Var.a);
                    serializedData.writeFloat(l78Var.b);
                    serializedData.writeFloat(l78Var.c);
                    serializedData.writeFloat(l78Var.d);
                    serializedData.writeFloat(l78Var.e);
                }
            } else {
                serializedData.writeByte(0);
            }
            if (bArr != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr);
            } else {
                serializedData.writeByte(0);
            }
            ArrayList arrayList2 = this.G;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                serializedData.writeByte(1);
                serializedData.writeInt32(this.G.size());
                int size = this.G.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((pcc) this.G.get(i3)).b(serializedData, false);
                }
                serializedData.writeByte(this.I ? 1 : 0);
            } else {
                serializedData.writeByte(0);
            }
            if (this.H != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.H.a);
                serializedData.writeFloat(this.H.b);
                serializedData.writeFloat(this.H.e);
                serializedData.writeFloat(this.H.f);
                serializedData.writeFloat(this.H.c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.i);
                serializedData.writeInt32(this.H.j);
                serializedData.writeInt32(this.H.k);
                serializedData.writeBool(this.H.l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.Z);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.u);
            serializedData.writeBool(this.N);
            sl2 sl2Var = this.L;
            if (sl2Var != null && this.M != null && sl2Var.e.size() > 1 && !this.M.isEmpty()) {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.a);
                for (int i4 = 0; i4 < this.M.size(); i4++) {
                    ((qcc) this.M.get(i4)).serializeToStream(serializedData);
                }
            } else {
                serializedData.writeInt32(1450380236);
            }
            f = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j = this.a;
        long j2 = this.b;
        int i5 = this.g;
        int i6 = this.h;
        int i7 = this.i;
        int i8 = this.m;
        int i9 = this.k;
        int i10 = this.l;
        long j3 = this.v;
        int i11 = this.n;
        long j4 = this.p;
        String str3 = this.o;
        StringBuilder o = wi8.o(j, "-1_", "_");
        o.append(j2);
        o.append("_");
        o.append(i5);
        o.append("_");
        o.append(i6);
        o.append("_");
        o.append(i7);
        o.append("_");
        o.append(i8);
        o.append("_");
        o.append(i9);
        o.append("_");
        o.append(i10);
        o.append("_");
        o.append(j3);
        o.append("_");
        o.append(i11);
        o.append("_");
        o.append(j4);
        o.append("_-");
        return kt6.p(f, "_", str3, o);
    }

    public final boolean b() {
        boolean z = this.J;
        ArrayList arrayList = this.a0;
        if (z) {
            if (this.Z && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null) {
                ao6 ao6Var = this.H;
                if ((ao6Var == null || ao6Var.b()) && this.a <= 0) {
                    long j = this.b;
                    if ((j == -1 || j == this.r) && this.i == this.l && this.h == this.k) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        } else if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.s && this.a <= 0) {
            long j2 = this.b;
            if (j2 == -1 || j2 == this.r) {
                return false;
            }
            return true;
        } else {
            return true;
        }
    }
}
