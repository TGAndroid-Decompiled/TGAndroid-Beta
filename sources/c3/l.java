package c3;

import ai.k3;
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
import b8.zb;
import ci.y4;
import d2.a2;
import d2.k1;
import d2.n1;
import d2.u0;
import d2.y1;
import g2.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import k2.p1;
import k2.q1;
import k2.s1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.na1;
public final class l extends t2.r {
    public static final int[] T1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean U1;
    public static boolean V1;
    public int A1;
    public int B1;
    public s1 C1;
    public long D1;
    public boolean E1;
    public long F1;
    public int G1;
    public long H1;
    public a2 I1;
    public a2 J1;
    public int K1;
    public boolean L1;
    public int M1;
    public k N1;
    public w O1;
    public long P1;
    public long Q1;
    public boolean R1;
    public int S1;
    public final Context f4058a1;
    public final boolean f4059b1;
    public final tf.b f4060c1;
    public final int f4061d1;
    public final boolean f4062e1;
    public final y f4063f1;
    public final x f4064g1;
    public final tf.b f4065h1;
    public final long f4066i1;
    public final z f4067j1;
    public final PriorityQueue k1;
    public a7.d f4068l1;
    public boolean m1;
    public boolean f4069n1;
    public l0 f4070o1;
    public boolean f4071p1;
    public int f4072q1;
    public List f4073r1;
    public Surface f4074s1;
    public n f4075t1;
    public g2.z f4076u1;
    public boolean f4077v1;
    public int f4078w1;
    public int f4079x1;
    public long f4080y1;
    public int f4081z1;

    public l(c3.j r8) {
        throw new UnsupportedOperationException("Method not decompiled: c3.l.<init>(c3.j):void");
    }

    public static boolean D0(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: c3.l.D0(java.lang.String):boolean");
    }

    public static int E0(t2.o r11, d2.v r12) {
        throw new UnsupportedOperationException("Method not decompiled: c3.l.E0(t2.o, d2.v):int");
    }

    public static List F0(Context context, t2.i iVar, d2.v vVar, boolean z10, boolean z11) {
        List b10;
        String str = vVar.f8489s;
        if (str == null) {
            return g9.s1.f12146e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !e2.h.d(context)) {
            String c2 = t2.w.c(vVar);
            if (c2 == null) {
                b10 = g9.s1.f12146e;
            } else {
                b10 = iVar.b(c2, z10, z11);
            }
            if (!b10.isEmpty()) {
                return b10;
            }
        }
        return t2.w.g(iVar, vVar, z10, z11);
    }

    public static int G0(t2.o oVar, d2.v vVar) {
        int i3 = vVar.f8490t;
        List list = vVar.v;
        if (i3 != -1) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) list.get(i11)).length;
            }
            return vVar.f8490t + i10;
        }
        return E0(oVar, vVar);
    }

    @Override
    public final void A(float f10, float f11) {
        super.A(f10, f11);
        l0 l0Var = this.f4070o1;
        if (l0Var != null) {
            l0Var.b(f10);
        } else {
            this.f4063f1.h(f10);
        }
        z zVar = this.f4067j1;
        if (zVar != null) {
            zVar.c(f10);
        }
    }

    @Override
    public final boolean E(long j10) {
        if (this.J0 == -9223372036854775807L || j10 < this.D1) {
            return false;
        }
        long j11 = this.R0;
        if (j11 != -9223372036854775807L && j10 <= j11) {
            return false;
        }
        return true;
    }

    @Override
    public final k2.e H(t2.o oVar, d2.v vVar, d2.v vVar2, boolean z10) {
        int i3;
        int i10;
        k2.e b10 = oVar.b(vVar, vVar2);
        float f10 = vVar.D;
        float f11 = vVar2.D;
        int i11 = b10.f16482e;
        a7.d dVar = this.f4068l1;
        dVar.getClass();
        if (vVar2.f8495z > dVar.f138a || vVar2.A > dVar.f139b) {
            i11 |= 256;
        }
        if (G0(oVar, vVar2) > dVar.f140c) {
            i11 |= 64;
        }
        if (this.f4079x1 != Integer.MIN_VALUE && (i10 = Build.VERSION.SDK_INT) < 31 && ((i10 != 30 || Build.MODEL.startsWith("MiTV")) && f10 != -1.0f && f11 != -1.0f && (!oVar.f54856f || !z10))) {
            float max = Math.max(f11, f10) / Math.min(f11, f10);
            if (Math.abs(max - Math.round(max)) > 0.01f) {
                i11 |= 65536;
            }
        }
        int i12 = i11;
        String str = oVar.f54852a;
        if (i12 != 0) {
            i3 = 0;
        } else {
            i3 = b10.d;
        }
        return new k2.e(str, vVar, vVar2, i3, i12);
    }

    public final android.view.Surface H0(t2.o r6) {
        throw new UnsupportedOperationException("Method not decompiled: c3.l.H0(t2.o):android.view.Surface");
    }

    @Override
    public final t2.n I(IllegalStateException illegalStateException, t2.o oVar) {
        Surface surface = this.f4074s1;
        t2.n nVar = new t2.n(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return nVar;
    }

    public final boolean I0(t2.o oVar) {
        if (this.f4070o1 == null) {
            Surface surface = this.f4074s1;
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

    public final boolean J0(j2.h hVar) {
        if (k() || hVar.isLastSample()) {
            return true;
        }
        long j10 = this.Q1;
        if (j10 == -9223372036854775807L || j10 - (hVar.f16158e - this.Q0.f54868c) <= 100000) {
            return true;
        }
        return false;
    }

    public final void K0() {
        if (this.f4081z1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f4080y1;
            int i3 = this.f4081z1;
            tf.b bVar = this.f4060c1;
            Handler handler = (Handler) bVar.f55094a;
            if (handler != null) {
                handler.post(new g0(bVar, i3, j10));
            }
            this.f4081z1 = 0;
            this.f4080y1 = elapsedRealtime;
        }
    }

    public final void L0() {
        t2.l lVar;
        if (this.L1 && (lVar = this.f54875e0) != null) {
            this.N1 = new k(this, lVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                lVar.setParameters(bundle);
            }
        }
    }

    public final void M0(t2.l lVar, int i3, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.e(i3, j10);
        Trace.endSection();
        this.P0.f16466e++;
        boolean z10 = false;
        this.A1 = 0;
        if (this.f4070o1 == null) {
            a2 a2Var = this.I1;
            boolean equals = a2Var.equals(a2.d);
            tf.b bVar = this.f4060c1;
            if (!equals && !a2Var.equals(this.J1)) {
                this.J1 = a2Var;
                bVar.E(a2Var);
            }
            y yVar = this.f4063f1;
            if (yVar.f4124e != 3) {
                z10 = true;
            }
            yVar.f4124e = 3;
            yVar.f4130l.getClass();
            yVar.f4126g = n0.S(SystemClock.elapsedRealtime());
            if (z10 && (surface = this.f4074s1) != null) {
                bVar.y(surface);
                this.f4077v1 = true;
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
        Surface surface2 = this.f4074s1;
        tf.b bVar = this.f4060c1;
        if (surface2 != surface) {
            this.f4074s1 = surface;
            l0 l0Var = this.f4070o1;
            y yVar = this.f4063f1;
            if (l0Var == null) {
                yVar.g(surface);
            }
            this.f4077v1 = false;
            int i3 = this.f16448n;
            t2.l lVar = this.f54875e0;
            if (lVar != null && this.f4070o1 == null) {
                t2.o oVar = this.f54882l0;
                oVar.getClass();
                if (I0(oVar) && !this.m1) {
                    Surface H0 = H0(oVar);
                    if (H0 != null) {
                        try {
                            lVar.l(H0);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            throw new IllegalArgumentException(th2);
                        }
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        lVar.d();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    n0();
                    X();
                }
            }
            if (surface != null) {
                a2 a2Var = this.J1;
                if (a2Var != null) {
                    bVar.E(a2Var);
                }
            } else {
                this.J1 = null;
                l0 l0Var2 = this.f4070o1;
                if (l0Var2 != null) {
                    l0Var2.k();
                }
            }
            if (i3 == 2) {
                l0 l0Var3 = this.f4070o1;
                if (l0Var3 != null) {
                    l0Var3.q(true);
                } else {
                    yVar.c(true);
                }
            }
            L0();
        } else if (surface != null) {
            a2 a2Var2 = this.J1;
            if (a2Var2 != null) {
                bVar.E(a2Var2);
            }
            Surface surface3 = this.f4074s1;
            if (surface3 != null && this.f4077v1) {
                bVar.y(surface3);
            }
        }
    }

    @Override
    public final int O(j2.h hVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            if ((this.C1 != null || this.L1) && hVar.f16158e < this.f16452x && !J0(hVar)) {
                return 32;
            }
            return 0;
        }
        return 0;
    }

    public final boolean O0(long j10, long j11, boolean z10, boolean z11) {
        int B;
        if (this.f4070o1 != null && this.f4059b1) {
            j11 -= -this.P1;
        }
        if (j10 >= -500000 || z10 || (B = B(j11)) == 0) {
            return false;
        }
        this.D1 = j11;
        PriorityQueue priorityQueue = this.k1;
        if (z11) {
            k2.d dVar = this.P0;
            int i3 = dVar.d + B;
            dVar.d = i3;
            dVar.f16467f += this.B1;
            dVar.d = priorityQueue.size() + i3;
        } else {
            this.P0.f16470j++;
            R0(priorityQueue.size() + B, this.B1);
        }
        if (this.f54875e0 != null) {
            if (x0()) {
                n0();
                X();
            } else if (v0()) {
                M();
            } else {
                this.U0 = true;
            }
        }
        l0 l0Var = this.f4070o1;
        if (l0Var != null) {
            l0Var.l(false);
        }
        return true;
    }

    @Override
    public final float P(float f10, d2.v vVar, d2.v[] vVarArr) {
        float f11;
        t2.o oVar;
        float f12 = -1.0f;
        for (d2.v vVar2 : vVarArr) {
            float f13 = vVar2.D;
            if (f13 != -1.0f) {
                f12 = Math.max(f12, f13);
            }
        }
        if (f12 == -1.0f) {
            f11 = -1.0f;
        } else {
            f11 = f12 * f10;
        }
        if (this.C1 != null && (oVar = this.f54882l0) != null) {
            int i3 = vVar.f8495z;
            int i10 = vVar.A;
            float f14 = -3.4028235E38f;
            if (oVar.f54858i) {
                float f15 = oVar.f54861l;
                if (f15 != -3.4028235E38f && oVar.f54859j == i3 && oVar.f54860k == i10) {
                    f14 = f15;
                } else {
                    float f16 = 1024.0f;
                    if (oVar.g(i3, i10, 1024.0f)) {
                        f14 = 1024.0f;
                    } else {
                        f14 = 0.0f;
                        while (true) {
                            float f17 = f16 - f14;
                            if (Math.abs(f17) <= 5.0f) {
                                break;
                            }
                            float f18 = (f17 / 2.0f) + f14;
                            if (oVar.g(i3, i10, f18)) {
                                f14 = f18;
                            } else {
                                f16 = f18;
                            }
                        }
                    }
                    oVar.f54861l = f14;
                    oVar.f54859j = i3;
                    oVar.f54860k = i10;
                }
            }
            if (f11 != -1.0f) {
                return Math.max(f11, f14);
            }
            return f14;
        }
        return f11;
    }

    public final boolean P0(t2.o oVar) {
        if (!this.L1 && !D0(oVar.f54852a)) {
            if (!oVar.f54856f || n.b(this.f4058a1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final ArrayList Q(t2.i iVar, d2.v vVar, boolean z10) {
        boolean z11 = this.L1;
        Context context = this.f4058a1;
        List F0 = F0(context, iVar, vVar, z10, z11);
        HashMap hashMap = t2.w.f54899a;
        ArrayList arrayList = new ArrayList(F0);
        Collections.sort(arrayList, new y4(new na1(11, context, vVar), 4));
        return arrayList;
    }

    public final void Q0(t2.l lVar, int i3) {
        Trace.beginSection("skipVideoBuffer");
        lVar.c(i3);
        Trace.endSection();
        this.P0.f16467f++;
    }

    public final void R0(int i3, int i10) {
        k2.d dVar = this.P0;
        dVar.h += i3;
        int i11 = i3 + i10;
        dVar.f16468g += i11;
        this.f4081z1 += i11;
        int i12 = this.A1 + i11;
        this.A1 = i12;
        dVar.f16469i = Math.max(i12, dVar.f16469i);
        int i13 = this.f4061d1;
        if (i13 > 0 && this.f4081z1 >= i13) {
            K0();
        }
    }

    public final void S0(w2.g0 g0Var) {
        n1 n1Var = this.G;
        if (n1Var.p()) {
            this.Q1 = -9223372036854775807L;
            return;
        }
        int b10 = n1Var.b(g0Var.f57081a);
        if (b10 == -1) {
            this.Q1 = -9223372036854775807L;
        } else {
            this.Q1 = n1Var.f(b10, new k1(), false).d;
        }
    }

    @Override
    public final l2.e T(t2.o oVar, d2.v vVar, MediaCrypto mediaCrypto, float f10) {
        d2.n nVar;
        int i3;
        a7.d dVar;
        boolean z10;
        int i10;
        int i11;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i12;
        int i13;
        char c2;
        boolean z11;
        int i14;
        boolean z12;
        Pair b10;
        int E0;
        String str = oVar.f54854c;
        d2.v[] vVarArr = this.f16450s;
        vVarArr.getClass();
        int i15 = vVar.f8495z;
        float f11 = vVar.D;
        d2.n nVar2 = vVar.I;
        int i16 = vVar.A;
        int G0 = G0(oVar, vVar);
        if (vVarArr.length == 1) {
            if (G0 != -1 && (E0 = E0(oVar, vVar)) != -1) {
                G0 = Math.min((int) (G0 * 1.5f), E0);
            }
            dVar = new a7.d(i15, i16, G0);
            nVar = nVar2;
            i3 = i16;
        } else {
            int length = vVarArr.length;
            int i17 = i15;
            int i18 = i16;
            int i19 = 0;
            boolean z13 = false;
            while (i19 < length) {
                d2.v vVar2 = vVarArr[i19];
                d2.v[] vVarArr2 = vVarArr;
                if (nVar2 != null && vVar2.I == null) {
                    d2.u a10 = vVar2.a();
                    a10.H = nVar2;
                    vVar2 = new d2.v(a10);
                }
                k2.e b11 = oVar.b(vVar, vVar2);
                int i20 = length;
                int i21 = vVar2.A;
                if (b11.d != 0) {
                    int i22 = vVar2.f8495z;
                    i13 = i19;
                    c2 = 65535;
                    if (i22 != -1 && i21 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    i17 = Math.max(i17, i22);
                    i18 = Math.max(i18, i21);
                    G0 = Math.max(G0, G0(oVar, vVar2));
                } else {
                    i13 = i19;
                    c2 = 65535;
                }
                length = i20;
                i19 = i13 + 1;
                vVarArr = vVarArr2;
            }
            if (z13) {
                g2.a.l("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i17 + "x" + i18);
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
                    nVar = nVar2;
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
                        point = new Point(n0.g(i26, widthAlignment) * widthAlignment, n0.g(i24, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i3 = i16;
                        if (oVar.g(point.x, point.y, f11)) {
                            break;
                        }
                    } else {
                        i3 = i16;
                    }
                    i23 = i25 + 1;
                    i16 = i3;
                    nVar2 = nVar;
                    i11 = i27;
                    i10 = i12;
                }
                i3 = i16;
                point = null;
                if (point != null) {
                    i17 = Math.max(i17, point.x);
                    i18 = Math.max(i18, point.y);
                    d2.u a11 = vVar.a();
                    a11.f8437y = i17;
                    a11.f8438z = i18;
                    G0 = Math.max(G0, E0(oVar, new d2.v(a11)));
                    g2.a.l("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i17 + "x" + i18);
                }
            } else {
                nVar = nVar2;
                i3 = i16;
            }
            dVar = new a7.d(i17, i18, G0);
        }
        this.f4068l1 = dVar;
        if (this.L1) {
            i14 = this.M1;
        } else {
            i14 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i15);
        mediaFormat.setInteger("height", i3);
        g2.a.k(mediaFormat, vVar.v);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        g2.a.j(mediaFormat, "rotation-degrees", vVar.E);
        if (nVar != null) {
            d2.n nVar3 = nVar;
            g2.a.j(mediaFormat, "color-transfer", nVar3.f8230c);
            g2.a.j(mediaFormat, "color-standard", nVar3.f8228a);
            g2.a.j(mediaFormat, "color-range", nVar3.f8229b);
            byte[] bArr = nVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(vVar.f8489s) && (b10 = g2.h.b(vVar)) != null) {
            g2.a.j(mediaFormat, "profile", ((Integer) b10.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.f138a);
        mediaFormat.setInteger("max-height", dVar.f139b);
        g2.a.j(mediaFormat, "max-input-size", dVar.f140c);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (this.f4062e1) {
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
        if (this.f4070o1 != null && !n0.N(this.f4058a1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new l2.e(oVar, mediaFormat, vVar, H0, mediaCrypto, null);
    }

    public final void T0(long j10) {
        k2.d dVar = this.P0;
        dVar.f16471k += j10;
        dVar.f16472l++;
        this.F1 += j10;
        this.G1++;
    }

    @Override
    public final void U(j2.h hVar) {
        if (this.f4069n1) {
            ByteBuffer byteBuffer = hVar.f16159f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s6 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s6 == 60 && s10 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        t2.l lVar = this.f54875e0;
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
    public final boolean Z(d2.v vVar) {
        l0 l0Var = this.f4070o1;
        if (l0Var != null && !l0Var.u()) {
            try {
                return this.f4070o1.e(vVar);
            } catch (k0 e10) {
                throw e(e10, vVar, false, 7000);
            }
        }
        return true;
    }

    @Override
    public final void a0(Exception exc) {
        g2.a.d("MediaCodecVideoRenderer", "Video codec error", exc);
        tf.b bVar = this.f4060c1;
        Handler handler = (Handler) bVar.f55094a;
        if (handler != null) {
            handler.post(new a1.f(28, bVar, exc));
        }
    }

    @Override
    public final void b0(long j10, String str, long j11) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        tf.b bVar = this.f4060c1;
        Handler handler = (Handler) bVar.f55094a;
        if (handler != null) {
            str2 = str;
            handler.post(new f0(bVar, str2, j10, j11, 0));
        } else {
            str2 = str;
        }
        this.m1 = D0(str2);
        t2.o oVar = this.f54882l0;
        oVar.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(oVar.f54853b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (codecProfileLevelArr[i3].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f4069n1 = z10;
        L0();
    }

    @Override
    public final void c0(k2.c cVar) {
        tf.b bVar = this.f4060c1;
        Handler handler = (Handler) bVar.f55094a;
        if (handler != null) {
            handler.post(new a1.f(26, bVar, cVar));
        }
    }

    @Override
    public final void d(int i3, Object obj) {
        boolean z10;
        boolean z11 = true;
        if (i3 != 1) {
            if (i3 != 7) {
                if (i3 != 10) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 13) {
                                if (i3 != 14) {
                                    switch (i3) {
                                        case 16:
                                            obj.getClass();
                                            this.K1 = ((Integer) obj).intValue();
                                            t2.l lVar = this.f54875e0;
                                            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.K1));
                                                lVar.setParameters(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.f4074s1;
                                            N0(null);
                                            obj.getClass();
                                            ((l) obj).d(1, surface);
                                            return;
                                        case 18:
                                            if (this.C1 != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            s1 s1Var = (s1) obj;
                                            this.C1 = s1Var;
                                            if (s1Var == null) {
                                                z11 = false;
                                            }
                                            if (z10 != z11) {
                                                A0(this.f54876f0);
                                                return;
                                            }
                                            return;
                                        default:
                                            super.d(i3, obj);
                                            return;
                                    }
                                }
                                obj.getClass();
                                g2.z zVar = (g2.z) obj;
                                if (zVar.f11927a != 0 && zVar.f11928b != 0) {
                                    this.f4076u1 = zVar;
                                    l0 l0Var = this.f4070o1;
                                    if (l0Var != null) {
                                        Surface surface2 = this.f4074s1;
                                        surface2.getClass();
                                        l0Var.o(surface2, zVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(y1.f8520a)) {
                                l0 l0Var2 = this.f4070o1;
                                if (l0Var2 != null && l0Var2.u()) {
                                    this.f4070o1.s();
                                    return;
                                }
                                return;
                            }
                            this.f4073r1 = list;
                            l0 l0Var3 = this.f4070o1;
                            if (l0Var3 != null) {
                                l0Var3.m(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.f4079x1 = intValue;
                        l0 l0Var4 = this.f4070o1;
                        if (l0Var4 != null) {
                            l0Var4.j(intValue);
                            return;
                        }
                        d0 d0Var = this.f4063f1.f4122b;
                        if (d0Var.f3997j != intValue) {
                            d0Var.f3997j = intValue;
                            d0Var.d(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.f4078w1 = intValue2;
                    t2.l lVar2 = this.f54875e0;
                    if (lVar2 != null) {
                        lVar2.j(intValue2);
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
            w wVar = (w) obj;
            this.O1 = wVar;
            l0 l0Var5 = this.f4070o1;
            if (l0Var5 != null) {
                l0Var5.p(wVar);
                return;
            }
            return;
        }
        N0(obj);
    }

    @Override
    public final void d0(String str) {
        tf.b bVar = this.f4060c1;
        Handler handler = (Handler) bVar.f55094a;
        if (handler != null) {
            handler.post(new a1.f(29, bVar, str));
        }
    }

    @Override
    public final k2.e e0(tf.b bVar) {
        k2.e e02 = super.e0(bVar);
        d2.v vVar = (d2.v) bVar.f55095b;
        vVar.getClass();
        tf.b bVar2 = this.f4060c1;
        Handler handler = (Handler) bVar2.f55094a;
        if (handler != null) {
            handler.post(new k3(bVar2, vVar, e02, 9));
        }
        z zVar = this.f4067j1;
        if (zVar != null) {
            zVar.b();
        }
        return e02;
    }

    @Override
    public final void f() {
        l0 l0Var = this.f4070o1;
        if (l0Var != null) {
            int i3 = this.f4072q1;
            if (i3 != 0 && i3 != 1) {
                l0Var.v();
                return;
            } else {
                this.f4072q1 = 0;
                return;
            }
        }
        y yVar = this.f4063f1;
        if (yVar.f4124e == 0) {
            yVar.f4124e = 1;
        }
    }

    @Override
    public final void f0(d2.v vVar, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        int i3;
        int i10;
        t2.l lVar = this.f54875e0;
        if (lVar != null) {
            lVar.j(this.f4078w1);
        }
        if (this.L1) {
            i10 = vVar.f8495z;
            i3 = vVar.A;
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
            i3 = integer2;
            i10 = i11;
        }
        float f10 = vVar.F;
        int i12 = vVar.E;
        if (i12 == 90 || i12 == 270) {
            f10 = 1.0f / f10;
            int i13 = i3;
            i3 = i10;
            i10 = i13;
        }
        this.I1 = new a2(f10, i10, i3);
        l0 l0Var = this.f4070o1;
        if (l0Var != null && this.R1) {
            d2.u a10 = vVar.a();
            a10.f8437y = i10;
            a10.f8438z = i3;
            a10.E = f10;
            d2.v vVar2 = new d2.v(a10);
            int i14 = this.f4072q1;
            List list = this.f4073r1;
            if (list == null) {
                g9.g0 g0Var = g9.i0.f12083b;
                list = g9.s1.f12146e;
            }
            l0Var.f(vVar2, this.Q0.f54867b, i14, list);
            this.f4072q1 = 2;
        } else {
            this.f4063f1.f(vVar.D);
        }
        this.R1 = false;
    }

    @Override
    public final void h0(long j10) {
        super.h0(j10);
        if (!this.L1) {
            this.B1--;
        }
    }

    @Override
    public final void i0() {
        l0 l0Var = this.f4070o1;
        if (l0Var != null) {
            l0Var.i();
            if (this.P1 == -9223372036854775807L) {
                this.P1 = this.Q0.f54867b;
            }
            this.f4070o1.h(-this.P1);
        } else {
            this.f4063f1.e(2);
        }
        this.R1 = true;
        L0();
    }

    @Override
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void j0(j2.h hVar) {
        ByteBuffer byteBuffer;
        tf.b bVar = this.f4065h1;
        if (bVar != null) {
            t2.o oVar = this.f54882l0;
            oVar.getClass();
            if (oVar.f54853b.equals("video/av01") && hVar.isKeyFrame() && (byteBuffer = hVar.f16157c) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) bVar.f55094a;
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
            l0 l0Var = this.f4070o1;
            if (l0Var == null || l0Var.a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean l0(long j10, long j11, t2.l lVar, ByteBuffer byteBuffer, int i3, int i10, int i11, long j12, boolean z10, boolean z11, d2.v vVar) {
        int i12;
        lVar.getClass();
        long j13 = j12 - this.Q0.f54868c;
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.k1;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j12) {
                break;
            }
            i13++;
            priorityQueue.poll();
        }
        R0(i13, 0);
        l0 l0Var = this.f4070o1;
        if (l0Var != null) {
            if (z10 && !z11) {
                Q0(lVar, i3);
                return true;
            }
            return l0Var.t(j12, new i(this, lVar, i3, j13));
        }
        int a10 = this.f4063f1.a(j12, j10, j11, this.Q0.f54867b, z10, z11, this.f4064g1);
        x xVar = this.f4064g1;
        z zVar = this.f4067j1;
        if (zVar != null && a10 != 5 && a10 != 4) {
            zVar.a(j12, xVar.f4119a);
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
                    Q0(lVar, i3);
                    T0(xVar.f4119a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                lVar.c(i3);
                Trace.endSection();
                R0(0, 1);
                T0(xVar.f4119a);
                return true;
            }
            long j14 = xVar.f4120b;
            long j15 = xVar.f4119a;
            if (j14 == this.H1) {
                Q0(lVar, i3);
            } else {
                w wVar = this.O1;
                if (wVar != null) {
                    i12 = i3;
                    wVar.a(j13, j14, vVar, this.f54877g0);
                } else {
                    i12 = i3;
                }
                M0(lVar, i12, j14);
            }
            T0(j15);
            this.H1 = j14;
            return true;
        }
        this.h.getClass();
        long nanoTime = System.nanoTime();
        w wVar2 = this.O1;
        if (wVar2 != null) {
            wVar2.a(j13, nanoTime, vVar, this.f54877g0);
        }
        M0(lVar, i3, nanoTime);
        T0(xVar.f4119a);
        return true;
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: c3.l.m():boolean");
    }

    @Override
    public final void n() {
        tf.b bVar = this.f4060c1;
        this.J1 = null;
        this.Q1 = -9223372036854775807L;
        L0();
        this.f4077v1 = false;
        this.N1 = null;
        this.E1 = true;
        try {
            super.n();
        } finally {
            bVar.s(this.P0);
            bVar.E(a2.d);
        }
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        boolean z12;
        l0 l0Var;
        this.P0 = new Object();
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z13 = q1Var.f16685b;
        if (z13 && this.M1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        zb.p(z12);
        if (this.L1 != z13) {
            this.L1 = z13;
            n0();
        }
        k2.d dVar = this.P0;
        tf.b bVar = this.f4060c1;
        Handler handler = (Handler) bVar.f55094a;
        if (handler != null) {
            handler.post(new h0(bVar, dVar, 0));
        }
        boolean z14 = this.f4071p1;
        y yVar = this.f4063f1;
        if (!z14) {
            if (this.f4073r1 != null && this.f4070o1 == null) {
                o oVar = new o(this.f4058a1, yVar);
                oVar.d = true;
                long j10 = this.f4066i1;
                long j11 = -9223372036854775807L;
                if (j10 != -9223372036854775807L) {
                    j11 = -j10;
                }
                oVar.f4095g = j11;
                g2.h0 h0Var = this.h;
                h0Var.getClass();
                oVar.f4093e = h0Var;
                zb.p(!oVar.f4094f);
                if (oVar.f4092c == null) {
                    oVar.f4092c = new s();
                }
                u uVar = new u(oVar);
                oVar.f4094f = true;
                if (1 >= uVar.f4118p) {
                    uVar.f4118p = 1;
                }
                SparseArray sparseArray = uVar.f4107c;
                if (n0.k(sparseArray, 0)) {
                    l0Var = (l0) sparseArray.get(0);
                } else {
                    p pVar = new p(uVar, uVar.f4105a);
                    uVar.f4110g.add(pVar);
                    sparseArray.put(0, pVar);
                    l0Var = pVar;
                }
                this.f4070o1 = l0Var;
            }
            this.f4071p1 = true;
        }
        l0 l0Var2 = this.f4070o1;
        if (l0Var2 != null) {
            l0Var2.w(new c6.i(this, 7));
            w wVar = this.O1;
            if (wVar != null) {
                this.f4070o1.p(wVar);
            }
            if (this.f4074s1 != null && !this.f4076u1.equals(g2.z.f11926c)) {
                this.f4070o1.o(this.f4074s1, this.f4076u1);
            }
            this.f4070o1.j(this.f4079x1);
            this.f4070o1.b(this.f54873c0);
            List list = this.f4073r1;
            if (list != null) {
                this.f4070o1.m(list);
            }
            this.f4072q1 = !z11 ? 1 : 0;
            this.T0 = true;
            return;
        }
        g2.h0 h0Var2 = this.h;
        h0Var2.getClass();
        yVar.f4130l = h0Var2;
        yVar.e(!z11 ? 1 : 0);
    }

    @Override
    public final void o0() {
        l0 l0Var = this.f4070o1;
        if (l0Var != null) {
            l0Var.i();
        } else {
            long j10 = this.Q0.f54870f;
        }
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        l0 l0Var = this.f4070o1;
        if (l0Var != null && !z10) {
            l0Var.l(true);
        }
        if (z11) {
            this.D1 = j10;
        }
        super.p(j10, z10, z11);
        l0 l0Var2 = this.f4070o1;
        y yVar = this.f4063f1;
        if (l0Var2 == null) {
            yVar.f4122b.b();
            yVar.h = -9223372036854775807L;
            yVar.f4125f = -9223372036854775807L;
            yVar.f4124e = Math.min(yVar.f4124e, 1);
            yVar.f4127i = -9223372036854775807L;
            yVar.f4132n = false;
        }
        z zVar = this.f4067j1;
        if (zVar != null) {
            zVar.b();
        }
        if (z10) {
            l0 l0Var3 = this.f4070o1;
            if (l0Var3 != null) {
                l0Var3.q(false);
            } else {
                yVar.c(false);
            }
        }
        L0();
        this.A1 = 0;
    }

    @Override
    public final void q() {
        l0 l0Var = this.f4070o1;
        if (l0Var != null && this.f4059b1) {
            l0Var.release();
        }
    }

    @Override
    public final void q0() {
        super.q0();
        this.k1.clear();
        this.B1 = 0;
        this.S1 = 0;
        this.E1 = false;
        tf.b bVar = this.f4065h1;
        if (bVar != null) {
            bVar.f55095b = null;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f55094a;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override
    public final void r() {
        try {
            this.f54895z0 = false;
            p0();
            n0();
            f1.E(this.Y, null);
            this.Y = null;
        } finally {
            this.f4071p1 = false;
            this.P1 = -9223372036854775807L;
            n nVar = this.f4075t1;
            if (nVar != null) {
                nVar.release();
                this.f4075t1 = null;
            }
        }
    }

    @Override
    public final void s() {
        this.f4081z1 = 0;
        this.h.getClass();
        this.f4080y1 = SystemClock.elapsedRealtime();
        this.F1 = 0L;
        this.G1 = 0;
        l0 l0Var = this.f4070o1;
        if (l0Var != null) {
            l0Var.g();
        } else {
            this.f4063f1.d();
        }
    }

    @Override
    public final void t() {
        K0();
        int i3 = this.G1;
        if (i3 != 0) {
            long j10 = this.F1;
            tf.b bVar = this.f4060c1;
            Handler handler = (Handler) bVar.f55094a;
            if (handler != null) {
                handler.post(new g0(bVar, j10, i3));
            }
            this.F1 = 0L;
            this.G1 = 0;
        }
        l0 l0Var = this.f4070o1;
        if (l0Var != null) {
            l0Var.d();
        } else {
            y yVar = this.f4063f1;
            yVar.d = false;
            yVar.f4127i = -9223372036854775807L;
            d0 d0Var = yVar.f4122b;
            d0Var.d = false;
            a0 a0Var = d0Var.f3992c;
            if (a0Var != null) {
                a0Var.b();
            }
            d0Var.a();
        }
        z zVar = this.f4067j1;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override
    public final void u(d2.v[] vVarArr, long j10, long j11, w2.g0 g0Var) {
        super.u(vVarArr, j10, j11, g0Var);
        S0(g0Var);
        z zVar = this.f4067j1;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override
    public final boolean u0(j2.h r15) {
        throw new UnsupportedOperationException("Method not decompiled: c3.l.u0(j2.h):boolean");
    }

    @Override
    public final void v() {
        w2.g0 g0Var = this.H;
        if (g0Var != null) {
            S0(g0Var);
        }
    }

    @Override
    public final boolean v0() {
        boolean z10;
        d2.v vVar = this.f54876f0;
        long j10 = this.Q1;
        if (j10 != -9223372036854775807L) {
            if (this.V0 + 1 + j10 <= Long.MAX_VALUE - (this.Q0.f54868c + j10)) {
                z10 = false;
                if (this.C1 != null && !this.E1 && !this.L1 && ((vVar == null || vVar.f8491u <= 0) && !z10 && this.Q0.f54870f == -9223372036854775807L)) {
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
    public final boolean w0(t2.o oVar) {
        return I0(oVar);
    }

    @Override
    public final void x(long j10, long j11) {
        l0 l0Var = this.f4070o1;
        if (l0Var != null) {
            try {
                l0Var.n(j10, j11);
            } catch (k0 e10) {
                throw e(e10, e10.f4057a, false, 7001);
            }
        }
        super.x(j10, j11);
    }

    @Override
    public final boolean x0() {
        t2.o oVar = this.f54882l0;
        if (this.f4070o1 != null && oVar != null) {
            String str = oVar.f54852a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.x0();
    }

    @Override
    public final int z0(t2.i iVar, d2.v vVar) {
        boolean z10;
        boolean z11;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (!u0.m(vVar.f8489s)) {
            return p1.a(0, 0, 0, 0);
        }
        if (vVar.f8492w != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.f4058a1;
        List F0 = F0(context, iVar, vVar, z10, false);
        if (z10 && F0.isEmpty()) {
            F0 = F0(context, iVar, vVar, false, false);
        }
        if (F0.isEmpty()) {
            return p1.a(1, 0, 0, 0);
        }
        int i14 = vVar.T;
        if (i14 != 0 && i14 != 2) {
            return p1.a(2, 0, 0, 0);
        }
        t2.o oVar = (t2.o) F0.get(0);
        boolean e10 = oVar.e(context, vVar);
        if (!e10) {
            for (int i15 = 1; i15 < F0.size(); i15++) {
                t2.o oVar2 = (t2.o) F0.get(i15);
                if (oVar2.e(context, vVar)) {
                    z11 = false;
                    e10 = true;
                    oVar = oVar2;
                    break;
                }
            }
        }
        z11 = true;
        if (e10) {
            i3 = 4;
        } else {
            i3 = 3;
        }
        if (oVar.f(vVar)) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        if (oVar.f54857g) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(vVar.f8489s) && !e2.h.d(context)) {
            i12 = 256;
        }
        if (e10) {
            List F02 = F0(context, iVar, vVar, z10, true);
            if (!F02.isEmpty()) {
                HashMap hashMap = t2.w.f54899a;
                ArrayList arrayList = new ArrayList(F02);
                Collections.sort(arrayList, new y4(new na1(11, context, vVar), 4));
                t2.o oVar3 = (t2.o) arrayList.get(0);
                if (oVar3.e(context, vVar) && oVar3.f(vVar)) {
                    i13 = 32;
                }
            }
        }
        return i3 | i10 | i13 | i11 | i12;
    }
}
