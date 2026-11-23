package hi;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.d20;
import org.telegram.messenger.e20;
import org.telegram.messenger.gf;
import org.telegram.messenger.gj;
import org.telegram.messenger.si;
import org.telegram.messenger.xe;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ce0;
public final class z0 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final gf E;
    public final int F;
    public boolean G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public final boolean M;
    public final TLRPC.TL_error N;
    public final String O;
    public final TLRPC.InputDocument P;
    public final String Q;
    public final String R;
    public final long S;
    public final long T;
    public final float U;
    public final float V;
    public final float W;
    public final String X;
    public final String Y;
    public final long Z;
    public long f15747a;
    public final long f15748a0;
    public final long f15749b;
    public final float f15750b0;
    public final String f15751c;
    public final float f15752c0;
    public final String d;
    public final float f15753d0;
    public final boolean f15754e;
    public final float f15755e0;
    public final String f15756f;
    public final TLRPC.InputPeer f15757f0;
    public final boolean f15758g;
    public final long f15759g0;
    public final boolean h;
    public final String f15760h0;
    public final long f15761i;
    public final TLRPC.InputMedia f15762i0;
    public final long f15763j;
    public final t f15764j0;
    public final int f15765k;
    public final ArrayList f15766k0;
    public final int f15767l;
    public final int f15768m;
    public final int f15769n;
    public final xe f15770o;
    public final int f15771p;
    public final int f15772q;
    public final long f15773r;
    public final float[] f15774s;
    public final int f15775t;
    public final int f15776u;
    public final String v;
    public final ArrayList f15777w;
    public final ArrayList f15778x;
    public final String f15779y;
    public final String f15780z;

    public z0(d7 d7Var) {
        float[] fArr = new float[9];
        this.f15774s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f15778x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f15753d0 = 1.0f;
        this.f15755e0 = 1.0f;
        this.f15747a = d7Var.f14365b;
        this.f15749b = d7Var.d;
        File file = d7Var.O0;
        this.f15751c = file == null ? "" : file.toString();
        File file2 = d7Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f15754e = d7Var.K;
        File file3 = d7Var.L;
        this.f15756f = file3 == null ? "" : file3.toString();
        this.f15758g = d7Var.M;
        this.h = d7Var.Y;
        float f10 = d7Var.Z;
        long j3 = d7Var.f14380h0;
        this.f15761i = f10 * ((float) j3);
        this.f15763j = d7Var.f14363a0 * ((float) j3);
        this.f15765k = d7Var.Q;
        this.f15767l = d7Var.R;
        this.f15768m = d7Var.f14386k0;
        this.f15769n = d7Var.f14388l0;
        this.f15770o = d7Var.m0;
        this.f15771p = d7Var.f14382i0;
        this.f15772q = d7Var.f14384j0;
        this.f15773r = j3;
        d7Var.f14391n0.getValues(fArr);
        this.f15775t = d7Var.A0;
        this.f15776u = d7Var.B0;
        CharSequence[] charSequenceArr = {d7Var.C0};
        this.f15777w = d7Var.D0 ? si.d0(d7Var.f14362a).Y(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(d7Var.F0);
        File file4 = d7Var.P0;
        this.f15779y = file4 == null ? "" : file4.toString();
        File file5 = d7Var.R0;
        this.f15780z = file5 == null ? "" : file5.toString();
        this.A = d7Var.S0;
        this.B = d7Var.T0;
        this.C = d7Var.U0;
        File file6 = d7Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = d7Var.f14364a1;
        this.F = d7Var.I0;
        this.M = d7Var.f14407w;
        this.N = d7Var.f14409x;
        this.O = d7Var.f14411y;
        this.P = d7Var.f14413z;
        this.Q = d7Var.A;
        this.R = d7Var.B;
        this.S = d7Var.C;
        this.T = d7Var.D;
        this.U = d7Var.E;
        this.V = d7Var.F;
        this.W = d7Var.G;
        File file7 = d7Var.f14393o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = d7Var.f14395p0;
        this.Z = d7Var.f14397q0;
        this.f15748a0 = d7Var.f14399r0;
        this.f15750b0 = d7Var.f14401s0;
        this.f15752c0 = d7Var.f14403t0;
        this.f15753d0 = d7Var.f14405u0;
        this.f15755e0 = d7Var.P;
        this.f15757f0 = d7Var.f14406v0;
        this.f15759g0 = d7Var.J0;
        this.f15760h0 = d7Var.K0;
        this.f15762i0 = d7Var.L0;
        this.f15764j0 = d7Var.S;
        this.f15766k0 = e20.a(d7Var);
    }

    public final d7 a() {
        d7 d7Var = new d7();
        d7Var.f14365b = this.f15747a;
        d7Var.f14368c = true;
        d7Var.d = this.f15749b;
        String str = this.f15751c;
        if (!TextUtils.isEmpty(str)) {
            d7Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            d7Var.N0 = new File(str2);
        }
        d7Var.K = this.f15754e;
        String str3 = this.f15756f;
        if (str3 != null) {
            d7Var.L = new File(str3);
        }
        d7Var.M = this.f15758g;
        d7Var.Y = this.h;
        long j3 = this.f15773r;
        d7Var.f14380h0 = j3;
        if (j3 > 0) {
            d7Var.Z = ((float) this.f15761i) / ((float) j3);
            d7Var.f14363a0 = ((float) this.f15763j) / ((float) j3);
        } else {
            d7Var.Z = 0.0f;
            d7Var.f14363a0 = 1.0f;
        }
        d7Var.Q = this.f15765k;
        d7Var.R = this.f15767l;
        d7Var.f14386k0 = this.f15768m;
        d7Var.f14388l0 = this.f15769n;
        d7Var.m0 = this.f15770o;
        d7Var.f14382i0 = this.f15771p;
        d7Var.f14384j0 = this.f15772q;
        d7Var.f14391n0.setValues(this.f15774s);
        d7Var.A0 = this.f15775t;
        d7Var.B0 = this.f15776u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i7 = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.m6.f29544o2 == null) {
                org.telegram.ui.ActionBar.m6.Q();
            }
            CharSequence m10 = org.telegram.messenger.j6.m(spannableString, org.telegram.ui.ActionBar.m6.f29544o2.getFontMetricsInt(), true, null, 0);
            gj.b(m10, this.f15777w, true, false, true, false, 0);
            d7Var.C0 = gj.B5(m10, this.f15777w, org.telegram.ui.ActionBar.m6.f29544o2.getFontMetricsInt(), false);
        } else {
            d7Var.C0 = "";
        }
        ArrayList arrayList2 = d7Var.F0;
        arrayList2.clear();
        arrayList2.addAll(this.f15778x);
        String str5 = this.f15779y;
        if (str5 != null) {
            d7Var.P0 = new File(str5);
        }
        String str6 = this.f15780z;
        if (str6 != null) {
            d7Var.R0 = new File(str6);
        }
        d7Var.S0 = this.A;
        d7Var.T0 = this.B;
        d7Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            d7Var.Z0 = new File(str7);
        }
        d7Var.f14364a1 = this.E;
        d7Var.I0 = this.F;
        d7Var.f14378g = this.G;
        d7Var.f14376f = this.H;
        d7Var.f14373e = this.I;
        d7Var.J = this.L;
        d7Var.I = this.K;
        d7Var.H = this.J;
        d7Var.f14407w = this.M;
        d7Var.f14409x = this.N;
        d7Var.f14411y = this.O;
        d7Var.f14413z = this.P;
        d7Var.A = this.Q;
        d7Var.B = this.R;
        d7Var.C = this.S;
        d7Var.D = this.T;
        d7Var.E = this.U;
        d7Var.F = this.V;
        d7Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            d7Var.f14393o0 = new File(str8);
        }
        d7Var.f14395p0 = this.Y;
        d7Var.f14397q0 = this.Z;
        d7Var.f14399r0 = this.f15748a0;
        d7Var.f14401s0 = this.f15750b0;
        d7Var.f14403t0 = this.f15752c0;
        d7Var.f14405u0 = this.f15753d0;
        d7Var.P = this.f15755e0;
        d7Var.f14406v0 = this.f15757f0;
        d7Var.J0 = this.f15759g0;
        d7Var.K0 = this.f15760h0;
        d7Var.L0 = this.f15762i0;
        d7Var.S = this.f15764j0;
        int i10 = e20.C;
        ArrayList arrayList3 = this.f15766k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                i7++;
                e20 e20Var = (e20) obj;
                d7 d7Var2 = new d7();
                d7Var2.K = e20Var.f23626b;
                d7Var2.Y = e20Var.f23627c;
                d7Var2.L = new File(e20Var.d);
                d7Var2.P = e20Var.f23628e;
                d7Var2.U = e20Var.f23630i;
                d7Var2.X = e20Var.f23629f;
                d7Var2.V = e20Var.f23631j;
                d7Var2.W = e20Var.f23632k;
                d7Var2.f14386k0 = e20Var.f23633l;
                d7Var2.f14388l0 = e20Var.f23634m;
                d7Var2.f14380h0 = e20Var.f23635o;
                arrayList.add(d7Var2);
            }
        }
        d7Var.T = arrayList;
        return d7Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f15749b);
        nativeByteBuffer.writeString(this.f15751c);
        nativeByteBuffer.writeBool(this.f15754e);
        nativeByteBuffer.writeString(this.f15756f);
        nativeByteBuffer.writeBool(this.f15758g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f15761i);
        nativeByteBuffer.writeInt64(this.f15763j);
        nativeByteBuffer.writeInt32(this.f15765k);
        nativeByteBuffer.writeInt32(this.f15767l);
        nativeByteBuffer.writeInt32(this.f15768m);
        nativeByteBuffer.writeInt32(this.f15769n);
        nativeByteBuffer.writeInt32(this.f15771p);
        nativeByteBuffer.writeInt32(this.f15772q);
        nativeByteBuffer.writeInt64(this.f15773r);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f15774s;
            if (i10 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i10]);
            i10++;
        }
        nativeByteBuffer.writeInt32(this.f15775t);
        nativeByteBuffer.writeInt32(this.f15776u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f15777w;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        nativeByteBuffer.writeInt32(size);
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                ((TLRPC.MessageEntity) arrayList2.get(i11)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList3 = this.f15778x;
        if (arrayList3 == null) {
            size2 = 0;
        } else {
            size2 = arrayList3.size();
        }
        nativeByteBuffer.writeInt32(size2);
        if (arrayList3 != null) {
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                ((TLRPC.InputPrivacyRule) arrayList3.get(i12)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeBool(false);
        nativeByteBuffer.writeString(this.f15779y);
        nativeByteBuffer.writeInt64(this.A);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList4 = this.B;
        if (arrayList4 == null) {
            size3 = 0;
        } else {
            size3 = arrayList4.size();
        }
        nativeByteBuffer.writeInt32(size3);
        if (arrayList4 != null) {
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((d20) arrayList4.get(i13)).b(nativeByteBuffer, true);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        List list = this.C;
        if (list == null) {
            size4 = 0;
        } else {
            size4 = list.size();
        }
        nativeByteBuffer.writeInt32(size4);
        if (list != null) {
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((TLRPC.InputDocument) list.get(i14)).serializeToStream(nativeByteBuffer);
            }
        }
        String str = "";
        String str2 = this.D;
        if (str2 == null) {
            str2 = "";
        }
        nativeByteBuffer.writeString(str2);
        gf gfVar = this.E;
        if (gfVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            nativeByteBuffer.writeFloat(gfVar.f24098a);
            nativeByteBuffer.writeFloat(gfVar.f24099b);
            nativeByteBuffer.writeFloat(gfVar.f24100c);
            nativeByteBuffer.writeFloat(gfVar.d);
            nativeByteBuffer.writeFloat(gfVar.f24101e);
            nativeByteBuffer.writeFloat(gfVar.f24102f);
            nativeByteBuffer.writeFloat(gfVar.f24103g);
            nativeByteBuffer.writeInt32(gfVar.h);
            nativeByteBuffer.writeInt32(gfVar.f24104i);
            nativeByteBuffer.writeFloat(gfVar.f24105j);
            nativeByteBuffer.writeFloat(gfVar.f24106k);
            nativeByteBuffer.writeFloat(gfVar.f24107l);
            nativeByteBuffer.writeFloat(gfVar.f24108m);
            nativeByteBuffer.writeInt32(gfVar.f24109n);
            nativeByteBuffer.writeFloat(gfVar.f24110o);
            h2.c cVar = gfVar.f24111p;
            ((ce0) cVar.f13725b).d(nativeByteBuffer);
            ((ce0) cVar.f13726c).d(nativeByteBuffer);
            ((ce0) cVar.d).d(nativeByteBuffer);
            ((ce0) cVar.f13727e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(gfVar.f24112q);
            if (gfVar.f24113r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(gfVar.f24113r.x);
                nativeByteBuffer.writeFloat(gfVar.f24113r.y);
            }
            nativeByteBuffer.writeFloat(gfVar.f24114s);
            nativeByteBuffer.writeFloat(gfVar.f24115t);
        }
        nativeByteBuffer.writeInt32(this.F);
        nativeByteBuffer.writeInt32(481674261);
        nativeByteBuffer.writeInt32(0);
        nativeByteBuffer.writeBool(this.G);
        nativeByteBuffer.writeInt32(this.H);
        nativeByteBuffer.writeInt64(this.I);
        nativeByteBuffer.writeInt64(this.L);
        nativeByteBuffer.writeInt64(this.K);
        nativeByteBuffer.writeInt64(this.J);
        nativeByteBuffer.writeString(this.f15780z);
        nativeByteBuffer.writeBool(this.M);
        TLRPC.TL_error tL_error = this.N;
        if (tL_error == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            tL_error.serializeToStream(nativeByteBuffer);
        }
        nativeByteBuffer.writeString(this.d);
        String str3 = this.O;
        if (str3 == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1739392570);
            nativeByteBuffer.writeString(str3);
            String str4 = this.Q;
            if (str4 == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1222740358);
                nativeByteBuffer.writeString(str4);
            }
            String str5 = this.R;
            if (str5 == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1222740358);
                nativeByteBuffer.writeString(str5);
            }
            nativeByteBuffer.writeInt64(this.S);
            nativeByteBuffer.writeInt64(this.T);
            nativeByteBuffer.writeFloat(this.U);
            nativeByteBuffer.writeFloat(this.V);
            nativeByteBuffer.writeFloat(this.W);
        }
        TLRPC.InputPeer inputPeer = this.f15757f0;
        if (inputPeer != null) {
            inputPeer.serializeToStream(nativeByteBuffer);
        } else {
            new TLRPC.TL_inputPeerSelf().serializeToStream(nativeByteBuffer);
        }
        String str6 = this.X;
        if (TextUtils.isEmpty(str6)) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(1137015880);
            nativeByteBuffer.writeString(str6);
            nativeByteBuffer.writeInt64(this.Z);
            nativeByteBuffer.writeInt64(this.f15748a0);
            nativeByteBuffer.writeFloat(this.f15750b0);
            nativeByteBuffer.writeFloat(this.f15752c0);
            nativeByteBuffer.writeFloat(this.f15753d0);
        }
        nativeByteBuffer.writeFloat(this.f15755e0);
        nativeByteBuffer.writeInt64(this.f15759g0);
        String str7 = this.f15760h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f15762i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.f15764j0;
        if (tVar != null && tVar.f15353e.size() > 1 && (arrayList = this.f15766k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.f15350a);
            int size5 = arrayList.size();
            while (i7 < size5) {
                Object obj = arrayList.get(i7);
                i7++;
                ((e20) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        xe xeVar = this.f15770o;
        if (xeVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            xeVar.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public z0(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.f15774s = new float[9];
        this.f15778x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f15753d0 = 1.0f;
        this.f15755e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f15749b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f15751c = readString;
            if (readString != null && readString.length() == 0) {
                this.f15751c = null;
            }
            this.f15754e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f15756f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f15756f = null;
            }
            this.f15758g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f15761i = nativeByteBuffer.readInt64(true);
            this.f15763j = nativeByteBuffer.readInt64(true);
            this.f15765k = nativeByteBuffer.readInt32(true);
            this.f15767l = nativeByteBuffer.readInt32(true);
            this.f15768m = nativeByteBuffer.readInt32(true);
            this.f15769n = nativeByteBuffer.readInt32(true);
            this.f15771p = nativeByteBuffer.readInt32(true);
            this.f15772q = nativeByteBuffer.readInt32(true);
            this.f15773r = nativeByteBuffer.readInt64(true);
            int i7 = 0;
            while (true) {
                float[] fArr = this.f15774s;
                if (i7 >= fArr.length) {
                    break;
                }
                fArr[i7] = nativeByteBuffer.readFloat(true);
                i7++;
            }
            this.f15775t = nativeByteBuffer.readInt32(true);
            this.f15776u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i10 = 0; i10 < readInt322; i10++) {
                    if (this.f15777w == null) {
                        this.f15777w = new ArrayList();
                    }
                    this.f15777w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f15778x.clear();
                    for (int i11 = 0; i11 < readInt323; i11++) {
                        this.f15778x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f15779y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f15779y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i12 = 0; i12 < readInt324; i12++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new d20(nativeByteBuffer, true, true));
                        }
                        if (nativeByteBuffer.readInt32(true) == 481674261) {
                            int readInt325 = nativeByteBuffer.readInt32(true);
                            for (int i13 = 0; i13 < readInt325; i13++) {
                                if (this.C == null) {
                                    this.C = new ArrayList();
                                }
                                this.C.add(TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                            }
                            String readString5 = nativeByteBuffer.readString(true);
                            this.D = readString5;
                            if (readString5 != null && readString5.length() == 0) {
                                this.D = null;
                            }
                            int readInt326 = nativeByteBuffer.readInt32(true);
                            if (readInt326 == 1450380236) {
                                this.E = null;
                            } else if (readInt326 == -1318387530) {
                                gf gfVar = new gf();
                                this.E = gfVar;
                                gfVar.f24098a = nativeByteBuffer.readFloat(true);
                                gfVar.f24099b = nativeByteBuffer.readFloat(true);
                                gfVar.f24100c = nativeByteBuffer.readFloat(true);
                                gfVar.d = nativeByteBuffer.readFloat(true);
                                gfVar.f24101e = nativeByteBuffer.readFloat(true);
                                gfVar.f24102f = nativeByteBuffer.readFloat(true);
                                gfVar.f24103g = nativeByteBuffer.readFloat(true);
                                gfVar.h = nativeByteBuffer.readInt32(true);
                                gfVar.f24104i = nativeByteBuffer.readInt32(true);
                                gfVar.f24105j = nativeByteBuffer.readFloat(true);
                                gfVar.f24106k = nativeByteBuffer.readFloat(true);
                                gfVar.f24107l = nativeByteBuffer.readFloat(true);
                                gfVar.f24108m = nativeByteBuffer.readFloat(true);
                                gfVar.f24109n = nativeByteBuffer.readInt32(true);
                                gfVar.f24110o = nativeByteBuffer.readFloat(true);
                                h2.c cVar = gfVar.f24111p;
                                ((ce0) cVar.f13725b).c(nativeByteBuffer);
                                ((ce0) cVar.f13726c).c(nativeByteBuffer);
                                ((ce0) cVar.d).c(nativeByteBuffer);
                                ((ce0) cVar.f13727e).c(nativeByteBuffer);
                                gfVar.f24112q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    gfVar.f24113r = null;
                                } else {
                                    if (gfVar.f24113r == null) {
                                        gfVar.f24113r = new PointF();
                                    }
                                    gfVar.f24113r.x = nativeByteBuffer.readFloat(true);
                                    gfVar.f24113r.y = nativeByteBuffer.readFloat(true);
                                }
                                gfVar.f24114s = nativeByteBuffer.readFloat(true);
                                gfVar.f24115t = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() >= 4) {
                                this.F = nativeByteBuffer.readInt32(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                if (nativeByteBuffer.readInt32(true) == 481674261) {
                                    nativeByteBuffer.readInt32(true);
                                } else {
                                    throw new RuntimeException("Vector magic in StoryDraft parse error (5)");
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.G = nativeByteBuffer.readBool(true);
                                this.H = nativeByteBuffer.readInt32(true);
                                this.I = nativeByteBuffer.readInt64(true);
                                this.L = nativeByteBuffer.readInt64(true);
                                this.K = nativeByteBuffer.readInt64(true);
                                this.J = nativeByteBuffer.readInt64(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                String readString6 = nativeByteBuffer.readString(true);
                                this.f15780z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f15780z = null;
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.M = nativeByteBuffer.readBool(true);
                                int readInt327 = nativeByteBuffer.readInt32(true);
                                if (readInt327 == 1450380236) {
                                    this.N = null;
                                } else {
                                    this.N = TLRPC.TL_error.TLdeserialize(nativeByteBuffer, readInt327, true);
                                }
                                this.d = nativeByteBuffer.readString(true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -1739392570) {
                                this.O = nativeByteBuffer.readString(true);
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.Q = nativeByteBuffer.readString(true);
                                }
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.R = nativeByteBuffer.readString(true);
                                }
                                this.S = nativeByteBuffer.readInt64(true);
                                this.T = nativeByteBuffer.readInt64(true);
                                this.U = nativeByteBuffer.readFloat(true);
                                this.V = nativeByteBuffer.readFloat(true);
                                this.W = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f15757f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f15748a0 = nativeByteBuffer.readInt64(true);
                                this.f15750b0 = nativeByteBuffer.readFloat(true);
                                this.f15752c0 = nativeByteBuffer.readFloat(true);
                                this.f15753d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f15755e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f15759g0 = nativeByteBuffer.readInt64(true);
                                this.f15760h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f15762i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f15764j0 = new t(nativeByteBuffer.readString(true));
                                this.f15766k0 = new ArrayList();
                                for (int i14 = 0; i14 < this.f15764j0.f15353e.size(); i14++) {
                                    e20 e20Var = new e20();
                                    e20Var.readParams(nativeByteBuffer, true);
                                    e20Var.f23636r = (s) this.f15764j0.f15353e.get(i14);
                                    this.f15766k0.add(e20Var);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                xe xeVar = new xe();
                                this.f15770o = xeVar;
                                xeVar.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() <= 0 || (readInt32 = nativeByteBuffer.readInt32(true)) != 448771445) {
                                return;
                            }
                            this.P = TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, readInt32, true);
                            return;
                        }
                        throw new RuntimeException("Vector magic in StoryDraft parse error (4)");
                    }
                    throw new RuntimeException("Vector magic in StoryDraft parse error (3)");
                }
                throw new RuntimeException("Vector magic in StoryDraft parse error (2)");
            }
            throw new RuntimeException("Vector magic in StoryDraft parse error (1)");
        }
        throw new RuntimeException("StoryDraft parse error");
    }
}
