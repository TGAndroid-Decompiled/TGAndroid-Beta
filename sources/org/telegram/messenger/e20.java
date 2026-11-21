package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ce0;
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
    public long f23662a;
    public boolean f23663a0;
    public long f23664b;
    public float d;
    public float f23667e;
    public int f23668f;
    public int f23669g;
    public int h;
    public int f23670i;
    public int f23671j;
    public int f23672k;
    public int f23673l;
    public int f23674m;
    public String f23676o;
    public long f23677p;
    public long f23678q;
    public long f23679r;
    public boolean f23680s;
    public boolean f23681t;
    public long v;
    public TLRPC.InputFile f23683w;
    public TLRPC.InputEncryptedFile f23684x;
    public byte[] f23685y;
    public byte[] f23686z;
    public long f23666c = -1;
    public int f23675n = 24;
    public float f23682u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList f23665b0 = new ArrayList();

    public final boolean a() {
        return this.f23680s;
    }

    public final String b() {
        int i7;
        byte[] bArr;
        String f10;
        Object obj;
        ArrayList arrayList;
        if (this.f23666c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
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
            serializedData.writeInt64(this.f23666c);
            serializedData.writeInt32(this.f23671j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.f23914a);
                serializedData.writeFloat(this.A.f23915b);
                serializedData.writeFloat(this.A.f23916c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.f23917e);
                serializedData.writeFloat(this.A.f23918f);
                serializedData.writeFloat(this.A.f23919g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.f23920i);
                serializedData.writeFloat(this.A.f23921j);
                serializedData.writeFloat(this.A.f23922k);
                serializedData.writeFloat(this.A.f23923l);
                serializedData.writeFloat(this.A.f23924m);
                serializedData.writeInt32(this.A.f23925n);
                serializedData.writeFloat(this.A.f23926o);
                serializedData.writeFloat(this.A.f23928q);
                PointF pointF = this.A.f23929r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.f23929r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.f23930s);
                serializedData.writeFloat(this.A.f23931t);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        obj = this.A.f23927p.f13759b;
                    } else if (i10 == 1) {
                        obj = this.A.f23927p.f13760c;
                    } else if (i10 == 2) {
                        obj = this.A.f23927p.d;
                    } else {
                        obj = this.A.f23927p.f13761e;
                    }
                    ce0 ce0Var = (ce0) obj;
                    serializedData.writeFloat(ce0Var.f34196a);
                    serializedData.writeFloat(ce0Var.f34197b);
                    serializedData.writeFloat(ce0Var.f34198c);
                    serializedData.writeFloat(ce0Var.d);
                    serializedData.writeFloat(ce0Var.f34199e);
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
                serializedData.writeFloat(this.H.f27702a);
                serializedData.writeFloat(this.H.f27703b);
                serializedData.writeFloat(this.H.f27705e);
                serializedData.writeFloat(this.H.f27706f);
                serializedData.writeFloat(this.H.f27704c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.f27707i);
                serializedData.writeInt32(this.H.f27708j);
                serializedData.writeInt32(this.H.f27709k);
                serializedData.writeBool(this.H.f27710l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.f23663a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.f23682u);
            serializedData.writeBool(this.N);
            hi.v vVar = this.L;
            if (vVar != null && this.M != null && vVar.f15588e.size() > 1 && !this.M.isEmpty()) {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.f15585a);
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
        long j3 = this.f23662a;
        long j10 = this.f23664b;
        int i13 = this.f23669g;
        int i14 = this.h;
        int i15 = this.f23670i;
        int i16 = this.f23674m;
        int i17 = this.f23672k;
        int i18 = this.f23673l;
        long j11 = this.v;
        int i19 = this.f23675n;
        long j12 = this.f23677p;
        String str3 = f10;
        String str4 = this.f23676o;
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
        ArrayList arrayList = this.f23665b0;
        if (z10) {
            if (this.f23663a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((weVar = this.H) == null || weVar.b()) && this.f23662a <= 0)) {
                long j3 = this.f23664b;
                if ((j3 == -1 || j3 == this.f23679r) && this.f23670i == this.f23673l && this.h == this.f23672k) {
                    return false;
                }
            }
            return true;
        }
        if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.f23680s && this.f23662a <= 0) {
            long j10 = this.f23664b;
            if (j10 == -1 || j10 == this.f23679r) {
                return false;
            }
        }
        return true;
    }
}
