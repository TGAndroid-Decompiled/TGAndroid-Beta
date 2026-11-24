package defpackage;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class iq3 {
    public final long A;
    public final ArrayList B;
    public final ArrayList C;
    public final String D;
    public final lm6 E;
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
    public long a;
    public final long a0;
    public final long b;
    public final float b0;
    public final String c;
    public final float c0;
    public final String d;
    public final float d0;
    public final boolean e;
    public final float e0;
    public final String f;
    public final TLRPC.InputPeer f0;
    public final boolean g;
    public final long g0;
    public final boolean h;
    public final String h0;
    public final long i;
    public final TLRPC.InputMedia i0;
    public final long j;
    public final fk2 j0;
    public final int k;
    public final ArrayList k0;
    public final int l;
    public final int m;
    public final int n;
    public final zl6 o;
    public final int p;
    public final int q;
    public final long r;
    public final float[] s;
    public final int t;
    public final int u;
    public final String v;
    public final ArrayList w;
    public final ArrayList x;
    public final String y;
    public final String z;

    public iq3(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.s = new float[9];
        this.x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.c = readString;
            if (readString != null && readString.length() == 0) {
                this.c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f = null;
            }
            this.g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.i = nativeByteBuffer.readInt64(true);
            this.j = nativeByteBuffer.readInt64(true);
            this.k = nativeByteBuffer.readInt32(true);
            this.l = nativeByteBuffer.readInt32(true);
            this.m = nativeByteBuffer.readInt32(true);
            this.n = nativeByteBuffer.readInt32(true);
            this.p = nativeByteBuffer.readInt32(true);
            this.q = nativeByteBuffer.readInt32(true);
            this.r = nativeByteBuffer.readInt64(true);
            int i = 0;
            while (true) {
                float[] fArr = this.s;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = nativeByteBuffer.readFloat(true);
                i++;
            }
            this.t = nativeByteBuffer.readInt32(true);
            this.u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i2 = 0; i2 < readInt322; i2++) {
                    if (this.w == null) {
                        this.w = new ArrayList();
                    }
                    this.w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.x.clear();
                    for (int i3 = 0; i3 < readInt323; i3++) {
                        this.x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i4 = 0; i4 < readInt324; i4++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new mac(nativeByteBuffer, true, true));
                        }
                        if (nativeByteBuffer.readInt32(true) == 481674261) {
                            int readInt325 = nativeByteBuffer.readInt32(true);
                            for (int i5 = 0; i5 < readInt325; i5++) {
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
                                lm6 lm6Var = new lm6();
                                this.E = lm6Var;
                                lm6Var.a = nativeByteBuffer.readFloat(true);
                                lm6Var.b = nativeByteBuffer.readFloat(true);
                                lm6Var.c = nativeByteBuffer.readFloat(true);
                                lm6Var.d = nativeByteBuffer.readFloat(true);
                                lm6Var.e = nativeByteBuffer.readFloat(true);
                                lm6Var.f = nativeByteBuffer.readFloat(true);
                                lm6Var.g = nativeByteBuffer.readFloat(true);
                                lm6Var.h = nativeByteBuffer.readInt32(true);
                                lm6Var.i = nativeByteBuffer.readInt32(true);
                                lm6Var.j = nativeByteBuffer.readFloat(true);
                                lm6Var.k = nativeByteBuffer.readFloat(true);
                                lm6Var.l = nativeByteBuffer.readFloat(true);
                                lm6Var.m = nativeByteBuffer.readFloat(true);
                                lm6Var.n = nativeByteBuffer.readInt32(true);
                                lm6Var.o = nativeByteBuffer.readFloat(true);
                                ko koVar = lm6Var.p;
                                ((j58) koVar.b).c(nativeByteBuffer);
                                ((j58) koVar.c).c(nativeByteBuffer);
                                ((j58) koVar.d).c(nativeByteBuffer);
                                ((j58) koVar.e).c(nativeByteBuffer);
                                lm6Var.q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    lm6Var.r = null;
                                } else {
                                    PointF pointF = lm6Var.r;
                                    if (pointF == null) {
                                        pointF = new PointF();
                                        lm6Var.r = pointF;
                                    }
                                    pointF.x = nativeByteBuffer.readFloat(true);
                                    lm6Var.r.y = nativeByteBuffer.readFloat(true);
                                }
                                lm6Var.s = nativeByteBuffer.readFloat(true);
                                lm6Var.t = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() >= 4) {
                                this.F = nativeByteBuffer.readInt32(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                if (nativeByteBuffer.readInt32(true) == 481674261) {
                                    nativeByteBuffer.readInt32(true);
                                } else {
                                    wn4.j("Vector magic in StoryDraft parse error (5)");
                                    throw null;
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
                                this.z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.z = null;
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
                                this.f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.a0 = nativeByteBuffer.readInt64(true);
                                this.b0 = nativeByteBuffer.readFloat(true);
                                this.c0 = nativeByteBuffer.readFloat(true);
                                this.d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.g0 = nativeByteBuffer.readInt64(true);
                                this.h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.j0 = new fk2(nativeByteBuffer.readString(true));
                                this.k0 = new ArrayList();
                                for (int i6 = 0; i6 < this.j0.e.size(); i6++) {
                                    nac nacVar = new nac();
                                    nacVar.readParams(nativeByteBuffer, true);
                                    nacVar.r = (ek2) this.j0.e.get(i6);
                                    this.k0.add(nacVar);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                zl6 zl6Var = new zl6();
                                this.o = zl6Var;
                                zl6Var.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && (readInt32 = nativeByteBuffer.readInt32(true)) == 448771445) {
                                this.P = TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, readInt32, true);
                                return;
                            }
                            return;
                        }
                        wn4.j("Vector magic in StoryDraft parse error (4)");
                        throw null;
                    }
                    wn4.j("Vector magic in StoryDraft parse error (3)");
                    throw null;
                }
                wn4.j("Vector magic in StoryDraft parse error (2)");
                throw null;
            }
            wn4.j("Vector magic in StoryDraft parse error (1)");
            throw null;
        }
        wn4.j("StoryDraft parse error");
        throw null;
    }

    public final f4b a() {
        f4b f4bVar = new f4b();
        f4bVar.b = this.a;
        f4bVar.c = true;
        f4bVar.d = this.b;
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            f4bVar.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            f4bVar.N0 = new File(str2);
        }
        f4bVar.K = this.e;
        String str3 = this.f;
        if (str3 != null) {
            f4bVar.L = new File(str3);
        }
        f4bVar.M = this.g;
        f4bVar.Y = this.h;
        long j = this.r;
        f4bVar.h0 = j;
        if (j > 0) {
            float f = (float) j;
            f4bVar.Z = ((float) this.i) / f;
            f4bVar.a0 = ((float) this.j) / f;
        } else {
            f4bVar.Z = 0.0f;
            f4bVar.a0 = 1.0f;
        }
        f4bVar.Q = this.k;
        f4bVar.R = this.l;
        f4bVar.k0 = this.m;
        f4bVar.l0 = this.n;
        f4bVar.m0 = this.o;
        f4bVar.i0 = this.p;
        f4bVar.j0 = this.q;
        f4bVar.n0.setValues(this.s);
        f4bVar.A0 = this.t;
        f4bVar.B0 = this.u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (bkb.n2 == null) {
                bkb.P();
            }
            CharSequence m = vu3.m(spannableString, bkb.n2.getFontMetricsInt(), true, null, 0);
            k27.b(m, this.w, true, false, true, false, 0);
            f4bVar.C0 = k27.A5(m, this.w, bkb.n2.getFontMetricsInt(), false);
        } else {
            f4bVar.C0 = "";
        }
        ArrayList arrayList2 = f4bVar.F0;
        arrayList2.clear();
        arrayList2.addAll(this.x);
        String str5 = this.y;
        if (str5 != null) {
            f4bVar.P0 = new File(str5);
        }
        String str6 = this.z;
        if (str6 != null) {
            f4bVar.R0 = new File(str6);
        }
        f4bVar.S0 = this.A;
        f4bVar.T0 = this.B;
        f4bVar.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            f4bVar.Z0 = new File(str7);
        }
        f4bVar.a1 = this.E;
        f4bVar.I0 = this.F;
        f4bVar.g = this.G;
        f4bVar.f = this.H;
        f4bVar.e = this.I;
        f4bVar.J = this.L;
        f4bVar.I = this.K;
        f4bVar.H = this.J;
        f4bVar.w = this.M;
        f4bVar.x = this.N;
        f4bVar.y = this.O;
        f4bVar.z = this.P;
        f4bVar.A = this.Q;
        f4bVar.B = this.R;
        f4bVar.C = this.S;
        f4bVar.D = this.T;
        f4bVar.E = this.U;
        f4bVar.F = this.V;
        f4bVar.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            f4bVar.o0 = new File(str8);
        }
        f4bVar.p0 = this.Y;
        f4bVar.q0 = this.Z;
        f4bVar.r0 = this.a0;
        f4bVar.s0 = this.b0;
        f4bVar.t0 = this.c0;
        f4bVar.u0 = this.d0;
        f4bVar.P = this.e0;
        f4bVar.v0 = this.f0;
        f4bVar.J0 = this.g0;
        f4bVar.K0 = this.h0;
        f4bVar.L0 = this.i0;
        f4bVar.S = this.j0;
        int i2 = nac.C;
        ArrayList arrayList3 = this.k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                nac nacVar = (nac) obj;
                f4b f4bVar2 = new f4b();
                f4bVar2.K = nacVar.b;
                f4bVar2.Y = nacVar.c;
                f4bVar2.L = new File(nacVar.d);
                f4bVar2.P = nacVar.e;
                f4bVar2.U = nacVar.i;
                f4bVar2.X = nacVar.f;
                f4bVar2.V = nacVar.j;
                f4bVar2.W = nacVar.k;
                f4bVar2.k0 = nacVar.l;
                f4bVar2.l0 = nacVar.m;
                f4bVar2.h0 = nacVar.o;
                arrayList.add(f4bVar2);
            }
        }
        f4bVar.T = arrayList;
        return f4bVar;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.b);
        nativeByteBuffer.writeString(this.c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f);
        nativeByteBuffer.writeBool(this.g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.i);
        nativeByteBuffer.writeInt64(this.j);
        nativeByteBuffer.writeInt32(this.k);
        nativeByteBuffer.writeInt32(this.l);
        nativeByteBuffer.writeInt32(this.m);
        nativeByteBuffer.writeInt32(this.n);
        nativeByteBuffer.writeInt32(this.p);
        nativeByteBuffer.writeInt32(this.q);
        nativeByteBuffer.writeInt64(this.r);
        int i = 0;
        int i2 = 0;
        while (true) {
            float[] fArr = this.s;
            if (i2 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i2]);
            i2++;
        }
        nativeByteBuffer.writeInt32(this.t);
        nativeByteBuffer.writeInt32(this.u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.w;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        nativeByteBuffer.writeInt32(size);
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                ((TLRPC.MessageEntity) arrayList2.get(i3)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList3 = this.x;
        if (arrayList3 == null) {
            size2 = 0;
        } else {
            size2 = arrayList3.size();
        }
        nativeByteBuffer.writeInt32(size2);
        if (arrayList3 != null) {
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                ((TLRPC.InputPrivacyRule) arrayList3.get(i4)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeBool(false);
        nativeByteBuffer.writeString(this.y);
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
            for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                ((mac) arrayList4.get(i5)).b(nativeByteBuffer, true);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList5 = this.C;
        if (arrayList5 == null) {
            size4 = 0;
        } else {
            size4 = arrayList5.size();
        }
        nativeByteBuffer.writeInt32(size4);
        if (arrayList5 != null) {
            for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                ((TLRPC.InputDocument) arrayList5.get(i6)).serializeToStream(nativeByteBuffer);
            }
        }
        String str = "";
        String str2 = this.D;
        if (str2 == null) {
            str2 = "";
        }
        nativeByteBuffer.writeString(str2);
        lm6 lm6Var = this.E;
        if (lm6Var == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            nativeByteBuffer.writeFloat(lm6Var.a);
            nativeByteBuffer.writeFloat(lm6Var.b);
            nativeByteBuffer.writeFloat(lm6Var.c);
            nativeByteBuffer.writeFloat(lm6Var.d);
            nativeByteBuffer.writeFloat(lm6Var.e);
            nativeByteBuffer.writeFloat(lm6Var.f);
            nativeByteBuffer.writeFloat(lm6Var.g);
            nativeByteBuffer.writeInt32(lm6Var.h);
            nativeByteBuffer.writeInt32(lm6Var.i);
            nativeByteBuffer.writeFloat(lm6Var.j);
            nativeByteBuffer.writeFloat(lm6Var.k);
            nativeByteBuffer.writeFloat(lm6Var.l);
            nativeByteBuffer.writeFloat(lm6Var.m);
            nativeByteBuffer.writeInt32(lm6Var.n);
            nativeByteBuffer.writeFloat(lm6Var.o);
            ko koVar = lm6Var.p;
            ((j58) koVar.b).d(nativeByteBuffer);
            ((j58) koVar.c).d(nativeByteBuffer);
            ((j58) koVar.d).d(nativeByteBuffer);
            ((j58) koVar.e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(lm6Var.q);
            if (lm6Var.r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(lm6Var.r.x);
                nativeByteBuffer.writeFloat(lm6Var.r.y);
            }
            nativeByteBuffer.writeFloat(lm6Var.s);
            nativeByteBuffer.writeFloat(lm6Var.t);
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
        nativeByteBuffer.writeString(this.z);
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
        TLRPC.InputPeer inputPeer = this.f0;
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
            nativeByteBuffer.writeInt64(this.a0);
            nativeByteBuffer.writeFloat(this.b0);
            nativeByteBuffer.writeFloat(this.c0);
            nativeByteBuffer.writeFloat(this.d0);
        }
        nativeByteBuffer.writeFloat(this.e0);
        nativeByteBuffer.writeInt64(this.g0);
        String str7 = this.h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        fk2 fk2Var = this.j0;
        if (fk2Var != null && fk2Var.e.size() > 1 && (arrayList = this.k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(fk2Var.a);
            int size5 = arrayList.size();
            while (i < size5) {
                Object obj = arrayList.get(i);
                i++;
                ((nac) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        zl6 zl6Var = this.o;
        if (zl6Var == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            zl6Var.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public iq3(f4b f4bVar) {
        float[] fArr = new float[9];
        this.s = fArr;
        ArrayList arrayList = new ArrayList();
        this.x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.a = f4bVar.b;
        this.b = f4bVar.d;
        File file = f4bVar.O0;
        this.c = file == null ? "" : file.toString();
        File file2 = f4bVar.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = f4bVar.K;
        File file3 = f4bVar.L;
        this.f = file3 == null ? "" : file3.toString();
        this.g = f4bVar.M;
        this.h = f4bVar.Y;
        float f = f4bVar.Z;
        long j = f4bVar.h0;
        float f2 = (float) j;
        this.i = f * f2;
        this.j = f4bVar.a0 * f2;
        this.k = f4bVar.Q;
        this.l = f4bVar.R;
        this.m = f4bVar.k0;
        this.n = f4bVar.l0;
        this.o = f4bVar.m0;
        this.p = f4bVar.i0;
        this.q = f4bVar.j0;
        this.r = j;
        f4bVar.n0.getValues(fArr);
        this.t = f4bVar.A0;
        this.u = f4bVar.B0;
        CharSequence[] charSequenceArr = {f4bVar.C0};
        this.w = f4bVar.D0 ? hq6.d0(f4bVar.a).Y(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(f4bVar.F0);
        File file4 = f4bVar.P0;
        this.y = file4 == null ? "" : file4.toString();
        File file5 = f4bVar.R0;
        this.z = file5 == null ? "" : file5.toString();
        this.A = f4bVar.S0;
        this.B = f4bVar.T0;
        this.C = f4bVar.U0;
        File file6 = f4bVar.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = f4bVar.a1;
        this.F = f4bVar.I0;
        this.M = f4bVar.w;
        this.N = f4bVar.x;
        this.O = f4bVar.y;
        this.P = f4bVar.z;
        this.Q = f4bVar.A;
        this.R = f4bVar.B;
        this.S = f4bVar.C;
        this.T = f4bVar.D;
        this.U = f4bVar.E;
        this.V = f4bVar.F;
        this.W = f4bVar.G;
        File file7 = f4bVar.o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = f4bVar.p0;
        this.Z = f4bVar.q0;
        this.a0 = f4bVar.r0;
        this.b0 = f4bVar.s0;
        this.c0 = f4bVar.t0;
        this.d0 = f4bVar.u0;
        this.e0 = f4bVar.P;
        this.f0 = f4bVar.v0;
        this.g0 = f4bVar.J0;
        this.h0 = f4bVar.K0;
        this.i0 = f4bVar.L0;
        this.j0 = f4bVar.S;
        this.k0 = nac.a(f4bVar);
    }
}
