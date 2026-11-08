package d3;

import a8.b8;
import a8.ia;
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
import bi.a4;
import bi.h4;
import bi.s5;
import e2.i1;
import e2.l1;
import e2.s0;
import e2.v1;
import e2.x1;
import h2.m0;
import h9.t1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import l2.q1;
import l2.s1;
import org.telegram.ui.Cells.f1;
public final class l extends u2.r {
    public static final int[] S1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean T1;
    public static boolean U1;
    public int A1;
    public s1 B1;
    public long C1;
    public boolean D1;
    public long E1;
    public int F1;
    public long G1;
    public x1 H1;
    public x1 I1;
    public int J1;
    public boolean K1;
    public int L1;
    public k M1;
    public w N1;
    public long O1;
    public long P1;
    public boolean Q1;
    public int R1;
    public final Context Z0;
    public final boolean f8032a1;
    public final wf.b f8033b1;
    public final int f8034c1;
    public final boolean f8035d1;
    public final y f8036e1;
    public final x f8037f1;
    public final wf.b f8038g1;
    public final long f8039h1;
    public final z f8040i1;
    public final PriorityQueue f8041j1;
    public b7.d f8042k1;
    public boolean l1;
    public boolean f8043m1;
    public k0 n1;
    public boolean f8044o1;
    public int f8045p1;
    public List f8046q1;
    public Surface f8047r1;
    public n f8048s1;
    public h2.y f8049t1;
    public boolean f8050u1;
    public int f8051v1;
    public int f8052w1;
    public long f8053x1;
    public int f8054y1;
    public int f8055z1;

    public l(d3.j r8) {
        throw new UnsupportedOperationException("Method not decompiled: d3.l.<init>(d3.j):void");
    }

    public static boolean D0(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: d3.l.D0(java.lang.String):boolean");
    }

    public static int E0(u2.o r11, e2.u r12) {
        throw new UnsupportedOperationException("Method not decompiled: d3.l.E0(u2.o, e2.u):int");
    }

    public static List F0(Context context, u2.i iVar, e2.u uVar, boolean z9, boolean z10) {
        List a10;
        String str = uVar.f10615s;
        if (str == null) {
            return t1.f14397e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !f2.i.c(context)) {
            String c10 = u2.w.c(uVar);
            if (c10 == null) {
                a10 = t1.f14397e;
            } else {
                a10 = iVar.a(c10, z9, z10);
            }
            if (!a10.isEmpty()) {
                return a10;
            }
        }
        return u2.w.g(iVar, uVar, z9, z10);
    }

    public static int G0(u2.o oVar, e2.u uVar) {
        int i7 = uVar.f10616t;
        List list = uVar.v;
        if (i7 != -1) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) list.get(i11)).length;
            }
            return uVar.f10616t + i10;
        }
        return E0(oVar, uVar);
    }

    @Override
    public final void A(float f10, float f11) {
        super.A(f10, f11);
        k0 k0Var = this.n1;
        if (k0Var != null) {
            k0Var.d(f10);
        } else {
            this.f8036e1.h(f10);
        }
        z zVar = this.f8040i1;
        if (zVar != null) {
            zVar.c(f10);
        }
    }

    @Override
    public final boolean E(long j3) {
        if (this.I0 == -9223372036854775807L || j3 < this.C1) {
            return false;
        }
        long j10 = this.Q0;
        if (j10 != -9223372036854775807L && j3 <= j10) {
            return false;
        }
        return true;
    }

    @Override
    public final l2.e H(u2.o oVar, e2.u uVar, e2.u uVar2, boolean z9) {
        int i7;
        int i10;
        l2.e b10 = oVar.b(uVar, uVar2);
        float f10 = uVar.D;
        float f11 = uVar2.D;
        int i11 = b10.f17794e;
        b7.d dVar = this.f8042k1;
        dVar.getClass();
        if (uVar2.f10621z > dVar.f2991a || uVar2.A > dVar.f2992b) {
            i11 |= 256;
        }
        if (G0(oVar, uVar2) > dVar.f2993c) {
            i11 |= 64;
        }
        if (this.f8052w1 != Integer.MIN_VALUE && (i10 = Build.VERSION.SDK_INT) < 31 && ((i10 != 30 || Build.MODEL.startsWith("MiTV")) && f10 != -1.0f && f11 != -1.0f && (!oVar.f56263f || !z9))) {
            float max = Math.max(f11, f10) / Math.min(f11, f10);
            if (Math.abs(max - Math.round(max)) > 0.01f) {
                i11 |= 65536;
            }
        }
        int i12 = i11;
        String str = oVar.f56259a;
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
        Surface surface = this.f8047r1;
        u2.n nVar = new u2.n(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return nVar;
    }

    public final boolean I0(u2.o oVar) {
        if (this.n1 == null) {
            Surface surface = this.f8047r1;
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
        long j3 = this.P1;
        if (j3 == -9223372036854775807L || j3 - (hVar.f17176e - this.P0.f56275c) <= 100000) {
            return true;
        }
        return false;
    }

    public final void K0() {
        if (this.f8054y1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f8053x1;
            int i7 = this.f8054y1;
            wf.b bVar = this.f8033b1;
            Handler handler = (Handler) bVar.f57654b;
            if (handler != null) {
                handler.post(new f0(bVar, i7, j3));
            }
            this.f8054y1 = 0;
            this.f8053x1 = elapsedRealtime;
        }
    }

    public final void L0() {
        u2.l lVar;
        if (this.K1 && (lVar = this.f56281d0) != null) {
            this.M1 = new k(this, lVar);
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
        lVar.f(i7, j3);
        Trace.endSection();
        this.O0.f17779e++;
        boolean z9 = false;
        this.f8055z1 = 0;
        if (this.n1 == null) {
            x1 x1Var = this.H1;
            boolean equals = x1Var.equals(x1.d);
            wf.b bVar = this.f8033b1;
            if (!equals && !x1Var.equals(this.I1)) {
                this.I1 = x1Var;
                bVar.m0(x1Var);
            }
            y yVar = this.f8036e1;
            if (yVar.f8098e != 3) {
                z9 = true;
            }
            yVar.f8098e = 3;
            yVar.f8104l.getClass();
            yVar.f8100g = m0.S(SystemClock.elapsedRealtime());
            if (z9 && (surface = this.f8047r1) != null) {
                bVar.g0(surface);
                this.f8050u1 = true;
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
        Surface surface2 = this.f8047r1;
        wf.b bVar = this.f8033b1;
        if (surface2 != surface) {
            this.f8047r1 = surface;
            k0 k0Var = this.n1;
            y yVar = this.f8036e1;
            if (k0Var == null) {
                yVar.g(surface);
            }
            this.f8050u1 = false;
            int i7 = this.f17764n;
            u2.l lVar = this.f56281d0;
            if (lVar != null && this.n1 == null) {
                u2.o oVar = this.f56288k0;
                oVar.getClass();
                if (I0(oVar) && !this.l1) {
                    Surface H0 = H0(oVar);
                    if (H0 != null) {
                        try {
                            lVar.k(H0);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            throw new IllegalArgumentException(th2);
                        }
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        lVar.e();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    n0();
                    X();
                }
            }
            if (surface != null) {
                x1 x1Var = this.I1;
                if (x1Var != null) {
                    bVar.m0(x1Var);
                }
            } else {
                this.I1 = null;
                k0 k0Var2 = this.n1;
                if (k0Var2 != null) {
                    k0Var2.m();
                }
            }
            if (i7 == 2) {
                k0 k0Var3 = this.n1;
                if (k0Var3 != null) {
                    k0Var3.r(true);
                } else {
                    yVar.c(true);
                }
            }
            L0();
        } else if (surface != null) {
            x1 x1Var2 = this.I1;
            if (x1Var2 != null) {
                bVar.m0(x1Var2);
            }
            Surface surface3 = this.f8047r1;
            if (surface3 != null && this.f8050u1) {
                bVar.g0(surface3);
            }
        }
    }

    @Override
    public final int O(k2.h hVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            if ((this.B1 != null || this.K1) && hVar.f17176e < this.f17768x && !J0(hVar)) {
                return 32;
            }
            return 0;
        }
        return 0;
    }

    public final boolean O0(long j3, long j10, boolean z9, boolean z10) {
        int B;
        if (this.n1 != null && this.f8032a1) {
            j10 -= -this.O1;
        }
        if (j3 >= -500000 || z9 || (B = B(j10)) == 0) {
            return false;
        }
        this.C1 = j10;
        PriorityQueue priorityQueue = this.f8041j1;
        if (z10) {
            l2.d dVar = this.O0;
            int i7 = dVar.d + B;
            dVar.d = i7;
            dVar.f17780f += this.A1;
            dVar.d = priorityQueue.size() + i7;
        } else {
            this.O0.f17783j++;
            R0(priorityQueue.size() + B, this.A1);
        }
        if (this.f56281d0 != null) {
            if (x0()) {
                n0();
                X();
            } else if (v0()) {
                M();
            } else {
                this.T0 = true;
            }
        }
        k0 k0Var = this.n1;
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
        if (this.B1 != null && (oVar = this.f56288k0) != null) {
            int i7 = uVar.f10621z;
            int i10 = uVar.A;
            float f14 = -3.4028235E38f;
            if (oVar.f56265i) {
                float f15 = oVar.f56268l;
                if (f15 != -3.4028235E38f && oVar.f56266j == i7 && oVar.f56267k == i10) {
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
                    oVar.f56268l = f14;
                    oVar.f56266j = i7;
                    oVar.f56267k = i10;
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
        if (!this.K1 && !D0(oVar.f56259a)) {
            if (!oVar.f56263f || n.b(this.Z0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final ArrayList Q(u2.i iVar, e2.u uVar, boolean z9) {
        boolean z10 = this.K1;
        Context context = this.Z0;
        List F0 = F0(context, iVar, uVar, z9, z10);
        HashMap hashMap = u2.w.f56306a;
        ArrayList arrayList = new ArrayList(F0);
        Collections.sort(arrayList, new s5(new org.telegram.ui.web.a0(10, context, uVar), 6));
        return arrayList;
    }

    public final void Q0(u2.l lVar, int i7) {
        Trace.beginSection("skipVideoBuffer");
        lVar.c(i7);
        Trace.endSection();
        this.O0.f17780f++;
    }

    public final void R0(int i7, int i10) {
        l2.d dVar = this.O0;
        dVar.h += i7;
        int i11 = i7 + i10;
        dVar.f17781g += i11;
        this.f8054y1 += i11;
        int i12 = this.f8055z1 + i11;
        this.f8055z1 = i12;
        dVar.f17782i = Math.max(i12, dVar.f17782i);
        int i13 = this.f8034c1;
        if (i13 > 0 && this.f8054y1 >= i13) {
            K0();
        }
    }

    public final void S0(x2.g0 g0Var) {
        l1 l1Var = this.F;
        if (l1Var.p()) {
            this.P1 = -9223372036854775807L;
            return;
        }
        int b10 = l1Var.b(g0Var.f58329a);
        if (b10 == -1) {
            this.P1 = -9223372036854775807L;
        } else {
            this.P1 = l1Var.f(b10, new i1(), false).d;
        }
    }

    @Override
    public final b8 T(u2.o oVar, e2.u uVar, MediaCrypto mediaCrypto, float f10) {
        e2.m mVar;
        int i7;
        b7.d dVar;
        boolean z9;
        int i10;
        int i11;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i12;
        int i13;
        char c10;
        boolean z10;
        int i14;
        boolean z11;
        Pair b10;
        int E0;
        String str = oVar.f56261c;
        e2.u[] uVarArr = this.f17766s;
        uVarArr.getClass();
        int i15 = uVar.f10621z;
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
            boolean z12 = false;
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
                    int i22 = uVar2.f10621z;
                    i13 = i19;
                    c10 = 65535;
                    if (i22 != -1 && i21 != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z12 |= z10;
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
            if (z12) {
                h2.a.l("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i17 + "x" + i18);
                if (i16 > i15) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i10 = i16;
                } else {
                    i10 = i15;
                }
                boolean z13 = z9;
                if (z9) {
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
                    int i24 = S1[i23];
                    int i25 = i23;
                    int i26 = (int) (i24 * f12);
                    if (i24 <= i10 || i26 <= i11) {
                        break;
                    }
                    if (!z13) {
                        i26 = i24;
                    }
                    if (!z13) {
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
                        point = new Point(m0.g(i26, widthAlignment) * widthAlignment, m0.g(i24, heightAlignment) * heightAlignment);
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
                    a11.f10569y = i17;
                    a11.f10570z = i18;
                    G0 = Math.max(G0, E0(oVar, new e2.u(a11)));
                    h2.a.l("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i17 + "x" + i18);
                }
            } else {
                mVar = mVar2;
                i7 = i16;
            }
            dVar = new b7.d(i17, i18, G0);
        }
        this.f8042k1 = dVar;
        if (this.K1) {
            i14 = this.L1;
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
            h2.a.j(mediaFormat, "color-transfer", mVar3.f10365c);
            h2.a.j(mediaFormat, "color-standard", mVar3.f10363a);
            h2.a.j(mediaFormat, "color-range", mVar3.f10364b);
            byte[] bArr = mVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(uVar.f10615s) && (b10 = h2.g.b(uVar)) != null) {
            h2.a.j(mediaFormat, "profile", ((Integer) b10.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.f2991a);
        mediaFormat.setInteger("max-height", dVar.f2992b);
        h2.a.j(mediaFormat, "max-input-size", dVar.f2993c);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (this.f8035d1) {
            z11 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z11 = true;
        }
        if (i14 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z11);
            mediaFormat.setInteger("audio-session-id", i14);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.J1));
        }
        F(mediaFormat);
        Surface H0 = H0(oVar);
        if (this.n1 != null && !m0.N(this.Z0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new b8(oVar, mediaFormat, uVar, H0, mediaCrypto, null);
    }

    public final void T0(long j3) {
        l2.d dVar = this.O0;
        dVar.f17784k += j3;
        dVar.f17785l++;
        this.E1 += j3;
        this.F1++;
    }

    @Override
    public final void U(k2.h hVar) {
        if (this.f8043m1) {
            ByteBuffer byteBuffer = hVar.f17177f;
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
                        u2.l lVar = this.f56281d0;
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
        k0 k0Var = this.n1;
        if (k0Var != null && !k0Var.v()) {
            try {
                return this.n1.j(uVar);
            } catch (j0 e10) {
                throw d(e10, uVar, false, 7000);
            }
        }
        return true;
    }

    @Override
    public final void a0(Exception exc) {
        h2.a.d("MediaCodecVideoRenderer", "Video codec error", exc);
        wf.b bVar = this.f8033b1;
        Handler handler = (Handler) bVar.f57654b;
        if (handler != null) {
            handler.post(new a4(25, bVar, exc));
        }
    }

    @Override
    public final void b0(long j3, String str, long j10) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        wf.b bVar = this.f8033b1;
        Handler handler = (Handler) bVar.f57654b;
        if (handler != null) {
            str2 = str;
            handler.post(new h4(bVar, str2, j3, j10, 1));
        } else {
            str2 = str;
        }
        this.l1 = D0(str2);
        u2.o oVar = this.f56288k0;
        oVar.getClass();
        boolean z9 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(oVar.f56260b)) {
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
                    z9 = true;
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f8043m1 = z9;
        L0();
    }

    @Override
    public final void c(int i7, Object obj) {
        boolean z9;
        boolean z10 = true;
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
                                            this.J1 = ((Integer) obj).intValue();
                                            u2.l lVar = this.f56281d0;
                                            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.J1));
                                                lVar.setParameters(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.f8047r1;
                                            N0(null);
                                            obj.getClass();
                                            ((l) obj).c(1, surface);
                                            return;
                                        case 18:
                                            if (this.B1 != null) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            s1 s1Var = (s1) obj;
                                            this.B1 = s1Var;
                                            if (s1Var == null) {
                                                z10 = false;
                                            }
                                            if (z9 != z10) {
                                                A0(this.f56282e0);
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
                                if (yVar.f14166a != 0 && yVar.f14167b != 0) {
                                    this.f8049t1 = yVar;
                                    k0 k0Var = this.n1;
                                    if (k0Var != null) {
                                        Surface surface2 = this.f8047r1;
                                        surface2.getClass();
                                        k0Var.g(surface2, yVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(v1.f10632a)) {
                                k0 k0Var2 = this.n1;
                                if (k0Var2 != null && k0Var2.v()) {
                                    this.n1.t();
                                    return;
                                }
                                return;
                            }
                            this.f8046q1 = list;
                            k0 k0Var3 = this.n1;
                            if (k0Var3 != null) {
                                k0Var3.p(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.f8052w1 = intValue;
                        k0 k0Var4 = this.n1;
                        if (k0Var4 != null) {
                            k0Var4.l(intValue);
                            return;
                        }
                        d0 d0Var = this.f8036e1.f8096b;
                        if (d0Var.f7975j != intValue) {
                            d0Var.f7975j = intValue;
                            d0Var.d(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.f8051v1 = intValue2;
                    u2.l lVar2 = this.f56281d0;
                    if (lVar2 != null) {
                        lVar2.j(intValue2);
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
            w wVar = (w) obj;
            this.N1 = wVar;
            k0 k0Var5 = this.n1;
            if (k0Var5 != null) {
                k0Var5.c(wVar);
                return;
            }
            return;
        }
        N0(obj);
    }

    @Override
    public final void c0(l2.c cVar) {
        wf.b bVar = this.f8033b1;
        Handler handler = (Handler) bVar.f57654b;
        if (handler != null) {
            handler.post(new a4(23, bVar, cVar));
        }
    }

    @Override
    public final void d0(String str) {
        wf.b bVar = this.f8033b1;
        Handler handler = (Handler) bVar.f57654b;
        if (handler != null) {
            handler.post(new a4(26, bVar, str));
        }
    }

    @Override
    public final l2.e e0(wf.b bVar) {
        l2.e e02 = super.e0(bVar);
        e2.u uVar = (e2.u) bVar.f57655c;
        uVar.getClass();
        wf.b bVar2 = this.f8033b1;
        Handler handler = (Handler) bVar2.f57654b;
        if (handler != null) {
            handler.post(new aa.s(bVar2, uVar, e02, 21));
        }
        z zVar = this.f8040i1;
        if (zVar != null) {
            zVar.b();
        }
        return e02;
    }

    @Override
    public final void f() {
        k0 k0Var = this.n1;
        if (k0Var != null) {
            int i7 = this.f8045p1;
            if (i7 != 0 && i7 != 1) {
                k0Var.w();
                return;
            } else {
                this.f8045p1 = 0;
                return;
            }
        }
        y yVar = this.f8036e1;
        if (yVar.f8098e == 0) {
            yVar.f8098e = 1;
        }
    }

    @Override
    public final void f0(e2.u uVar, MediaFormat mediaFormat) {
        boolean z9;
        int integer;
        int integer2;
        int i7;
        int i10;
        u2.l lVar = this.f56281d0;
        if (lVar != null) {
            lVar.j(this.f8051v1);
        }
        if (this.K1) {
            i10 = uVar.f10621z;
            i7 = uVar.A;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z9) {
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
        this.H1 = new x1(f10, i10, i7);
        k0 k0Var = this.n1;
        if (k0Var != null && this.Q1) {
            e2.t a10 = uVar.a();
            a10.f10569y = i10;
            a10.f10570z = i7;
            a10.E = f10;
            e2.u uVar2 = new e2.u(a10);
            int i14 = this.f8045p1;
            List list = this.f8046q1;
            if (list == null) {
                h9.g0 g0Var = h9.i0.f14329b;
                list = t1.f14397e;
            }
            k0Var.u(uVar2, this.P0.f56274b, i14, list);
            this.f8045p1 = 2;
        } else {
            this.f8036e1.f(uVar.D);
        }
        this.Q1 = false;
    }

    @Override
    public final void h0(long j3) {
        super.h0(j3);
        if (!this.K1) {
            this.A1--;
        }
    }

    @Override
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void i0() {
        k0 k0Var = this.n1;
        if (k0Var != null) {
            k0Var.k();
            if (this.O1 == -9223372036854775807L) {
                this.O1 = this.P0.f56274b;
            }
            this.n1.i(-this.O1);
        } else {
            this.f8036e1.e(2);
        }
        this.Q1 = true;
        L0();
    }

    @Override
    public final void j0(k2.h hVar) {
        ByteBuffer byteBuffer;
        wf.b bVar = this.f8038g1;
        if (bVar != null) {
            u2.o oVar = this.f56288k0;
            oVar.getClass();
            if (oVar.f56260b.equals("video/av01") && hVar.isKeyFrame() && (byteBuffer = hVar.f17175c) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) bVar.f57654b;
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
            k0 k0Var = this.n1;
            if (k0Var == null || k0Var.a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean l0(long j3, long j10, u2.l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z9, boolean z10, e2.u uVar) {
        int i12;
        lVar.getClass();
        long j12 = j11 - this.P0.f56275c;
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f8041j1;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j11) {
                break;
            }
            i13++;
            priorityQueue.poll();
        }
        R0(i13, 0);
        k0 k0Var = this.n1;
        if (k0Var != null) {
            if (z9 && !z10) {
                Q0(lVar, i7);
                return true;
            }
            return k0Var.n(j11, new i(this, lVar, i7, j12));
        }
        int a10 = this.f8036e1.a(j11, j3, j10, this.P0.f56274b, z9, z10, this.f8037f1);
        x xVar = this.f8037f1;
        z zVar = this.f8040i1;
        if (zVar != null && a10 != 5 && a10 != 4) {
            zVar.a(j11, xVar.f8093a);
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
                    T0(xVar.f8093a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                lVar.c(i7);
                Trace.endSection();
                R0(0, 1);
                T0(xVar.f8093a);
                return true;
            }
            long j13 = xVar.f8094b;
            long j14 = xVar.f8093a;
            if (j13 == this.G1) {
                Q0(lVar, i7);
            } else {
                w wVar = this.N1;
                if (wVar != null) {
                    i12 = i7;
                    wVar.b(j12, j13, uVar, this.f56283f0);
                } else {
                    i12 = i7;
                }
                M0(lVar, i12, j13);
            }
            T0(j14);
            this.G1 = j13;
            return true;
        }
        this.h.getClass();
        long nanoTime = System.nanoTime();
        w wVar2 = this.N1;
        if (wVar2 != null) {
            wVar2.b(j12, nanoTime, uVar, this.f56283f0);
        }
        M0(lVar, i7, nanoTime);
        T0(xVar.f8093a);
        return true;
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: d3.l.m():boolean");
    }

    @Override
    public final void n() {
        wf.b bVar = this.f8033b1;
        this.I1 = null;
        this.P1 = -9223372036854775807L;
        L0();
        this.f8050u1 = false;
        this.M1 = null;
        this.D1 = true;
        try {
            super.n();
        } finally {
            bVar.F(this.O0);
            bVar.m0(x1.d);
        }
    }

    @Override
    public final void o(boolean z9, boolean z10) {
        boolean z11;
        k0 k0Var;
        this.O0 = new Object();
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z12 = q1Var.f18001b;
        if (z12 && this.L1 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        ia.p(z11);
        if (this.K1 != z12) {
            this.K1 = z12;
            n0();
        }
        l2.d dVar = this.O0;
        wf.b bVar = this.f8033b1;
        Handler handler = (Handler) bVar.f57654b;
        if (handler != null) {
            handler.post(new g0(bVar, dVar, 0));
        }
        boolean z13 = this.f8044o1;
        y yVar = this.f8036e1;
        if (!z13) {
            if (this.f8046q1 != null && this.n1 == null) {
                o oVar = new o(this.Z0, yVar);
                oVar.d = true;
                long j3 = this.f8039h1;
                long j10 = -9223372036854775807L;
                if (j3 != -9223372036854775807L) {
                    j10 = -j3;
                }
                oVar.f8069g = j10;
                h2.g0 g0Var = this.h;
                g0Var.getClass();
                oVar.f8067e = g0Var;
                ia.p(!oVar.f8068f);
                if (oVar.f8066c == null) {
                    oVar.f8066c = new s();
                }
                u uVar = new u(oVar);
                oVar.f8068f = true;
                if (1 >= uVar.f8092p) {
                    uVar.f8092p = 1;
                }
                SparseArray sparseArray = uVar.f8081c;
                if (m0.k(sparseArray, 0)) {
                    k0Var = (k0) sparseArray.get(0);
                } else {
                    p pVar = new p(uVar, uVar.f8079a);
                    uVar.f8084g.add(pVar);
                    sparseArray.put(0, pVar);
                    k0Var = pVar;
                }
                this.n1 = k0Var;
            }
            this.f8044o1 = true;
        }
        k0 k0Var2 = this.n1;
        if (k0Var2 != null) {
            k0Var2.e(new cb.c(this, 17));
            w wVar = this.N1;
            if (wVar != null) {
                this.n1.c(wVar);
            }
            if (this.f8047r1 != null && !this.f8049t1.equals(h2.y.f14165c)) {
                this.n1.g(this.f8047r1, this.f8049t1);
            }
            this.n1.l(this.f8052w1);
            this.n1.d(this.f56279b0);
            List list = this.f8046q1;
            if (list != null) {
                this.n1.p(list);
            }
            this.f8045p1 = !z10 ? 1 : 0;
            this.S0 = true;
            return;
        }
        h2.g0 g0Var2 = this.h;
        g0Var2.getClass();
        yVar.f8104l = g0Var2;
        yVar.e(!z10 ? 1 : 0);
    }

    @Override
    public final void o0() {
        k0 k0Var = this.n1;
        if (k0Var != null) {
            k0Var.k();
        } else {
            long j3 = this.P0.f56277f;
        }
    }

    @Override
    public final void p(long j3, boolean z9, boolean z10) {
        k0 k0Var = this.n1;
        if (k0Var != null && !z9) {
            k0Var.o(true);
        }
        if (z10) {
            this.C1 = j3;
        }
        super.p(j3, z9, z10);
        k0 k0Var2 = this.n1;
        y yVar = this.f8036e1;
        if (k0Var2 == null) {
            yVar.f8096b.b();
            yVar.h = -9223372036854775807L;
            yVar.f8099f = -9223372036854775807L;
            yVar.f8098e = Math.min(yVar.f8098e, 1);
            yVar.f8101i = -9223372036854775807L;
            yVar.f8106n = false;
        }
        z zVar = this.f8040i1;
        if (zVar != null) {
            zVar.b();
        }
        if (z9) {
            k0 k0Var3 = this.n1;
            if (k0Var3 != null) {
                k0Var3.r(false);
            } else {
                yVar.c(false);
            }
        }
        L0();
        this.f8055z1 = 0;
    }

    @Override
    public final void q() {
        k0 k0Var = this.n1;
        if (k0Var != null && this.f8032a1) {
            k0Var.release();
        }
    }

    @Override
    public final void q0() {
        super.q0();
        this.f8041j1.clear();
        this.A1 = 0;
        this.R1 = 0;
        this.D1 = false;
        wf.b bVar = this.f8038g1;
        if (bVar != null) {
            bVar.f57655c = null;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f57654b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override
    public final void r() {
        try {
            this.f56301y0 = false;
            p0();
            n0();
            f1.B(this.X, null);
            this.X = null;
        } finally {
            this.f8044o1 = false;
            this.O1 = -9223372036854775807L;
            n nVar = this.f8048s1;
            if (nVar != null) {
                nVar.release();
                this.f8048s1 = null;
            }
        }
    }

    @Override
    public final void s() {
        this.f8054y1 = 0;
        this.h.getClass();
        this.f8053x1 = SystemClock.elapsedRealtime();
        this.E1 = 0L;
        this.F1 = 0;
        k0 k0Var = this.n1;
        if (k0Var != null) {
            k0Var.h();
        } else {
            this.f8036e1.d();
        }
    }

    @Override
    public final void t() {
        K0();
        int i7 = this.F1;
        if (i7 != 0) {
            long j3 = this.E1;
            wf.b bVar = this.f8033b1;
            Handler handler = (Handler) bVar.f57654b;
            if (handler != null) {
                handler.post(new f0(bVar, j3, i7));
            }
            this.E1 = 0L;
            this.F1 = 0;
        }
        k0 k0Var = this.n1;
        if (k0Var != null) {
            k0Var.f();
        } else {
            y yVar = this.f8036e1;
            yVar.d = false;
            yVar.f8101i = -9223372036854775807L;
            d0 d0Var = yVar.f8096b;
            d0Var.d = false;
            a0 a0Var = d0Var.f7970c;
            if (a0Var != null) {
                a0Var.b();
            }
            d0Var.a();
        }
        z zVar = this.f8040i1;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override
    public final void u(e2.u[] uVarArr, long j3, long j10, x2.g0 g0Var) {
        super.u(uVarArr, j3, j10, g0Var);
        S0(g0Var);
        z zVar = this.f8040i1;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override
    public final boolean u0(k2.h r15) {
        throw new UnsupportedOperationException("Method not decompiled: d3.l.u0(k2.h):boolean");
    }

    @Override
    public final void v() {
        x2.g0 g0Var = this.G;
        if (g0Var != null) {
            S0(g0Var);
        }
    }

    @Override
    public final boolean v0() {
        boolean z9;
        e2.u uVar = this.f56282e0;
        long j3 = this.P1;
        if (j3 != -9223372036854775807L) {
            if (this.U0 + 1 + j3 <= Long.MAX_VALUE - (this.P0.f56275c + j3)) {
                z9 = false;
                if (this.B1 != null && !this.D1 && !this.K1 && ((uVar == null || uVar.f10617u <= 0) && !z9 && this.P0.f56277f == -9223372036854775807L)) {
                    return false;
                }
                return true;
            }
        }
        z9 = true;
        if (this.B1 != null) {
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
        k0 k0Var = this.n1;
        if (k0Var != null) {
            try {
                k0Var.q(j3, j10);
            } catch (j0 e10) {
                throw d(e10, e10.f8029a, false, 7001);
            }
        }
        super.x(j3, j10);
    }

    @Override
    public final boolean x0() {
        u2.o oVar = this.f56288k0;
        if (this.n1 != null && oVar != null) {
            String str = oVar.f56259a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.x0();
    }

    @Override
    public final int z0(u2.i iVar, e2.u uVar) {
        boolean z9;
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (!s0.m(uVar.f10615s)) {
            return jg.g.b(0, 0, 0, 0);
        }
        if (uVar.f10618w != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        Context context = this.Z0;
        List F0 = F0(context, iVar, uVar, z9, false);
        if (z9 && F0.isEmpty()) {
            F0 = F0(context, iVar, uVar, false, false);
        }
        if (F0.isEmpty()) {
            return jg.g.b(1, 0, 0, 0);
        }
        int i14 = uVar.T;
        if (i14 != 0 && i14 != 2) {
            return jg.g.b(2, 0, 0, 0);
        }
        u2.o oVar = (u2.o) F0.get(0);
        boolean e10 = oVar.e(context, uVar);
        if (!e10) {
            for (int i15 = 1; i15 < F0.size(); i15++) {
                u2.o oVar2 = (u2.o) F0.get(i15);
                if (oVar2.e(context, uVar)) {
                    z10 = false;
                    e10 = true;
                    oVar = oVar2;
                    break;
                }
            }
        }
        z10 = true;
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
        if (oVar.f56264g) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(uVar.f10615s) && !f2.i.c(context)) {
            i12 = 256;
        }
        if (e10) {
            List F02 = F0(context, iVar, uVar, z9, true);
            if (!F02.isEmpty()) {
                HashMap hashMap = u2.w.f56306a;
                ArrayList arrayList = new ArrayList(F02);
                Collections.sort(arrayList, new s5(new org.telegram.ui.web.a0(10, context, uVar), 6));
                u2.o oVar3 = (u2.o) arrayList.get(0);
                if (oVar3.e(context, uVar) && oVar3.f(uVar)) {
                    i13 = 32;
                }
            }
        }
        return i7 | i10 | i13 | i11 | i12;
    }
}
