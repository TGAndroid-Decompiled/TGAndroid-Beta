package l3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import c2.z0;
import j3.v1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class k0 implements v {
    public static final Object f11163g0 = new Object();
    public static ExecutorService f11164h0;
    public static int f11165i0;
    public h0 A;
    public v1 B;
    public boolean C;
    public ByteBuffer D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public boolean L;
    public long M;
    public float N;
    public ByteBuffer O;
    public int P;
    public ByteBuffer Q;
    public byte[] R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public z Y;
    public f0 Z;
    public final Context f11166a;
    public boolean f11167a0;
    public final androidx.biometric.e f11168b;
    public long f11169b0;
    public final boolean f11170c;
    public long f11171c0;
    public final b0 d;
    public boolean f11172d0;
    public final w0 e;
    public boolean f11173e0;
    public final s8.i0 f11174f;
    public Looper f11175f0;
    public final s8.i0 f11176g;
    public final h5.c h;
    public final y f11177i;
    public final ArrayDeque f11178j;
    public final boolean f11179k;
    public final int f11180l;
    public j0 f11181m;
    public final f2.c f11182n;
    public final f2.c f11183o;
    public final l0 f11184p;
    public k3.k f11185q;
    public t f11186r;
    public g0 f11187s;
    public g0 f11188t;
    public k f11189u;
    public AudioTrack v;
    public g f11190w;
    public z0 f11191x;
    public d f11192y;
    public h0 f11193z;

    public k0(com.google.firebase.messaging.r rVar) {
        g gVar;
        Context context = (Context) rVar.f4028b;
        this.f11166a = context;
        if (context != null) {
            gVar = g.a(context);
        } else {
            gVar = (g) rVar.f4029c;
        }
        this.f11190w = gVar;
        this.f11168b = (androidx.biometric.e) rVar.d;
        int i10 = h5.d0.f6937a;
        this.f11170c = false;
        this.f11179k = false;
        this.f11180l = 0;
        this.f11184p = (l0) rVar.e;
        ?? obj = new Object();
        this.h = obj;
        obj.c();
        this.f11177i = new y(new androidx.biometric.f0(this, 17));
        ?? a0Var = new a0();
        this.d = a0Var;
        ?? a0Var2 = new a0();
        a0Var2.f11274m = h5.d0.f6940f;
        this.e = a0Var2;
        a0 a0Var3 = new a0();
        s8.t tVar = s8.v.f44157b;
        Object[] objArr = {a0Var3, a0Var, a0Var2};
        s8.l.b(3, objArr);
        this.f11174f = s8.v.s(3, objArr);
        this.f11176g = s8.v.x(new a0());
        this.N = 1.0f;
        this.f11192y = d.h;
        this.X = 0;
        this.Y = new Object();
        v1 v1Var = v1.d;
        this.A = new h0(v1Var, 0L, 0L);
        this.B = v1Var;
        this.C = false;
        this.f11178j = new ArrayDeque();
        this.f11182n = new f2.c(3);
        this.f11183o = new f2.c(3);
    }

    public static AudioFormat g(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean p(AudioTrack audioTrack) {
        if (h5.d0.f6937a >= 29 && audioTrack.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final boolean A(j3.n0 n0Var, d dVar) {
        int i10;
        int n10;
        int i11;
        boolean z4;
        boolean z10;
        int i12 = h5.d0.f6937a;
        if (i12 >= 29 && (i10 = this.f11180l) != 0) {
            String str = n0Var.C;
            str.getClass();
            int b10 = h5.o.b(str, n0Var.f8740r);
            if (b10 == 0 || (n10 = h5.d0.n(n0Var.P)) == 0) {
                return false;
            }
            AudioFormat g10 = g(n0Var.Q, n10, b10);
            AudioAttributes audioAttributes = (AudioAttributes) dVar.a().f9354b;
            if (i12 >= 31) {
                i11 = AudioManager.getPlaybackOffloadSupport(g10, audioAttributes);
            } else if (!AudioManager.isOffloadedPlaybackSupported(g10, audioAttributes)) {
                i11 = 0;
            } else if (i12 == 30 && h5.d0.d.startsWith("Pixel")) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return true;
                    }
                    throw new IllegalStateException();
                }
                if (n0Var.S == 0 && n0Var.T == 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (i10 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z4 && z10) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void B(ByteBuffer byteBuffer, long j10) {
        ByteBuffer byteBuffer2;
        int write;
        boolean z4;
        int write2;
        t tVar;
        boolean z10;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.Q;
            boolean z11 = true;
            if (byteBuffer3 != null) {
                if (byteBuffer3 == byteBuffer) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h5.a.f(z10);
            } else {
                this.Q = byteBuffer;
                if (h5.d0.f6937a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.R;
                    if (bArr == null || bArr.length < remaining) {
                        this.R = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.R, 0, remaining);
                    byteBuffer.position(position);
                    this.S = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i10 = h5.d0.f6937a;
            if (i10 < 21) {
                long j11 = this.H;
                y yVar = this.f11177i;
                int b10 = yVar.e - ((int) (j11 - (yVar.b() * yVar.d)));
                if (b10 > 0) {
                    write = this.v.write(this.R, this.S, Math.min(remaining2, b10));
                    if (write > 0) {
                        this.S += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.f11167a0) {
                if (j10 != -9223372036854775807L) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                if (j10 == Long.MIN_VALUE) {
                    j10 = this.f11169b0;
                } else {
                    this.f11169b0 = j10;
                }
                AudioTrack audioTrack = this.v;
                if (i10 >= 26) {
                    byteBuffer2 = byteBuffer;
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1, j10 * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.D == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.D = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.D.putInt(1431633921);
                    }
                    if (this.E == 0) {
                        this.D.putInt(4, remaining2);
                        this.D.putLong(8, j10 * 1000);
                        this.D.position(0);
                        this.E = remaining2;
                    }
                    int remaining3 = this.D.remaining();
                    if (remaining3 > 0) {
                        write = audioTrack.write(this.D, remaining3, 1);
                        if (write < 0) {
                            this.E = 0;
                        } else if (write < remaining3) {
                            write = 0;
                        }
                    }
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1);
                    if (write2 < 0) {
                        this.E = 0;
                    } else {
                        this.E -= write2;
                    }
                }
                write = write2;
            } else {
                byteBuffer2 = byteBuffer;
                write = this.v.write(byteBuffer2, remaining2, 1);
            }
            this.f11171c0 = SystemClock.elapsedRealtime();
            f2.c cVar = this.f11183o;
            if (write < 0) {
                u uVar = new u(write, this.f11188t.f11142a, (((i10 < 24 || write != -6) && write != -32) || this.I <= 0) ? false : false);
                t tVar2 = this.f11186r;
                if (tVar2 != null) {
                    tVar2.w(uVar);
                }
                if (!uVar.f11264b) {
                    cVar.H(uVar);
                    return;
                } else {
                    this.f11190w = g.f11139c;
                    throw uVar;
                }
            }
            cVar.f5671c = null;
            if (p(this.v)) {
                if (this.I > 0) {
                    this.f11173e0 = false;
                }
                if (this.V && (tVar = this.f11186r) != null && write < remaining2 && !this.f11173e0) {
                    tVar.e();
                }
            }
            int i11 = this.f11188t.f11144c;
            if (i11 == 0) {
                this.H += write;
            }
            if (write == remaining2) {
                if (i11 != 0) {
                    if (byteBuffer2 != this.O) {
                        z11 = false;
                    }
                    h5.a.i(z11);
                    this.I = (this.J * this.P) + this.I;
                }
                this.Q = null;
            }
        }
    }

    public final void a(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.a(long):void");
    }

    public final void b(j3.n0 r27, int[] r28) {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.b(j3.n0, int[]):void");
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.c():boolean");
    }

    public final void d() {
        boolean z4;
        if (h5.d0.f6937a >= 21) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        h5.a.i(this.W);
        if (!this.f11167a0) {
            this.f11167a0 = true;
            e();
        }
    }

    public final void e() {
        if (o()) {
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.f11173e0 = false;
            this.J = 0;
            this.A = new h0(this.B, 0L, 0L);
            this.M = 0L;
            this.f11193z = null;
            this.f11178j.clear();
            this.O = null;
            this.P = 0;
            this.Q = null;
            this.U = false;
            this.T = false;
            this.D = null;
            this.E = 0;
            this.e.f11276o = 0L;
            k kVar = this.f11188t.f11147i;
            this.f11189u = kVar;
            kVar.a();
            AudioTrack audioTrack = this.f11177i.f11283c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.v.pause();
            }
            if (p(this.v)) {
                j0 j0Var = this.f11181m;
                j0Var.getClass();
                j0Var.a(this.v);
            }
            if (h5.d0.f6937a < 21 && !this.W) {
                this.X = 0;
            }
            g0 g0Var = this.f11187s;
            if (g0Var != null) {
                this.f11188t = g0Var;
                this.f11187s = null;
            }
            y yVar = this.f11177i;
            yVar.d();
            yVar.f11283c = null;
            yVar.f11284f = null;
            AudioTrack audioTrack2 = this.v;
            h5.c cVar = this.h;
            cVar.b();
            synchronized (f11163g0) {
                try {
                    if (f11164h0 == null) {
                        f11164h0 = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f11165i0++;
                    f11164h0.execute(new gf.c(26, audioTrack2, cVar));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.v = null;
        }
        this.f11183o.f5671c = null;
        this.f11182n.f5671c = null;
    }

    public final g f() {
        Context context;
        g b10;
        i iVar;
        if (this.f11191x == null && (context = this.f11166a) != null) {
            this.f11175f0 = Looper.myLooper();
            z0 z0Var = new z0(context, new gg.f(this, 23));
            this.f11191x = z0Var;
            androidx.mediarouter.app.h hVar = (androidx.mediarouter.app.h) z0Var.f2049f;
            Handler handler = (Handler) z0Var.d;
            Context context2 = (Context) z0Var.f2047b;
            if (z0Var.f2046a) {
                b10 = (g) z0Var.h;
                b10.getClass();
            } else {
                z0Var.f2046a = true;
                j jVar = (j) z0Var.f2050g;
                if (jVar != null) {
                    jVar.f11154a.registerContentObserver(jVar.f11155b, false, jVar);
                }
                if (h5.d0.f6937a >= 23 && (iVar = (i) z0Var.e) != null) {
                    h.a(context2, iVar, handler);
                }
                Intent intent = null;
                if (hVar != null) {
                    intent = context2.registerReceiver(hVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler);
                }
                b10 = g.b(context2, intent);
                z0Var.h = b10;
            }
            this.f11190w = b10;
        }
        return this.f11190w;
    }

    public final long h(boolean z4) {
        ArrayDeque arrayDeque;
        long t6;
        long j10;
        if (o() && !this.L) {
            long a2 = this.f11177i.a(z4);
            g0 g0Var = this.f11188t;
            long min = Math.min(a2, h5.d0.M(g0Var.e, k()));
            while (true) {
                arrayDeque = this.f11178j;
                if (arrayDeque.isEmpty() || min < ((h0) arrayDeque.getFirst()).f11151c) {
                    break;
                }
                this.A = (h0) arrayDeque.remove();
            }
            h0 h0Var = this.A;
            long j11 = min - h0Var.f11151c;
            boolean equals = h0Var.f11149a.equals(v1.d);
            androidx.biometric.e eVar = this.f11168b;
            if (equals) {
                t6 = this.A.f11150b + j11;
            } else if (arrayDeque.isEmpty()) {
                s0 s0Var = (s0) eVar.d;
                if (s0Var.f11260o >= 1024) {
                    long j12 = s0Var.f11259n;
                    r0 r0Var = s0Var.f11255j;
                    r0Var.getClass();
                    long j13 = j12 - ((r0Var.f11236k * r0Var.f11230b) * 2);
                    int i10 = s0Var.h.f11194a;
                    int i11 = s0Var.f11253g.f11194a;
                    if (i10 == i11) {
                        j10 = h5.d0.N(j11, j13, s0Var.f11260o);
                    } else {
                        j10 = h5.d0.N(j11, j13 * i10, s0Var.f11260o * i11);
                    }
                } else {
                    j10 = (long) (s0Var.f11251c * j11);
                }
                t6 = j10 + this.A.f11150b;
            } else {
                h0 h0Var2 = (h0) arrayDeque.getFirst();
                t6 = h0Var2.f11150b - h5.d0.t(h0Var2.f11151c - min, this.A.f11149a.f8856a);
            }
            g0 g0Var2 = this.f11188t;
            return h5.d0.M(g0Var2.e, ((q0) eVar.f479c).f11227t) + t6;
        }
        return Long.MIN_VALUE;
    }

    public final int i(j3.n0 n0Var) {
        String str = n0Var.C;
        int i10 = n0Var.R;
        if ("audio/raw".equals(str)) {
            if (!h5.d0.D(i10)) {
                e2.c.q(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            } else if (i10 != 2 && (!this.f11170c || i10 != 4)) {
                return 1;
            }
        } else if ((this.f11172d0 || !A(n0Var, this.f11192y)) && f().c(n0Var) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        g0 g0Var = this.f11188t;
        if (g0Var.f11144c == 0) {
            return this.F / g0Var.f11143b;
        }
        return this.G;
    }

    public final long k() {
        g0 g0Var = this.f11188t;
        if (g0Var.f11144c == 0) {
            return this.H / g0Var.d;
        }
        return this.I;
    }

    public final boolean l(java.nio.ByteBuffer r26, long r27, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.l(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean m() {
        if (o() && this.f11177i.c(k())) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.n():boolean");
    }

    public final boolean o() {
        if (this.v != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.V = false;
        if (o()) {
            y yVar = this.f11177i;
            yVar.d();
            if (yVar.f11301y == -9223372036854775807L) {
                x xVar = yVar.f11284f;
                xVar.getClass();
                xVar.a();
                this.v.pause();
            }
        }
    }

    public final void r() {
        this.V = true;
        if (o()) {
            x xVar = this.f11177i.f11284f;
            xVar.getClass();
            xVar.a();
            this.v.play();
        }
    }

    public final void s() {
        if (!this.U) {
            this.U = true;
            long k10 = k();
            y yVar = this.f11177i;
            yVar.A = yVar.b();
            yVar.f11301y = SystemClock.elapsedRealtime() * 1000;
            yVar.B = k10;
            this.v.stop();
            this.E = 0;
        }
    }

    public final void t() {
        if (!this.T && o() && c()) {
            s();
            this.T = true;
        }
    }

    public final void u(long r4) {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.u(long):void");
    }

    public final void v() {
        e();
        s8.t listIterator = this.f11174f.listIterator(0);
        while (listIterator.hasNext()) {
            ((n) listIterator.next()).reset();
        }
        s8.t listIterator2 = this.f11176g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((n) listIterator2.next()).reset();
        }
        k kVar = this.f11189u;
        if (kVar != null) {
            s8.v vVar = kVar.f11160a;
            for (int i10 = 0; i10 < vVar.size(); i10++) {
                n nVar = (n) vVar.get(i10);
                nVar.flush();
                nVar.reset();
            }
            kVar.f11162c = new ByteBuffer[0];
            l lVar = l.e;
            kVar.d = false;
        }
        this.V = false;
        this.f11172d0 = false;
    }

    public final void w() {
        if (o()) {
            try {
                this.v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.B.f8856a).setPitch(this.B.f8857b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                h5.a.L("DefaultAudioSink", "Failed to set playback params", e);
            }
            v1 v1Var = new v1(this.v.getPlaybackParams().getSpeed(), this.v.getPlaybackParams().getPitch());
            this.B = v1Var;
            float f10 = v1Var.f8856a;
            y yVar = this.f11177i;
            yVar.f11287j = f10;
            x xVar = yVar.f11284f;
            if (xVar != null) {
                xVar.a();
            }
            yVar.d();
        }
    }

    public final void x(z zVar) {
        if (this.Y.equals(zVar)) {
            return;
        }
        zVar.getClass();
        if (this.v != null) {
            this.Y.getClass();
        }
        this.Y = zVar;
    }

    public final void y(v1 v1Var) {
        this.B = new v1(h5.d0.g(v1Var.f8856a, 0.1f, 8.0f), h5.d0.g(v1Var.f8857b, 0.1f, 8.0f));
        if (z()) {
            w();
            return;
        }
        h0 h0Var = new h0(v1Var, -9223372036854775807L, -9223372036854775807L);
        if (o()) {
            this.f11193z = h0Var;
        } else {
            this.A = h0Var;
        }
    }

    public final boolean z() {
        g0 g0Var = this.f11188t;
        if (g0Var != null && g0Var.f11148j && h5.d0.f6937a >= 23) {
            return true;
        }
        return false;
    }
}
