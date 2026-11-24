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
public class im6 extends om6 implements fm6 {
    public final Context a1;
    public final lx6 b1;
    public final x40 c1;
    public final bi6 d1;
    public final AtomicBoolean e1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public go4 i1;
    public go4 j1;
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

    public im6(Context context, gm6 gm6Var, Handler handler, c74 c74Var, x40 x40Var) {
        super(context.getApplicationContext(), 1, gm6Var);
        bi6 bi6Var;
        if (Build.VERSION.SDK_INT >= 35) {
            bi6Var = new bi6();
        } else {
            bi6Var = null;
        }
        this.a1 = context.getApplicationContext();
        this.c1 = x40Var;
        this.d1 = bi6Var;
        this.p1 = -1000;
        this.b1 = new lx6(handler, c74Var);
        this.e1 = new AtomicBoolean();
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    public static y79 L0(go4 go4Var, boolean z, x40 x40Var) {
        lm6 lm6Var;
        if (go4Var.t == null) {
            ko5 ko5Var = mo5.b;
            return y79.e;
        }
        if (((cb3) x40Var).j(go4Var) != 0) {
            List e = tm6.e("audio/raw", false, false);
            if (e.isEmpty()) {
                lm6Var = null;
            } else {
                lm6Var = (lm6) e.get(0);
            }
            if (lm6Var != null) {
                return mo5.u(lm6Var);
            }
        }
        return tm6.g(go4Var, z, false);
    }

    @Override
    public final boolean E0(go4 go4Var) {
        f99 f99Var = this.d;
        f99Var.getClass();
        if (f99Var.a != 0) {
            int J0 = J0(go4Var);
            if ((J0 & 512) != 0) {
                f99 f99Var2 = this.d;
                f99Var2.getClass();
                if (f99Var2.a == 2 || (J0 & 1024) != 0 || (go4Var.R == 0 && go4Var.S == 0)) {
                    return true;
                }
            }
        }
        if (((cb3) this.c1).j(go4Var) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int F0(defpackage.go4 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im6.F0(go4):int");
    }

    public final int J0(go4 go4Var) {
        k10 a;
        int i;
        cb3 cb3Var = (cb3) this.c1;
        if (cb3Var.a0) {
            a = k10.d;
        } else {
            o10 b = ((l50) cb3Var.r).b(cb3Var.i(go4Var));
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

    public final int K0(lm6 lm6Var, go4 go4Var) {
        if ("OMX.google.raw.decoder".equals(lm6Var.a) && Build.VERSION.SDK_INT == 23 && !hac.Q(this.a1)) {
            return -1;
        }
        return go4Var.u;
    }

    @Override
    public pa3 M(lm6 lm6Var, go4 go4Var, go4 go4Var2, boolean z) {
        byte b;
        pa3 b2 = lm6Var.b(go4Var, go4Var2);
        int i = b2.e;
        if (this.X == null && E0(go4Var2)) {
            i |= 32768;
        }
        if (K0(lm6Var, go4Var2) > this.f1) {
            i |= 64;
        }
        int i2 = i;
        String str = lm6Var.a;
        if (i2 != 0) {
            b = 0;
        } else {
            b = b2.d;
        }
        return new pa3(str, go4Var, go4Var2, b, i2);
    }

    public final void M0() {
        n();
        long h = ((cb3) this.c1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.l1) {
                h = Math.max(this.k1, h);
            }
            this.k1 = h;
            this.l1 = false;
        }
    }

    @Override
    public final ArrayList W(go4 go4Var, boolean z) {
        y79 L0 = L0(go4Var, z, this.c1);
        HashMap hashMap = tm6.a;
        ArrayList arrayList = new ArrayList(L0);
        Collections.sort(arrayList, new i01(new nv4(this.a1, go4Var, (byte) 26), (byte) 4));
        return arrayList;
    }

    @Override
    public final long X(long j, long j2, boolean z) {
        boolean z2;
        float f;
        cb3 cb3Var = (cb3) this.c1;
        if (cb3Var.n() && this.r1 != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.q1) {
            if (z2 || this.K0) {
                return 1000000L;
            }
        } else {
            long g = cb3Var.g();
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
    public final defpackage.eq Z(defpackage.lm6 r17, defpackage.go4 r18, android.media.MediaCrypto r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im6.Z(lm6, go4, android.media.MediaCrypto, float):eq");
    }

    @Override
    public final void a0(la3 la3Var) {
        go4 go4Var;
        ki2 ki2Var;
        if (Build.VERSION.SDK_INT >= 29 && (go4Var = la3Var.a) != null && Objects.equals(go4Var.t, "audio/opus") && this.x0) {
            ByteBuffer byteBuffer = la3Var.f;
            byteBuffer.getClass();
            go4 go4Var2 = la3Var.a;
            go4Var2.getClass();
            int i = go4Var2.R;
            if (byteBuffer.remaining() == 8) {
                int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                cb3 cb3Var = (cb3) this.c1;
                j50 j50Var = cb3Var.t;
                if (j50Var != null && j50Var.c() && (ki2Var = cb3Var.p) != null && ((r10) ki2Var.e).k) {
                    cb3Var.t.d(i, i2);
                }
            }
        }
    }

    @Override
    public final void b(ce8 ce8Var) {
        ((cb3) this.c1).C(ce8Var);
    }

    @Override
    public final void d(int i, Object obj) {
        ce8 ce8Var;
        bi6 bi6Var;
        x40 x40Var = this.c1;
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
                                        ((cb3) x40Var).y((s10) obj);
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    cb3 cb3Var = (cb3) x40Var;
                                    if (intValue == 0 || intValue == -1) {
                                        intValue = -1;
                                    }
                                    if (cb3Var.X != intValue) {
                                        cb3Var.X = intValue;
                                        cb3Var.v();
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue2 = ((Integer) obj).intValue();
                                ((cb3) x40Var).z(intValue2);
                                if (Build.VERSION.SDK_INT >= 35 && (bi6Var = this.d1) != null) {
                                    bi6Var.d(intValue2);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            cb3 cb3Var2 = (cb3) x40Var;
                            cb3Var2.y = ((Boolean) obj).booleanValue();
                            if (cb3Var2.E()) {
                                ce8Var = ce8.d;
                            } else {
                                ce8Var = cb3Var2.x;
                            }
                            bb3 bb3Var = new bb3(ce8Var, -9223372036854775807L, -9223372036854775807L);
                            if (cb3Var2.p()) {
                                cb3Var2.v = bb3Var;
                                return;
                            } else {
                                cb3Var2.w = bb3Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.p1 = ((Integer) obj).intValue();
                        hm6 hm6Var = this.c0;
                        if (hm6Var != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.p1));
                            hm6Var.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    cb3 cb3Var3 = (cb3) x40Var;
                    cb3Var3.W = audioDeviceInfo;
                    j50 j50Var = cb3Var3.t;
                    if (j50Var != null) {
                        j50Var.a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                tb0 tb0Var = (tb0) obj;
                tb0Var.getClass();
                ((cb3) x40Var).A(tb0Var);
                return;
            }
            o00 o00Var = (o00) obj;
            o00Var.getClass();
            cb3 cb3Var4 = (cb3) x40Var;
            if (!cb3Var4.u.equals(o00Var)) {
                cb3Var4.u = o00Var;
                if (!cb3Var4.Y) {
                    cb3Var4.v();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        cb3 cb3Var5 = (cb3) x40Var;
        if (cb3Var5.K != floatValue) {
            cb3Var5.K = floatValue;
            if (cb3Var5.p()) {
                cb3Var5.t.a.setVolume(cb3Var5.K);
            }
        }
    }

    @Override
    public final ce8 g() {
        return ((cb3) this.c1).x;
    }

    @Override
    public final void g0(Exception exc) {
        ncd.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new j40(lx6Var, exc, (byte) 0));
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
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new n40(lx6Var, str, j, j2, (byte) 0));
        }
    }

    @Override
    public final boolean i() {
        boolean z = this.n1;
        this.n1 = false;
        return z;
    }

    @Override
    public final void i0(hl2 hl2Var) {
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new x30(lx6Var, hl2Var, (byte) 3));
        }
    }

    @Override
    public final void j0(String str) {
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new x30(lx6Var, str, (byte) 2));
        }
    }

    @Override
    public final pa3 k0(mj4 mj4Var) {
        go4 go4Var = (go4) mj4Var.c;
        go4Var.getClass();
        this.i1 = go4Var;
        pa3 k0 = super.k0(mj4Var);
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new op6(lx6Var, go4Var, k0, (byte) 13));
        }
        return k0;
    }

    @Override
    public final String l() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final void l0(go4 go4Var, MediaFormat mediaFormat) {
        int i;
        boolean z;
        int integer;
        go4 go4Var2 = this.j1;
        boolean z2 = true;
        io5 io5Var = null;
        if (go4Var2 != null) {
            go4Var = go4Var2;
        } else if (this.c0 != null) {
            mediaFormat.getClass();
            String str = go4Var.t;
            int i2 = go4Var.N;
            if ("audio/raw".equals(str)) {
                i = go4Var.Q;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = hac.F(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i = 2;
            }
            int integer2 = mediaFormat.getInteger("channel-count");
            int i3 = go4Var.O;
            if (i3 == -1 || i2 != integer2) {
                i3 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i3 = integer;
            }
            fo4 fo4Var = new fo4();
            fo4Var.s = wf7.n("audio/raw");
            fo4Var.P = i;
            fo4Var.Q = go4Var.R;
            fo4Var.R = go4Var.S;
            fo4Var.l = go4Var.m;
            fo4Var.a = go4Var.a;
            fo4Var.b = go4Var.b;
            fo4Var.c = mo5.q(go4Var.c);
            fo4Var.d = go4Var.d;
            fo4Var.e = go4Var.e;
            fo4Var.f = go4Var.f;
            fo4Var.M = integer2;
            fo4Var.N = i3;
            fo4Var.O = mediaFormat.getInteger("sample-rate");
            go4Var = new go4(fo4Var);
            boolean z3 = this.g1;
            int i4 = go4Var.N;
            if (z3 && i4 == 6 && i2 < 6) {
                if (i2 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                jte.c(i2, "Invalid initialCapacity: %s", z);
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
                            bh7.j("cannot store more than MAX_VALUE elements");
                            return;
                        }
                    }
                    int[] iArr2 = iArr;
                    iArr[i6] = i5;
                    i5++;
                    i6 = i7;
                    iArr = iArr2;
                }
                io5Var = i6 == 0 ? io5.c : new io5(iArr, i6);
            } else if (this.h1) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        if (i4 != 6) {
                            if (i4 != 7) {
                                if (i4 != 8) {
                                    io5 io5Var2 = zlc.a;
                                } else {
                                    io5Var = zlc.e;
                                }
                            } else {
                                io5Var = zlc.d;
                            }
                        } else {
                            io5Var = zlc.c;
                        }
                    } else {
                        io5Var = zlc.b;
                    }
                } else {
                    io5Var = zlc.a;
                }
            }
        }
        try {
            int i9 = Build.VERSION.SDK_INT;
            x40 x40Var = this.c1;
            if (i9 >= 29) {
                if (this.x0) {
                    f99 f99Var = this.d;
                    f99Var.getClass();
                    if (f99Var.a != 0) {
                        f99 f99Var2 = this.d;
                        f99Var2.getClass();
                        byte b = f99Var2.a;
                        cb3 cb3Var = (cb3) x40Var;
                        if (i9 < 29) {
                            z2 = false;
                        }
                        jte.p(z2);
                        cb3Var.i = b;
                    }
                }
                cb3 cb3Var2 = (cb3) x40Var;
                if (i9 < 29) {
                    z2 = false;
                }
                jte.p(z2);
                cb3Var2.i = (byte) 0;
            }
            e7a e7aVar = new e7a(go4Var);
            e7aVar.b = io5Var;
            e7aVar.c = this.G;
            e7aVar.d = this.H;
            ((cb3) x40Var).c(e7aVar.k());
            G0(this.d0);
        } catch (s40 e) {
            throw e(e, e.a, false, 5001);
        }
    }

    @Override
    public final void m0(long j) {
        ((cb3) this.c1).J = j;
    }

    @Override
    public final boolean n() {
        if (this.K0) {
            cb3 cb3Var = (cb3) this.c1;
            if (cb3Var.p()) {
                if (cb3Var.O && !cb3Var.n()) {
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
        if (((cb3) this.c1).n()) {
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
        ((cb3) this.c1).G = true;
    }

    @Override
    public final void q() {
        lx6 lx6Var = this.b1;
        this.m1 = true;
        this.i1 = null;
        this.r1 = -9223372036854775807L;
        this.o1 = false;
        try {
            ((cb3) this.c1).f();
            super.q();
        } finally {
            lx6Var.o(this.O0);
        }
    }

    @Override
    public final void r(boolean z, boolean z2) {
        ?? obj = new Object();
        this.O0 = obj;
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new k40(lx6Var, obj, (byte) 1));
        }
        f99 f99Var = this.d;
        f99Var.getClass();
        boolean z3 = f99Var.b;
        x40 x40Var = this.c1;
        if (z3) {
            cb3 cb3Var = (cb3) x40Var;
            jte.p(cb3Var.S);
            if (!cb3Var.Y) {
                cb3Var.Y = true;
                cb3Var.v();
            }
        } else {
            cb3 cb3Var2 = (cb3) x40Var;
            if (cb3Var2.Y) {
                cb3Var2.Y = false;
                cb3Var2.v();
            }
        }
        we8 we8Var = this.f;
        we8Var.getClass();
        cb3 cb3Var3 = (cb3) x40Var;
        cb3Var3.m = we8Var;
        bfb bfbVar = this.h;
        bfbVar.getClass();
        ((l50) cb3Var3.r).f = bfbVar;
        cb3Var3.n = new ai4(this, (byte) 13);
    }

    @Override
    public final boolean r0(long j, long j2, hm6 hm6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, go4 go4Var) {
        im6 im6Var;
        int i4;
        int i5;
        byteBuffer.getClass();
        this.r1 = -9223372036854775807L;
        if (this.j1 != null && (i2 & 2) != 0) {
            hm6Var.getClass();
            hm6Var.c(i);
            return true;
        } else if (z) {
            if (hm6Var != null) {
                hm6Var.c(i);
            }
            this.O0.f += i3;
            ((cb3) this.c1).G = true;
            return true;
        } else {
            try {
                try {
                    im6Var = this;
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    dq9.o(e2);
                    return false;
                }
            } catch (t40 e3) {
                e = e3;
                im6Var = this;
            } catch (w40 e4) {
                e = e4;
                im6Var = this;
            }
            try {
                cg cgVar = new cg(im6Var, byteBuffer, j3, i3);
                if (hm6Var != null) {
                    hm6Var.i(cgVar);
                } else {
                    cgVar.run();
                }
                if (im6Var.e1.get()) {
                    if (hm6Var != null) {
                        hm6Var.c(i);
                    }
                    im6Var.O0.e += i3;
                    return true;
                }
                im6Var.r1 = j3;
                return false;
            } catch (t40 e5) {
                e = e5;
                t40 t40Var = e;
                go4 go4Var2 = im6Var.i1;
                if (im6Var.x0) {
                    f99 f99Var = im6Var.d;
                    f99Var.getClass();
                    if (f99Var.a != 0) {
                        i5 = 5004;
                        throw im6Var.e(t40Var, go4Var2, t40Var.a, i5);
                    }
                }
                i5 = 5001;
                throw im6Var.e(t40Var, go4Var2, t40Var.a, i5);
            } catch (w40 e6) {
                e = e6;
                w40 w40Var = e;
                if (im6Var.x0) {
                    f99 f99Var2 = im6Var.d;
                    f99Var2.getClass();
                    if (f99Var2.a != 0) {
                        i4 = 5003;
                        throw im6Var.e(w40Var, go4Var, w40Var.b, i4);
                    }
                }
                i4 = 5002;
                throw im6Var.e(w40Var, go4Var, w40Var.b, i4);
            }
        }
    }

    @Override
    public final void s(long j, boolean z, boolean z2) {
        super.s(j, z, z2);
        ((cb3) this.c1).f();
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
        bi6 bi6Var;
        ((l50) ((cb3) this.c1).r).d();
        if (Build.VERSION.SDK_INT >= 35 && (bi6Var = this.d1) != null) {
            bi6Var.b();
        }
    }

    @Override
    public final void u0() {
        int i;
        try {
            ((cb3) this.c1).t();
            long j = this.P0.h;
            if (j != -9223372036854775807L) {
                this.r1 = j;
            }
        } catch (w40 e) {
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
        x40 x40Var = this.c1;
        this.n1 = false;
        this.o1 = false;
        this.r1 = -9223372036854775807L;
        try {
            this.x0 = false;
            v0();
            t0();
            ts2.B(this.X, null);
            this.X = null;
        } finally {
            if (this.m1) {
                this.m1 = false;
                ((cb3) x40Var).w();
            }
        }
    }

    @Override
    public final void w() {
        ((cb3) this.c1).r();
        this.q1 = true;
    }

    @Override
    public final void x() {
        M0();
        this.q1 = false;
        ((cb3) this.c1).q();
        this.o1 = false;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    @Override
    public final fm6 k() {
        return this;
    }
}
