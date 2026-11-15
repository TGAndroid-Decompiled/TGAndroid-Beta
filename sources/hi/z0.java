package hi;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.e20;
import org.telegram.messenger.f20;
import org.telegram.messenger.gf;
import org.telegram.messenger.gj;
import org.telegram.messenger.si;
import org.telegram.messenger.xe;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rd0;
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
    public long f15443a;
    public final long f15444a0;
    public final long f15445b;
    public final float f15446b0;
    public final String f15447c;
    public final float f15448c0;
    public final String d;
    public final float f15449d0;
    public final boolean f15450e;
    public final float f15451e0;
    public final String f15452f;
    public final TLRPC.InputPeer f15453f0;
    public final boolean f15454g;
    public final long f15455g0;
    public final boolean h;
    public final String f15456h0;
    public final long f15457i;
    public final TLRPC.InputMedia f15458i0;
    public final long f15459j;
    public final t f15460j0;
    public final int f15461k;
    public final ArrayList f15462k0;
    public final int f15463l;
    public final int f15464m;
    public final int f15465n;
    public final xe f15466o;
    public final int f15467p;
    public final int f15468q;
    public final long f15469r;
    public final float[] f15470s;
    public final int f15471t;
    public final int f15472u;
    public final String v;
    public final ArrayList f15473w;
    public final ArrayList f15474x;
    public final String f15475y;
    public final String f15476z;

    public z0(d7 d7Var) {
        float[] fArr = new float[9];
        this.f15470s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f15474x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f15449d0 = 1.0f;
        this.f15451e0 = 1.0f;
        this.f15443a = d7Var.f14126b;
        this.f15445b = d7Var.d;
        File file = d7Var.O0;
        this.f15447c = file == null ? "" : file.toString();
        File file2 = d7Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f15450e = d7Var.K;
        File file3 = d7Var.L;
        this.f15452f = file3 == null ? "" : file3.toString();
        this.f15454g = d7Var.M;
        this.h = d7Var.Y;
        float f10 = d7Var.Z;
        long j3 = d7Var.f14141h0;
        this.f15457i = f10 * ((float) j3);
        this.f15459j = d7Var.f14124a0 * ((float) j3);
        this.f15461k = d7Var.Q;
        this.f15463l = d7Var.R;
        this.f15464m = d7Var.f14147k0;
        this.f15465n = d7Var.f14149l0;
        this.f15466o = d7Var.m0;
        this.f15467p = d7Var.f14143i0;
        this.f15468q = d7Var.f14145j0;
        this.f15469r = j3;
        d7Var.f14152n0.getValues(fArr);
        this.f15471t = d7Var.A0;
        this.f15472u = d7Var.B0;
        CharSequence[] charSequenceArr = {d7Var.C0};
        this.f15473w = d7Var.D0 ? si.b0(d7Var.f14123a).W(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(d7Var.F0);
        File file4 = d7Var.P0;
        this.f15475y = file4 == null ? "" : file4.toString();
        File file5 = d7Var.R0;
        this.f15476z = file5 == null ? "" : file5.toString();
        this.A = d7Var.S0;
        this.B = d7Var.T0;
        this.C = d7Var.U0;
        File file6 = d7Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = d7Var.f14125a1;
        this.F = d7Var.I0;
        this.M = d7Var.f14168w;
        this.N = d7Var.f14170x;
        this.O = d7Var.f14172y;
        this.P = d7Var.f14174z;
        this.Q = d7Var.A;
        this.R = d7Var.B;
        this.S = d7Var.C;
        this.T = d7Var.D;
        this.U = d7Var.E;
        this.V = d7Var.F;
        this.W = d7Var.G;
        File file7 = d7Var.f14154o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = d7Var.f14156p0;
        this.Z = d7Var.f14158q0;
        this.f15444a0 = d7Var.f14160r0;
        this.f15446b0 = d7Var.f14162s0;
        this.f15448c0 = d7Var.f14164t0;
        this.f15449d0 = d7Var.f14166u0;
        this.f15451e0 = d7Var.P;
        this.f15453f0 = d7Var.f14167v0;
        this.f15455g0 = d7Var.J0;
        this.f15456h0 = d7Var.K0;
        this.f15458i0 = d7Var.L0;
        this.f15460j0 = d7Var.S;
        this.f15462k0 = f20.a(d7Var);
    }

    public final d7 a() {
        d7 d7Var = new d7();
        d7Var.f14126b = this.f15443a;
        d7Var.f14129c = true;
        d7Var.d = this.f15445b;
        String str = this.f15447c;
        if (!TextUtils.isEmpty(str)) {
            d7Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            d7Var.N0 = new File(str2);
        }
        d7Var.K = this.f15450e;
        String str3 = this.f15452f;
        if (str3 != null) {
            d7Var.L = new File(str3);
        }
        d7Var.M = this.f15454g;
        d7Var.Y = this.h;
        long j3 = this.f15469r;
        d7Var.f14141h0 = j3;
        if (j3 > 0) {
            d7Var.Z = ((float) this.f15457i) / ((float) j3);
            d7Var.f14124a0 = ((float) this.f15459j) / ((float) j3);
        } else {
            d7Var.Z = 0.0f;
            d7Var.f14124a0 = 1.0f;
        }
        d7Var.Q = this.f15461k;
        d7Var.R = this.f15463l;
        d7Var.f14147k0 = this.f15464m;
        d7Var.f14149l0 = this.f15465n;
        d7Var.m0 = this.f15466o;
        d7Var.f14143i0 = this.f15467p;
        d7Var.f14145j0 = this.f15468q;
        d7Var.f14152n0.setValues(this.f15470s);
        d7Var.A0 = this.f15471t;
        d7Var.B0 = this.f15472u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i7 = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.j6.f29046o2 == null) {
                org.telegram.ui.ActionBar.j6.Q();
            }
            CharSequence m10 = org.telegram.messenger.j6.m(spannableString, org.telegram.ui.ActionBar.j6.f29046o2.getFontMetricsInt(), true, null, 0);
            gj.b(m10, this.f15473w, true, false, true, false, 0);
            d7Var.C0 = gj.B5(m10, this.f15473w, org.telegram.ui.ActionBar.j6.f29046o2.getFontMetricsInt(), false);
        } else {
            d7Var.C0 = "";
        }
        ArrayList arrayList2 = d7Var.F0;
        arrayList2.clear();
        arrayList2.addAll(this.f15474x);
        String str5 = this.f15475y;
        if (str5 != null) {
            d7Var.P0 = new File(str5);
        }
        String str6 = this.f15476z;
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
        d7Var.f14125a1 = this.E;
        d7Var.I0 = this.F;
        d7Var.f14139g = this.G;
        d7Var.f14137f = this.H;
        d7Var.f14134e = this.I;
        d7Var.J = this.L;
        d7Var.I = this.K;
        d7Var.H = this.J;
        d7Var.f14168w = this.M;
        d7Var.f14170x = this.N;
        d7Var.f14172y = this.O;
        d7Var.f14174z = this.P;
        d7Var.A = this.Q;
        d7Var.B = this.R;
        d7Var.C = this.S;
        d7Var.D = this.T;
        d7Var.E = this.U;
        d7Var.F = this.V;
        d7Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            d7Var.f14154o0 = new File(str8);
        }
        d7Var.f14156p0 = this.Y;
        d7Var.f14158q0 = this.Z;
        d7Var.f14160r0 = this.f15444a0;
        d7Var.f14162s0 = this.f15446b0;
        d7Var.f14164t0 = this.f15448c0;
        d7Var.f14166u0 = this.f15449d0;
        d7Var.P = this.f15451e0;
        d7Var.f14167v0 = this.f15453f0;
        d7Var.J0 = this.f15455g0;
        d7Var.K0 = this.f15456h0;
        d7Var.L0 = this.f15458i0;
        d7Var.S = this.f15460j0;
        int i10 = f20.C;
        ArrayList arrayList3 = this.f15462k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                i7++;
                f20 f20Var = (f20) obj;
                d7 d7Var2 = new d7();
                d7Var2.K = f20Var.f23420b;
                d7Var2.Y = f20Var.f23421c;
                d7Var2.L = new File(f20Var.d);
                d7Var2.P = f20Var.f23422e;
                d7Var2.U = f20Var.f23424i;
                d7Var2.X = f20Var.f23423f;
                d7Var2.V = f20Var.f23425j;
                d7Var2.W = f20Var.f23426k;
                d7Var2.f14147k0 = f20Var.f23427l;
                d7Var2.f14149l0 = f20Var.f23428m;
                d7Var2.f14141h0 = f20Var.f23429o;
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
        nativeByteBuffer.writeInt64(this.f15445b);
        nativeByteBuffer.writeString(this.f15447c);
        nativeByteBuffer.writeBool(this.f15450e);
        nativeByteBuffer.writeString(this.f15452f);
        nativeByteBuffer.writeBool(this.f15454g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f15457i);
        nativeByteBuffer.writeInt64(this.f15459j);
        nativeByteBuffer.writeInt32(this.f15461k);
        nativeByteBuffer.writeInt32(this.f15463l);
        nativeByteBuffer.writeInt32(this.f15464m);
        nativeByteBuffer.writeInt32(this.f15465n);
        nativeByteBuffer.writeInt32(this.f15467p);
        nativeByteBuffer.writeInt32(this.f15468q);
        nativeByteBuffer.writeInt64(this.f15469r);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f15470s;
            if (i10 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i10]);
            i10++;
        }
        nativeByteBuffer.writeInt32(this.f15471t);
        nativeByteBuffer.writeInt32(this.f15472u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f15473w;
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
        ArrayList arrayList3 = this.f15474x;
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
        nativeByteBuffer.writeString(this.f15475y);
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
                ((e20) arrayList4.get(i13)).b(nativeByteBuffer, true);
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
            nativeByteBuffer.writeFloat(gfVar.f23733a);
            nativeByteBuffer.writeFloat(gfVar.f23734b);
            nativeByteBuffer.writeFloat(gfVar.f23735c);
            nativeByteBuffer.writeFloat(gfVar.d);
            nativeByteBuffer.writeFloat(gfVar.f23736e);
            nativeByteBuffer.writeFloat(gfVar.f23737f);
            nativeByteBuffer.writeFloat(gfVar.f23738g);
            nativeByteBuffer.writeInt32(gfVar.h);
            nativeByteBuffer.writeInt32(gfVar.f23739i);
            nativeByteBuffer.writeFloat(gfVar.f23740j);
            nativeByteBuffer.writeFloat(gfVar.f23741k);
            nativeByteBuffer.writeFloat(gfVar.f23742l);
            nativeByteBuffer.writeFloat(gfVar.f23743m);
            nativeByteBuffer.writeInt32(gfVar.f23744n);
            nativeByteBuffer.writeFloat(gfVar.f23745o);
            h2.c cVar = gfVar.f23746p;
            ((rd0) cVar.f13418b).d(nativeByteBuffer);
            ((rd0) cVar.f13419c).d(nativeByteBuffer);
            ((rd0) cVar.d).d(nativeByteBuffer);
            ((rd0) cVar.f13420e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(gfVar.f23747q);
            if (gfVar.f23748r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(gfVar.f23748r.x);
                nativeByteBuffer.writeFloat(gfVar.f23748r.y);
            }
            nativeByteBuffer.writeFloat(gfVar.f23749s);
            nativeByteBuffer.writeFloat(gfVar.f23750t);
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
        nativeByteBuffer.writeString(this.f15476z);
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
        TLRPC.InputPeer inputPeer = this.f15453f0;
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
            nativeByteBuffer.writeInt64(this.f15444a0);
            nativeByteBuffer.writeFloat(this.f15446b0);
            nativeByteBuffer.writeFloat(this.f15448c0);
            nativeByteBuffer.writeFloat(this.f15449d0);
        }
        nativeByteBuffer.writeFloat(this.f15451e0);
        nativeByteBuffer.writeInt64(this.f15455g0);
        String str7 = this.f15456h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f15458i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.f15460j0;
        if (tVar != null && tVar.f15124e.size() > 1 && (arrayList = this.f15462k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.f15121a);
            int size5 = arrayList.size();
            while (i7 < size5) {
                Object obj = arrayList.get(i7);
                i7++;
                ((f20) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        xe xeVar = this.f15466o;
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
        this.f15470s = new float[9];
        this.f15474x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f15449d0 = 1.0f;
        this.f15451e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f15445b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f15447c = readString;
            if (readString != null && readString.length() == 0) {
                this.f15447c = null;
            }
            this.f15450e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f15452f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f15452f = null;
            }
            this.f15454g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f15457i = nativeByteBuffer.readInt64(true);
            this.f15459j = nativeByteBuffer.readInt64(true);
            this.f15461k = nativeByteBuffer.readInt32(true);
            this.f15463l = nativeByteBuffer.readInt32(true);
            this.f15464m = nativeByteBuffer.readInt32(true);
            this.f15465n = nativeByteBuffer.readInt32(true);
            this.f15467p = nativeByteBuffer.readInt32(true);
            this.f15468q = nativeByteBuffer.readInt32(true);
            this.f15469r = nativeByteBuffer.readInt64(true);
            int i7 = 0;
            while (true) {
                float[] fArr = this.f15470s;
                if (i7 >= fArr.length) {
                    break;
                }
                fArr[i7] = nativeByteBuffer.readFloat(true);
                i7++;
            }
            this.f15471t = nativeByteBuffer.readInt32(true);
            this.f15472u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i10 = 0; i10 < readInt322; i10++) {
                    if (this.f15473w == null) {
                        this.f15473w = new ArrayList();
                    }
                    this.f15473w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f15474x.clear();
                    for (int i11 = 0; i11 < readInt323; i11++) {
                        this.f15474x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f15475y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f15475y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i12 = 0; i12 < readInt324; i12++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new e20(nativeByteBuffer, true, true));
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
                                gfVar.f23733a = nativeByteBuffer.readFloat(true);
                                gfVar.f23734b = nativeByteBuffer.readFloat(true);
                                gfVar.f23735c = nativeByteBuffer.readFloat(true);
                                gfVar.d = nativeByteBuffer.readFloat(true);
                                gfVar.f23736e = nativeByteBuffer.readFloat(true);
                                gfVar.f23737f = nativeByteBuffer.readFloat(true);
                                gfVar.f23738g = nativeByteBuffer.readFloat(true);
                                gfVar.h = nativeByteBuffer.readInt32(true);
                                gfVar.f23739i = nativeByteBuffer.readInt32(true);
                                gfVar.f23740j = nativeByteBuffer.readFloat(true);
                                gfVar.f23741k = nativeByteBuffer.readFloat(true);
                                gfVar.f23742l = nativeByteBuffer.readFloat(true);
                                gfVar.f23743m = nativeByteBuffer.readFloat(true);
                                gfVar.f23744n = nativeByteBuffer.readInt32(true);
                                gfVar.f23745o = nativeByteBuffer.readFloat(true);
                                h2.c cVar = gfVar.f23746p;
                                ((rd0) cVar.f13418b).c(nativeByteBuffer);
                                ((rd0) cVar.f13419c).c(nativeByteBuffer);
                                ((rd0) cVar.d).c(nativeByteBuffer);
                                ((rd0) cVar.f13420e).c(nativeByteBuffer);
                                gfVar.f23747q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    gfVar.f23748r = null;
                                } else {
                                    if (gfVar.f23748r == null) {
                                        gfVar.f23748r = new PointF();
                                    }
                                    gfVar.f23748r.x = nativeByteBuffer.readFloat(true);
                                    gfVar.f23748r.y = nativeByteBuffer.readFloat(true);
                                }
                                gfVar.f23749s = nativeByteBuffer.readFloat(true);
                                gfVar.f23750t = nativeByteBuffer.readFloat(true);
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
                                this.f15476z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f15476z = null;
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
                                this.f15453f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f15444a0 = nativeByteBuffer.readInt64(true);
                                this.f15446b0 = nativeByteBuffer.readFloat(true);
                                this.f15448c0 = nativeByteBuffer.readFloat(true);
                                this.f15449d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f15451e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f15455g0 = nativeByteBuffer.readInt64(true);
                                this.f15456h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f15458i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f15460j0 = new t(nativeByteBuffer.readString(true));
                                this.f15462k0 = new ArrayList();
                                for (int i14 = 0; i14 < this.f15460j0.f15124e.size(); i14++) {
                                    f20 f20Var = new f20();
                                    f20Var.readParams(nativeByteBuffer, true);
                                    f20Var.f23430r = (s) this.f15460j0.f15124e.get(i14);
                                    this.f15462k0.add(f20Var);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                xe xeVar = new xe();
                                this.f15466o = xeVar;
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
