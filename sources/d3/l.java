package d3;

import a8.b8;
import a8.la;
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
import di.s4;
import e2.i1;
import e2.l1;
import e2.s0;
import e2.v1;
import e2.x1;
import h2.l0;
import h9.t1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import l2.m1;
import l2.o1;
import org.telegram.ui.wc1;
public final class l extends u2.r {
    public static final int[] T1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean U1;
    public static boolean V1;
    public int A1;
    public int B1;
    public o1 C1;
    public long D1;
    public boolean E1;
    public long F1;
    public int G1;
    public long H1;
    public x1 I1;
    public x1 J1;
    public int K1;
    public boolean L1;
    public int M1;
    public k N1;
    public v O1;
    public long P1;
    public long Q1;
    public boolean R1;
    public int S1;
    public final Context f7736a1;
    public final boolean f7737b1;
    public final wf.b f7738c1;
    public final int f7739d1;
    public final boolean f7740e1;
    public final x f7741f1;
    public final w f7742g1;
    public final wf.b f7743h1;
    public final long f7744i1;
    public final y f7745j1;
    public final PriorityQueue f7746k1;
    public b7.d l1;
    public boolean f7747m1;
    public boolean n1;
    public k0 f7748o1;
    public boolean f7749p1;
    public int f7750q1;
    public List f7751r1;
    public Surface f7752s1;
    public n f7753t1;
    public h2.y f7754u1;
    public boolean f7755v1;
    public int f7756w1;
    public int f7757x1;
    public long f7758y1;
    public int f7759z1;

    public l(d3.j r8) {
        throw new UnsupportedOperationException("Method not decompiled: d3.l.<init>(d3.j):void");
    }

    public static boolean D0(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: d3.l.D0(java.lang.String):boolean");
    }

    public static int E0(u2.o r11, e2.u r12) {
        throw new UnsupportedOperationException("Method not decompiled: d3.l.E0(u2.o, e2.u):int");
    }

    public static List F0(Context context, u2.i iVar, e2.u uVar, boolean z10, boolean z11) {
        List a10;
        String str = uVar.f10798s;
        if (str == null) {
            return t1.f14103e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !f2.i.c(context)) {
            String c10 = u2.w.c(uVar);
            if (c10 == null) {
                a10 = t1.f14103e;
            } else {
                a10 = iVar.a(c10, z10, z11);
            }
            if (!a10.isEmpty()) {
                return a10;
            }
        }
        return u2.w.g(iVar, uVar, z10, z11);
    }

    public static int G0(u2.o oVar, e2.u uVar) {
        int i7 = uVar.f10799t;
        List list = uVar.v;
        if (i7 != -1) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) list.get(i11)).length;
            }
            return uVar.f10799t + i10;
        }
        return E0(oVar, uVar);
    }

    @Override
    public final void A(float f10, float f11) {
        super.A(f10, f11);
        k0 k0Var = this.f7748o1;
        if (k0Var != null) {
            k0Var.d(f10);
        } else {
            this.f7741f1.h(f10);
        }
        y yVar = this.f7745j1;
        if (yVar != null) {
            yVar.c(f10);
        }
    }

    @Override
    public final boolean E(long j3) {
        if (this.J0 == -9223372036854775807L || j3 < this.D1) {
            return false;
        }
        long j10 = this.R0;
        if (j10 != -9223372036854775807L && j3 <= j10) {
            return false;
        }
        return true;
    }

    @Override
    public final l2.e H(u2.o oVar, e2.u uVar, e2.u uVar2, boolean z10) {
        int i7;
        int i10;
        l2.e b10 = oVar.b(uVar, uVar2);
        float f10 = uVar.D;
        float f11 = uVar2.D;
        int i11 = b10.f19323e;
        b7.d dVar = this.l1;
        dVar.getClass();
        if (uVar2.f10804z > dVar.f2962a || uVar2.A > dVar.f2963b) {
            i11 |= 256;
        }
        if (G0(oVar, uVar2) > dVar.f2964c) {
            i11 |= 64;
        }
        if (this.f7757x1 != Integer.MIN_VALUE && (i10 = Build.VERSION.SDK_INT) < 31 && ((i10 != 30 || Build.MODEL.startsWith("MiTV")) && f10 != -1.0f && f11 != -1.0f && (!oVar.f58387f || !z10))) {
            float max = Math.max(f11, f10) / Math.min(f11, f10);
            if (Math.abs(max - Math.round(max)) > 0.01f) {
                i11 |= 65536;
            }
        }
        int i12 = i11;
        String str = oVar.f58383a;
        if (i12 != 0) {
            i7 = 0;
        } else {
            i7 = b10.d;
        }
        return new l2.e(str, uVar, uVar2, i7, i12);
    }

    public final android.view.Surface H0(u2.o r6) {
        throw new UnsupportedOperationException("Method not decompiled: d3.l.H0(u2.o):android.view.Surface");
    }

    @Override
    public final u2.n I(IllegalStateException illegalStateException, u2.o oVar) {
        Surface surface = this.f7752s1;
        u2.n nVar = new u2.n(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return nVar;
    }

    public final boolean I0(u2.o oVar) {
        if (this.f7748o1 == null) {
            Surface surface = this.f7752s1;
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

    public final boolean J0(k2.h hVar) {
        if (k() || hVar.isLastSample()) {
            return true;
        }
        long j3 = this.Q1;
        if (j3 == -9223372036854775807L || j3 - (hVar.f18159e - this.Q0.f58399c) <= 100000) {
            return true;
        }
        return false;
    }

    public final void K0() {
        if (this.f7759z1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f7758y1;
            int i7 = this.f7759z1;
            wf.b bVar = this.f7738c1;
            Handler handler = (Handler) bVar.f59715b;
            if (handler != null) {
                handler.post(new f0(bVar, i7, j3));
            }
            this.f7759z1 = 0;
            this.f7758y1 = elapsedRealtime;
        }
    }

    public final void L0() {
        u2.l lVar;
        if (this.L1 && (lVar = this.f58406e0) != null) {
            this.N1 = new k(this, lVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                lVar.setParameters(bundle);
            }
        }
    }

    public final void M0(u2.l lVar, int i7, long j3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.g(i7, j3);
        Trace.endSection();
        this.P0.f19308e++;
        boolean z10 = false;
        this.A1 = 0;
        if (this.f7748o1 == null) {
            x1 x1Var = this.I1;
            boolean equals = x1Var.equals(x1.d);
            wf.b bVar = this.f7738c1;
            if (!equals && !x1Var.equals(this.J1)) {
                this.J1 = x1Var;
                bVar.V(x1Var);
            }
            x xVar = this.f7741f1;
            if (xVar.f7796e != 3) {
                z10 = true;
            }
            xVar.f7796e = 3;
            xVar.f7802l.getClass();
            xVar.f7798g = l0.S(SystemClock.elapsedRealtime());
            if (z10 && (surface = this.f7752s1) != null) {
                bVar.P(surface);
                this.f7755v1 = true;
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
        Surface surface2 = this.f7752s1;
        wf.b bVar = this.f7738c1;
        if (surface2 != surface) {
            this.f7752s1 = surface;
            k0 k0Var = this.f7748o1;
            x xVar = this.f7741f1;
            if (k0Var == null) {
                xVar.g(surface);
            }
            this.f7755v1 = false;
            int i7 = this.f19288n;
            u2.l lVar = this.f58406e0;
            if (lVar != null && this.f7748o1 == null) {
                u2.o oVar = this.f58413l0;
                oVar.getClass();
                if (I0(oVar) && !this.f7747m1) {
                    Surface H0 = H0(oVar);
                    if (H0 != null) {
                        try {
                            lVar.m(H0);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            throw new IllegalArgumentException(th2);
                        }
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        lVar.f();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    n0();
                    X();
                }
            }
            if (surface != null) {
                x1 x1Var = this.J1;
                if (x1Var != null) {
                    bVar.V(x1Var);
                }
            } else {
                this.J1 = null;
                k0 k0Var2 = this.f7748o1;
                if (k0Var2 != null) {
                    k0Var2.m();
                }
            }
            if (i7 == 2) {
                k0 k0Var3 = this.f7748o1;
                if (k0Var3 != null) {
                    k0Var3.r(true);
                } else {
                    xVar.c(true);
                }
            }
            L0();
        } else if (surface != null) {
            x1 x1Var2 = this.J1;
            if (x1Var2 != null) {
                bVar.V(x1Var2);
            }
            Surface surface3 = this.f7752s1;
            if (surface3 != null && this.f7755v1) {
                bVar.P(surface3);
            }
        }
    }

    @Override
    public final int O(k2.h hVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            if ((this.C1 != null || this.L1) && hVar.f18159e < this.f19292x && !J0(hVar)) {
                return 32;
            }
            return 0;
        }
        return 0;
    }

    public final boolean O0(long j3, long j10, boolean z10, boolean z11) {
        int B;
        if (this.f7748o1 != null && this.f7737b1) {
            j10 -= -this.P1;
        }
        if (j3 >= -500000 || z10 || (B = B(j10)) == 0) {
            return false;
        }
        this.D1 = j10;
        PriorityQueue priorityQueue = this.f7746k1;
        if (z11) {
            l2.d dVar = this.P0;
            int i7 = dVar.d + B;
            dVar.d = i7;
            dVar.f19309f += this.B1;
            dVar.d = priorityQueue.size() + i7;
        } else {
            this.P0.f19312j++;
            R0(priorityQueue.size() + B, this.B1);
        }
        if (this.f58406e0 != null) {
            if (x0()) {
                n0();
                X();
            } else if (v0()) {
                M();
            } else {
                this.U0 = true;
            }
        }
        k0 k0Var = this.f7748o1;
        if (k0Var != null) {
            k0Var.o(false);
        }
        return true;
    }

    @Override
    public final float P(float f10, e2.u uVar, e2.u[] uVarArr) {
        float f11;
        u2.o oVar;
        float f12 = -1.0f;
        for (e2.u uVar2 : uVarArr) {
            float f13 = uVar2.D;
            if (f13 != -1.0f) {
                f12 = Math.max(f12, f13);
            }
        }
        if (f12 == -1.0f) {
            f11 = -1.0f;
        } else {
            f11 = f12 * f10;
        }
        if (this.C1 != null && (oVar = this.f58413l0) != null) {
            int i7 = uVar.f10804z;
            int i10 = uVar.A;
            float f14 = -3.4028235E38f;
            if (oVar.f58389i) {
                float f15 = oVar.f58392l;
                if (f15 != -3.4028235E38f && oVar.f58390j == i7 && oVar.f58391k == i10) {
                    f14 = f15;
                } else {
                    float f16 = 1024.0f;
                    if (oVar.g(i7, i10, 1024.0f)) {
                        f14 = 1024.0f;
                    } else {
                        f14 = 0.0f;
                        while (true) {
                            float f17 = f16 - f14;
                            if (Math.abs(f17) <= 5.0f) {
                                break;
                            }
                            float f18 = (f17 / 2.0f) + f14;
                            if (oVar.g(i7, i10, f18)) {
                                f14 = f18;
                            } else {
                                f16 = f18;
                            }
                        }
                    }
                    oVar.f58392l = f14;
                    oVar.f58390j = i7;
                    oVar.f58391k = i10;
                }
            }
            if (f11 != -1.0f) {
                return Math.max(f11, f14);
            }
            return f14;
        }
        return f11;
    }

    public final boolean P0(u2.o oVar) {
        if (!this.L1 && !D0(oVar.f58383a)) {
            if (!oVar.f58387f || n.b(this.f7736a1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final ArrayList Q(u2.i iVar, e2.u uVar, boolean z10) {
        boolean z11 = this.L1;
        Context context = this.f7736a1;
        List F0 = F0(context, iVar, uVar, z10, z11);
        HashMap hashMap = u2.w.f58430a;
        ArrayList arrayList = new ArrayList(F0);
        Collections.sort(arrayList, new s4(new wc1(14, context, uVar), 4));
        return arrayList;
    }

    public final void Q0(u2.l lVar, int i7) {
        Trace.beginSection("skipVideoBuffer");
        lVar.e(i7);
        Trace.endSection();
        this.P0.f19309f++;
    }

    public final void R0(int i7, int i10) {
        l2.d dVar = this.P0;
        dVar.h += i7;
        int i11 = i7 + i10;
        dVar.f19310g += i11;
        this.f7759z1 += i11;
        int i12 = this.A1 + i11;
        this.A1 = i12;
        dVar.f19311i = Math.max(i12, dVar.f19311i);
        int i13 = this.f7739d1;
        if (i13 > 0 && this.f7759z1 >= i13) {
            K0();
        }
    }

    public final void S0(x2.g0 g0Var) {
        l1 l1Var = this.G;
        if (l1Var.p()) {
            this.Q1 = -9223372036854775807L;
            return;
        }
        int b10 = l1Var.b(g0Var.f60133a);
        if (b10 == -1) {
            this.Q1 = -9223372036854775807L;
        } else {
            this.Q1 = l1Var.f(b10, new i1(), false).d;
        }
    }

    @Override
    public final b8 T(u2.o oVar, e2.u uVar, MediaCrypto mediaCrypto, float f10) {
        e2.m mVar;
        int i7;
        b7.d dVar;
        boolean z10;
        int i10;
        int i11;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i12;
        int i13;
        char c10;
        boolean z11;
        int i14;
        boolean z12;
        Pair b10;
        int E0;
        String str = oVar.f58385c;
        e2.u[] uVarArr = this.f19290s;
        uVarArr.getClass();
        int i15 = uVar.f10804z;
        float f11 = uVar.D;
        e2.m mVar2 = uVar.I;
        int i16 = uVar.A;
        int G0 = G0(oVar, uVar);
        if (uVarArr.length == 1) {
            if (G0 != -1 && (E0 = E0(oVar, uVar)) != -1) {
                G0 = Math.min((int) (G0 * 1.5f), E0);
            }
            dVar = new b7.d(i15, i16, G0);
            mVar = mVar2;
            i7 = i16;
        } else {
            int length = uVarArr.length;
            int i17 = i15;
            int i18 = i16;
            int i19 = 0;
            boolean z13 = false;
            while (i19 < length) {
                e2.u uVar2 = uVarArr[i19];
                e2.u[] uVarArr2 = uVarArr;
                if (mVar2 != null && uVar2.I == null) {
                    e2.t a10 = uVar2.a();
                    a10.H = mVar2;
                    uVar2 = new e2.u(a10);
                }
                l2.e b11 = oVar.b(uVar, uVar2);
                int i20 = length;
                int i21 = uVar2.A;
                if (b11.d != 0) {
                    int i22 = uVar2.f10804z;
                    i13 = i19;
                    c10 = 65535;
                    if (i22 != -1 && i21 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    i17 = Math.max(i17, i22);
                    i18 = Math.max(i18, i21);
                    G0 = Math.max(G0, G0(oVar, uVar2));
                } else {
                    i13 = i19;
                    c10 = 65535;
                }
                length = i20;
                i19 = i13 + 1;
                uVarArr = uVarArr2;
            }
            if (z13) {
                h2.a.l("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i17 + "x" + i18);
                if (i16 > i15) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = i16;
                } else {
                    i10 = i15;
                }
                boolean z14 = z10;
                if (z10) {
                    i11 = i15;
                } else {
                    i11 = i16;
                }
                float f12 = i11 / i10;
                int i23 = 0;
                while (true) {
                    mVar = mVar2;
                    if (i23 >= 9) {
                        break;
                    }
                    int i24 = T1[i23];
                    int i25 = i23;
                    int i26 = (int) (i24 * f12);
                    if (i24 <= i10 || i26 <= i11) {
                        break;
                    }
                    if (!z14) {
                        i26 = i24;
                    }
                    if (!z14) {
                        i24 = i26;
                    }
                    int i27 = i11;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i12 = i10;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i12 = i10;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(l0.g(i26, widthAlignment) * widthAlignment, l0.g(i24, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i7 = i16;
                        if (oVar.g(point.x, point.y, f11)) {
                            break;
                        }
                    } else {
                        i7 = i16;
                    }
                    i23 = i25 + 1;
                    i16 = i7;
                    mVar2 = mVar;
                    i11 = i27;
                    i10 = i12;
                }
                i7 = i16;
                point = null;
                if (point != null) {
                    i17 = Math.max(i17, point.x);
                    i18 = Math.max(i18, point.y);
                    e2.t a11 = uVar.a();
                    a11.f10752y = i17;
                    a11.f10753z = i18;
                    G0 = Math.max(G0, E0(oVar, new e2.u(a11)));
                    h2.a.l("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i17 + "x" + i18);
                }
            } else {
                mVar = mVar2;
                i7 = i16;
            }
            dVar = new b7.d(i17, i18, G0);
        }
        this.l1 = dVar;
        if (this.L1) {
            i14 = this.M1;
        } else {
            i14 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i15);
        mediaFormat.setInteger("height", i7);
        h2.a.k(mediaFormat, uVar.v);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        h2.a.j(mediaFormat, "rotation-degrees", uVar.E);
        if (mVar != null) {
            e2.m mVar3 = mVar;
            h2.a.j(mediaFormat, "color-transfer", mVar3.f10548c);
            h2.a.j(mediaFormat, "color-standard", mVar3.f10546a);
            h2.a.j(mediaFormat, "color-range", mVar3.f10547b);
            byte[] bArr = mVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(uVar.f10798s) && (b10 = h2.g.b(uVar)) != null) {
            h2.a.j(mediaFormat, "profile", ((Integer) b10.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.f2962a);
        mediaFormat.setInteger("max-height", dVar.f2963b);
        h2.a.j(mediaFormat, "max-input-size", dVar.f2964c);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (this.f7740e1) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i14 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i14);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.K1));
        }
        F(mediaFormat);
        Surface H0 = H0(oVar);
        if (this.f7748o1 != null && !l0.N(this.f7736a1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new b8(oVar, mediaFormat, uVar, H0, mediaCrypto, null);
    }

    public final void T0(long j3) {
        l2.d dVar = this.P0;
        dVar.f19313k += j3;
        dVar.f19314l++;
        this.F1 += j3;
        this.G1++;
    }

    @Override
    public final void U(k2.h hVar) {
        if (this.n1) {
            ByteBuffer byteBuffer = hVar.f18160f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s5 = byteBuffer.getShort();
                short s9 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s5 == 60 && s9 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        u2.l lVar = this.f58406e0;
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
    public final boolean Z(e2.u uVar) {
        k0 k0Var = this.f7748o1;
        if (k0Var != null && !k0Var.v()) {
            try {
                return this.f7748o1.j(uVar);
            } catch (j0 e10) {
                throw d(e10, uVar, false, 7000);
            }
        }
        return true;
    }

    @Override
    public final void a0(Exception exc) {
        h2.a.d("MediaCodecVideoRenderer", "Video codec error", exc);
        wf.b bVar = this.f7738c1;
        Handler handler = (Handler) bVar.f59715b;
        if (handler != null) {
            handler.post(new c1.a(24, bVar, exc));
        }
    }

    @Override
    public final void b0(long j3, String str, long j10) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        wf.b bVar = this.f7738c1;
        Handler handler = (Handler) bVar.f59715b;
        if (handler != null) {
            str2 = str;
            handler.post(new e0(bVar, str2, j3, j10, 0));
        } else {
            str2 = str;
        }
        this.f7747m1 = D0(str2);
        u2.o oVar = this.f58413l0;
        oVar.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(oVar.f58384b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                } else if (codecProfileLevelArr[i7].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.n1 = z10;
        L0();
    }

    @Override
    public final void c(int i7, Object obj) {
        boolean z10;
        boolean z11 = true;
        if (i7 != 1) {
            if (i7 != 7) {
                if (i7 != 10) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 13) {
                                if (i7 != 14) {
                                    switch (i7) {
                                        case 16:
                                            obj.getClass();
                                            this.K1 = ((Integer) obj).intValue();
                                            u2.l lVar = this.f58406e0;
                                            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.K1));
                                                lVar.setParameters(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.f7752s1;
                                            N0(null);
                                            obj.getClass();
                                            ((l) obj).c(1, surface);
                                            return;
                                        case 18:
                                            if (this.C1 != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            o1 o1Var = (o1) obj;
                                            this.C1 = o1Var;
                                            if (o1Var == null) {
                                                z11 = false;
                                            }
                                            if (z10 != z11) {
                                                A0(this.f58407f0);
                                                return;
                                            }
                                            return;
                                        default:
                                            super.c(i7, obj);
                                            return;
                                    }
                                }
                                obj.getClass();
                                h2.y yVar = (h2.y) obj;
                                if (yVar.f13869a != 0 && yVar.f13870b != 0) {
                                    this.f7754u1 = yVar;
                                    k0 k0Var = this.f7748o1;
                                    if (k0Var != null) {
                                        Surface surface2 = this.f7752s1;
                                        surface2.getClass();
                                        k0Var.f(surface2, yVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(v1.f10815a)) {
                                k0 k0Var2 = this.f7748o1;
                                if (k0Var2 != null && k0Var2.v()) {
                                    this.f7748o1.t();
                                    return;
                                }
                                return;
                            }
                            this.f7751r1 = list;
                            k0 k0Var3 = this.f7748o1;
                            if (k0Var3 != null) {
                                k0Var3.p(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.f7757x1 = intValue;
                        k0 k0Var4 = this.f7748o1;
                        if (k0Var4 != null) {
                            k0Var4.l(intValue);
                            return;
                        }
                        c0 c0Var = this.f7741f1.f7794b;
                        if (c0Var.f7673j != intValue) {
                            c0Var.f7673j = intValue;
                            c0Var.d(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.f7756w1 = intValue2;
                    u2.l lVar2 = this.f58406e0;
                    if (lVar2 != null) {
                        lVar2.l(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.M1 != intValue3) {
                    this.M1 = intValue3;
                    if (this.L1) {
                        n0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            v vVar = (v) obj;
            this.O1 = vVar;
            k0 k0Var5 = this.f7748o1;
            if (k0Var5 != null) {
                k0Var5.c(vVar);
                return;
            }
            return;
        }
        N0(obj);
    }

    @Override
    public final void c0(l2.c cVar) {
        wf.b bVar = this.f7738c1;
        Handler handler = (Handler) bVar.f59715b;
        if (handler != null) {
            handler.post(new c1.a(22, bVar, cVar));
        }
    }

    @Override
    public final void d0(String str) {
        wf.b bVar = this.f7738c1;
        Handler handler = (Handler) bVar.f59715b;
        if (handler != null) {
            handler.post(new c1.a(25, bVar, str));
        }
    }

    @Override
    public final l2.e e0(k8.a aVar) {
        l2.e e02 = super.e0(aVar);
        e2.u uVar = (e2.u) aVar.f18215c;
        uVar.getClass();
        wf.b bVar = this.f7738c1;
        Handler handler = (Handler) bVar.f59715b;
        if (handler != null) {
            handler.post(new aa.r(bVar, uVar, e02, 17));
        }
        y yVar = this.f7745j1;
        if (yVar != null) {
            yVar.b();
        }
        return e02;
    }

    @Override
    public final void f() {
        k0 k0Var = this.f7748o1;
        if (k0Var != null) {
            int i7 = this.f7750q1;
            if (i7 != 0 && i7 != 1) {
                k0Var.w();
                return;
            } else {
                this.f7750q1 = 0;
                return;
            }
        }
        x xVar = this.f7741f1;
        if (xVar.f7796e == 0) {
            xVar.f7796e = 1;
        }
    }

    @Override
    public final void f0(e2.u uVar, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        int i7;
        int i10;
        u2.l lVar = this.f58406e0;
        if (lVar != null) {
            lVar.l(this.f7756w1);
        }
        if (this.L1) {
            i10 = uVar.f10804z;
            i7 = uVar.A;
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
            int i11 = integer;
            i7 = integer2;
            i10 = i11;
        }
        float f10 = uVar.F;
        int i12 = uVar.E;
        if (i12 == 90 || i12 == 270) {
            f10 = 1.0f / f10;
            int i13 = i7;
            i7 = i10;
            i10 = i13;
        }
        this.I1 = new x1(f10, i10, i7);
        k0 k0Var = this.f7748o1;
        if (k0Var != null && this.R1) {
            e2.t a10 = uVar.a();
            a10.f10752y = i10;
            a10.f10753z = i7;
            a10.E = f10;
            e2.u uVar2 = new e2.u(a10);
            int i14 = this.f7750q1;
            List list = this.f7751r1;
            if (list == null) {
                h9.g0 g0Var = h9.i0.f14035b;
                list = t1.f14103e;
            }
            k0Var.u(uVar2, this.Q0.f58398b, i14, list);
            this.f7750q1 = 2;
        } else {
            this.f7741f1.f(uVar.D);
        }
        this.R1 = false;
    }

    @Override
    public final void h0(long j3) {
        super.h0(j3);
        if (!this.L1) {
            this.B1--;
        }
    }

    @Override
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void i0() {
        k0 k0Var = this.f7748o1;
        if (k0Var != null) {
            k0Var.k();
            if (this.P1 == -9223372036854775807L) {
                this.P1 = this.Q0.f58398b;
            }
            this.f7748o1.i(-this.P1);
        } else {
            this.f7741f1.e(2);
        }
        this.R1 = true;
        L0();
    }

    @Override
    public final void j0(k2.h hVar) {
        ByteBuffer byteBuffer;
        wf.b bVar = this.f7743h1;
        if (bVar != null) {
            u2.o oVar = this.f58413l0;
            oVar.getClass();
            if (oVar.f58384b.equals("video/av01") && hVar.isKeyFrame() && (byteBuffer = hVar.f18158c) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) bVar.f59715b;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.S1 = 0;
        int O = O(hVar);
        if ((Build.VERSION.SDK_INT < 34 || (O & 32) == 0) && !this.L1) {
            this.B1++;
        }
    }

    @Override
    public final boolean l() {
        if (this.L0) {
            k0 k0Var = this.f7748o1;
            if (k0Var == null || k0Var.a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean l0(long j3, long j10, u2.l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z10, boolean z11, e2.u uVar) {
        int i12;
        lVar.getClass();
        long j12 = j11 - this.Q0.f58399c;
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f7746k1;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j11) {
                break;
            }
            i13++;
            priorityQueue.poll();
        }
        R0(i13, 0);
        k0 k0Var = this.f7748o1;
        if (k0Var != null) {
            if (z10 && !z11) {
                Q0(lVar, i7);
                return true;
            }
            return k0Var.n(j11, new i(this, lVar, i7, j12));
        }
        int a10 = this.f7741f1.a(j11, j3, j10, this.Q0.f58398b, z10, z11, this.f7742g1);
        w wVar = this.f7742g1;
        y yVar = this.f7745j1;
        if (yVar != null && a10 != 5 && a10 != 4) {
            yVar.a(j11, wVar.f7791a);
        }
        if (a10 != 0) {
            if (a10 != 1) {
                if (a10 != 2) {
                    if (a10 != 3) {
                        if (a10 == 4 || a10 == 5) {
                            return false;
                        }
                        throw new IllegalStateException(String.valueOf(a10));
                    }
                    Q0(lVar, i7);
                    T0(wVar.f7791a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                lVar.e(i7);
                Trace.endSection();
                R0(0, 1);
                T0(wVar.f7791a);
                return true;
            }
            long j13 = wVar.f7792b;
            long j14 = wVar.f7791a;
            if (j13 == this.H1) {
                Q0(lVar, i7);
            } else {
                v vVar = this.O1;
                if (vVar != null) {
                    i12 = i7;
                    vVar.a(j12, j13, uVar, this.f58408g0);
                } else {
                    i12 = i7;
                }
                M0(lVar, i12, j13);
            }
            T0(j14);
            this.H1 = j13;
            return true;
        }
        this.h.getClass();
        long nanoTime = System.nanoTime();
        v vVar2 = this.O1;
        if (vVar2 != null) {
            vVar2.a(j12, nanoTime, uVar, this.f58408g0);
        }
        M0(lVar, i7, nanoTime);
        T0(wVar.f7791a);
        return true;
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: d3.l.m():boolean");
    }

    @Override
    public final void n() {
        wf.b bVar = this.f7738c1;
        this.J1 = null;
        this.Q1 = -9223372036854775807L;
        L0();
        this.f7755v1 = false;
        this.N1 = null;
        this.E1 = true;
        try {
            super.n();
        } finally {
            bVar.t(this.P0);
            bVar.V(x1.d);
        }
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        boolean z12;
        k0 k0Var;
        this.P0 = new Object();
        m1 m1Var = this.d;
        m1Var.getClass();
        boolean z13 = m1Var.f19482b;
        if (z13 && this.M1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        la.p(z12);
        if (this.L1 != z13) {
            this.L1 = z13;
            n0();
        }
        l2.d dVar = this.P0;
        wf.b bVar = this.f7738c1;
        Handler handler = (Handler) bVar.f59715b;
        if (handler != null) {
            handler.post(new g0(bVar, dVar, 0));
        }
        boolean z14 = this.f7749p1;
        x xVar = this.f7741f1;
        if (!z14) {
            if (this.f7751r1 != null && this.f7748o1 == null) {
                ai.x xVar2 = new ai.x(this.f7736a1, xVar);
                xVar2.f1606a = true;
                long j3 = this.f7744i1;
                long j10 = -9223372036854775807L;
                if (j3 != -9223372036854775807L) {
                    j10 = -j3;
                }
                xVar2.f1608c = j10;
                h2.g0 g0Var = this.h;
                g0Var.getClass();
                xVar2.f1611g = g0Var;
                la.p(!xVar2.f1607b);
                if (((r) xVar2.f1610f) == null) {
                    xVar2.f1610f = new r();
                }
                t tVar = new t(xVar2);
                xVar2.f1607b = true;
                if (1 >= tVar.f7790p) {
                    tVar.f7790p = 1;
                }
                SparseArray sparseArray = tVar.f7779c;
                if (l0.k(sparseArray, 0)) {
                    k0Var = (k0) sparseArray.get(0);
                } else {
                    o oVar = new o(tVar, tVar.f7777a);
                    tVar.f7782g.add(oVar);
                    sparseArray.put(0, oVar);
                    k0Var = oVar;
                }
                this.f7748o1 = k0Var;
            }
            this.f7749p1 = true;
        }
        k0 k0Var2 = this.f7748o1;
        if (k0Var2 != null) {
            k0Var2.g(new d6.i(this, 11));
            v vVar = this.O1;
            if (vVar != null) {
                this.f7748o1.c(vVar);
            }
            if (this.f7752s1 != null && !this.f7754u1.equals(h2.y.f13868c)) {
                this.f7748o1.f(this.f7752s1, this.f7754u1);
            }
            this.f7748o1.l(this.f7757x1);
            this.f7748o1.d(this.f58404c0);
            List list = this.f7751r1;
            if (list != null) {
                this.f7748o1.p(list);
            }
            this.f7750q1 = !z11 ? 1 : 0;
            this.T0 = true;
            return;
        }
        h2.g0 g0Var2 = this.h;
        g0Var2.getClass();
        xVar.f7802l = g0Var2;
        xVar.e(!z11 ? 1 : 0);
    }

    @Override
    public final void o0() {
        k0 k0Var = this.f7748o1;
        if (k0Var != null) {
            k0Var.k();
        } else {
            long j3 = this.Q0.f58401f;
        }
    }

    @Override
    public final void p(long j3, boolean z10, boolean z11) {
        k0 k0Var = this.f7748o1;
        if (k0Var != null && !z10) {
            k0Var.o(true);
        }
        if (z11) {
            this.D1 = j3;
        }
        super.p(j3, z10, z11);
        k0 k0Var2 = this.f7748o1;
        x xVar = this.f7741f1;
        if (k0Var2 == null) {
            xVar.f7794b.b();
            xVar.h = -9223372036854775807L;
            xVar.f7797f = -9223372036854775807L;
            xVar.f7796e = Math.min(xVar.f7796e, 1);
            xVar.f7799i = -9223372036854775807L;
            xVar.f7804n = false;
        }
        y yVar = this.f7745j1;
        if (yVar != null) {
            yVar.b();
        }
        if (z10) {
            k0 k0Var3 = this.f7748o1;
            if (k0Var3 != null) {
                k0Var3.r(false);
            } else {
                xVar.c(false);
            }
        }
        L0();
        this.A1 = 0;
    }

    @Override
    public final void q() {
        k0 k0Var = this.f7748o1;
        if (k0Var != null && this.f7737b1) {
            k0Var.release();
        }
    }

    @Override
    public final void q0() {
        super.q0();
        this.f7746k1.clear();
        this.B1 = 0;
        this.S1 = 0;
        this.E1 = false;
        wf.b bVar = this.f7743h1;
        if (bVar != null) {
            bVar.f59716c = null;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f59715b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override
    public final void r() {
        try {
            this.f58426z0 = false;
            p0();
            n0();
            p5.c.w(this.Y, null);
            this.Y = null;
        } finally {
            this.f7749p1 = false;
            this.P1 = -9223372036854775807L;
            n nVar = this.f7753t1;
            if (nVar != null) {
                nVar.release();
                this.f7753t1 = null;
            }
        }
    }

    @Override
    public final void s() {
        this.f7759z1 = 0;
        this.h.getClass();
        this.f7758y1 = SystemClock.elapsedRealtime();
        this.F1 = 0L;
        this.G1 = 0;
        k0 k0Var = this.f7748o1;
        if (k0Var != null) {
            k0Var.h();
        } else {
            this.f7741f1.d();
        }
    }

    @Override
    public final void t() {
        K0();
        int i7 = this.G1;
        if (i7 != 0) {
            long j3 = this.F1;
            wf.b bVar = this.f7738c1;
            Handler handler = (Handler) bVar.f59715b;
            if (handler != null) {
                handler.post(new f0(bVar, j3, i7));
            }
            this.F1 = 0L;
            this.G1 = 0;
        }
        k0 k0Var = this.f7748o1;
        if (k0Var != null) {
            k0Var.e();
        } else {
            x xVar = this.f7741f1;
            xVar.d = false;
            xVar.f7799i = -9223372036854775807L;
            c0 c0Var = xVar.f7794b;
            c0Var.d = false;
            z zVar = c0Var.f7668c;
            if (zVar != null) {
                zVar.b();
            }
            c0Var.a();
        }
        y yVar = this.f7745j1;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override
    public final void u(e2.u[] uVarArr, long j3, long j10, x2.g0 g0Var) {
        super.u(uVarArr, j3, j10, g0Var);
        S0(g0Var);
        y yVar = this.f7745j1;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override
    public final boolean u0(k2.h r15) {
        throw new UnsupportedOperationException("Method not decompiled: d3.l.u0(k2.h):boolean");
    }

    @Override
    public final void v() {
        x2.g0 g0Var = this.H;
        if (g0Var != null) {
            S0(g0Var);
        }
    }

    @Override
    public final boolean v0() {
        boolean z10;
        e2.u uVar = this.f58407f0;
        long j3 = this.Q1;
        if (j3 != -9223372036854775807L) {
            if (this.V0 + 1 + j3 <= Long.MAX_VALUE - (this.Q0.f58399c + j3)) {
                z10 = false;
                if (this.C1 != null && !this.E1 && !this.L1 && ((uVar == null || uVar.f10800u <= 0) && !z10 && this.Q0.f58401f == -9223372036854775807L)) {
                    return false;
                }
                return true;
            }
        }
        z10 = true;
        if (this.C1 != null) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean w0(u2.o oVar) {
        return I0(oVar);
    }

    @Override
    public final void x(long j3, long j10) {
        k0 k0Var = this.f7748o1;
        if (k0Var != null) {
            try {
                k0Var.q(j3, j10);
            } catch (j0 e10) {
                throw d(e10, e10.f7733a, false, 7001);
            }
        }
        super.x(j3, j10);
    }

    @Override
    public final boolean x0() {
        u2.o oVar = this.f58413l0;
        if (this.f7748o1 != null && oVar != null) {
            String str = oVar.f58383a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.x0();
    }

    @Override
    public final int z0(u2.i iVar, e2.u uVar) {
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (!s0.m(uVar.f10798s)) {
            return i5.c.a(0, 0, 0, 0);
        }
        if (uVar.f10801w != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.f7736a1;
        List F0 = F0(context, iVar, uVar, z10, false);
        if (z10 && F0.isEmpty()) {
            F0 = F0(context, iVar, uVar, false, false);
        }
        if (F0.isEmpty()) {
            return i5.c.a(1, 0, 0, 0);
        }
        int i14 = uVar.T;
        if (i14 != 0 && i14 != 2) {
            return i5.c.a(2, 0, 0, 0);
        }
        u2.o oVar = (u2.o) F0.get(0);
        boolean e10 = oVar.e(context, uVar);
        if (!e10) {
            for (int i15 = 1; i15 < F0.size(); i15++) {
                u2.o oVar2 = (u2.o) F0.get(i15);
                if (oVar2.e(context, uVar)) {
                    z11 = false;
                    e10 = true;
                    oVar = oVar2;
                    break;
                }
            }
        }
        z11 = true;
        if (e10) {
            i7 = 4;
        } else {
            i7 = 3;
        }
        if (oVar.f(uVar)) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        if (oVar.f58388g) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(uVar.f10798s) && !f2.i.c(context)) {
            i12 = 256;
        }
        if (e10) {
            List F02 = F0(context, iVar, uVar, z10, true);
            if (!F02.isEmpty()) {
                HashMap hashMap = u2.w.f58430a;
                ArrayList arrayList = new ArrayList(F02);
                Collections.sort(arrayList, new s4(new wc1(14, context, uVar), 4));
                u2.o oVar3 = (u2.o) arrayList.get(0);
                if (oVar3.e(context, uVar) && oVar3.f(uVar)) {
                    i13 = 32;
                }
            }
        }
        return i7 | i10 | i13 | i11 | i12;
    }
}
