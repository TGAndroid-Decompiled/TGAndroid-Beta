package jg;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.za0;
import w7.b6;
public final class d3 extends Dialog {
    public float D;
    public ValueAnimator E;
    public boolean F;
    public s0 G;
    public ph.h1 H;
    public final int f9932a;
    public final l0 f9933b;
    public final z2 f9934c;
    public final a3 d;
    public final ImageView e;
    public final b3 f9935f;
    public final Rect h;
    public Bitmap f9936n;
    public BitmapShader f9937r;
    public Paint f9938s;
    public Matrix f9939w;
    public final za0 f9940x;
    public final za0 f9941y;

    public d3(Context context, final int i10) {
        super(context, 2131755352);
        th.b bVar = new th.b();
        this.h = new Rect();
        this.F = false;
        this.f9932a = i10;
        l0 l0Var = new l0(this, context, 3);
        this.f9933b = l0Var;
        l0Var.setOnClickListener(new ag.g(this, 10));
        z2 z2Var = new z2(context, 0);
        this.f9934c = z2Var;
        z2Var.setOrientation(1);
        l0Var.addView(z2Var, b6.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        a3 a3Var = new a3(this, context, 0);
        a3Var.setWillNotDraw(false);
        z2Var.addView(a3Var, b6.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        a3Var.addView(frameLayout, b6.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(dd.L0(2131744652, null));
        textView.setTextColor(-1);
        sc.e.t(textView, 1, 18.0f);
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, b6.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        l4.setText(dd.L0(2131744653, null));
        l4.setTextColor(-8421505);
        l4.setTextSize(1, 14.0f);
        frameLayout.addView(l4, b6.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        a3 a3Var2 = new a3(this, context, 1);
        this.d = a3Var2;
        a3Var.addView(a3Var2, b6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        a3Var2.addView(imageView, b6.e(-1, -1, 119));
        b3 b3Var = new b3(this, context, org.telegram.messenger.i0.f16171p);
        this.f9935f = b3Var;
        a3Var2.addView(b3Var, b6.e(-2, -2, 17));
        z60 F = z60.F(l0Var, bVar, l0Var);
        za0 za0Var = new za0(getContext(), 2131624137, dd.L0(2131744663, null), 2131624136, dd.L0(2131744662, null), bVar);
        this.f9940x = za0Var;
        za0Var.setOnClickListener(new View.OnClickListener(this) {
            public final d3 f10379b;

            {
                this.f10379b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        d3 d3Var = this.f10379b;
                        s0 s0Var = d3Var.G;
                        boolean z10 = s0Var.f10210f;
                        s0Var.f10210f = !z10;
                        d3Var.f9940x.a(z10, true);
                        d3Var.f9935f.b(i10, d3Var.G, true);
                        return;
                    default:
                        d3 d3Var2 = this.f10379b;
                        s0 s0Var2 = d3Var2.G;
                        boolean z11 = s0Var2.e;
                        s0Var2.e = !z11;
                        d3Var2.f9941y.a(z11, true);
                        d3Var2.f9935f.b(i10, d3Var2.G, true);
                        return;
                }
            }
        });
        F.q(za0Var);
        za0 za0Var2 = new za0(context, 2131624087, dd.L0(2131748909, null), 2131624084, dd.L0(2131748908, null), bVar);
        this.f9941y = za0Var2;
        za0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final d3 f10379b;

            {
                this.f10379b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        d3 d3Var = this.f10379b;
                        s0 s0Var = d3Var.G;
                        boolean z10 = s0Var.f10210f;
                        s0Var.f10210f = !z10;
                        d3Var.f9940x.a(z10, true);
                        d3Var.f9935f.b(i10, d3Var.G, true);
                        return;
                    default:
                        d3 d3Var2 = this.f10379b;
                        s0 s0Var2 = d3Var2.G;
                        boolean z11 = s0Var2.e;
                        s0Var2.e = !z11;
                        d3Var2.f9941y.a(z11, true);
                        d3Var2.f9935f.b(i10, d3Var2.G, true);
                        return;
                }
            }
        });
        F.q(za0Var2);
        F.k();
        F.c(2131232356, dd.L0(2131754218, null), new x2(this, 2), false);
        F.c(2131232107, dd.L0(2131751362, null), new x2(this, 3), true);
        z2Var.addView(F.A, b6.p(-2, -2, 0.0f, 85));
        l0Var.setFitsSystemWindows(true);
        l0Var.setOnApplyWindowInsetsListener(new c3(this));
    }

    public final void b(boolean z10, x2 x2Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.D;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new bg.k(this, 8));
        this.E.addListener(new androidx.fragment.app.g(this, z10, x2Var, 1));
        this.E.setInterpolator(gr.h);
        ValueAnimator valueAnimator2 = this.E;
        if (z10) {
            j10 = 420;
        } else {
            j10 = 320;
        }
        valueAnimator2.setDuration(j10);
        this.E.start();
    }

    @Override
    public final void dismiss() {
        if (this.F) {
            return;
        }
        ph.h1 h1Var = this.H;
        if (h1Var != null) {
            h1Var.a(this.G);
            this.H = null;
        }
        this.F = true;
        b(false, new x2(this, 1));
        this.f9933b.invalidate();
    }

    @Override
    public final boolean isShowing() {
        return !this.F;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        l0 l0Var = this.f9933b;
        setContentView(l0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i10;
        int i11 = Build.VERSION.SDK_INT;
        attributes.flags = i10 | (-1945959040);
        if (i11 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        l0Var.setSystemUiVisibility(256);
        org.telegram.messenger.i0.n3(l0Var, !t6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.i0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.messenger.i0.l2(new ag.l(this, 14), 14.0f);
        b(true, null);
    }
}
