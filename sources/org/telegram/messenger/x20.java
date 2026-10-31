package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.me0;
public final class x20 {
    public ff A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public ArrayList G;
    public ye H;
    public boolean I;
    public boolean J;
    public vh.m5 K;
    public vh.r L;
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
    public long f19183a;
    public boolean f19184a0;
    public long f19185b;
    public float d;
    public float e;
    public int f19188f;
    public int f19189g;
    public int h;
    public int f19190i;
    public int f19191j;
    public int f19192k;
    public int f19193l;
    public int f19194m;
    public String f19196o;
    public long f19197p;
    public long f19198q;
    public long f19199r;
    public boolean f19200s;
    public boolean f19201t;
    public long v;
    public TLRPC.InputFile f19203w;
    public TLRPC.InputEncryptedFile f19204x;
    public byte[] f19205y;
    public byte[] f19206z;
    public long f19187c = -1;
    public int f19195n = 24;
    public float f19202u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList f19186b0 = new ArrayList();

    public final boolean a() {
        return this.f19200s;
    }

    public final String b() {
        int i10;
        byte[] bArr;
        String f7;
        Object obj;
        ArrayList arrayList;
        if (this.f19187c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
            f7 = "";
        } else {
            if (this.A != null) {
                i10 = 170;
            } else {
                i10 = 10;
            }
            String str = this.B;
            byte[] bArr2 = null;
            if (str != null) {
                bArr = str.getBytes();
                i10 += bArr.length;
            } else {
                bArr = null;
            }
            String str2 = this.C;
            if (str2 != null) {
                bArr2 = str2.getBytes();
                i10 += bArr2.length;
            }
            SerializedData serializedData = new SerializedData(i10);
            serializedData.writeInt32(11);
            serializedData.writeInt64(this.f19187c);
            serializedData.writeInt32(this.f19191j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.f15545a);
                serializedData.writeFloat(this.A.f15546b);
                serializedData.writeFloat(this.A.f15547c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.e);
                serializedData.writeFloat(this.A.f15548f);
                serializedData.writeFloat(this.A.f15549g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.f15550i);
                serializedData.writeFloat(this.A.f15551j);
                serializedData.writeFloat(this.A.f15552k);
                serializedData.writeFloat(this.A.f15553l);
                serializedData.writeFloat(this.A.f15554m);
                serializedData.writeInt32(this.A.f15555n);
                serializedData.writeFloat(this.A.f15556o);
                serializedData.writeFloat(this.A.f15558q);
                PointF pointF = this.A.f15559r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.f15559r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.f15560s);
                serializedData.writeFloat(this.A.f15561t);
                for (int i11 = 0; i11 < 4; i11++) {
                    if (i11 == 0) {
                        obj = this.A.f15557p.f6117b;
                    } else if (i11 == 1) {
                        obj = this.A.f15557p.f6118c;
                    } else if (i11 == 2) {
                        obj = this.A.f15557p.d;
                    } else {
                        obj = this.A.f15557p.e;
                    }
                    me0 me0Var = (me0) obj;
                    serializedData.writeFloat(me0Var.f28426a);
                    serializedData.writeFloat(me0Var.f28427b);
                    serializedData.writeFloat(me0Var.f28428c);
                    serializedData.writeFloat(me0Var.d);
                    serializedData.writeFloat(me0Var.e);
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
                for (int i12 = 0; i12 < size; i12++) {
                    ((v20) this.G.get(i12)).b(serializedData, false);
                }
                serializedData.writeByte(this.I ? 1 : 0);
            } else {
                serializedData.writeByte(0);
            }
            if (this.H != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.H.f19364a);
                serializedData.writeFloat(this.H.f19365b);
                serializedData.writeFloat(this.H.e);
                serializedData.writeFloat(this.H.f19367f);
                serializedData.writeFloat(this.H.f19366c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.f19368i);
                serializedData.writeInt32(this.H.f19369j);
                serializedData.writeInt32(this.H.f19370k);
                serializedData.writeBool(this.H.f19371l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.f19184a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.f19202u);
            serializedData.writeBool(this.N);
            vh.r rVar = this.L;
            if (rVar != null && this.M != null && rVar.e.size() > 1 && !this.M.isEmpty()) {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.f51796a);
                for (int i13 = 0; i13 < this.M.size(); i13++) {
                    ((w20) this.M.get(i13)).serializeToStream(serializedData);
                }
            } else {
                serializedData.writeInt32(1450380236);
            }
            f7 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j10 = this.f19183a;
        long j11 = this.f19185b;
        int i14 = this.f19189g;
        int i15 = this.h;
        int i16 = this.f19190i;
        int i17 = this.f19194m;
        int i18 = this.f19192k;
        int i19 = this.f19193l;
        long j12 = this.v;
        int i20 = this.f19195n;
        long j13 = this.f19197p;
        String str3 = f7;
        String str4 = this.f19196o;
        StringBuilder s10 = a1.g.s(j10, "-1_", "_");
        s10.append(j11);
        s10.append("_");
        s10.append(i14);
        s10.append("_");
        s10.append(i15);
        s10.append("_");
        s10.append(i16);
        s10.append("_");
        s10.append(i17);
        s10.append("_");
        s10.append(i18);
        s10.append("_");
        s10.append(i19);
        s10.append("_");
        s10.append(j12);
        s10.append("_");
        s10.append(i20);
        s10.append("_");
        s10.append(j13);
        s10.append("_-");
        return a1.g.o(str3, "_", str4, s10);
    }

    public final boolean c() {
        ye yeVar;
        boolean z10 = this.J;
        ArrayList arrayList = this.f19186b0;
        if (z10) {
            if (this.f19184a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((yeVar = this.H) == null || yeVar.b()) && this.f19183a <= 0)) {
                long j10 = this.f19185b;
                if ((j10 == -1 || j10 == this.f19199r) && this.f19190i == this.f19193l && this.h == this.f19192k) {
                    return false;
                }
            }
            return true;
        }
        if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.f19200s && this.f19183a <= 0) {
            long j11 = this.f19185b;
            if (j11 == -1 || j11 == this.f19199r) {
                return false;
            }
        }
        return true;
    }
}
