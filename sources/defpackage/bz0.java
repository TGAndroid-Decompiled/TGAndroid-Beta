package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
public final class bz0 extends b84 {
    public final byte o = 0;
    public final Rect p;
    public final View q;

    public bz0(fz0 fz0Var, fz0 fz0Var2) {
        super(fz0Var2);
        this.q = fz0Var;
        this.p = new Rect();
    }

    @Override
    public final int g(float f, float f2) {
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                fz0 fz0Var = (fz0) view;
                ArrayList arrayList = fz0Var.S;
                if (fz0Var.W >= 0.5f) {
                    fg0 fg0Var = fz0Var.j0;
                    if (fg0Var != null && fg0Var.getBounds().contains((int) f, (int) f2)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ez0 ez0Var = (ez0) arrayList.get(size);
                        float f3 = ez0Var.i;
                        RectF rectF = ez0Var.a;
                        if (Math.abs(f3) < 0.4f && rectF.contains(f, f2)) {
                            Rect bounds = ez0Var.d.l.getBounds();
                            if (!bounds.isEmpty() && bounds.contains((int) (f - rectF.left), (int) ((f2 - rectF.top) - gm.L(24.0f)))) {
                                return size + 2000;
                            }
                            return size + 1000;
                        }
                    }
                }
                return -1;
            default:
                j49 j49Var = (j49) view;
                if (Math.abs(f - j49Var.l0) <= gm.L(30.0f) && Math.abs(f2 - j49Var.k0) <= gm.L(30.0f) && !j49Var.b() && !j49Var.v0) {
                    return 0;
                }
                if (Math.abs(f - j49Var.m0) <= gm.L(30.0f) && Math.abs(f2 - j49Var.k0) <= gm.L(30.0f) && !j49Var.b() && !j49Var.v0) {
                    return 2;
                }
                if (Math.abs(f - j49Var.j0) <= gm.L(60.0f) && Math.abs(f2 - j49Var.k0) <= gm.L(60.0f)) {
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
                fz0 fz0Var = (fz0) view;
                ArrayList arrayList2 = fz0Var.S;
                if (fz0Var.W >= 0.5f) {
                    fg0 fg0Var = fz0Var.j0;
                    if (fg0Var != null && !fg0Var.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i = 0; i < arrayList2.size(); i++) {
                        ez0 ez0Var = (ez0) arrayList2.get(i);
                        if (Math.abs(ez0Var.i) < 0.4f && !ez0Var.a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i + 1000));
                            if (!ez0Var.d.l.getBounds().isEmpty()) {
                                arrayList.add(Integer.valueOf(i + 2000));
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                j49 j49Var = (j49) view;
                if (!j49Var.b() && !j49Var.v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!j49Var.b() && !j49Var.v0) {
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
                fz0 fz0Var = (fz0) view;
                ArrayList arrayList = fz0Var.S;
                if (i2 != 16) {
                    return false;
                }
                if (i == 1) {
                    xy0 xy0Var = fz0Var.a;
                    if (xy0Var != null) {
                        xy0Var.f();
                    }
                    fz0Var.a(false);
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
                    ez0 ez0Var = (ez0) arrayList.get(i3);
                    xy0 xy0Var2 = fz0Var.a;
                    if (z) {
                        if (xy0Var2 != null) {
                            xy0Var2.g(ez0Var.c, new x0(this, ez0Var, (byte) 11));
                        }
                    } else if (xy0Var2 != null) {
                        fz0Var.a(false);
                        ez0Var.getClass();
                        fz0Var.a.e(ez0Var.c);
                    }
                }
                return true;
            default:
                j49 j49Var = (j49) view;
                if (j49Var.a == null || j49Var.v0 || i2 != 16) {
                    return false;
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2 || j49Var.b()) {
                            return false;
                        }
                        j49Var.d(180.0f);
                        ((v8b) j49Var.a).b();
                    } else if (j49Var.b()) {
                        ((v8b) j49Var.a).a();
                    } else if (j49Var.s0) {
                        j49Var.s0 = false;
                        j49Var.A0 = false;
                        j49Var.w0 = SystemClock.elapsedRealtime();
                        j49Var.v0 = true;
                        ((v8b) j49Var.a).e(false);
                        j49Var.invalidate();
                    } else {
                        boolean z2 = j49Var.p0;
                        i49 i49Var = j49Var.a;
                        if (z2) {
                            if (((v8b) i49Var).a.Y()) {
                                j49Var.S = 0L;
                                j49Var.R = System.currentTimeMillis();
                                j49Var.B0 = false;
                                ((v8b) j49Var.a).f(new pp8(this, (byte) 20), false);
                            }
                        } else {
                            ((v8b) i49Var).d();
                        }
                    }
                } else if (j49Var.b()) {
                    return false;
                } else {
                    if (j49Var.s0 && j49Var.B0) {
                        j49Var.A0 = false;
                        j49Var.H0.e(true, 1.0f);
                        eg5 eg5Var = ((v8b) j49Var.a).a.U0;
                        eg5Var.a.t(jb6.M0(2131744347, null), true, true);
                        eg5Var.invalidate();
                        j49Var.invalidate();
                    } else {
                        ((v8b) j49Var.a).c();
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
                fz0 fz0Var = (fz0) view;
                ArrayList arrayList = fz0Var.S;
                u4Var.i("android.widget.Button");
                u4Var.b(r4.d);
                if (i == 1) {
                    fg0 fg0Var = fz0Var.j0;
                    if (fg0Var != null) {
                        rect.set(fg0Var.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        u4Var.p(false);
                    }
                    u4Var.h(rect);
                    u4Var.j(jb6.M0(2131753064, null));
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
                    ez0 ez0Var = (ez0) arrayList.get(i2);
                    wy0 wy0Var = ez0Var.c;
                    RectF rectF = ez0Var.a;
                    if (wy0Var != null && wy0Var.b() != null) {
                        str = ez0Var.c.b();
                    }
                    if (z) {
                        Rect bounds = ez0Var.d.l.getBounds();
                        rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + gm.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + gm.L(24.0f) + bounds.bottom));
                        u4Var.h(rect);
                        if (TextUtils.isEmpty(str)) {
                            j2 = jb6.M0(2131751978, null);
                        } else {
                            j2 = b10.j(new StringBuilder(jb6.M0(2131751978, null)), ", ", str);
                        }
                        u4Var.j(j2);
                        return;
                    }
                    rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    u4Var.h(rect);
                    if (TextUtils.isEmpty(str)) {
                        j = jb6.M0(2131747550, null);
                    } else {
                        j = b10.j(new StringBuilder(jb6.M0(2131747550, null)), ", ", str);
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
                j49 j49Var = (j49) view;
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
                        int L = gm.L(22.0f);
                        float f = j49Var.m0;
                        float f2 = L;
                        float f3 = j49Var.k0;
                        rect.set((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
                        u4Var.h(rect);
                        u4Var.j(jb6.M0(2131754751, null));
                        if (j49Var.v0 || j49Var.b()) {
                            z2 = false;
                        }
                        accessibilityNodeInfo.setEnabled(z2);
                        if (z2) {
                            u4Var.b(r4.d);
                            return;
                        }
                        return;
                    }
                    int L2 = gm.L(40.0f);
                    float f4 = j49Var.j0;
                    float f5 = L2;
                    float f6 = j49Var.k0;
                    rect.set((int) (f4 - f5), (int) (f6 - f5), (int) (f4 + f5), (int) (f6 + f5));
                    u4Var.h(rect);
                    if (j49Var.b()) {
                        M02 = jb6.M0(2131745374, null);
                    } else if (j49Var.s0) {
                        M02 = jb6.M0(2131754753, null);
                    } else if (j49Var.p0) {
                        M02 = jb6.M0(2131754757, null);
                    } else {
                        M02 = jb6.M0(2131754746, null);
                    }
                    u4Var.j(M02);
                    accessibilityNodeInfo.setEnabled(!j49Var.v0);
                    if (!j49Var.v0) {
                        u4Var.b(r4.d);
                        return;
                    }
                    return;
                }
                int L3 = gm.L(22.0f);
                float f7 = j49Var.l0;
                float f8 = L3;
                float f9 = j49Var.k0;
                rect.set((int) (f7 - f8), (int) (f9 - f8), (int) (f7 + f8), (int) (f9 + f8));
                u4Var.h(rect);
                if (j49Var.s0 && j49Var.B0) {
                    M0 = jb6.M0(2131754845, null);
                } else {
                    M0 = jb6.M0(2131754912, null);
                }
                u4Var.j(M0);
                if (j49Var.v0 || j49Var.b()) {
                    z2 = false;
                }
                accessibilityNodeInfo.setEnabled(z2);
                if (z2) {
                    u4Var.b(r4.d);
                    return;
                }
                return;
        }
    }

    public bz0(j49 j49Var, j49 j49Var2) {
        super(j49Var2);
        this.q = j49Var;
        this.p = new Rect();
    }
}
