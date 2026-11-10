package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qd0;
public final class j20 {
    public hf A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public ArrayList G;
    public ye H;
    public boolean I;
    public boolean J;
    public fi.d7 K;
    public fi.t L;
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
    public long f23475a;
    public boolean f23476a0;
    public long f23477b;
    public float d;
    public float f23480e;
    public int f23481f;
    public int f23482g;
    public int h;
    public int f23483i;
    public int f23484j;
    public int f23485k;
    public int f23486l;
    public int f23487m;
    public String f23489o;
    public long f23490p;
    public long f23491q;
    public long f23492r;
    public boolean f23493s;
    public boolean f23494t;
    public long v;
    public TLRPC.InputFile f23496w;
    public TLRPC.InputEncryptedFile f23497x;
    public byte[] f23498y;
    public byte[] f23499z;
    public long f23479c = -1;
    public int f23488n = 24;
    public float f23495u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList f23478b0 = new ArrayList();

    public final boolean a() {
        return this.f23493s;
    }

    public final String b() {
        int i7;
        byte[] bArr;
        String f10;
        Object obj;
        ArrayList arrayList;
        if (this.f23479c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
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
            serializedData.writeInt64(this.f23479c);
            serializedData.writeInt32(this.f23484j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.f22893a);
                serializedData.writeFloat(this.A.f22894b);
                serializedData.writeFloat(this.A.f22895c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.f22896e);
                serializedData.writeFloat(this.A.f22897f);
                serializedData.writeFloat(this.A.f22898g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.f22899i);
                serializedData.writeFloat(this.A.f22900j);
                serializedData.writeFloat(this.A.f22901k);
                serializedData.writeFloat(this.A.f22902l);
                serializedData.writeFloat(this.A.f22903m);
                serializedData.writeInt32(this.A.f22904n);
                serializedData.writeFloat(this.A.f22905o);
                serializedData.writeFloat(this.A.f22907q);
                PointF pointF = this.A.f22908r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.f22908r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.f22909s);
                serializedData.writeFloat(this.A.f22910t);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        obj = this.A.f22906p.f14060b;
                    } else if (i10 == 1) {
                        obj = this.A.f22906p.f14061c;
                    } else if (i10 == 2) {
                        obj = this.A.f22906p.d;
                    } else {
                        obj = this.A.f22906p.f14062e;
                    }
                    qd0 qd0Var = (qd0) obj;
                    serializedData.writeFloat(qd0Var.f37268a);
                    serializedData.writeFloat(qd0Var.f37269b);
                    serializedData.writeFloat(qd0Var.f37270c);
                    serializedData.writeFloat(qd0Var.d);
                    serializedData.writeFloat(qd0Var.f37271e);
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
                    ((h20) this.G.get(i11)).b(serializedData, false);
                }
                serializedData.writeByte(this.I ? 1 : 0);
            } else {
                serializedData.writeByte(0);
            }
            if (this.H != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.H.f26639a);
                serializedData.writeFloat(this.H.f26640b);
                serializedData.writeFloat(this.H.f26642e);
                serializedData.writeFloat(this.H.f26643f);
                serializedData.writeFloat(this.H.f26641c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.f26644i);
                serializedData.writeInt32(this.H.f26645j);
                serializedData.writeInt32(this.H.f26646k);
                serializedData.writeBool(this.H.f26647l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.f23476a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.f23495u);
            serializedData.writeBool(this.N);
            fi.t tVar = this.L;
            if (tVar != null && this.M != null && tVar.f12828e.size() > 1 && !this.M.isEmpty()) {
                serializedData.writeInt32(-559038737);
                serializedData.writeString(this.L.f12825a);
                for (int i12 = 0; i12 < this.M.size(); i12++) {
                    ((i20) this.M.get(i12)).serializeToStream(serializedData);
                }
            } else {
                serializedData.writeInt32(1450380236);
            }
            f10 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
        }
        Locale locale = Locale.US;
        long j3 = this.f23475a;
        long j10 = this.f23477b;
        int i13 = this.f23482g;
        int i14 = this.h;
        int i15 = this.f23483i;
        int i16 = this.f23487m;
        int i17 = this.f23485k;
        int i18 = this.f23486l;
        long j11 = this.v;
        int i19 = this.f23488n;
        long j12 = this.f23490p;
        String str3 = f10;
        String str4 = this.f23489o;
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
        return org.telegram.ui.Cells.f1.n(str3, "_", str4, t6);
    }

    public final boolean c() {
        ye yeVar;
        boolean z9 = this.J;
        ArrayList arrayList = this.f23478b0;
        if (z9) {
            if (this.f23476a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((yeVar = this.H) == null || yeVar.b()) && this.f23475a <= 0)) {
                long j3 = this.f23477b;
                if ((j3 == -1 || j3 == this.f23492r) && this.f23483i == this.f23486l && this.h == this.f23485k) {
                    return false;
                }
            }
            return true;
        }
        if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.f23493s && this.f23475a <= 0) {
            long j10 = this.f23477b;
            if (j10 == -1 || j10 == this.f23492r) {
                return false;
            }
        }
        return true;
    }
}
