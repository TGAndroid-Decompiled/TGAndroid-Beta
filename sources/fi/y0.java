package fi;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.h20;
import org.telegram.messenger.hf;
import org.telegram.messenger.i20;
import org.telegram.messenger.ij;
import org.telegram.messenger.ui;
import org.telegram.messenger.ye;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qd0;
public final class y0 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final hf E;
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
    public long f13110a;
    public final long f13111a0;
    public final long f13112b;
    public final float f13113b0;
    public final String f13114c;
    public final float f13115c0;
    public final String d;
    public final float f13116d0;
    public final boolean f13117e;
    public final float f13118e0;
    public final String f13119f;
    public final TLRPC.InputPeer f13120f0;
    public final boolean f13121g;
    public final long f13122g0;
    public final boolean h;
    public final String f13123h0;
    public final long f13124i;
    public final TLRPC.InputMedia f13125i0;
    public final long f13126j;
    public final t f13127j0;
    public final int f13128k;
    public final ArrayList f13129k0;
    public final int f13130l;
    public final int f13131m;
    public final int f13132n;
    public final ye f13133o;
    public final int f13134p;
    public final int f13135q;
    public final long f13136r;
    public final float[] f13137s;
    public final int f13138t;
    public final int f13139u;
    public final String v;
    public final ArrayList f13140w;
    public final ArrayList f13141x;
    public final String f13142y;
    public final String f13143z;

    public y0(e7 e7Var) {
        float[] fArr = new float[9];
        this.f13137s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f13141x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f13116d0 = 1.0f;
        this.f13118e0 = 1.0f;
        this.f13110a = e7Var.f11879b;
        this.f13112b = e7Var.d;
        File file = e7Var.O0;
        this.f13114c = file == null ? "" : file.toString();
        File file2 = e7Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f13117e = e7Var.K;
        File file3 = e7Var.L;
        this.f13119f = file3 == null ? "" : file3.toString();
        this.f13121g = e7Var.M;
        this.h = e7Var.Y;
        float f10 = e7Var.Z;
        long j3 = e7Var.f11894h0;
        this.f13124i = f10 * ((float) j3);
        this.f13126j = e7Var.f11877a0 * ((float) j3);
        this.f13128k = e7Var.Q;
        this.f13130l = e7Var.R;
        this.f13131m = e7Var.f11900k0;
        this.f13132n = e7Var.f11902l0;
        this.f13133o = e7Var.m0;
        this.f13134p = e7Var.f11896i0;
        this.f13135q = e7Var.f11898j0;
        this.f13136r = j3;
        e7Var.f11905n0.getValues(fArr);
        this.f13138t = e7Var.A0;
        this.f13139u = e7Var.B0;
        CharSequence[] charSequenceArr = {e7Var.C0};
        this.f13140w = e7Var.D0 ? ui.b0(e7Var.f11876a).W(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(e7Var.F0);
        File file4 = e7Var.P0;
        this.f13142y = file4 == null ? "" : file4.toString();
        File file5 = e7Var.R0;
        this.f13143z = file5 == null ? "" : file5.toString();
        this.A = e7Var.S0;
        this.B = e7Var.T0;
        this.C = e7Var.U0;
        File file6 = e7Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = e7Var.f11878a1;
        this.F = e7Var.I0;
        this.M = e7Var.f11921w;
        this.N = e7Var.f11923x;
        this.O = e7Var.f11925y;
        this.P = e7Var.f11927z;
        this.Q = e7Var.A;
        this.R = e7Var.B;
        this.S = e7Var.C;
        this.T = e7Var.D;
        this.U = e7Var.E;
        this.V = e7Var.F;
        this.W = e7Var.G;
        File file7 = e7Var.f11907o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = e7Var.f11909p0;
        this.Z = e7Var.f11911q0;
        this.f13111a0 = e7Var.f11913r0;
        this.f13113b0 = e7Var.f11915s0;
        this.f13115c0 = e7Var.f11917t0;
        this.f13116d0 = e7Var.f11919u0;
        this.f13118e0 = e7Var.P;
        this.f13120f0 = e7Var.f11920v0;
        this.f13122g0 = e7Var.J0;
        this.f13123h0 = e7Var.K0;
        this.f13125i0 = e7Var.L0;
        this.f13127j0 = e7Var.S;
        this.f13129k0 = i20.a(e7Var);
    }

    public final e7 a() {
        e7 e7Var = new e7();
        e7Var.f11879b = this.f13110a;
        e7Var.f11882c = true;
        e7Var.d = this.f13112b;
        String str = this.f13114c;
        if (!TextUtils.isEmpty(str)) {
            e7Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            e7Var.N0 = new File(str2);
        }
        e7Var.K = this.f13117e;
        String str3 = this.f13119f;
        if (str3 != null) {
            e7Var.L = new File(str3);
        }
        e7Var.M = this.f13121g;
        e7Var.Y = this.h;
        long j3 = this.f13136r;
        e7Var.f11894h0 = j3;
        if (j3 > 0) {
            e7Var.Z = ((float) this.f13124i) / ((float) j3);
            e7Var.f11877a0 = ((float) this.f13126j) / ((float) j3);
        } else {
            e7Var.Z = 0.0f;
            e7Var.f11877a0 = 1.0f;
        }
        e7Var.Q = this.f13128k;
        e7Var.R = this.f13130l;
        e7Var.f11900k0 = this.f13131m;
        e7Var.f11902l0 = this.f13132n;
        e7Var.m0 = this.f13133o;
        e7Var.f11896i0 = this.f13134p;
        e7Var.f11898j0 = this.f13135q;
        e7Var.f11905n0.setValues(this.f13137s);
        e7Var.A0 = this.f13138t;
        e7Var.B0 = this.f13139u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i7 = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.k6.f28046o2 == null) {
                org.telegram.ui.ActionBar.k6.Q();
            }
            CharSequence m10 = org.telegram.messenger.i6.m(spannableString, org.telegram.ui.ActionBar.k6.f28046o2.getFontMetricsInt(), true, null, 0);
            ij.b(m10, this.f13140w, true, false, true, false, 0);
            e7Var.C0 = ij.C5(m10, this.f13140w, org.telegram.ui.ActionBar.k6.f28046o2.getFontMetricsInt(), false);
        } else {
            e7Var.C0 = "";
        }
        ArrayList arrayList2 = e7Var.F0;
        arrayList2.clear();
        arrayList2.addAll(this.f13141x);
        String str5 = this.f13142y;
        if (str5 != null) {
            e7Var.P0 = new File(str5);
        }
        String str6 = this.f13143z;
        if (str6 != null) {
            e7Var.R0 = new File(str6);
        }
        e7Var.S0 = this.A;
        e7Var.T0 = this.B;
        e7Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            e7Var.Z0 = new File(str7);
        }
        e7Var.f11878a1 = this.E;
        e7Var.I0 = this.F;
        e7Var.f11892g = this.G;
        e7Var.f11890f = this.H;
        e7Var.f11887e = this.I;
        e7Var.J = this.L;
        e7Var.I = this.K;
        e7Var.H = this.J;
        e7Var.f11921w = this.M;
        e7Var.f11923x = this.N;
        e7Var.f11925y = this.O;
        e7Var.f11927z = this.P;
        e7Var.A = this.Q;
        e7Var.B = this.R;
        e7Var.C = this.S;
        e7Var.D = this.T;
        e7Var.E = this.U;
        e7Var.F = this.V;
        e7Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            e7Var.f11907o0 = new File(str8);
        }
        e7Var.f11909p0 = this.Y;
        e7Var.f11911q0 = this.Z;
        e7Var.f11913r0 = this.f13111a0;
        e7Var.f11915s0 = this.f13113b0;
        e7Var.f11917t0 = this.f13115c0;
        e7Var.f11919u0 = this.f13116d0;
        e7Var.P = this.f13118e0;
        e7Var.f11920v0 = this.f13120f0;
        e7Var.J0 = this.f13122g0;
        e7Var.K0 = this.f13123h0;
        e7Var.L0 = this.f13125i0;
        e7Var.S = this.f13127j0;
        int i10 = i20.C;
        ArrayList arrayList3 = this.f13129k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                i7++;
                i20 i20Var = (i20) obj;
                e7 e7Var2 = new e7();
                e7Var2.K = i20Var.f23030b;
                e7Var2.Y = i20Var.f23031c;
                e7Var2.L = new File(i20Var.d);
                e7Var2.P = i20Var.f23032e;
                e7Var2.U = i20Var.f23034i;
                e7Var2.X = i20Var.f23033f;
                e7Var2.V = i20Var.f23035j;
                e7Var2.W = i20Var.f23036k;
                e7Var2.f11900k0 = i20Var.f23037l;
                e7Var2.f11902l0 = i20Var.f23038m;
                e7Var2.f11894h0 = i20Var.f23039o;
                arrayList.add(e7Var2);
            }
        }
        e7Var.T = arrayList;
        return e7Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f13112b);
        nativeByteBuffer.writeString(this.f13114c);
        nativeByteBuffer.writeBool(this.f13117e);
        nativeByteBuffer.writeString(this.f13119f);
        nativeByteBuffer.writeBool(this.f13121g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f13124i);
        nativeByteBuffer.writeInt64(this.f13126j);
        nativeByteBuffer.writeInt32(this.f13128k);
        nativeByteBuffer.writeInt32(this.f13130l);
        nativeByteBuffer.writeInt32(this.f13131m);
        nativeByteBuffer.writeInt32(this.f13132n);
        nativeByteBuffer.writeInt32(this.f13134p);
        nativeByteBuffer.writeInt32(this.f13135q);
        nativeByteBuffer.writeInt64(this.f13136r);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f13137s;
            if (i10 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i10]);
            i10++;
        }
        nativeByteBuffer.writeInt32(this.f13138t);
        nativeByteBuffer.writeInt32(this.f13139u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f13140w;
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
        ArrayList arrayList3 = this.f13141x;
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
        nativeByteBuffer.writeString(this.f13142y);
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
                ((h20) arrayList4.get(i13)).b(nativeByteBuffer, true);
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
        hf hfVar = this.E;
        if (hfVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            nativeByteBuffer.writeFloat(hfVar.f22913a);
            nativeByteBuffer.writeFloat(hfVar.f22914b);
            nativeByteBuffer.writeFloat(hfVar.f22915c);
            nativeByteBuffer.writeFloat(hfVar.d);
            nativeByteBuffer.writeFloat(hfVar.f22916e);
            nativeByteBuffer.writeFloat(hfVar.f22917f);
            nativeByteBuffer.writeFloat(hfVar.f22918g);
            nativeByteBuffer.writeInt32(hfVar.h);
            nativeByteBuffer.writeInt32(hfVar.f22919i);
            nativeByteBuffer.writeFloat(hfVar.f22920j);
            nativeByteBuffer.writeFloat(hfVar.f22921k);
            nativeByteBuffer.writeFloat(hfVar.f22922l);
            nativeByteBuffer.writeFloat(hfVar.f22923m);
            nativeByteBuffer.writeInt32(hfVar.f22924n);
            nativeByteBuffer.writeFloat(hfVar.f22925o);
            h2.c cVar = hfVar.f22926p;
            ((qd0) cVar.f14058b).d(nativeByteBuffer);
            ((qd0) cVar.f14059c).d(nativeByteBuffer);
            ((qd0) cVar.d).d(nativeByteBuffer);
            ((qd0) cVar.f14060e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(hfVar.f22927q);
            if (hfVar.f22928r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(hfVar.f22928r.x);
                nativeByteBuffer.writeFloat(hfVar.f22928r.y);
            }
            nativeByteBuffer.writeFloat(hfVar.f22929s);
            nativeByteBuffer.writeFloat(hfVar.f22930t);
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
        nativeByteBuffer.writeString(this.f13143z);
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
        TLRPC.InputPeer inputPeer = this.f13120f0;
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
            nativeByteBuffer.writeInt64(this.f13111a0);
            nativeByteBuffer.writeFloat(this.f13113b0);
            nativeByteBuffer.writeFloat(this.f13115c0);
            nativeByteBuffer.writeFloat(this.f13116d0);
        }
        nativeByteBuffer.writeFloat(this.f13118e0);
        nativeByteBuffer.writeInt64(this.f13122g0);
        String str7 = this.f13123h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f13125i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        t tVar = this.f13127j0;
        if (tVar != null && tVar.f12828e.size() > 1 && (arrayList = this.f13129k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(tVar.f12825a);
            int size5 = arrayList.size();
            while (i7 < size5) {
                Object obj = arrayList.get(i7);
                i7++;
                ((i20) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        ye yeVar = this.f13133o;
        if (yeVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            yeVar.serializeToStream(nativeByteBuffer);
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
        this.f13137s = new float[9];
        this.f13141x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f13116d0 = 1.0f;
        this.f13118e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f13112b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f13114c = readString;
            if (readString != null && readString.length() == 0) {
                this.f13114c = null;
            }
            this.f13117e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f13119f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f13119f = null;
            }
            this.f13121g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f13124i = nativeByteBuffer.readInt64(true);
            this.f13126j = nativeByteBuffer.readInt64(true);
            this.f13128k = nativeByteBuffer.readInt32(true);
            this.f13130l = nativeByteBuffer.readInt32(true);
            this.f13131m = nativeByteBuffer.readInt32(true);
            this.f13132n = nativeByteBuffer.readInt32(true);
            this.f13134p = nativeByteBuffer.readInt32(true);
            this.f13135q = nativeByteBuffer.readInt32(true);
            this.f13136r = nativeByteBuffer.readInt64(true);
            int i7 = 0;
            while (true) {
                float[] fArr = this.f13137s;
                if (i7 >= fArr.length) {
                    break;
                }
                fArr[i7] = nativeByteBuffer.readFloat(true);
                i7++;
            }
            this.f13138t = nativeByteBuffer.readInt32(true);
            this.f13139u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i10 = 0; i10 < readInt322; i10++) {
                    if (this.f13140w == null) {
                        this.f13140w = new ArrayList();
                    }
                    this.f13140w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f13141x.clear();
                    for (int i11 = 0; i11 < readInt323; i11++) {
                        this.f13141x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f13142y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f13142y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i12 = 0; i12 < readInt324; i12++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new h20(nativeByteBuffer, true, true));
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
                                hf hfVar = new hf();
                                this.E = hfVar;
                                hfVar.f22913a = nativeByteBuffer.readFloat(true);
                                hfVar.f22914b = nativeByteBuffer.readFloat(true);
                                hfVar.f22915c = nativeByteBuffer.readFloat(true);
                                hfVar.d = nativeByteBuffer.readFloat(true);
                                hfVar.f22916e = nativeByteBuffer.readFloat(true);
                                hfVar.f22917f = nativeByteBuffer.readFloat(true);
                                hfVar.f22918g = nativeByteBuffer.readFloat(true);
                                hfVar.h = nativeByteBuffer.readInt32(true);
                                hfVar.f22919i = nativeByteBuffer.readInt32(true);
                                hfVar.f22920j = nativeByteBuffer.readFloat(true);
                                hfVar.f22921k = nativeByteBuffer.readFloat(true);
                                hfVar.f22922l = nativeByteBuffer.readFloat(true);
                                hfVar.f22923m = nativeByteBuffer.readFloat(true);
                                hfVar.f22924n = nativeByteBuffer.readInt32(true);
                                hfVar.f22925o = nativeByteBuffer.readFloat(true);
                                h2.c cVar = hfVar.f22926p;
                                ((qd0) cVar.f14058b).c(nativeByteBuffer);
                                ((qd0) cVar.f14059c).c(nativeByteBuffer);
                                ((qd0) cVar.d).c(nativeByteBuffer);
                                ((qd0) cVar.f14060e).c(nativeByteBuffer);
                                hfVar.f22927q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    hfVar.f22928r = null;
                                } else {
                                    if (hfVar.f22928r == null) {
                                        hfVar.f22928r = new PointF();
                                    }
                                    hfVar.f22928r.x = nativeByteBuffer.readFloat(true);
                                    hfVar.f22928r.y = nativeByteBuffer.readFloat(true);
                                }
                                hfVar.f22929s = nativeByteBuffer.readFloat(true);
                                hfVar.f22930t = nativeByteBuffer.readFloat(true);
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
                                this.f13143z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f13143z = null;
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
                                this.f13120f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f13111a0 = nativeByteBuffer.readInt64(true);
                                this.f13113b0 = nativeByteBuffer.readFloat(true);
                                this.f13115c0 = nativeByteBuffer.readFloat(true);
                                this.f13116d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f13118e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f13122g0 = nativeByteBuffer.readInt64(true);
                                this.f13123h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f13125i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f13127j0 = new t(nativeByteBuffer.readString(true));
                                this.f13129k0 = new ArrayList();
                                for (int i14 = 0; i14 < this.f13127j0.f12828e.size(); i14++) {
                                    i20 i20Var = new i20();
                                    i20Var.readParams(nativeByteBuffer, true);
                                    i20Var.f23040r = (s) this.f13127j0.f12828e.get(i14);
                                    this.f13129k0.add(i20Var);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                ye yeVar = new ye();
                                this.f13133o = yeVar;
                                yeVar.readParams(nativeByteBuffer, true);
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
