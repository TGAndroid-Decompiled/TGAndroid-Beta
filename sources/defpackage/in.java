package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.ui.Components.AnimatedFileNative;
public final class in implements Runnable {
    public final byte a;
    public final kn b;

    public in(kn knVar, byte b) {
        this.a = b;
        this.b = knVar;
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
                kn knVar = this.b;
                if (knVar.E0 != null) {
                    dl0.c();
                    knVar.E0 = null;
                }
                knVar.D0 = false;
                knVar.k();
                knVar.x(false);
                return;
            case 2:
                this.b.t();
                return;
            case 3:
                return;
            case 4:
                kn knVar2 = this.b;
                knVar2.k();
                knVar2.e = null;
                if (knVar2.N >= 0 && knVar2.M == -1) {
                    knVar2.N = -1L;
                }
                knVar2.x(false);
                knVar2.t();
                return;
            case 5:
                kn knVar3 = this.b;
                if (!knVar3.d0 && !knVar3.x && !knVar3.D0 && knVar3.E0 == null) {
                    knVar3.h0 = (float) System.currentTimeMillis();
                    if (p09.U0 == null) {
                        p09.U0 = new np3("cache generator queue", true);
                    }
                    knVar3.D0 = true;
                    knVar3.e = null;
                    dl0.A++;
                    np3 np3Var = p09.U0;
                    in inVar = new in(knVar3, (byte) 9);
                    knVar3.E0 = inVar;
                    np3Var.postRunnable(inVar);
                    return;
                }
                return;
            case 6:
                kn knVar4 = this.b;
                knVar4.k();
                if (knVar4.v0 != null && knVar4.O) {
                    bc4.G(knVar4.K).Z(knVar4.v0.c, false, false);
                }
                int i2 = knVar4.P;
                if (i2 <= 0) {
                    knVar4.O = true;
                } else {
                    knVar4.P = i2 - 1;
                }
                if (!knVar4.G) {
                    knVar4.F = true;
                } else {
                    knVar4.G = false;
                }
                knVar4.e = null;
                if (knVar4.N >= 0) {
                    knVar4.r = knVar4.w;
                    knVar4.s = null;
                } else if (!knVar4.b) {
                    knVar4.r = knVar4.w;
                } else if (knVar4.r == null) {
                    hn hnVar = knVar4.s;
                    if (hnVar == null) {
                        knVar4.r = knVar4.w;
                    } else {
                        knVar4.r = hnVar;
                        knVar4.s = knVar4.w;
                    }
                } else {
                    knVar4.s = knVar4.w;
                }
                knVar4.w = null;
                if (knVar4.Q) {
                    knVar4.Q = false;
                    knVar4.z0++;
                    knVar4.j();
                }
                if (knVar4.d[3] < knVar4.c) {
                    float f = knVar4.h0;
                    if (f > 0.0f) {
                        i = (int) (f * 1000.0f);
                    } else {
                        i = 0;
                    }
                    knVar4.c = i;
                }
                if (knVar4.N >= 0 && knVar4.M == -1) {
                    knVar4.N = -1L;
                }
                knVar4.c = knVar4.d[3];
                Iterator it = knVar4.t0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!knVar4.c0 && knVar4.E) || (knVar4.n == null && knVar4.r != null)) {
                    knVar4.t();
                }
                knVar4.x(false);
                return;
            case 7:
                kn knVar5 = this.b;
                if (knVar5.d0) {
                    gm.c3(knVar5.G0);
                    return;
                }
                if (!knVar5.y && knVar5.e0 == null) {
                    knVar5.e0 = AnimatedFileNative.a(knVar5.H.getAbsolutePath(), knVar5.d, knVar5.K, knVar5.I, knVar5.v0, false);
                    if (knVar5.e0 == null && (!knVar5.o0 || knVar5.H0 > 15)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    knVar5.f0 = z3;
                    if (knVar5.e0 != null) {
                        int[] iArr = knVar5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            knVar5.e0.f();
                            knVar5.e0 = null;
                        }
                    }
                    knVar5.d();
                    knVar5.E();
                    if (knVar5.o0 && knVar5.e0 == null) {
                        int i3 = knVar5.H0;
                        knVar5.H0 = i3 + 1;
                        if (i3 <= 15) {
                            z4 = false;
                            knVar5.y = z4;
                            gm.c3(new in(knVar5, (byte) 0));
                        }
                    }
                    z4 = true;
                    knVar5.y = z4;
                    gm.c3(new in(knVar5, (byte) 0));
                }
                try {
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
                if (knVar5.A0 != null) {
                    if (knVar5.w == null) {
                        if (!knVar5.h.isEmpty()) {
                            knVar5.w = (hn) knVar5.h.remove(0);
                        } else {
                            knVar5.w = new hn(Bitmap.createBitmap(knVar5.k0, knVar5.j0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (knVar5.B0 == null) {
                        knVar5.B0 = new Object();
                    }
                    System.currentTimeMillis();
                    g40 g40Var = knVar5.B0;
                    int i4 = g40Var.a;
                    dl0 dl0Var = knVar5.A0;
                    int f2 = dl0Var.f(dl0Var.i, knVar5.w.b);
                    g40Var.a = dl0Var.i;
                    if (dl0Var.q && !dl0Var.e.isEmpty()) {
                        int i5 = dl0Var.i + 1;
                        dl0Var.i = i5;
                        if (i5 >= dl0Var.e.size()) {
                            dl0Var.i = 0;
                        }
                    }
                    if (f2 != -1 && knVar5.B0.a < i4) {
                        knVar5.Q = true;
                    }
                    int[] iArr2 = knVar5.d;
                    hn hnVar2 = knVar5.w;
                    int max = knVar5.B0.a * Math.max(16, iArr2[4] / Math.max(1, knVar5.A0.e.size()));
                    hnVar2.e = max;
                    iArr2[3] = max;
                    knVar5.w.f = false;
                    if (knVar5.A0.g()) {
                        gm.c3(knVar5.F0);
                    }
                    if (f2 == -1) {
                        gm.c3(knVar5.C0);
                        return;
                    } else {
                        gm.c3(knVar5.G0);
                        return;
                    }
                }
                if (knVar5.e0 == null) {
                    int[] iArr3 = knVar5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        gm.c3(knVar5.C0);
                        return;
                    }
                }
                if (knVar5.w == null) {
                    int[] iArr4 = knVar5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!knVar5.h.isEmpty()) {
                            knVar5.w = (hn) knVar5.h.remove(0);
                        } else {
                            int[] iArr5 = knVar5.d;
                            float f3 = knVar5.n0;
                            knVar5.w = new hn(Bitmap.createBitmap((int) (iArr5[0] * f3), (int) (iArr5[1] * f3), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (knVar5.M >= 0) {
                    knVar5.d[3] = (int) knVar5.M;
                    long j = knVar5.M;
                    synchronized (knVar5.R) {
                        knVar5.M = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = knVar5.v0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    knVar5.e0.g(j, true);
                    z = true;
                } else {
                    z = false;
                }
                if (knVar5.w != null) {
                    System.currentTimeMillis();
                    if (knVar5.e0.c(knVar5.w.b, false, knVar5.h0, knVar5.i0, knVar5.l0) == 0) {
                        gm.c3(knVar5.C0);
                        return;
                    }
                    if (!knVar5.f) {
                        if (knVar5.e0.a[7] == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        knVar5.f = z2;
                    }
                    int i6 = knVar5.d[3];
                    if (i6 < knVar5.c) {
                        knVar5.Q = true;
                    }
                    if (z) {
                        knVar5.c = i6;
                    }
                    hn hnVar3 = knVar5.w;
                    hnVar3.e = i6;
                    if (knVar5.e0.a[6] == 1) {
                        z5 = true;
                    }
                    hnVar3.f = z5;
                }
                gm.c3(knVar5.G0);
                return;
            case 8:
                kn knVar6 = this.b;
                g79 g79Var = knVar6.t0;
                Iterator it2 = g79Var.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = knVar6.s0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                }
                if ((g79Var.isEmpty() || knVar6.S) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                kn knVar7 = this.b;
                knVar7.A0.b();
                gm.c3(new in(knVar7, (byte) 1));
                return;
        }
    }

    private final void a() {
    }
}
