package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ld0;
public final class b20 {
    public ze A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public ArrayList G;
    public re H;
    public boolean I;
    public boolean J;
    public gi.e7 K;
    public gi.t L;
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
    public long f21708a;
    public boolean f21709a0;
    public long f21710b;
    public float d;
    public float f21713e;
    public int f21714f;
    public int f21715g;
    public int h;
    public int f21716i;
    public int f21717j;
    public int f21718k;
    public int f21719l;
    public int f21720m;
    public String f21722o;
    public long f21723p;
    public long f21724q;
    public long f21725r;
    public boolean f21726s;
    public boolean f21727t;
    public long v;
    public TLRPC.InputFile f21729w;
    public TLRPC.InputEncryptedFile f21730x;
    public byte[] f21731y;
    public byte[] f21732z;
    public long f21712c = -1;
    public int f21721n = 24;
    public float f21728u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList f21711b0 = new ArrayList();

    public final boolean a() {
        return this.f21726s;
    }

    public final String b() {
        int i3;
        byte[] bArr;
        String f10;
        Object obj;
        ArrayList arrayList;
        if (this.f21712c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
            f10 = "";
        } else {
            if (this.A != null) {
                i3 = 170;
            } else {
                i3 = 10;
            }
            String str = this.B;
            byte[] bArr2 = null;
            if (str != null) {
                bArr = str.getBytes();
                i3 += bArr.length;
            } else {
                bArr = null;
            }
            String str2 = this.C;
            if (str2 != null) {
                bArr2 = str2.getBytes();
                i3 += bArr2.length;
            }
            SerializedData serializedData = new SerializedData(i3);
            serializedData.writeInt32(11);
            serializedData.writeInt64(this.f21712c);
            serializedData.writeInt32(this.f21717j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.f26784a);
                serializedData.writeFloat(this.A.f26785b);
                serializedData.writeFloat(this.A.f26786c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.f26787e);
                serializedData.writeFloat(this.A.f26788f);
                serializedData.writeFloat(this.A.f26789g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.f26790i);
                serializedData.writeFloat(this.A.f26791j);
                serializedData.writeFloat(this.A.f26792k);
                serializedData.writeFloat(this.A.f26793l);
                serializedData.writeFloat(this.A.f26794m);
                serializedData.writeInt32(this.A.f26795n);
                serializedData.writeFloat(this.A.f26796o);
                serializedData.writeFloat(this.A.f26798q);
                PointF pointF = this.A.f26799r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.f26799r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.f26800s);
                serializedData.writeFloat(this.A.f26801t);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        obj = this.A.f26797p.f11819b;
                    } else if (i10 == 1) {
                        obj = this.A.f26797p.f11820c;
                    } else if (i10 == 2) {
                        obj = this.A.f26797p.d;
                    } else {
                        obj = this.A.f26797p.f11821e;
                    }
                    ld0 ld0Var = (ld0) obj;
                    serializedData.writeFloat(ld0Var.f35707a);
                    serializedData.writeFloat(ld0Var.f35708b);
                    serializedData.writeFloat(ld0Var.f35709c);
                    serializedData.writeFloat(ld0Var.d);
                    serializedData.writeFloat(ld0Var.f35710e);
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
                    ((z10) this.G.get(i11)).b(serializedData, false);
                }
                serializedData.writeByte(this.I ? 1 : 0);
            } else {
                serializedData.writeByte(0);
            }
            if (this.H != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.H.f25110a);
                serializedData.writeFloat(this.H.f25111b);
                serializedData.writeFloat(this.H.f25113e);
                serializedData.writeFloat(this.H.f25114f);
                serializedData.writeFloat(this.H.f25112c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.f25115i);
                serializedData.writeInt32(this.H.f25116j);
                serializedData.writeInt32(this.H.f25117k);
                serializedData.writeBool(this.H.f25118l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.f21709a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.f21728u);
            serializedData.writeBool(this.N);
            gi.t tVar = this.L;
            if (tVar != null && this.M != null && tVar.f13589e.size() > 1 && !this.M.isEmpty()) {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.f13586a);
                for (int i12 = 0; i12 < this.M.size(); i12++) {
                    ((a20) this.M.get(i12)).serializeToStream(serializedData);
                }
            } else {
                serializedData.writeInt32(1450380236);
            }
            f10 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j10 = this.f21708a;
        long j11 = this.f21710b;
        int i13 = this.f21715g;
        int i14 = this.h;
        int i15 = this.f21716i;
        int i16 = this.f21720m;
        int i17 = this.f21718k;
        int i18 = this.f21719l;
        long j12 = this.v;
        int i19 = this.f21721n;
        long j13 = this.f21723p;
        String str3 = f10;
        String str4 = this.f21722o;
        StringBuilder t10 = a1.g.t(j10, "-1_", "_");
        t10.append(j11);
        t10.append("_");
        t10.append(i13);
        t10.append("_");
        t10.append(i14);
        t10.append("_");
        t10.append(i15);
        t10.append("_");
        t10.append(i16);
        t10.append("_");
        t10.append(i17);
        t10.append("_");
        t10.append(i18);
        t10.append("_");
        t10.append(j12);
        t10.append("_");
        t10.append(i19);
        t10.append("_");
        t10.append(j13);
        t10.append("_-");
        return org.telegram.ui.Cells.f1.r(str3, "_", str4, t10);
    }

    public final boolean c() {
        re reVar;
        boolean z10 = this.J;
        ArrayList arrayList = this.f21711b0;
        if (z10) {
            if (this.f21709a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((reVar = this.H) == null || reVar.b()) && this.f21708a <= 0)) {
                long j10 = this.f21710b;
                if ((j10 == -1 || j10 == this.f21725r) && this.f21716i == this.f21719l && this.h == this.f21718k) {
                    return false;
                }
            }
            return true;
        }
        if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.f21726s && this.f21708a <= 0) {
            long j11 = this.f21710b;
            if (j11 == -1 || j11 == this.f21725r) {
                return false;
            }
        }
        return true;
    }
}
