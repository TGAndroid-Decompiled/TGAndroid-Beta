package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.ui.Components.AnimatedFileNative;
public final class jm implements Runnable {
    public final byte a;
    public final lm b;

    public jm(lm lmVar, byte b) {
        this.a = b;
        this.b = lmVar;
    }

    @Override
    public final void run() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        View view = null;
        switch (this.a) {
            case 0:
                this.b.i();
                return;
            case 1:
                lm lmVar = this.b;
                if (lmVar.E0 != null) {
                    ek0.c();
                    lmVar.E0 = null;
                }
                lmVar.D0 = false;
                lmVar.k();
                lmVar.x(false);
                return;
            case 2:
                this.b.t();
                return;
            case 3:
                return;
            case 4:
                lm lmVar2 = this.b;
                lmVar2.k();
                lmVar2.e = null;
                if (lmVar2.N >= 0 && lmVar2.M == -1) {
                    lmVar2.N = -1L;
                }
                lmVar2.x(false);
                lmVar2.t();
                return;
            case 5:
                lm lmVar3 = this.b;
                if (!lmVar3.d0 && !lmVar3.x && !lmVar3.D0 && lmVar3.E0 == null) {
                    lmVar3.h0 = (float) System.currentTimeMillis();
                    if (b29.U0 == null) {
                        b29.U0 = new uo3("cache generator queue", true);
                    }
                    lmVar3.D0 = true;
                    lmVar3.e = null;
                    ek0.A++;
                    uo3 uo3Var = b29.U0;
                    jm jmVar = new jm(lmVar3, (byte) 9);
                    lmVar3.E0 = jmVar;
                    uo3Var.postRunnable(jmVar);
                    return;
                }
                return;
            case 6:
                lm lmVar4 = this.b;
                lmVar4.k();
                if (lmVar4.v0 != null && lmVar4.O) {
                    xb4.G(lmVar4.K).Z(lmVar4.v0.c, false, false);
                }
                int i2 = lmVar4.P;
                if (i2 <= 0) {
                    lmVar4.O = true;
                } else {
                    lmVar4.P = i2 - 1;
                }
                if (!lmVar4.G) {
                    lmVar4.F = true;
                } else {
                    lmVar4.G = false;
                }
                lmVar4.e = null;
                if (lmVar4.N >= 0) {
                    lmVar4.r = lmVar4.w;
                    lmVar4.s = null;
                } else if (!lmVar4.b) {
                    lmVar4.r = lmVar4.w;
                } else if (lmVar4.r == null) {
                    im imVar = lmVar4.s;
                    if (imVar == null) {
                        lmVar4.r = lmVar4.w;
                    } else {
                        lmVar4.r = imVar;
                        lmVar4.s = lmVar4.w;
                    }
                } else {
                    lmVar4.s = lmVar4.w;
                }
                lmVar4.w = null;
                if (lmVar4.Q) {
                    lmVar4.Q = false;
                    lmVar4.z0++;
                    lmVar4.j();
                }
                if (lmVar4.d[3] < lmVar4.c) {
                    float f = lmVar4.h0;
                    if (f > 0.0f) {
                        i = (int) (f * 1000.0f);
                    } else {
                        i = 0;
                    }
                    lmVar4.c = i;
                }
                if (lmVar4.N >= 0 && lmVar4.M == -1) {
                    lmVar4.N = -1L;
                }
                lmVar4.c = lmVar4.d[3];
                Iterator it = lmVar4.t0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!lmVar4.c0 && lmVar4.E) || (lmVar4.n == null && lmVar4.r != null)) {
                    lmVar4.t();
                }
                lmVar4.x(false);
                return;
            case 7:
                lm lmVar5 = this.b;
                if (lmVar5.d0) {
                    hl.c3(lmVar5.G0);
                    return;
                }
                if (!lmVar5.y && lmVar5.e0 == null) {
                    lmVar5.e0 = AnimatedFileNative.a(lmVar5.H.getAbsolutePath(), lmVar5.d, lmVar5.K, lmVar5.I, lmVar5.v0, false);
                    if (lmVar5.e0 == null && (!lmVar5.o0 || lmVar5.H0 > 15)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    lmVar5.f0 = z3;
                    if (lmVar5.e0 != null) {
                        int[] iArr = lmVar5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            lmVar5.e0.f();
                            lmVar5.e0 = null;
                        }
                    }
                    lmVar5.d();
                    lmVar5.E();
                    if (lmVar5.o0 && lmVar5.e0 == null) {
                        int i3 = lmVar5.H0;
                        lmVar5.H0 = i3 + 1;
                        if (i3 <= 15) {
                            z4 = false;
                            lmVar5.y = z4;
                            hl.c3(new jm(lmVar5, (byte) 0));
                        }
                    }
                    z4 = true;
                    lmVar5.y = z4;
                    hl.c3(new jm(lmVar5, (byte) 0));
                }
                try {
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
                if (lmVar5.A0 != null) {
                    if (lmVar5.w == null) {
                        if (!lmVar5.h.isEmpty()) {
                            lmVar5.w = (im) lmVar5.h.remove(0);
                        } else {
                            lmVar5.w = new im(Bitmap.createBitmap(lmVar5.k0, lmVar5.j0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (lmVar5.B0 == null) {
                        lmVar5.B0 = new Object();
                    }
                    System.currentTimeMillis();
                    h30 h30Var = lmVar5.B0;
                    int i4 = h30Var.a;
                    ek0 ek0Var = lmVar5.A0;
                    int f2 = ek0Var.f(ek0Var.i, lmVar5.w.b);
                    h30Var.a = ek0Var.i;
                    if (ek0Var.q && !ek0Var.e.isEmpty()) {
                        int i5 = ek0Var.i + 1;
                        ek0Var.i = i5;
                        if (i5 >= ek0Var.e.size()) {
                            ek0Var.i = 0;
                        }
                    }
                    if (f2 != -1 && lmVar5.B0.a < i4) {
                        lmVar5.Q = true;
                    }
                    int[] iArr2 = lmVar5.d;
                    im imVar2 = lmVar5.w;
                    int max = lmVar5.B0.a * Math.max(16, iArr2[4] / Math.max(1, lmVar5.A0.e.size()));
                    imVar2.e = max;
                    iArr2[3] = max;
                    lmVar5.w.f = false;
                    if (lmVar5.A0.g()) {
                        hl.c3(lmVar5.F0);
                    }
                    if (f2 == -1) {
                        hl.c3(lmVar5.C0);
                        return;
                    } else {
                        hl.c3(lmVar5.G0);
                        return;
                    }
                }
                if (lmVar5.e0 == null) {
                    int[] iArr3 = lmVar5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        hl.c3(lmVar5.C0);
                        return;
                    }
                }
                if (lmVar5.w == null) {
                    int[] iArr4 = lmVar5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!lmVar5.h.isEmpty()) {
                            lmVar5.w = (im) lmVar5.h.remove(0);
                        } else {
                            int[] iArr5 = lmVar5.d;
                            float f3 = lmVar5.n0;
                            lmVar5.w = new im(Bitmap.createBitmap((int) (iArr5[0] * f3), (int) (iArr5[1] * f3), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (lmVar5.M >= 0) {
                    lmVar5.d[3] = (int) lmVar5.M;
                    long j = lmVar5.M;
                    synchronized (lmVar5.R) {
                        lmVar5.M = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = lmVar5.v0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    lmVar5.e0.g(j, true);
                    z = true;
                } else {
                    z = false;
                }
                if (lmVar5.w != null) {
                    System.currentTimeMillis();
                    if (lmVar5.e0.c(lmVar5.w.b, false, lmVar5.h0, lmVar5.i0, lmVar5.l0) == 0) {
                        hl.c3(lmVar5.C0);
                        return;
                    }
                    if (!lmVar5.f) {
                        if (lmVar5.e0.a[7] == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        lmVar5.f = z2;
                    }
                    int i6 = lmVar5.d[3];
                    if (i6 < lmVar5.c) {
                        lmVar5.Q = true;
                    }
                    if (z) {
                        lmVar5.c = i6;
                    }
                    im imVar3 = lmVar5.w;
                    imVar3.e = i6;
                    if (lmVar5.e0.a[6] == 1) {
                        z5 = true;
                    }
                    imVar3.f = z5;
                }
                hl.c3(lmVar5.G0);
                return;
            case 8:
                lm lmVar6 = this.b;
                r89 r89Var = lmVar6.t0;
                Iterator it2 = r89Var.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = lmVar6.s0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                }
                if ((r89Var.isEmpty() || lmVar6.S) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                lm lmVar7 = this.b;
                lmVar7.A0.b();
                hl.c3(new jm(lmVar7, (byte) 1));
                return;
        }
    }

    private final void a() {
    }
}
