package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.ui.Components.AnimatedFileNative;
public final class im implements Runnable {
    public final byte a;
    public final km b;

    public im(km kmVar, byte b) {
        this.a = b;
        this.b = kmVar;
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
                km kmVar = this.b;
                if (kmVar.E0 != null) {
                    dk0.c();
                    kmVar.E0 = null;
                }
                kmVar.D0 = false;
                kmVar.k();
                kmVar.x(false);
                return;
            case 2:
                this.b.t();
                return;
            case 3:
                return;
            case 4:
                km kmVar2 = this.b;
                kmVar2.k();
                kmVar2.e = null;
                if (kmVar2.N >= 0 && kmVar2.M == -1) {
                    kmVar2.N = -1L;
                }
                kmVar2.x(false);
                kmVar2.t();
                return;
            case 5:
                km kmVar3 = this.b;
                if (!kmVar3.d0 && !kmVar3.x && !kmVar3.D0 && kmVar3.E0 == null) {
                    kmVar3.h0 = (float) System.currentTimeMillis();
                    if (oy8.U0 == null) {
                        oy8.U0 = new do3("cache generator queue", true);
                    }
                    kmVar3.D0 = true;
                    kmVar3.e = null;
                    dk0.A++;
                    do3 do3Var = oy8.U0;
                    im imVar = new im(kmVar3, (byte) 9);
                    kmVar3.E0 = imVar;
                    do3Var.postRunnable(imVar);
                    return;
                }
                return;
            case 6:
                km kmVar4 = this.b;
                kmVar4.k();
                if (kmVar4.v0 != null && kmVar4.O) {
                    ba4.G(kmVar4.K).Z(kmVar4.v0.c, false, false);
                }
                int i2 = kmVar4.P;
                if (i2 <= 0) {
                    kmVar4.O = true;
                } else {
                    kmVar4.P = i2 - 1;
                }
                if (!kmVar4.G) {
                    kmVar4.F = true;
                } else {
                    kmVar4.G = false;
                }
                kmVar4.e = null;
                if (kmVar4.N >= 0) {
                    kmVar4.r = kmVar4.w;
                    kmVar4.s = null;
                } else if (!kmVar4.b) {
                    kmVar4.r = kmVar4.w;
                } else if (kmVar4.r == null) {
                    hm hmVar = kmVar4.s;
                    if (hmVar == null) {
                        kmVar4.r = kmVar4.w;
                    } else {
                        kmVar4.r = hmVar;
                        kmVar4.s = kmVar4.w;
                    }
                } else {
                    kmVar4.s = kmVar4.w;
                }
                kmVar4.w = null;
                if (kmVar4.Q) {
                    kmVar4.Q = false;
                    kmVar4.z0++;
                    kmVar4.j();
                }
                if (kmVar4.d[3] < kmVar4.c) {
                    float f = kmVar4.h0;
                    if (f > 0.0f) {
                        i = (int) (f * 1000.0f);
                    } else {
                        i = 0;
                    }
                    kmVar4.c = i;
                }
                if (kmVar4.N >= 0 && kmVar4.M == -1) {
                    kmVar4.N = -1L;
                }
                kmVar4.c = kmVar4.d[3];
                Iterator it = kmVar4.t0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!kmVar4.c0 && kmVar4.E) || (kmVar4.n == null && kmVar4.r != null)) {
                    kmVar4.t();
                }
                kmVar4.x(false);
                return;
            case 7:
                km kmVar5 = this.b;
                if (kmVar5.d0) {
                    gl.d3(kmVar5.G0);
                    return;
                }
                if (!kmVar5.y && kmVar5.e0 == null) {
                    kmVar5.e0 = AnimatedFileNative.a(kmVar5.H.getAbsolutePath(), kmVar5.d, kmVar5.K, kmVar5.I, kmVar5.v0, false);
                    if (kmVar5.e0 == null && (!kmVar5.o0 || kmVar5.H0 > 15)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    kmVar5.f0 = z3;
                    if (kmVar5.e0 != null) {
                        int[] iArr = kmVar5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            kmVar5.e0.f();
                            kmVar5.e0 = null;
                        }
                    }
                    kmVar5.d();
                    kmVar5.E();
                    if (kmVar5.o0 && kmVar5.e0 == null) {
                        int i3 = kmVar5.H0;
                        kmVar5.H0 = i3 + 1;
                        if (i3 <= 15) {
                            z4 = false;
                            kmVar5.y = z4;
                            gl.d3(new im(kmVar5, (byte) 0));
                        }
                    }
                    z4 = true;
                    kmVar5.y = z4;
                    gl.d3(new im(kmVar5, (byte) 0));
                }
                try {
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
                if (kmVar5.A0 != null) {
                    if (kmVar5.w == null) {
                        if (!kmVar5.h.isEmpty()) {
                            kmVar5.w = (hm) kmVar5.h.remove(0);
                        } else {
                            kmVar5.w = new hm(Bitmap.createBitmap(kmVar5.k0, kmVar5.j0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (kmVar5.B0 == null) {
                        kmVar5.B0 = new Object();
                    }
                    System.currentTimeMillis();
                    g30 g30Var = kmVar5.B0;
                    int i4 = g30Var.a;
                    dk0 dk0Var = kmVar5.A0;
                    int f2 = dk0Var.f(dk0Var.i, kmVar5.w.b);
                    g30Var.a = dk0Var.i;
                    if (dk0Var.q && !dk0Var.e.isEmpty()) {
                        int i5 = dk0Var.i + 1;
                        dk0Var.i = i5;
                        if (i5 >= dk0Var.e.size()) {
                            dk0Var.i = 0;
                        }
                    }
                    if (f2 != -1 && kmVar5.B0.a < i4) {
                        kmVar5.Q = true;
                    }
                    int[] iArr2 = kmVar5.d;
                    hm hmVar2 = kmVar5.w;
                    int max = kmVar5.B0.a * Math.max(16, iArr2[4] / Math.max(1, kmVar5.A0.e.size()));
                    hmVar2.e = max;
                    iArr2[3] = max;
                    kmVar5.w.f = false;
                    if (kmVar5.A0.g()) {
                        gl.d3(kmVar5.F0);
                    }
                    if (f2 == -1) {
                        gl.d3(kmVar5.C0);
                        return;
                    } else {
                        gl.d3(kmVar5.G0);
                        return;
                    }
                }
                if (kmVar5.e0 == null) {
                    int[] iArr3 = kmVar5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        gl.d3(kmVar5.C0);
                        return;
                    }
                }
                if (kmVar5.w == null) {
                    int[] iArr4 = kmVar5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!kmVar5.h.isEmpty()) {
                            kmVar5.w = (hm) kmVar5.h.remove(0);
                        } else {
                            int[] iArr5 = kmVar5.d;
                            float f3 = kmVar5.n0;
                            kmVar5.w = new hm(Bitmap.createBitmap((int) (iArr5[0] * f3), (int) (iArr5[1] * f3), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (kmVar5.M >= 0) {
                    kmVar5.d[3] = (int) kmVar5.M;
                    long j = kmVar5.M;
                    synchronized (kmVar5.R) {
                        kmVar5.M = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = kmVar5.v0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    kmVar5.e0.g(j, true);
                    z = true;
                } else {
                    z = false;
                }
                if (kmVar5.w != null) {
                    System.currentTimeMillis();
                    if (kmVar5.e0.c(kmVar5.w.b, false, kmVar5.h0, kmVar5.i0, kmVar5.l0) == 0) {
                        gl.d3(kmVar5.C0);
                        return;
                    }
                    if (!kmVar5.f) {
                        if (kmVar5.e0.a[7] == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        kmVar5.f = z2;
                    }
                    int i6 = kmVar5.d[3];
                    if (i6 < kmVar5.c) {
                        kmVar5.Q = true;
                    }
                    if (z) {
                        kmVar5.c = i6;
                    }
                    hm hmVar3 = kmVar5.w;
                    hmVar3.e = i6;
                    if (kmVar5.e0.a[6] == 1) {
                        z5 = true;
                    }
                    hmVar3.f = z5;
                }
                gl.d3(kmVar5.G0);
                return;
            case 8:
                km kmVar6 = this.b;
                e59 e59Var = kmVar6.t0;
                Iterator it2 = e59Var.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = kmVar6.s0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                }
                if ((e59Var.isEmpty() || kmVar6.S) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                km kmVar7 = this.b;
                kmVar7.A0.b();
                gl.d3(new im(kmVar7, (byte) 1));
                return;
        }
    }

    private final void a() {
    }
}
