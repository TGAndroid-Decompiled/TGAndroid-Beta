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
public abstract class nsc extends FrameLayout {
    public final ksc A0;
    public boolean B0;
    public int E;
    public final TextPaint F;
    public int G;
    public float H;
    public final t1 I;
    public final t1 J;
    public final ImageView K;
    public final ff0 L;
    public final ImageView M;
    public final ed0 N;
    public final ff0 O;
    public final ImageView P;
    public final gmc Q;
    public final ff0 R;
    public final ImageView S;
    public final ff0 T;
    public boolean U;
    public float V;
    public final ps0 W;
    public final RectF a;
    public boolean a0;
    public final mf0[] b;
    public float b0;
    public float c;
    public final ps0 c0;
    public final float[] d;
    public int d0;
    public final boolean[] e;
    public final j26 e0;
    public final Paint[] f;
    public boolean f0;
    public p8c g0;
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
    public final xl3 s0;
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

    public nsc(Activity activity) {
        super(activity);
        this.a = new RectF();
        this.b = new mf0[2];
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
        this.G = gl.L(56.0f);
        this.H = 1.0f;
        this.V = 0.0f;
        this.b0 = 0.0f;
        this.h0 = -1;
        this.s0 = new xl3((byte) 7);
        final wt wtVar = (wt) this;
        this.A0 = new ksc(wtVar, (byte) 0);
        this.B0 = false;
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(18.33f));
        for (int i = 0; i < 2; i++) {
            this.f[i] = new Paint(1);
            this.h[i] = new Paint(1);
            this.n[i] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        addView(frameLayout, nme.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        addView(frameLayout2, nme.e(-1, 56, 87));
        t1 t1Var = new t1((byte) 12, activity, false);
        this.I = t1Var;
        t1Var.setOrientation(0);
        addView(t1Var, nme.e(-2, 56, 83));
        ImageView imageView = new ImageView(activity);
        this.M = imageView;
        imageView.setContentDescription(k96.M0(2131754878, null));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ed0 ed0Var = new ed0(false);
        this.N = ed0Var;
        ed0Var.k = 200.0f;
        ed0Var.c(false, 1.0f);
        imageView.setImageDrawable(ed0Var);
        ff0 f0 = bkb.f0(1090519039, 1, -1);
        this.O = f0;
        imageView.setBackground(f0);
        t1Var.addView(imageView, nme.o(54, 56));
        t1 t1Var2 = new t1((byte) 13, activity, false);
        this.J = t1Var2;
        t1Var2.setOrientation(0);
        addView(t1Var2, nme.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(activity);
        this.P = imageView2;
        imageView2.setScaleType(scaleType);
        gmc gmcVar = new gmc(wtVar);
        this.Q = gmcVar;
        imageView2.setImageDrawable(gmcVar);
        gmcVar.c();
        ff0 f02 = bkb.f0(1090519039, 1, -1);
        this.R = f02;
        imageView2.setBackground(f02);
        t1Var2.addView(imageView2, nme.o(54, 56));
        ImageView imageView3 = new ImageView(activity);
        this.S = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231247);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                float f;
                View childAt;
                byte b = r2;
                wt wtVar2 = wtVar;
                switch (b) {
                    case 0:
                        if (wtVar2.getParent() instanceof ViewGroup) {
                            z02 z02Var = new z02(wtVar2, (byte) 12);
                            cs5 G = cs5.G((ViewGroup) wtVar2.getParent(), null, wtVar2.S);
                            G.s = (short) 0;
                            G.T(wtVar2.n0, wtVar2.o0);
                            G.b0(0.0f, -gl.L(52.0f));
                            G.V = 200;
                            int v = bkb.v(wtVar2.m0, bkb.p1(0.1f, wtVar2.n0));
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
                            if (gl.B(wtVar2.m0) > 0.721f) {
                                G.Q(-1);
                                G.U(-986896);
                            } else {
                                G.Q(-14737633);
                                G.U(-15592942);
                            }
                            int i4 = wtVar2.h0;
                            if (i4 == 0) {
                                G.b(2131232270, k96.M0(2131747603, null), (Runnable) z02Var.a(3), false);
                                G.b(2131232359, k96.M0(2131745644, null), (Runnable) z02Var.a(1), false);
                                G.k(2131232368, k96.M0(2131745267, null), (Runnable) z02Var.a(2), !wtVar2.r0);
                                G.b(2131232366, k96.M0(2131745303, null), (Runnable) z02Var.a(4), false);
                            } else {
                                boolean z = true;
                                if (i4 == 1) {
                                    if (!wtVar2.q0) {
                                        G.b(2131232270, k96.M0(2131747603, null), (Runnable) z02Var.a(3), false);
                                        G.j();
                                    }
                                    if (wtVar2.p0) {
                                        G.b(2131232063, k96.M0(2131742658, null), (Runnable) z02Var.a(9), false);
                                    }
                                    atc instantViewLoader = wtVar2.getInstantViewLoader();
                                    if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                        G.b(2131231838, k96.M0(2131747595, null), (Runnable) z02Var.a(10), false);
                                        a8 z2 = G.z();
                                        if (instantViewLoader.b() == null) {
                                            z = false;
                                        }
                                        z2.setEnabled(z);
                                        if (z2.isEnabled()) {
                                            f = 1.0f;
                                        } else {
                                            f = 0.5f;
                                        }
                                        z2.setAlpha(f);
                                        isc iscVar = new isc(z2, instantViewLoader, (byte) 0);
                                        instantViewLoader.m.add(iscVar);
                                        G.p = new isc(instantViewLoader, (Object) iscVar, (byte) 4);
                                    }
                                    G.b(2131232346, k96.M0(2131746147, null), (Runnable) z02Var.a(5), false);
                                    G.b(2131232359, k96.M0(2131745644, null), (Runnable) z02Var.a(1), false);
                                    G.b(2131232356, k96.M0(2131742679, null), (Runnable) z02Var.a(6), false);
                                    G.b(2131232368, k96.M0(2131745267, null), (Runnable) z02Var.a(2), false);
                                    G.j();
                                    if (!zod.a(null).isEmpty()) {
                                        G.b(2131231923, k96.M0(2131742657, null), (Runnable) z02Var.a(8), false);
                                    }
                                    G.b(2131231773, k96.M0(2131742676, null), (Runnable) z02Var.a(7), false);
                                    G.b(2131232366, k96.M0(2131745303, null), (Runnable) z02Var.a(4), false);
                                }
                            }
                            G.p = new cza(wtVar2);
                            G.a0();
                            return;
                        }
                        return;
                    default:
                        wtVar2.W.setText("");
                        return;
                }
            }
        });
        ff0 f03 = bkb.f0(1090519039, 1, -1);
        this.T = f03;
        imageView3.setBackground(f03);
        imageView3.setContentDescription(k96.M0(2131754838, "AccDescrMoreOptions"));
        t1Var2.addView(imageView3, nme.o(54, 56));
        ps0 ps0Var = new ps0(activity, (byte) 6);
        this.W = ps0Var;
        ps0Var.setVisibility(8);
        ps0Var.setAlpha(0.0f);
        ps0Var.setTextSize(1, 18.0f);
        ps0Var.setSingleLine(true);
        ps0Var.setHint(k96.M0(2131745644, null));
        ps0Var.setBackgroundResource(0);
        ps0Var.setCursorWidth(1.5f);
        ps0Var.setGravity(112);
        ps0Var.setClipToPadding(true);
        ps0Var.setPadding(gl.L(58.0f), 0, gl.L(112.0f), 0);
        ps0Var.setTranslationY(-gl.L(0.66f));
        ps0Var.setInputType(ps0Var.getInputType() | 524288);
        ps0Var.setImeOptions(33554435);
        ps0Var.setTextIsSelectable(false);
        ps0Var.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                byte b = r2;
                wt wtVar2 = wtVar;
                switch (b) {
                    case 0:
                        if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                            gl.t1(wtVar2.W);
                        }
                        return false;
                    default:
                        if (i2 == 2) {
                            x0 x0Var = wtVar2.w0;
                            if (x0Var != null) {
                                x0Var.a(wtVar2.c0.getText().toString());
                            }
                            wtVar2.k(false);
                        }
                        return false;
                }
            }
        });
        ps0Var.addTextChangedListener(new jf6(wtVar, (byte) 28));
        frameLayout.addView(ps0Var, nme.e(-1, -1, 119));
        ps0 ps0Var2 = new ps0(activity, (byte) 7);
        this.c0 = ps0Var2;
        ps0Var2.setVisibility(8);
        ps0Var2.setAlpha(0.0f);
        ps0Var2.setTextSize(1, 15.66f);
        ps0Var2.setSingleLine(true);
        this.d0 = gba.m0;
        ps0Var2.setHint(k96.a0(null, null, 2131754348, is9.a().a));
        ps0Var2.setBackgroundResource(0);
        ps0Var2.setCursorWidth(1.5f);
        ps0Var2.setGravity(112);
        ps0Var2.setInputType(ps0Var2.getInputType() | 524288);
        ps0Var2.setImeOptions(33554434);
        ps0Var2.setTextIsSelectable(false);
        ps0Var2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                byte b = r2;
                wt wtVar2 = wtVar;
                switch (b) {
                    case 0:
                        if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                            gl.t1(wtVar2.W);
                        }
                        return false;
                    default:
                        if (i2 == 2) {
                            x0 x0Var = wtVar2.w0;
                            if (x0Var != null) {
                                x0Var.a(wtVar2.c0.getText().toString());
                            }
                            wtVar2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(ps0Var2, nme.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(activity);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231272);
        ff0 f04 = bkb.f0(1090519039, 1, -1);
        this.L = f04;
        imageView4.setBackground(f04);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                float f;
                View childAt;
                byte b = r2;
                wt wtVar2 = wtVar;
                switch (b) {
                    case 0:
                        if (wtVar2.getParent() instanceof ViewGroup) {
                            z02 z02Var = new z02(wtVar2, (byte) 12);
                            cs5 G = cs5.G((ViewGroup) wtVar2.getParent(), null, wtVar2.S);
                            G.s = (short) 0;
                            G.T(wtVar2.n0, wtVar2.o0);
                            G.b0(0.0f, -gl.L(52.0f));
                            G.V = 200;
                            int v = bkb.v(wtVar2.m0, bkb.p1(0.1f, wtVar2.n0));
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
                            if (gl.B(wtVar2.m0) > 0.721f) {
                                G.Q(-1);
                                G.U(-986896);
                            } else {
                                G.Q(-14737633);
                                G.U(-15592942);
                            }
                            int i4 = wtVar2.h0;
                            if (i4 == 0) {
                                G.b(2131232270, k96.M0(2131747603, null), (Runnable) z02Var.a(3), false);
                                G.b(2131232359, k96.M0(2131745644, null), (Runnable) z02Var.a(1), false);
                                G.k(2131232368, k96.M0(2131745267, null), (Runnable) z02Var.a(2), !wtVar2.r0);
                                G.b(2131232366, k96.M0(2131745303, null), (Runnable) z02Var.a(4), false);
                            } else {
                                boolean z = true;
                                if (i4 == 1) {
                                    if (!wtVar2.q0) {
                                        G.b(2131232270, k96.M0(2131747603, null), (Runnable) z02Var.a(3), false);
                                        G.j();
                                    }
                                    if (wtVar2.p0) {
                                        G.b(2131232063, k96.M0(2131742658, null), (Runnable) z02Var.a(9), false);
                                    }
                                    atc instantViewLoader = wtVar2.getInstantViewLoader();
                                    if (instantViewLoader != null && (((!instantViewLoader.g || !instantViewLoader.i) && instantViewLoader.h == null && instantViewLoader.j == null && !instantViewLoader.c) || instantViewLoader.b() != null)) {
                                        G.b(2131231838, k96.M0(2131747595, null), (Runnable) z02Var.a(10), false);
                                        a8 z2 = G.z();
                                        if (instantViewLoader.b() == null) {
                                            z = false;
                                        }
                                        z2.setEnabled(z);
                                        if (z2.isEnabled()) {
                                            f = 1.0f;
                                        } else {
                                            f = 0.5f;
                                        }
                                        z2.setAlpha(f);
                                        isc iscVar = new isc(z2, instantViewLoader, (byte) 0);
                                        instantViewLoader.m.add(iscVar);
                                        G.p = new isc(instantViewLoader, (Object) iscVar, (byte) 4);
                                    }
                                    G.b(2131232346, k96.M0(2131746147, null), (Runnable) z02Var.a(5), false);
                                    G.b(2131232359, k96.M0(2131745644, null), (Runnable) z02Var.a(1), false);
                                    G.b(2131232356, k96.M0(2131742679, null), (Runnable) z02Var.a(6), false);
                                    G.b(2131232368, k96.M0(2131745267, null), (Runnable) z02Var.a(2), false);
                                    G.j();
                                    if (!zod.a(null).isEmpty()) {
                                        G.b(2131231923, k96.M0(2131742657, null), (Runnable) z02Var.a(8), false);
                                    }
                                    G.b(2131231773, k96.M0(2131742676, null), (Runnable) z02Var.a(7), false);
                                    G.b(2131232366, k96.M0(2131745303, null), (Runnable) z02Var.a(4), false);
                                }
                            }
                            G.p = new cza(wtVar2);
                            G.a0();
                            return;
                        }
                        return;
                    default:
                        wtVar2.W.setText("");
                        return;
                }
            }
        });
        addView(imageView4, nme.e(54, 56, 85));
        j26 j26Var = new j26(activity);
        this.e0 = j26Var;
        j26Var.setPivotX(0.0f);
        j26Var.setPivotY(gl.L(2.0f));
        addView(j26Var, nme.e(-1, 2, 87));
        setWillNotDraw(false);
        this.b[0] = new mf0(wtVar);
        this.b[1] = new mf0(wtVar);
        int i2 = bkb.Fl;
        d(bkb.w0(null, i2, false), false);
        setMenuColors(bkb.w0(null, i2, false));
    }

    public final void a(Canvas canvas, float f, float f2, boolean z) {
        float f3;
        float max = Math.max(gl.L(0.66f), 1);
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
            int p1 = bkb.p1((f3 - f5) * f3, 1610612736);
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
        if (gl.B(i2) <= 0.721f) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        int f2 = bm2.f(f, -16777216, -1);
        this.h[i].setColor(bkb.v(i2, bkb.p1(gl.R1(0.07f, 0.2f, f), f2)));
        this.n[i].setColor(bkb.v(i2, bkb.p1(gl.R1(0.14f, 0.24f, f), f2)));
        mf0[] mf0VarArr = this.b;
        ((gn) mf0VarArr[i].d).u(f2);
        mf0VarArr[i].a = bkb.v(i2, bkb.p1(0.6f, f2));
        mf0 mf0Var = mf0VarArr[i];
        ((gn) mf0Var.e).u(bm2.f(((lm) mf0VarArr[i].f).c, mf0Var.a, bkb.w0(null, bkb.p7, false)));
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
                if (gl.B(i) <= 0.721f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
            }
            int f4 = bm2.f(f, -16777216, -1);
            this.x = f4;
            bkb.p1(0.55f, f4);
            this.j0 = i;
            this.y = bm2.f(f, -1, -16777216);
            int f5 = bm2.f(1.0f - f, -1, -16777216);
            this.E = f5;
            int i2 = this.y;
            o oVar = ((wt) this).C0;
            eb ebVar = oVar.j0;
            if (ebVar != null) {
                ebVar.c(i2, f5);
            }
            this.s.setColor(this.y);
            this.w.setColor(bkb.v(this.y, bkb.p1(gl.R1(0.07f, 0.2f, f), this.x)));
            int p1 = bkb.p1(0.6f, this.E);
            ps0 ps0Var = this.c0;
            ps0Var.setHintTextColor(p1);
            ps0Var.setTextColor(this.E);
            ps0Var.setCursorColor(this.E);
            ps0Var.setHandlesColor(this.E);
            this.e0.setProgressColor(bkb.w0(null, bkb.Hl, false));
            int f6 = bm2.f(this.b0, this.x, this.E);
            ed0 ed0Var = this.N;
            ed0Var.a(f6);
            ed0Var.b(bm2.f(this.b0, this.x, this.E));
            int i3 = this.x;
            gmc gmcVar = this.Q;
            gmcVar.c.setColor(i3);
            gmcVar.invalidateSelf();
            int i4 = this.x;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.S.setColorFilter(new PorterDuffColorFilter(i4, mode));
            this.P.setColorFilter(new PorterDuffColorFilter(this.x, mode));
            this.K.setColorFilter(new PorterDuffColorFilter(this.x, mode));
            int v = bkb.v(i, bkb.p1(0.22f, this.x));
            this.k0 = v;
            bkb.F1(this.O, v, true);
            bkb.F1(this.R, this.k0, true);
            bkb.F1(this.T, this.k0, true);
            bkb.F1(this.L, this.k0, true);
            int p12 = bkb.p1(0.6f, this.x);
            ps0 ps0Var2 = this.W;
            ps0Var2.setHintTextColor(p12);
            ps0Var2.setTextColor(this.x);
            ps0Var2.setCursorColor(this.x);
            ps0Var2.setHandlesColor(this.x);
            sw swVar = oVar.L;
            if (swVar != null) {
                swVar.s();
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
        if (gl.B(i5) <= 0.721f) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (gl.B(i) > 0.721f) {
            f3 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                nsc nscVar = nsc.this;
                nscVar.c(bm2.f(floatValue, nscVar.i0, i), gl.R1(f2, f3, floatValue), false);
            }
        });
        this.l0.addListener(new ee4(this, i, f3, (byte) 2));
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
            i = gl.m;
        } else {
            i = 0;
        }
        a(canvas, i + this.G, 1.0f, this.t0);
        float right = this.I.getRight();
        float left = this.J.getLeft();
        boolean z = this.f0;
        if (z) {
            i2 = gl.m;
        } else {
            i2 = 0;
        }
        float f = i2;
        if (z) {
            i3 = gl.m;
        } else {
            i3 = 0;
        }
        float f2 = i3 + this.G;
        int i5 = (this.c > 1.0f ? 1 : (this.c == 1.0f ? 0 : -1));
        mf0[] mf0VarArr = this.b;
        if (i5 < 0) {
            canvas.save();
            float width = (getWidth() * this.c) - (Utilities.l(this.c * 2.0f) * gl.L(30.0f));
            canvas.translate(right + width, f);
            mf0VarArr[0].a(canvas, (left - right) - width, f2 - f, (1.0f - this.V) * (1.0f - this.c));
            canvas.restore();
        }
        if (this.c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.c, getHeight());
            canvas.translate(right, f);
            canvas.translate((1.0f - this.c) * gl.L(-12.0f), 0.0f);
            float R1 = gl.R1(1.0f, 0.5f, 1.0f - this.c);
            float f3 = f2 - f;
            canvas.scale(R1, R1, 0.0f, f3 / 2.0f);
            mf0VarArr[1].a(canvas, left - right, f3, (1.0f - this.b0) * (1.0f - this.V) * this.c);
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
                i4 = gl.m;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i4 + this.G, paint);
            paint.setAlpha(alpha);
            float f4 = (f + f2) / 2.0f;
            float L = gl.L(42.0f) / 2.0f;
            rectF.set(gl.L(6.0f), f4 - L, gl.R1(left, getWidth() - gl.L(6.0f), this.b0), f4 + L);
            Paint paint2 = this.w;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.b0));
            canvas.drawRoundRect(rectF, gl.L(50.0f), gl.L(50.0f), paint2);
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
        cv0 webView;
        int action = motionEvent.getAction();
        ksc kscVar = this.A0;
        if (action == 0) {
            this.B0 = false;
            gl.r(kscVar);
            if (motionEvent.getX() > this.I.getRight() && motionEvent.getX() < this.J.getLeft() && !this.U && !this.a0) {
                this.y0 = motionEvent.getX();
                motionEvent.getY();
                this.z0 = System.currentTimeMillis();
                gl.e3(kscVar, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.z0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            gl.r(kscVar);
            this.B0 = true;
            m mVar = ((wt) this).C0.v0[0];
            float l = Utilities.l(mVar.getProgress() + ((motionEvent.getX() - this.y0) / (getWidth() * 0.8f)));
            if (!mVar.b() && mVar.e() && (webView = mVar.f.getWebView()) != null) {
                webView.setScrollProgress(l);
                mVar.M.d0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gl.r(kscVar);
            this.z0 = 0L;
        }
        this.y0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i, boolean z) {
        float f;
        mf0 mf0Var = this.b[i];
        if (mf0Var.b != z) {
            mf0Var.b = z;
            lm lmVar = (lm) mf0Var.f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            lmVar.e(true, f);
            invalidate();
        }
    }

    public final void f(int i, String str) {
        mf0[] mf0VarArr = this.b;
        CharSequence charSequence = ((gn) mf0VarArr[i].e).i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((gn) mf0VarArr[i].e).t(vu3.m(str, ((gn) mf0VarArr[i].e).a.getFontMetricsInt(), false, null, 0), false, true);
    }

    public final void g(int i, String str, boolean z) {
        mf0[] mf0VarArr = this.b;
        CharSequence charSequence = ((gn) mf0VarArr[i].d).i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((gn) mf0VarArr[i].d).t(vu3.m(str, ((gn) mf0VarArr[i].d).a.getFontMetricsInt(), false, null, 0), z, true);
    }

    public int getBackgroundColor() {
        return this.j0;
    }

    public atc getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.x;
    }

    public String getTitle() {
        CharSequence charSequence = ((gn) this.b[0].d).i;
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
        ps0 ps0Var = this.W;
        boolean z2 = false;
        ps0Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new uwb(this, (byte) 19));
        this.u0.addListener(new pu9((byte) 18, this, z));
        this.u0.setInterpolator(s33.h);
        this.u0.setDuration(320L);
        this.u0.start();
        boolean z3 = !z;
        gl.Q3(this.P, z3, true);
        gl.Q3(this.S, z3, true);
        if (ps0Var.length() > 0 && this.U) {
            z2 = true;
        }
        gl.Q3(this.K, z2, true);
    }

    public final void i() {
        mf0[] mf0VarArr = this.b;
        mf0 mf0Var = mf0VarArr[0];
        mf0VarArr[0] = mf0VarArr[1];
        mf0VarArr[1] = mf0Var;
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
            i3 = gl.m;
        } else {
            i3 = 0;
        }
        super.onMeasure(i, ug8.E(56.0f, i3, 1073741824));
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
            float pow = (float) Math.pow(i / gl.L(56.0f), 0.5d);
            this.H = pow;
            t1 t1Var = this.I;
            t1Var.setScaleX(pow);
            t1Var.setScaleY(this.H);
            t1Var.setTranslationX((1.0f - this.H) * gl.L(42.0f));
            t1Var.setTranslationY((1.0f - this.H) * gl.L(-12.0f));
            float f = this.H;
            t1 t1Var2 = this.J;
            t1Var2.setScaleX(f);
            t1Var2.setScaleY(this.H);
            t1Var2.setTranslationX((1.0f - this.H) * (-gl.L(42.0f)));
            t1Var2.setTranslationY((1.0f - this.H) * gl.L(-12.0f));
            this.e0.setTranslationY(this.G - gl.L(56.0f));
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
        if (bbd.c(bbd.b(i))[0] < 0.5d) {
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
        this.o0 = bkb.p1(0.6f, i3);
    }

    public void setMenuListener(p8c p8cVar) {
        this.g0 = p8cVar;
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
