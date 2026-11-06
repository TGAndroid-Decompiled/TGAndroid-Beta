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
    public long f23450a;
    public boolean f23451a0;
    public long f23452b;
    public float d;
    public float f23455e;
    public int f23456f;
    public int f23457g;
    public int h;
    public int f23458i;
    public int f23459j;
    public int f23460k;
    public int f23461l;
    public int f23462m;
    public String f23464o;
    public long f23465p;
    public long f23466q;
    public long f23467r;
    public boolean f23468s;
    public boolean f23469t;
    public long v;
    public TLRPC.InputFile f23471w;
    public TLRPC.InputEncryptedFile f23472x;
    public byte[] f23473y;
    public byte[] f23474z;
    public long f23454c = -1;
    public int f23463n = 24;
    public float f23470u = 1.0f;
    public long U = Long.MIN_VALUE;
    public boolean Y = false;
    public boolean Z = true;
    public final ArrayList f23453b0 = new ArrayList();

    public final boolean a() {
        return this.f23468s;
    }

    public final String b() {
        int i7;
        byte[] bArr;
        String f10;
        Object obj;
        ArrayList arrayList;
        if (this.f23454c == -1 && this.A == null && this.B == null && this.C == null && (((arrayList = this.G) == null || arrayList.isEmpty()) && this.H == null)) {
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
            serializedData.writeInt64(this.f23454c);
            serializedData.writeInt32(this.f23459j);
            if (this.A != null) {
                serializedData.writeByte(1);
                serializedData.writeFloat(this.A.f22913a);
                serializedData.writeFloat(this.A.f22914b);
                serializedData.writeFloat(this.A.f22915c);
                serializedData.writeFloat(this.A.d);
                serializedData.writeFloat(this.A.f22916e);
                serializedData.writeFloat(this.A.f22917f);
                serializedData.writeFloat(this.A.f22918g);
                serializedData.writeInt32(this.A.h);
                serializedData.writeInt32(this.A.f22919i);
                serializedData.writeFloat(this.A.f22920j);
                serializedData.writeFloat(this.A.f22921k);
                serializedData.writeFloat(this.A.f22922l);
                serializedData.writeFloat(this.A.f22923m);
                serializedData.writeInt32(this.A.f22924n);
                serializedData.writeFloat(this.A.f22925o);
                serializedData.writeFloat(this.A.f22927q);
                PointF pointF = this.A.f22928r;
                if (pointF != null) {
                    serializedData.writeFloat(pointF.x);
                    serializedData.writeFloat(this.A.f22928r.y);
                } else {
                    serializedData.writeFloat(0.0f);
                    serializedData.writeFloat(0.0f);
                }
                serializedData.writeFloat(this.A.f22929s);
                serializedData.writeFloat(this.A.f22930t);
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        obj = this.A.f22926p.f14058b;
                    } else if (i10 == 1) {
                        obj = this.A.f22926p.f14059c;
                    } else if (i10 == 2) {
                        obj = this.A.f22926p.d;
                    } else {
                        obj = this.A.f22926p.f14060e;
                    }
                    qd0 qd0Var = (qd0) obj;
                    serializedData.writeFloat(qd0Var.f37261a);
                    serializedData.writeFloat(qd0Var.f37262b);
                    serializedData.writeFloat(qd0Var.f37263c);
                    serializedData.writeFloat(qd0Var.d);
                    serializedData.writeFloat(qd0Var.f37264e);
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
                serializedData.writeFloat(this.H.f26626a);
                serializedData.writeFloat(this.H.f26627b);
                serializedData.writeFloat(this.H.f26629e);
                serializedData.writeFloat(this.H.f26630f);
                serializedData.writeFloat(this.H.f26628c);
                serializedData.writeFloat(this.H.d);
                serializedData.writeInt32(this.H.f26631i);
                serializedData.writeInt32(this.H.f26632j);
                serializedData.writeInt32(this.H.f26633k);
                serializedData.writeBool(this.H.f26634l);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeInt32(0);
            serializedData.writeBool(this.J);
            serializedData.writeBool(this.f23451a0);
            if (bArr2 != null) {
                serializedData.writeByte(1);
                serializedData.writeByteArray(bArr2);
            } else {
                serializedData.writeByte(0);
            }
            serializedData.writeFloat(this.f23470u);
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
        long j3 = this.f23450a;
        long j10 = this.f23452b;
        int i13 = this.f23457g;
        int i14 = this.h;
        int i15 = this.f23458i;
        int i16 = this.f23462m;
        int i17 = this.f23460k;
        int i18 = this.f23461l;
        long j11 = this.v;
        int i19 = this.f23463n;
        long j12 = this.f23465p;
        String str3 = f10;
        String str4 = this.f23464o;
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
        ArrayList arrayList = this.f23453b0;
        if (z9) {
            if (this.f23451a0 && arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && (((yeVar = this.H) == null || yeVar.b()) && this.f23450a <= 0)) {
                long j3 = this.f23452b;
                if ((j3 == -1 || j3 == this.f23467r) && this.f23458i == this.f23461l && this.h == this.f23460k) {
                    return false;
                }
            }
            return true;
        }
        if (arrayList.isEmpty() && this.G == null && this.B == null && this.C == null && this.A == null && this.H == null && this.f23468s && this.f23450a <= 0) {
            long j10 = this.f23452b;
            if (j10 == -1 || j10 == this.f23467r) {
                return false;
            }
        }
        return true;
    }
}
