package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vz1 extends FrameLayout implements s84 {
    public static final int[] s = {2131232191, 2131232524, 2131231764, 2131232688, 2131231852, 2131232524, 2131232524};
    public final String[] a;
    public final vnb b;
    public final cl0 c;
    public final ll0 d;
    public final rx6[] e;
    public final uz1[] f;
    public w41 h;
    public x41 n;
    public int r;

    public vz1(Context context, vnb vnbVar, cl0 cl0Var, ll0 ll0Var) {
        super(context);
        this.a = new String[]{ob6.M0(2131753946, null), ob6.M0(2131754810, null), ob6.M0(2131754837, null), ob6.M0(2131754785, null), ob6.M0(2131754799, null), ob6.M0(2131754773, null), ob6.M0(2131754774, null)};
        this.e = new rx6[7];
        this.f = new uz1[7];
        this.r = 83;
        this.d = ll0Var;
        this.c = cl0Var;
        this.b = vnbVar;
    }

    public final void a() {
        int i;
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            rx6[] rx6VarArr = this.e;
            if (i2 < rx6VarArr.length) {
                rx6 rx6Var = rx6VarArr[i2];
                if (rx6Var != null) {
                    cv1 cv1Var = (cv1) rx6Var.b;
                    float f2 = ((fm0) rx6Var.c).e;
                    float f3 = ((fm0) rx6Var.d).e;
                    if (f2 > 0.0f) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    cv1Var.setVisibility(i);
                    cv1Var.setAlpha(f2);
                    cv1Var.setScaleX(hl.R1(0.7f, 1.0f, f2));
                    cv1Var.setScaleY(hl.R1(0.7f, 1.0f, f2));
                    if (i2 != 0) {
                        cv1Var.setTranslationY(((1.0f - f2) * hl.L(80.0f)) - f);
                    }
                    f += (hl.L((f3 * 10.0f) + 10.0f) + hl.L(44.0f)) * f2;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final uz1 b(int i) {
        uz1[] uz1VarArr = this.f;
        if (uz1VarArr[i] == 0) {
            ?? obj = new Object();
            obj.a = 0;
            obj.b = false;
            obj.c = true;
            uz1VarArr[i] = obj;
        }
        return uz1VarArr[i];
    }

    public final void c(int i, int i2, boolean z) {
        boolean z2;
        b(i).a = i2;
        rx6 rx6Var = this.e[i];
        if (rx6Var != null) {
            ((cv1) rx6Var.b).a(i2, z);
            fm0 fm0Var = (fm0) rx6Var.d;
            if (i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            fm0Var.a(z2, z);
        }
    }

    public final void d(boolean z) {
        b(1).b = z;
        rx6 rx6Var = this.e[1];
        if (rx6Var != null) {
            ((cv1) rx6Var.b).c(z, true);
        }
    }

    public final void e(final int i, boolean z, boolean z2) {
        Interpolator interpolator;
        long j;
        Interpolator interpolator2;
        long j2;
        int i2;
        int i3;
        rx6[] rx6VarArr = this.e;
        rx6 rx6Var = rx6VarArr[i];
        if (rx6Var == null && !z) {
            return;
        }
        if (rx6Var == null) {
            int i4 = i << 16;
            int i5 = i4 | 1;
            if (i == 0) {
                interpolator = k43.h;
                j = 300;
            } else {
                interpolator = un.a;
                j = 280;
            }
            fm0 fm0Var = new fm0(i5, this, interpolator, j, false);
            int i6 = i4 | 2;
            if (i == 0) {
                interpolator2 = k43.h;
                j2 = 300;
            } else {
                interpolator2 = un.a;
                j2 = 280;
            }
            fm0 fm0Var2 = new fm0(i6, this, interpolator2, j2, false);
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
            vnb vnbVar = this.b;
            cv1 cv1Var = new cv1(context, vnbVar);
            bv1 d = bv1.d(context, this.d, this.c, vnbVar, i8, i7);
            cv1Var.b = d;
            cv1Var.addView(d, tre.e(i2, i2, 80));
            d.setIconPadding(hl.L(2.0f));
            iye.b(cv1Var, 0.13f, 2.0f);
            float f = i2 / 2.0f;
            cv1Var.setPivotX(hl.L(f));
            cv1Var.setPivotY(hl.L(f + 8.0f));
            cv1Var.setVisibility(8);
            cv1Var.setContentDescription(this.a[i]);
            cv1Var.setOnClickListener(new ib(this, i, (byte) 2));
            cv1Var.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    hm1 hm1Var;
                    boolean z3;
                    String M0;
                    x41 x41Var = vz1.this.n;
                    if (x41Var != null) {
                        zu1 zu1Var = ((el1) x41Var).b;
                        byte b = i;
                        if (b == 2) {
                            hm1Var = new hm1(zu1Var, (byte) 0);
                            z3 = true;
                        } else if (b == 3) {
                            hm1Var = new hm1(zu1Var, (byte) 1);
                            z3 = false;
                        } else if (b == 4) {
                            hm1Var = new hm1(zu1Var, (byte) 2);
                            z3 = true;
                        }
                        Activity parentActivity = zu1Var.getParentActivity();
                        wk5 parentLayout = zu1Var.getParentLayout();
                        nt1 nt1Var = zu1Var.m1;
                        vnb resourceProvider = zu1Var.getResourceProvider();
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(hl.L(200.0f));
                        b8 b8Var = new b8(0, resourceProvider, parentActivity, true, true);
                        b8Var.setMinimumWidth(hl.L(200.0f));
                        if (!z3) {
                            M0 = ob6.M0(2131746099, null);
                        } else if (z3) {
                            M0 = ob6.M0(2131746101, null);
                        } else {
                            M0 = ob6.M0(2131746100, null);
                        }
                        b8Var.j(M0, 2131232361, null);
                        b8Var.setOnClickListener(new el3(hm1Var, (byte) 6));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
                        n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        n8Var.e = true;
                        n8Var.c = (short) 220;
                        n8Var.setOutsideTouchable(true);
                        n8Var.setClippingEnabled(true);
                        n8Var.setAnimationStyle(2131755192);
                        n8Var.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE));
                        n8Var.setInputMethodMode(2);
                        n8Var.setSoftInputMode(0);
                        n8Var.getContentView().setFocusableInTouchMode(true);
                        PointF pointF = new PointF();
                        yic.b(view, nt1Var, pointF);
                        float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + hl.L(8.0f);
                        float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        if (hl.O1()) {
                            ViewGroup view2 = parentLayout.getView();
                            width += view2.getX() + view2.getPaddingLeft();
                            measuredHeight += view2.getY() + view2.getPaddingTop();
                        }
                        n8Var.showAtLocation(nt1Var, 51, (int) width, (int) measuredHeight);
                        zu1Var.g9 = n8Var;
                        zu1Var.x6(zu1Var.y1, false);
                        zu1Var.g9.setOnDismissListener(new y6(zu1Var, (byte) 2));
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
                bv1 bv1Var = cv1Var.b;
                bv1Var.h = -1.0f;
                bv1Var.a();
            }
            boolean z3 = true;
            if (i == 1) {
                cv1Var.d = true;
                ey2 ey2Var = cv1Var.c;
                if (ey2Var != null) {
                    ey2Var.setReverse(true);
                }
            }
            addView(cv1Var, tre.e(i2, i2 + 8, this.r));
            rx6VarArr[i] = new rx6(cv1Var, fm0Var, fm0Var2, false, (byte) 18);
            uz1 uz1Var = this.f[i];
            if (uz1Var != null) {
                cv1Var.a(uz1Var.a, false);
                fm0Var.a(false, false);
                if (uz1Var.a <= 0) {
                    z3 = false;
                }
                fm0Var2.a(z3, false);
                cv1Var.c(uz1Var.b, false);
                cv1Var.b(uz1Var.c, false);
            }
            a();
        }
        ((fm0) rx6VarArr[i].c).a(z, z2);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i) {
        this.r = i;
    }

    public void setOnClickListener(w41 w41Var) {
        this.h = w41Var;
    }

    public void setOnLongClickListener(x41 x41Var) {
        this.n = x41Var;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            rx6[] rx6VarArr = this.e;
            if (i2 < rx6VarArr.length && rx6VarArr[i2] != null) {
                if (i3 == 1 || i3 == 2) {
                    a();
                }
            }
        }
    }

    @Override
    public final void v0(float f, int i) {
    }
}
