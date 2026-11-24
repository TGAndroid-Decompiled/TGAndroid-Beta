package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashSet;
public class su1 extends FrameLayout implements x74, tjb {
    public static final int[] I = {2131232359, 2131231507, 2131231509, 2131232187, 2131232187};
    public static final int[] J = {0};
    public static final int[] K = {1, 2, 3, 4};
    public static final RectF L = new RectF();
    public float E;
    public float F;
    public final Paint G;
    public int H;
    public final qx[] a;
    public final View.OnClickListener[] b;
    public final yk1[] c;
    public ru1 d;
    public final FrameLayout e;
    public final HashSet f;
    public final wjb h;
    public final kl0 n;
    public final al0 r;
    public il0 s;
    public final fm0 w;
    public final fm0 x;
    public float y;

    public su1(Context context, wjb wjbVar, al0 al0Var, kl0 kl0Var) {
        super(context);
        this.a = new qx[5];
        this.b = new View.OnClickListener[5];
        this.c = new yk1[5];
        this.f = new HashSet();
        s33 s33Var = s33.h;
        this.w = new fm0(99, this, s33Var, 320L, false);
        this.x = new fm0(100, this, s33Var, 320L, false);
        this.G = new Paint(1);
        this.H = 0;
        this.n = kl0Var;
        this.r = al0Var;
        this.h = wjbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        xi xiVar = zdc.a;
        frameLayout.setOutlineProvider(new xdc(0, gl.L(22.0f)));
        addView(frameLayout, nme.e(-1, 44, 16));
    }

    @Override
    public final void D(float f, int i) {
        qx qxVar;
        je5 je5Var;
        if (i == 99 || i == 100) {
            invalidate();
        }
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            qx[] qxVarArr = this.a;
            if (i2 < qxVarArr.length && (qxVar = qxVarArr[i2]) != null && i3 == 1 && ((fm0) qxVar.d).f) {
                yk1 yk1Var = this.c[i2];
                if (yk1Var != null) {
                    final ou1 ou1Var = (ou1) qxVar.c;
                    boolean z = qxVar.b;
                    byte b = yk1Var.a;
                    final mu1 mu1Var = yk1Var.b;
                    switch (b) {
                        case 28:
                            if (mu1Var.Y0 == null && !z && (((je5Var = mu1Var.a1) == null || !je5Var.W) && le5.h.c())) {
                                gl.e3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        ou1 ou1Var2 = ou1Var;
                                        mu1 mu1Var2 = mu1Var;
                                        switch (b2) {
                                            case 0:
                                                if (mu1Var2.getParentActivity() != null) {
                                                    float f2 = mu1Var2.w.f(2).d / gl.p;
                                                    float width = ((ou1Var2.getWidth() / 2.0f) + (mu1Var2.m1.getWidth() - (ou1Var2.getX() + ou1Var2.getWidth()))) / gl.p;
                                                    je5 je5Var2 = new je5(mu1Var2.getParentActivity(), 3);
                                                    mu1Var2.a1 = je5Var2;
                                                    je5Var2.setPadding(gl.L(7.33f), 0, gl.L(7.33f), 0);
                                                    mu1Var2.a1.k(mu1Var2.L);
                                                    mu1Var2.a1.p(false);
                                                    je5 je5Var3 = mu1Var2.a1;
                                                    String M0 = k96.M0(2131744183, null);
                                                    if (je5Var3.getMeasuredWidth() < 0) {
                                                        je5Var3.H = M0;
                                                    } else {
                                                        je5Var3.I.t(M0, !k96.a0, true);
                                                    }
                                                    mu1Var2.a1.n(1.0f, (-width) + 7.33f);
                                                    mu1Var2.m1.addView(mu1Var2.a1, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f2 + 50.0f));
                                                    je5 je5Var4 = mu1Var2.a1;
                                                    je5Var4.r0 = new vm1(mu1Var2, (byte) 17);
                                                    je5Var4.v();
                                                    le5.f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (mu1Var2.getParentActivity() != null) {
                                                    float f3 = mu1Var2.w.f(2).d / gl.p;
                                                    float width2 = ((ou1Var2.getWidth() / 2.0f) + (mu1Var2.m1.getWidth() - (ou1Var2.getX() + ou1Var2.getWidth()))) / gl.p;
                                                    je5 je5Var5 = new je5(mu1Var2.getParentActivity(), 3);
                                                    mu1Var2.Y0 = je5Var5;
                                                    je5Var5.setPadding(gl.L(7.33f), 0, gl.L(7.33f), 0);
                                                    mu1Var2.Y0.k(mu1Var2.L);
                                                    mu1Var2.Y0.p(false);
                                                    mu1Var2.Y0.t(k96.M0(2131750235, null));
                                                    mu1Var2.Y0.n(1.0f, (-width2) + 7.33f);
                                                    mu1Var2.m1.addView(mu1Var2.Y0, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f3 + 50.0f));
                                                    je5 je5Var6 = mu1Var2.Y0;
                                                    je5Var6.r0 = new wl1(mu1Var2, (byte) 20);
                                                    je5Var6.v();
                                                    le5.h.b();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, 400L);
                                break;
                            }
                            break;
                        default:
                            if (mu1Var.a1 == null && !z && le5.f.c()) {
                                gl.e3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        ou1 ou1Var2 = ou1Var;
                                        mu1 mu1Var2 = mu1Var;
                                        switch (b2) {
                                            case 0:
                                                if (mu1Var2.getParentActivity() != null) {
                                                    float f2 = mu1Var2.w.f(2).d / gl.p;
                                                    float width = ((ou1Var2.getWidth() / 2.0f) + (mu1Var2.m1.getWidth() - (ou1Var2.getX() + ou1Var2.getWidth()))) / gl.p;
                                                    je5 je5Var2 = new je5(mu1Var2.getParentActivity(), 3);
                                                    mu1Var2.a1 = je5Var2;
                                                    je5Var2.setPadding(gl.L(7.33f), 0, gl.L(7.33f), 0);
                                                    mu1Var2.a1.k(mu1Var2.L);
                                                    mu1Var2.a1.p(false);
                                                    je5 je5Var3 = mu1Var2.a1;
                                                    String M0 = k96.M0(2131744183, null);
                                                    if (je5Var3.getMeasuredWidth() < 0) {
                                                        je5Var3.H = M0;
                                                    } else {
                                                        je5Var3.I.t(M0, !k96.a0, true);
                                                    }
                                                    mu1Var2.a1.n(1.0f, (-width) + 7.33f);
                                                    mu1Var2.m1.addView(mu1Var2.a1, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f2 + 50.0f));
                                                    je5 je5Var4 = mu1Var2.a1;
                                                    je5Var4.r0 = new vm1(mu1Var2, (byte) 17);
                                                    je5Var4.v();
                                                    le5.f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (mu1Var2.getParentActivity() != null) {
                                                    float f3 = mu1Var2.w.f(2).d / gl.p;
                                                    float width2 = ((ou1Var2.getWidth() / 2.0f) + (mu1Var2.m1.getWidth() - (ou1Var2.getX() + ou1Var2.getWidth()))) / gl.p;
                                                    je5 je5Var5 = new je5(mu1Var2.getParentActivity(), 3);
                                                    mu1Var2.Y0 = je5Var5;
                                                    je5Var5.setPadding(gl.L(7.33f), 0, gl.L(7.33f), 0);
                                                    mu1Var2.Y0.k(mu1Var2.L);
                                                    mu1Var2.Y0.p(false);
                                                    mu1Var2.Y0.t(k96.M0(2131750235, null));
                                                    mu1Var2.Y0.n(1.0f, (-width2) + 7.33f);
                                                    mu1Var2.m1.addView(mu1Var2.Y0, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f3 + 50.0f));
                                                    je5 je5Var6 = mu1Var2.Y0;
                                                    je5Var6.r0 = new wl1(mu1Var2, (byte) 20);
                                                    je5Var6.v();
                                                    le5.h.b();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, 400L);
                                break;
                            }
                            break;
                    }
                }
                qxVar.b = true;
            }
        }
    }

    public final void a() {
        int[] iArr;
        View childAt;
        int i;
        float f = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        qx[] qxVarArr = this.a;
        for (qx qxVar : qxVarArr) {
            if (qxVar != null) {
                ou1 ou1Var = (ou1) qxVar.c;
                float f2 = ((fm0) qxVar.d).e * this.y;
                if (f2 > 0.0f) {
                    i = 0;
                } else {
                    i = 8;
                }
                ou1Var.setVisibility(i);
                ou1Var.setAlpha(f2);
                ou1Var.setScaleX(gl.R1(0.4f, 1.0f, f2));
                ou1Var.setScaleY(gl.R1(0.4f, 1.0f, f2));
            }
        }
        int[] iArr2 = J;
        qx qxVar2 = qxVarArr[iArr2[0]];
        if (qxVar2 != null) {
            float L2 = ((fm0) qxVar2.d).e * gl.L(54.0f);
            ((ou1) qxVar2.c).setTranslationX(gl.L(1.0f) + this.E);
            this.E += L2;
        }
        int i2 = 0;
        while (true) {
            iArr = K;
            if (i2 >= 4) {
                break;
            }
            qx qxVar3 = qxVarArr[iArr[i2]];
            if (qxVar3 != null) {
                ou1 ou1Var2 = (ou1) qxVar3.c;
                float L3 = ((fm0) qxVar3.d).e * gl.L(54.0f);
                ou1Var2.setTranslationX(((getMeasuredWidth() - ou1Var2.getMeasuredWidth()) - gl.L(1.0f)) - this.F);
                this.F += L3;
            }
            i2++;
        }
        if (this.y < 1.0f) {
            qx qxVar4 = qxVarArr[iArr2[0]];
            if (qxVar4 != null) {
                ou1 ou1Var3 = (ou1) qxVar4.c;
                ou1Var3.setTranslationX(ou1Var3.getTranslationX() - ((1.0f - this.y) * this.E));
            }
            for (int i3 = 0; i3 < 4; i3++) {
                qx qxVar5 = qxVarArr[iArr[i3]];
                if (qxVar5 != null) {
                    ou1 ou1Var4 = (ou1) qxVar5.c;
                    ou1Var4.setTranslationX(((1.0f - this.y) * this.F) + ou1Var4.getTranslationX());
                }
            }
            float f3 = this.E;
            float f4 = this.y;
            this.E = f3 * f4;
            this.F *= f4;
        }
        float f5 = this.x.e;
        if (f5 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i4 = 0; i4 < getContainer().getChildCount(); i4++) {
                if (this.f.contains(getContainer().getChildAt(i4))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f = Math.max(f, childAt.getRight());
                }
            }
            if (measuredWidth > f) {
                f = (measuredWidth + f) / 2.0f;
                measuredWidth = f;
            }
            this.E = gl.R1(this.E, measuredWidth - gl.L(3.33f), f5);
            this.F = gl.R1(this.F, (getMeasuredWidth() - f) - gl.L(17.66f), f5);
        }
        ru1 ru1Var = this.d;
        if (ru1Var != null) {
            float f6 = this.E;
            float f7 = this.F;
            j92 j92Var = ((eo1) ru1Var).b.U;
            j92Var.F = f6;
            j92Var.G = f7;
            j92Var.invalidate();
        }
    }

    public final void b(boolean z) {
        int i;
        int i2;
        int L2 = gl.L(7.0f);
        int L3 = gl.L(7.0f);
        int i3 = J[0];
        qx[] qxVarArr = this.a;
        qx qxVar = qxVarArr[i3];
        if (qxVar != null) {
            if (((fm0) qxVar.d).f) {
                i2 = gl.L(54.0f);
            } else {
                i2 = 0;
            }
            L2 += i2;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            qx qxVar2 = qxVarArr[K[i4]];
            if (qxVar2 != null) {
                if (((fm0) qxVar2.d).f) {
                    i = gl.L(54.0f);
                } else {
                    i = 0;
                }
                L3 += i;
            }
        }
        FrameLayout frameLayout = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin != L2 || marginLayoutParams.rightMargin != L3) {
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L3;
            if (z) {
                frameLayout.requestLayout();
            }
        }
    }

    public final void c(int i, boolean z, boolean z2) {
        if (i >= 0) {
            qx[] qxVarArr = this.a;
            if (i < qxVarArr.length) {
                if (qxVarArr[i] == null) {
                    if (z) {
                        fm0 fm0Var = new fm0((i << 16) | 1, this, s33.h, 300L, false);
                        ou1 d = ou1.d(getContext(), this.n, this.r, this.h, I[i], 48);
                        if (i == 1) {
                            d.setContentDescription(k96.M0(2131746544, null));
                        } else if (i == 2) {
                            d.setContentDescription(k96.M0(2131752325, null));
                        } else if (i == 0) {
                            d.setContentDescription(k96.M0(2131745644, null));
                        } else if (i == 3) {
                            d.setContentDescription(k96.M0(2131752868, null));
                        }
                        ote.b(d, 0.13f, 2.0f);
                        d.setVisibility(8);
                        d.setOnClickListener(new hb(this, i, (byte) 1));
                        addView(d, nme.c(56.0f, 56));
                        qxVarArr[i] = new qx(d, fm0Var);
                        a();
                    } else {
                        return;
                    }
                }
                ((fm0) qxVarArr[i].d).a(z, z2);
            }
        }
    }

    public final void d(boolean z) {
        boolean z2 = false;
        z2 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z3 = false;
            for (int i = 0; i < getContainer().getChildCount(); i++) {
                View childAt = getContainer().getChildAt(i);
                if (this.f.contains(childAt) && childAt.getVisibility() == 0) {
                    z3 = true;
                }
            }
            z2 = z3;
        }
        this.x.a(z2, z);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i = (int) (this.y * 255.0f * this.w.e);
        if (i > 0) {
            float measuredWidth = (getMeasuredWidth() - gl.L(10.0f)) - this.F;
            float measuredHeight = getMeasuredHeight() - gl.L(9.0f);
            RectF rectF = L;
            rectF.set(this.E + gl.L(10.0f), gl.L(9.0f), measuredWidth, measuredHeight);
            int i2 = this.H;
            Paint paint = this.G;
            paint.setColor(i2);
            paint.setAlpha(i);
            canvas.drawRoundRect(rectF, gl.L(19.0f), gl.L(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.e && this.s != null) {
            RectF rectF = L;
            rectF.set(this.E + gl.L(1.0f), 0.0f, (getMeasuredWidth() - gl.L(1.0f)) - this.F, getMeasuredHeight());
            Rect rect = gl.Q;
            rectF.round(rect);
            this.s.setBounds(rect);
            this.s.draw(canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    public FrameLayout getContainer() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        b(false);
        super.onMeasure(i, i2);
        a();
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 99) {
            invalidate();
            return;
        }
        if (i == 100) {
            a();
            invalidate();
        }
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            qx[] qxVarArr = this.a;
            if (i2 < qxVarArr.length && qxVarArr[i2] != null && i3 == 1) {
                b(true);
                a();
                invalidate();
            }
        }
    }

    public void setAccentColor(int i) {
        this.H = i;
    }

    public void setOnButtonsTotalWidthChanged(ru1 ru1Var) {
        this.d = ru1Var;
    }

    public void setTotalVisibilityFactor(float f) {
        if (this.y != f) {
            this.y = f;
            a();
            invalidate();
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        d(false);
    }

    @Override
    public final void updateColors() {
        qx[] qxVarArr;
        for (qx qxVar : this.a) {
            if (qxVar != null) {
                ((ou1) qxVar.c).updateColors();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
