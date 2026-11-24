package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class xg8 extends Dialog {
    public float E;
    public float F;
    public final jz4 G;
    public final km0 H;
    public k47 I;
    public boolean J;
    public vg8 K;
    public wg8 L;
    public rc2 M;
    public float N;
    public float O;
    public boolean P;
    public byte[] Q;
    public v29 R;
    public ViewGroup S;
    public float T;
    public ViewGroup U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final Activity a;
    public float a0;
    public final ylb b;
    public float b0;
    public final ug8 c;
    public boolean c0;
    public final ug8 d;
    public boolean d0;
    public final ug8 e;
    public boolean e0;
    public final hs1 f;
    public ru1 f0;
    public ValueAnimator g0;
    public final TextView h;
    public ValueAnimator h0;
    public final j57 n;
    public iq5 r;
    public Bitmap s;
    public BitmapShader w;
    public Paint x;
    public Matrix y;

    public xg8(Activity activity, ylb ylbVar) {
        super(activity, 2131755352);
        this.r = iq5.e;
        this.N = 0.0f;
        this.O = 0.0f;
        this.T = -1.0f;
        this.V = -1.0f;
        this.d0 = false;
        this.a = activity;
        this.b = ylbVar;
        ug8 ug8Var = new ug8(this, activity, (byte) 0);
        this.c = ug8Var;
        ug8Var.setOnClickListener(new m67(this, (byte) 23));
        jz4 jz4Var = new jz4();
        this.G = jz4Var;
        km0 km0Var = new km0(jz4Var, jz4Var, jz4Var);
        this.H = km0Var;
        km0Var.h = new zgc(ug8Var);
        km0Var.i = ug8Var;
        ug8 ug8Var2 = new ug8(this, activity, (byte) 1);
        this.d = ug8Var2;
        ug8Var2.setClipToPadding(false);
        ug8Var.addView(ug8Var2, qoe.e(-1, -1, 119));
        hs1 hs1Var = new hs1((byte) 5, activity, this);
        this.f = hs1Var;
        hs1Var.setAdapter(new bo0((byte) 3, activity, this));
        ug8Var2.addView(hs1Var, qoe.e(-1, -1, 119));
        ug8 ug8Var3 = new ug8(this, activity, (byte) 2);
        this.e = ug8Var3;
        ug8Var2.addView(ug8Var3, qoe.e(-1, -1, 119));
        j57 j57Var = new j57(activity, ylbVar);
        this.n = j57Var;
        j57Var.a(0, jb6.M0(2131746901, null));
        j57Var.a(1, jb6.M0(2131746900, null));
        ug8Var2.addView(j57Var, qoe.e(-1, 66, 80));
        j57Var.setOnTabClick(new ci7(hs1Var, (byte) 15));
        im0 c = km0Var.c(j57Var, null, false);
        c.p(qqd.k(ylbVar));
        c.S.e = true;
        c.q(gm.L(8.0f));
        c.r(gm.L(16.0f));
        j57Var.setBackground(c);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(j57Var.getColor());
        textView.setText(jb6.M0(2131746902, null));
        textView.setGravity(17);
        ug8Var2.addView(textView, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        k44 k44Var = new k44(this, (byte) 27);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(ug8Var, k44Var);
    }

    public final void a(boolean z, pg8 pg8Var) {
        float f;
        long j;
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.h0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f2 = this.E;
        float f3 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.g0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final xg8 b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                byte b = r2;
                xg8 xg8Var = this.b;
                switch (b) {
                    case 0:
                        xg8Var.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        xg8Var.c.invalidate();
                        xg8Var.d.invalidate();
                        vg8 vg8Var = xg8Var.K;
                        if (vg8Var != null) {
                            vg8Var.invalidate();
                        }
                        xg8Var.e();
                        return;
                    default:
                        xg8Var.F = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.g0.addListener(new qx(this, z, pg8Var, (byte) 7));
        if (!z) {
            j = 330;
        } else {
            j = 520;
        }
        ValueAnimator valueAnimator3 = this.g0;
        d53 d53Var = d53.h;
        valueAnimator3.setInterpolator(d53Var);
        this.g0.setDuration(j);
        this.g0.start();
        float f4 = this.F;
        if (z) {
            f3 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f4, f3);
        this.h0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final xg8 b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                byte b = r2;
                xg8 xg8Var = this.b;
                switch (b) {
                    case 0:
                        xg8Var.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        xg8Var.c.invalidate();
                        xg8Var.d.invalidate();
                        vg8 vg8Var = xg8Var.K;
                        if (vg8Var != null) {
                            vg8Var.invalidate();
                        }
                        xg8Var.e();
                        return;
                    default:
                        xg8Var.F = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.h0.addListener(new jf4((byte) 24, this, z));
        this.h0.setDuration(((float) j) * 1.5f);
        this.h0.setInterpolator(d53Var);
        this.h0.start();
    }

    public final void b(boolean z) {
        boolean z2;
        rc2 rc2Var;
        v29 v29Var;
        if (z && (v29Var = this.R) != null && v29Var.getReactionsWindow() != null && !this.R.getReactionsWindow().q) {
            this.R.b();
        } else if (this.d0) {
        } else {
            this.d0 = true;
            this.Z = false;
            hs1 hs1Var = this.f;
            hs1Var.j();
            if (hs1Var.getCurrentPosition() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2 && (rc2Var = this.M) != null) {
                    rc2Var.setVisibility(4);
                    this.M.invalidate();
                }
            } else {
                rc2 rc2Var2 = this.M;
                if (rc2Var2 != null) {
                    rc2Var2.setVisibility(0);
                    rc2 rc2Var3 = this.M;
                    rc2Var3.d6 = null;
                    rc2Var3.invalidate();
                }
            }
            this.e0 = !z;
            d();
            a(false, new pg8(this, z2));
            this.c.invalidate();
        }
    }

    public final void c() {
        super.dismiss();
    }

    public final void d() {
        int i;
        ViewGroup viewGroup;
        if (!this.Z) {
            ug8 ug8Var = this.c;
            if (ug8Var.getWidth() > 0) {
                rc2 rc2Var = this.M;
                if (rc2Var != null) {
                    int[] iArr = new int[2];
                    rc2Var.getLocationOnScreen(iArr);
                    int i2 = iArr[0];
                    iq5 iq5Var = this.r;
                    this.X = i2 - iq5Var.a;
                    float f = iArr[1] - iq5Var.b;
                    this.Y = f;
                    if (!this.c0) {
                        this.c0 = true;
                        this.a0 = f;
                        if (this.U != null) {
                            float height = f + this.M.getHeight() + this.U.getHeight();
                            int height2 = ug8Var.getHeight();
                            iq5 iq5Var2 = this.r;
                            if (height > ((height2 - iq5Var2.b) - iq5Var2.d) - gm.L(66.0f)) {
                                int height3 = ug8Var.getHeight();
                                iq5 iq5Var3 = this.r;
                                this.a0 = ((((height3 - iq5Var3.b) - iq5Var3.d) - gm.L(66.0f)) - this.M.getHeight()) - this.U.getHeight();
                            }
                        }
                        int Y1 = this.K.Y1(this.Q);
                        this.K.X1(Y1);
                        float W1 = this.K.W1(Y1);
                        float f2 = this.Y;
                        this.b0 = f2;
                        float f3 = (int) W1;
                        int height4 = ug8Var.getHeight();
                        iq5 iq5Var4 = this.r;
                        int L = ((height4 - iq5Var4.b) - iq5Var4.d) - gm.L(78.0f);
                        TextView textView = this.h;
                        if (f2 + f3 > L - textView.getHeight()) {
                            int height5 = ug8Var.getHeight();
                            iq5 iq5Var5 = this.r;
                            this.b0 = ((((height5 - iq5Var5.b) - iq5Var5.d) - gm.L(78.0f)) - textView.getHeight()) - i;
                        }
                        if (this.S != null) {
                            float height6 = this.b0 + f3 + viewGroup.getHeight();
                            int height7 = ug8Var.getHeight();
                            iq5 iq5Var6 = this.r;
                            if (height6 > (((height7 - iq5Var6.b) - iq5Var6.d) - gm.L(78.0f)) - textView.getHeight()) {
                                int height8 = ug8Var.getHeight();
                                iq5 iq5Var7 = this.r;
                                this.b0 = (((((height8 - iq5Var7.b) - iq5Var7.d) - gm.L(78.0f)) - textView.getHeight()) - i) - this.S.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.Y = 0.0f;
                    this.X = 0.0f;
                }
                this.Z = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        b(true);
    }

    public final void e() {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        hs1 hs1Var = this.f;
        float positionAnimated = hs1Var.getPositionAnimated();
        int i2 = 0;
        float U1 = gm.U1(positionAnimated, 0, -hs1Var.getWidth());
        float U12 = gm.U1(positionAnimated, hs1Var.getWidth(), 0);
        if (this.Z) {
            ViewGroup viewGroup = this.U;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f5 = this.Y;
                this.a0 = f5;
                float height = f5 + this.M.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                ug8 ug8Var = this.c;
                int height2 = ug8Var.getHeight();
                iq5 iq5Var = this.r;
                if (height > ((height2 - iq5Var.b) - iq5Var.d) - gm.L(66.0f)) {
                    int height3 = ug8Var.getHeight();
                    iq5 iq5Var2 = this.r;
                    this.a0 = ((((height3 - iq5Var2.b) - iq5Var2.d) - gm.L(66.0f)) - this.M.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        wg8 wg8Var = this.L;
        float f6 = this.X;
        if (this.e0) {
            f = 1.0f;
        } else {
            f = this.E;
        }
        wg8Var.setTranslationX(gm.R1(f6, 0.0f, f) + U12);
        wg8 wg8Var2 = this.L;
        float f7 = this.Y;
        float f8 = this.a0;
        if (this.e0) {
            f2 = 1.0f;
        } else {
            f2 = this.E;
        }
        wg8Var2.setTranslationY(gm.R1(f7, f8, f2));
        ViewGroup viewGroup2 = this.U;
        ug8 ug8Var2 = this.e;
        if (viewGroup2 != null) {
            boolean z = this.J;
            wg8 wg8Var3 = this.L;
            if (z) {
                viewGroup2.setTranslationX(((this.L.getPollButtonsLeft() + ((U12 + 0.0f) + wg8Var3.getLeft())) - gm.L(8.0f)) - this.U.getLeft());
            } else {
                float f9 = U12 + 0.0f;
                if (wg8Var3.b3()) {
                    i = gm.L(48.0f);
                } else {
                    i = 0;
                }
                viewGroup2.setTranslationX(((f9 + i) + this.L.getLeft()) - this.U.getLeft());
            }
            this.V = ug8Var2.getMeasuredWidth() - (this.U.getX() - U12);
            this.U.setTranslationY(((this.L.getY() + this.L.getHeight()) - this.U.getTop()) - ug8Var2.getTop());
            this.U.setAlpha(this.E);
            float R1 = gm.R1(0.75f, 1.0f, this.E);
            this.U.setScaleX(R1);
            this.U.setScaleY(R1);
        }
        vg8 vg8Var = this.K;
        float f10 = this.X;
        if (this.e0) {
            f3 = 1.0f;
        } else {
            f3 = this.E;
        }
        vg8Var.setTranslationX(gm.R1(f10, 0.0f, f3) + U1);
        vg8 vg8Var2 = this.K;
        float f11 = this.Y;
        float f12 = this.b0;
        if (this.e0) {
            f4 = 1.0f;
        } else {
            f4 = this.E;
        }
        vg8Var2.setTranslationY(gm.R1(f11, f12, f4));
        if (this.S != null) {
            int Y1 = this.K.Y1(this.Q);
            this.K.X1(Y1);
            float W1 = this.K.W1(Y1);
            boolean z2 = this.J;
            ViewGroup viewGroup3 = this.S;
            vg8 vg8Var3 = this.K;
            if (z2) {
                viewGroup3.setTranslationX(((this.K.getPollButtonsLeft() + ((U1 + 0.0f) + vg8Var3.getLeft())) - gm.L(8.0f)) - this.S.getLeft());
            } else {
                float f13 = U1 + 0.0f;
                if (vg8Var3.b3()) {
                    i2 = gm.L(48.0f);
                }
                viewGroup3.setTranslationX(((f13 + i2) + this.K.getLeft()) - this.S.getLeft());
            }
            this.T = ug8Var2.getMeasuredWidth() - (this.S.getX() - U12);
            this.S.setTranslationY(((this.K.getY() + ((int) W1)) - this.S.getTop()) - ug8Var2.getTop());
            this.S.setAlpha(this.E);
            float R12 = gm.R1(0.75f, 1.0f, this.E);
            this.S.setScaleX(R12);
            this.S.setScaleY(R12);
        }
        if (this.e0) {
            this.L.setAlpha(this.E);
            this.K.setAlpha(this.E);
        }
        if (this.R != null) {
            float max = U12 + Math.max(0.0f, ((this.L.getBoundsLeft() + this.L.getBoundsRight()) / 2.0f) - (this.R.getWidth() * 0.8f));
            this.R.setTranslationX(max);
            this.R.setTranslationY(Math.max(0.0f, ((this.L.getY() - this.R.getHeight()) + gm.L(22.0f)) - ug8Var2.getTop()));
            this.R.setAlpha(this.E);
            View windowView = this.R.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.E);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(U1);
        textView.setAlpha(this.E);
        j57 j57Var = this.n;
        j57Var.setSelectedTab(positionAnimated);
        j57Var.setAlpha(this.E);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ug8 ug8Var = this.c;
        setContentView(ug8Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        gm.m(attributes);
        window.setAttributes(attributes);
        ug8Var.setSystemUiVisibility(1284);
        gm.j3(ug8Var, !cmb.I.o());
    }

    @Override
    public final void show() {
        if (!gm.K1(getContext())) {
            return;
        }
        super.show();
        vs9.d(new vt4(this, (byte) 27));
        this.P = true;
        a(true, null);
    }
}
