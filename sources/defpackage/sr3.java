package defpackage;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class sr3 {
    public final long A;
    public final ArrayList B;
    public final ArrayList C;
    public final String D;
    public final lo6 E;
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
    public final sl2 j0;
    public final int k;
    public final ArrayList k0;
    public final int l;
    public final int m;
    public final int n;
    public final ao6 o;
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

    public sr3(NativeByteBuffer nativeByteBuffer) {
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
                            this.B.add(new pcc(nativeByteBuffer, true, true));
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
                                lo6 lo6Var = new lo6();
                                this.E = lo6Var;
                                lo6Var.a = nativeByteBuffer.readFloat(true);
                                lo6Var.b = nativeByteBuffer.readFloat(true);
                                lo6Var.c = nativeByteBuffer.readFloat(true);
                                lo6Var.d = nativeByteBuffer.readFloat(true);
                                lo6Var.e = nativeByteBuffer.readFloat(true);
                                lo6Var.f = nativeByteBuffer.readFloat(true);
                                lo6Var.g = nativeByteBuffer.readFloat(true);
                                lo6Var.h = nativeByteBuffer.readInt32(true);
                                lo6Var.i = nativeByteBuffer.readInt32(true);
                                lo6Var.j = nativeByteBuffer.readFloat(true);
                                lo6Var.k = nativeByteBuffer.readFloat(true);
                                lo6Var.l = nativeByteBuffer.readFloat(true);
                                lo6Var.m = nativeByteBuffer.readFloat(true);
                                lo6Var.n = nativeByteBuffer.readInt32(true);
                                lo6Var.o = nativeByteBuffer.readFloat(true);
                                kp kpVar = lo6Var.p;
                                ((l78) kpVar.b).c(nativeByteBuffer);
                                ((l78) kpVar.c).c(nativeByteBuffer);
                                ((l78) kpVar.d).c(nativeByteBuffer);
                                ((l78) kpVar.e).c(nativeByteBuffer);
                                lo6Var.q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    lo6Var.r = null;
                                } else {
                                    PointF pointF = lo6Var.r;
                                    if (pointF == null) {
                                        pointF = new PointF();
                                        lo6Var.r = pointF;
                                    }
                                    pointF.x = nativeByteBuffer.readFloat(true);
                                    lo6Var.r.y = nativeByteBuffer.readFloat(true);
                                }
                                lo6Var.s = nativeByteBuffer.readFloat(true);
                                lo6Var.t = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() >= 4) {
                                this.F = nativeByteBuffer.readInt32(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                if (nativeByteBuffer.readInt32(true) == 481674261) {
                                    nativeByteBuffer.readInt32(true);
                                } else {
                                    zo4.k("Vector magic in StoryDraft parse error (5)");
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
                                this.j0 = new sl2(nativeByteBuffer.readString(true));
                                this.k0 = new ArrayList();
                                for (int i6 = 0; i6 < this.j0.e.size(); i6++) {
                                    qcc qccVar = new qcc();
                                    qccVar.readParams(nativeByteBuffer, true);
                                    qccVar.r = (rl2) this.j0.e.get(i6);
                                    this.k0.add(qccVar);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                ao6 ao6Var = new ao6();
                                this.o = ao6Var;
                                ao6Var.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && (readInt32 = nativeByteBuffer.readInt32(true)) == 448771445) {
                                this.P = TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, readInt32, true);
                                return;
                            }
                            return;
                        }
                        zo4.k("Vector magic in StoryDraft parse error (4)");
                        throw null;
                    }
                    zo4.k("Vector magic in StoryDraft parse error (3)");
                    throw null;
                }
                zo4.k("Vector magic in StoryDraft parse error (2)");
                throw null;
            }
            zo4.k("Vector magic in StoryDraft parse error (1)");
            throw null;
        }
        zo4.k("StoryDraft parse error");
        throw null;
    }

    public final g6b a() {
        g6b g6bVar = new g6b();
        g6bVar.b = this.a;
        g6bVar.c = true;
        g6bVar.d = this.b;
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            g6bVar.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            g6bVar.N0 = new File(str2);
        }
        g6bVar.K = this.e;
        String str3 = this.f;
        if (str3 != null) {
            g6bVar.L = new File(str3);
        }
        g6bVar.M = this.g;
        g6bVar.Y = this.h;
        long j = this.r;
        g6bVar.h0 = j;
        if (j > 0) {
            float f = (float) j;
            g6bVar.Z = ((float) this.i) / f;
            g6bVar.a0 = ((float) this.j) / f;
        } else {
            g6bVar.Z = 0.0f;
            g6bVar.a0 = 1.0f;
        }
        g6bVar.Q = this.k;
        g6bVar.R = this.l;
        g6bVar.k0 = this.m;
        g6bVar.l0 = this.n;
        g6bVar.m0 = this.o;
        g6bVar.i0 = this.p;
        g6bVar.j0 = this.q;
        g6bVar.n0.setValues(this.s);
        g6bVar.A0 = this.t;
        g6bVar.B0 = this.u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (cmb.n2 == null) {
                cmb.P();
            }
            CharSequence m = gw3.m(spannableString, cmb.n2.getFontMetricsInt(), true, null, 0);
            k47.b(m, this.w, true, false, true, false, 0);
            g6bVar.C0 = k47.A5(m, this.w, cmb.n2.getFontMetricsInt(), false);
        } else {
            g6bVar.C0 = "";
        }
        ArrayList arrayList2 = g6bVar.F0;
        arrayList2.clear();
        arrayList2.addAll(this.x);
        String str5 = this.y;
        if (str5 != null) {
            g6bVar.P0 = new File(str5);
        }
        String str6 = this.z;
        if (str6 != null) {
            g6bVar.R0 = new File(str6);
        }
        g6bVar.S0 = this.A;
        g6bVar.T0 = this.B;
        g6bVar.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            g6bVar.Z0 = new File(str7);
        }
        g6bVar.a1 = this.E;
        g6bVar.I0 = this.F;
        g6bVar.g = this.G;
        g6bVar.f = this.H;
        g6bVar.e = this.I;
        g6bVar.J = this.L;
        g6bVar.I = this.K;
        g6bVar.H = this.J;
        g6bVar.w = this.M;
        g6bVar.x = this.N;
        g6bVar.y = this.O;
        g6bVar.z = this.P;
        g6bVar.A = this.Q;
        g6bVar.B = this.R;
        g6bVar.C = this.S;
        g6bVar.D = this.T;
        g6bVar.E = this.U;
        g6bVar.F = this.V;
        g6bVar.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            g6bVar.o0 = new File(str8);
        }
        g6bVar.p0 = this.Y;
        g6bVar.q0 = this.Z;
        g6bVar.r0 = this.a0;
        g6bVar.s0 = this.b0;
        g6bVar.t0 = this.c0;
        g6bVar.u0 = this.d0;
        g6bVar.P = this.e0;
        g6bVar.v0 = this.f0;
        g6bVar.J0 = this.g0;
        g6bVar.K0 = this.h0;
        g6bVar.L0 = this.i0;
        g6bVar.S = this.j0;
        int i2 = qcc.C;
        ArrayList arrayList3 = this.k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                qcc qccVar = (qcc) obj;
                g6b g6bVar2 = new g6b();
                g6bVar2.K = qccVar.b;
                g6bVar2.Y = qccVar.c;
                g6bVar2.L = new File(qccVar.d);
                g6bVar2.P = qccVar.e;
                g6bVar2.U = qccVar.i;
                g6bVar2.X = qccVar.f;
                g6bVar2.V = qccVar.j;
                g6bVar2.W = qccVar.k;
                g6bVar2.k0 = qccVar.l;
                g6bVar2.l0 = qccVar.m;
                g6bVar2.h0 = qccVar.o;
                arrayList.add(g6bVar2);
            }
        }
        g6bVar.T = arrayList;
        return g6bVar;
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
                ((pcc) arrayList4.get(i5)).b(nativeByteBuffer, true);
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
        lo6 lo6Var = this.E;
        if (lo6Var == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            nativeByteBuffer.writeFloat(lo6Var.a);
            nativeByteBuffer.writeFloat(lo6Var.b);
            nativeByteBuffer.writeFloat(lo6Var.c);
            nativeByteBuffer.writeFloat(lo6Var.d);
            nativeByteBuffer.writeFloat(lo6Var.e);
            nativeByteBuffer.writeFloat(lo6Var.f);
            nativeByteBuffer.writeFloat(lo6Var.g);
            nativeByteBuffer.writeInt32(lo6Var.h);
            nativeByteBuffer.writeInt32(lo6Var.i);
            nativeByteBuffer.writeFloat(lo6Var.j);
            nativeByteBuffer.writeFloat(lo6Var.k);
            nativeByteBuffer.writeFloat(lo6Var.l);
            nativeByteBuffer.writeFloat(lo6Var.m);
            nativeByteBuffer.writeInt32(lo6Var.n);
            nativeByteBuffer.writeFloat(lo6Var.o);
            kp kpVar = lo6Var.p;
            ((l78) kpVar.b).d(nativeByteBuffer);
            ((l78) kpVar.c).d(nativeByteBuffer);
            ((l78) kpVar.d).d(nativeByteBuffer);
            ((l78) kpVar.e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(lo6Var.q);
            if (lo6Var.r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(lo6Var.r.x);
                nativeByteBuffer.writeFloat(lo6Var.r.y);
            }
            nativeByteBuffer.writeFloat(lo6Var.s);
            nativeByteBuffer.writeFloat(lo6Var.t);
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
        sl2 sl2Var = this.j0;
        if (sl2Var != null && sl2Var.e.size() > 1 && (arrayList = this.k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(sl2Var.a);
            int size5 = arrayList.size();
            while (i < size5) {
                Object obj = arrayList.get(i);
                i++;
                ((qcc) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        ao6 ao6Var = this.o;
        if (ao6Var == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            ao6Var.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public sr3(g6b g6bVar) {
        float[] fArr = new float[9];
        this.s = fArr;
        ArrayList arrayList = new ArrayList();
        this.x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.a = g6bVar.b;
        this.b = g6bVar.d;
        File file = g6bVar.O0;
        this.c = file == null ? "" : file.toString();
        File file2 = g6bVar.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = g6bVar.K;
        File file3 = g6bVar.L;
        this.f = file3 == null ? "" : file3.toString();
        this.g = g6bVar.M;
        this.h = g6bVar.Y;
        float f = g6bVar.Z;
        long j = g6bVar.h0;
        float f2 = (float) j;
        this.i = f * f2;
        this.j = g6bVar.a0 * f2;
        this.k = g6bVar.Q;
        this.l = g6bVar.R;
        this.m = g6bVar.k0;
        this.n = g6bVar.l0;
        this.o = g6bVar.m0;
        this.p = g6bVar.i0;
        this.q = g6bVar.j0;
        this.r = j;
        g6bVar.n0.getValues(fArr);
        this.t = g6bVar.A0;
        this.u = g6bVar.B0;
        CharSequence[] charSequenceArr = {g6bVar.C0};
        this.w = g6bVar.D0 ? hs6.d0(g6bVar.a).Y(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(g6bVar.F0);
        File file4 = g6bVar.P0;
        this.y = file4 == null ? "" : file4.toString();
        File file5 = g6bVar.R0;
        this.z = file5 == null ? "" : file5.toString();
        this.A = g6bVar.S0;
        this.B = g6bVar.T0;
        this.C = g6bVar.U0;
        File file6 = g6bVar.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = g6bVar.a1;
        this.F = g6bVar.I0;
        this.M = g6bVar.w;
        this.N = g6bVar.x;
        this.O = g6bVar.y;
        this.P = g6bVar.z;
        this.Q = g6bVar.A;
        this.R = g6bVar.B;
        this.S = g6bVar.C;
        this.T = g6bVar.D;
        this.U = g6bVar.E;
        this.V = g6bVar.F;
        this.W = g6bVar.G;
        File file7 = g6bVar.o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = g6bVar.p0;
        this.Z = g6bVar.q0;
        this.a0 = g6bVar.r0;
        this.b0 = g6bVar.s0;
        this.c0 = g6bVar.t0;
        this.d0 = g6bVar.u0;
        this.e0 = g6bVar.P;
        this.f0 = g6bVar.v0;
        this.g0 = g6bVar.J0;
        this.h0 = g6bVar.K0;
        this.i0 = g6bVar.L0;
        this.j0 = g6bVar.S;
        this.k0 = qcc.a(g6bVar);
    }
}
