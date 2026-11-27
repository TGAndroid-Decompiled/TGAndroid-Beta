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
public class km6 extends qm6 implements hm6 {
    public final Context a1;
    public final lh2 b1;
    public final y30 c1;
    public final fi6 d1;
    public final AtomicBoolean e1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public ko4 i1;
    public ko4 j1;
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

    public km6(Context context, im6 im6Var, Handler handler, n64 n64Var, y30 y30Var) {
        super(context.getApplicationContext(), 1, im6Var);
        fi6 fi6Var;
        if (Build.VERSION.SDK_INT >= 35) {
            fi6Var = new fi6();
        } else {
            fi6Var = null;
        }
        this.a1 = context.getApplicationContext();
        this.c1 = y30Var;
        this.d1 = fi6Var;
        this.p1 = -1000;
        this.b1 = new lh2(handler, n64Var);
        this.e1 = new AtomicBoolean();
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    public static j99 L0(ko4 ko4Var, boolean z, y30 y30Var) {
        nm6 nm6Var;
        if (ko4Var.t == null) {
            no5 no5Var = po5.b;
            return j99.e;
        }
        if (((ja3) y30Var).j(ko4Var) != 0) {
            List e = wm6.e("audio/raw", false, false);
            if (e.isEmpty()) {
                nm6Var = null;
            } else {
                nm6Var = (nm6) e.get(0);
            }
            if (nm6Var != null) {
                return po5.u(nm6Var);
            }
        }
        return wm6.g(ko4Var, z, false);
    }

    @Override
    public final boolean E0(ko4 ko4Var) {
        qa9 qa9Var = this.d;
        qa9Var.getClass();
        if (qa9Var.a != 0) {
            int J0 = J0(ko4Var);
            if ((J0 & 512) != 0) {
                qa9 qa9Var2 = this.d;
                qa9Var2.getClass();
                if (qa9Var2.a == 2 || (J0 & 1024) != 0 || (ko4Var.R == 0 && ko4Var.S == 0)) {
                    return true;
                }
            }
        }
        if (((ja3) this.c1).j(ko4Var) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int F0(defpackage.ko4 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km6.F0(ko4):int");
    }

    public final int J0(ko4 ko4Var) {
        l00 a;
        int i;
        ja3 ja3Var = (ja3) this.c1;
        if (ja3Var.a0) {
            a = l00.d;
        } else {
            p00 b = ((n40) ja3Var.r).b(ja3Var.i(ko4Var));
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

    public final int K0(nm6 nm6Var, ko4 ko4Var) {
        if ("OMX.google.raw.decoder".equals(nm6Var.a) && Build.VERSION.SDK_INT == 23 && !gcc.Q(this.a1)) {
            return -1;
        }
        return ko4Var.u;
    }

    @Override
    public w93 M(nm6 nm6Var, ko4 ko4Var, ko4 ko4Var2, boolean z) {
        byte b;
        w93 b2 = nm6Var.b(ko4Var, ko4Var2);
        int i = b2.e;
        if (this.X == null && E0(ko4Var2)) {
            i |= 32768;
        }
        if (K0(nm6Var, ko4Var2) > this.f1) {
            i |= 64;
        }
        int i2 = i;
        String str = nm6Var.a;
        if (i2 != 0) {
            b = 0;
        } else {
            b = b2.d;
        }
        return new w93(str, ko4Var, ko4Var2, b, i2);
    }

    public final void M0() {
        n();
        long h = ((ja3) this.c1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.l1) {
                h = Math.max(this.k1, h);
            }
            this.k1 = h;
            this.l1 = false;
        }
    }

    @Override
    public final ArrayList W(ko4 ko4Var, boolean z) {
        j99 L0 = L0(ko4Var, z, this.c1);
        HashMap hashMap = wm6.a;
        ArrayList arrayList = new ArrayList(L0);
        Collections.sort(arrayList, new jz0(new rm6(this.a1, ko4Var, (byte) 0), (byte) 4));
        return arrayList;
    }

    @Override
    public final long X(long j, long j2, boolean z) {
        boolean z2;
        float f;
        ja3 ja3Var = (ja3) this.c1;
        if (ja3Var.n() && this.r1 != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.q1) {
            if (z2 || this.K0) {
                return 1000000L;
            }
        } else {
            long g = ja3Var.g();
            if (this.o1 && z2 && g != -9223372036854775807L) {
                float min = (float) Math.min(g, this.r1 - j);
                if (f() != null) {
                    f = f().a;
                } else {
                    f = 1.0f;
                }
                return Math.max(10000L, (min / f) / 2.0f);
            }
        }
        return 10000L;
    }

    @Override
    public final defpackage.fp Z(defpackage.nm6 r17, defpackage.ko4 r18, android.media.MediaCrypto r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km6.Z(nm6, ko4, android.media.MediaCrypto, float):fp");
    }

    @Override
    public final void a0(s93 s93Var) {
        ko4 ko4Var;
        oh2 oh2Var;
        if (Build.VERSION.SDK_INT >= 29 && (ko4Var = s93Var.a) != null && Objects.equals(ko4Var.t, "audio/opus") && this.x0) {
            ByteBuffer byteBuffer = s93Var.f;
            byteBuffer.getClass();
            ko4 ko4Var2 = s93Var.a;
            ko4Var2.getClass();
            int i = ko4Var2.R;
            if (byteBuffer.remaining() == 8) {
                int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                ja3 ja3Var = (ja3) this.c1;
                l40 l40Var = ja3Var.t;
                if (l40Var != null && l40Var.c() && (oh2Var = ja3Var.p) != null && ((s00) oh2Var.e).k) {
                    ja3Var.t.d(i, i2);
                }
            }
        }
    }

    @Override
    public final void c(of8 of8Var) {
        ((ja3) this.c1).C(of8Var);
    }

    @Override
    public final void d(int i, Object obj) {
        of8 of8Var;
        fi6 fi6Var;
        y30 y30Var = this.c1;
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
                                        ((ja3) y30Var).y((t00) obj);
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    ja3 ja3Var = (ja3) y30Var;
                                    if (intValue == 0 || intValue == -1) {
                                        intValue = -1;
                                    }
                                    if (ja3Var.X != intValue) {
                                        ja3Var.X = intValue;
                                        ja3Var.v();
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue2 = ((Integer) obj).intValue();
                                ((ja3) y30Var).z(intValue2);
                                if (Build.VERSION.SDK_INT >= 35 && (fi6Var = this.d1) != null) {
                                    fi6Var.d(intValue2);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            ja3 ja3Var2 = (ja3) y30Var;
                            ja3Var2.y = ((Boolean) obj).booleanValue();
                            if (ja3Var2.E()) {
                                of8Var = of8.d;
                            } else {
                                of8Var = ja3Var2.x;
                            }
                            ia3 ia3Var = new ia3(of8Var, -9223372036854775807L, -9223372036854775807L);
                            if (ja3Var2.p()) {
                                ja3Var2.v = ia3Var;
                                return;
                            } else {
                                ja3Var2.w = ia3Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.p1 = ((Integer) obj).intValue();
                        jm6 jm6Var = this.c0;
                        if (jm6Var != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.p1));
                            jm6Var.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    ja3 ja3Var3 = (ja3) y30Var;
                    ja3Var3.W = audioDeviceInfo;
                    l40 l40Var = ja3Var3.t;
                    if (l40Var != null) {
                        l40Var.a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                va0 va0Var = (va0) obj;
                va0Var.getClass();
                ((ja3) y30Var).A(va0Var);
                return;
            }
            oz ozVar = (oz) obj;
            ozVar.getClass();
            ja3 ja3Var4 = (ja3) y30Var;
            if (!ja3Var4.u.equals(ozVar)) {
                ja3Var4.u = ozVar;
                if (!ja3Var4.Y) {
                    ja3Var4.v();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        ja3 ja3Var5 = (ja3) y30Var;
        if (ja3Var5.K != floatValue) {
            ja3Var5.K = floatValue;
            if (ja3Var5.p()) {
                ja3Var5.t.a.setVolume(ja3Var5.K);
            }
        }
    }

    @Override
    public final of8 f() {
        return ((ja3) this.c1).x;
    }

    @Override
    public final long g() {
        if (this.n == 2) {
            M0();
        }
        return this.k1;
    }

    @Override
    public final void g0(Exception exc) {
        efd.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new k30(lh2Var, exc, (byte) 0));
        }
    }

    @Override
    public final boolean h() {
        boolean z = this.n1;
        this.n1 = false;
        return z;
    }

    @Override
    public final void h0(long j, long j2, String str) {
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new o30(lh2Var, str, j, j2, (byte) 0));
        }
    }

    @Override
    public final void i0(pk2 pk2Var) {
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new a30(lh2Var, pk2Var, (byte) 2));
        }
    }

    @Override
    public final void j0(String str) {
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new a30(lh2Var, str, (byte) 1));
        }
    }

    @Override
    public final w93 k0(ym4 ym4Var) {
        ko4 ko4Var = (ko4) ym4Var.c;
        ko4Var.getClass();
        this.i1 = ko4Var;
        w93 k0 = super.k0(ym4Var);
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new es6(lh2Var, ko4Var, k0, (byte) 13));
        }
        return k0;
    }

    @Override
    public final String l() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final void l0(ko4 ko4Var, MediaFormat mediaFormat) {
        int i;
        boolean z;
        int integer;
        ko4 ko4Var2 = this.j1;
        boolean z2 = true;
        lo5 lo5Var = null;
        if (ko4Var2 != null) {
            ko4Var = ko4Var2;
        } else if (this.c0 != null) {
            mediaFormat.getClass();
            String str = ko4Var.t;
            int i2 = ko4Var.N;
            if ("audio/raw".equals(str)) {
                i = ko4Var.Q;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = gcc.F(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i = 2;
            }
            int integer2 = mediaFormat.getInteger("channel-count");
            int i3 = ko4Var.O;
            if (i3 == -1 || i2 != integer2) {
                i3 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i3 = integer;
            }
            jo4 jo4Var = new jo4();
            jo4Var.s = eg7.n("audio/raw");
            jo4Var.P = i;
            jo4Var.Q = ko4Var.R;
            jo4Var.R = ko4Var.S;
            jo4Var.l = ko4Var.m;
            jo4Var.a = ko4Var.a;
            jo4Var.b = ko4Var.b;
            jo4Var.c = po5.q(ko4Var.c);
            jo4Var.d = ko4Var.d;
            jo4Var.e = ko4Var.e;
            jo4Var.f = ko4Var.f;
            jo4Var.M = integer2;
            jo4Var.N = i3;
            jo4Var.O = mediaFormat.getInteger("sample-rate");
            ko4Var = new ko4(jo4Var);
            boolean z3 = this.g1;
            int i4 = ko4Var.N;
            if (z3 && i4 == 6 && i2 < 6) {
                if (i2 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                yve.c(i2, "Invalid initialCapacity: %s", z);
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
                            hz6.e("cannot store more than MAX_VALUE elements");
                            return;
                        }
                    }
                    int[] iArr2 = iArr;
                    iArr[i6] = i5;
                    i5++;
                    i6 = i7;
                    iArr = iArr2;
                }
                lo5Var = i6 == 0 ? lo5.c : new lo5(iArr, i6);
            } else if (this.h1) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        if (i4 != 6) {
                            if (i4 != 7) {
                                if (i4 != 8) {
                                    lo5 lo5Var2 = moc.a;
                                } else {
                                    lo5Var = moc.e;
                                }
                            } else {
                                lo5Var = moc.d;
                            }
                        } else {
                            lo5Var = moc.c;
                        }
                    } else {
                        lo5Var = moc.b;
                    }
                } else {
                    lo5Var = moc.a;
                }
            }
        }
        try {
            int i9 = Build.VERSION.SDK_INT;
            y30 y30Var = this.c1;
            if (i9 >= 29) {
                if (this.x0) {
                    qa9 qa9Var = this.d;
                    qa9Var.getClass();
                    if (qa9Var.a != 0) {
                        qa9 qa9Var2 = this.d;
                        qa9Var2.getClass();
                        byte b = qa9Var2.a;
                        ja3 ja3Var = (ja3) y30Var;
                        if (i9 < 29) {
                            z2 = false;
                        }
                        yve.p(z2);
                        ja3Var.i = b;
                    }
                }
                ja3 ja3Var2 = (ja3) y30Var;
                if (i9 < 29) {
                    z2 = false;
                }
                yve.p(z2);
                ja3Var2.i = (byte) 0;
            }
            u8a u8aVar = new u8a(ko4Var);
            u8aVar.b = lo5Var;
            u8aVar.c = this.G;
            u8aVar.d = this.H;
            ((ja3) y30Var).c(u8aVar.h());
            G0(this.d0);
        } catch (t30 e) {
            throw e(e, e.a, false, 5001);
        }
    }

    @Override
    public final void m0(long j) {
        ((ja3) this.c1).J = j;
    }

    @Override
    public final boolean n() {
        if (this.K0) {
            ja3 ja3Var = (ja3) this.c1;
            if (ja3Var.p()) {
                if (ja3Var.O && !ja3Var.n()) {
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
        if (((ja3) this.c1).n()) {
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
        ((ja3) this.c1).G = true;
    }

    @Override
    public final void q() {
        lh2 lh2Var = this.b1;
        this.m1 = true;
        this.i1 = null;
        this.r1 = -9223372036854775807L;
        this.o1 = false;
        try {
            ((ja3) this.c1).f();
            super.q();
        } finally {
            lh2Var.l(this.O0);
        }
    }

    @Override
    public final void r(boolean z, boolean z2) {
        ?? obj = new Object();
        this.O0 = obj;
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new l30(lh2Var, obj, (byte) 1));
        }
        qa9 qa9Var = this.d;
        qa9Var.getClass();
        boolean z3 = qa9Var.b;
        y30 y30Var = this.c1;
        if (z3) {
            ja3 ja3Var = (ja3) y30Var;
            yve.p(ja3Var.S);
            if (!ja3Var.Y) {
                ja3Var.Y = true;
                ja3Var.v();
            }
        } else {
            ja3 ja3Var2 = (ja3) y30Var;
            if (ja3Var2.Y) {
                ja3Var2.Y = false;
                ja3Var2.v();
            }
        }
        ig8 ig8Var = this.f;
        ig8Var.getClass();
        ja3 ja3Var3 = (ja3) y30Var;
        ja3Var3.m = ig8Var;
        vgb vgbVar = this.h;
        vgbVar.getClass();
        ((n40) ja3Var3.r).f = vgbVar;
        ja3Var3.n = new xh4(this, (byte) 13);
    }

    @Override
    public final boolean r0(long j, long j2, jm6 jm6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ko4 ko4Var) {
        km6 km6Var;
        int i4;
        int i5;
        byteBuffer.getClass();
        this.r1 = -9223372036854775807L;
        if (this.j1 != null && (i2 & 2) != 0) {
            jm6Var.getClass();
            jm6Var.c(i);
            return true;
        } else if (z) {
            if (jm6Var != null) {
                jm6Var.c(i);
            }
            this.O0.f += i3;
            ((ja3) this.c1).G = true;
            return true;
        } else {
            try {
                try {
                    km6Var = this;
                    try {
                        ff ffVar = new ff(km6Var, byteBuffer, j3, i3);
                        if (jm6Var != null) {
                            jm6Var.i(ffVar);
                        } else {
                            ffVar.run();
                        }
                        if (km6Var.e1.get()) {
                            if (jm6Var != null) {
                                jm6Var.c(i);
                            }
                            km6Var.O0.e += i3;
                            return true;
                        }
                        km6Var.r1 = j3;
                        return false;
                    } catch (u30 e) {
                        e = e;
                        u30 u30Var = e;
                        ko4 ko4Var2 = km6Var.i1;
                        if (km6Var.x0) {
                            qa9 qa9Var = km6Var.d;
                            qa9Var.getClass();
                            if (qa9Var.a != 0) {
                                i5 = 5004;
                                throw km6Var.e(u30Var, ko4Var2, u30Var.a, i5);
                            }
                        }
                        i5 = 5001;
                        throw km6Var.e(u30Var, ko4Var2, u30Var.a, i5);
                    } catch (x30 e2) {
                        e = e2;
                        x30 x30Var = e;
                        if (km6Var.x0) {
                            qa9 qa9Var2 = km6Var.d;
                            qa9Var2.getClass();
                            if (qa9Var2.a != 0) {
                                i4 = 5003;
                                throw km6Var.e(x30Var, ko4Var, x30Var.b, i4);
                            }
                        }
                        i4 = 5002;
                        throw km6Var.e(x30Var, ko4Var, x30Var.b, i4);
                    }
                } catch (u30 e3) {
                    e = e3;
                    km6Var = this;
                } catch (x30 e4) {
                    e = e4;
                    km6Var = this;
                }
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception e6) {
                vr9.l(e6);
                return false;
            }
        }
    }

    @Override
    public final void s(long j, boolean z, boolean z2) {
        super.s(j, z, z2);
        ((ja3) this.c1).f();
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
        fi6 fi6Var;
        ((n40) ((ja3) this.c1).r).d();
        if (Build.VERSION.SDK_INT >= 35 && (fi6Var = this.d1) != null) {
            fi6Var.b();
        }
    }

    @Override
    public final void u0() {
        int i;
        try {
            ((ja3) this.c1).t();
            long j = this.P0.h;
            if (j != -9223372036854775807L) {
                this.r1 = j;
            }
        } catch (x30 e) {
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
        y30 y30Var = this.c1;
        this.n1 = false;
        this.o1 = false;
        this.r1 = -9223372036854775807L;
        try {
            this.x0 = false;
            v0();
            t0();
            bs2.C(this.X, null);
            this.X = null;
        } finally {
            if (this.m1) {
                this.m1 = false;
                ((ja3) y30Var).w();
            }
        }
    }

    @Override
    public final void w() {
        ((ja3) this.c1).r();
        this.q1 = true;
    }

    @Override
    public final void x() {
        M0();
        this.q1 = false;
        ((ja3) this.c1).q();
        this.o1 = false;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    @Override
    public final hm6 k() {
        return this;
    }
}
