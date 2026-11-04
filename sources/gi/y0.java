package gi;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.a20;
import org.telegram.messenger.li;
import org.telegram.messenger.re;
import org.telegram.messenger.z10;
import org.telegram.messenger.ze;
import org.telegram.messenger.zi;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ld0;
public final class y0 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final ze E;
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
    public long f13880a;
    public final long f13881a0;
    public final long f13882b;
    public final float f13883b0;
    public final String f13884c;
    public final float f13885c0;
    public final String d;
    public final float f13886d0;
    public final boolean f13887e;
    public final float f13888e0;
    public final String f13889f;
    public final TLRPC.InputPeer f13890f0;
    public final boolean f13891g;
    public final long f13892g0;
    public final boolean h;
    public final String f13893h0;
    public final long f13894i;
    public final TLRPC.InputMedia f13895i0;
    public final long f13896j;
    public final t f13897j0;
    public final int f13898k;
    public final ArrayList f13899k0;
    public final int f13900l;
    public final int f13901m;
    public final int f13902n;
    public final re f13903o;
    public final int f13904p;
    public final int f13905q;
    public final long f13906r;
    public final float[] f13907s;
    public final int f13908t;
    public final int f13909u;
    public final String v;
    public final ArrayList f13910w;
    public final ArrayList f13911x;
    public final String f13912y;
    public final String f13913z;

    public y0(f7 f7Var) {
        float[] fArr = new float[9];
        this.f13907s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f13911x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f13886d0 = 1.0f;
        this.f13888e0 = 1.0f;
        this.f13880a = f7Var.f12705b;
        this.f13882b = f7Var.d;
        File file = f7Var.O0;
        this.f13884c = file == null ? "" : file.toString();
        File file2 = f7Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f13887e = f7Var.K;
        File file3 = f7Var.L;
        this.f13889f = file3 == null ? "" : file3.toString();
        this.f13891g = f7Var.M;
        this.h = f7Var.Y;
        float f10 = f7Var.Z;
        long j10 = f7Var.f12720h0;
        this.f13894i = f10 * ((float) j10);
        this.f13896j = f7Var.f12703a0 * ((float) j10);
        this.f13898k = f7Var.Q;
        this.f13900l = f7Var.R;
        this.f13901m = f7Var.f12726k0;
        this.f13902n = f7Var.f12728l0;
        this.f13903o = f7Var.m0;
        this.f13904p = f7Var.f12722i0;
        this.f13905q = f7Var.f12724j0;
        this.f13906r = j10;
        f7Var.f12731n0.getValues(fArr);
        this.f13908t = f7Var.A0;
        this.f13909u = f7Var.B0;
        CharSequence[] charSequenceArr = {f7Var.C0};
        this.f13910w = f7Var.D0 ? li.b0(f7Var.f12702a).W(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(f7Var.F0);
        File file4 = f7Var.P0;
        this.f13912y = file4 == null ? "" : file4.toString();
        File file5 = f7Var.R0;
        this.f13913z = file5 == null ? "" : file5.toString();
        this.A = f7Var.S0;
        this.B = f7Var.T0;
        this.C = f7Var.U0;
        File file6 = f7Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = f7Var.f12704a1;
        this.F = f7Var.I0;
        this.M = f7Var.f12747w;
        this.N = f7Var.f12749x;
        this.O = f7Var.f12751y;
        this.P = f7Var.f12753z;
        this.Q = f7Var.A;
        this.R = f7Var.B;
        this.S = f7Var.C;
        this.T = f7Var.D;
        this.U = f7Var.E;
        this.V = f7Var.F;
        this.W = f7Var.G;
        File file7 = f7Var.f12733o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = f7Var.f12735p0;
        this.Z = f7Var.f12737q0;
        this.f13881a0 = f7Var.f12739r0;
        this.f13883b0 = f7Var.f12741s0;
        this.f13885c0 = f7Var.f12743t0;
        this.f13886d0 = f7Var.f12745u0;
        this.f13888e0 = f7Var.P;
        this.f13890f0 = f7Var.f12746v0;
        this.f13892g0 = f7Var.J0;
        this.f13893h0 = f7Var.K0;
        this.f13895i0 = f7Var.L0;
        this.f13897j0 = f7Var.S;
        this.f13899k0 = a20.a(f7Var);
    }

    public final f7 a() {
        f7 f7Var = new f7();
        f7Var.f12705b = this.f13880a;
        f7Var.f12708c = true;
        f7Var.d = this.f13882b;
        String str = this.f13884c;
        if (!TextUtils.isEmpty(str)) {
            f7Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            f7Var.N0 = new File(str2);
        }
        f7Var.K = this.f13887e;
        String str3 = this.f13889f;
        if (str3 != null) {
            f7Var.L = new File(str3);
        }
        f7Var.M = this.f13891g;
        f7Var.Y = this.h;
        long j10 = this.f13906r;
        f7Var.f12720h0 = j10;
        if (j10 > 0) {
            f7Var.Z = ((float) this.f13894i) / ((float) j10);
            f7Var.f12703a0 = ((float) this.f13896j) / ((float) j10);
        } else {
            f7Var.Z = 0.0f;
            f7Var.f12703a0 = 1.0f;
        }
        f7Var.Q = this.f13898k;
        f7Var.R = this.f13900l;
        f7Var.f12726k0 = this.f13901m;
        f7Var.f12728l0 = this.f13902n;
        f7Var.m0 = this.f13903o;
        f7Var.f12722i0 = this.f13904p;
        f7Var.f12724j0 = this.f13905q;
        f7Var.f12731n0.setValues(this.f13907s);
        f7Var.A0 = this.f13908t;
        f7Var.B0 = this.f13909u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i3 = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.k6.f28077o2 == null) {
                org.telegram.ui.ActionBar.k6.Q();
            }
            CharSequence m10 = org.telegram.messenger.i6.m(spannableString, org.telegram.ui.ActionBar.k6.f28077o2.getFontMetricsInt(), true, null, 0);
            zi.b(m10, this.f13910w, true, false, true, false, 0);
            f7Var.C0 = zi.C5(m10, this.f13910w, org.telegram.ui.ActionBar.k6.f28077o2.getFontMetricsInt(), false);
        } else {
            f7Var.C0 = "";
        }
        ArrayList arrayList2 = f7Var.F0;
        arrayList2.clear();
        arrayList2.addAll(this.f13911x);
        String str5 = this.f13912y;
        if (str5 != null) {
            f7Var.P0 = new File(str5);
        }
        String str6 = this.f13913z;
        if (str6 != null) {
            f7Var.R0 = new File(str6);
        }
        f7Var.S0 = this.A;
        f7Var.T0 = this.B;
        f7Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            f7Var.Z0 = new File(str7);
        }
        f7Var.f12704a1 = this.E;
        f7Var.I0 = this.F;
        f7Var.f12718g = this.G;
        f7Var.f12716f = this.H;
        f7Var.f12713e = this.I;
        f7Var.J = this.L;
        f7Var.I = this.K;
        f7Var.H = this.J;
        f7Var.f12747w = this.M;
        f7Var.f12749x = this.N;
        f7Var.f12751y = this.O;
        f7Var.f12753z = this.P;
        f7Var.A = this.Q;
        f7Var.B = this.R;
        f7Var.C = this.S;
        f7Var.D = this.T;
        f7Var.E = this.U;
        f7Var.F = this.V;
        f7Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            f7Var.f12733o0 = new File(str8);
        }
        f7Var.f12735p0 = this.Y;
        f7Var.f12737q0 = this.Z;
        f7Var.f12739r0 = this.f13881a0;
        f7Var.f12741s0 = this.f13883b0;
        f7Var.f12743t0 = this.f13885c0;
        f7Var.f12745u0 = this.f13886d0;
        f7Var.P = this.f13888e0;
        f7Var.f12746v0 = this.f13890f0;
        f7Var.J0 = this.f13892g0;
        f7Var.K0 = this.f13893h0;
        f7Var.L0 = this.f13895i0;
        f7Var.S = this.f13897j0;
        int i10 = a20.C;
        ArrayList arrayList3 = this.f13899k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
                i3++;
                a20 a20Var = (a20) obj;
                f7 f7Var2 = new f7();
                f7Var2.K = a20Var.f21434b;
                f7Var2.Y = a20Var.f21435c;
                f7Var2.L = new File(a20Var.d);
                f7Var2.P = a20Var.f21436e;
                f7Var2.U = a20Var.f21438i;
                f7Var2.X = a20Var.f21437f;
                f7Var2.V = a20Var.f21439j;
                f7Var2.W = a20Var.f21440k;
                f7Var2.f12726k0 = a20Var.f21441l;
                f7Var2.f12728l0 = a20Var.f21442m;
                f7Var2.f12720h0 = a20Var.f21443o;
                arrayList.add(f7Var2);
            }
        }
        f7Var.T = arrayList;
        return f7Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f13882b);
        nativeByteBuffer.writeString(this.f13884c);
        nativeByteBuffer.writeBool(this.f13887e);
        nativeByteBuffer.writeString(this.f13889f);
        nativeByteBuffer.writeBool(this.f13891g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f13894i);
        nativeByteBuffer.writeInt64(this.f13896j);
        nativeByteBuffer.writeInt32(this.f13898k);
        nativeByteBuffer.writeInt32(this.f13900l);
        nativeByteBuffer.writeInt32(this.f13901m);
        nativeByteBuffer.writeInt32(this.f13902n);
        nativeByteBuffer.writeInt32(this.f13904p);
        nativeByteBuffer.writeInt32(this.f13905q);
        nativeByteBuffer.writeInt64(this.f13906r);
        int i3 = 0;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f13907s;
            if (i10 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i10]);
            i10++;
        }
        nativeByteBuffer.writeInt32(this.f13908t);
        nativeByteBuffer.writeInt32(this.f13909u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f13910w;
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
        ArrayList arrayList3 = this.f13911x;
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
        nativeByteBuffer.writeString(this.f13912y);
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
                ((z10) arrayList4.get(i13)).b(nativeByteBuffer, true);
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
        ze zeVar = this.E;
        if (zeVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            nativeByteBuffer.writeFloat(zeVar.f26784a);
            nativeByteBuffer.writeFloat(zeVar.f26785b);
            nativeByteBuffer.writeFloat(zeVar.f26786c);
            nativeByteBuffer.writeFloat(zeVar.d);
            nativeByteBuffer.writeFloat(zeVar.f26787e);
            nativeByteBuffer.writeFloat(zeVar.f26788f);
            nativeByteBuffer.writeFloat(zeVar.f26789g);
            nativeByteBuffer.writeInt32(zeVar.h);
            nativeByteBuffer.writeInt32(zeVar.f26790i);
            nativeByteBuffer.writeFloat(zeVar.f26791j);
            nativeByteBuffer.writeFloat(zeVar.f26792k);
            nativeByteBuffer.writeFloat(zeVar.f26793l);
            nativeByteBuffer.writeFloat(zeVar.f26794m);
            nativeByteBuffer.writeInt32(zeVar.f26795n);
            nativeByteBuffer.writeFloat(zeVar.f26796o);
            g2.d dVar = zeVar.f26797p;
            ((ld0) dVar.f11819b).d(nativeByteBuffer);
            ((ld0) dVar.f11820c).d(nativeByteBuffer);
            ((ld0) dVar.d).d(nativeByteBuffer);
            ((ld0) dVar.f11821e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(zeVar.f26798q);
            if (zeVar.f26799r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(zeVar.f26799r.x);
                nativeByteBuffer.writeFloat(zeVar.f26799r.y);
            }
            nativeByteBuffer.writeFloat(zeVar.f26800s);
            nativeByteBuffer.writeFloat(zeVar.f26801t);
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
        nativeByteBuffer.writeString(this.f13913z);
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
        TLRPC.InputPeer inputPeer = this.f13890f0;
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
            nativeByteBuffer.writeInt64(this.f13881a0);
            nativeByteBuffer.writeFloat(this.f13883b0);
            nativeByteBuffer.writeFloat(this.f13885c0);
            nativeByteBuffer.writeFloat(this.f13886d0);
        }
        nativeByteBuffer.writeFloat(this.f13888e0);
        nativeByteBuffer.writeInt64(this.f13892g0);
        String str7 = this.f13893h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f13895i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.f13897j0;
        if (tVar != null && tVar.f13589e.size() > 1 && (arrayList = this.f13899k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.f13586a);
            int size5 = arrayList.size();
            while (i3 < size5) {
                Object obj = arrayList.get(i3);
                i3++;
                ((a20) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        re reVar = this.f13903o;
        if (reVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            reVar.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public y0(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.f13907s = new float[9];
        this.f13911x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f13886d0 = 1.0f;
        this.f13888e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f13882b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f13884c = readString;
            if (readString != null && readString.length() == 0) {
                this.f13884c = null;
            }
            this.f13887e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f13889f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f13889f = null;
            }
            this.f13891g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f13894i = nativeByteBuffer.readInt64(true);
            this.f13896j = nativeByteBuffer.readInt64(true);
            this.f13898k = nativeByteBuffer.readInt32(true);
            this.f13900l = nativeByteBuffer.readInt32(true);
            this.f13901m = nativeByteBuffer.readInt32(true);
            this.f13902n = nativeByteBuffer.readInt32(true);
            this.f13904p = nativeByteBuffer.readInt32(true);
            this.f13905q = nativeByteBuffer.readInt32(true);
            this.f13906r = nativeByteBuffer.readInt64(true);
            int i3 = 0;
            while (true) {
                float[] fArr = this.f13907s;
                if (i3 >= fArr.length) {
                    break;
                }
                fArr[i3] = nativeByteBuffer.readFloat(true);
                i3++;
            }
            this.f13908t = nativeByteBuffer.readInt32(true);
            this.f13909u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i10 = 0; i10 < readInt322; i10++) {
                    if (this.f13910w == null) {
                        this.f13910w = new ArrayList();
                    }
                    this.f13910w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f13911x.clear();
                    for (int i11 = 0; i11 < readInt323; i11++) {
                        this.f13911x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f13912y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f13912y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i12 = 0; i12 < readInt324; i12++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new z10(nativeByteBuffer, true, true));
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
                                ze zeVar = new ze();
                                this.E = zeVar;
                                zeVar.f26784a = nativeByteBuffer.readFloat(true);
                                zeVar.f26785b = nativeByteBuffer.readFloat(true);
                                zeVar.f26786c = nativeByteBuffer.readFloat(true);
                                zeVar.d = nativeByteBuffer.readFloat(true);
                                zeVar.f26787e = nativeByteBuffer.readFloat(true);
                                zeVar.f26788f = nativeByteBuffer.readFloat(true);
                                zeVar.f26789g = nativeByteBuffer.readFloat(true);
                                zeVar.h = nativeByteBuffer.readInt32(true);
                                zeVar.f26790i = nativeByteBuffer.readInt32(true);
                                zeVar.f26791j = nativeByteBuffer.readFloat(true);
                                zeVar.f26792k = nativeByteBuffer.readFloat(true);
                                zeVar.f26793l = nativeByteBuffer.readFloat(true);
                                zeVar.f26794m = nativeByteBuffer.readFloat(true);
                                zeVar.f26795n = nativeByteBuffer.readInt32(true);
                                zeVar.f26796o = nativeByteBuffer.readFloat(true);
                                g2.d dVar = zeVar.f26797p;
                                ((ld0) dVar.f11819b).c(nativeByteBuffer);
                                ((ld0) dVar.f11820c).c(nativeByteBuffer);
                                ((ld0) dVar.d).c(nativeByteBuffer);
                                ((ld0) dVar.f11821e).c(nativeByteBuffer);
                                zeVar.f26798q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    zeVar.f26799r = null;
                                } else {
                                    if (zeVar.f26799r == null) {
                                        zeVar.f26799r = new PointF();
                                    }
                                    zeVar.f26799r.x = nativeByteBuffer.readFloat(true);
                                    zeVar.f26799r.y = nativeByteBuffer.readFloat(true);
                                }
                                zeVar.f26800s = nativeByteBuffer.readFloat(true);
                                zeVar.f26801t = nativeByteBuffer.readFloat(true);
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
                                this.f13913z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f13913z = null;
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
                                this.f13890f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f13881a0 = nativeByteBuffer.readInt64(true);
                                this.f13883b0 = nativeByteBuffer.readFloat(true);
                                this.f13885c0 = nativeByteBuffer.readFloat(true);
                                this.f13886d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f13888e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f13892g0 = nativeByteBuffer.readInt64(true);
                                this.f13893h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f13895i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f13897j0 = new t(nativeByteBuffer.readString(true));
                                this.f13899k0 = new ArrayList();
                                for (int i14 = 0; i14 < this.f13897j0.f13589e.size(); i14++) {
                                    a20 a20Var = new a20();
                                    a20Var.readParams(nativeByteBuffer, true);
                                    a20Var.f21444r = (s) this.f13897j0.f13589e.get(i14);
                                    this.f13899k0.add(a20Var);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                re reVar = new re();
                                this.f13903o = reVar;
                                reVar.readParams(nativeByteBuffer, true);
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
