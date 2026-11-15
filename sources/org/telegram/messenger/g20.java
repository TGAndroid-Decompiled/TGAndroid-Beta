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
    public long f23632a;
    public boolean f23633a0;
    public long f23634b;
    public float d;
    public float f23637e;
    public int f23638f;
    public int f23639g;
    public int h;
    public int f23640i;
    public int f23641j;
    public int f23642k;
    public int f23643l;
    public int f23644m;
    public String f23646o;
    public long f23647p;
    public long f23648q;
    public long f23649r;
    public boolean f23650s;
    public boolean f23651t;
    public long v;
    public TLRPC.InputFile f23653w;
    public TLRPC.InputEncryptedFile f23654x;
    public byte[] f23655y;
    public byte[] f23656z;
    public long f23636c = -1;
    public int f23645n = 24;
    public float f23652u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList f23635b0 = new ArrayList();

    public final boolean a() {
        return this.f23650s;
    }

    public final String b() {
        int i7;
        byte[] bArr;
        String f10;
        Object obj;
        ArrayList arrayList;
        if (this.f23636c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
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
            serializedData.writeInt64(this.f23636c);
            serializedData.writeInt32(this.f23641j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.f23733a);
                serializedData.writeFloat(this.A.f23734b);
                serializedData.writeFloat(this.A.f23735c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.f23736e);
                serializedData.writeFloat(this.A.f23737f);
                serializedData.writeFloat(this.A.f23738g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.f23739i);
                serializedData.writeFloat(this.A.f23740j);
                serializedData.writeFloat(this.A.f23741k);
                serializedData.writeFloat(this.A.f23742l);
                serializedData.writeFloat(this.A.f23743m);
                serializedData.writeInt32(this.A.f23744n);
                serializedData.writeFloat(this.A.f23745o);
                serializedData.writeFloat(this.A.f23747q);
                PointF pointF = this.A.f23748r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.f23748r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.f23749s);
                serializedData.writeFloat(this.A.f23750t);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        obj = this.A.f23746p.f13418b;
                    } else if (i10 == 1) {
                        obj = this.A.f23746p.f13419c;
                    } else if (i10 == 2) {
                        obj = this.A.f23746p.d;
                    } else {
                        obj = this.A.f23746p.f13420e;
                    }
                    rd0 rd0Var = (rd0) obj;
                    serializedData.writeFloat(rd0Var.f38950a);
                    serializedData.writeFloat(rd0Var.f38951b);
                    serializedData.writeFloat(rd0Var.f38952c);
                    serializedData.writeFloat(rd0Var.d);
                    serializedData.writeFloat(rd0Var.f38953e);
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
                serializedData.writeFloat(this.H.f27488a);
                serializedData.writeFloat(this.H.f27489b);
                serializedData.writeFloat(this.H.f27491e);
                serializedData.writeFloat(this.H.f27492f);
                serializedData.writeFloat(this.H.f27490c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.f27493i);
                serializedData.writeInt32(this.H.f27494j);
                serializedData.writeInt32(this.H.f27495k);
                serializedData.writeBool(this.H.f27496l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.f23633a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.f23652u);
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
        long j3 = this.f23632a;
        long j10 = this.f23634b;
        int i13 = this.f23639g;
        int i14 = this.h;
        int i15 = this.f23640i;
        int i16 = this.f23644m;
        int i17 = this.f23642k;
        int i18 = this.f23643l;
        long j11 = this.v;
        int i19 = this.f23645n;
        long j12 = this.f23647p;
        String str3 = f10;
        String str4 = this.f23646o;
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
        ArrayList arrayList = this.f23635b0;
        if (z10) {
            if (this.f23633a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((xeVar = this.H) == null || xeVar.b()) && this.f23632a <= 0)) {
                long j3 = this.f23634b;
                if ((j3 == -1 || j3 == this.f23649r) && this.f23640i == this.f23643l && this.h == this.f23642k) {
                    return false;
                }
            }
            return true;
        }
        if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.f23650s && this.f23632a <= 0) {
            long j10 = this.f23634b;
            if (j10 == -1 || j10 == this.f23649r) {
                return false;
            }
        }
        return true;
    }
}
