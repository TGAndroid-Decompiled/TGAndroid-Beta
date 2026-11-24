package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class q02 extends FrameLayout implements g94 {
    public static final int[] s = {2131232192, 2131232525, 2131231765, 2131232689, 2131231853, 2131232525, 2131232525};
    public final String[] a;
    public final ylb b;
    public final bm0 c;
    public final km0 d;
    public final mx6[] e;
    public final p02[] f;
    public v51 h;
    public w51 n;
    public int r;

    public q02(Context context, ylb ylbVar, bm0 bm0Var, km0 km0Var) {
        super(context);
        this.a = new String[]{jb6.M0(2131753918, null), jb6.M0(2131754814, null), jb6.M0(2131754841, null), jb6.M0(2131754789, null), jb6.M0(2131754803, null), jb6.M0(2131754777, null), jb6.M0(2131754778, null)};
        this.e = new mx6[7];
        this.f = new p02[7];
        this.r = 83;
        this.d = km0Var;
        this.c = bm0Var;
        this.b = ylbVar;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            mx6[] mx6VarArr = this.e;
            if (i2 < mx6VarArr.length && mx6VarArr[i2] != null) {
                if (i3 == 1 || i3 == 2) {
                    a();
                }
            }
        }
    }

    public final void a() {
        int i;
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            mx6[] mx6VarArr = this.e;
            if (i2 < mx6VarArr.length) {
                mx6 mx6Var = mx6VarArr[i2];
                if (mx6Var != null) {
                    bw1 bw1Var = (bw1) mx6Var.b;
                    float f2 = ((fn0) mx6Var.c).e;
                    float f3 = ((fn0) mx6Var.d).e;
                    if (f2 > 0.0f) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    bw1Var.setVisibility(i);
                    bw1Var.setAlpha(f2);
                    bw1Var.setScaleX(gm.R1(0.7f, 1.0f, f2));
                    bw1Var.setScaleY(gm.R1(0.7f, 1.0f, f2));
                    if (i2 != 0) {
                        bw1Var.setTranslationY(((1.0f - f2) * gm.L(80.0f)) - f);
                    }
                    f += (gm.L((f3 * 10.0f) + 10.0f) + gm.L(44.0f)) * f2;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final p02 b(int i) {
        p02[] p02VarArr = this.f;
        if (p02VarArr[i] == 0) {
            ?? obj = new Object();
            obj.a = 0;
            obj.b = false;
            obj.c = true;
            p02VarArr[i] = obj;
        }
        return p02VarArr[i];
    }

    public final void c(int i, int i2, boolean z) {
        boolean z2;
        b(i).a = i2;
        mx6 mx6Var = this.e[i];
        if (mx6Var != null) {
            ((bw1) mx6Var.b).a(i2, z);
            fn0 fn0Var = (fn0) mx6Var.d;
            if (i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            fn0Var.a(z2, z);
        }
    }

    public final void d(boolean z) {
        b(1).b = z;
        mx6 mx6Var = this.e[1];
        if (mx6Var != null) {
            ((bw1) mx6Var.b).c(z, true);
        }
    }

    public final void e(final int i, boolean z, boolean z2) {
        Interpolator interpolator;
        long j;
        Interpolator interpolator2;
        long j2;
        int i2;
        int i3;
        mx6[] mx6VarArr = this.e;
        mx6 mx6Var = mx6VarArr[i];
        if (mx6Var == null && !z) {
            return;
        }
        if (mx6Var == null) {
            int i4 = i << 16;
            int i5 = i4 | 1;
            if (i == 0) {
                interpolator = d53.h;
                j = 300;
            } else {
                interpolator = uo.a;
                j = 280;
            }
            fn0 fn0Var = new fn0(i5, this, interpolator, j, false);
            int i6 = i4 | 2;
            if (i == 0) {
                interpolator2 = d53.h;
                j2 = 300;
            } else {
                interpolator2 = uo.a;
                j2 = 280;
            }
            fn0 fn0Var2 = new fn0(i6, this, interpolator2, j2, false);
            if (i == 0) {
                i2 = 50;
                i3 = 32;
            } else {
                i2 = 56;
                i3 = 48;
            }
            int i7 = i3;
            Context context = getContext();
            int i8 = s[i];
            ylb ylbVar = this.b;
            bw1 bw1Var = new bw1(context, ylbVar);
            aw1 d = aw1.d(context, this.d, this.c, ylbVar, i8, i7);
            bw1Var.b = d;
            bw1Var.addView(d, qoe.e(i2, i2, 80));
            d.setIconPadding(gm.L(2.0f));
            rve.b(bw1Var, 0.13f, 2.0f);
            float f = i2 / 2.0f;
            bw1Var.setPivotX(gm.L(f));
            bw1Var.setPivotY(gm.L(f + 8.0f));
            bw1Var.setVisibility(8);
            bw1Var.setContentDescription(this.a[i]);
            bw1Var.setOnClickListener(new hb(this, i, (byte) 2));
            bw1Var.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    en1 en1Var;
                    boolean z3;
                    String M0;
                    w51 w51Var = q02.this.n;
                    if (w51Var != null) {
                        yv1 yv1Var = ((gm1) w51Var).b;
                        byte b = i;
                        if (b == 2) {
                            en1Var = new en1(yv1Var, (byte) 14);
                            z3 = true;
                        } else if (b == 3) {
                            en1Var = new en1(yv1Var, (byte) 15);
                            z3 = false;
                        } else if (b == 4) {
                            en1Var = new en1(yv1Var, (byte) 16);
                            z3 = true;
                        } else {
                            return false;
                        }
                        Activity parentActivity = yv1Var.getParentActivity();
                        tk5 parentLayout = yv1Var.getParentLayout();
                        mu1 mu1Var = yv1Var.m1;
                        ylb resourceProvider = yv1Var.getResourceProvider();
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(gm.L(200.0f));
                        a8 a8Var = new a8(0, resourceProvider, parentActivity, true, true);
                        a8Var.setMinimumWidth(gm.L(200.0f));
                        if (!z3) {
                            M0 = jb6.M0(2131746105, null);
                        } else if (z3) {
                            M0 = jb6.M0(2131746107, null);
                        } else {
                            M0 = jb6.M0(2131746106, null);
                        }
                        a8Var.j(M0, 2131232362, null);
                        a8Var.setOnClickListener(new xl3(en1Var, (byte) 6));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        m8Var.e = true;
                        m8Var.c = (short) 220;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(2131755192);
                        m8Var.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE));
                        m8Var.setInputMethodMode(2);
                        m8Var.setSoftInputMode(0);
                        m8Var.getContentView().setFocusableInTouchMode(true);
                        PointF pointF = new PointF();
                        zgc.b(view, mu1Var, pointF);
                        float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + gm.L(8.0f);
                        float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        if (gm.O1()) {
                            ViewGroup view2 = parentLayout.getView();
                            width += view2.getX() + view2.getPaddingLeft();
                            measuredHeight += view2.getY() + view2.getPaddingTop();
                        }
                        m8Var.showAtLocation(mu1Var, 51, (int) width, (int) measuredHeight);
                        yv1Var.g9 = m8Var;
                        yv1Var.x6(yv1Var.y1, false);
                        yv1Var.g9.setOnDismissListener(new x6(yv1Var, (byte) 2));
                        try {
                            view.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        return true;
                    }
                    return false;
                }
            });
            if (i == 6) {
                aw1 aw1Var = bw1Var.b;
                aw1Var.h = -1.0f;
                aw1Var.a();
            }
            boolean z3 = true;
            if (i == 1) {
                bw1Var.d = true;
                uy2 uy2Var = bw1Var.c;
                if (uy2Var != null) {
                    uy2Var.setReverse(true);
                }
            }
            addView(bw1Var, qoe.e(i2, i2 + 8, this.r));
            mx6VarArr[i] = new mx6(bw1Var, fn0Var, fn0Var2, false, (byte) 18);
            p02 p02Var = this.f[i];
            if (p02Var != null) {
                bw1Var.a(p02Var.a, false);
                fn0Var.a(false, false);
                if (p02Var.a <= 0) {
                    z3 = false;
                }
                fn0Var2.a(z3, false);
                bw1Var.c(p02Var.b, false);
                bw1Var.b(p02Var.c, false);
            }
            a();
        }
        ((fn0) mx6VarArr[i].c).a(z, z2);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i) {
        this.r = i;
    }

    public void setOnClickListener(v51 v51Var) {
        this.h = v51Var;
    }

    public void setOnLongClickListener(w51 w51Var) {
        this.n = w51Var;
    }

    @Override
    public final void V(float f, int i) {
    }
}
