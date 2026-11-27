package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
public final class vg5 extends fm6 {
    public static final AtomicInteger d0 = new AtomicInteger();
    public final boolean E;
    public final int F;
    public final h73 G;
    public final n73 H;
    public final q31 I;
    public final boolean J;
    public final boolean K;
    public final usb L;
    public final ib3 M;
    public final List N;
    public final hr3 O;
    public final vl5 P;
    public final ey7 Q;
    public final boolean R;
    public final boolean S;
    public q31 T;
    public vh5 U;
    public int V;
    public boolean W;
    public volatile boolean X;
    public boolean Y;
    public j99 Z;
    public boolean a0;
    public long b0;
    public boolean c0;
    public final int w;
    public final int x;
    public final Uri y;

    public vg5(ib3 ib3Var, h73 h73Var, n73 n73Var, ko4 ko4Var, boolean z, h73 h73Var2, n73 n73Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, usb usbVar, hr3 hr3Var, q31 q31Var, vl5 vl5Var, ey7 ey7Var, boolean z6, boolean z7, ig8 ig8Var, String str) {
        super(h73Var, n73Var, ko4Var, i, obj, j, j2, j3, str);
        this.R = z;
        this.F = i2;
        this.b0 = z3 ? j2 - j : -9223372036854775807L;
        this.x = i3;
        this.H = n73Var2;
        this.G = h73Var2;
        this.W = n73Var2 != null;
        this.S = z2;
        this.y = uri;
        this.J = z5;
        this.L = usbVar;
        this.K = z4;
        this.M = ib3Var;
        this.N = list;
        this.O = hr3Var;
        this.I = q31Var;
        this.P = vl5Var;
        this.Q = ey7Var;
        this.c0 = z6;
        this.E = z7;
        no5 no5Var = po5.b;
        this.Z = j99.e;
        this.w = d0.getAndIncrement();
    }

    public static byte[] f(String str) {
        int i;
        if (jrd.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i = byteArray.length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr, (16 - byteArray.length) + i, byteArray.length - i);
        return bArr;
    }

    @Override
    public final void a() {
        q31 q31Var;
        this.U.getClass();
        if (this.T == null && (q31Var = this.I) != null) {
            e84 a = ((e84) q31Var.b).a();
            if ((a instanceof j6c) || (a instanceof hr4)) {
                this.T = this.I;
                this.W = false;
            }
        }
        n73 n73Var = this.H;
        h73 h73Var = this.G;
        if (this.W) {
            h73Var.getClass();
            n73Var.getClass();
            e(h73Var, n73Var, this.S);
            this.V = 0;
            this.W = false;
        }
        if (!this.X) {
            if (!this.K) {
                e(this.r, this.b, this.R);
            }
            this.Y = !this.X;
        }
    }

    @Override
    public final void c() {
        this.X = true;
    }

    public final void e(h73 h73Var, n73 n73Var, boolean z) {
        n73 b;
        boolean z2;
        boolean z3;
        int i = this.V;
        if (z) {
            if (i != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = z3;
            b = n73Var;
        } else {
            b = n73Var.b(i);
            z2 = false;
        }
        try {
            cb3 i2 = i(h73Var, b);
            if (z2) {
                i2.l(this.V, false);
            }
            do {
                try {
                    if (this.X) {
                        break;
                    }
                } catch (EOFException e) {
                    if ((this.d.f & 16384) != 0) {
                        ((e84) this.T.b).d(0L, 0L);
                    } else {
                        long j = n73Var.f;
                        if (j != -1 && i2.d >= n73Var.e + j) {
                            throw hy7.a(null, e);
                        }
                        throw e;
                    }
                }
            } while (((e84) this.T.b).b(i2, q31.f) == 0);
            this.V = (int) (i2.d - n73Var.e);
        } catch (Exception unused) {
        } catch (Throwable th) {
            lge.a(h73Var);
            throw th;
        }
        lge.a(h73Var);
    }

    public final int g(int i) {
        yve.p(!this.c0);
        j99 j99Var = this.Z;
        if (i >= j99Var.d) {
            return 0;
        }
        return ((Integer) j99Var.get(i)).intValue();
    }

    public final boolean h() {
        if (this.b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final defpackage.cb3 i(defpackage.h73 r33, defpackage.n73 r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg5.i(h73, n73):cb3");
    }
}
