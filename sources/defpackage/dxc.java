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
public abstract class dxc extends FrameLayout {
    public final ywc A0;
    public boolean B0;
    public int E;
    public final TextPaint F;
    public int G;
    public float H;
    public final u1 I;
    public final u1 J;
    public final ImageView K;
    public final hf0 L;
    public final ImageView M;
    public final gd0 N;
    public final hf0 O;
    public final ImageView P;
    public final tqc Q;
    public final hf0 R;
    public final ImageView S;
    public final hf0 T;
    public boolean U;
    public float V;
    public final xs0 W;
    public final RectF a;
    public boolean a0;
    public final of0[] b;
    public float b0;
    public float c;
    public final xs0 c0;
    public final float[] d;
    public int d0;
    public final boolean[] e;
    public final n46 e0;
    public final Paint[] f;
    public boolean f0;
    public pcc g0;
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
    public final pm3 s0;
    public boolean t0;
    public ValueAnimator u0;
    public boolean v0;
    public final Paint w;
    public y0 w0;
    public int x;
    public ValueAnimator x0;
    public int y;
    public float y0;
    public long z0;

    public dxc(Activity activity) {
        super(activity);
        this.a = new RectF();
        this.b = new of0[2];
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
        this.G = hl.L(56.0f);
        this.H = 1.0f;
        this.V = 0.0f;
        this.b0 = 0.0f;
        this.h0 = -1;
        this.s0 = new pm3((byte) 7);
        final xt xtVar = (xt) this;
        this.A0 = new ywc(xtVar, (byte) 1);
        this.B0 = false;
        textPaint.setTypeface(hl.o());
        textPaint.setTextSize(hl.L(18.33f));
        for (int i = 0; i < 2; i++) {
            this.f[i] = new Paint(1);
            this.h[i] = new Paint(1);
            this.n[i] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        addView(frameLayout, tre.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        addView(frameLayout2, tre.e(-1, 56, 87));
        u1 u1Var = new u1((byte) 12, activity, false);
        this.I = u1Var;
        u1Var.setOrientation(0);
        addView(u1Var, tre.e(-2, 56, 83));
        ImageView imageView = new ImageView(activity);
        this.M = imageView;
        imageView.setContentDescription(ob6.M0(2131754874, null));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        gd0 gd0Var = new gd0(false);
        this.N = gd0Var;
        gd0Var.k = 200.0f;
        gd0Var.c(false, 1.0f);
        imageView.setImageDrawable(gd0Var);
        hf0 f0 = aob.f0(1090519039, 1, -1);
        this.O = f0;
        imageView.setBackground(f0);
        u1Var.addView(imageView, tre.o(54, 56));
        u1 u1Var2 = new u1((byte) 13, activity, false);
        this.J = u1Var2;
        u1Var2.setOrientation(0);
        addView(u1Var2, tre.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(activity);
        this.P = imageView2;
        imageView2.setScaleType(scaleType);
        tqc tqcVar = new tqc(xtVar);
        this.Q = tqcVar;
        imageView2.setImageDrawable(tqcVar);
        tqcVar.c();
        hf0 f02 = aob.f0(1090519039, 1, -1);
        this.R = f02;
        imageView2.setBackground(f02);
        u1Var2.addView(imageView2, tre.o(54, 56));
        ImageView imageView3 = new ImageView(activity);
        this.S = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231247);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z;
                float f;
                View childAt;
                byte b = r2;
                xt xtVar2 = xtVar;
                switch (b) {
                    case 0:
                        if (xtVar2.getParent() instanceof ViewGroup) {
                            p12 p12Var = new p12(xtVar2, (byte) 12);
                            fu5 G = fu5.G((ViewGroup) xtVar2.getParent(), null, xtVar2.S);
                            G.s = (short) 0;
                            G.T(xtVar2.n0, xtVar2.o0);
                            G.b0(0.0f, -hl.L(52.0f));
                            G.Y = 200;
                            int v = aob.v(xtVar2.m0, aob.p1(0.1f, xtVar2.n0));
                            G.r0 = Integer.valueOf(v);
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
                                        if (childAt2 instanceof b8) {
                                            ((b8) childAt2).setSelectorColor(v);
                                        }
                                    }
                                } else if (childAt instanceof b8) {
                                    ((b8) childAt).setSelectorColor(v);
                                }
                            }
                            if (hl.B(xtVar2.m0) > 0.721f) {
                                G.Q(-1);
                                G.U(-986896);
                            } else {
                                G.Q(-14737633);
                                G.U(-15592942);
                            }
                            int i4 = xtVar2.h0;
                            if (i4 == 0) {
                                G.b(2131232270, ob6.M0(2131747523, null), (Runnable) p12Var.a(3), false);
                                G.b(2131232359, ob6.M0(2131745564, null), (Runnable) p12Var.a(1), false);
                                G.k(2131232368, ob6.M0(2131745187, null), (Runnable) p12Var.a(2), !xtVar2.r0);
                                G.b(2131232366, ob6.M0(2131745223, null), (Runnable) p12Var.a(4), false);
                            } else if (i4 == 1) {
                                if (!xtVar2.q0) {
                                    G.b(2131232270, ob6.M0(2131747523, null), (Runnable) p12Var.a(3), false);
                                    G.j();
                                }
                                if (xtVar2.p0) {
                                    G.b(2131232063, ob6.M0(2131742552, null), (Runnable) p12Var.a(9), false);
                                }
                                pxc instantViewLoader = xtVar2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    G.b(2131231838, ob6.M0(2131747515, null), (Runnable) p12Var.a(10), false);
                                    b8 z2 = G.z();
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
                                    zwc zwcVar = new zwc(z2, instantViewLoader, (byte) 1);
                                    instantViewLoader.m.add(zwcVar);
                                    G.p = new zwc(instantViewLoader, zwcVar, (byte) 4);
                                }
                                G.b(2131232346, ob6.M0(2131746067, null), (Runnable) p12Var.a(5), false);
                                G.b(2131232359, ob6.M0(2131745564, null), (Runnable) p12Var.a(1), false);
                                G.b(2131232356, ob6.M0(2131742573, null), (Runnable) p12Var.a(6), false);
                                G.b(2131232368, ob6.M0(2131745187, null), (Runnable) p12Var.a(2), false);
                                G.j();
                                if (!ptd.a(null).isEmpty()) {
                                    G.b(2131231923, ob6.M0(2131742551, null), (Runnable) p12Var.a(8), false);
                                }
                                G.b(2131231773, ob6.M0(2131742570, null), (Runnable) p12Var.a(7), false);
                                G.b(2131232366, ob6.M0(2131745223, null), (Runnable) p12Var.a(4), false);
                            }
                            G.p = new osa(xtVar2);
                            G.a0();
                            return;
                        }
                        return;
                    default:
                        xtVar2.W.setText("");
                        return;
                }
            }
        });
        hf0 f03 = aob.f0(1090519039, 1, -1);
        this.T = f03;
        imageView3.setBackground(f03);
        imageView3.setContentDescription(ob6.M0(2131754834, "AccDescrMoreOptions"));
        u1Var2.addView(imageView3, tre.o(54, 56));
        xs0 xs0Var = new xs0(activity, (byte) 6);
        this.W = xs0Var;
        xs0Var.setVisibility(8);
        xs0Var.setAlpha(0.0f);
        xs0Var.setTextSize(1, 18.0f);
        xs0Var.setSingleLine(true);
        xs0Var.setHint(ob6.M0(2131745564, null));
        xs0Var.setBackgroundResource(0);
        xs0Var.setCursorWidth(1.5f);
        xs0Var.setGravity(112);
        xs0Var.setClipToPadding(true);
        xs0Var.setPadding(hl.L(58.0f), 0, hl.L(112.0f), 0);
        xs0Var.setTranslationY(-hl.L(0.66f));
        xs0Var.setInputType(xs0Var.getInputType() | 524288);
        xs0Var.setImeOptions(33554435);
        xs0Var.setTextIsSelectable(false);
        xs0Var.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                byte b = r2;
                xt xtVar2 = xtVar;
                switch (b) {
                    case 0:
                        if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                            hl.t1(xtVar2.W);
                        }
                        return false;
                    default:
                        if (i2 == 2) {
                            y0 y0Var = xtVar2.w0;
                            if (y0Var != null) {
                                y0Var.a(xtVar2.c0.getText().toString());
                            }
                            xtVar2.k(false);
                        }
                        return false;
                }
            }
        });
        xs0Var.addTextChangedListener(new nh6(xtVar, (byte) 29));
        frameLayout.addView(xs0Var, tre.e(-1, -1, 119));
        xs0 xs0Var2 = new xs0(activity, (byte) 7);
        this.c0 = xs0Var2;
        xs0Var2.setVisibility(8);
        xs0Var2.setAlpha(0.0f);
        xs0Var2.setTextSize(1, 15.66f);
        xs0Var2.setSingleLine(true);
        this.d0 = xea.m0;
        xs0Var2.setHint(ob6.a0(null, null, 2131754344, bw9.a().a));
        xs0Var2.setBackgroundResource(0);
        xs0Var2.setCursorWidth(1.5f);
        xs0Var2.setGravity(112);
        xs0Var2.setInputType(xs0Var2.getInputType() | 524288);
        xs0Var2.setImeOptions(33554434);
        xs0Var2.setTextIsSelectable(false);
        xs0Var2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                byte b = r2;
                xt xtVar2 = xtVar;
                switch (b) {
                    case 0:
                        if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                            hl.t1(xtVar2.W);
                        }
                        return false;
                    default:
                        if (i2 == 2) {
                            y0 y0Var = xtVar2.w0;
                            if (y0Var != null) {
                                y0Var.a(xtVar2.c0.getText().toString());
                            }
                            xtVar2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(xs0Var2, tre.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(activity);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231272);
        hf0 f04 = aob.f0(1090519039, 1, -1);
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
                xt xtVar2 = xtVar;
                switch (b) {
                    case 0:
                        if (xtVar2.getParent() instanceof ViewGroup) {
                            p12 p12Var = new p12(xtVar2, (byte) 12);
                            fu5 G = fu5.G((ViewGroup) xtVar2.getParent(), null, xtVar2.S);
                            G.s = (short) 0;
                            G.T(xtVar2.n0, xtVar2.o0);
                            G.b0(0.0f, -hl.L(52.0f));
                            G.Y = 200;
                            int v = aob.v(xtVar2.m0, aob.p1(0.1f, xtVar2.n0));
                            G.r0 = Integer.valueOf(v);
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
                                        if (childAt2 instanceof b8) {
                                            ((b8) childAt2).setSelectorColor(v);
                                        }
                                    }
                                } else if (childAt instanceof b8) {
                                    ((b8) childAt).setSelectorColor(v);
                                }
                            }
                            if (hl.B(xtVar2.m0) > 0.721f) {
                                G.Q(-1);
                                G.U(-986896);
                            } else {
                                G.Q(-14737633);
                                G.U(-15592942);
                            }
                            int i4 = xtVar2.h0;
                            if (i4 == 0) {
                                G.b(2131232270, ob6.M0(2131747523, null), (Runnable) p12Var.a(3), false);
                                G.b(2131232359, ob6.M0(2131745564, null), (Runnable) p12Var.a(1), false);
                                G.k(2131232368, ob6.M0(2131745187, null), (Runnable) p12Var.a(2), !xtVar2.r0);
                                G.b(2131232366, ob6.M0(2131745223, null), (Runnable) p12Var.a(4), false);
                            } else if (i4 == 1) {
                                if (!xtVar2.q0) {
                                    G.b(2131232270, ob6.M0(2131747523, null), (Runnable) p12Var.a(3), false);
                                    G.j();
                                }
                                if (xtVar2.p0) {
                                    G.b(2131232063, ob6.M0(2131742552, null), (Runnable) p12Var.a(9), false);
                                }
                                pxc instantViewLoader = xtVar2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                    G.b(2131231838, ob6.M0(2131747515, null), (Runnable) p12Var.a(10), false);
                                    b8 z2 = G.z();
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
                                    zwc zwcVar = new zwc(z2, instantViewLoader, (byte) 1);
                                    instantViewLoader.m.add(zwcVar);
                                    G.p = new zwc(instantViewLoader, zwcVar, (byte) 4);
                                }
                                G.b(2131232346, ob6.M0(2131746067, null), (Runnable) p12Var.a(5), false);
                                G.b(2131232359, ob6.M0(2131745564, null), (Runnable) p12Var.a(1), false);
                                G.b(2131232356, ob6.M0(2131742573, null), (Runnable) p12Var.a(6), false);
                                G.b(2131232368, ob6.M0(2131745187, null), (Runnable) p12Var.a(2), false);
                                G.j();
                                if (!ptd.a(null).isEmpty()) {
                                    G.b(2131231923, ob6.M0(2131742551, null), (Runnable) p12Var.a(8), false);
                                }
                                G.b(2131231773, ob6.M0(2131742570, null), (Runnable) p12Var.a(7), false);
                                G.b(2131232366, ob6.M0(2131745223, null), (Runnable) p12Var.a(4), false);
                            }
                            G.p = new osa(xtVar2);
                            G.a0();
                            return;
                        }
                        return;
                    default:
                        xtVar2.W.setText("");
                        return;
                }
            }
        });
        addView(imageView4, tre.e(54, 56, 85));
        n46 n46Var = new n46(activity);
        this.e0 = n46Var;
        n46Var.setPivotX(0.0f);
        n46Var.setPivotY(hl.L(2.0f));
        addView(n46Var, tre.e(-1, 2, 87));
        setWillNotDraw(false);
        this.b[0] = new of0(xtVar);
        this.b[1] = new of0(xtVar);
        int i2 = aob.Gl;
        d(aob.w0(null, i2, false), false);
        setMenuColors(aob.w0(null, i2, false));
    }

    public final void a(Canvas canvas, float f, float f2, boolean z) {
        float f3;
        float max = Math.max(hl.L(0.66f), 1);
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
            int p1 = aob.p1((f3 - f5) * f3, 1610612736);
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
        if (hl.B(i2) <= 0.721f) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        int f2 = vm2.f(f, -16777216, -1);
        this.h[i].setColor(aob.v(i2, aob.p1(hl.R1(0.07f, 0.2f, f), f2)));
        this.n[i].setColor(aob.v(i2, aob.p1(hl.R1(0.14f, 0.24f, f), f2)));
        of0[] of0VarArr = this.b;
        ((hn) of0VarArr[i].d).u(f2);
        of0VarArr[i].a = aob.v(i2, aob.p1(0.6f, f2));
        of0 of0Var = of0VarArr[i];
        ((hn) of0Var.e).u(vm2.f(((mm) of0VarArr[i].f).c, of0Var.a, aob.w0(null, aob.q7, false)));
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
                if (hl.B(i) <= 0.721f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
            }
            int f4 = vm2.f(f, -16777216, -1);
            this.x = f4;
            aob.p1(0.55f, f4);
            this.j0 = i;
            this.y = vm2.f(f, -1, -16777216);
            int f5 = vm2.f(1.0f - f, -1, -16777216);
            this.E = f5;
            int i2 = this.y;
            o oVar = ((xt) this).C0;
            fb fbVar = oVar.j0;
            if (fbVar != null) {
                fbVar.c(i2, f5);
            }
            this.s.setColor(this.y);
            this.w.setColor(aob.v(this.y, aob.p1(hl.R1(0.07f, 0.2f, f), this.x)));
            int p1 = aob.p1(0.6f, this.E);
            xs0 xs0Var = this.c0;
            xs0Var.setHintTextColor(p1);
            xs0Var.setTextColor(this.E);
            xs0Var.setCursorColor(this.E);
            xs0Var.setHandlesColor(this.E);
            this.e0.setProgressColor(aob.w0(null, aob.Il, false));
            int f6 = vm2.f(this.b0, this.x, this.E);
            gd0 gd0Var = this.N;
            gd0Var.a(f6);
            gd0Var.b(vm2.f(this.b0, this.x, this.E));
            int i3 = this.x;
            tqc tqcVar = this.Q;
            tqcVar.c.setColor(i3);
            tqcVar.invalidateSelf();
            int i4 = this.x;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.S.setColorFilter(new PorterDuffColorFilter(i4, mode));
            this.P.setColorFilter(new PorterDuffColorFilter(this.x, mode));
            this.K.setColorFilter(new PorterDuffColorFilter(this.x, mode));
            int v = aob.v(i, aob.p1(0.22f, this.x));
            this.k0 = v;
            aob.F1(this.O, v, true);
            aob.F1(this.R, this.k0, true);
            aob.F1(this.T, this.k0, true);
            aob.F1(this.L, this.k0, true);
            int p12 = aob.p1(0.6f, this.x);
            xs0 xs0Var2 = this.W;
            xs0Var2.setHintTextColor(p12);
            xs0Var2.setTextColor(this.x);
            xs0Var2.setCursorColor(this.x);
            xs0Var2.setHandlesColor(this.x);
            tw twVar = oVar.L;
            if (twVar != null) {
                twVar.t();
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
        if (hl.B(i5) <= 0.721f) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (hl.B(i) > 0.721f) {
            f3 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                dxc dxcVar = dxc.this;
                dxcVar.c(vm2.f(floatValue, dxcVar.i0, i), hl.R1(f2, f3, floatValue), false);
            }
        });
        this.l0.addListener(new cg4(this, i, f3, (byte) 2));
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
            i = hl.m;
        } else {
            i = 0;
        }
        a(canvas, i + this.G, 1.0f, this.t0);
        float right = this.I.getRight();
        float left = this.J.getLeft();
        boolean z = this.f0;
        if (z) {
            i2 = hl.m;
        } else {
            i2 = 0;
        }
        float f = i2;
        if (z) {
            i3 = hl.m;
        } else {
            i3 = 0;
        }
        float f2 = i3 + this.G;
        int i5 = (this.c > 1.0f ? 1 : (this.c == 1.0f ? 0 : -1));
        of0[] of0VarArr = this.b;
        if (i5 < 0) {
            canvas.save();
            float width = (getWidth() * this.c) - (Utilities.l(this.c * 2.0f) * hl.L(30.0f));
            canvas.translate(right + width, f);
            of0VarArr[0].a(canvas, (left - right) - width, f2 - f, (1.0f - this.V) * (1.0f - this.c));
            canvas.restore();
        }
        if (this.c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.c, getHeight());
            canvas.translate(right, f);
            canvas.translate((1.0f - this.c) * hl.L(-12.0f), 0.0f);
            float R1 = hl.R1(1.0f, 0.5f, 1.0f - this.c);
            float f3 = f2 - f;
            canvas.scale(R1, R1, 0.0f, f3 / 2.0f);
            of0VarArr[1].a(canvas, left - right, f3, (1.0f - this.b0) * (1.0f - this.V) * this.c);
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
                i4 = hl.m;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i4 + this.G, paint);
            paint.setAlpha(alpha);
            float f4 = (f + f2) / 2.0f;
            float L = hl.L(42.0f) / 2.0f;
            rectF.set(hl.L(6.0f), f4 - L, hl.R1(left, getWidth() - hl.L(6.0f), this.b0), f4 + L);
            Paint paint2 = this.w;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.b0));
            canvas.drawRoundRect(rectF, hl.L(50.0f), hl.L(50.0f), paint2);
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
        nv0 webView;
        int action = motionEvent.getAction();
        ywc ywcVar = this.A0;
        if (action == 0) {
            this.B0 = false;
            hl.r(ywcVar);
            if (motionEvent.getX() > this.I.getRight() && motionEvent.getX() < this.J.getLeft() && !this.U && !this.a0) {
                this.y0 = motionEvent.getX();
                motionEvent.getY();
                this.z0 = System.currentTimeMillis();
                hl.d3(ywcVar, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.z0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            hl.r(ywcVar);
            this.B0 = true;
            m mVar = ((xt) this).C0.v0[0];
            float l = Utilities.l(mVar.getProgress() + ((motionEvent.getX() - this.y0) / (getWidth() * 0.8f)));
            if (!mVar.b() && mVar.e() && (webView = mVar.f.getWebView()) != null) {
                webView.setScrollProgress(l);
                mVar.M.d0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            hl.r(ywcVar);
            this.z0 = 0L;
        }
        this.y0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i, boolean z) {
        float f;
        of0 of0Var = this.b[i];
        if (of0Var.b != z) {
            of0Var.b = z;
            mm mmVar = (mm) of0Var.f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            mmVar.e(true, f);
            invalidate();
        }
    }

    public final void f(int i, String str) {
        of0[] of0VarArr = this.b;
        CharSequence charSequence = ((hn) of0VarArr[i].e).i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((hn) of0VarArr[i].e).t(pv3.m(str, ((hn) of0VarArr[i].e).a.getFontMetricsInt(), false, null, 0), false, true);
    }

    public final void g(int i, String str, boolean z) {
        of0[] of0VarArr = this.b;
        CharSequence charSequence = ((hn) of0VarArr[i].d).i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((hn) of0VarArr[i].d).t(pv3.m(str, ((hn) of0VarArr[i].d).a.getFontMetricsInt(), false, null, 0), z, true);
    }

    public int getBackgroundColor() {
        return this.j0;
    }

    public pxc getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.x;
    }

    public String getTitle() {
        CharSequence charSequence = ((hn) this.b[0].d).i;
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
        xs0 xs0Var = this.W;
        boolean z2 = false;
        xs0Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new pzb(this, (byte) 21));
        this.u0.addListener(new i1a((byte) 17, this, z));
        this.u0.setInterpolator(k43.h);
        this.u0.setDuration(320L);
        this.u0.start();
        boolean z3 = !z;
        hl.P3(this.P, z3, true);
        hl.P3(this.S, z3, true);
        if (xs0Var.length() > 0 && this.U) {
            z2 = true;
        }
        hl.P3(this.K, z2, true);
    }

    public final void i() {
        of0[] of0VarArr = this.b;
        of0 of0Var = of0VarArr[0];
        of0VarArr[0] = of0VarArr[1];
        of0VarArr[1] = of0Var;
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
            i3 = hl.m;
        } else {
            i3 = 0;
        }
        super.onMeasure(i, ik8.E(56.0f, i3, 1073741824));
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
            float pow = (float) Math.pow(i / hl.L(56.0f), 0.5d);
            this.H = pow;
            u1 u1Var = this.I;
            u1Var.setScaleX(pow);
            u1Var.setScaleY(this.H);
            u1Var.setTranslationX((1.0f - this.H) * hl.L(42.0f));
            u1Var.setTranslationY((1.0f - this.H) * hl.L(-12.0f));
            float f = this.H;
            u1 u1Var2 = this.J;
            u1Var2.setScaleX(f);
            u1Var2.setScaleY(this.H);
            u1Var2.setTranslationX((1.0f - this.H) * (-hl.L(42.0f)));
            u1Var2.setTranslationY((1.0f - this.H) * hl.L(-12.0f));
            this.e0.setTranslationY(this.G - hl.L(56.0f));
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
        if (ufd.c(ufd.b(i))[0] < 0.5d) {
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
        this.o0 = aob.p1(0.6f, i3);
    }

    public void setMenuListener(pcc pccVar) {
        this.g0 = pccVar;
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
