package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rd0;
public final class g20 {
    public gf A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public ArrayList G;
    public xe H;
    public boolean I;
    public boolean J;
    public hi.c7 K;
    public hi.t L;
    public ArrayList M;
    public boolean N;
    public Bitmap O;
    public boolean P;
    public Integer Q;
    public Integer R;
    public int S;
    public boolean T;
    public boolean V;
    public boolean W;
    public boolean X;
    public long f23634a;
    public boolean f23635a0;
    public long f23636b;
    public float d;
    public float f23639e;
    public int f23640f;
    public int f23641g;
    public int h;
    public int f23642i;
    public int f23643j;
    public int f23644k;
    public int f23645l;
    public int f23646m;
    public String f23648o;
    public long f23649p;
    public long f23650q;
    public long f23651r;
    public boolean f23652s;
    public boolean f23653t;
    public long v;
    public TLRPC.InputFile f23655w;
    public TLRPC.InputEncryptedFile f23656x;
    public byte[] f23657y;
    public byte[] f23658z;
    public long f23638c = -1;
    public int f23647n = 24;
    public float f23654u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList f23637b0 = new ArrayList();

    public final boolean a() {
        return this.f23652s;
    }

    public final String b() {
        int i7;
        byte[] bArr;
        String f10;
        Object obj;
        ArrayList arrayList;
        if (this.f23638c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
            f10 = "";
        } else {
            if (this.A != null) {
                i7 = 170;
            } else {
                i7 = 10;
            }
            String str = this.B;
            byte[] bArr2 = null;
            if (str != null) {
                bArr = str.getBytes();
                i7 += bArr.length;
            } else {
                bArr = null;
            }
            String str2 = this.C;
            if (str2 != null) {
                bArr2 = str2.getBytes();
                i7 += bArr2.length;
            }
            SerializedData serializedData = new SerializedData(i7);
            serializedData.writeInt32(11);
            serializedData.writeInt64(this.f23638c);
            serializedData.writeInt32(this.f23643j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.f23735a);
                serializedData.writeFloat(this.A.f23736b);
                serializedData.writeFloat(this.A.f23737c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.f23738e);
                serializedData.writeFloat(this.A.f23739f);
                serializedData.writeFloat(this.A.f23740g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.f23741i);
                serializedData.writeFloat(this.A.f23742j);
                serializedData.writeFloat(this.A.f23743k);
                serializedData.writeFloat(this.A.f23744l);
                serializedData.writeFloat(this.A.f23745m);
                serializedData.writeInt32(this.A.f23746n);
                serializedData.writeFloat(this.A.f23747o);
                serializedData.writeFloat(this.A.f23749q);
                PointF pointF = this.A.f23750r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.f23750r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.f23751s);
                serializedData.writeFloat(this.A.f23752t);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        obj = this.A.f23748p.f13418b;
                    } else if (i10 == 1) {
                        obj = this.A.f23748p.f13419c;
                    } else if (i10 == 2) {
                        obj = this.A.f23748p.d;
                    } else {
                        obj = this.A.f23748p.f13420e;
                    }
                    rd0 rd0Var = (rd0) obj;
                    serializedData.writeFloat(rd0Var.f38947a);
                    serializedData.writeFloat(rd0Var.f38948b);
                    serializedData.writeFloat(rd0Var.f38949c);
                    serializedData.writeFloat(rd0Var.d);
                    serializedData.writeFloat(rd0Var.f38950e);
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
                for (int i11 = 0; i11 < size; i11++) {
                    ((e20) this.G.get(i11)).b(serializedData, false);
                }
                serializedData.writeByte(this.I ? 1 : 0);
            } else {
                serializedData.writeByte(0);
            }
            if (this.H != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.H.f27489a);
                serializedData.writeFloat(this.H.f27490b);
                serializedData.writeFloat(this.H.f27492e);
                serializedData.writeFloat(this.H.f27493f);
                serializedData.writeFloat(this.H.f27491c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.f27494i);
                serializedData.writeInt32(this.H.f27495j);
                serializedData.writeInt32(this.H.f27496k);
                serializedData.writeBool(this.H.f27497l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.f23635a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.f23654u);
            serializedData.writeBool(this.N);
            hi.t tVar = this.L;
            if (tVar != null && this.M != null && tVar.f15124e.size() > 1 && !this.M.isEmpty()) {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.f15121a);
                for (int i12 = 0; i12 < this.M.size(); i12++) {
                    ((f20) this.M.get(i12)).serializeToStream(serializedData);
                }
            } else {
                serializedData.writeInt32(1450380236);
            }
            f10 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j3 = this.f23634a;
        long j10 = this.f23636b;
        int i13 = this.f23641g;
        int i14 = this.h;
        int i15 = this.f23642i;
        int i16 = this.f23646m;
        int i17 = this.f23644k;
        int i18 = this.f23645l;
        long j11 = this.v;
        int i19 = this.f23647n;
        long j12 = this.f23649p;
        String str3 = f10;
        String str4 = this.f23648o;
        StringBuilder t6 = a8.p0.t(j3, "-1_", "_");
        t6.append(j10);
        t6.append("_");
        t6.append(i13);
        t6.append("_");
        t6.append(i14);
        t6.append("_");
        t6.append(i15);
        t6.append("_");
        t6.append(i16);
        t6.append("_");
        t6.append(i17);
        t6.append("_");
        t6.append(i18);
        t6.append("_");
        t6.append(j11);
        t6.append("_");
        t6.append(i19);
        t6.append("_");
        t6.append(j12);
        t6.append("_-");
        return org.telegram.ui.Cells.y0.m(str3, "_", str4, t6);
    }

    public final boolean c() {
        xe xeVar;
        boolean z10 = this.J;
        ArrayList arrayList = this.f23637b0;
        if (z10) {
            if (this.f23635a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((xeVar = this.H) == null || xeVar.b()) && this.f23634a <= 0)) {
                long j3 = this.f23636b;
                if ((j3 == -1 || j3 == this.f23651r) && this.f23642i == this.f23645l && this.h == this.f23644k) {
                    return false;
                }
            }
            return true;
        }
        if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.f23652s && this.f23634a <= 0) {
            long j10 = this.f23636b;
            if (j10 == -1 || j10 == this.f23651r) {
                return false;
            }
        }
        return true;
    }
}
