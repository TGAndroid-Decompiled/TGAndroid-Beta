package hi;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.messenger.d20;
import org.telegram.messenger.ff;
import org.telegram.messenger.fj;
import org.telegram.messenger.ri;
import org.telegram.messenger.we;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.be0;
public final class a1 {
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
    public long f14176a;
    public final long f14177a0;
    public final long f14178b;
    public final float f14179b0;
    public final String f14180c;
    public final float f14181c0;
    public final String d;
    public final float f14182d0;
    public final boolean f14183e;
    public final float f14184e0;
    public final String f14185f;
    public final TLRPC.InputPeer f14186f0;
    public final boolean f14187g;
    public final long f14188g0;
    public final boolean h;
    public final String f14189h0;
    public final long f14190i;
    public final TLRPC.InputMedia f14191i0;
    public final long f14192j;
    public final u f14193j0;
    public final int f14194k;
    public final ArrayList f14195k0;
    public final int f14196l;
    public final int f14197m;
    public final int f14198n;
    public final we f14199o;
    public final int f14200p;
    public final int f14201q;
    public final long f14202r;
    public final float[] f14203s;
    public final int f14204t;
    public final int f14205u;
    public final String v;
    public final ArrayList f14206w;
    public final ArrayList f14207x;
    public final String f14208y;
    public final String f14209z;

    public a1(d7 d7Var) {
        float[] fArr = new float[9];
        this.f14203s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f14207x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f14182d0 = 1.0f;
        this.f14184e0 = 1.0f;
        this.f14176a = d7Var.f14391b;
        this.f14178b = d7Var.d;
        File file = d7Var.O0;
        this.f14180c = file == null ? "" : file.toString();
        File file2 = d7Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f14183e = d7Var.K;
        File file3 = d7Var.L;
        this.f14185f = file3 == null ? "" : file3.toString();
        this.f14187g = d7Var.M;
        this.h = d7Var.Y;
        float f10 = d7Var.Z;
        long j3 = d7Var.f14406h0;
        this.f14190i = f10 * ((float) j3);
        this.f14192j = d7Var.f14389a0 * ((float) j3);
        this.f14194k = d7Var.Q;
        this.f14196l = d7Var.R;
        this.f14197m = d7Var.f14412k0;
        this.f14198n = d7Var.f14414l0;
        this.f14199o = d7Var.m0;
        this.f14200p = d7Var.f14408i0;
        this.f14201q = d7Var.f14410j0;
        this.f14202r = j3;
        d7Var.f14417n0.getValues(fArr);
        this.f14204t = d7Var.A0;
        this.f14205u = d7Var.B0;
        CharSequence[] charSequenceArr = {d7Var.C0};
        this.f14206w = d7Var.D0 ? ri.d0(d7Var.f14388a).Y(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(d7Var.F0);
        File file4 = d7Var.P0;
        this.f14208y = file4 == null ? "" : file4.toString();
        File file5 = d7Var.R0;
        this.f14209z = file5 == null ? "" : file5.toString();
        this.A = d7Var.S0;
        this.B = d7Var.T0;
        this.C = d7Var.U0;
        File file6 = d7Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = d7Var.f14390a1;
        this.F = d7Var.I0;
        this.M = d7Var.f14433w;
        this.N = d7Var.f14435x;
        this.O = d7Var.f14437y;
        this.P = d7Var.f14439z;
        this.Q = d7Var.A;
        this.R = d7Var.B;
        this.S = d7Var.C;
        this.T = d7Var.D;
        this.U = d7Var.E;
        this.V = d7Var.F;
        this.W = d7Var.G;
        File file7 = d7Var.f14419o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = d7Var.f14421p0;
        this.Z = d7Var.f14423q0;
        this.f14177a0 = d7Var.f14425r0;
        this.f14179b0 = d7Var.f14427s0;
        this.f14181c0 = d7Var.f14429t0;
        this.f14182d0 = d7Var.f14431u0;
        this.f14184e0 = d7Var.P;
        this.f14186f0 = d7Var.f14432v0;
        this.f14188g0 = d7Var.J0;
        this.f14189h0 = d7Var.K0;
        this.f14191i0 = d7Var.L0;
        this.f14193j0 = d7Var.S;
        this.f14195k0 = d20.a(d7Var);
    }

    public final d7 a() {
        d7 d7Var = new d7();
        d7Var.f14391b = this.f14176a;
        d7Var.f14394c = true;
        d7Var.d = this.f14178b;
        String str = this.f14180c;
        if (!TextUtils.isEmpty(str)) {
            d7Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            d7Var.N0 = new File(str2);
        }
        d7Var.K = this.f14183e;
        String str3 = this.f14185f;
        if (str3 != null) {
            d7Var.L = new File(str3);
        }
        d7Var.M = this.f14187g;
        d7Var.Y = this.h;
        long j3 = this.f14202r;
        d7Var.f14406h0 = j3;
        if (j3 > 0) {
            d7Var.Z = ((float) this.f14190i) / ((float) j3);
            d7Var.f14389a0 = ((float) this.f14192j) / ((float) j3);
        } else {
            d7Var.Z = 0.0f;
            d7Var.f14389a0 = 1.0f;
        }
        d7Var.Q = this.f14194k;
        d7Var.R = this.f14196l;
        d7Var.f14412k0 = this.f14197m;
        d7Var.f14414l0 = this.f14198n;
        d7Var.m0 = this.f14199o;
        d7Var.f14408i0 = this.f14200p;
        d7Var.f14410j0 = this.f14201q;
        d7Var.f14417n0.setValues(this.f14203s);
        d7Var.A0 = this.f14204t;
        d7Var.B0 = this.f14205u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i7 = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.n6.f29593o2 == null) {
                org.telegram.ui.ActionBar.n6.Q();
            }
            CharSequence m10 = org.telegram.messenger.j6.m(spannableString, org.telegram.ui.ActionBar.n6.f29593o2.getFontMetricsInt(), true, null, 0);
            fj.b(m10, this.f14206w, true, false, true, false, 0);
            d7Var.C0 = fj.B5(m10, this.f14206w, org.telegram.ui.ActionBar.n6.f29593o2.getFontMetricsInt(), false);
        } else {
            d7Var.C0 = "";
        }
        ArrayList arrayList2 = d7Var.F0;
        arrayList2.clear();
        arrayList2.addAll(this.f14207x);
        String str5 = this.f14208y;
        if (str5 != null) {
            d7Var.P0 = new File(str5);
        }
        String str6 = this.f14209z;
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
        d7Var.f14390a1 = this.E;
        d7Var.I0 = this.F;
        d7Var.f14404g = this.G;
        d7Var.f14402f = this.H;
        d7Var.f14399e = this.I;
        d7Var.J = this.L;
        d7Var.I = this.K;
        d7Var.H = this.J;
        d7Var.f14433w = this.M;
        d7Var.f14435x = this.N;
        d7Var.f14437y = this.O;
        d7Var.f14439z = this.P;
        d7Var.A = this.Q;
        d7Var.B = this.R;
        d7Var.C = this.S;
        d7Var.D = this.T;
        d7Var.E = this.U;
        d7Var.F = this.V;
        d7Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            d7Var.f14419o0 = new File(str8);
        }
        d7Var.f14421p0 = this.Y;
        d7Var.f14423q0 = this.Z;
        d7Var.f14425r0 = this.f14177a0;
        d7Var.f14427s0 = this.f14179b0;
        d7Var.f14429t0 = this.f14181c0;
        d7Var.f14431u0 = this.f14182d0;
        d7Var.P = this.f14184e0;
        d7Var.f14432v0 = this.f14186f0;
        d7Var.J0 = this.f14188g0;
        d7Var.K0 = this.f14189h0;
        d7Var.L0 = this.f14191i0;
        d7Var.S = this.f14193j0;
        int i10 = d20.C;
        ArrayList arrayList3 = this.f14195k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                i7++;
                d20 d20Var = (d20) obj;
                d7 d7Var2 = new d7();
                d7Var2.K = d20Var.f23469b;
                d7Var2.Y = d20Var.f23470c;
                d7Var2.L = new File(d20Var.d);
                d7Var2.P = d20Var.f23471e;
                d7Var2.U = d20Var.f23473i;
                d7Var2.X = d20Var.f23472f;
                d7Var2.V = d20Var.f23474j;
                d7Var2.W = d20Var.f23475k;
                d7Var2.f14412k0 = d20Var.f23476l;
                d7Var2.f14414l0 = d20Var.f23477m;
                d7Var2.f14406h0 = d20Var.f23478o;
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
        nativeByteBuffer.writeInt64(this.f14178b);
        nativeByteBuffer.writeString(this.f14180c);
        nativeByteBuffer.writeBool(this.f14183e);
        nativeByteBuffer.writeString(this.f14185f);
        nativeByteBuffer.writeBool(this.f14187g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f14190i);
        nativeByteBuffer.writeInt64(this.f14192j);
        nativeByteBuffer.writeInt32(this.f14194k);
        nativeByteBuffer.writeInt32(this.f14196l);
        nativeByteBuffer.writeInt32(this.f14197m);
        nativeByteBuffer.writeInt32(this.f14198n);
        nativeByteBuffer.writeInt32(this.f14200p);
        nativeByteBuffer.writeInt32(this.f14201q);
        nativeByteBuffer.writeInt64(this.f14202r);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f14203s;
            if (i10 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i10]);
            i10++;
        }
        nativeByteBuffer.writeInt32(this.f14204t);
        nativeByteBuffer.writeInt32(this.f14205u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f14206w;
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
        ArrayList arrayList3 = this.f14207x;
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
        nativeByteBuffer.writeString(this.f14208y);
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
                ((c20) arrayList4.get(i13)).b(nativeByteBuffer, true);
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
            nativeByteBuffer.writeFloat(ffVar.f23889a);
            nativeByteBuffer.writeFloat(ffVar.f23890b);
            nativeByteBuffer.writeFloat(ffVar.f23891c);
            nativeByteBuffer.writeFloat(ffVar.d);
            nativeByteBuffer.writeFloat(ffVar.f23892e);
            nativeByteBuffer.writeFloat(ffVar.f23893f);
            nativeByteBuffer.writeFloat(ffVar.f23894g);
            nativeByteBuffer.writeInt32(ffVar.h);
            nativeByteBuffer.writeInt32(ffVar.f23895i);
            nativeByteBuffer.writeFloat(ffVar.f23896j);
            nativeByteBuffer.writeFloat(ffVar.f23897k);
            nativeByteBuffer.writeFloat(ffVar.f23898l);
            nativeByteBuffer.writeFloat(ffVar.f23899m);
            nativeByteBuffer.writeInt32(ffVar.f23900n);
            nativeByteBuffer.writeFloat(ffVar.f23901o);
            h2.c cVar = ffVar.f23902p;
            ((be0) cVar.f13733b).d(nativeByteBuffer);
            ((be0) cVar.f13734c).d(nativeByteBuffer);
            ((be0) cVar.d).d(nativeByteBuffer);
            ((be0) cVar.f13735e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(ffVar.f23903q);
            if (ffVar.f23904r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(ffVar.f23904r.x);
                nativeByteBuffer.writeFloat(ffVar.f23904r.y);
            }
            nativeByteBuffer.writeFloat(ffVar.f23905s);
            nativeByteBuffer.writeFloat(ffVar.f23906t);
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
        nativeByteBuffer.writeString(this.f14209z);
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
        TLRPC.InputPeer inputPeer = this.f14186f0;
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
            nativeByteBuffer.writeInt64(this.f14177a0);
            nativeByteBuffer.writeFloat(this.f14179b0);
            nativeByteBuffer.writeFloat(this.f14181c0);
            nativeByteBuffer.writeFloat(this.f14182d0);
        }
        nativeByteBuffer.writeFloat(this.f14184e0);
        nativeByteBuffer.writeInt64(this.f14188g0);
        String str7 = this.f14189h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f14191i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        u uVar = this.f14193j0;
        if (uVar != null && uVar.f15512e.size() > 1 && (arrayList = this.f14195k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(uVar.f15509a);
            int size5 = arrayList.size();
            while (i7 < size5) {
                Object obj = arrayList.get(i7);
                i7++;
                ((d20) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        we weVar = this.f14199o;
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

    public a1(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.f14203s = new float[9];
        this.f14207x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f14182d0 = 1.0f;
        this.f14184e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f14178b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f14180c = readString;
            if (readString != null && readString.length() == 0) {
                this.f14180c = null;
            }
            this.f14183e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f14185f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f14185f = null;
            }
            this.f14187g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f14190i = nativeByteBuffer.readInt64(true);
            this.f14192j = nativeByteBuffer.readInt64(true);
            this.f14194k = nativeByteBuffer.readInt32(true);
            this.f14196l = nativeByteBuffer.readInt32(true);
            this.f14197m = nativeByteBuffer.readInt32(true);
            this.f14198n = nativeByteBuffer.readInt32(true);
            this.f14200p = nativeByteBuffer.readInt32(true);
            this.f14201q = nativeByteBuffer.readInt32(true);
            this.f14202r = nativeByteBuffer.readInt64(true);
            int i7 = 0;
            while (true) {
                float[] fArr = this.f14203s;
                if (i7 >= fArr.length) {
                    break;
                }
                fArr[i7] = nativeByteBuffer.readFloat(true);
                i7++;
            }
            this.f14204t = nativeByteBuffer.readInt32(true);
            this.f14205u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i10 = 0; i10 < readInt322; i10++) {
                    if (this.f14206w == null) {
                        this.f14206w = new ArrayList();
                    }
                    this.f14206w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f14207x.clear();
                    for (int i11 = 0; i11 < readInt323; i11++) {
                        this.f14207x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f14208y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f14208y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i12 = 0; i12 < readInt324; i12++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new c20(nativeByteBuffer, true, true));
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
                                ffVar.f23889a = nativeByteBuffer.readFloat(true);
                                ffVar.f23890b = nativeByteBuffer.readFloat(true);
                                ffVar.f23891c = nativeByteBuffer.readFloat(true);
                                ffVar.d = nativeByteBuffer.readFloat(true);
                                ffVar.f23892e = nativeByteBuffer.readFloat(true);
                                ffVar.f23893f = nativeByteBuffer.readFloat(true);
                                ffVar.f23894g = nativeByteBuffer.readFloat(true);
                                ffVar.h = nativeByteBuffer.readInt32(true);
                                ffVar.f23895i = nativeByteBuffer.readInt32(true);
                                ffVar.f23896j = nativeByteBuffer.readFloat(true);
                                ffVar.f23897k = nativeByteBuffer.readFloat(true);
                                ffVar.f23898l = nativeByteBuffer.readFloat(true);
                                ffVar.f23899m = nativeByteBuffer.readFloat(true);
                                ffVar.f23900n = nativeByteBuffer.readInt32(true);
                                ffVar.f23901o = nativeByteBuffer.readFloat(true);
                                h2.c cVar = ffVar.f23902p;
                                ((be0) cVar.f13733b).c(nativeByteBuffer);
                                ((be0) cVar.f13734c).c(nativeByteBuffer);
                                ((be0) cVar.d).c(nativeByteBuffer);
                                ((be0) cVar.f13735e).c(nativeByteBuffer);
                                ffVar.f23903q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    ffVar.f23904r = null;
                                } else {
                                    if (ffVar.f23904r == null) {
                                        ffVar.f23904r = new PointF();
                                    }
                                    ffVar.f23904r.x = nativeByteBuffer.readFloat(true);
                                    ffVar.f23904r.y = nativeByteBuffer.readFloat(true);
                                }
                                ffVar.f23905s = nativeByteBuffer.readFloat(true);
                                ffVar.f23906t = nativeByteBuffer.readFloat(true);
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
                                this.f14209z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f14209z = null;
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
                                this.f14186f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f14177a0 = nativeByteBuffer.readInt64(true);
                                this.f14179b0 = nativeByteBuffer.readFloat(true);
                                this.f14181c0 = nativeByteBuffer.readFloat(true);
                                this.f14182d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f14184e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f14188g0 = nativeByteBuffer.readInt64(true);
                                this.f14189h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f14191i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f14193j0 = new u(nativeByteBuffer.readString(true));
                                this.f14195k0 = new ArrayList();
                                for (int i14 = 0; i14 < this.f14193j0.f15512e.size(); i14++) {
                                    d20 d20Var = new d20();
                                    d20Var.readParams(nativeByteBuffer, true);
                                    d20Var.f23479r = (t) this.f14193j0.f15512e.get(i14);
                                    this.f14195k0.add(d20Var);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                we weVar = new we();
                                this.f14199o = weVar;
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
