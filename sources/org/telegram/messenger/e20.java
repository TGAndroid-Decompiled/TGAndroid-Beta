package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.be0;
public final class e20 {
    public ff A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public ArrayList G;
    public we H;
    public boolean I;
    public boolean J;
    public hi.c7 K;
    public hi.u L;
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
    public long f23637a;
    public boolean f23638a0;
    public long f23639b;
    public float d;
    public float f23642e;
    public int f23643f;
    public int f23644g;
    public int h;
    public int f23645i;
    public int f23646j;
    public int f23647k;
    public int f23648l;
    public int f23649m;
    public String f23651o;
    public long f23652p;
    public long f23653q;
    public long f23654r;
    public boolean f23655s;
    public boolean f23656t;
    public long v;
    public TLRPC.InputFile f23658w;
    public TLRPC.InputEncryptedFile f23659x;
    public byte[] f23660y;
    public byte[] f23661z;
    public long f23641c = -1;
    public int f23650n = 24;
    public float f23657u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList f23640b0 = new ArrayList();

    public final boolean a() {
        return this.f23655s;
    }

    public final String b() {
        int i7;
        byte[] bArr;
        String f10;
        Object obj;
        ArrayList arrayList;
        if (this.f23641c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
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
            serializedData.writeInt64(this.f23641c);
            serializedData.writeInt32(this.f23646j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.f23889a);
                serializedData.writeFloat(this.A.f23890b);
                serializedData.writeFloat(this.A.f23891c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.f23892e);
                serializedData.writeFloat(this.A.f23893f);
                serializedData.writeFloat(this.A.f23894g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.f23895i);
                serializedData.writeFloat(this.A.f23896j);
                serializedData.writeFloat(this.A.f23897k);
                serializedData.writeFloat(this.A.f23898l);
                serializedData.writeFloat(this.A.f23899m);
                serializedData.writeInt32(this.A.f23900n);
                serializedData.writeFloat(this.A.f23901o);
                serializedData.writeFloat(this.A.f23903q);
                PointF pointF = this.A.f23904r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.f23904r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.f23905s);
                serializedData.writeFloat(this.A.f23906t);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        obj = this.A.f23902p.f13733b;
                    } else if (i10 == 1) {
                        obj = this.A.f23902p.f13734c;
                    } else if (i10 == 2) {
                        obj = this.A.f23902p.d;
                    } else {
                        obj = this.A.f23902p.f13735e;
                    }
                    be0 be0Var = (be0) obj;
                    serializedData.writeFloat(be0Var.f33671a);
                    serializedData.writeFloat(be0Var.f33672b);
                    serializedData.writeFloat(be0Var.f33673c);
                    serializedData.writeFloat(be0Var.d);
                    serializedData.writeFloat(be0Var.f33674e);
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
                    ((c20) this.G.get(i11)).b(serializedData, false);
                }
                serializedData.writeByte(this.I ? 1 : 0);
            } else {
                serializedData.writeByte(0);
            }
            if (this.H != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.H.f27676a);
                serializedData.writeFloat(this.H.f27677b);
                serializedData.writeFloat(this.H.f27679e);
                serializedData.writeFloat(this.H.f27680f);
                serializedData.writeFloat(this.H.f27678c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.f27681i);
                serializedData.writeInt32(this.H.f27682j);
                serializedData.writeInt32(this.H.f27683k);
                serializedData.writeBool(this.H.f27684l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.f23638a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.f23657u);
            serializedData.writeBool(this.N);
            hi.u uVar = this.L;
            if (uVar != null && this.M != null && uVar.f15512e.size() > 1 && !this.M.isEmpty()) {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.f15509a);
                for (int i12 = 0; i12 < this.M.size(); i12++) {
                    ((d20) this.M.get(i12)).serializeToStream(serializedData);
                }
            } else {
                serializedData.writeInt32(1450380236);
            }
            f10 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j3 = this.f23637a;
        long j10 = this.f23639b;
        int i13 = this.f23644g;
        int i14 = this.h;
        int i15 = this.f23645i;
        int i16 = this.f23649m;
        int i17 = this.f23647k;
        int i18 = this.f23648l;
        long j11 = this.v;
        int i19 = this.f23650n;
        long j12 = this.f23652p;
        String str3 = f10;
        String str4 = this.f23651o;
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
        return p5.c.m(str3, "_", str4, t6);
    }

    public final boolean c() {
        we weVar;
        boolean z10 = this.J;
        ArrayList arrayList = this.f23640b0;
        if (z10) {
            if (this.f23638a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((weVar = this.H) == null || weVar.b()) && this.f23637a <= 0)) {
                long j3 = this.f23639b;
                if ((j3 == -1 || j3 == this.f23654r) && this.f23645i == this.f23648l && this.h == this.f23647k) {
                    return false;
                }
            }
            return true;
        }
        if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.f23655s && this.f23637a <= 0) {
            long j10 = this.f23639b;
            if (j10 == -1 || j10 == this.f23654r) {
                return false;
            }
        }
        return true;
    }
}
