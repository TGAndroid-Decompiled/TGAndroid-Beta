package a3;

import ai.t5;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import b2.a2;
import b2.l1;
import b2.o1;
import b2.v0;
import b2.y1;
import e9.x1;
import i2.q1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import v7.u6;
public final class n extends r2.r {
    public static final int[] S1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean T1;
    public static boolean U1;
    public int A1;
    public q1 B1;
    public long C1;
    public boolean D1;
    public long E1;
    public int F1;
    public long G1;
    public a2 H1;
    public a2 I1;
    public int J1;
    public boolean K1;
    public int L1;
    public m M1;
    public y N1;
    public long O1;
    public long P1;
    public boolean Q1;
    public int R1;
    public final Context Z0;
    public final boolean f147a1;
    public final n4.s f148b1;
    public final int f149c1;
    public final boolean f150d1;
    public final a0 f151e1;
    public final z f152f1;
    public final n4.s f153g1;
    public final long f154h1;
    public final b0 f155i1;
    public final PriorityQueue f156j1;
    public l f157k1;
    public boolean l1;
    public boolean f158m1;
    public p0 f159n1;
    public boolean f160o1;
    public int f161p1;
    public List f162q1;
    public Surface f163r1;
    public p f164s1;
    public e2.y f165t1;
    public boolean f166u1;
    public int f167v1;
    public int f168w1;
    public long f169x1;
    public int f170y1;
    public int f171z1;

    public n(a3.k r8) {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.<init>(a3.k):void");
    }

    public static boolean D0(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.D0(java.lang.String):boolean");
    }

    public static int E0(r2.o r11, b2.w r12) {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.E0(r2.o, b2.w):int");
    }

    public static List F0(Context context, r2.i iVar, b2.w wVar, boolean z10, boolean z11) {
        List a2;
        String str = wVar.f4132s;
        if (str == null) {
            return x1.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c2.i.d(context)) {
            String c10 = r2.w.c(wVar);
            if (c10 == null) {
                a2 = x1.e;
            } else {
                a2 = iVar.a(c10, z10, z11);
            }
            if (!a2.isEmpty()) {
                return a2;
            }
        }
        return r2.w.g(iVar, wVar, z10, z11);
    }

    public static int G0(r2.o oVar, b2.w wVar) {
        int i10 = wVar.f4133t;
        List list = wVar.v;
        if (i10 != -1) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += ((byte[]) list.get(i12)).length;
            }
            return wVar.f4133t + i11;
        }
        return E0(oVar, wVar);
    }

    @Override
    public final void A(float f7, float f10) {
        super.A(f7, f10);
        p0 p0Var = this.f159n1;
        if (p0Var != null) {
            p0Var.a(f7);
        } else {
            this.f151e1.h(f7);
        }
        b0 b0Var = this.f155i1;
        if (b0Var != null) {
            b0Var.c(f7);
        }
    }

    @Override
    public final boolean E(long j10) {
        if (this.I0 == -9223372036854775807L || j10 < this.C1) {
            return false;
        }
        long j11 = this.Q0;
        if (j11 != -9223372036854775807L && j10 <= j11) {
            return false;
        }
        return true;
    }

    @Override
    public final i2.f H(r2.o oVar, b2.w wVar, b2.w wVar2, boolean z10) {
        int i10;
        int i11;
        i2.f b10 = oVar.b(wVar, wVar2);
        float f7 = wVar.D;
        float f10 = wVar2.D;
        int i12 = b10.e;
        l lVar = this.f157k1;
        lVar.getClass();
        if (wVar2.f4138z > lVar.f139a || wVar2.A > lVar.f140b) {
            i12 |= 256;
        }
        if (G0(oVar, wVar2) > lVar.f141c) {
            i12 |= 64;
        }
        if (this.f168w1 != Integer.MIN_VALUE && (i11 = Build.VERSION.SDK_INT) < 31 && ((i11 != 30 || Build.MODEL.startsWith("MiTV")) && f7 != -1.0f && f10 != -1.0f && (!oVar.f44982f || !z10))) {
            float max = Math.max(f10, f7) / Math.min(f10, f7);
            if (Math.abs(max - Math.round(max)) > 0.01f) {
                i12 |= 65536;
            }
        }
        int i13 = i12;
        String str = oVar.f44979a;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new i2.f(str, wVar, wVar2, i10, i13);
    }

    public final android.view.Surface H0(r2.o r6) {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.H0(r2.o):android.view.Surface");
    }

    @Override
    public final r2.n I(IllegalStateException illegalStateException, r2.o oVar) {
        Surface surface = this.f163r1;
        r2.n nVar = new r2.n(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return nVar;
    }

    public final boolean I0(r2.o oVar) {
        if (this.f159n1 == null) {
            Surface surface = this.f163r1;
            if (surface == null || !surface.isValid()) {
                if ((Build.VERSION.SDK_INT < 35 || !oVar.h) && !P0(oVar)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean J0(h2.h hVar) {
        if (k() || hVar.isLastSample()) {
            return true;
        }
        long j10 = this.P1;
        if (j10 == -9223372036854775807L || j10 - (hVar.e - this.P0.f44994c) <= 100000) {
            return true;
        }
        return false;
    }

    public final void K0() {
        if (this.f170y1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f169x1;
            int i10 = this.f170y1;
            n4.s sVar = this.f148b1;
            Handler handler = (Handler) sVar.f17128b;
            if (handler != null) {
                handler.post(new j0(sVar, i10, j10));
            }
            this.f170y1 = 0;
            this.f169x1 = elapsedRealtime;
        }
    }

    public final void L0() {
        r2.l lVar;
        if (this.K1 && (lVar = this.f44999d0) != null) {
            this.M1 = new m(this, lVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                lVar.setParameters(bundle);
            }
        }
    }

    public final void M0(r2.l lVar, int i10, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.h(i10, j10);
        Trace.endSection();
        this.O0.e++;
        boolean z10 = false;
        this.f171z1 = 0;
        if (this.f159n1 == null) {
            a2 a2Var = this.H1;
            boolean equals = a2Var.equals(a2.d);
            n4.s sVar = this.f148b1;
            if (!equals && !a2Var.equals(this.I1)) {
                this.I1 = a2Var;
                sVar.M(a2Var);
            }
            a0 a0Var = this.f151e1;
            if (a0Var.e != 3) {
                z10 = true;
            }
            a0Var.e = 3;
            a0Var.f64l.getClass();
            a0Var.f60g = e2.m0.S(SystemClock.elapsedRealtime());
            if (z10 && (surface = this.f163r1) != null) {
                sVar.G(surface);
                this.f166u1 = true;
            }
        }
    }

    public final void N0(Object obj) {
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            surface = null;
        }
        Surface surface2 = this.f163r1;
        n4.s sVar = this.f148b1;
        if (surface2 != surface) {
            this.f163r1 = surface;
            p0 p0Var = this.f159n1;
            a0 a0Var = this.f151e1;
            if (p0Var == null) {
                a0Var.g(surface);
            }
            this.f166u1 = false;
            int i10 = this.f12318n;
            r2.l lVar = this.f44999d0;
            if (lVar != null && this.f159n1 == null) {
                r2.o oVar = this.f45006k0;
                oVar.getClass();
                if (I0(oVar) && !this.l1) {
                    Surface H0 = H0(oVar);
                    if (H0 != null) {
                        try {
                            lVar.l(H0);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            throw new IllegalArgumentException(th2);
                        }
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        lVar.g();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    n0();
                    X();
                }
            }
            if (surface != null) {
                a2 a2Var = this.I1;
                if (a2Var != null) {
                    sVar.M(a2Var);
                }
            } else {
                this.I1 = null;
                p0 p0Var2 = this.f159n1;
                if (p0Var2 != null) {
                    p0Var2.k();
                }
            }
            if (i10 == 2) {
                p0 p0Var3 = this.f159n1;
                if (p0Var3 != null) {
                    p0Var3.q(true);
                } else {
                    a0Var.c(true);
                }
            }
            L0();
        } else if (surface != null) {
            a2 a2Var2 = this.I1;
            if (a2Var2 != null) {
                sVar.M(a2Var2);
            }
            Surface surface3 = this.f163r1;
            if (surface3 != null && this.f166u1) {
                sVar.G(surface3);
            }
        }
    }

    @Override
    public final int O(h2.h hVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            if ((this.B1 != null || this.K1) && hVar.e < this.f12321w && !J0(hVar)) {
                return 32;
            }
            return 0;
        }
        return 0;
    }

    public final boolean O0(long j10, long j11, boolean z10, boolean z11) {
        int B;
        if (this.f159n1 != null && this.f147a1) {
            j11 -= -this.O1;
        }
        if (j10 >= -500000 || z10 || (B = B(j11)) == 0) {
            return false;
        }
        this.C1 = j11;
        PriorityQueue priorityQueue = this.f156j1;
        if (z11) {
            i2.e eVar = this.O0;
            int i10 = eVar.d + B;
            eVar.d = i10;
            eVar.f12344f += this.A1;
            eVar.d = priorityQueue.size() + i10;
        } else {
            this.O0.f12347j++;
            R0(priorityQueue.size() + B, this.A1);
        }
        if (this.f44999d0 != null) {
            if (x0()) {
                n0();
                X();
            } else if (v0()) {
                M();
            } else {
                this.T0 = true;
            }
        }
        p0 p0Var = this.f159n1;
        if (p0Var != null) {
            p0Var.m(false);
        }
        return true;
    }

    @Override
    public final float P(float f7, b2.w wVar, b2.w[] wVarArr) {
        float f10;
        r2.o oVar;
        float f11 = -1.0f;
        for (b2.w wVar2 : wVarArr) {
            float f12 = wVar2.D;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            f10 = -1.0f;
        } else {
            f10 = f11 * f7;
        }
        if (this.B1 != null && (oVar = this.f45006k0) != null) {
            int i10 = wVar.f4138z;
            int i11 = wVar.A;
            float f13 = -3.4028235E38f;
            if (oVar.f44984i) {
                float f14 = oVar.f44987l;
                if (f14 != -3.4028235E38f && oVar.f44985j == i10 && oVar.f44986k == i11) {
                    f13 = f14;
                } else {
                    float f15 = 1024.0f;
                    if (oVar.g(i10, i11, 1024.0f)) {
                        f13 = 1024.0f;
                    } else {
                        f13 = 0.0f;
                        while (true) {
                            float f16 = f15 - f13;
                            if (Math.abs(f16) <= 5.0f) {
                                break;
                            }
                            float f17 = (f16 / 2.0f) + f13;
                            if (oVar.g(i10, i11, f17)) {
                                f13 = f17;
                            } else {
                                f15 = f17;
                            }
                        }
                    }
                    oVar.f44987l = f13;
                    oVar.f44985j = i10;
                    oVar.f44986k = i11;
                }
            }
            if (f10 != -1.0f) {
                return Math.max(f10, f13);
            }
            return f13;
        }
        return f10;
    }

    public final boolean P0(r2.o oVar) {
        if (!this.K1 && !D0(oVar.f44979a)) {
            if (!oVar.f44982f || p.b(this.Z0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final ArrayList Q(r2.i iVar, b2.w wVar, boolean z10) {
        boolean z11 = this.K1;
        Context context = this.Z0;
        List F0 = F0(context, iVar, wVar, z10, z11);
        HashMap hashMap = r2.w.f45024a;
        ArrayList arrayList = new ArrayList(F0);
        Collections.sort(arrayList, new t5(new org.telegram.ui.web.m(3, context, wVar), 4));
        return arrayList;
    }

    public final void Q0(r2.l lVar, int i10) {
        Trace.beginSection("skipVideoBuffer");
        lVar.d(i10);
        Trace.endSection();
        this.O0.f12344f++;
    }

    public final void R0(int i10, int i11) {
        i2.e eVar = this.O0;
        eVar.h += i10;
        int i12 = i10 + i11;
        eVar.f12345g += i12;
        this.f170y1 += i12;
        int i13 = this.f171z1 + i12;
        this.f171z1 = i13;
        eVar.f12346i = Math.max(i13, eVar.f12346i);
        int i14 = this.f149c1;
        if (i14 > 0 && this.f170y1 >= i14) {
            K0();
        }
    }

    public final void S0(u2.f0 f0Var) {
        o1 o1Var = this.F;
        if (o1Var.p()) {
            this.P1 = -9223372036854775807L;
            return;
        }
        int b10 = o1Var.b(f0Var.f47347a);
        if (b10 == -1) {
            this.P1 = -9223372036854775807L;
        } else {
            this.P1 = o1Var.f(b10, new l1(), false).d;
        }
    }

    @Override
    public final com.google.firebase.messaging.l T(r2.o oVar, b2.w wVar, MediaCrypto mediaCrypto, float f7) {
        b2.n nVar;
        int i10;
        l lVar;
        boolean z10;
        int i11;
        int i12;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i13;
        int i14;
        char c10;
        boolean z11;
        int i15;
        boolean z12;
        Pair b10;
        int E0;
        String str = oVar.f44981c;
        b2.w[] wVarArr = this.f12320s;
        wVarArr.getClass();
        int i16 = wVar.f4138z;
        float f10 = wVar.D;
        b2.n nVar2 = wVar.I;
        int i17 = wVar.A;
        int G0 = G0(oVar, wVar);
        if (wVarArr.length == 1) {
            if (G0 != -1 && (E0 = E0(oVar, wVar)) != -1) {
                G0 = Math.min((int) (G0 * 1.5f), E0);
            }
            lVar = new l(i16, i17, G0);
            nVar = nVar2;
            i10 = i17;
        } else {
            int length = wVarArr.length;
            int i18 = i16;
            int i19 = i17;
            int i20 = 0;
            boolean z13 = false;
            while (i20 < length) {
                b2.w wVar2 = wVarArr[i20];
                b2.w[] wVarArr2 = wVarArr;
                if (nVar2 != null && wVar2.I == null) {
                    b2.v a2 = wVar2.a();
                    a2.H = nVar2;
                    wVar2 = new b2.w(a2);
                }
                i2.f b11 = oVar.b(wVar, wVar2);
                int i21 = length;
                int i22 = wVar2.A;
                if (b11.d != 0) {
                    int i23 = wVar2.f4138z;
                    i14 = i20;
                    c10 = 65535;
                    if (i23 != -1 && i22 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    i18 = Math.max(i18, i23);
                    i19 = Math.max(i19, i22);
                    G0 = Math.max(G0, G0(oVar, wVar2));
                } else {
                    i14 = i20;
                    c10 = 65535;
                }
                length = i21;
                i20 = i14 + 1;
                wVarArr = wVarArr2;
            }
            if (z13) {
                e2.a.l("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i18 + "x" + i19);
                if (i17 > i16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i11 = i17;
                } else {
                    i11 = i16;
                }
                boolean z14 = z10;
                if (z10) {
                    i12 = i16;
                } else {
                    i12 = i17;
                }
                float f11 = i12 / i11;
                int i24 = 0;
                while (true) {
                    nVar = nVar2;
                    if (i24 >= 9) {
                        break;
                    }
                    int i25 = S1[i24];
                    int i26 = i24;
                    int i27 = (int) (i25 * f11);
                    if (i25 <= i11 || i27 <= i12) {
                        break;
                    }
                    if (!z14) {
                        i27 = i25;
                    }
                    if (!z14) {
                        i25 = i27;
                    }
                    int i28 = i12;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i13 = i11;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i13 = i11;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(e2.m0.g(i27, widthAlignment) * widthAlignment, e2.m0.g(i25, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i10 = i17;
                        if (oVar.g(point.x, point.y, f10)) {
                            break;
                        }
                    } else {
                        i10 = i17;
                    }
                    i24 = i26 + 1;
                    i17 = i10;
                    nVar2 = nVar;
                    i12 = i28;
                    i11 = i13;
                }
                i10 = i17;
                point = null;
                if (point != null) {
                    i18 = Math.max(i18, point.x);
                    i19 = Math.max(i19, point.y);
                    b2.v a10 = wVar.a();
                    a10.f4085y = i18;
                    a10.f4086z = i19;
                    G0 = Math.max(G0, E0(oVar, new b2.w(a10)));
                    e2.a.l("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i18 + "x" + i19);
                }
            } else {
                nVar = nVar2;
                i10 = i17;
            }
            lVar = new l(i18, i19, G0);
        }
        this.f157k1 = lVar;
        if (this.K1) {
            i15 = this.L1;
        } else {
            i15 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i16);
        mediaFormat.setInteger("height", i10);
        e2.a.k(mediaFormat, wVar.v);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        e2.a.j(mediaFormat, "rotation-degrees", wVar.E);
        if (nVar != null) {
            b2.n nVar3 = nVar;
            e2.a.j(mediaFormat, "color-transfer", nVar3.f3848c);
            e2.a.j(mediaFormat, "color-standard", nVar3.f3846a);
            e2.a.j(mediaFormat, "color-range", nVar3.f3847b);
            byte[] bArr = nVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(wVar.f4132s) && (b10 = e2.g.b(wVar)) != null) {
            e2.a.j(mediaFormat, "profile", ((Integer) b10.first).intValue());
        }
        mediaFormat.setInteger("max-width", lVar.f139a);
        mediaFormat.setInteger("max-height", lVar.f140b);
        e2.a.j(mediaFormat, "max-input-size", lVar.f141c);
        mediaFormat.setInteger("priority", 0);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f7);
        }
        if (this.f150d1) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.J1));
        }
        F(mediaFormat);
        Surface H0 = H0(oVar);
        if (this.f159n1 != null && !e2.m0.N(this.Z0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new com.google.firebase.messaging.l(oVar, mediaFormat, wVar, H0, mediaCrypto, null);
    }

    public final void T0(long j10) {
        i2.e eVar = this.O0;
        eVar.f12348k += j10;
        eVar.f12349l++;
        this.E1 += j10;
        this.F1++;
    }

    @Override
    public final void U(h2.h hVar) {
        if (this.f158m1) {
            ByteBuffer byteBuffer = hVar.f11638f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        r2.l lVar = this.f44999d0;
                        lVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override
    public final boolean Z(b2.w wVar) {
        p0 p0Var = this.f159n1;
        if (p0Var != null && !p0Var.v()) {
            try {
                return this.f159n1.d(wVar);
            } catch (o0 e) {
                throw d(e, wVar, false, 7000);
            }
        }
        return true;
    }

    @Override
    public final void a0(Exception exc) {
        e2.a.d("MediaCodecVideoRenderer", "Video codec error", exc);
        n4.s sVar = this.f148b1;
        Handler handler = (Handler) sVar.f17128b;
        if (handler != null) {
            handler.post(new a1.f(5, sVar, exc));
        }
    }

    @Override
    public final void b0(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        n4.s sVar = this.f148b1;
        Handler handler = (Handler) sVar.f17128b;
        if (handler != null) {
            str2 = str;
            handler.post(new h0(sVar, str2, j10, j11, 0));
        } else {
            str2 = str;
        }
        this.l1 = D0(str2);
        r2.o oVar = this.f45006k0;
        oVar.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(oVar.f44980b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (codecProfileLevelArr[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f158m1 = z10;
        L0();
    }

    @Override
    public final void c(int i10, Object obj) {
        boolean z10;
        boolean z11 = true;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 13) {
                                if (i10 != 14) {
                                    switch (i10) {
                                        case 16:
                                            obj.getClass();
                                            this.J1 = ((Integer) obj).intValue();
                                            r2.l lVar = this.f44999d0;
                                            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.J1));
                                                lVar.setParameters(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.f163r1;
                                            N0(null);
                                            obj.getClass();
                                            ((n) obj).c(1, surface);
                                            return;
                                        case 18:
                                            if (this.B1 != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            q1 q1Var = (q1) obj;
                                            this.B1 = q1Var;
                                            if (q1Var == null) {
                                                z11 = false;
                                            }
                                            if (z10 != z11) {
                                                A0(this.f45000e0);
                                                return;
                                            }
                                            return;
                                        default:
                                            super.c(i10, obj);
                                            return;
                                    }
                                }
                                obj.getClass();
                                e2.y yVar = (e2.y) obj;
                                if (yVar.f8298a != 0 && yVar.f8299b != 0) {
                                    this.f165t1 = yVar;
                                    p0 p0Var = this.f159n1;
                                    if (p0Var != null) {
                                        Surface surface2 = this.f163r1;
                                        surface2.getClass();
                                        p0Var.s(surface2, yVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(y1.f4154a)) {
                                p0 p0Var2 = this.f159n1;
                                if (p0Var2 != null && p0Var2.v()) {
                                    this.f159n1.t();
                                    return;
                                }
                                return;
                            }
                            this.f162q1 = list;
                            p0 p0Var3 = this.f159n1;
                            if (p0Var3 != null) {
                                p0Var3.o(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.f168w1 = intValue;
                        p0 p0Var4 = this.f159n1;
                        if (p0Var4 != null) {
                            p0Var4.j(intValue);
                            return;
                        }
                        f0 f0Var = this.f151e1.f57b;
                        if (f0Var.f92j != intValue) {
                            f0Var.f92j = intValue;
                            f0Var.d(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.f167v1 = intValue2;
                    r2.l lVar2 = this.f44999d0;
                    if (lVar2 != null) {
                        lVar2.k(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.L1 != intValue3) {
                    this.L1 = intValue3;
                    if (this.K1) {
                        n0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            y yVar2 = (y) obj;
            this.N1 = yVar2;
            p0 p0Var5 = this.f159n1;
            if (p0Var5 != null) {
                p0Var5.u(yVar2);
                return;
            }
            return;
        }
        N0(obj);
    }

    @Override
    public final void c0(i2.c cVar) {
        n4.s sVar = this.f148b1;
        Handler handler = (Handler) sVar.f17128b;
        if (handler != null) {
            handler.post(new a1.f(3, sVar, cVar));
        }
    }

    @Override
    public final void d0(String str) {
        n4.s sVar = this.f148b1;
        Handler handler = (Handler) sVar.f17128b;
        if (handler != null) {
            handler.post(new a1.f(6, sVar, str));
        }
    }

    @Override
    public final void e() {
        p0 p0Var = this.f159n1;
        if (p0Var != null) {
            int i10 = this.f161p1;
            if (i10 != 0 && i10 != 1) {
                p0Var.w();
                return;
            } else {
                this.f161p1 = 0;
                return;
            }
        }
        a0 a0Var = this.f151e1;
        if (a0Var.e == 0) {
            a0Var.e = 1;
        }
    }

    @Override
    public final i2.f e0(qf.b bVar) {
        i2.f e02 = super.e0(bVar);
        b2.w wVar = (b2.w) bVar.f44486c;
        wVar.getClass();
        n4.s sVar = this.f148b1;
        Handler handler = (Handler) sVar.f17128b;
        if (handler != null) {
            handler.post(new l0(sVar, wVar, e02, 0));
        }
        b0 b0Var = this.f155i1;
        if (b0Var != null) {
            b0Var.b();
        }
        return e02;
    }

    @Override
    public final void f0(b2.w wVar, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        int i10;
        int i11;
        r2.l lVar = this.f44999d0;
        if (lVar != null) {
            lVar.k(this.f167v1);
        }
        if (this.K1) {
            i11 = wVar.f4138z;
            i10 = wVar.A;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i12 = integer;
            i10 = integer2;
            i11 = i12;
        }
        float f7 = wVar.F;
        int i13 = wVar.E;
        if (i13 == 90 || i13 == 270) {
            f7 = 1.0f / f7;
            int i14 = i10;
            i10 = i11;
            i11 = i14;
        }
        this.H1 = new a2(f7, i11, i10);
        p0 p0Var = this.f159n1;
        if (p0Var != null && this.Q1) {
            b2.v a2 = wVar.a();
            a2.f4085y = i11;
            a2.f4086z = i10;
            a2.E = f7;
            b2.w wVar2 = new b2.w(a2);
            int i15 = this.f161p1;
            List list = this.f162q1;
            if (list == null) {
                e9.l0 l0Var = e9.n0.f8477b;
                list = x1.e;
            }
            p0Var.l(wVar2, this.P0.f44993b, i15, list);
            this.f161p1 = 2;
        } else {
            this.f151e1.f(wVar.D);
        }
        this.Q1 = false;
    }

    @Override
    public final void h0(long j10) {
        super.h0(j10);
        if (!this.K1) {
            this.A1--;
        }
    }

    @Override
    public final void i0() {
        p0 p0Var = this.f159n1;
        if (p0Var != null) {
            p0Var.i();
            if (this.O1 == -9223372036854775807L) {
                this.O1 = this.P0.f44993b;
            }
            this.f159n1.h(-this.O1);
        } else {
            this.f151e1.e(2);
        }
        this.Q1 = true;
        L0();
    }

    @Override
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void j0(h2.h hVar) {
        ByteBuffer byteBuffer;
        n4.s sVar = this.f153g1;
        if (sVar != null) {
            r2.o oVar = this.f45006k0;
            oVar.getClass();
            if (oVar.f44980b.equals("video/av01") && hVar.isKeyFrame() && (byteBuffer = hVar.f11637c) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) sVar.f17128b;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.R1 = 0;
        int O = O(hVar);
        if ((Build.VERSION.SDK_INT < 34 || (O & 32) == 0) && !this.K1) {
            this.A1++;
        }
    }

    @Override
    public final boolean l() {
        if (this.K0) {
            p0 p0Var = this.f159n1;
            if (p0Var == null || p0Var.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean l0(long j10, long j11, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b2.w wVar) {
        int i13;
        lVar.getClass();
        long j13 = j12 - this.P0.f44994c;
        int i14 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f156j1;
            Long l4 = (Long) priorityQueue.peek();
            if (l4 == null || l4.longValue() >= j12) {
                break;
            }
            i14++;
            priorityQueue.poll();
        }
        R0(i14, 0);
        p0 p0Var = this.f159n1;
        if (p0Var != null) {
            if (z10 && !z11) {
                Q0(lVar, i10);
                return true;
            }
            return p0Var.n(j12, new j(this, lVar, i10, j13));
        }
        int a2 = this.f151e1.a(j12, j10, j11, this.P0.f44993b, z10, z11, this.f152f1);
        z zVar = this.f152f1;
        b0 b0Var = this.f155i1;
        if (b0Var != null && a2 != 5 && a2 != 4) {
            b0Var.a(j12, zVar.f206a);
        }
        if (a2 != 0) {
            if (a2 != 1) {
                if (a2 != 2) {
                    if (a2 != 3) {
                        if (a2 == 4 || a2 == 5) {
                            return false;
                        }
                        throw new IllegalStateException(String.valueOf(a2));
                    }
                    Q0(lVar, i10);
                    T0(zVar.f206a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                lVar.d(i10);
                Trace.endSection();
                R0(0, 1);
                T0(zVar.f206a);
                return true;
            }
            long j14 = zVar.f207b;
            long j15 = zVar.f206a;
            if (j14 == this.G1) {
                Q0(lVar, i10);
            } else {
                y yVar = this.N1;
                if (yVar != null) {
                    i13 = i10;
                    yVar.a(j13, j14, wVar, this.f45001f0);
                } else {
                    i13 = i10;
                }
                M0(lVar, i13, j14);
            }
            T0(j15);
            this.G1 = j14;
            return true;
        }
        this.h.getClass();
        long nanoTime = System.nanoTime();
        y yVar2 = this.N1;
        if (yVar2 != null) {
            yVar2.a(j13, nanoTime, wVar, this.f45001f0);
        }
        M0(lVar, i10, nanoTime);
        T0(zVar.f206a);
        return true;
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.m():boolean");
    }

    @Override
    public final void n() {
        n4.s sVar = this.f148b1;
        this.I1 = null;
        this.P1 = -9223372036854775807L;
        L0();
        this.f166u1 = false;
        this.M1 = null;
        this.D1 = true;
        try {
            super.n();
        } finally {
            sVar.t(this.O0);
            sVar.M(a2.d);
        }
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        boolean z12;
        p0 p0Var;
        this.O0 = new Object();
        i2.o1 o1Var = this.d;
        o1Var.getClass();
        boolean z13 = o1Var.f12531b;
        if (z13 && this.L1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.p(z12);
        if (this.K1 != z13) {
            this.K1 = z13;
            n0();
        }
        i2.e eVar = this.O0;
        n4.s sVar = this.f148b1;
        Handler handler = (Handler) sVar.f17128b;
        if (handler != null) {
            handler.post(new k0(sVar, eVar, 0));
        }
        boolean z14 = this.f160o1;
        a0 a0Var = this.f151e1;
        if (!z14) {
            if (this.f162q1 != null && this.f159n1 == null) {
                q qVar = new q(this.Z0, a0Var);
                qVar.d = true;
                long j10 = this.f154h1;
                long j11 = -9223372036854775807L;
                if (j10 != -9223372036854775807L) {
                    j11 = -j10;
                }
                qVar.f184g = j11;
                e2.g0 g0Var = this.h;
                g0Var.getClass();
                qVar.e = g0Var;
                u6.p(!qVar.f183f);
                if (qVar.f182c == null) {
                    qVar.f182c = new u();
                }
                w wVar = new w(qVar);
                qVar.f183f = true;
                if (1 >= wVar.f205p) {
                    wVar.f205p = 1;
                }
                SparseArray sparseArray = wVar.f195c;
                if (e2.m0.k(sparseArray, 0)) {
                    p0Var = (p0) sparseArray.get(0);
                } else {
                    r rVar = new r(wVar, wVar.f193a);
                    wVar.f197g.add(rVar);
                    sparseArray.put(0, rVar);
                    p0Var = rVar;
                }
                this.f159n1 = p0Var;
            }
            this.f160o1 = true;
        }
        p0 p0Var2 = this.f159n1;
        if (p0Var2 != null) {
            p0Var2.g(new a6.i(this, 1));
            y yVar = this.N1;
            if (yVar != null) {
                this.f159n1.u(yVar);
            }
            if (this.f163r1 != null && !this.f165t1.equals(e2.y.f8297c)) {
                this.f159n1.s(this.f163r1, this.f165t1);
            }
            this.f159n1.j(this.f168w1);
            this.f159n1.a(this.f44997b0);
            List list = this.f162q1;
            if (list != null) {
                this.f159n1.o(list);
            }
            this.f161p1 = !z11 ? 1 : 0;
            this.S0 = true;
            return;
        }
        e2.g0 g0Var2 = this.h;
        g0Var2.getClass();
        a0Var.f64l = g0Var2;
        a0Var.e(!z11 ? 1 : 0);
    }

    @Override
    public final void o0() {
        p0 p0Var = this.f159n1;
        if (p0Var != null) {
            p0Var.i();
        } else {
            long j10 = this.P0.f44995f;
        }
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        p0 p0Var = this.f159n1;
        if (p0Var != null && !z10) {
            p0Var.m(true);
        }
        if (z11) {
            this.C1 = j10;
        }
        super.p(j10, z10, z11);
        p0 p0Var2 = this.f159n1;
        a0 a0Var = this.f151e1;
        if (p0Var2 == null) {
            a0Var.f57b.b();
            a0Var.h = -9223372036854775807L;
            a0Var.f59f = -9223372036854775807L;
            a0Var.e = Math.min(a0Var.e, 1);
            a0Var.f61i = -9223372036854775807L;
            a0Var.f66n = false;
        }
        b0 b0Var = this.f155i1;
        if (b0Var != null) {
            b0Var.b();
        }
        if (z10) {
            p0 p0Var3 = this.f159n1;
            if (p0Var3 != null) {
                p0Var3.q(false);
            } else {
                a0Var.c(false);
            }
        }
        L0();
        this.f171z1 = 0;
    }

    @Override
    public final void q() {
        p0 p0Var = this.f159n1;
        if (p0Var != null && this.f147a1) {
            p0Var.release();
        }
    }

    @Override
    public final void q0() {
        super.q0();
        this.f156j1.clear();
        this.A1 = 0;
        this.R1 = 0;
        this.D1 = false;
        n4.s sVar = this.f153g1;
        if (sVar != null) {
            sVar.f17129c = null;
            ByteBuffer byteBuffer = (ByteBuffer) sVar.f17128b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override
    public final void r() {
        try {
            this.f45019y0 = false;
            p0();
            n0();
            i2.d.D(this.X, null);
            this.X = null;
        } finally {
            this.f160o1 = false;
            this.O1 = -9223372036854775807L;
            p pVar = this.f164s1;
            if (pVar != null) {
                pVar.release();
                this.f164s1 = null;
            }
        }
    }

    @Override
    public final void s() {
        this.f170y1 = 0;
        this.h.getClass();
        this.f169x1 = SystemClock.elapsedRealtime();
        this.E1 = 0L;
        this.F1 = 0;
        p0 p0Var = this.f159n1;
        if (p0Var != null) {
            p0Var.f();
        } else {
            this.f151e1.d();
        }
    }

    @Override
    public final void t() {
        K0();
        int i10 = this.F1;
        if (i10 != 0) {
            long j10 = this.E1;
            n4.s sVar = this.f148b1;
            Handler handler = (Handler) sVar.f17128b;
            if (handler != null) {
                handler.post(new j0(sVar, j10, i10));
            }
            this.E1 = 0L;
            this.F1 = 0;
        }
        p0 p0Var = this.f159n1;
        if (p0Var != null) {
            p0Var.e();
        } else {
            a0 a0Var = this.f151e1;
            a0Var.d = false;
            a0Var.f61i = -9223372036854775807L;
            f0 f0Var = a0Var.f57b;
            f0Var.d = false;
            c0 c0Var = f0Var.f88c;
            if (c0Var != null) {
                c0Var.b();
            }
            f0Var.a();
        }
        b0 b0Var = this.f155i1;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override
    public final void u(b2.w[] wVarArr, long j10, long j11, u2.f0 f0Var) {
        super.u(wVarArr, j10, j11, f0Var);
        S0(f0Var);
        b0 b0Var = this.f155i1;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override
    public final boolean u0(h2.h r15) {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.u0(h2.h):boolean");
    }

    @Override
    public final void v() {
        u2.f0 f0Var = this.G;
        if (f0Var != null) {
            S0(f0Var);
        }
    }

    @Override
    public final boolean v0() {
        boolean z10;
        b2.w wVar = this.f45000e0;
        long j10 = this.P1;
        if (j10 != -9223372036854775807L) {
            if (this.U0 + 1 + j10 <= Long.MAX_VALUE - (this.P0.f44994c + j10)) {
                z10 = false;
                if (this.B1 != null && !this.D1 && !this.K1 && ((wVar == null || wVar.f4134u <= 0) && !z10 && this.P0.f44995f == -9223372036854775807L)) {
                    return false;
                }
                return true;
            }
        }
        z10 = true;
        if (this.B1 != null) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean w0(r2.o oVar) {
        return I0(oVar);
    }

    @Override
    public final void x(long j10, long j11) {
        p0 p0Var = this.f159n1;
        if (p0Var != null) {
            try {
                p0Var.p(j10, j11);
            } catch (o0 e) {
                throw d(e, e.f176a, false, 7001);
            }
        }
        super.x(j10, j11);
    }

    @Override
    public final boolean x0() {
        r2.o oVar = this.f45006k0;
        if (this.f159n1 != null && oVar != null) {
            String str = oVar.f44979a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.x0();
    }

    @Override
    public final int z0(r2.i iVar, b2.w wVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (!v0.m(wVar.f4132s)) {
            return i2.d.c(0, 0, 0, 0);
        }
        if (wVar.f4135w != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.Z0;
        List F0 = F0(context, iVar, wVar, z10, false);
        if (z10 && F0.isEmpty()) {
            F0 = F0(context, iVar, wVar, false, false);
        }
        if (F0.isEmpty()) {
            return i2.d.c(1, 0, 0, 0);
        }
        int i15 = wVar.T;
        if (i15 != 0 && i15 != 2) {
            return i2.d.c(2, 0, 0, 0);
        }
        r2.o oVar = (r2.o) F0.get(0);
        boolean e = oVar.e(context, wVar);
        if (!e) {
            for (int i16 = 1; i16 < F0.size(); i16++) {
                r2.o oVar2 = (r2.o) F0.get(i16);
                if (oVar2.e(context, wVar)) {
                    z11 = false;
                    e = true;
                    oVar = oVar2;
                    break;
                }
            }
        }
        z11 = true;
        if (e) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        if (oVar.f(wVar)) {
            i11 = 16;
        } else {
            i11 = 8;
        }
        if (oVar.f44983g) {
            i12 = 64;
        } else {
            i12 = 0;
        }
        if (z11) {
            i13 = 128;
        } else {
            i13 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(wVar.f4132s) && !c2.i.d(context)) {
            i13 = 256;
        }
        if (e) {
            List F02 = F0(context, iVar, wVar, z10, true);
            if (!F02.isEmpty()) {
                HashMap hashMap = r2.w.f45024a;
                ArrayList arrayList = new ArrayList(F02);
                Collections.sort(arrayList, new t5(new org.telegram.ui.web.m(3, context, wVar), 4));
                r2.o oVar3 = (r2.o) arrayList.get(0);
                if (oVar3.e(context, wVar) && oVar3.f(wVar)) {
                    i14 = 32;
                }
            }
        }
        return i10 | i11 | i14 | i12 | i13;
    }
}
