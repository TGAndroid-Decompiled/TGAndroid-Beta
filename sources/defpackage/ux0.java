package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
public final class ux0 extends s64 {
    public final byte o = 1;
    public final Rect p;
    public final View q;

    public ux0(yx0 yx0Var, yx0 yx0Var2) {
        super(yx0Var2);
        this.q = yx0Var;
        this.p = new Rect();
    }

    @Override
    public final int g(float f, float f2) {
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                yx0 yx0Var = (yx0) view;
                ArrayList arrayList = yx0Var.S;
                if (yx0Var.W >= 0.5f) {
                    ff0 ff0Var = yx0Var.j0;
                    if (ff0Var != null && ff0Var.getBounds().contains((int) f, (int) f2)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        xx0 xx0Var = (xx0) arrayList.get(size);
                        float f3 = xx0Var.i;
                        RectF rectF = xx0Var.a;
                        if (Math.abs(f3) < 0.4f && rectF.contains(f, f2)) {
                            Rect bounds = xx0Var.d.l.getBounds();
                            if (!bounds.isEmpty() && bounds.contains((int) (f - rectF.left), (int) ((f2 - rectF.top) - gl.L(24.0f)))) {
                                return size + 2000;
                            }
                            return size + 1000;
                        }
                    }
                }
                return -1;
            default:
                f29 f29Var = (f29) view;
                if (Math.abs(f - f29Var.l0) <= gl.L(30.0f) && Math.abs(f2 - f29Var.k0) <= gl.L(30.0f) && !f29Var.b() && !f29Var.v0) {
                    return 0;
                }
                if (Math.abs(f - f29Var.m0) <= gl.L(30.0f) && Math.abs(f2 - f29Var.k0) <= gl.L(30.0f) && !f29Var.b() && !f29Var.v0) {
                    return 2;
                }
                if (Math.abs(f - f29Var.j0) <= gl.L(60.0f) && Math.abs(f2 - f29Var.k0) <= gl.L(60.0f)) {
                    return 1;
                }
                return Integer.MIN_VALUE;
        }
    }

    @Override
    public final void h(ArrayList arrayList) {
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                yx0 yx0Var = (yx0) view;
                ArrayList arrayList2 = yx0Var.S;
                if (yx0Var.W >= 0.5f) {
                    ff0 ff0Var = yx0Var.j0;
                    if (ff0Var != null && !ff0Var.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i = 0; i < arrayList2.size(); i++) {
                        xx0 xx0Var = (xx0) arrayList2.get(i);
                        if (Math.abs(xx0Var.i) < 0.4f && !xx0Var.a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i + 1000));
                            if (!xx0Var.d.l.getBounds().isEmpty()) {
                                arrayList.add(Integer.valueOf(i + 2000));
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                f29 f29Var = (f29) view;
                if (!f29Var.b() && !f29Var.v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!f29Var.b() && !f29Var.v0) {
                    arrayList.add(2);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean k(int i, int i2) {
        int i3;
        boolean z;
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                yx0 yx0Var = (yx0) view;
                ArrayList arrayList = yx0Var.S;
                if (i2 != 16) {
                    return false;
                }
                if (i == 1) {
                    qx0 qx0Var = yx0Var.a;
                    if (qx0Var != null) {
                        qx0Var.f();
                    }
                    yx0Var.a(false);
                } else {
                    if (i >= 2000) {
                        i3 = i - 2000;
                        z = true;
                    } else if (i < 1000) {
                        return false;
                    } else {
                        i3 = i - 1000;
                        z = false;
                    }
                    if (i3 < 0 || i3 >= arrayList.size()) {
                        return false;
                    }
                    xx0 xx0Var = (xx0) arrayList.get(i3);
                    qx0 qx0Var2 = yx0Var.a;
                    if (z) {
                        if (qx0Var2 != null) {
                            qx0Var2.g(xx0Var.c, new x0(this, xx0Var, (byte) 10));
                        }
                    } else if (qx0Var2 != null) {
                        yx0Var.a(false);
                        xx0Var.getClass();
                        yx0Var.a.e(xx0Var.c);
                    }
                }
                return true;
            default:
                f29 f29Var = (f29) view;
                if (f29Var.a == null || f29Var.v0 || i2 != 16) {
                    return false;
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2 || f29Var.b()) {
                            return false;
                        }
                        f29Var.d(180.0f);
                        ((t6b) f29Var.a).b();
                    } else if (f29Var.b()) {
                        ((t6b) f29Var.a).a();
                    } else if (f29Var.s0) {
                        f29Var.s0 = false;
                        f29Var.A0 = false;
                        f29Var.w0 = SystemClock.elapsedRealtime();
                        f29Var.v0 = true;
                        ((t6b) f29Var.a).e(false);
                        f29Var.invalidate();
                    } else {
                        boolean z2 = f29Var.p0;
                        e29 e29Var = f29Var.a;
                        if (z2) {
                            if (((t6b) e29Var).a.Y()) {
                                f29Var.S = 0L;
                                f29Var.R = System.currentTimeMillis();
                                f29Var.B0 = false;
                                ((t6b) f29Var.a).f(new sr8(this, (byte) 12), false);
                            }
                        } else {
                            ((t6b) e29Var).d();
                        }
                    }
                } else if (f29Var.b()) {
                    return false;
                } else {
                    if (f29Var.s0 && f29Var.B0) {
                        f29Var.A0 = false;
                        f29Var.H0.e(true, 1.0f);
                        ge5 ge5Var = ((t6b) f29Var.a).a.U0;
                        ge5Var.a.t(k96.M0(2131744421, null), true, true);
                        ge5Var.invalidate();
                        f29Var.invalidate();
                    } else {
                        ((t6b) f29Var.a).c();
                    }
                }
                return true;
        }
    }

    @Override
    public final void l(int i, u4 u4Var) {
        int i2;
        boolean z;
        String j;
        String j2;
        String M0;
        String M02;
        byte b = this.o;
        String str = "";
        View view = this.q;
        Rect rect = this.p;
        boolean z2 = true;
        switch (b) {
            case 0:
                yx0 yx0Var = (yx0) view;
                ArrayList arrayList = yx0Var.S;
                u4Var.i("android.widget.Button");
                u4Var.b(r4.c);
                if (i == 1) {
                    ff0 ff0Var = yx0Var.j0;
                    if (ff0Var != null) {
                        rect.set(ff0Var.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        u4Var.p(false);
                    }
                    u4Var.h(rect);
                    u4Var.j(k96.M0(2131753096, null));
                    return;
                }
                if (i >= 2000) {
                    i2 = i - 2000;
                    z = true;
                } else if (i >= 1000) {
                    i2 = i - 1000;
                    z = false;
                } else {
                    rect.set(0, 0, 1, 1);
                    u4Var.h(rect);
                    u4Var.p(false);
                    return;
                }
                if (i2 >= 0 && i2 < arrayList.size()) {
                    xx0 xx0Var = (xx0) arrayList.get(i2);
                    px0 px0Var = xx0Var.c;
                    RectF rectF = xx0Var.a;
                    if (px0Var != null && px0Var.b() != null) {
                        str = xx0Var.c.b();
                    }
                    if (z) {
                        Rect bounds = xx0Var.d.l.getBounds();
                        rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + gl.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + gl.L(24.0f) + bounds.bottom));
                        u4Var.h(rect);
                        if (TextUtils.isEmpty(str)) {
                            j2 = k96.M0(2131752029, null);
                        } else {
                            j2 = b00.j(new StringBuilder(k96.M0(2131752029, null)), ", ", str);
                        }
                        u4Var.j(j2);
                        return;
                    }
                    rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    u4Var.h(rect);
                    if (TextUtils.isEmpty(str)) {
                        j = k96.M0(2131747624, null);
                    } else {
                        j = b00.j(new StringBuilder(k96.M0(2131747624, null)), ", ", str);
                    }
                    u4Var.j(j);
                    return;
                }
                rect.set(0, 0, 1, 1);
                u4Var.h(rect);
                u4Var.p(false);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
                f29 f29Var = (f29) view;
                u4Var.i("android.widget.Button");
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            rect.set(0, 0, 1, 1);
                            u4Var.h(rect);
                            u4Var.p(false);
                            u4Var.j("");
                            return;
                        }
                        int L = gl.L(22.0f);
                        float f = f29Var.m0;
                        float f2 = L;
                        float f3 = f29Var.k0;
                        rect.set((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
                        u4Var.h(rect);
                        u4Var.j(k96.M0(2131754751, null));
                        if (f29Var.v0 || f29Var.b()) {
                            z2 = false;
                        }
                        accessibilityNodeInfo.setEnabled(z2);
                        if (z2) {
                            u4Var.b(r4.c);
                            return;
                        }
                        return;
                    }
                    int L2 = gl.L(40.0f);
                    float f4 = f29Var.j0;
                    float f5 = L2;
                    float f6 = f29Var.k0;
                    rect.set((int) (f4 - f5), (int) (f6 - f5), (int) (f4 + f5), (int) (f6 + f5));
                    u4Var.h(rect);
                    if (f29Var.b()) {
                        M02 = k96.M0(2131745448, null);
                    } else if (f29Var.s0) {
                        M02 = k96.M0(2131754753, null);
                    } else if (f29Var.p0) {
                        M02 = k96.M0(2131754757, null);
                    } else {
                        M02 = k96.M0(2131754746, null);
                    }
                    u4Var.j(M02);
                    accessibilityNodeInfo.setEnabled(!f29Var.v0);
                    if (!f29Var.v0) {
                        u4Var.b(r4.c);
                        return;
                    }
                    return;
                }
                int L3 = gl.L(22.0f);
                float f7 = f29Var.l0;
                float f8 = L3;
                float f9 = f29Var.k0;
                rect.set((int) (f7 - f8), (int) (f9 - f8), (int) (f7 + f8), (int) (f9 + f8));
                u4Var.h(rect);
                if (f29Var.s0 && f29Var.B0) {
                    M0 = k96.M0(2131754845, null);
                } else {
                    M0 = k96.M0(2131754912, null);
                }
                u4Var.j(M0);
                if (f29Var.v0 || f29Var.b()) {
                    z2 = false;
                }
                accessibilityNodeInfo.setEnabled(z2);
                if (z2) {
                    u4Var.b(r4.c);
                    return;
                }
                return;
        }
    }

    public ux0(f29 f29Var, f29 f29Var2) {
        super(f29Var2);
        this.q = f29Var;
        this.p = new Rect();
    }
}
