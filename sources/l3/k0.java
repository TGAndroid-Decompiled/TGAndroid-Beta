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
    public static final Object f11527g0 = new Object();
    public static ExecutorService f11528h0;
    public static int f11529i0;
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
    public final Context f11530a;
    public boolean f11531a0;
    public final androidx.biometric.e f11532b;
    public long f11533b0;
    public final boolean f11534c;
    public long f11535c0;
    public final b0 d;
    public boolean f11536d0;
    public final w0 f11537e;
    public boolean f11538e0;
    public final s8.i0 f11539f;
    public Looper f11540f0;
    public final s8.i0 f11541g;
    public final h5.c h;
    public final y f11542i;
    public final ArrayDeque f11543j;
    public final boolean f11544k;
    public final int f11545l;
    public j0 f11546m;
    public final f2.c f11547n;
    public final f2.c f11548o;
    public final l0 f11549p;
    public k3.k f11550q;
    public t f11551r;
    public g0 f11552s;
    public g0 f11553t;
    public k f11554u;
    public AudioTrack v;
    public g f11555w;
    public z0 f11556x;
    public d f11557y;
    public h0 f11558z;

    public k0(com.google.firebase.messaging.s sVar) {
        g gVar;
        Context context = (Context) sVar.f4080a;
        this.f11530a = context;
        if (context != null) {
            gVar = g.a(context);
        } else {
            gVar = (g) sVar.f4081b;
        }
        this.f11555w = gVar;
        this.f11532b = (androidx.biometric.e) sVar.f4082c;
        int i10 = h5.d0.f7237a;
        this.f11534c = false;
        this.f11544k = false;
        this.f11545l = 0;
        this.f11549p = (l0) sVar.d;
        ?? obj = new Object();
        this.h = obj;
        obj.c();
        this.f11542i = new y(new androidx.biometric.f0(this, 17));
        ?? a0Var = new a0();
        this.d = a0Var;
        ?? a0Var2 = new a0();
        a0Var2.f11645m = h5.d0.f7241f;
        this.f11537e = a0Var2;
        a0 a0Var3 = new a0();
        s8.t tVar = s8.v.f47174b;
        Object[] objArr = {a0Var3, a0Var, a0Var2};
        s8.l.b(3, objArr);
        this.f11539f = s8.v.s(3, objArr);
        this.f11541g = s8.v.x(new a0());
        this.N = 1.0f;
        this.f11557y = d.h;
        this.X = 0;
        this.Y = new Object();
        v1 v1Var = v1.d;
        this.A = new h0(v1Var, 0L, 0L);
        this.B = v1Var;
        this.C = false;
        this.f11543j = new ArrayDeque();
        this.f11547n = new f2.c(3);
        this.f11548o = new f2.c(3);
    }

    public static AudioFormat g(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean p(AudioTrack audioTrack) {
        if (h5.d0.f7237a >= 29 && audioTrack.isOffloadedPlayback()) {
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
        int i12 = h5.d0.f7237a;
        if (i12 >= 29 && (i10 = this.f11545l) != 0) {
            String str = n0Var.C;
            str.getClass();
            int b10 = h5.o.b(str, n0Var.f9324r);
            if (b10 == 0 || (n10 = h5.d0.n(n0Var.P)) == 0) {
                return false;
            }
            AudioFormat g10 = g(n0Var.Q, n10, b10);
            AudioAttributes audioAttributes = (AudioAttributes) dVar.a().f16617b;
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
                if (h5.d0.f7237a < 21) {
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
            int i10 = h5.d0.f7237a;
            if (i10 < 21) {
                long j11 = this.H;
                y yVar = this.f11542i;
                int b10 = yVar.f11656e - ((int) (j11 - (yVar.b() * yVar.d)));
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
            } else if (this.f11531a0) {
                if (j10 != -9223372036854775807L) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                if (j10 == Long.MIN_VALUE) {
                    j10 = this.f11533b0;
                } else {
                    this.f11533b0 = j10;
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
            this.f11535c0 = SystemClock.elapsedRealtime();
            f2.c cVar = this.f11548o;
            if (write < 0) {
                u uVar = new u(write, this.f11553t.f11505a, (((i10 < 24 || write != -6) && write != -32) || this.I <= 0) ? false : false);
                t tVar2 = this.f11551r;
                if (tVar2 != null) {
                    tVar2.l(uVar);
                }
                if (!uVar.f11634b) {
                    cVar.K(uVar);
                    return;
                } else {
                    this.f11555w = g.f11501c;
                    throw uVar;
                }
            }
            cVar.f5740c = null;
            if (p(this.v)) {
                if (this.I > 0) {
                    this.f11538e0 = false;
                }
                if (this.V && (tVar = this.f11551r) != null && write < remaining2 && !this.f11538e0) {
                    tVar.b();
                }
            }
            int i11 = this.f11553t.f11507c;
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
        if (h5.d0.f7237a >= 21) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        h5.a.i(this.W);
        if (!this.f11531a0) {
            this.f11531a0 = true;
            e();
        }
    }

    public final void e() {
        if (o()) {
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.f11538e0 = false;
            this.J = 0;
            this.A = new h0(this.B, 0L, 0L);
            this.M = 0L;
            this.f11558z = null;
            this.f11543j.clear();
            this.O = null;
            this.P = 0;
            this.Q = null;
            this.U = false;
            this.T = false;
            this.D = null;
            this.E = 0;
            this.f11537e.f11647o = 0L;
            k kVar = this.f11553t.f11511i;
            this.f11554u = kVar;
            kVar.a();
            AudioTrack audioTrack = this.f11542i.f11655c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.v.pause();
            }
            if (p(this.v)) {
                j0 j0Var = this.f11546m;
                j0Var.getClass();
                j0Var.a(this.v);
            }
            if (h5.d0.f7237a < 21 && !this.W) {
                this.X = 0;
            }
            g0 g0Var = this.f11552s;
            if (g0Var != null) {
                this.f11553t = g0Var;
                this.f11552s = null;
            }
            y yVar = this.f11542i;
            yVar.d();
            yVar.f11655c = null;
            yVar.f11657f = null;
            AudioTrack audioTrack2 = this.v;
            h5.c cVar = this.h;
            cVar.b();
            synchronized (f11527g0) {
                try {
                    if (f11528h0 == null) {
                        f11528h0 = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f11529i0++;
                    f11528h0.execute(new gf.c(21, audioTrack2, cVar));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.v = null;
        }
        this.f11548o.f5740c = null;
        this.f11547n.f5740c = null;
    }

    public final g f() {
        Context context;
        g b10;
        i iVar;
        if (this.f11556x == null && (context = this.f11530a) != null) {
            this.f11540f0 = Looper.myLooper();
            z0 z0Var = new z0(context, new hg.f(this, 19));
            this.f11556x = z0Var;
            androidx.mediarouter.app.h hVar = (androidx.mediarouter.app.h) z0Var.f2227f;
            Handler handler = (Handler) z0Var.d;
            Context context2 = (Context) z0Var.f2224b;
            if (z0Var.f2223a) {
                b10 = (g) z0Var.h;
                b10.getClass();
            } else {
                z0Var.f2223a = true;
                j jVar = (j) z0Var.f2228g;
                if (jVar != null) {
                    jVar.f11518a.registerContentObserver(jVar.f11519b, false, jVar);
                }
                if (h5.d0.f7237a >= 23 && (iVar = (i) z0Var.f2226e) != null) {
                    h.a(context2, iVar, handler);
                }
                Intent intent = null;
                if (hVar != null) {
                    intent = context2.registerReceiver(hVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler);
                }
                b10 = g.b(context2, intent);
                z0Var.h = b10;
            }
            this.f11555w = b10;
        }
        return this.f11555w;
    }

    public final long h(boolean z4) {
        ArrayDeque arrayDeque;
        long t6;
        long j10;
        if (o() && !this.L) {
            long a2 = this.f11542i.a(z4);
            g0 g0Var = this.f11553t;
            long min = Math.min(a2, h5.d0.M(g0Var.f11508e, k()));
            while (true) {
                arrayDeque = this.f11543j;
                if (arrayDeque.isEmpty() || min < ((h0) arrayDeque.getFirst()).f11515c) {
                    break;
                }
                this.A = (h0) arrayDeque.remove();
            }
            h0 h0Var = this.A;
            long j11 = min - h0Var.f11515c;
            boolean equals = h0Var.f11513a.equals(v1.d);
            androidx.biometric.e eVar = this.f11532b;
            if (equals) {
                t6 = this.A.f11514b + j11;
            } else if (arrayDeque.isEmpty()) {
                s0 s0Var = (s0) eVar.d;
                if (s0Var.f11630o >= 1024) {
                    long j12 = s0Var.f11629n;
                    r0 r0Var = s0Var.f11625j;
                    r0Var.getClass();
                    long j13 = j12 - ((r0Var.f11605k * r0Var.f11598b) * 2);
                    int i10 = s0Var.h.f11560a;
                    int i11 = s0Var.f11623g.f11560a;
                    if (i10 == i11) {
                        j10 = h5.d0.N(j11, j13, s0Var.f11630o);
                    } else {
                        j10 = h5.d0.N(j11, j13 * i10, s0Var.f11630o * i11);
                    }
                } else {
                    j10 = (long) (s0Var.f11620c * j11);
                }
                t6 = j10 + this.A.f11514b;
            } else {
                h0 h0Var2 = (h0) arrayDeque.getFirst();
                t6 = h0Var2.f11514b - h5.d0.t(h0Var2.f11515c - min, this.A.f11513a.f9452a);
            }
            g0 g0Var2 = this.f11553t;
            return h5.d0.M(g0Var2.f11508e, ((q0) eVar.f528c).f11595t) + t6;
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
            } else if (i10 != 2 && (!this.f11534c || i10 != 4)) {
                return 1;
            }
        } else if ((this.f11536d0 || !A(n0Var, this.f11557y)) && f().c(n0Var) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        g0 g0Var = this.f11553t;
        if (g0Var.f11507c == 0) {
            return this.F / g0Var.f11506b;
        }
        return this.G;
    }

    public final long k() {
        g0 g0Var = this.f11553t;
        if (g0Var.f11507c == 0) {
            return this.H / g0Var.d;
        }
        return this.I;
    }

    public final boolean l(java.nio.ByteBuffer r26, long r27, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.l(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean m() {
        if (o() && this.f11542i.c(k())) {
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
            y yVar = this.f11542i;
            yVar.d();
            if (yVar.f11674y == -9223372036854775807L) {
                x xVar = yVar.f11657f;
                xVar.getClass();
                xVar.a();
                this.v.pause();
            }
        }
    }

    public final void r() {
        this.V = true;
        if (o()) {
            x xVar = this.f11542i.f11657f;
            xVar.getClass();
            xVar.a();
            this.v.play();
        }
    }

    public final void s() {
        if (!this.U) {
            this.U = true;
            long k10 = k();
            y yVar = this.f11542i;
            yVar.A = yVar.b();
            yVar.f11674y = SystemClock.elapsedRealtime() * 1000;
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
        s8.t listIterator = this.f11539f.listIterator(0);
        while (listIterator.hasNext()) {
            ((n) listIterator.next()).reset();
        }
        s8.t listIterator2 = this.f11541g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((n) listIterator2.next()).reset();
        }
        k kVar = this.f11554u;
        if (kVar != null) {
            s8.v vVar = kVar.f11524a;
            for (int i10 = 0; i10 < vVar.size(); i10++) {
                n nVar = (n) vVar.get(i10);
                nVar.flush();
                nVar.reset();
            }
            kVar.f11526c = new ByteBuffer[0];
            l lVar = l.f11559e;
            kVar.d = false;
        }
        this.V = false;
        this.f11536d0 = false;
    }

    public final void w() {
        if (o()) {
            try {
                this.v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.B.f9452a).setPitch(this.B.f9453b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e6) {
                h5.a.L("DefaultAudioSink", "Failed to set playback params", e6);
            }
            v1 v1Var = new v1(this.v.getPlaybackParams().getSpeed(), this.v.getPlaybackParams().getPitch());
            this.B = v1Var;
            float f10 = v1Var.f9452a;
            y yVar = this.f11542i;
            yVar.f11660j = f10;
            x xVar = yVar.f11657f;
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
        this.B = new v1(h5.d0.g(v1Var.f9452a, 0.1f, 8.0f), h5.d0.g(v1Var.f9453b, 0.1f, 8.0f));
        if (z()) {
            w();
            return;
        }
        h0 h0Var = new h0(v1Var, -9223372036854775807L, -9223372036854775807L);
        if (o()) {
            this.f11558z = h0Var;
        } else {
            this.A = h0Var;
        }
    }

    public final boolean z() {
        g0 g0Var = this.f11553t;
        if (g0Var != null && g0Var.f11512j && h5.d0.f7237a >= 23) {
            return true;
        }
        return false;
    }
}
