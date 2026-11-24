package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
public final class bxc implements View.OnApplyWindowInsetsListener {
    public final twc a;
    public vxc b;

    public bxc(FrameLayout frameLayout, twc twcVar) {
        vxc vxcVar;
        lxc hxcVar;
        this.a = twcVar;
        WeakHashMap weakHashMap = jdc.a;
        vxc a = cdc.a(frameLayout);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                hxcVar = new kxc(a);
            } else if (i >= 30) {
                hxcVar = new jxc(a);
            } else if (i >= 29) {
                hxcVar = new ixc(a);
            } else {
                hxcVar = new hxc(a);
            }
            vxcVar = hxcVar.b();
        } else {
            vxcVar = null;
        }
        this.b = vxcVar;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j;
        int[] iArr;
        boolean z;
        boolean z2;
        if (!view.isLaidOut()) {
            this.b = vxc.h(view, windowInsets);
            if (view.getTag(2131296689) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        vxc h = vxc.h(view, windowInsets);
        sxc sxcVar = h.a;
        vxc vxcVar = this.b;
        if (vxcVar == null) {
            WeakHashMap weakHashMap = jdc.a;
            vxcVar = cdc.a(view);
            this.b = vxcVar;
        }
        if (vxcVar == null) {
            this.b = h;
            if (view.getTag(2131296689) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            twc i = cxc.i(view);
            if (i != null && Objects.equals(i.a, h)) {
                if (view.getTag(2131296689) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                vxc vxcVar2 = this.b;
                int i2 = 1;
                while (i2 <= 512) {
                    io5 f = sxcVar.f(i2);
                    io5 f2 = vxcVar2.a.f(i2);
                    int i3 = f.a;
                    int i4 = f.d;
                    int i5 = f.c;
                    int i6 = f.b;
                    int i7 = f2.a;
                    int i8 = f2.d;
                    int i9 = f2.c;
                    int i10 = f2.b;
                    if (i3 <= i7 && i6 <= i10 && i5 <= i9 && i4 <= i8) {
                        iArr = iArr2;
                        z = false;
                    } else {
                        iArr = iArr2;
                        z = true;
                    }
                    if (i3 >= i7 && i6 >= i10 && i5 >= i9 && i4 >= i8) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z != z2) {
                        if (z) {
                            iArr[0] = iArr[0] | i2;
                        } else {
                            iArr3[0] = iArr3[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr;
                }
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.b = h;
                    if (view.getTag(2131296689) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    vxc vxcVar3 = this.b;
                    if ((i11 & 8) != 0) {
                        interpolator = cxc.e;
                    } else if ((i12 & 8) != 0) {
                        interpolator = cxc.f;
                    } else if ((i11 & 519) != 0) {
                        interpolator = cxc.g;
                    } else if ((i12 & 519) != 0) {
                        interpolator = cxc.h;
                    } else {
                        interpolator = null;
                    }
                    if ((i13 & 8) != 0) {
                        j = 160;
                    } else {
                        j = 250;
                    }
                    gxc gxcVar = new gxc(i13, interpolator, j);
                    gxcVar.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(gxcVar.a.a());
                    io5 f3 = sxcVar.f(i13);
                    io5 f4 = vxcVar3.a.f(i13);
                    int min = Math.min(f3.a, f4.a);
                    int i14 = f3.b;
                    int i15 = f4.b;
                    int min2 = Math.min(i14, i15);
                    int i16 = f3.c;
                    int i17 = f4.c;
                    int min3 = Math.min(i16, i17);
                    int i18 = f3.d;
                    int i19 = f4.d;
                    v8b v8bVar = new v8b(io5.b(min, min2, min3, Math.min(i18, i19)), io5.b(Math.max(f3.a, f4.a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)), false, (byte) 7);
                    cxc.f(view, h, false);
                    duration.addUpdateListener(new axc(gxcVar, h, vxcVar3, i13, view));
                    duration.addListener(new eh8((Object) gxcVar, view, (byte) 24));
                    ey1 ey1Var = new ey1(view, gxcVar, v8bVar, duration);
                    if (view != null) {
                        kq7 kq7Var = new kq7(view, ey1Var);
                        view.getViewTreeObserver().addOnPreDrawListener(kq7Var);
                        view.addOnAttachStateChangeListener(kq7Var);
                    } else {
                        fvc.f("view == null");
                    }
                    this.b = h;
                    if (view.getTag(2131296689) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
