package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ce0;
public final class f20 {
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
    public hi.b7 K;
    public hi.v L;
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
    public long f23826a;
    public boolean f23827a0;
    public long f23828b;
    public float d;
    public float f23831e;
    public int f23832f;
    public int f23833g;
    public int h;
    public int f23834i;
    public int f23835j;
    public int f23836k;
    public int f23837l;
    public int f23838m;
    public String f23840o;
    public long f23841p;
    public long f23842q;
    public long f23843r;
    public boolean f23844s;
    public boolean f23845t;
    public long v;
    public TLRPC.InputFile f23847w;
    public TLRPC.InputEncryptedFile f23848x;
    public byte[] f23849y;
    public byte[] f23850z;
    public long f23830c = -1;
    public int f23839n = 24;
    public float f23846u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList f23829b0 = new ArrayList();

    public final boolean a() {
        return this.f23844s;
    }

    public final String b() {
        int i7;
        byte[] bArr;
        String f10;
        Object obj;
        ArrayList arrayList;
        if (this.f23830c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
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
            serializedData.writeInt64(this.f23830c);
            serializedData.writeInt32(this.f23835j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.f24134a);
                serializedData.writeFloat(this.A.f24135b);
                serializedData.writeFloat(this.A.f24136c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.f24137e);
                serializedData.writeFloat(this.A.f24138f);
                serializedData.writeFloat(this.A.f24139g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.f24140i);
                serializedData.writeFloat(this.A.f24141j);
                serializedData.writeFloat(this.A.f24142k);
                serializedData.writeFloat(this.A.f24143l);
                serializedData.writeFloat(this.A.f24144m);
                serializedData.writeInt32(this.A.f24145n);
                serializedData.writeFloat(this.A.f24146o);
                serializedData.writeFloat(this.A.f24148q);
                PointF pointF = this.A.f24149r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.f24149r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.f24150s);
                serializedData.writeFloat(this.A.f24151t);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        obj = this.A.f24147p.f13762b;
                    } else if (i10 == 1) {
                        obj = this.A.f24147p.f13763c;
                    } else if (i10 == 2) {
                        obj = this.A.f24147p.d;
                    } else {
                        obj = this.A.f24147p.f13764e;
                    }
                    ce0 ce0Var = (ce0) obj;
                    serializedData.writeFloat(ce0Var.f34190a);
                    serializedData.writeFloat(ce0Var.f34191b);
                    serializedData.writeFloat(ce0Var.f34192c);
                    serializedData.writeFloat(ce0Var.d);
                    serializedData.writeFloat(ce0Var.f34193e);
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
                    ((d20) this.G.get(i11)).b(serializedData, false);
                }
                serializedData.writeByte(this.I ? 1 : 0);
            } else {
                serializedData.writeByte(0);
            }
            if (this.H != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.H.f27874a);
                serializedData.writeFloat(this.H.f27875b);
                serializedData.writeFloat(this.H.f27877e);
                serializedData.writeFloat(this.H.f27878f);
                serializedData.writeFloat(this.H.f27876c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.f27879i);
                serializedData.writeInt32(this.H.f27880j);
                serializedData.writeInt32(this.H.f27881k);
                serializedData.writeBool(this.H.f27882l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.f23827a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.f23846u);
            serializedData.writeBool(this.N);
            hi.v vVar = this.L;
            if (vVar != null && this.M != null && vVar.f15591e.size() > 1 && !this.M.isEmpty()) {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.f15588a);
                for (int i12 = 0; i12 < this.M.size(); i12++) {
                    ((e20) this.M.get(i12)).serializeToStream(serializedData);
                }
            } else {
                serializedData.writeInt32(1450380236);
            }
            f10 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j3 = this.f23826a;
        long j10 = this.f23828b;
        int i13 = this.f23833g;
        int i14 = this.h;
        int i15 = this.f23834i;
        int i16 = this.f23838m;
        int i17 = this.f23836k;
        int i18 = this.f23837l;
        long j11 = this.v;
        int i19 = this.f23839n;
        long j12 = this.f23841p;
        String str3 = f10;
        String str4 = this.f23840o;
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
        xe xeVar;
        boolean z10 = this.J;
        ArrayList arrayList = this.f23829b0;
        if (z10) {
            if (this.f23827a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((xeVar = this.H) == null || xeVar.b()) && this.f23826a <= 0)) {
                long j3 = this.f23828b;
                if ((j3 == -1 || j3 == this.f23843r) && this.f23834i == this.f23837l && this.h == this.f23836k) {
                    return false;
                }
            }
            return true;
        }
        if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.f23844s && this.f23826a <= 0) {
            long j10 = this.f23828b;
            if (j10 == -1 || j10 == this.f23843r) {
                return false;
            }
        }
        return true;
    }
}
