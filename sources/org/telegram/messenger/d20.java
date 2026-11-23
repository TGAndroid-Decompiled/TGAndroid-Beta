package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.be0;
public final class d20 {
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
    public hi.w7 K;
    public hi.c0 L;
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
    public long f23587a;
    public boolean f23588a0;
    public long f23589b;
    public float d;
    public float f23592e;
    public int f23593f;
    public int f23594g;
    public int h;
    public int f23595i;
    public int f23596j;
    public int f23597k;
    public int f23598l;
    public int f23599m;
    public String f23601o;
    public long f23602p;
    public long f23603q;
    public long f23604r;
    public boolean f23605s;
    public boolean f23606t;
    public long v;
    public TLRPC.InputFile f23608w;
    public TLRPC.InputEncryptedFile f23609x;
    public byte[] f23610y;
    public byte[] f23611z;
    public long f23591c = -1;
    public int f23600n = 24;
    public float f23607u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList f23590b0 = new ArrayList();

    public final boolean a() {
        return this.f23605s;
    }

    public final String b() {
        int i7;
        byte[] bArr;
        String f10;
        Object obj;
        ArrayList arrayList;
        if (this.f23591c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
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
            serializedData.writeInt64(this.f23591c);
            serializedData.writeInt32(this.f23596j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.f23994a);
                serializedData.writeFloat(this.A.f23995b);
                serializedData.writeFloat(this.A.f23996c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.f23997e);
                serializedData.writeFloat(this.A.f23998f);
                serializedData.writeFloat(this.A.f23999g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.f24000i);
                serializedData.writeFloat(this.A.f24001j);
                serializedData.writeFloat(this.A.f24002k);
                serializedData.writeFloat(this.A.f24003l);
                serializedData.writeFloat(this.A.f24004m);
                serializedData.writeInt32(this.A.f24005n);
                serializedData.writeFloat(this.A.f24006o);
                serializedData.writeFloat(this.A.f24008q);
                PointF pointF = this.A.f24009r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.f24009r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.f24010s);
                serializedData.writeFloat(this.A.f24011t);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        obj = this.A.f24007p.f13725b;
                    } else if (i10 == 1) {
                        obj = this.A.f24007p.f13726c;
                    } else if (i10 == 2) {
                        obj = this.A.f24007p.d;
                    } else {
                        obj = this.A.f24007p.f13727e;
                    }
                    be0 be0Var = (be0) obj;
                    serializedData.writeFloat(be0Var.f33744a);
                    serializedData.writeFloat(be0Var.f33745b);
                    serializedData.writeFloat(be0Var.f33746c);
                    serializedData.writeFloat(be0Var.d);
                    serializedData.writeFloat(be0Var.f33747e);
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
                    ((b20) this.G.get(i11)).b(serializedData, false);
                }
                serializedData.writeByte(this.I ? 1 : 0);
            } else {
                serializedData.writeByte(0);
            }
            if (this.H != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.H.f27768a);
                serializedData.writeFloat(this.H.f27769b);
                serializedData.writeFloat(this.H.f27771e);
                serializedData.writeFloat(this.H.f27772f);
                serializedData.writeFloat(this.H.f27770c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.f27773i);
                serializedData.writeInt32(this.H.f27774j);
                serializedData.writeInt32(this.H.f27775k);
                serializedData.writeBool(this.H.f27776l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.f23588a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.f23607u);
            serializedData.writeBool(this.N);
            hi.c0 c0Var = this.L;
            if (c0Var != null && this.M != null && c0Var.f14250e.size() > 1 && !this.M.isEmpty()) {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.f14247a);
                for (int i12 = 0; i12 < this.M.size(); i12++) {
                    ((c20) this.M.get(i12)).serializeToStream(serializedData);
                }
            } else {
                serializedData.writeInt32(1450380236);
            }
            f10 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j3 = this.f23587a;
        long j10 = this.f23589b;
        int i13 = this.f23594g;
        int i14 = this.h;
        int i15 = this.f23595i;
        int i16 = this.f23599m;
        int i17 = this.f23597k;
        int i18 = this.f23598l;
        long j11 = this.v;
        int i19 = this.f23600n;
        long j12 = this.f23602p;
        String str3 = f10;
        String str4 = this.f23601o;
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
        ArrayList arrayList = this.f23590b0;
        if (z10) {
            if (this.f23588a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((weVar = this.H) == null || weVar.b()) && this.f23587a <= 0)) {
                long j3 = this.f23589b;
                if ((j3 == -1 || j3 == this.f23604r) && this.f23595i == this.f23598l && this.h == this.f23597k) {
                    return false;
                }
            }
            return true;
        }
        if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.f23605s && this.f23587a <= 0) {
            long j10 = this.f23589b;
            if (j10 == -1 || j10 == this.f23604r) {
                return false;
            }
        }
        return true;
    }
}
