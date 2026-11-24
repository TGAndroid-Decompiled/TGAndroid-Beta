package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
public class fk6 extends lk6 implements ck6 {
    public final Context a1;
    public final tg2 b1;
    public final x30 c1;
    public final bg6 d1;
    public final AtomicBoolean e1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public fm4 i1;
    public fm4 j1;
    public long k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public int p1;
    public boolean q1;
    public long r1;
    public long s1;
    public boolean t1;

    public fk6(Context context, dk6 dk6Var, Handler handler, t54 t54Var, x30 x30Var) {
        super(context.getApplicationContext(), 1, dk6Var);
        bg6 bg6Var;
        if (Build.VERSION.SDK_INT >= 35) {
            bg6Var = new bg6();
        } else {
            bg6Var = null;
        }
        this.a1 = context.getApplicationContext();
        this.c1 = x30Var;
        this.d1 = bg6Var;
        this.p1 = -1000;
        this.b1 = new tg2(handler, t54Var);
        this.e1 = new AtomicBoolean();
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    public static w59 L0(fm4 fm4Var, boolean z, x30 x30Var) {
        ik6 ik6Var;
        if (fm4Var.t == null) {
            km5 km5Var = mm5.b;
            return w59.e;
        }
        if (((q93) x30Var).j(fm4Var) != 0) {
            List e = qk6.e("audio/raw", false, false);
            if (e.isEmpty()) {
                ik6Var = null;
            } else {
                ik6Var = (ik6) e.get(0);
            }
            if (ik6Var != null) {
                return mm5.u(ik6Var);
            }
        }
        return qk6.g(fm4Var, z, false);
    }

    @Override
    public final boolean E0(fm4 fm4Var) {
        d79 d79Var = this.d;
        d79Var.getClass();
        if (d79Var.a != 0) {
            int J0 = J0(fm4Var);
            if ((J0 & 512) != 0) {
                d79 d79Var2 = this.d;
                d79Var2.getClass();
                if (d79Var2.a == 2 || (J0 & 1024) != 0 || (fm4Var.R == 0 && fm4Var.S == 0)) {
                    return true;
                }
            }
        }
        if (((q93) this.c1).j(fm4Var) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int F0(defpackage.fm4 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk6.F0(fm4):int");
    }

    public final int J0(fm4 fm4Var) {
        k00 a;
        int i;
        q93 q93Var = (q93) this.c1;
        if (q93Var.a0) {
            a = k00.d;
        } else {
            o00 b = ((l40) q93Var.r).b(q93Var.i(fm4Var));
            ?? obj = new Object();
            obj.a = b.a;
            obj.b = b.b;
            obj.c = b.c;
            a = obj.a();
        }
        if (!a.a) {
            return 0;
        }
        if (a.b) {
            i = 1536;
        } else {
            i = 512;
        }
        if (a.c) {
            return i | 2048;
        }
        return i;
    }

    public final int K0(ik6 ik6Var, fm4 fm4Var) {
        if ("OMX.google.raw.decoder".equals(ik6Var.a) && Build.VERSION.SDK_INT == 23 && !g8c.Q(this.a1)) {
            return -1;
        }
        return fm4Var.u;
    }

    @Override
    public d93 M(ik6 ik6Var, fm4 fm4Var, fm4 fm4Var2, boolean z) {
        byte b;
        d93 b2 = ik6Var.b(fm4Var, fm4Var2);
        int i = b2.e;
        if (this.X == null && E0(fm4Var2)) {
            i |= 32768;
        }
        if (K0(ik6Var, fm4Var2) > this.f1) {
            i |= 64;
        }
        int i2 = i;
        String str = ik6Var.a;
        if (i2 != 0) {
            b = 0;
        } else {
            b = b2.d;
        }
        return new d93(str, fm4Var, fm4Var2, b, i2);
    }

    public final void M0() {
        n();
        long h = ((q93) this.c1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.l1) {
                h = Math.max(this.k1, h);
            }
            this.k1 = h;
            this.l1 = false;
        }
    }

    @Override
    public final ArrayList W(fm4 fm4Var, boolean z) {
        w59 L0 = L0(fm4Var, z, this.c1);
        HashMap hashMap = qk6.a;
        ArrayList arrayList = new ArrayList(L0);
        Collections.sort(arrayList, new bz0(new h45(this.a1, fm4Var, (byte) 25), (byte) 3));
        return arrayList;
    }

    @Override
    public final long X(long j, long j2, boolean z) {
        boolean z2;
        float f;
        q93 q93Var = (q93) this.c1;
        if (q93Var.n() && this.r1 != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.q1) {
            if (z2 || this.K0) {
                return 1000000L;
            }
        } else {
            long g = q93Var.g();
            if (this.o1 && z2 && g != -9223372036854775807L) {
                float min = (float) Math.min(g, this.r1 - j);
                if (g() != null) {
                    f = g().a;
                } else {
                    f = 1.0f;
                }
                return Math.max(10000L, (min / f) / 2.0f);
            }
        }
        return 10000L;
    }

    @Override
    public final defpackage.ep Z(defpackage.ik6 r17, defpackage.fm4 r18, android.media.MediaCrypto r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk6.Z(ik6, fm4, android.media.MediaCrypto, float):ep");
    }

    @Override
    public final void a0(z83 z83Var) {
        fm4 fm4Var;
        wg2 wg2Var;
        if (Build.VERSION.SDK_INT >= 29 && (fm4Var = z83Var.a) != null && Objects.equals(fm4Var.t, "audio/opus") && this.x0) {
            ByteBuffer byteBuffer = z83Var.f;
            byteBuffer.getClass();
            fm4 fm4Var2 = z83Var.a;
            fm4Var2.getClass();
            int i = fm4Var2.R;
            if (byteBuffer.remaining() == 8) {
                int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                q93 q93Var = (q93) this.c1;
                j40 j40Var = q93Var.t;
                if (j40Var != null && j40Var.c() && (wg2Var = q93Var.p) != null && ((r00) wg2Var.e).k) {
                    q93Var.t.d(i, i2);
                }
            }
        }
    }

    @Override
    public final void b(zb8 zb8Var) {
        ((q93) this.c1).C(zb8Var);
    }

    @Override
    public final void d(int i, Object obj) {
        zb8 zb8Var;
        bg6 bg6Var;
        x30 x30Var = this.c1;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    if (i != 12) {
                        if (i != 16) {
                            if (i != 9) {
                                if (i != 10) {
                                    if (i != 19) {
                                        if (i != 20) {
                                            super.d(i, obj);
                                            return;
                                        }
                                        obj.getClass();
                                        ((q93) x30Var).y((s00) obj);
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    q93 q93Var = (q93) x30Var;
                                    if (intValue == 0 || intValue == -1) {
                                        intValue = -1;
                                    }
                                    if (q93Var.X != intValue) {
                                        q93Var.X = intValue;
                                        q93Var.v();
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue2 = ((Integer) obj).intValue();
                                ((q93) x30Var).z(intValue2);
                                if (Build.VERSION.SDK_INT >= 35 && (bg6Var = this.d1) != null) {
                                    bg6Var.d(intValue2);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            q93 q93Var2 = (q93) x30Var;
                            q93Var2.y = ((Boolean) obj).booleanValue();
                            if (q93Var2.E()) {
                                zb8Var = zb8.d;
                            } else {
                                zb8Var = q93Var2.x;
                            }
                            p93 p93Var = new p93(zb8Var, -9223372036854775807L, -9223372036854775807L);
                            if (q93Var2.p()) {
                                q93Var2.v = p93Var;
                                return;
                            } else {
                                q93Var2.w = p93Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.p1 = ((Integer) obj).intValue();
                        ek6 ek6Var = this.c0;
                        if (ek6Var != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.p1));
                            ek6Var.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    q93 q93Var3 = (q93) x30Var;
                    q93Var3.W = audioDeviceInfo;
                    j40 j40Var = q93Var3.t;
                    if (j40Var != null) {
                        j40Var.a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                ta0 ta0Var = (ta0) obj;
                ta0Var.getClass();
                ((q93) x30Var).A(ta0Var);
                return;
            }
            nz nzVar = (nz) obj;
            nzVar.getClass();
            q93 q93Var4 = (q93) x30Var;
            if (!q93Var4.u.equals(nzVar)) {
                q93Var4.u = nzVar;
                if (!q93Var4.Y) {
                    q93Var4.v();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        q93 q93Var5 = (q93) x30Var;
        if (q93Var5.K != floatValue) {
            q93Var5.K = floatValue;
            if (q93Var5.p()) {
                q93Var5.t.a.setVolume(q93Var5.K);
            }
        }
    }

    @Override
    public final zb8 g() {
        return ((q93) this.c1).x;
    }

    @Override
    public final void g0(Exception exc) {
        lad.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new j30(tg2Var, exc, (byte) 0));
        }
    }

    @Override
    public final long h() {
        if (this.n == 2) {
            M0();
        }
        return this.k1;
    }

    @Override
    public final void h0(long j, String str, long j2) {
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new n30(tg2Var, str, j, j2, (byte) 0));
        }
    }

    @Override
    public final boolean i() {
        boolean z = this.n1;
        this.n1 = false;
        return z;
    }

    @Override
    public final void i0(uj2 uj2Var) {
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new z20(tg2Var, uj2Var, (byte) 2));
        }
    }

    @Override
    public final void j0(String str) {
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new z20(tg2Var, str, (byte) 1));
        }
    }

    @Override
    public final d93 k0(sk4 sk4Var) {
        fm4 fm4Var = (fm4) sk4Var.c;
        fm4Var.getClass();
        this.i1 = fm4Var;
        d93 k0 = super.k0(sk4Var);
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new nn6(tg2Var, fm4Var, k0, (byte) 13));
        }
        return k0;
    }

    @Override
    public final String l() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final void l0(fm4 fm4Var, MediaFormat mediaFormat) {
        int i;
        boolean z;
        int integer;
        fm4 fm4Var2 = this.j1;
        boolean z2 = true;
        im5 im5Var = null;
        if (fm4Var2 != null) {
            fm4Var = fm4Var2;
        } else if (this.c0 != null) {
            mediaFormat.getClass();
            String str = fm4Var.t;
            int i2 = fm4Var.N;
            if ("audio/raw".equals(str)) {
                i = fm4Var.Q;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = g8c.F(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i = 2;
            }
            int integer2 = mediaFormat.getInteger("channel-count");
            int i3 = fm4Var.O;
            if (i3 == -1 || i2 != integer2) {
                i3 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i3 = integer;
            }
            em4 em4Var = new em4();
            em4Var.s = ud7.n("audio/raw");
            em4Var.P = i;
            em4Var.Q = fm4Var.R;
            em4Var.R = fm4Var.S;
            em4Var.l = fm4Var.m;
            em4Var.a = fm4Var.a;
            em4Var.b = fm4Var.b;
            em4Var.c = mm5.q(fm4Var.c);
            em4Var.d = fm4Var.d;
            em4Var.e = fm4Var.e;
            em4Var.f = fm4Var.f;
            em4Var.M = integer2;
            em4Var.N = i3;
            em4Var.O = mediaFormat.getInteger("sample-rate");
            fm4Var = new fm4(em4Var);
            boolean z3 = this.g1;
            int i4 = fm4Var.N;
            if (z3 && i4 == 6 && i2 < 6) {
                if (i2 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                gre.c(i2, "Invalid initialCapacity: %s", z);
                int[] iArr = new int[i2];
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + 1;
                    if (i7 > iArr.length) {
                        int length = iArr.length;
                        if (i7 >= 0) {
                            int i8 = length + (length >> 1) + 1;
                            if (i8 < i7) {
                                i8 = Integer.highestOneBit(i6) << 1;
                            }
                            if (i8 < 0) {
                                i8 = Integer.MAX_VALUE;
                            }
                            iArr = Arrays.copyOf(iArr, i8);
                        } else {
                            fi7.g("cannot store more than MAX_VALUE elements");
                            return;
                        }
                    }
                    int[] iArr2 = iArr;
                    iArr[i6] = i5;
                    i5++;
                    i6 = i7;
                    iArr = iArr2;
                }
                im5Var = i6 == 0 ? im5.c : new im5(iArr, i6);
            } else if (this.h1) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        if (i4 != 6) {
                            if (i4 != 7) {
                                if (i4 != 8) {
                                    im5 im5Var2 = zjc.a;
                                } else {
                                    im5Var = zjc.e;
                                }
                            } else {
                                im5Var = zjc.d;
                            }
                        } else {
                            im5Var = zjc.c;
                        }
                    } else {
                        im5Var = zjc.b;
                    }
                } else {
                    im5Var = zjc.a;
                }
            }
        }
        try {
            int i9 = Build.VERSION.SDK_INT;
            x30 x30Var = this.c1;
            if (i9 >= 29) {
                if (this.x0) {
                    d79 d79Var = this.d;
                    d79Var.getClass();
                    if (d79Var.a != 0) {
                        d79 d79Var2 = this.d;
                        d79Var2.getClass();
                        byte b = d79Var2.a;
                        q93 q93Var = (q93) x30Var;
                        if (i9 < 29) {
                            z2 = false;
                        }
                        gre.p(z2);
                        q93Var.i = b;
                    }
                }
                q93 q93Var2 = (q93) x30Var;
                if (i9 < 29) {
                    z2 = false;
                }
                gre.p(z2);
                q93Var2.i = (byte) 0;
            }
            c5a c5aVar = new c5a(fm4Var);
            c5aVar.c = im5Var;
            c5aVar.d = this.G;
            c5aVar.e = this.H;
            ((q93) x30Var).c(c5aVar.e());
            G0(this.d0);
        } catch (s30 e) {
            throw e(e, e.a, false, 5001);
        }
    }

    @Override
    public final void m0(long j) {
        ((q93) this.c1).J = j;
    }

    @Override
    public final boolean n() {
        if (this.K0) {
            q93 q93Var = (q93) this.c1;
            if (q93Var.p()) {
                if (q93Var.O && !q93Var.n()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean o() {
        if (((q93) this.c1).n()) {
            this.s1 = -9223372036854775807L;
            this.t1 = true;
            return true;
        } else if (this.t1 && this.q1 && p() && !m()) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.s1;
            if (j == -9223372036854775807L) {
                this.s1 = elapsedRealtime;
                return true;
            } else if (elapsedRealtime - j < 100) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public final void o0() {
        ((q93) this.c1).G = true;
    }

    @Override
    public final void q() {
        tg2 tg2Var = this.b1;
        this.m1 = true;
        this.i1 = null;
        this.r1 = -9223372036854775807L;
        this.o1 = false;
        try {
            ((q93) this.c1).f();
            super.q();
        } finally {
            tg2Var.u(this.O0);
        }
    }

    @Override
    public final void r(boolean z, boolean z2) {
        ?? obj = new Object();
        this.O0 = obj;
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new k30(tg2Var, obj, (byte) 1));
        }
        d79 d79Var = this.d;
        d79Var.getClass();
        boolean z3 = d79Var.b;
        x30 x30Var = this.c1;
        if (z3) {
            q93 q93Var = (q93) x30Var;
            gre.p(q93Var.S);
            if (!q93Var.Y) {
                q93Var.Y = true;
                q93Var.v();
            }
        } else {
            q93 q93Var2 = (q93) x30Var;
            if (q93Var2.Y) {
                q93Var2.Y = false;
                q93Var2.v();
            }
        }
        uc8 uc8Var = this.f;
        uc8Var.getClass();
        q93 q93Var3 = (q93) x30Var;
        q93Var3.m = uc8Var;
        adb adbVar = this.h;
        adbVar.getClass();
        ((l40) q93Var3.r).f = adbVar;
        q93Var3.n = new z24(this, (byte) 16);
    }

    @Override
    public final boolean r0(long j, long j2, ek6 ek6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, fm4 fm4Var) {
        fk6 fk6Var;
        int i4;
        int i5;
        byteBuffer.getClass();
        this.r1 = -9223372036854775807L;
        if (this.j1 != null && (i2 & 2) != 0) {
            ek6Var.getClass();
            ek6Var.c(i);
            return true;
        } else if (z) {
            if (ek6Var != null) {
                ek6Var.c(i);
            }
            this.O0.f += i3;
            ((q93) this.c1).G = true;
            return true;
        } else {
            try {
                try {
                    fk6Var = this;
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    ho9.n(e2);
                    return false;
                }
            } catch (t30 e3) {
                e = e3;
                fk6Var = this;
            } catch (w30 e4) {
                e = e4;
                fk6Var = this;
            }
            try {
                bf bfVar = new bf(fk6Var, byteBuffer, j3, i3);
                if (ek6Var != null) {
                    ek6Var.i(bfVar);
                } else {
                    bfVar.run();
                }
                if (fk6Var.e1.get()) {
                    if (ek6Var != null) {
                        ek6Var.c(i);
                    }
                    fk6Var.O0.e += i3;
                    return true;
                }
                fk6Var.r1 = j3;
                return false;
            } catch (t30 e5) {
                e = e5;
                t30 t30Var = e;
                fm4 fm4Var2 = fk6Var.i1;
                if (fk6Var.x0) {
                    d79 d79Var = fk6Var.d;
                    d79Var.getClass();
                    if (d79Var.a != 0) {
                        i5 = 5004;
                        throw fk6Var.e(t30Var, fm4Var2, t30Var.a, i5);
                    }
                }
                i5 = 5001;
                throw fk6Var.e(t30Var, fm4Var2, t30Var.a, i5);
            } catch (w30 e6) {
                e = e6;
                w30 w30Var = e;
                if (fk6Var.x0) {
                    d79 d79Var2 = fk6Var.d;
                    d79Var2.getClass();
                    if (d79Var2.a != 0) {
                        i4 = 5003;
                        throw fk6Var.e(w30Var, fm4Var, w30Var.b, i4);
                    }
                }
                i4 = 5002;
                throw fk6Var.e(w30Var, fm4Var, w30Var.b, i4);
            }
        }
    }

    @Override
    public final void s(long j, boolean z, boolean z2) {
        super.s(j, z, z2);
        ((q93) this.c1).f();
        this.k1 = j;
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
        this.n1 = false;
        this.o1 = false;
        this.l1 = true;
    }

    @Override
    public final void t() {
        bg6 bg6Var;
        ((l40) ((q93) this.c1).r).d();
        if (Build.VERSION.SDK_INT >= 35 && (bg6Var = this.d1) != null) {
            bg6Var.b();
        }
    }

    @Override
    public final void u0() {
        int i;
        try {
            ((q93) this.c1).t();
            long j = this.P0.h;
            if (j != -9223372036854775807L) {
                this.r1 = j;
            }
        } catch (w30 e) {
            if (this.x0) {
                i = 5003;
            } else {
                i = 5002;
            }
            throw e(e, e.c, e.b, i);
        }
    }

    @Override
    public final void v() {
        x30 x30Var = this.c1;
        this.n1 = false;
        this.o1 = false;
        this.r1 = -9223372036854775807L;
        try {
            this.x0 = false;
            v0();
            t0();
            ir2.C(this.X, null);
            this.X = null;
        } finally {
            if (this.m1) {
                this.m1 = false;
                ((q93) x30Var).w();
            }
        }
    }

    @Override
    public final void w() {
        ((q93) this.c1).r();
        this.q1 = true;
    }

    @Override
    public final void x() {
        M0();
        this.q1 = false;
        ((q93) this.c1).q();
        this.o1 = false;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    @Override
    public final ck6 k() {
        return this;
    }
}
