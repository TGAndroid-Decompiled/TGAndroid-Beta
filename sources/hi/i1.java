package hi;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.b20;
import org.telegram.messenger.c20;
import org.telegram.messenger.ff;
import org.telegram.messenger.fj;
import org.telegram.messenger.ri;
import org.telegram.messenger.we;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.be0;
public final class i1 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final ff E;
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
    public long f14617a;
    public final long f14618a0;
    public final long f14619b;
    public final float f14620b0;
    public final String f14621c;
    public final float f14622c0;
    public final String d;
    public final float f14623d0;
    public final boolean f14624e;
    public final float f14625e0;
    public final String f14626f;
    public final TLRPC.InputPeer f14627f0;
    public final boolean f14628g;
    public final long f14629g0;
    public final boolean h;
    public final String f14630h0;
    public final long f14631i;
    public final TLRPC.InputMedia f14632i0;
    public final long f14633j;
    public final c0 f14634j0;
    public final int f14635k;
    public final ArrayList f14636k0;
    public final int f14637l;
    public final int f14638m;
    public final int f14639n;
    public final we f14640o;
    public final int f14641p;
    public final int f14642q;
    public final long f14643r;
    public final float[] f14644s;
    public final int f14645t;
    public final int f14646u;
    public final String v;
    public final ArrayList f14647w;
    public final ArrayList f14648x;
    public final String f14649y;
    public final String f14650z;

    public i1(x7 x7Var) {
        float[] fArr = new float[9];
        this.f14644s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f14648x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f14623d0 = 1.0f;
        this.f14625e0 = 1.0f;
        this.f14617a = x7Var.f15736b;
        this.f14619b = x7Var.d;
        File file = x7Var.O0;
        this.f14621c = file == null ? "" : file.toString();
        File file2 = x7Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f14624e = x7Var.K;
        File file3 = x7Var.L;
        this.f14626f = file3 == null ? "" : file3.toString();
        this.f14628g = x7Var.M;
        this.h = x7Var.Y;
        float f10 = x7Var.Z;
        long j3 = x7Var.f15751h0;
        this.f14631i = f10 * ((float) j3);
        this.f14633j = x7Var.f15734a0 * ((float) j3);
        this.f14635k = x7Var.Q;
        this.f14637l = x7Var.R;
        this.f14638m = x7Var.f15757k0;
        this.f14639n = x7Var.f15759l0;
        this.f14640o = x7Var.m0;
        this.f14641p = x7Var.f15753i0;
        this.f14642q = x7Var.f15755j0;
        this.f14643r = j3;
        x7Var.f15762n0.getValues(fArr);
        this.f14645t = x7Var.A0;
        this.f14646u = x7Var.B0;
        CharSequence[] charSequenceArr = {x7Var.C0};
        this.f14647w = x7Var.D0 ? ri.d0(x7Var.f15733a).Y(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(x7Var.F0);
        File file4 = x7Var.P0;
        this.f14649y = file4 == null ? "" : file4.toString();
        File file5 = x7Var.R0;
        this.f14650z = file5 == null ? "" : file5.toString();
        this.A = x7Var.S0;
        this.B = x7Var.T0;
        this.C = x7Var.U0;
        File file6 = x7Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = x7Var.f15735a1;
        this.F = x7Var.I0;
        this.M = x7Var.f15778w;
        this.N = x7Var.f15780x;
        this.O = x7Var.f15782y;
        this.P = x7Var.f15784z;
        this.Q = x7Var.A;
        this.R = x7Var.B;
        this.S = x7Var.C;
        this.T = x7Var.D;
        this.U = x7Var.E;
        this.V = x7Var.F;
        this.W = x7Var.G;
        File file7 = x7Var.f15764o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = x7Var.f15766p0;
        this.Z = x7Var.f15768q0;
        this.f14618a0 = x7Var.f15770r0;
        this.f14620b0 = x7Var.f15772s0;
        this.f14622c0 = x7Var.f15774t0;
        this.f14623d0 = x7Var.f15776u0;
        this.f14625e0 = x7Var.P;
        this.f14627f0 = x7Var.f15777v0;
        this.f14629g0 = x7Var.J0;
        this.f14630h0 = x7Var.K0;
        this.f14632i0 = x7Var.L0;
        this.f14634j0 = x7Var.S;
        this.f14636k0 = c20.a(x7Var);
    }

    public final x7 a() {
        x7 x7Var = new x7();
        x7Var.f15736b = this.f14617a;
        x7Var.f15739c = true;
        x7Var.d = this.f14619b;
        String str = this.f14621c;
        if (!TextUtils.isEmpty(str)) {
            x7Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            x7Var.N0 = new File(str2);
        }
        x7Var.K = this.f14624e;
        String str3 = this.f14626f;
        if (str3 != null) {
            x7Var.L = new File(str3);
        }
        x7Var.M = this.f14628g;
        x7Var.Y = this.h;
        long j3 = this.f14643r;
        x7Var.f15751h0 = j3;
        if (j3 > 0) {
            x7Var.Z = ((float) this.f14631i) / ((float) j3);
            x7Var.f15734a0 = ((float) this.f14633j) / ((float) j3);
        } else {
            x7Var.Z = 0.0f;
            x7Var.f15734a0 = 1.0f;
        }
        x7Var.Q = this.f14635k;
        x7Var.R = this.f14637l;
        x7Var.f15757k0 = this.f14638m;
        x7Var.f15759l0 = this.f14639n;
        x7Var.m0 = this.f14640o;
        x7Var.f15753i0 = this.f14641p;
        x7Var.f15755j0 = this.f14642q;
        x7Var.f15762n0.setValues(this.f14644s);
        x7Var.A0 = this.f14645t;
        x7Var.B0 = this.f14646u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i7 = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.n6.f29648o2 == null) {
                org.telegram.ui.ActionBar.n6.Q();
            }
            CharSequence m10 = org.telegram.messenger.j6.m(spannableString, org.telegram.ui.ActionBar.n6.f29648o2.getFontMetricsInt(), true, null, 0);
            fj.b(m10, this.f14647w, true, false, true, false, 0);
            x7Var.C0 = fj.B5(m10, this.f14647w, org.telegram.ui.ActionBar.n6.f29648o2.getFontMetricsInt(), false);
        } else {
            x7Var.C0 = "";
        }
        ArrayList arrayList2 = x7Var.F0;
        arrayList2.clear();
        arrayList2.addAll(this.f14648x);
        String str5 = this.f14649y;
        if (str5 != null) {
            x7Var.P0 = new File(str5);
        }
        String str6 = this.f14650z;
        if (str6 != null) {
            x7Var.R0 = new File(str6);
        }
        x7Var.S0 = this.A;
        x7Var.T0 = this.B;
        x7Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            x7Var.Z0 = new File(str7);
        }
        x7Var.f15735a1 = this.E;
        x7Var.I0 = this.F;
        x7Var.f15749g = this.G;
        x7Var.f15747f = this.H;
        x7Var.f15744e = this.I;
        x7Var.J = this.L;
        x7Var.I = this.K;
        x7Var.H = this.J;
        x7Var.f15778w = this.M;
        x7Var.f15780x = this.N;
        x7Var.f15782y = this.O;
        x7Var.f15784z = this.P;
        x7Var.A = this.Q;
        x7Var.B = this.R;
        x7Var.C = this.S;
        x7Var.D = this.T;
        x7Var.E = this.U;
        x7Var.F = this.V;
        x7Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            x7Var.f15764o0 = new File(str8);
        }
        x7Var.f15766p0 = this.Y;
        x7Var.f15768q0 = this.Z;
        x7Var.f15770r0 = this.f14618a0;
        x7Var.f15772s0 = this.f14620b0;
        x7Var.f15774t0 = this.f14622c0;
        x7Var.f15776u0 = this.f14623d0;
        x7Var.P = this.f14625e0;
        x7Var.f15777v0 = this.f14627f0;
        x7Var.J0 = this.f14629g0;
        x7Var.K0 = this.f14630h0;
        x7Var.L0 = this.f14632i0;
        x7Var.S = this.f14634j0;
        int i10 = c20.C;
        ArrayList arrayList3 = this.f14636k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                i7++;
                c20 c20Var = (c20) obj;
                x7 x7Var2 = new x7();
                x7Var2.K = c20Var.f23355b;
                x7Var2.Y = c20Var.f23356c;
                x7Var2.L = new File(c20Var.d);
                x7Var2.P = c20Var.f23357e;
                x7Var2.U = c20Var.f23359i;
                x7Var2.X = c20Var.f23358f;
                x7Var2.V = c20Var.f23360j;
                x7Var2.W = c20Var.f23361k;
                x7Var2.f15757k0 = c20Var.f23362l;
                x7Var2.f15759l0 = c20Var.f23363m;
                x7Var2.f15751h0 = c20Var.f23364o;
                arrayList.add(x7Var2);
            }
        }
        x7Var.T = arrayList;
        return x7Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f14619b);
        nativeByteBuffer.writeString(this.f14621c);
        nativeByteBuffer.writeBool(this.f14624e);
        nativeByteBuffer.writeString(this.f14626f);
        nativeByteBuffer.writeBool(this.f14628g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f14631i);
        nativeByteBuffer.writeInt64(this.f14633j);
        nativeByteBuffer.writeInt32(this.f14635k);
        nativeByteBuffer.writeInt32(this.f14637l);
        nativeByteBuffer.writeInt32(this.f14638m);
        nativeByteBuffer.writeInt32(this.f14639n);
        nativeByteBuffer.writeInt32(this.f14641p);
        nativeByteBuffer.writeInt32(this.f14642q);
        nativeByteBuffer.writeInt64(this.f14643r);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f14644s;
            if (i10 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i10]);
            i10++;
        }
        nativeByteBuffer.writeInt32(this.f14645t);
        nativeByteBuffer.writeInt32(this.f14646u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f14647w;
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
        ArrayList arrayList3 = this.f14648x;
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
        nativeByteBuffer.writeString(this.f14649y);
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
                ((b20) arrayList4.get(i13)).b(nativeByteBuffer, true);
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
        ff ffVar = this.E;
        if (ffVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            nativeByteBuffer.writeFloat(ffVar.f23994a);
            nativeByteBuffer.writeFloat(ffVar.f23995b);
            nativeByteBuffer.writeFloat(ffVar.f23996c);
            nativeByteBuffer.writeFloat(ffVar.d);
            nativeByteBuffer.writeFloat(ffVar.f23997e);
            nativeByteBuffer.writeFloat(ffVar.f23998f);
            nativeByteBuffer.writeFloat(ffVar.f23999g);
            nativeByteBuffer.writeInt32(ffVar.h);
            nativeByteBuffer.writeInt32(ffVar.f24000i);
            nativeByteBuffer.writeFloat(ffVar.f24001j);
            nativeByteBuffer.writeFloat(ffVar.f24002k);
            nativeByteBuffer.writeFloat(ffVar.f24003l);
            nativeByteBuffer.writeFloat(ffVar.f24004m);
            nativeByteBuffer.writeInt32(ffVar.f24005n);
            nativeByteBuffer.writeFloat(ffVar.f24006o);
            h2.c cVar = ffVar.f24007p;
            ((be0) cVar.f13725b).d(nativeByteBuffer);
            ((be0) cVar.f13726c).d(nativeByteBuffer);
            ((be0) cVar.d).d(nativeByteBuffer);
            ((be0) cVar.f13727e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(ffVar.f24008q);
            if (ffVar.f24009r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(ffVar.f24009r.x);
                nativeByteBuffer.writeFloat(ffVar.f24009r.y);
            }
            nativeByteBuffer.writeFloat(ffVar.f24010s);
            nativeByteBuffer.writeFloat(ffVar.f24011t);
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
        nativeByteBuffer.writeString(this.f14650z);
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
        TLRPC.InputPeer inputPeer = this.f14627f0;
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
            nativeByteBuffer.writeInt64(this.f14618a0);
            nativeByteBuffer.writeFloat(this.f14620b0);
            nativeByteBuffer.writeFloat(this.f14622c0);
            nativeByteBuffer.writeFloat(this.f14623d0);
        }
        nativeByteBuffer.writeFloat(this.f14625e0);
        nativeByteBuffer.writeInt64(this.f14629g0);
        String str7 = this.f14630h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f14632i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        c0 c0Var = this.f14634j0;
        if (c0Var != null && c0Var.f14250e.size() > 1 && (arrayList = this.f14636k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(c0Var.f14247a);
            int size5 = arrayList.size();
            while (i7 < size5) {
                Object obj = arrayList.get(i7);
                i7++;
                ((c20) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        we weVar = this.f14640o;
        if (weVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            weVar.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public i1(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.f14644s = new float[9];
        this.f14648x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f14623d0 = 1.0f;
        this.f14625e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f14619b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f14621c = readString;
            if (readString != null && readString.length() == 0) {
                this.f14621c = null;
            }
            this.f14624e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f14626f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f14626f = null;
            }
            this.f14628g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f14631i = nativeByteBuffer.readInt64(true);
            this.f14633j = nativeByteBuffer.readInt64(true);
            this.f14635k = nativeByteBuffer.readInt32(true);
            this.f14637l = nativeByteBuffer.readInt32(true);
            this.f14638m = nativeByteBuffer.readInt32(true);
            this.f14639n = nativeByteBuffer.readInt32(true);
            this.f14641p = nativeByteBuffer.readInt32(true);
            this.f14642q = nativeByteBuffer.readInt32(true);
            this.f14643r = nativeByteBuffer.readInt64(true);
            int i7 = 0;
            while (true) {
                float[] fArr = this.f14644s;
                if (i7 >= fArr.length) {
                    break;
                }
                fArr[i7] = nativeByteBuffer.readFloat(true);
                i7++;
            }
            this.f14645t = nativeByteBuffer.readInt32(true);
            this.f14646u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i10 = 0; i10 < readInt322; i10++) {
                    if (this.f14647w == null) {
                        this.f14647w = new ArrayList();
                    }
                    this.f14647w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f14648x.clear();
                    for (int i11 = 0; i11 < readInt323; i11++) {
                        this.f14648x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f14649y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f14649y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i12 = 0; i12 < readInt324; i12++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new b20(nativeByteBuffer, true, true));
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
                                ff ffVar = new ff();
                                this.E = ffVar;
                                ffVar.f23994a = nativeByteBuffer.readFloat(true);
                                ffVar.f23995b = nativeByteBuffer.readFloat(true);
                                ffVar.f23996c = nativeByteBuffer.readFloat(true);
                                ffVar.d = nativeByteBuffer.readFloat(true);
                                ffVar.f23997e = nativeByteBuffer.readFloat(true);
                                ffVar.f23998f = nativeByteBuffer.readFloat(true);
                                ffVar.f23999g = nativeByteBuffer.readFloat(true);
                                ffVar.h = nativeByteBuffer.readInt32(true);
                                ffVar.f24000i = nativeByteBuffer.readInt32(true);
                                ffVar.f24001j = nativeByteBuffer.readFloat(true);
                                ffVar.f24002k = nativeByteBuffer.readFloat(true);
                                ffVar.f24003l = nativeByteBuffer.readFloat(true);
                                ffVar.f24004m = nativeByteBuffer.readFloat(true);
                                ffVar.f24005n = nativeByteBuffer.readInt32(true);
                                ffVar.f24006o = nativeByteBuffer.readFloat(true);
                                h2.c cVar = ffVar.f24007p;
                                ((be0) cVar.f13725b).c(nativeByteBuffer);
                                ((be0) cVar.f13726c).c(nativeByteBuffer);
                                ((be0) cVar.d).c(nativeByteBuffer);
                                ((be0) cVar.f13727e).c(nativeByteBuffer);
                                ffVar.f24008q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    ffVar.f24009r = null;
                                } else {
                                    if (ffVar.f24009r == null) {
                                        ffVar.f24009r = new PointF();
                                    }
                                    ffVar.f24009r.x = nativeByteBuffer.readFloat(true);
                                    ffVar.f24009r.y = nativeByteBuffer.readFloat(true);
                                }
                                ffVar.f24010s = nativeByteBuffer.readFloat(true);
                                ffVar.f24011t = nativeByteBuffer.readFloat(true);
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
                                this.f14650z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f14650z = null;
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
                                this.f14627f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f14618a0 = nativeByteBuffer.readInt64(true);
                                this.f14620b0 = nativeByteBuffer.readFloat(true);
                                this.f14622c0 = nativeByteBuffer.readFloat(true);
                                this.f14623d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f14625e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f14629g0 = nativeByteBuffer.readInt64(true);
                                this.f14630h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f14632i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f14634j0 = new c0(nativeByteBuffer.readString(true));
                                this.f14636k0 = new ArrayList();
                                for (int i14 = 0; i14 < this.f14634j0.f14250e.size(); i14++) {
                                    c20 c20Var = new c20();
                                    c20Var.readParams(nativeByteBuffer, true);
                                    c20Var.f23365r = (b0) this.f14634j0.f14250e.get(i14);
                                    this.f14636k0.add(c20Var);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                we weVar = new we();
                                this.f14640o = weVar;
                                weVar.readParams(nativeByteBuffer, true);
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
