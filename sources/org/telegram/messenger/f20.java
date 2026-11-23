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
    public long f23790a;
    public boolean f23791a0;
    public long f23792b;
    public float d;
    public float f23795e;
    public int f23796f;
    public int f23797g;
    public int h;
    public int f23798i;
    public int f23799j;
    public int f23800k;
    public int f23801l;
    public int f23802m;
    public String f23804o;
    public long f23805p;
    public long f23806q;
    public long f23807r;
    public boolean f23808s;
    public boolean f23809t;
    public long v;
    public TLRPC.InputFile f23811w;
    public TLRPC.InputEncryptedFile f23812x;
    public byte[] f23813y;
    public byte[] f23814z;
    public long f23794c = -1;
    public int f23803n = 24;
    public float f23810u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList f23793b0 = new ArrayList();

    public final boolean a() {
        return this.f23808s;
    }

    public final String b() {
        int i7;
        byte[] bArr;
        String f10;
        Object obj;
        ArrayList arrayList;
        if (this.f23794c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
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
            serializedData.writeInt64(this.f23794c);
            serializedData.writeInt32(this.f23799j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.f24098a);
                serializedData.writeFloat(this.A.f24099b);
                serializedData.writeFloat(this.A.f24100c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.f24101e);
                serializedData.writeFloat(this.A.f24102f);
                serializedData.writeFloat(this.A.f24103g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.f24104i);
                serializedData.writeFloat(this.A.f24105j);
                serializedData.writeFloat(this.A.f24106k);
                serializedData.writeFloat(this.A.f24107l);
                serializedData.writeFloat(this.A.f24108m);
                serializedData.writeInt32(this.A.f24109n);
                serializedData.writeFloat(this.A.f24110o);
                serializedData.writeFloat(this.A.f24112q);
                PointF pointF = this.A.f24113r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.f24113r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.f24114s);
                serializedData.writeFloat(this.A.f24115t);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        obj = this.A.f24111p.f13725b;
                    } else if (i10 == 1) {
                        obj = this.A.f24111p.f13726c;
                    } else if (i10 == 2) {
                        obj = this.A.f24111p.d;
                    } else {
                        obj = this.A.f24111p.f13727e;
                    }
                    ce0 ce0Var = (ce0) obj;
                    serializedData.writeFloat(ce0Var.f34154a);
                    serializedData.writeFloat(ce0Var.f34155b);
                    serializedData.writeFloat(ce0Var.f34156c);
                    serializedData.writeFloat(ce0Var.d);
                    serializedData.writeFloat(ce0Var.f34157e);
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
                serializedData.writeFloat(this.H.f27838a);
                serializedData.writeFloat(this.H.f27839b);
                serializedData.writeFloat(this.H.f27841e);
                serializedData.writeFloat(this.H.f27842f);
                serializedData.writeFloat(this.H.f27840c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.f27843i);
                serializedData.writeInt32(this.H.f27844j);
                serializedData.writeInt32(this.H.f27845k);
                serializedData.writeBool(this.H.f27846l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.f23791a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.f23810u);
            serializedData.writeBool(this.N);
            hi.t tVar = this.L;
            if (tVar != null && this.M != null && tVar.f15353e.size() > 1 && !this.M.isEmpty()) {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.f15350a);
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
        long j3 = this.f23790a;
        long j10 = this.f23792b;
        int i13 = this.f23797g;
        int i14 = this.h;
        int i15 = this.f23798i;
        int i16 = this.f23802m;
        int i17 = this.f23800k;
        int i18 = this.f23801l;
        long j11 = this.v;
        int i19 = this.f23803n;
        long j12 = this.f23805p;
        String str3 = f10;
        String str4 = this.f23804o;
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
        ArrayList arrayList = this.f23793b0;
        if (z10) {
            if (this.f23791a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((xeVar = this.H) == null || xeVar.b()) && this.f23790a <= 0)) {
                long j3 = this.f23792b;
                if ((j3 == -1 || j3 == this.f23807r) && this.f23798i == this.f23801l && this.h == this.f23800k) {
                    return false;
                }
            }
            return true;
        }
        if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.f23808s && this.f23790a <= 0) {
            long j10 = this.f23792b;
            if (j10 == -1 || j10 == this.f23807r) {
                return false;
            }
        }
        return true;
    }
}
