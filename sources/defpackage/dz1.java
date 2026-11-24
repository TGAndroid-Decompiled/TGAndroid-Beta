package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class dz1 extends FrameLayout implements x74 {
    public static final int[] s = {2131232191, 2131232513, 2131231764, 2131232677, 2131231852, 2131232513, 2131232513};
    public final String[] a;
    public final wjb b;
    public final bl0 c;
    public final kl0 d;
    public final mv6[] e;
    public final cz1[] f;
    public o41 h;
    public p41 n;
    public int r;

    public dz1(Context context, wjb wjbVar, bl0 bl0Var, kl0 kl0Var) {
        super(context);
        this.a = new String[]{k96.M0(2131753950, null), k96.M0(2131754814, null), k96.M0(2131754841, null), k96.M0(2131754789, null), k96.M0(2131754803, null), k96.M0(2131754777, null), k96.M0(2131754778, null)};
        this.e = new mv6[7];
        this.f = new cz1[7];
        this.r = 83;
        this.d = kl0Var;
        this.c = bl0Var;
        this.b = wjbVar;
    }

    public final void a() {
        int i;
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            mv6[] mv6VarArr = this.e;
            if (i2 < mv6VarArr.length) {
                mv6 mv6Var = mv6VarArr[i2];
                if (mv6Var != null) {
                    pu1 pu1Var = (pu1) mv6Var.b;
                    float f2 = ((fm0) mv6Var.c).e;
                    float f3 = ((fm0) mv6Var.d).e;
                    if (f2 > 0.0f) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    pu1Var.setVisibility(i);
                    pu1Var.setAlpha(f2);
                    pu1Var.setScaleX(gl.R1(0.7f, 1.0f, f2));
                    pu1Var.setScaleY(gl.R1(0.7f, 1.0f, f2));
                    if (i2 != 0) {
                        pu1Var.setTranslationY(((1.0f - f2) * gl.L(80.0f)) - f);
                    }
                    f += (gl.L((f3 * 10.0f) + 10.0f) + gl.L(44.0f)) * f2;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final cz1 b(int i) {
        cz1[] cz1VarArr = this.f;
        if (cz1VarArr[i] == 0) {
            ?? obj = new Object();
            obj.a = 0;
            obj.b = false;
            obj.c = true;
            cz1VarArr[i] = obj;
        }
        return cz1VarArr[i];
    }

    public final void c(int i, int i2, boolean z) {
        boolean z2;
        b(i).a = i2;
        mv6 mv6Var = this.e[i];
        if (mv6Var != null) {
            ((pu1) mv6Var.b).a(i2, z);
            fm0 fm0Var = (fm0) mv6Var.d;
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
        mv6 mv6Var = this.e[1];
        if (mv6Var != null) {
            ((pu1) mv6Var.b).c(z, true);
        }
    }

    public final void e(final int i, boolean z, boolean z2) {
        Interpolator interpolator;
        long j;
        Interpolator interpolator2;
        long j2;
        int i2;
        int i3;
        mv6[] mv6VarArr = this.e;
        mv6 mv6Var = mv6VarArr[i];
        if (mv6Var == null && !z) {
            return;
        }
        if (mv6Var == null) {
            int i4 = i << 16;
            int i5 = i4 | 1;
            if (i == 0) {
                interpolator = s33.h;
                j = 300;
            } else {
                interpolator = tn.a;
                j = 280;
            }
            fm0 fm0Var = new fm0(i5, this, interpolator, j, false);
            int i6 = i4 | 2;
            if (i == 0) {
                interpolator2 = s33.h;
                j2 = 300;
            } else {
                interpolator2 = tn.a;
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
            wjb wjbVar = this.b;
            pu1 pu1Var = new pu1(context, wjbVar);
            ou1 d = ou1.d(context, this.d, this.c, wjbVar, i8, i7);
            pu1Var.b = d;
            pu1Var.addView(d, nme.e(i2, i2, 80));
            d.setIconPadding(gl.L(2.0f));
            ote.b(pu1Var, 0.13f, 2.0f);
            float f = i2 / 2.0f;
            pu1Var.setPivotX(gl.L(f));
            pu1Var.setPivotY(gl.L(f + 8.0f));
            pu1Var.setVisibility(8);
            pu1Var.setContentDescription(this.a[i]);
            pu1Var.setOnClickListener(new hb(this, i, (byte) 2));
            pu1Var.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    wl1 wl1Var;
                    boolean z3;
                    String M0;
                    p41 p41Var = dz1.this.n;
                    if (p41Var != null) {
                        mu1 mu1Var = ((yk1) p41Var).b;
                        byte b = i;
                        if (b == 2) {
                            wl1Var = new wl1(mu1Var, (byte) 13);
                            z3 = true;
                        } else if (b == 3) {
                            wl1Var = new wl1(mu1Var, (byte) 14);
                            z3 = false;
                        } else if (b == 4) {
                            wl1Var = new wl1(mu1Var, (byte) 15);
                            z3 = true;
                        } else {
                            return false;
                        }
                        Activity parentActivity = mu1Var.getParentActivity();
                        ui5 parentLayout = mu1Var.getParentLayout();
                        at1 at1Var = mu1Var.m1;
                        wjb resourceProvider = mu1Var.getResourceProvider();
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(gl.L(200.0f));
                        a8 a8Var = new a8(0, resourceProvider, parentActivity, true, true);
                        a8Var.setMinimumWidth(gl.L(200.0f));
                        if (!z3) {
                            M0 = k96.M0(2131746179, null);
                        } else if (z3) {
                            M0 = k96.M0(2131746181, null);
                        } else {
                            M0 = k96.M0(2131746180, null);
                        }
                        a8Var.j(M0, 2131232361, null);
                        a8Var.setOnClickListener(new nk3(wl1Var, (byte) 6));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        m8Var.e = true;
                        m8Var.c = (short) 220;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(2131755192);
                        m8Var.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE));
                        m8Var.setInputMethodMode(2);
                        m8Var.setSoftInputMode(0);
                        m8Var.getContentView().setFocusableInTouchMode(true);
                        PointF pointF = new PointF();
                        zec.b(view, at1Var, pointF);
                        float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + gl.L(8.0f);
                        float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        if (gl.O1()) {
                            ViewGroup view2 = parentLayout.getView();
                            width += view2.getX() + view2.getPaddingLeft();
                            measuredHeight += view2.getY() + view2.getPaddingTop();
                        }
                        m8Var.showAtLocation(at1Var, 51, (int) width, (int) measuredHeight);
                        mu1Var.g9 = m8Var;
                        mu1Var.q6(mu1Var.y1, false);
                        mu1Var.g9.setOnDismissListener(new x6(mu1Var, (byte) 2));
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
                ou1 ou1Var = pu1Var.b;
                ou1Var.h = -1.0f;
                ou1Var.a();
            }
            boolean z3 = true;
            if (i == 1) {
                pu1Var.d = true;
                kx2 kx2Var = pu1Var.c;
                if (kx2Var != null) {
                    kx2Var.setReverse(true);
                }
            }
            addView(pu1Var, nme.e(i2, i2 + 8, this.r));
            mv6VarArr[i] = new mv6(pu1Var, fm0Var, fm0Var2, false, (byte) 18);
            cz1 cz1Var = this.f[i];
            if (cz1Var != null) {
                pu1Var.a(cz1Var.a, false);
                fm0Var.a(false, false);
                if (cz1Var.a <= 0) {
                    z3 = false;
                }
                fm0Var2.a(z3, false);
                pu1Var.c(cz1Var.b, false);
                pu1Var.b(cz1Var.c, false);
            }
            a();
        }
        ((fm0) mv6VarArr[i].c).a(z, z2);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            mv6[] mv6VarArr = this.e;
            if (i2 < mv6VarArr.length && mv6VarArr[i2] != null) {
                if (i3 == 1 || i3 == 2) {
                    a();
                }
            }
        }
    }

    public void setGravity(int i) {
        this.r = i;
    }

    public void setOnClickListener(o41 o41Var) {
        this.h = o41Var;
    }

    public void setOnLongClickListener(p41 p41Var) {
        this.n = p41Var;
    }

    @Override
    public final void F(float f, int i) {
    }
}
