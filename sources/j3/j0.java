package j3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import h3.x1;
import h7.u6;
import hh.m5;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class j0 implements t {

    public static final Object f12351d0 = new Object();

    public static ExecutorService f12352e0;

    public static int f12353f0;
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public j[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public x X;
    public e0 Y;
    public boolean Z;

    public final g f12354a;

    public long f12355a0;

    public final a5.n f12356b;

    public boolean f12357b0;

    public final boolean f12358c;

    public boolean f12359c0;
    public final z d;

    public final u0 f12360e;

    public final j[] f12361f;

    public final j[] f12362g;
    public final d5.c h;

    public final w f12363i;

    public final ArrayDeque f12364j;

    public final boolean f12365k;

    public final int f12366l;

    public i0 f12367m;

    public final f2.c f12368n;

    public final f2.c f12369o;

    public final k0 f12370p;

    public i3.k f12371q;

    public r f12372r;

    public f0 f12373s;

    public f0 f12374t;

    public AudioTrack f12375u;
    public e v;

    public g0 f12376w;

    public g0 f12377x;

    public x1 f12378y;

    public ByteBuffer f12379z;

    public j0(a5.n nVar) {
        this.f12354a = (g) nVar.f100b;
        a5.n nVar2 = (a5.n) nVar.f101c;
        this.f12356b = nVar2;
        int i10 = d5.g0.f4795a;
        this.f12358c = false;
        this.f12365k = false;
        this.f12366l = 0;
        this.f12370p = (k0) nVar.d;
        d5.c cVar = new d5.c();
        this.h = cVar;
        cVar.c();
        this.f12363i = new w(new ga.c(this, 19));
        z zVar = new z();
        this.d = zVar;
        u0 u0Var = new u0();
        u0Var.f12459m = d5.g0.f4799f;
        this.f12360e = u0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new p0(), zVar, u0Var);
        Collections.addAll(arrayList, (j[]) nVar2.f100b);
        this.f12361f = (j[]) arrayList.toArray(new j[0]);
        this.f12362g = new j[]{new l0()};
        this.J = 1.0f;
        this.v = e.h;
        this.W = 0;
        this.X = new x();
        x1 x1Var = x1.d;
        this.f12377x = new g0(x1Var, false, 0L, 0L);
        this.f12378y = x1Var;
        this.R = -1;
        this.K = new j[0];
        this.L = new ByteBuffer[0];
        this.f12364j = new ArrayDeque();
        this.f12368n = new f2.c(4);
        this.f12369o = new f2.c(4);
    }

    public static AudioFormat f(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean p(AudioTrack audioTrack) {
        return d5.g0.f4795a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void A(x1 x1Var) {
        x1 x1Var2 = new x1(d5.g0.g(x1Var.f8242a, 0.1f, 8.0f), d5.g0.g(x1Var.f8243b, 0.1f, 8.0f));
        if (!this.f12365k || d5.g0.f4795a < 23) {
            x(x1Var2, i().f12340b);
        } else {
            y(x1Var2);
        }
    }

    public final boolean B() {
        if (this.Z || !"audio/raw".equals(this.f12374t.f12328a.B)) {
            return false;
        }
        int i10 = this.f12374t.f12328a.Q;
        if (!this.f12358c) {
            return true;
        }
        int i11 = d5.g0.f4795a;
        return (i10 == 536870912 || i10 == 805306368 || i10 == 4) ? false : true;
    }

    public final boolean C(h3.t0 t0Var, e eVar) {
        int i10;
        int iM;
        int playbackOffloadSupport;
        int i11 = d5.g0.f4795a;
        if (i11 >= 29 && (i10 = this.f12366l) != 0) {
            String str = t0Var.B;
            str.getClass();
            int iB = d5.q.b(str, t0Var.f8190r);
            if (iB == 0 || (iM = d5.g0.m(t0Var.O)) == 0) {
                return false;
            }
            AudioFormat audioFormatF = f(t0Var.P, iM, iB);
            AudioAttributes audioAttributes = (AudioAttributes) eVar.a().f181b;
            if (i11 >= 31) {
                playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatF, audioAttributes);
            } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatF, audioAttributes)) {
                playbackOffloadSupport = (i11 == 30 && d5.g0.d.startsWith("Pixel")) ? 2 : 1;
            } else {
                playbackOffloadSupport = 0;
            }
            if (playbackOffloadSupport != 0) {
                if (playbackOffloadSupport == 1) {
                    return ((t0Var.R != 0 || t0Var.S != 0) && (i10 == 1)) ? false : true;
                }
                if (playbackOffloadSupport == 2) {
                    return true;
                }
                throw new IllegalStateException();
            }
        }
        return false;
    }

    public final void D(ByteBuffer byteBuffer, long j10) throws Exception {
        ByteBuffer byteBuffer2;
        int iWrite;
        int iWrite2;
        r rVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.O;
            if (byteBuffer3 != null) {
                d5.a.f(byteBuffer3 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (d5.g0.f4795a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.P = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.P, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.Q = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i10 = d5.g0.f4795a;
            if (i10 < 21) {
                long j11 = this.D;
                w wVar = this.f12363i;
                int iA = wVar.f12470e - ((int) (j11 - (wVar.a() * ((long) wVar.d))));
                if (iA > 0) {
                    iWrite = this.f12375u.write(this.P, this.Q, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.Q += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.Z) {
                d5.a.i(j10 != -9223372036854775807L);
                AudioTrack audioTrack = this.f12375u;
                if (i10 >= 26) {
                    byteBuffer2 = byteBuffer;
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1, j10 * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.f12379z == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f12379z = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f12379z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.f12379z.putInt(4, iRemaining2);
                        this.f12379z.putLong(8, j10 * 1000);
                        this.f12379z.position(0);
                        this.A = iRemaining2;
                    }
                    int iRemaining3 = this.f12379z.remaining();
                    if (iRemaining3 > 0) {
                        iWrite = audioTrack.write(this.f12379z, iRemaining3, 1);
                        if (iWrite < 0) {
                            this.A = 0;
                        } else if (iWrite < iRemaining3) {
                            iWrite = 0;
                        }
                    }
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.A = 0;
                    } else {
                        this.A -= iWrite2;
                    }
                }
                iWrite = iWrite2;
            } else {
                byteBuffer2 = byteBuffer;
                iWrite = this.f12375u.write(byteBuffer2, iRemaining2, 1);
            }
            this.f12355a0 = SystemClock.elapsedRealtime();
            f2.c cVar = this.f12369o;
            if (iWrite < 0) {
                s sVar = new s(iWrite, this.f12374t.f12328a, ((i10 >= 24 && iWrite == -6) || iWrite == -32) && this.E > 0);
                r rVar2 = this.f12372r;
                if (rVar2 != null) {
                    rVar2.u(sVar);
                }
                if (sVar.f12435b) {
                    throw sVar;
                }
                cVar.N(sVar);
                return;
            }
            cVar.f5631c = null;
            if (p(this.f12375u)) {
                if (this.E > 0) {
                    this.f12359c0 = false;
                }
                if (this.U && (rVar = this.f12372r) != null && iWrite < iRemaining2 && !this.f12359c0) {
                    rVar.g();
                }
            }
            int i11 = this.f12374t.f12330c;
            if (i11 == 0) {
                this.D += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i11 != 0) {
                    d5.a.i(byteBuffer2 == this.M);
                    this.E = (((long) this.F) * ((long) this.N)) + this.E;
                }
                this.O = null;
            }
        }
    }

    public final void a(long j10) {
        x1 x1Var;
        boolean z10;
        boolean zB = B();
        a5.n nVar = this.f12356b;
        if (zB) {
            x1Var = i().f12339a;
            s0 s0Var = (s0) nVar.d;
            float f10 = x1Var.f8242a;
            if (s0Var.f12438c != f10) {
                s0Var.f12438c = f10;
                s0Var.f12442i = true;
            }
            float f11 = x1Var.f8243b;
            if (s0Var.d != f11) {
                s0Var.d = f11;
                s0Var.f12442i = true;
            }
        } else {
            x1Var = x1.d;
        }
        x1 x1Var2 = x1Var;
        int i10 = 0;
        if (B()) {
            boolean z11 = i().f12340b;
            ((q0) nVar.f101c).f12407m = z11;
            z10 = z11;
        } else {
            z10 = false;
        }
        this.f12364j.add(new g0(x1Var2, z10, Math.max(0L, j10), (k() * 1000000) / ((long) this.f12374t.f12331e)));
        j[] jVarArr = this.f12374t.f12334i;
        ArrayList arrayList = new ArrayList();
        for (j jVar : jVarArr) {
            if (jVar.isActive()) {
                arrayList.add(jVar);
            } else {
                jVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (j[]) arrayList.toArray(new j[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            j[] jVarArr2 = this.K;
            if (i10 >= jVarArr2.length) {
                break;
            }
            j jVar2 = jVarArr2[i10];
            jVar2.flush();
            this.L[i10] = jVar2.a();
            i10++;
        }
        r rVar = this.f12372r;
        if (rVar != null) {
            rVar.onSkipSilenceEnabledChanged(z10);
        }
    }

    public final void b(h3.t0 t0Var, int[] iArr) {
        j[] jVarArr;
        int iIntValue;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int minBufferSize;
        boolean z10;
        int i15;
        int i16;
        double d;
        int iH;
        f0 f0Var;
        int iA;
        RoundingMode roundingMode;
        int i17;
        int i18;
        int iAbs;
        int[] iArr2;
        String str = t0Var.B;
        int i19 = t0Var.P;
        int i20 = t0Var.O;
        int i21 = t0Var.Q;
        if (!"audio/raw".equals(str)) {
            jVarArr = new j[0];
            if (C(t0Var, this.v)) {
                String str2 = t0Var.B;
                str2.getClass();
                int iB = d5.q.b(str2, t0Var.f8190r);
                iIntValue = d5.g0.m(i20);
                i10 = i19;
                i13 = -1;
                i14 = 1;
                i11 = iB;
                i12 = -1;
            } else {
                Pair pairB = this.f12354a.b(t0Var);
                if (pairB == null) {
                    throw new p("Unable to configure passthrough for: " + t0Var, t0Var);
                }
                int iIntValue2 = ((Integer) pairB.first).intValue();
                iIntValue = ((Integer) pairB.second).intValue();
                i10 = i19;
                i11 = iIntValue2;
                i12 = -1;
                i13 = -1;
                i14 = 2;
            }
            if (i11 != 0) {
                throw new p("Invalid output encoding (mode=" + i14 + ") for: " + t0Var, t0Var);
            }
            if (iIntValue != 0) {
                throw new p("Invalid output channel config (mode=" + i14 + ") for: " + t0Var, t0Var);
            }
            minBufferSize = AudioTrack.getMinBufferSize(i10, iIntValue, i11);
            if (minBufferSize != -2) {
                z10 = true;
            } else {
                z10 = false;
            }
            d5.a.i(z10);
            if (i12 != -1) {
                i15 = i12;
            } else {
                i15 = 1;
            }
            i16 = t0Var.f8189n;
            if (this.f12365k) {
                d = 8.0d;
            } else {
                d = 1.0d;
            }
            this.f12370p.getClass();
            if (i14 != 0) {
                i10 = i10;
                long j10 = i10;
                long j11 = i15;
                iH = d5.g0.h(minBufferSize * 4, u6.a(((((long) 250000) * j10) * j11) / 1000000), u6.a(((((long) 750000) * j10) * j11) / 1000000));
            } else if (i14 != 1) {
                iH = u6.a((((long) 50000000) * ((long) k0.a(i11))) / 1000000);
            } else {
                if (i14 == 2) {
                    throw new IllegalArgumentException();
                }
                int i22 = i11 == 5 ? 500000 : 250000;
                if (i16 != -1) {
                    roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    iA = i16 / 8;
                    i17 = i16 - (8 * iA);
                    if (i17 != 0) {
                        i18 = ((i16 ^ 8) >> 31) | 1;
                        switch (q8.b.f46175a[roundingMode.ordinal()]) {
                            case 1:
                                if (i17 != 0) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                if (i18 < 0) {
                                    iA += i18;
                                }
                                break;
                            case 4:
                                iA += i18;
                                break;
                            case 5:
                                if (i18 > 0) {
                                    iA += i18;
                                }
                                break;
                            case 6:
                            case 7:
                            case 8:
                                int iAbs2 = Math.abs(i17);
                                iAbs = iAbs2 - (Math.abs(8) - iAbs2);
                                if (iAbs == 0) {
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                                } else if (iAbs > 0) {
                                    iA += i18;
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                } else {
                    iA = k0.a(i11);
                }
                iH = u6.a((((long) i22) * ((long) iA)) / 1000000);
            }
            int iMax = (((Math.max(minBufferSize, (int) (((double) iH) * d)) + i15) - 1) / i15) * i15;
            this.f12357b0 = false;
            f0Var = new f0(t0Var, i13, i14, i12, i10, iIntValue, i11, iMax, jVarArr);
            if (o()) {
                this.f12373s = f0Var;
            } else {
                this.f12374t = f0Var;
            }
        }
        d5.a.f(d5.g0.D(i21));
        int iW = d5.g0.w(i21, i20);
        jVarArr = (this.f12358c && (i21 == 536870912 || i21 == 805306368 || i21 == 4)) ? this.f12362g : this.f12361f;
        int i23 = t0Var.R;
        int i24 = t0Var.S;
        u0 u0Var = this.f12360e;
        u0Var.f12455i = i23;
        u0Var.f12456j = i24;
        if (d5.g0.f4795a < 21 && i20 == 8 && iArr == null) {
            iArr2 = new int[6];
            for (int i25 = 0; i25 < 6; i25++) {
                iArr2[i25] = i25;
            }
        } else {
            iArr2 = iArr;
        }
        this.d.f12495i = iArr2;
        h hVar = new h(i19, i20, i21);
        for (j jVar : jVarArr) {
            try {
                h hVarE = jVar.e(hVar);
                if (jVar.isActive()) {
                    hVar = hVarE;
                }
            } catch (i e9) {
                throw new p(e9, t0Var);
            }
        }
        i11 = hVar.f12345c;
        int i26 = hVar.f12344b;
        int i27 = hVar.f12343a;
        iIntValue = d5.g0.m(i26);
        int iW2 = d5.g0.w(i11, i26);
        i13 = iW;
        i12 = iW2;
        i10 = i27;
        i14 = 0;
        if (i11 != 0) {
            throw new p("Invalid output encoding (mode=" + i14 + ") for: " + t0Var, t0Var);
        }
        if (iIntValue != 0) {
            throw new p("Invalid output channel config (mode=" + i14 + ") for: " + t0Var, t0Var);
        }
        minBufferSize = AudioTrack.getMinBufferSize(i10, iIntValue, i11);
        if (minBufferSize != -2) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        if (i12 != -1) {
            i15 = i12;
        } else {
            i15 = 1;
        }
        i16 = t0Var.f8189n;
        if (this.f12365k) {
            d = 8.0d;
        } else {
            d = 1.0d;
        }
        this.f12370p.getClass();
        if (i14 != 0) {
            i10 = i10;
            long j12 = i10;
            long j13 = i15;
            iH = d5.g0.h(minBufferSize * 4, u6.a(((((long) 250000) * j12) * j13) / 1000000), u6.a(((((long) 750000) * j12) * j13) / 1000000));
        } else if (i14 != 1) {
            iH = u6.a((((long) 50000000) * ((long) k0.a(i11))) / 1000000);
        } else {
            if (i14 == 2) {
                throw new IllegalArgumentException();
            }
            if (i11 == 5) {
            }
            if (i16 != -1) {
                roundingMode = RoundingMode.CEILING;
                roundingMode.getClass();
                iA = i16 / 8;
                i17 = i16 - (8 * iA);
                if (i17 != 0) {
                    i18 = ((i16 ^ 8) >> 31) | 1;
                    switch (q8.b.f46175a[roundingMode.ordinal()]) {
                        case 1:
                            if (i17 != 0) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            if (i18 < 0) {
                                iA += i18;
                            }
                            break;
                        case 4:
                            iA += i18;
                            break;
                        case 5:
                            if (i18 > 0) {
                                iA += i18;
                            }
                            break;
                        case 6:
                        case 7:
                        case 8:
                            int iAbs3 = Math.abs(i17);
                            iAbs = iAbs3 - (Math.abs(8) - iAbs3);
                            if (iAbs == 0) {
                                RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                                RoundingMode roundingMode5 = RoundingMode.HALF_EVEN;
                            } else if (iAbs > 0) {
                                iA += i18;
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            } else {
                iA = k0.a(i11);
            }
            iH = u6.a((((long) i22) * ((long) iA)) / 1000000);
        }
        int iMax2 = (((Math.max(minBufferSize, (int) (((double) iH) * d)) + i15) - 1) / i15) * i15;
        this.f12357b0 = false;
        f0Var = new f0(t0Var, i13, i14, i12, i10, iIntValue, i11, iMax2, jVarArr);
        if (o()) {
            this.f12373s = f0Var;
        } else {
            this.f12374t = f0Var;
        }
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: j3.j0.c():boolean");
    }

    public final void d() {
        d5.a.i(d5.g0.f4795a >= 21);
        d5.a.i(this.V);
        if (this.Z) {
            return;
        }
        this.Z = true;
        e();
    }

    public final void e() {
        if (o()) {
            w();
            AudioTrack audioTrack = this.f12363i.f12469c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f12375u.pause();
            }
            if (p(this.f12375u)) {
                i0 i0Var = this.f12367m;
                i0Var.getClass();
                i0Var.a(this.f12375u);
            }
            if (d5.g0.f4795a < 21 && !this.V) {
                this.W = 0;
            }
            f0 f0Var = this.f12373s;
            if (f0Var != null) {
                this.f12374t = f0Var;
                this.f12373s = null;
            }
            w wVar = this.f12363i;
            wVar.f12476l = 0L;
            wVar.f12486w = 0;
            wVar.v = 0;
            wVar.f12477m = 0L;
            wVar.C = 0L;
            wVar.F = 0L;
            wVar.f12475k = false;
            wVar.f12469c = null;
            wVar.f12471f = null;
            AudioTrack audioTrack2 = this.f12375u;
            d5.c cVar = this.h;
            cVar.b();
            synchronized (f12351d0) {
                try {
                    if (f12352e0 == null) {
                        f12352e0 = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f12353f0++;
                    f12352e0.execute(new m5(14, audioTrack2, cVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f12375u = null;
        }
        this.f12369o.f5631c = null;
        this.f12368n.f5631c = null;
    }

    public final long g(boolean z10) {
        long j10;
        long j11;
        long jA;
        ArrayDeque arrayDeque;
        long jS;
        long jO;
        long j12;
        boolean timestamp;
        long j13;
        long j14;
        long j15;
        long j16;
        String str;
        Method method;
        long jMax;
        if (!o() || this.H) {
            return Long.MIN_VALUE;
        }
        w wVar = this.f12363i;
        j0 j0Var = (j0) wVar.f12467a.f6834b;
        AudioTrack audioTrack = wVar.f12469c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long[] jArr = wVar.f12468b;
            long jA2 = (wVar.a() * 1000000) / ((long) wVar.f12472g);
            if (jA2 == 0) {
                j10 = 1000000;
                j11 = 1000;
            } else {
                j11 = 1000;
                long jNanoTime = System.nanoTime() / 1000;
                j10 = 1000000;
                if (jNanoTime - wVar.f12477m >= 30000) {
                    int i10 = wVar.v;
                    jArr[i10] = jA2 - jNanoTime;
                    wVar.v = (i10 + 1) % 10;
                    int i11 = wVar.f12486w;
                    if (i11 < 10) {
                        wVar.f12486w = i11 + 1;
                    }
                    wVar.f12477m = jNanoTime;
                    wVar.f12476l = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = wVar.f12486w;
                        if (i12 >= i13) {
                            break;
                        }
                        wVar.f12476l = (jArr[i12] / ((long) i13)) + wVar.f12476l;
                        i12++;
                        jA2 = jA2;
                    }
                }
                long j17 = jA2;
                if (!wVar.h) {
                    v vVar = wVar.f12471f;
                    vVar.getClass();
                    u uVar = vVar.f12462a;
                    if (uVar != null) {
                        AudioTimestamp audioTimestamp = uVar.f12452b;
                        j12 = 500000;
                        if (jNanoTime - vVar.f12465e >= vVar.d) {
                            vVar.f12465e = jNanoTime;
                            timestamp = uVar.f12451a.getTimestamp(audioTimestamp);
                            if (timestamp) {
                                long j18 = audioTimestamp.framePosition;
                                if (uVar.d > j18) {
                                    uVar.f12453c++;
                                }
                                uVar.d = j18;
                                uVar.f12454e = j18 + (uVar.f12453c << 32);
                            }
                            int i14 = vVar.f12463b;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 != 2) {
                                        if (i14 != 3) {
                                            if (i14 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (timestamp) {
                                            vVar.a();
                                        }
                                    } else if (!timestamp) {
                                        vVar.a();
                                    }
                                } else if (!timestamp) {
                                    vVar.a();
                                } else if (uVar.f12454e > vVar.f12466f) {
                                    vVar.b(2);
                                }
                            } else if (timestamp) {
                                if (audioTimestamp.nanoTime / 1000 >= vVar.f12464c) {
                                    vVar.f12466f = uVar.f12454e;
                                    vVar.b(1);
                                }
                            } else if (jNanoTime - vVar.f12464c > 500000) {
                                vVar.b(3);
                            }
                        }
                        if (timestamp) {
                            if (uVar != null) {
                                j13 = 5000000;
                                j14 = uVar.f12452b.nanoTime / 1000;
                            } else {
                                j13 = 5000000;
                                j14 = -9223372036854775807L;
                            }
                            if (uVar != null) {
                                j15 = uVar.f12454e;
                            } else {
                                j15 = -1;
                            }
                            if (Math.abs(j14 - jNanoTime) > j13) {
                                StringBuilder sbQ = a9.p.q(j15, "Spurious audio timestamp (system clock mismatch): ", ", ");
                                sbQ.append(j14);
                                sbQ.append(", ");
                                sbQ.append(jNanoTime);
                                sbQ.append(", ");
                                sbQ.append(j17);
                                sbQ.append(", ");
                                sbQ.append(j0Var.j());
                                sbQ.append(", ");
                                sbQ.append(j0Var.k());
                                d5.a.K("DefaultAudioSink", sbQ.toString());
                                vVar.b(4);
                                str = "DefaultAudioSink";
                            } else {
                                j16 = j15;
                                if (Math.abs(((j15 * 1000000) / ((long) wVar.f12472g)) - j17) > j13) {
                                    StringBuilder sbQ2 = a9.p.q(j16, "Spurious audio timestamp (frame position mismatch): ", ", ");
                                    sbQ2.append(j14);
                                    sbQ2.append(", ");
                                    sbQ2.append(jNanoTime);
                                    sbQ2.append(", ");
                                    sbQ2.append(j17);
                                    sbQ2.append(", ");
                                    sbQ2.append(j0Var.j());
                                    sbQ2.append(", ");
                                    sbQ2.append(j0Var.k());
                                    str = "DefaultAudioSink";
                                    d5.a.K(str, sbQ2.toString());
                                    vVar.b(4);
                                } else {
                                    str = "DefaultAudioSink";
                                    if (vVar.f12463b == 4) {
                                        vVar.a();
                                    }
                                }
                            }
                        } else {
                            str = "DefaultAudioSink";
                            j13 = 5000000;
                        }
                        if (wVar.f12481q && (method = wVar.f12478n) != null && jNanoTime - wVar.f12482r >= j12) {
                            try {
                                AudioTrack audioTrack2 = wVar.f12469c;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                int i15 = d5.g0.f4795a;
                                long jIntValue = (((long) num.intValue()) * 1000) - wVar.f12473i;
                                wVar.f12479o = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                wVar.f12479o = jMax;
                                if (jMax > j13) {
                                    d5.a.K(str, "Ignoring impossibly large audio latency: " + jMax);
                                    wVar.f12479o = 0L;
                                }
                            } catch (Exception unused) {
                                wVar.f12478n = null;
                            }
                            wVar.f12482r = jNanoTime;
                        }
                    } else {
                        j12 = 500000;
                    }
                    timestamp = false;
                    if (timestamp) {
                        str = "DefaultAudioSink";
                        j13 = 5000000;
                    } else {
                        if (uVar != null) {
                            j13 = 5000000;
                            j14 = uVar.f12452b.nanoTime / 1000;
                        } else {
                            j13 = 5000000;
                            j14 = -9223372036854775807L;
                        }
                        if (uVar != null) {
                            j15 = uVar.f12454e;
                        } else {
                            j15 = -1;
                        }
                        if (Math.abs(j14 - jNanoTime) > j13) {
                            StringBuilder sbQ3 = a9.p.q(j15, "Spurious audio timestamp (system clock mismatch): ", ", ");
                            sbQ3.append(j14);
                            sbQ3.append(", ");
                            sbQ3.append(jNanoTime);
                            sbQ3.append(", ");
                            sbQ3.append(j17);
                            sbQ3.append(", ");
                            sbQ3.append(j0Var.j());
                            sbQ3.append(", ");
                            sbQ3.append(j0Var.k());
                            d5.a.K("DefaultAudioSink", sbQ3.toString());
                            vVar.b(4);
                            str = "DefaultAudioSink";
                        } else {
                            j16 = j15;
                            if (Math.abs(((j15 * 1000000) / ((long) wVar.f12472g)) - j17) > j13) {
                                StringBuilder sbQ4 = a9.p.q(j16, "Spurious audio timestamp (frame position mismatch): ", ", ");
                                sbQ4.append(j14);
                                sbQ4.append(", ");
                                sbQ4.append(jNanoTime);
                                sbQ4.append(", ");
                                sbQ4.append(j17);
                                sbQ4.append(", ");
                                sbQ4.append(j0Var.j());
                                sbQ4.append(", ");
                                sbQ4.append(j0Var.k());
                                str = "DefaultAudioSink";
                                d5.a.K(str, sbQ4.toString());
                                vVar.b(4);
                            } else {
                                str = "DefaultAudioSink";
                                if (vVar.f12463b == 4) {
                                    vVar.a();
                                }
                            }
                        }
                    }
                    if (wVar.f12481q) {
                        AudioTrack audioTrack3 = wVar.f12469c;
                        audioTrack3.getClass();
                        Integer num2 = (Integer) method.invoke(audioTrack3, null);
                        int i16 = d5.g0.f4795a;
                        long jIntValue2 = (((long) num2.intValue()) * 1000) - wVar.f12473i;
                        wVar.f12479o = jIntValue2;
                        jMax = Math.max(jIntValue2, 0L);
                        wVar.f12479o = jMax;
                        if (jMax > j13) {
                            d5.a.K(str, "Ignoring impossibly large audio latency: " + jMax);
                            wVar.f12479o = 0L;
                        }
                        wVar.f12482r = jNanoTime;
                    }
                }
            }
        } else {
            j10 = 1000000;
            j11 = 1000;
        }
        long jNanoTime2 = System.nanoTime() / j11;
        v vVar2 = wVar.f12471f;
        vVar2.getClass();
        boolean z11 = vVar2.f12463b == 2;
        if (z11) {
            u uVar2 = vVar2.f12462a;
            jA = d5.g0.s(jNanoTime2 - (uVar2 != null ? uVar2.f12452b.nanoTime / j11 : -9223372036854775807L), wVar.f12474j) + (((uVar2 != null ? uVar2.f12454e : -1L) * j10) / ((long) wVar.f12472g));
        } else {
            jA = wVar.f12486w == 0 ? (wVar.a() * j10) / ((long) wVar.f12472g) : wVar.f12476l + jNanoTime2;
            if (!z10) {
                jA = Math.max(0L, jA - wVar.f12479o);
            }
        }
        if (wVar.D != z11) {
            wVar.F = wVar.C;
            wVar.E = wVar.B;
        }
        long j19 = jNanoTime2 - wVar.F;
        if (j19 < j10) {
            long jS2 = d5.g0.s(j19, wVar.f12474j) + wVar.E;
            long j20 = (j19 * j11) / j10;
            jA = (((j11 - j20) * jS2) + (jA * j20)) / j11;
        }
        if (!wVar.f12475k) {
            long j21 = wVar.B;
            if (jA > j21) {
                wVar.f12475k = true;
                long jCurrentTimeMillis = System.currentTimeMillis() - d5.g0.S(d5.g0.x(d5.g0.S(jA - j21), wVar.f12474j));
                r rVar = j0Var.f12372r;
                if (rVar != null) {
                    rVar.c(jCurrentTimeMillis);
                }
            }
        }
        wVar.C = jNanoTime2;
        wVar.B = jA;
        wVar.D = z11;
        long jMin = Math.min(jA, (k() * j10) / ((long) this.f12374t.f12331e));
        while (true) {
            arrayDeque = this.f12364j;
            if (arrayDeque.isEmpty() || jMin < ((g0) arrayDeque.getFirst()).d) {
                break;
            }
            this.f12377x = (g0) arrayDeque.remove();
        }
        g0 g0Var = this.f12377x;
        long j22 = jMin - g0Var.d;
        boolean zEquals = g0Var.f12339a.equals(x1.d);
        a5.n nVar = this.f12356b;
        if (zEquals) {
            jS = this.f12377x.f12341c + j22;
        } else if (arrayDeque.isEmpty()) {
            s0 s0Var = (s0) nVar.d;
            if (s0Var.f12448o >= 1024) {
                long j23 = s0Var.f12447n;
                r0 r0Var = s0Var.f12443j;
                r0Var.getClass();
                long j24 = j23 - ((long) ((r0Var.f12423k * r0Var.f12416b) * 2));
                int i17 = s0Var.h.f12343a;
                int i18 = s0Var.f12441g.f12343a;
                jO = i17 == i18 ? d5.g0.O(j22, j24, s0Var.f12448o) : d5.g0.O(j22, j24 * ((long) i17), s0Var.f12448o * ((long) i18));
            } else {
                jO = (long) (((double) s0Var.f12438c) * j22);
            }
            jS = jO + this.f12377x.f12341c;
        } else {
            g0 g0Var2 = (g0) arrayDeque.getFirst();
            jS = g0Var2.f12341c - d5.g0.s(g0Var2.d - jMin, this.f12377x.f12339a.f8242a);
        }
        return ((((q0) nVar.f101c).f12414t * j10) / ((long) this.f12374t.f12331e)) + jS;
    }

    public final int h(h3.t0 t0Var) {
        String str = t0Var.B;
        int i10 = t0Var.Q;
        if ("audio/raw".equals(str)) {
            if (!d5.g0.D(i10)) {
                com.google.android.recaptcha.internal.a.s(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i10 != 2 && (!this.f12358c || i10 != 4)) {
                return 1;
            }
        } else if ((this.f12357b0 || !C(t0Var, this.v)) && this.f12354a.b(t0Var) == null) {
            return 0;
        }
        return 2;
    }

    public final g0 i() {
        g0 g0Var = this.f12376w;
        if (g0Var != null) {
            return g0Var;
        }
        ArrayDeque arrayDeque = this.f12364j;
        return !arrayDeque.isEmpty() ? (g0) arrayDeque.getLast() : this.f12377x;
    }

    public final long j() {
        f0 f0Var = this.f12374t;
        return f0Var.f12330c == 0 ? this.B / ((long) f0Var.f12329b) : this.C;
    }

    public final long k() {
        f0 f0Var = this.f12374t;
        return f0Var.f12330c == 0 ? this.D / ((long) f0Var.d) : this.E;
    }

    public final boolean l(long r26, int r28, java.nio.ByteBuffer r29) throws java.lang.Exception {
        throw new UnsupportedOperationException("Method not decompiled: j3.j0.l(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean m() {
        return o() && this.f12363i.b(k());
    }

    public final boolean n() throws q {
        boolean z10;
        AudioTrack audioTrackA;
        i3.k kVar;
        d5.c cVar = this.h;
        synchronized (cVar) {
            z10 = cVar.f4779a;
        }
        if (!z10) {
            return false;
        }
        try {
            f0 f0Var = this.f12374t;
            f0Var.getClass();
            try {
                audioTrackA = f0Var.a(this.Z, this.v, this.W);
                this.f12375u = audioTrackA;
                if (p(audioTrackA)) {
                    AudioTrack audioTrack = this.f12375u;
                    if (this.f12367m == null) {
                        this.f12367m = new i0(this);
                    }
                    i0 i0Var = this.f12367m;
                    Handler handler = i0Var.f12347a;
                    Objects.requireNonNull(handler);
                    audioTrack.registerStreamEventCallback(new c2.f(handler, 0), i0Var.f12348b);
                    if (this.f12366l != 3) {
                        AudioTrack audioTrack2 = this.f12375u;
                        h3.t0 t0Var = this.f12374t.f12328a;
                        audioTrack2.setOffloadDelayPadding(t0Var.R, t0Var.S);
                    }
                }
                int i10 = d5.g0.f4795a;
                if (i10 >= 31 && (kVar = this.f12371q) != null) {
                    d0.a(this.f12375u, kVar);
                }
                this.W = this.f12375u.getAudioSessionId();
                w wVar = this.f12363i;
                AudioTrack audioTrack3 = this.f12375u;
                f0 f0Var2 = this.f12374t;
                wVar.c(audioTrack3, f0Var2.f12330c == 2, f0Var2.f12333g, f0Var2.d, f0Var2.h);
                if (o()) {
                    if (i10 >= 21) {
                        this.f12375u.setVolume(this.J);
                    } else {
                        AudioTrack audioTrack4 = this.f12375u;
                        float f10 = this.J;
                        audioTrack4.setStereoVolume(f10, f10);
                    }
                }
                this.X.getClass();
                e0 e0Var = this.Y;
                if (e0Var != null && i10 >= 23) {
                    c0.a(this.f12375u, e0Var);
                }
                this.H = true;
                return true;
            } catch (q e9) {
                r rVar = this.f12372r;
                if (rVar != null) {
                    rVar.u(e9);
                }
                throw e9;
            }
        } catch (q e10) {
            f0 f0Var3 = this.f12374t;
            if (f0Var3.h > 1000000) {
                f0 f0Var4 = new f0(f0Var3.f12328a, f0Var3.f12329b, f0Var3.f12330c, f0Var3.d, f0Var3.f12331e, f0Var3.f12332f, f0Var3.f12333g, 1000000, f0Var3.f12334i);
                try {
                    try {
                        audioTrackA = f0Var4.a(this.Z, this.v, this.W);
                        this.f12374t = f0Var4;
                    } catch (q e11) {
                        r rVar2 = this.f12372r;
                        if (rVar2 != null) {
                            rVar2.u(e11);
                        }
                        throw e11;
                    }
                } catch (q e12) {
                    e10.addSuppressed(e12);
                    if (this.f12374t.f12330c == 1) {
                        throw e10;
                    }
                    this.f12357b0 = true;
                    throw e10;
                }
            }
            if (this.f12374t.f12330c == 1) {
                throw e10;
            }
            this.f12357b0 = true;
            throw e10;
        }
    }

    public final boolean o() {
        return this.f12375u != null;
    }

    public final void q() {
        this.U = false;
        if (o()) {
            w wVar = this.f12363i;
            wVar.f12476l = 0L;
            wVar.f12486w = 0;
            wVar.v = 0;
            wVar.f12477m = 0L;
            wVar.C = 0L;
            wVar.F = 0L;
            wVar.f12475k = false;
            if (wVar.f12487x == -9223372036854775807L) {
                v vVar = wVar.f12471f;
                vVar.getClass();
                vVar.a();
                this.f12375u.pause();
            }
        }
    }

    public final void r() {
        this.U = true;
        if (o()) {
            v vVar = this.f12363i.f12471f;
            vVar.getClass();
            vVar.a();
            this.f12375u.play();
        }
    }

    public final void s() {
        if (this.T) {
            return;
        }
        this.T = true;
        long jK = k();
        w wVar = this.f12363i;
        wVar.f12489z = wVar.a();
        wVar.f12487x = SystemClock.elapsedRealtime() * 1000;
        wVar.A = jK;
        this.f12375u.stop();
        this.A = 0;
    }

    public final void t() {
        if (!this.S && o() && c()) {
            s();
            this.S = true;
        }
    }

    public final void u(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = j.f12350a;
                }
            }
            if (i10 == length) {
                D(byteBuffer, j10);
            } else {
                j jVar = this.K[i10];
                if (i10 > this.R) {
                    jVar.b(byteBuffer);
                }
                ByteBuffer byteBufferA = jVar.a();
                this.L[i10] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final void v() {
        e();
        for (j jVar : this.f12361f) {
            jVar.reset();
        }
        for (j jVar2 : this.f12362g) {
            jVar2.reset();
        }
        this.U = false;
        this.f12357b0 = false;
    }

    public final void w() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i10 = 0;
        this.f12359c0 = false;
        this.F = 0;
        this.f12377x = new g0(i().f12339a, i().f12340b, 0L, 0L);
        this.I = 0L;
        this.f12376w = null;
        this.f12364j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f12379z = null;
        this.A = 0;
        this.f12360e.f12461o = 0L;
        while (true) {
            j[] jVarArr = this.K;
            if (i10 >= jVarArr.length) {
                return;
            }
            j jVar = jVarArr[i10];
            jVar.flush();
            this.L[i10] = jVar.a();
            i10++;
        }
    }

    public final void x(x1 x1Var, boolean z10) {
        g0 g0VarI = i();
        if (x1Var.equals(g0VarI.f12339a) && z10 == g0VarI.f12340b) {
            return;
        }
        g0 g0Var = new g0(x1Var, z10, -9223372036854775807L, -9223372036854775807L);
        if (o()) {
            this.f12376w = g0Var;
        } else {
            this.f12377x = g0Var;
        }
    }

    public final void y(x1 x1Var) {
        if (o()) {
            try {
                this.f12375u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(x1Var.f8242a).setPitch(x1Var.f8243b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e9) {
                d5.a.L("DefaultAudioSink", "Failed to set playback params", e9);
            }
            x1Var = new x1(this.f12375u.getPlaybackParams().getSpeed(), this.f12375u.getPlaybackParams().getPitch());
            float f10 = x1Var.f8242a;
            w wVar = this.f12363i;
            wVar.f12474j = f10;
            v vVar = wVar.f12471f;
            if (vVar != null) {
                vVar.a();
            }
        }
        this.f12378y = x1Var;
    }

    public final void z(x xVar) {
        if (this.X.equals(xVar)) {
            return;
        }
        xVar.getClass();
        if (this.f12375u != null) {
            this.X.getClass();
        }
        this.X = xVar;
    }
}
