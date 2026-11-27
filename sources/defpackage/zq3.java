package defpackage;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class zq3 {
    public final long A;
    public final ArrayList B;
    public final ArrayList C;
    public final String D;
    public final po6 E;
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
    public final al2 j0;
    public final int k;
    public final ArrayList k0;
    public final int l;
    public final int m;
    public final int n;
    public final fo6 o;
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

    public zq3(NativeByteBuffer nativeByteBuffer) {
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
                            this.B.add(new mec(nativeByteBuffer, true, true));
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
                                po6 po6Var = new po6();
                                this.E = po6Var;
                                po6Var.a = nativeByteBuffer.readFloat(true);
                                po6Var.b = nativeByteBuffer.readFloat(true);
                                po6Var.c = nativeByteBuffer.readFloat(true);
                                po6Var.d = nativeByteBuffer.readFloat(true);
                                po6Var.e = nativeByteBuffer.readFloat(true);
                                po6Var.f = nativeByteBuffer.readFloat(true);
                                po6Var.g = nativeByteBuffer.readFloat(true);
                                po6Var.h = nativeByteBuffer.readInt32(true);
                                po6Var.i = nativeByteBuffer.readInt32(true);
                                po6Var.j = nativeByteBuffer.readFloat(true);
                                po6Var.k = nativeByteBuffer.readFloat(true);
                                po6Var.l = nativeByteBuffer.readFloat(true);
                                po6Var.m = nativeByteBuffer.readFloat(true);
                                po6Var.n = nativeByteBuffer.readInt32(true);
                                po6Var.o = nativeByteBuffer.readFloat(true);
                                lo loVar = po6Var.p;
                                ((a98) loVar.b).c(nativeByteBuffer);
                                ((a98) loVar.c).c(nativeByteBuffer);
                                ((a98) loVar.d).c(nativeByteBuffer);
                                ((a98) loVar.e).c(nativeByteBuffer);
                                po6Var.q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    po6Var.r = null;
                                } else {
                                    PointF pointF = po6Var.r;
                                    if (pointF == null) {
                                        pointF = new PointF();
                                        po6Var.r = pointF;
                                    }
                                    pointF.x = nativeByteBuffer.readFloat(true);
                                    po6Var.r.y = nativeByteBuffer.readFloat(true);
                                }
                                po6Var.s = nativeByteBuffer.readFloat(true);
                                po6Var.t = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() >= 4) {
                                this.F = nativeByteBuffer.readInt32(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                if (nativeByteBuffer.readInt32(true) == 481674261) {
                                    nativeByteBuffer.readInt32(true);
                                } else {
                                    xi4.l("Vector magic in StoryDraft parse error (5)");
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
                                this.j0 = new al2(nativeByteBuffer.readString(true));
                                this.k0 = new ArrayList();
                                for (int i6 = 0; i6 < this.j0.e.size(); i6++) {
                                    nec necVar = new nec();
                                    necVar.readParams(nativeByteBuffer, true);
                                    necVar.r = (zk2) this.j0.e.get(i6);
                                    this.k0.add(necVar);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                fo6 fo6Var = new fo6();
                                this.o = fo6Var;
                                fo6Var.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && (readInt32 = nativeByteBuffer.readInt32(true)) == 448771445) {
                                this.P = TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, readInt32, true);
                                return;
                            }
                            return;
                        }
                        xi4.l("Vector magic in StoryDraft parse error (4)");
                        throw null;
                    }
                    xi4.l("Vector magic in StoryDraft parse error (3)");
                    throw null;
                }
                xi4.l("Vector magic in StoryDraft parse error (2)");
                throw null;
            }
            xi4.l("Vector magic in StoryDraft parse error (1)");
            throw null;
        }
        xi4.l("StoryDraft parse error");
        throw null;
    }

    public final c8b a() {
        c8b c8bVar = new c8b();
        c8bVar.b = this.a;
        c8bVar.c = true;
        c8bVar.d = this.b;
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            c8bVar.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            c8bVar.N0 = new File(str2);
        }
        c8bVar.K = this.e;
        String str3 = this.f;
        if (str3 != null) {
            c8bVar.L = new File(str3);
        }
        c8bVar.M = this.g;
        c8bVar.Y = this.h;
        long j = this.r;
        c8bVar.h0 = j;
        if (j > 0) {
            float f = (float) j;
            c8bVar.Z = ((float) this.i) / f;
            c8bVar.a0 = ((float) this.j) / f;
        } else {
            c8bVar.Z = 0.0f;
            c8bVar.a0 = 1.0f;
        }
        c8bVar.Q = this.k;
        c8bVar.R = this.l;
        c8bVar.k0 = this.m;
        c8bVar.l0 = this.n;
        c8bVar.m0 = this.o;
        c8bVar.i0 = this.p;
        c8bVar.j0 = this.q;
        c8bVar.n0.setValues(this.s);
        c8bVar.A0 = this.t;
        c8bVar.B0 = this.u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (aob.o2 == null) {
                aob.P();
            }
            CharSequence m = pv3.m(spannableString, aob.o2.getFontMetricsInt(), true, null, 0);
            r47.b(m, this.w, true, false, true, false, 0);
            c8bVar.C0 = r47.A5(m, this.w, aob.o2.getFontMetricsInt(), false);
        } else {
            c8bVar.C0 = "";
        }
        ArrayList arrayList2 = c8bVar.F0;
        arrayList2.clear();
        arrayList2.addAll(this.x);
        String str5 = this.y;
        if (str5 != null) {
            c8bVar.P0 = new File(str5);
        }
        String str6 = this.z;
        if (str6 != null) {
            c8bVar.R0 = new File(str6);
        }
        c8bVar.S0 = this.A;
        c8bVar.T0 = this.B;
        c8bVar.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            c8bVar.Z0 = new File(str7);
        }
        c8bVar.a1 = this.E;
        c8bVar.I0 = this.F;
        c8bVar.g = this.G;
        c8bVar.f = this.H;
        c8bVar.e = this.I;
        c8bVar.J = this.L;
        c8bVar.I = this.K;
        c8bVar.H = this.J;
        c8bVar.w = this.M;
        c8bVar.x = this.N;
        c8bVar.y = this.O;
        c8bVar.z = this.P;
        c8bVar.A = this.Q;
        c8bVar.B = this.R;
        c8bVar.C = this.S;
        c8bVar.D = this.T;
        c8bVar.E = this.U;
        c8bVar.F = this.V;
        c8bVar.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            c8bVar.o0 = new File(str8);
        }
        c8bVar.p0 = this.Y;
        c8bVar.q0 = this.Z;
        c8bVar.r0 = this.a0;
        c8bVar.s0 = this.b0;
        c8bVar.t0 = this.c0;
        c8bVar.u0 = this.d0;
        c8bVar.P = this.e0;
        c8bVar.v0 = this.f0;
        c8bVar.J0 = this.g0;
        c8bVar.K0 = this.h0;
        c8bVar.L0 = this.i0;
        c8bVar.S = this.j0;
        int i2 = nec.C;
        ArrayList arrayList3 = this.k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                nec necVar = (nec) obj;
                c8b c8bVar2 = new c8b();
                c8bVar2.K = necVar.b;
                c8bVar2.Y = necVar.c;
                c8bVar2.L = new File(necVar.d);
                c8bVar2.P = necVar.e;
                c8bVar2.U = necVar.i;
                c8bVar2.X = necVar.f;
                c8bVar2.V = necVar.j;
                c8bVar2.W = necVar.k;
                c8bVar2.k0 = necVar.l;
                c8bVar2.l0 = necVar.m;
                c8bVar2.h0 = necVar.o;
                arrayList.add(c8bVar2);
            }
        }
        c8bVar.T = arrayList;
        return c8bVar;
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
                ((mec) arrayList4.get(i5)).b(nativeByteBuffer, true);
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
        po6 po6Var = this.E;
        if (po6Var == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            nativeByteBuffer.writeFloat(po6Var.a);
            nativeByteBuffer.writeFloat(po6Var.b);
            nativeByteBuffer.writeFloat(po6Var.c);
            nativeByteBuffer.writeFloat(po6Var.d);
            nativeByteBuffer.writeFloat(po6Var.e);
            nativeByteBuffer.writeFloat(po6Var.f);
            nativeByteBuffer.writeFloat(po6Var.g);
            nativeByteBuffer.writeInt32(po6Var.h);
            nativeByteBuffer.writeInt32(po6Var.i);
            nativeByteBuffer.writeFloat(po6Var.j);
            nativeByteBuffer.writeFloat(po6Var.k);
            nativeByteBuffer.writeFloat(po6Var.l);
            nativeByteBuffer.writeFloat(po6Var.m);
            nativeByteBuffer.writeInt32(po6Var.n);
            nativeByteBuffer.writeFloat(po6Var.o);
            lo loVar = po6Var.p;
            ((a98) loVar.b).d(nativeByteBuffer);
            ((a98) loVar.c).d(nativeByteBuffer);
            ((a98) loVar.d).d(nativeByteBuffer);
            ((a98) loVar.e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(po6Var.q);
            if (po6Var.r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(po6Var.r.x);
                nativeByteBuffer.writeFloat(po6Var.r.y);
            }
            nativeByteBuffer.writeFloat(po6Var.s);
            nativeByteBuffer.writeFloat(po6Var.t);
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
        al2 al2Var = this.j0;
        if (al2Var != null && al2Var.e.size() > 1 && (arrayList = this.k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(al2Var.a);
            int size5 = arrayList.size();
            while (i < size5) {
                Object obj = arrayList.get(i);
                i++;
                ((nec) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        fo6 fo6Var = this.o;
        if (fo6Var == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            fo6Var.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public zq3(c8b c8bVar) {
        float[] fArr = new float[9];
        this.s = fArr;
        ArrayList arrayList = new ArrayList();
        this.x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.a = c8bVar.b;
        this.b = c8bVar.d;
        File file = c8bVar.O0;
        this.c = file == null ? "" : file.toString();
        File file2 = c8bVar.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = c8bVar.K;
        File file3 = c8bVar.L;
        this.f = file3 == null ? "" : file3.toString();
        this.g = c8bVar.M;
        this.h = c8bVar.Y;
        float f = c8bVar.Z;
        long j = c8bVar.h0;
        float f2 = (float) j;
        this.i = f * f2;
        this.j = c8bVar.a0 * f2;
        this.k = c8bVar.Q;
        this.l = c8bVar.R;
        this.m = c8bVar.k0;
        this.n = c8bVar.l0;
        this.o = c8bVar.m0;
        this.p = c8bVar.i0;
        this.q = c8bVar.j0;
        this.r = j;
        c8bVar.n0.getValues(fArr);
        this.t = c8bVar.A0;
        this.u = c8bVar.B0;
        CharSequence[] charSequenceArr = {c8bVar.C0};
        this.w = c8bVar.D0 ? ls6.d0(c8bVar.a).Y(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(c8bVar.F0);
        File file4 = c8bVar.P0;
        this.y = file4 == null ? "" : file4.toString();
        File file5 = c8bVar.R0;
        this.z = file5 == null ? "" : file5.toString();
        this.A = c8bVar.S0;
        this.B = c8bVar.T0;
        this.C = c8bVar.U0;
        File file6 = c8bVar.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = c8bVar.a1;
        this.F = c8bVar.I0;
        this.M = c8bVar.w;
        this.N = c8bVar.x;
        this.O = c8bVar.y;
        this.P = c8bVar.z;
        this.Q = c8bVar.A;
        this.R = c8bVar.B;
        this.S = c8bVar.C;
        this.T = c8bVar.D;
        this.U = c8bVar.E;
        this.V = c8bVar.F;
        this.W = c8bVar.G;
        File file7 = c8bVar.o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = c8bVar.p0;
        this.Z = c8bVar.q0;
        this.a0 = c8bVar.r0;
        this.b0 = c8bVar.s0;
        this.c0 = c8bVar.t0;
        this.d0 = c8bVar.u0;
        this.e0 = c8bVar.P;
        this.f0 = c8bVar.v0;
        this.g0 = c8bVar.J0;
        this.h0 = c8bVar.K0;
        this.i0 = c8bVar.L0;
        this.j0 = c8bVar.S;
        this.k0 = nec.a(c8bVar);
    }
}
