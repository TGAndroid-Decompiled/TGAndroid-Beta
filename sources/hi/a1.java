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
public final class a1 {
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
    public long f14210a;
    public final long f14211a0;
    public final long f14212b;
    public final float f14213b0;
    public final String f14214c;
    public final float f14215c0;
    public final String d;
    public final float f14216d0;
    public final boolean f14217e;
    public final float f14218e0;
    public final String f14219f;
    public final TLRPC.InputPeer f14220f0;
    public final boolean f14221g;
    public final long f14222g0;
    public final boolean h;
    public final String f14223h0;
    public final long f14224i;
    public final TLRPC.InputMedia f14225i0;
    public final long f14226j;
    public final v f14227j0;
    public final int f14228k;
    public final ArrayList f14229k0;
    public final int f14230l;
    public final int f14231m;
    public final int f14232n;
    public final xe f14233o;
    public final int f14234p;
    public final int f14235q;
    public final long f14236r;
    public final float[] f14237s;
    public final int f14238t;
    public final int f14239u;
    public final String v;
    public final ArrayList f14240w;
    public final ArrayList f14241x;
    public final String f14242y;
    public final String f14243z;

    public a1(c7 c7Var) {
        float[] fArr = new float[9];
        this.f14237s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f14241x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f14216d0 = 1.0f;
        this.f14218e0 = 1.0f;
        this.f14210a = c7Var.f14341b;
        this.f14212b = c7Var.d;
        File file = c7Var.O0;
        this.f14214c = file == null ? "" : file.toString();
        File file2 = c7Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f14217e = c7Var.K;
        File file3 = c7Var.L;
        this.f14219f = file3 == null ? "" : file3.toString();
        this.f14221g = c7Var.M;
        this.h = c7Var.Y;
        float f10 = c7Var.Z;
        long j3 = c7Var.f14356h0;
        this.f14224i = f10 * ((float) j3);
        this.f14226j = c7Var.f14339a0 * ((float) j3);
        this.f14228k = c7Var.Q;
        this.f14230l = c7Var.R;
        this.f14231m = c7Var.f14362k0;
        this.f14232n = c7Var.f14364l0;
        this.f14233o = c7Var.m0;
        this.f14234p = c7Var.f14358i0;
        this.f14235q = c7Var.f14360j0;
        this.f14236r = j3;
        c7Var.f14367n0.getValues(fArr);
        this.f14238t = c7Var.A0;
        this.f14239u = c7Var.B0;
        CharSequence[] charSequenceArr = {c7Var.C0};
        this.f14240w = c7Var.D0 ? si.d0(c7Var.f14338a).Y(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(c7Var.F0);
        File file4 = c7Var.P0;
        this.f14242y = file4 == null ? "" : file4.toString();
        File file5 = c7Var.R0;
        this.f14243z = file5 == null ? "" : file5.toString();
        this.A = c7Var.S0;
        this.B = c7Var.T0;
        this.C = c7Var.U0;
        File file6 = c7Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = c7Var.f14340a1;
        this.F = c7Var.I0;
        this.M = c7Var.f14383w;
        this.N = c7Var.f14385x;
        this.O = c7Var.f14387y;
        this.P = c7Var.f14389z;
        this.Q = c7Var.A;
        this.R = c7Var.B;
        this.S = c7Var.C;
        this.T = c7Var.D;
        this.U = c7Var.E;
        this.V = c7Var.F;
        this.W = c7Var.G;
        File file7 = c7Var.f14369o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = c7Var.f14371p0;
        this.Z = c7Var.f14373q0;
        this.f14211a0 = c7Var.f14375r0;
        this.f14213b0 = c7Var.f14377s0;
        this.f14215c0 = c7Var.f14379t0;
        this.f14216d0 = c7Var.f14381u0;
        this.f14218e0 = c7Var.P;
        this.f14220f0 = c7Var.f14382v0;
        this.f14222g0 = c7Var.J0;
        this.f14223h0 = c7Var.K0;
        this.f14225i0 = c7Var.L0;
        this.f14227j0 = c7Var.S;
        this.f14229k0 = e20.a(c7Var);
    }

    public final c7 a() {
        c7 c7Var = new c7();
        c7Var.f14341b = this.f14210a;
        c7Var.f14344c = true;
        c7Var.d = this.f14212b;
        String str = this.f14214c;
        if (!TextUtils.isEmpty(str)) {
            c7Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            c7Var.N0 = new File(str2);
        }
        c7Var.K = this.f14217e;
        String str3 = this.f14219f;
        if (str3 != null) {
            c7Var.L = new File(str3);
        }
        c7Var.M = this.f14221g;
        c7Var.Y = this.h;
        long j3 = this.f14236r;
        c7Var.f14356h0 = j3;
        if (j3 > 0) {
            c7Var.Z = ((float) this.f14224i) / ((float) j3);
            c7Var.f14339a0 = ((float) this.f14226j) / ((float) j3);
        } else {
            c7Var.Z = 0.0f;
            c7Var.f14339a0 = 1.0f;
        }
        c7Var.Q = this.f14228k;
        c7Var.R = this.f14230l;
        c7Var.f14362k0 = this.f14231m;
        c7Var.f14364l0 = this.f14232n;
        c7Var.m0 = this.f14233o;
        c7Var.f14358i0 = this.f14234p;
        c7Var.f14360j0 = this.f14235q;
        c7Var.f14367n0.setValues(this.f14237s);
        c7Var.A0 = this.f14238t;
        c7Var.B0 = this.f14239u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i7 = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.m6.f29578o2 == null) {
                org.telegram.ui.ActionBar.m6.Q();
            }
            CharSequence m10 = org.telegram.messenger.j6.m(spannableString, org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), true, null, 0);
            gj.b(m10, this.f14240w, true, false, true, false, 0);
            c7Var.C0 = gj.B5(m10, this.f14240w, org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), false);
        } else {
            c7Var.C0 = "";
        }
        ArrayList arrayList2 = c7Var.F0;
        arrayList2.clear();
        arrayList2.addAll(this.f14241x);
        String str5 = this.f14242y;
        if (str5 != null) {
            c7Var.P0 = new File(str5);
        }
        String str6 = this.f14243z;
        if (str6 != null) {
            c7Var.R0 = new File(str6);
        }
        c7Var.S0 = this.A;
        c7Var.T0 = this.B;
        c7Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            c7Var.Z0 = new File(str7);
        }
        c7Var.f14340a1 = this.E;
        c7Var.I0 = this.F;
        c7Var.f14354g = this.G;
        c7Var.f14352f = this.H;
        c7Var.f14349e = this.I;
        c7Var.J = this.L;
        c7Var.I = this.K;
        c7Var.H = this.J;
        c7Var.f14383w = this.M;
        c7Var.f14385x = this.N;
        c7Var.f14387y = this.O;
        c7Var.f14389z = this.P;
        c7Var.A = this.Q;
        c7Var.B = this.R;
        c7Var.C = this.S;
        c7Var.D = this.T;
        c7Var.E = this.U;
        c7Var.F = this.V;
        c7Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            c7Var.f14369o0 = new File(str8);
        }
        c7Var.f14371p0 = this.Y;
        c7Var.f14373q0 = this.Z;
        c7Var.f14375r0 = this.f14211a0;
        c7Var.f14377s0 = this.f14213b0;
        c7Var.f14379t0 = this.f14215c0;
        c7Var.f14381u0 = this.f14216d0;
        c7Var.P = this.f14218e0;
        c7Var.f14382v0 = this.f14220f0;
        c7Var.J0 = this.f14222g0;
        c7Var.K0 = this.f14223h0;
        c7Var.L0 = this.f14225i0;
        c7Var.S = this.f14227j0;
        int i10 = e20.C;
        ArrayList arrayList3 = this.f14229k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                i7++;
                e20 e20Var = (e20) obj;
                c7 c7Var2 = new c7();
                c7Var2.K = e20Var.f23662b;
                c7Var2.Y = e20Var.f23663c;
                c7Var2.L = new File(e20Var.d);
                c7Var2.P = e20Var.f23664e;
                c7Var2.U = e20Var.f23666i;
                c7Var2.X = e20Var.f23665f;
                c7Var2.V = e20Var.f23667j;
                c7Var2.W = e20Var.f23668k;
                c7Var2.f14362k0 = e20Var.f23669l;
                c7Var2.f14364l0 = e20Var.f23670m;
                c7Var2.f14356h0 = e20Var.f23671o;
                arrayList.add(c7Var2);
            }
        }
        c7Var.T = arrayList;
        return c7Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f14212b);
        nativeByteBuffer.writeString(this.f14214c);
        nativeByteBuffer.writeBool(this.f14217e);
        nativeByteBuffer.writeString(this.f14219f);
        nativeByteBuffer.writeBool(this.f14221g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f14224i);
        nativeByteBuffer.writeInt64(this.f14226j);
        nativeByteBuffer.writeInt32(this.f14228k);
        nativeByteBuffer.writeInt32(this.f14230l);
        nativeByteBuffer.writeInt32(this.f14231m);
        nativeByteBuffer.writeInt32(this.f14232n);
        nativeByteBuffer.writeInt32(this.f14234p);
        nativeByteBuffer.writeInt32(this.f14235q);
        nativeByteBuffer.writeInt64(this.f14236r);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f14237s;
            if (i10 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i10]);
            i10++;
        }
        nativeByteBuffer.writeInt32(this.f14238t);
        nativeByteBuffer.writeInt32(this.f14239u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f14240w;
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
        ArrayList arrayList3 = this.f14241x;
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
        nativeByteBuffer.writeString(this.f14242y);
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
            nativeByteBuffer.writeFloat(gfVar.f24134a);
            nativeByteBuffer.writeFloat(gfVar.f24135b);
            nativeByteBuffer.writeFloat(gfVar.f24136c);
            nativeByteBuffer.writeFloat(gfVar.d);
            nativeByteBuffer.writeFloat(gfVar.f24137e);
            nativeByteBuffer.writeFloat(gfVar.f24138f);
            nativeByteBuffer.writeFloat(gfVar.f24139g);
            nativeByteBuffer.writeInt32(gfVar.h);
            nativeByteBuffer.writeInt32(gfVar.f24140i);
            nativeByteBuffer.writeFloat(gfVar.f24141j);
            nativeByteBuffer.writeFloat(gfVar.f24142k);
            nativeByteBuffer.writeFloat(gfVar.f24143l);
            nativeByteBuffer.writeFloat(gfVar.f24144m);
            nativeByteBuffer.writeInt32(gfVar.f24145n);
            nativeByteBuffer.writeFloat(gfVar.f24146o);
            h2.c cVar = gfVar.f24147p;
            ((ce0) cVar.f13762b).d(nativeByteBuffer);
            ((ce0) cVar.f13763c).d(nativeByteBuffer);
            ((ce0) cVar.d).d(nativeByteBuffer);
            ((ce0) cVar.f13764e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(gfVar.f24148q);
            if (gfVar.f24149r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(gfVar.f24149r.x);
                nativeByteBuffer.writeFloat(gfVar.f24149r.y);
            }
            nativeByteBuffer.writeFloat(gfVar.f24150s);
            nativeByteBuffer.writeFloat(gfVar.f24151t);
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
        nativeByteBuffer.writeString(this.f14243z);
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
        TLRPC.InputPeer inputPeer = this.f14220f0;
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
            nativeByteBuffer.writeInt64(this.f14211a0);
            nativeByteBuffer.writeFloat(this.f14213b0);
            nativeByteBuffer.writeFloat(this.f14215c0);
            nativeByteBuffer.writeFloat(this.f14216d0);
        }
        nativeByteBuffer.writeFloat(this.f14218e0);
        nativeByteBuffer.writeInt64(this.f14222g0);
        String str7 = this.f14223h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f14225i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        v vVar = this.f14227j0;
        if (vVar != null && vVar.f15591e.size() > 1 && (arrayList = this.f14229k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(vVar.f15588a);
            int size5 = arrayList.size();
            while (i7 < size5) {
                Object obj = arrayList.get(i7);
                i7++;
                ((e20) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        xe xeVar = this.f14233o;
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

    public a1(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.f14237s = new float[9];
        this.f14241x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f14216d0 = 1.0f;
        this.f14218e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f14212b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f14214c = readString;
            if (readString != null && readString.length() == 0) {
                this.f14214c = null;
            }
            this.f14217e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f14219f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f14219f = null;
            }
            this.f14221g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f14224i = nativeByteBuffer.readInt64(true);
            this.f14226j = nativeByteBuffer.readInt64(true);
            this.f14228k = nativeByteBuffer.readInt32(true);
            this.f14230l = nativeByteBuffer.readInt32(true);
            this.f14231m = nativeByteBuffer.readInt32(true);
            this.f14232n = nativeByteBuffer.readInt32(true);
            this.f14234p = nativeByteBuffer.readInt32(true);
            this.f14235q = nativeByteBuffer.readInt32(true);
            this.f14236r = nativeByteBuffer.readInt64(true);
            int i7 = 0;
            while (true) {
                float[] fArr = this.f14237s;
                if (i7 >= fArr.length) {
                    break;
                }
                fArr[i7] = nativeByteBuffer.readFloat(true);
                i7++;
            }
            this.f14238t = nativeByteBuffer.readInt32(true);
            this.f14239u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i10 = 0; i10 < readInt322; i10++) {
                    if (this.f14240w == null) {
                        this.f14240w = new ArrayList();
                    }
                    this.f14240w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f14241x.clear();
                    for (int i11 = 0; i11 < readInt323; i11++) {
                        this.f14241x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f14242y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f14242y = null;
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
                                gfVar.f24134a = nativeByteBuffer.readFloat(true);
                                gfVar.f24135b = nativeByteBuffer.readFloat(true);
                                gfVar.f24136c = nativeByteBuffer.readFloat(true);
                                gfVar.d = nativeByteBuffer.readFloat(true);
                                gfVar.f24137e = nativeByteBuffer.readFloat(true);
                                gfVar.f24138f = nativeByteBuffer.readFloat(true);
                                gfVar.f24139g = nativeByteBuffer.readFloat(true);
                                gfVar.h = nativeByteBuffer.readInt32(true);
                                gfVar.f24140i = nativeByteBuffer.readInt32(true);
                                gfVar.f24141j = nativeByteBuffer.readFloat(true);
                                gfVar.f24142k = nativeByteBuffer.readFloat(true);
                                gfVar.f24143l = nativeByteBuffer.readFloat(true);
                                gfVar.f24144m = nativeByteBuffer.readFloat(true);
                                gfVar.f24145n = nativeByteBuffer.readInt32(true);
                                gfVar.f24146o = nativeByteBuffer.readFloat(true);
                                h2.c cVar = gfVar.f24147p;
                                ((ce0) cVar.f13762b).c(nativeByteBuffer);
                                ((ce0) cVar.f13763c).c(nativeByteBuffer);
                                ((ce0) cVar.d).c(nativeByteBuffer);
                                ((ce0) cVar.f13764e).c(nativeByteBuffer);
                                gfVar.f24148q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    gfVar.f24149r = null;
                                } else {
                                    if (gfVar.f24149r == null) {
                                        gfVar.f24149r = new PointF();
                                    }
                                    gfVar.f24149r.x = nativeByteBuffer.readFloat(true);
                                    gfVar.f24149r.y = nativeByteBuffer.readFloat(true);
                                }
                                gfVar.f24150s = nativeByteBuffer.readFloat(true);
                                gfVar.f24151t = nativeByteBuffer.readFloat(true);
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
                                this.f14243z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f14243z = null;
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
                                this.f14220f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f14211a0 = nativeByteBuffer.readInt64(true);
                                this.f14213b0 = nativeByteBuffer.readFloat(true);
                                this.f14215c0 = nativeByteBuffer.readFloat(true);
                                this.f14216d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f14218e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f14222g0 = nativeByteBuffer.readInt64(true);
                                this.f14223h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f14225i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f14227j0 = new v(nativeByteBuffer.readString(true));
                                this.f14229k0 = new ArrayList();
                                for (int i14 = 0; i14 < this.f14227j0.f15591e.size(); i14++) {
                                    e20 e20Var = new e20();
                                    e20Var.readParams(nativeByteBuffer, true);
                                    e20Var.f23672r = (u) this.f14227j0.f15591e.get(i14);
                                    this.f14229k0.add(e20Var);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                xe xeVar = new xe();
                                this.f14233o = xeVar;
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
