package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.m;
import org.telegram.ui.o;
public abstract class puc extends FrameLayout {
    public final muc A0;
    public boolean B0;
    public int E;
    public final TextPaint F;
    public int G;
    public float H;
    public final t1 I;
    public final t1 J;
    public final ImageView K;
    public final fg0 L;
    public final ImageView M;
    public final ee0 N;
    public final fg0 O;
    public final ImageView P;
    public final foc Q;
    public final fg0 R;
    public final ImageView S;
    public final fg0 T;
    public boolean U;
    public float V;
    public final vc W;
    public final RectF a;
    public boolean a0;
    public final mg0[] b;
    public float b0;
    public float c;
    public final vc c0;
    public final float[] d;
    public int d0;
    public final boolean[] e;
    public final k46 e0;
    public final Paint[] f;
    public boolean f0;
    public qac g0;
    public final Paint[] h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public ValueAnimator l0;
    public int m0;
    public final Paint[] n;
    public int n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final Paint r;
    public boolean r0;
    public final Paint s;
    public final in3 s0;
    public boolean t0;
    public ValueAnimator u0;
    public boolean v0;
    public final Paint w;
    public x0 w0;
    public int x;
    public ValueAnimator x0;
    public int y;
    public float y0;
    public long z0;

    public puc(Activity activity) {
        super(activity);
        this.a = new RectF();
        this.b = new mg0[2];
        this.c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f = new Paint[2];
        this.h = new Paint[2];
        this.n = new Paint[2];
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.G = gm.L(56.0f);
        this.H = 1.0f;
        this.V = 0.0f;
        this.b0 = 0.0f;
        this.h0 = -1;
        this.s0 = new in3((byte) 7);
        final wu wuVar = (wu) this;
        this.A0 = new muc(wuVar, (byte) 0);
        this.B0 = false;
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(18.33f));
        for (int i = 0; i < 2; i++) {
            this.f[i] = new Paint(1);
            this.h[i] = new Paint(1);
            this.n[i] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        addView(frameLayout, qoe.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        addView(frameLayout2, qoe.e(-1, 56, 87));
        t1 t1Var = new t1((byte) 12, activity, false);
        this.I = t1Var;
        t1Var.setOrientation(0);
        addView(t1Var, qoe.e(-2, 56, 83));
        ImageView imageView = new ImageView(activity);
        this.M = imageView;
        imageView.setContentDescription(jb6.M0(2131754878, null));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ee0 ee0Var = new ee0(false);
        this.N = ee0Var;
        ee0Var.k = 200.0f;
        ee0Var.c(false, 1.0f);
        imageView.setImageDrawable(ee0Var);
        fg0 f0 = cmb.f0(1090519039, 1, -1);
        this.O = f0;
        imageView.setBackground(f0);
        t1Var.addView(imageView, qoe.o(54, 56));
        t1 t1Var2 = new t1((byte) 13, activity, false);
        this.J = t1Var2;
        t1Var2.setOrientation(0);
        addView(t1Var2, qoe.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(activity);
        this.P = imageView2;
        imageView2.setScaleType(scaleType);
        foc focVar = new foc(wuVar);
        this.Q = focVar;
        imageView2.setImageDrawable(focVar);
        focVar.c();
        fg0 f02 = cmb.f0(1090519039, 1, -1);
        this.R = f02;
        imageView2.setBackground(f02);
        t1Var2.addView(imageView2, qoe.o(54, 56));
        ImageView imageView3 = new ImageView(activity);
        this.S = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231248);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z;
                float f;
                View childAt;
                byte b = r2;
                wu wuVar2 = wuVar;
                switch (b) {
                    case 0:
                        if (wuVar2.getParent() instanceof ViewGroup) {
                            k22 k22Var = new k22(wuVar2, (byte) 12);
                            bu5 G = bu5.G((ViewGroup) wuVar2.getParent(), null, wuVar2.S);
                            G.s = (short) 0;
                            G.T(wuVar2.n0, wuVar2.o0);
                            G.b0(0.0f, -gm.L(52.0f));
                            G.V = 200;
                            int v = cmb.v(wuVar2.m0, cmb.p1(0.1f, wuVar2.n0));
                            G.o0 = Integer.valueOf(v);
                            for (int i2 = 0; i2 < G.A.getChildCount(); i2++) {
                                if (i2 == G.A.getChildCount() - 1) {
                                    childAt = G.D;
                                } else {
                                    childAt = G.A.getChildAt(i2);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    for (int i3 = 0; i3 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i3++) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                                        if (childAt2 instanceof a8) {
                                            ((a8) childAt2).setSelectorColor(v);
                                        }
                                    }
                                } else if (childAt instanceof a8) {
                                    ((a8) childAt).setSelectorColor(v);
                                }
                            }
                            if (gm.B(wuVar2.m0) > 0.721f) {
                                G.Q(-1);
                                G.U(-986896);
                            } else {
                                G.Q(-14737633);
                                G.U(-15592942);
                            }
                            int i4 = wuVar2.h0;
                            if (i4 == 0) {
                                G.b(2131232271, jb6.M0(2131747529, null), (Runnable) k22Var.a(3), false);
                                G.b(2131232360, jb6.M0(2131745570, null), (Runnable) k22Var.a(1), false);
                                G.k(2131232369, jb6.M0(2131745193, null), (Runnable) k22Var.a(2), !wuVar2.r0);
                                G.b(2131232367, jb6.M0(2131745229, null), (Runnable) k22Var.a(4), false);
                            } else if (i4 == 1) {
                                if (!wuVar2.q0) {
                                    G.b(2131232271, jb6.M0(2131747529, null), (Runnable) k22Var.a(3), false);
                                    G.j();
                                }
                                if (wuVar2.p0) {
                                    G.b(2131232064, jb6.M0(2131742584, null), (Runnable) k22Var.a(9), false);
                                }
                                bvc instantViewLoader = wuVar2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    G.b(2131231839, jb6.M0(2131747521, null), (Runnable) k22Var.a(10), false);
                                    a8 z2 = G.z();
                                    if (instantViewLoader.b() != null) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    z2.setEnabled(z);
                                    if (z2.isEnabled()) {
                                        f = 1.0f;
                                    } else {
                                        f = 0.5f;
                                    }
                                    z2.setAlpha(f);
                                    ptc ptcVar = new ptc(z2, instantViewLoader, (byte) 2);
                                    instantViewLoader.m.add(ptcVar);
                                    G.p = new ptc(instantViewLoader, ptcVar, (byte) 6);
                                }
                                G.b(2131232347, jb6.M0(2131746073, null), (Runnable) k22Var.a(5), false);
                                G.b(2131232360, jb6.M0(2131745570, null), (Runnable) k22Var.a(1), false);
                                G.b(2131232357, jb6.M0(2131742605, null), (Runnable) k22Var.a(6), false);
                                G.b(2131232369, jb6.M0(2131745193, null), (Runnable) k22Var.a(2), false);
                                G.j();
                                if (!crd.a(null).isEmpty()) {
                                    G.b(2131231924, jb6.M0(2131742583, null), (Runnable) k22Var.a(8), false);
                                }
                                G.b(2131231774, jb6.M0(2131742602, null), (Runnable) k22Var.a(7), false);
                                G.b(2131232367, jb6.M0(2131745229, null), (Runnable) k22Var.a(4), false);
                            }
                            G.p = new e1b(wuVar2);
                            G.a0();
                            return;
                        }
                        return;
                    default:
                        wuVar2.W.setText("");
                        return;
                }
            }
        });
        fg0 f03 = cmb.f0(1090519039, 1, -1);
        this.T = f03;
        imageView3.setBackground(f03);
        imageView3.setContentDescription(jb6.M0(2131754838, "AccDescrMoreOptions"));
        t1Var2.addView(imageView3, qoe.o(54, 56));
        vc vcVar = new vc(activity, (byte) 7);
        this.W = vcVar;
        vcVar.setVisibility(8);
        vcVar.setAlpha(0.0f);
        vcVar.setTextSize(1, 18.0f);
        vcVar.setSingleLine(true);
        vcVar.setHint(jb6.M0(2131745570, null));
        vcVar.setBackgroundResource(0);
        vcVar.setCursorWidth(1.5f);
        vcVar.setGravity(112);
        vcVar.setClipToPadding(true);
        vcVar.setPadding(gm.L(58.0f), 0, gm.L(112.0f), 0);
        vcVar.setTranslationY(-gm.L(0.66f));
        vcVar.setInputType(vcVar.getInputType() | 524288);
        vcVar.setImeOptions(33554435);
        vcVar.setTextIsSelectable(false);
        vcVar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                byte b = r2;
                wu wuVar2 = wuVar;
                switch (b) {
                    case 0:
                        if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                            gm.t1(wuVar2.W);
                        }
                        return false;
                    default:
                        if (i2 == 2) {
                            x0 x0Var = wuVar2.w0;
                            if (x0Var != null) {
                                x0Var.a(wuVar2.c0.getText().toString());
                            }
                            wuVar2.k(false);
                        }
                        return false;
                }
            }
        });
        vcVar.addTextChangedListener(new og6(wuVar, (byte) 29));
        frameLayout.addView(vcVar, qoe.e(-1, -1, 119));
        vc vcVar2 = new vc(activity, (byte) 8);
        this.c0 = vcVar2;
        vcVar2.setVisibility(8);
        vcVar2.setAlpha(0.0f);
        vcVar2.setTextSize(1, 15.66f);
        vcVar2.setSingleLine(true);
        this.d0 = gda.m0;
        vcVar2.setHint(jb6.a0(null, null, 2131754348, ku9.a().a));
        vcVar2.setBackgroundResource(0);
        vcVar2.setCursorWidth(1.5f);
        vcVar2.setGravity(112);
        vcVar2.setInputType(vcVar2.getInputType() | 524288);
        vcVar2.setImeOptions(33554434);
        vcVar2.setTextIsSelectable(false);
        vcVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                byte b = r2;
                wu wuVar2 = wuVar;
                switch (b) {
                    case 0:
                        if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                            gm.t1(wuVar2.W);
                        }
                        return false;
                    default:
                        if (i2 == 2) {
                            x0 x0Var = wuVar2.w0;
                            if (x0Var != null) {
                                x0Var.a(wuVar2.c0.getText().toString());
                            }
                            wuVar2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(vcVar2, qoe.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(activity);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231273);
        fg0 f04 = cmb.f0(1090519039, 1, -1);
        this.L = f04;
        imageView4.setBackground(f04);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z;
                float f;
                View childAt;
                byte b = r2;
                wu wuVar2 = wuVar;
                switch (b) {
                    case 0:
                        if (wuVar2.getParent() instanceof ViewGroup) {
                            k22 k22Var = new k22(wuVar2, (byte) 12);
                            bu5 G = bu5.G((ViewGroup) wuVar2.getParent(), null, wuVar2.S);
                            G.s = (short) 0;
                            G.T(wuVar2.n0, wuVar2.o0);
                            G.b0(0.0f, -gm.L(52.0f));
                            G.V = 200;
                            int v = cmb.v(wuVar2.m0, cmb.p1(0.1f, wuVar2.n0));
                            G.o0 = Integer.valueOf(v);
                            for (int i2 = 0; i2 < G.A.getChildCount(); i2++) {
                                if (i2 == G.A.getChildCount() - 1) {
                                    childAt = G.D;
                                } else {
                                    childAt = G.A.getChildAt(i2);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    for (int i3 = 0; i3 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i3++) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                                        if (childAt2 instanceof a8) {
                                            ((a8) childAt2).setSelectorColor(v);
                                        }
                                    }
                                } else if (childAt instanceof a8) {
                                    ((a8) childAt).setSelectorColor(v);
                                }
                            }
                            if (gm.B(wuVar2.m0) > 0.721f) {
                                G.Q(-1);
                                G.U(-986896);
                            } else {
                                G.Q(-14737633);
                                G.U(-15592942);
                            }
                            int i4 = wuVar2.h0;
                            if (i4 == 0) {
                                G.b(2131232271, jb6.M0(2131747529, null), (Runnable) k22Var.a(3), false);
                                G.b(2131232360, jb6.M0(2131745570, null), (Runnable) k22Var.a(1), false);
                                G.k(2131232369, jb6.M0(2131745193, null), (Runnable) k22Var.a(2), !wuVar2.r0);
                                G.b(2131232367, jb6.M0(2131745229, null), (Runnable) k22Var.a(4), false);
                            } else if (i4 == 1) {
                                if (!wuVar2.q0) {
                                    G.b(2131232271, jb6.M0(2131747529, null), (Runnable) k22Var.a(3), false);
                                    G.j();
                                }
                                if (wuVar2.p0) {
                                    G.b(2131232064, jb6.M0(2131742584, null), (Runnable) k22Var.a(9), false);
                                }
                                bvc instantViewLoader = wuVar2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    G.b(2131231839, jb6.M0(2131747521, null), (Runnable) k22Var.a(10), false);
                                    a8 z2 = G.z();
                                    if (instantViewLoader.b() != null) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    z2.setEnabled(z);
                                    if (z2.isEnabled()) {
                                        f = 1.0f;
                                    } else {
                                        f = 0.5f;
                                    }
                                    z2.setAlpha(f);
                                    ptc ptcVar = new ptc(z2, instantViewLoader, (byte) 2);
                                    instantViewLoader.m.add(ptcVar);
                                    G.p = new ptc(instantViewLoader, ptcVar, (byte) 6);
                                }
                                G.b(2131232347, jb6.M0(2131746073, null), (Runnable) k22Var.a(5), false);
                                G.b(2131232360, jb6.M0(2131745570, null), (Runnable) k22Var.a(1), false);
                                G.b(2131232357, jb6.M0(2131742605, null), (Runnable) k22Var.a(6), false);
                                G.b(2131232369, jb6.M0(2131745193, null), (Runnable) k22Var.a(2), false);
                                G.j();
                                if (!crd.a(null).isEmpty()) {
                                    G.b(2131231924, jb6.M0(2131742583, null), (Runnable) k22Var.a(8), false);
                                }
                                G.b(2131231774, jb6.M0(2131742602, null), (Runnable) k22Var.a(7), false);
                                G.b(2131232367, jb6.M0(2131745229, null), (Runnable) k22Var.a(4), false);
                            }
                            G.p = new e1b(wuVar2);
                            G.a0();
                            return;
                        }
                        return;
                    default:
                        wuVar2.W.setText("");
                        return;
                }
            }
        });
        addView(imageView4, qoe.e(54, 56, 85));
        k46 k46Var = new k46(activity);
        this.e0 = k46Var;
        k46Var.setPivotX(0.0f);
        k46Var.setPivotY(gm.L(2.0f));
        addView(k46Var, qoe.e(-1, 2, 87));
        setWillNotDraw(false);
        this.b[0] = new mg0(wuVar);
        this.b[1] = new mg0(wuVar);
        int i2 = cmb.Fl;
        d(cmb.w0(null, i2, false), false);
        setMenuColors(cmb.w0(null, i2, false));
    }

    public final void a(Canvas canvas, float f, float f2, boolean z) {
        float f3;
        float max = Math.max(gm.L(0.66f), 1);
        float f4 = f - max;
        float width = getWidth() * this.c;
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, getWidth(), f);
        Paint[] paintArr = this.f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        int i = (this.c > 0.0f ? 1 : (this.c == 0.0f ? 0 : -1));
        float[] fArr = this.d;
        Paint[] paintArr2 = this.n;
        Paint[] paintArr3 = this.h;
        if (i > 0) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f);
            int alpha2 = paintArr3[1].getAlpha();
            f3 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.b0) * (1.0f - this.V) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z) {
                rectF.set(0.0f, f4, width, f4 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.b0) * alpha3 * 1.0f * f2));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f3 = 1.0f;
        }
        float f5 = this.c;
        if (f5 < f3) {
            int p1 = cmb.p1((f3 - f5) * f3, 1610612736);
            Paint paint = this.r;
            paint.setColor(p1);
            rectF.set(0.0f, 0.0f, width, f);
            canvas.drawRect(rectF, paint);
            rectF.set(width, 0.0f, getWidth(), f);
            int alpha4 = paintArr[0].getAlpha();
            paintArr[0].setAlpha((int) (alpha4 * f3));
            canvas.drawRect(rectF, paintArr[0]);
            paintArr[0].setAlpha(alpha4);
        }
        rectF.set(width, 0.0f, (fArr[0] * getWidth()) + width, f);
        int alpha5 = paintArr3[0].getAlpha();
        paintArr3[0].setAlpha((int) ((f3 - this.b0) * (f3 - this.V) * (f3 - Utilities.l(this.c * 4.0f)) * alpha5 * f3));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z) {
            rectF.set(width, f4, getWidth() + width, max + f4);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f3 - this.b0) * alpha6 * f3 * f2));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i, int i2) {
        float f;
        boolean[] zArr = this.e;
        boolean z = zArr[i];
        Paint[] paintArr = this.f;
        if (z && paintArr[i].getColor() == i2) {
            return;
        }
        zArr[i] = true;
        paintArr[i].setColor(i2);
        if (gm.B(i2) <= 0.721f) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        int f2 = on2.f(f, -16777216, -1);
        this.h[i].setColor(cmb.v(i2, cmb.p1(gm.R1(0.07f, 0.2f, f), f2)));
        this.n[i].setColor(cmb.v(i2, cmb.p1(gm.R1(0.14f, 0.24f, f), f2)));
        mg0[] mg0VarArr = this.b;
        ((ho) mg0VarArr[i].d).u(f2);
        mg0VarArr[i].a = cmb.v(i2, cmb.p1(0.6f, f2));
        mg0 mg0Var = mg0VarArr[i];
        ((ho) mg0Var.e).u(on2.f(((ln) mg0VarArr[i].f).c, mg0Var.a, cmb.w0(null, cmb.p7, false)));
        invalidate();
    }

    public final void c(final int i, float f, boolean z) {
        final float f2;
        boolean[] zArr = this.e;
        if (zArr[2] && this.j0 == i) {
            return;
        }
        final float f3 = 1.0f;
        if (!z) {
            zArr[2] = true;
            if (f < 0.0f) {
                if (gm.B(i) <= 0.721f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
            }
            int f4 = on2.f(f, -16777216, -1);
            this.x = f4;
            cmb.p1(0.55f, f4);
            this.j0 = i;
            this.y = on2.f(f, -1, -16777216);
            int f5 = on2.f(1.0f - f, -1, -16777216);
            this.E = f5;
            int i2 = this.y;
            o oVar = ((wu) this).C0;
            eb ebVar = oVar.j0;
            if (ebVar != null) {
                ebVar.c(i2, f5);
            }
            this.s.setColor(this.y);
            this.w.setColor(cmb.v(this.y, cmb.p1(gm.R1(0.07f, 0.2f, f), this.x)));
            int p1 = cmb.p1(0.6f, this.E);
            vc vcVar = this.c0;
            vcVar.setHintTextColor(p1);
            vcVar.setTextColor(this.E);
            vcVar.setCursorColor(this.E);
            vcVar.setHandlesColor(this.E);
            this.e0.setProgressColor(cmb.w0(null, cmb.Hl, false));
            int f6 = on2.f(this.b0, this.x, this.E);
            ee0 ee0Var = this.N;
            ee0Var.a(f6);
            ee0Var.b(on2.f(this.b0, this.x, this.E));
            int i3 = this.x;
            foc focVar = this.Q;
            focVar.c.setColor(i3);
            focVar.invalidateSelf();
            int i4 = this.x;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.S.setColorFilter(new PorterDuffColorFilter(i4, mode));
            this.P.setColorFilter(new PorterDuffColorFilter(this.x, mode));
            this.K.setColorFilter(new PorterDuffColorFilter(this.x, mode));
            int v = cmb.v(i, cmb.p1(0.22f, this.x));
            this.k0 = v;
            cmb.F1(this.O, v, true);
            cmb.F1(this.R, this.k0, true);
            cmb.F1(this.T, this.k0, true);
            cmb.F1(this.L, this.k0, true);
            int p12 = cmb.p1(0.6f, this.x);
            vc vcVar2 = this.W;
            vcVar2.setHintTextColor(p12);
            vcVar2.setTextColor(this.x);
            vcVar2.setCursorColor(this.x);
            vcVar2.setHandlesColor(this.x);
            sx sxVar = oVar.L;
            if (sxVar != null) {
                sxVar.u();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i5 = this.j0;
        this.i0 = i5;
        if (gm.B(i5) <= 0.721f) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (gm.B(i) > 0.721f) {
            f3 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                puc pucVar = puc.this;
                pucVar.c(on2.f(floatValue, pucVar.i0, i), gm.R1(f2, f3, floatValue), false);
            }
        });
        this.l0.addListener(new fg4(this, i, f3, (byte) 2));
        this.l0.start();
    }

    public final void d(int i, boolean z) {
        c(i, -1.0f, z);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.f0) {
            i = gm.m;
        } else {
            i = 0;
        }
        a(canvas, i + this.G, 1.0f, this.t0);
        float right = this.I.getRight();
        float left = this.J.getLeft();
        boolean z = this.f0;
        if (z) {
            i2 = gm.m;
        } else {
            i2 = 0;
        }
        float f = i2;
        if (z) {
            i3 = gm.m;
        } else {
            i3 = 0;
        }
        float f2 = i3 + this.G;
        int i5 = (this.c > 1.0f ? 1 : (this.c == 1.0f ? 0 : -1));
        mg0[] mg0VarArr = this.b;
        if (i5 < 0) {
            canvas.save();
            float width = (getWidth() * this.c) - (Utilities.l(this.c * 2.0f) * gm.L(30.0f));
            canvas.translate(right + width, f);
            mg0VarArr[0].a(canvas, (left - right) - width, f2 - f, (1.0f - this.V) * (1.0f - this.c));
            canvas.restore();
        }
        if (this.c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.c, getHeight());
            canvas.translate(right, f);
            canvas.translate((1.0f - this.c) * gm.L(-12.0f), 0.0f);
            float R1 = gm.R1(1.0f, 0.5f, 1.0f - this.c);
            float f3 = f2 - f;
            canvas.scale(R1, R1, 0.0f, f3 / 2.0f);
            mg0VarArr[1].a(canvas, left - right, f3, (1.0f - this.b0) * (1.0f - this.V) * this.c);
            canvas.restore();
        }
        int i6 = (this.b0 > 0.0f ? 1 : (this.b0 == 0.0f ? 0 : -1));
        RectF rectF = this.a;
        if (i6 > 0) {
            Paint paint = this.s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.b0));
            float width2 = getWidth();
            if (this.f0) {
                i4 = gm.m;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i4 + this.G, paint);
            paint.setAlpha(alpha);
            float f4 = (f + f2) / 2.0f;
            float L = gm.L(42.0f) / 2.0f;
            rectF.set(gm.L(6.0f), f4 - L, gm.R1(left, getWidth() - gm.L(6.0f), this.b0), f4 + L);
            Paint paint2 = this.w;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.b0));
            canvas.drawRoundRect(rectF, gm.L(50.0f), gm.L(50.0f), paint2);
            paint2.setAlpha(alpha2);
        }
        rectF.set(0.0f, f, getWidth(), f2);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mw0 webView;
        int action = motionEvent.getAction();
        muc mucVar = this.A0;
        if (action == 0) {
            this.B0 = false;
            gm.r(mucVar);
            if (motionEvent.getX() > this.I.getRight() && motionEvent.getX() < this.J.getLeft() && !this.U && !this.a0) {
                this.y0 = motionEvent.getX();
                motionEvent.getY();
                this.z0 = System.currentTimeMillis();
                gm.d3(mucVar, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.z0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            gm.r(mucVar);
            this.B0 = true;
            m mVar = ((wu) this).C0.v0[0];
            float l = Utilities.l(mVar.getProgress() + ((motionEvent.getX() - this.y0) / (getWidth() * 0.8f)));
            if (!mVar.b() && mVar.e() && (webView = mVar.f.getWebView()) != null) {
                webView.setScrollProgress(l);
                mVar.M.d0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gm.r(mucVar);
            this.z0 = 0L;
        }
        this.y0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i, boolean z) {
        float f;
        mg0 mg0Var = this.b[i];
        if (mg0Var.b != z) {
            mg0Var.b = z;
            ln lnVar = (ln) mg0Var.f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            lnVar.e(true, f);
            invalidate();
        }
    }

    public final void f(int i, String str) {
        mg0[] mg0VarArr = this.b;
        CharSequence charSequence = ((ho) mg0VarArr[i].e).i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((ho) mg0VarArr[i].e).t(gw3.m(str, ((ho) mg0VarArr[i].e).a.getFontMetricsInt(), false, null, 0), false, true);
    }

    public final void g(int i, String str, boolean z) {
        mg0[] mg0VarArr = this.b;
        CharSequence charSequence = ((ho) mg0VarArr[i].d).i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((ho) mg0VarArr[i].d).t(gw3.m(str, ((ho) mg0VarArr[i].d).a.getFontMetricsInt(), false, null, 0), z, true);
    }

    public int getBackgroundColor() {
        return this.j0;
    }

    public bvc getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.x;
    }

    public String getTitle() {
        CharSequence charSequence = ((ho) this.b[0].d).i;
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    public final void h(boolean z) {
        float f;
        if (this.U == z) {
            return;
        }
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z;
        vc vcVar = this.W;
        boolean z2 = false;
        vcVar.setVisibility(0);
        float f2 = 0.0f;
        if (!this.v0 && !z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.N.c(true, f);
        float f3 = this.V;
        if (z) {
            f2 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
        this.u0 = ofFloat;
        ofFloat.addUpdateListener(new oxb(this, (byte) 21));
        this.u0.addListener(new sw9((byte) 18, this, z));
        this.u0.setInterpolator(d53.h);
        this.u0.setDuration(320L);
        this.u0.start();
        boolean z3 = !z;
        gm.P3(this.P, z3, true);
        gm.P3(this.S, z3, true);
        if (vcVar.length() > 0 && this.U) {
            z2 = true;
        }
        gm.P3(this.K, z2, true);
    }

    public final void i() {
        mg0[] mg0VarArr = this.b;
        mg0 mg0Var = mg0VarArr[0];
        mg0VarArr[0] = mg0VarArr[1];
        mg0VarArr[1] = mg0Var;
        float[] fArr = this.d;
        float f = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f;
        Paint[] paintArr = this.f;
        int color = paintArr[0].getColor();
        b(0, paintArr[1].getColor());
        b(1, color);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f0) {
            i3 = gm.m;
        } else {
            i3 = 0;
        }
        super.onMeasure(i, wi8.E(56.0f, i3, 1073741824));
    }

    public void setBackButton(boolean z) {
        float f;
        this.v0 = z;
        if (!this.U && !this.a0) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            this.N.c(true, f);
        }
    }

    public void setBackButtonCached(boolean z) {
        this.v0 = z;
    }

    public void setHasForward(boolean z) {
        this.p0 = z;
    }

    public void setHeight(int i) {
        if (this.G != i) {
            this.G = i;
            float pow = (float) Math.pow(i / gm.L(56.0f), 0.5d);
            this.H = pow;
            t1 t1Var = this.I;
            t1Var.setScaleX(pow);
            t1Var.setScaleY(this.H);
            t1Var.setTranslationX((1.0f - this.H) * gm.L(42.0f));
            t1Var.setTranslationY((1.0f - this.H) * gm.L(-12.0f));
            float f = this.H;
            t1 t1Var2 = this.J;
            t1Var2.setScaleX(f);
            t1Var2.setScaleY(this.H);
            t1Var2.setTranslationX((1.0f - this.H) * (-gm.L(42.0f)));
            t1Var2.setTranslationY((1.0f - this.H) * gm.L(-12.0f));
            this.e0.setTranslationY(this.G - gm.L(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z) {
        this.r0 = z;
    }

    public void setIsTonsite(boolean z) {
        this.q0 = z;
    }

    public void setMenuColors(int i) {
        int i2;
        boolean z = false;
        if (ddd.c(ddd.b(i))[0] < 0.5d) {
            z = true;
        }
        int i3 = -1;
        if (z) {
            i2 = -16777216;
        } else {
            i2 = -1;
        }
        this.m0 = i2;
        if (!z) {
            i3 = -16777216;
        }
        this.n0 = i3;
        this.o0 = cmb.p1(0.6f, i3);
    }

    public void setMenuListener(qac qacVar) {
        this.g0 = qacVar;
    }

    public void setMenuType(int i) {
        if (this.h0 != i) {
            this.h0 = i;
        }
    }

    public void setProgress(float f) {
        this.d[0] = f;
        invalidate();
    }

    public void setTransitionProgress(float f) {
        this.c = f;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z) {
    }
}
