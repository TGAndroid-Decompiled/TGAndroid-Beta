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
public final class krb extends Dialog {
    public float E;
    public final jz4 F;
    public final km0 G;
    public k47 H;
    public boolean I;
    public irb J;
    public wg8 K;
    public rc2 L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public v29 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public float Y;
    public float Z;
    public final ylb a;
    public boolean a0;
    public final hrb b;
    public boolean b0;
    public final hrb c;
    public boolean c0;
    public final hrb d;
    public ru1 d0;
    public final hs1 e;
    public ValueAnimator e0;
    public final TextView f;
    public ValueAnimator f0;
    public final j57 h;
    public iq5 n;
    public Bitmap r;
    public BitmapShader s;
    public Paint w;
    public Matrix x;
    public float y;

    public krb(Activity activity, ylb ylbVar) {
        super(activity, 2131755352);
        this.n = iq5.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.b0 = false;
        this.a = ylbVar;
        hrb hrbVar = new hrb(this, activity, (byte) 0);
        this.b = hrbVar;
        hrbVar.setOnClickListener(new oha(this, (byte) 22));
        jz4 jz4Var = new jz4();
        this.F = jz4Var;
        km0 km0Var = new km0(jz4Var, jz4Var, jz4Var);
        this.G = km0Var;
        km0Var.h = new zgc(hrbVar);
        km0Var.i = hrbVar;
        hrb hrbVar2 = new hrb(this, activity, (byte) 1);
        this.c = hrbVar2;
        hrbVar2.setClipToPadding(false);
        hrbVar.addView(hrbVar2, qoe.e(-1, -1, 119));
        hs1 hs1Var = new hs1((byte) 8, activity, this);
        this.e = hs1Var;
        hs1Var.setAdapter(new bo0((byte) 7, activity, this));
        hrbVar2.addView(hs1Var, qoe.e(-1, -1, 119));
        hrb hrbVar3 = new hrb(this, activity, (byte) 2);
        this.d = hrbVar3;
        hrbVar2.addView(hrbVar3, qoe.e(-1, -1, 119));
        j57 j57Var = new j57(activity, ylbVar);
        this.h = j57Var;
        j57Var.a(0, jb6.M0(2131743754, null));
        j57Var.a(1, jb6.M0(2131743755, null));
        hrbVar2.addView(j57Var, qoe.e(-1, 66, 80));
        j57Var.setOnTabClick(new eg9(hs1Var, (byte) 21));
        im0 c = km0Var.c(j57Var, null, false);
        c.p(qqd.k(ylbVar));
        c.S.e = true;
        c.q(gm.L(8.0f));
        c.r(gm.L(16.0f));
        j57Var.setBackground(c);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(j57Var.getColor());
        textView.setText(jb6.M0(2131743756, null));
        textView.setGravity(17);
        hrbVar2.addView(textView, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        x59 x59Var = new x59(this, (byte) 20);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(hrbVar, x59Var);
    }

    public final void a(boolean z, n28 n28Var) {
        float f;
        long j;
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f2 = this.y;
        float f3 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.e0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final krb b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                byte b = r2;
                krb krbVar = this.b;
                switch (b) {
                    case 0:
                        krbVar.y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        krbVar.b.invalidate();
                        krbVar.c.invalidate();
                        krbVar.e();
                        return;
                    default:
                        krbVar.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.e0.addListener(new qx(this, z, n28Var, (byte) 15));
        if (!z) {
            j = 330;
        } else {
            j = 520;
        }
        ValueAnimator valueAnimator3 = this.e0;
        d53 d53Var = d53.h;
        valueAnimator3.setInterpolator(d53Var);
        this.e0.setDuration(j);
        this.e0.start();
        float f4 = this.E;
        if (z) {
            f3 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f4, f3);
        this.f0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final krb b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                byte b = r2;
                krb krbVar = this.b;
                switch (b) {
                    case 0:
                        krbVar.y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        krbVar.b.invalidate();
                        krbVar.c.invalidate();
                        krbVar.e();
                        return;
                    default:
                        krbVar.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f0.addListener(new sw9((byte) 9, this, z));
        this.f0.setDuration(((float) j) * 1.5f);
        this.f0.setInterpolator(d53Var);
        this.f0.start();
    }

    public final void b(boolean z) {
        boolean z2;
        rc2 rc2Var;
        v29 v29Var;
        if (z && (v29Var = this.Q) != null && v29Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().q) {
            this.Q.b();
        } else if (this.b0) {
        } else {
            this.b0 = true;
            this.X = false;
            hs1 hs1Var = this.e;
            hs1Var.j();
            if (hs1Var.getCurrentPosition() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2 && (rc2Var = this.L) != null) {
                    rc2Var.setVisibility(4);
                    this.L.invalidate();
                }
            } else {
                rc2 rc2Var2 = this.L;
                if (rc2Var2 != null) {
                    rc2Var2.setVisibility(0);
                    rc2 rc2Var3 = this.L;
                    rc2Var3.c6 = -1;
                    rc2Var3.invalidate();
                }
            }
            this.c0 = !z;
            d();
            a(false, new n28((byte) 22, this, z2));
            this.b.invalidate();
        }
    }

    public final void c() {
        super.dismiss();
    }

    public final void d() {
        int i;
        ViewGroup viewGroup;
        if (!this.X) {
            hrb hrbVar = this.b;
            if (hrbVar.getWidth() > 0) {
                rc2 rc2Var = this.L;
                if (rc2Var != null) {
                    int[] iArr = new int[2];
                    rc2Var.getLocationOnScreen(iArr);
                    int i2 = iArr[0];
                    iq5 iq5Var = this.n;
                    this.V = i2 - iq5Var.a;
                    float f = iArr[1] - iq5Var.b;
                    this.W = f;
                    if (!this.a0) {
                        this.a0 = true;
                        this.Y = f;
                        if (this.T != null) {
                            float height = f + this.L.getHeight() + this.T.getHeight();
                            int height2 = hrbVar.getHeight();
                            iq5 iq5Var2 = this.n;
                            if (height > ((height2 - iq5Var2.b) - iq5Var2.d) - gm.L(66.0f)) {
                                int height3 = hrbVar.getHeight();
                                iq5 iq5Var3 = this.n;
                                this.Y = ((((height3 - iq5Var3.b) - iq5Var3.d) - gm.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int e2 = this.J.e2(this.P);
                        this.J.X1(e2);
                        float W1 = this.J.W1(e2);
                        float f2 = this.W;
                        this.Z = f2;
                        float f3 = (int) W1;
                        int height4 = hrbVar.getHeight();
                        iq5 iq5Var4 = this.n;
                        int L = ((height4 - iq5Var4.b) - iq5Var4.d) - gm.L(78.0f);
                        TextView textView = this.f;
                        if (f2 + f3 > L - textView.getHeight()) {
                            int height5 = hrbVar.getHeight();
                            iq5 iq5Var5 = this.n;
                            this.Z = ((((height5 - iq5Var5.b) - iq5Var5.d) - gm.L(78.0f)) - textView.getHeight()) - i;
                        }
                        if (this.R != null) {
                            float height6 = this.Z + f3 + viewGroup.getHeight();
                            int height7 = hrbVar.getHeight();
                            iq5 iq5Var6 = this.n;
                            if (height6 > (((height7 - iq5Var6.b) - iq5Var6.d) - gm.L(78.0f)) - textView.getHeight()) {
                                int height8 = hrbVar.getHeight();
                                iq5 iq5Var7 = this.n;
                                this.Z = (((((height8 - iq5Var7.b) - iq5Var7.d) - gm.L(78.0f)) - textView.getHeight()) - i) - this.R.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.W = 0.0f;
                    this.V = 0.0f;
                }
                this.X = true;
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
        hs1 hs1Var = this.e;
        float positionAnimated = hs1Var.getPositionAnimated();
        int i2 = 0;
        float U1 = gm.U1(positionAnimated, 0, -hs1Var.getWidth());
        float U12 = gm.U1(positionAnimated, hs1Var.getWidth(), 0);
        if (this.X) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f5 = this.W;
                this.Y = f5;
                float height = f5 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                hrb hrbVar = this.b;
                int height2 = hrbVar.getHeight();
                iq5 iq5Var = this.n;
                if (height > ((height2 - iq5Var.b) - iq5Var.d) - gm.L(66.0f)) {
                    int height3 = hrbVar.getHeight();
                    iq5 iq5Var2 = this.n;
                    this.Y = ((((height3 - iq5Var2.b) - iq5Var2.d) - gm.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        wg8 wg8Var = this.K;
        float f6 = this.V;
        if (this.c0) {
            f = 1.0f;
        } else {
            f = this.y;
        }
        wg8Var.setTranslationX(gm.R1(f6, 0.0f, f) + U12);
        wg8 wg8Var2 = this.K;
        float f7 = this.W;
        float f8 = this.Y;
        if (this.c0) {
            f2 = 1.0f;
        } else {
            f2 = this.y;
        }
        wg8Var2.setTranslationY(gm.R1(f7, f8, f2));
        ViewGroup viewGroup2 = this.T;
        hrb hrbVar2 = this.d;
        if (viewGroup2 != null) {
            boolean z = this.I;
            wg8 wg8Var3 = this.K;
            if (z) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((U12 + 0.0f) + wg8Var3.getLeft())) - gm.L(8.0f)) - this.T.getLeft());
            } else {
                float f9 = U12 + 0.0f;
                if (wg8Var3.b3()) {
                    i = gm.L(48.0f);
                } else {
                    i = 0;
                }
                viewGroup2.setTranslationX(((f9 + i) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = hrbVar2.getMeasuredWidth() - (this.T.getX() - U12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - hrbVar2.getTop());
            this.T.setAlpha(this.y);
            float R1 = gm.R1(0.75f, 1.0f, this.y);
            this.T.setScaleX(R1);
            this.T.setScaleY(R1);
        }
        irb irbVar = this.J;
        float f10 = this.V;
        if (this.c0) {
            f3 = 1.0f;
        } else {
            f3 = this.y;
        }
        irbVar.setTranslationX(gm.R1(f10, 0.0f, f3) + U1);
        irb irbVar2 = this.J;
        float f11 = this.W;
        float f12 = this.Z;
        if (this.c0) {
            f4 = 1.0f;
        } else {
            f4 = this.y;
        }
        irbVar2.setTranslationY(gm.R1(f11, f12, f4));
        if (this.R != null) {
            int e2 = this.J.e2(this.P);
            this.J.X1(e2);
            float W1 = this.J.W1(e2);
            boolean z2 = this.I;
            ViewGroup viewGroup3 = this.R;
            irb irbVar3 = this.J;
            if (z2) {
                viewGroup3.setTranslationX(((this.J.getPollButtonsLeft() + ((U1 + 0.0f) + irbVar3.getLeft())) - gm.L(8.0f)) - this.R.getLeft());
            } else {
                float f13 = U1 + 0.0f;
                if (irbVar3.b3()) {
                    i2 = gm.L(48.0f);
                }
                viewGroup3.setTranslationX(((f13 + i2) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = hrbVar2.getMeasuredWidth() - (this.R.getX() - U12);
            this.R.setTranslationY(((this.J.getY() + ((int) W1)) - this.R.getTop()) - hrbVar2.getTop());
            this.R.setAlpha(this.y);
            float R12 = gm.R1(0.75f, 1.0f, this.y);
            this.R.setScaleX(R12);
            this.R.setScaleY(R12);
        }
        if (this.c0) {
            this.K.setAlpha(this.y);
            this.J.setAlpha(this.y);
        }
        if (this.Q != null) {
            float max = U12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + gm.L(22.0f)) - hrbVar2.getTop()));
            this.Q.setAlpha(this.y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.y);
            }
        }
        TextView textView = this.f;
        textView.setTranslationX(U1);
        textView.setAlpha(this.y);
        j57 j57Var = this.h;
        j57Var.setSelectedTab(positionAnimated);
        j57Var.setAlpha(this.y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        hrb hrbVar = this.b;
        setContentView(hrbVar, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        gm.m(attributes);
        window.setAttributes(attributes);
        hrbVar.setSystemUiVisibility(1284);
        gm.j3(hrbVar, !cmb.I.o());
    }

    @Override
    public final void show() {
        if (!gm.K1(getContext())) {
            return;
        }
        super.show();
        vs9.d(new o6b(this, (byte) 7));
        this.O = true;
        a(true, null);
    }
}
