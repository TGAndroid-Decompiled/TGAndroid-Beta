package defpackage;

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
public final class n6b extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public c66 H;
    public eg9 I;
    public final int a;
    public final ne6 b;
    public final t1 c;
    public final ec0 d;
    public final ImageView e;
    public final l6b f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix w;
    public final k57 x;
    public final k57 y;

    public n6b(Context context, final int i) {
        super(context, 2131755352);
        r63 r63Var = new r63();
        this.h = new Rect();
        this.G = false;
        this.a = i;
        ne6 ne6Var = new ne6((byte) 28, context, this);
        this.b = ne6Var;
        ne6Var.setOnClickListener(new oha(this, (byte) 15));
        t1 t1Var = new t1((byte) 11, context, false);
        this.c = t1Var;
        t1Var.setOrientation(1);
        ne6Var.addView(t1Var, qoe.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        ec0 ec0Var = new ec0(this, context, (byte) 10);
        ec0Var.setWillNotDraw(false);
        t1Var.addView(ec0Var, qoe.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        ec0Var.addView(frameLayout, qoe.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131744319, null));
        textView.setTextColor(-1);
        ts2.s(textView, 1, 18.0f);
        TextView l = wi8.l(frameLayout, textView, qoe.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        l.setText(jb6.M0(2131744320, null));
        l.setTextColor(-8421505);
        l.setTextSize(1, 14.0f);
        frameLayout.addView(l, qoe.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        ec0 ec0Var2 = new ec0(this, context, (byte) 11);
        this.d = ec0Var2;
        ec0Var.addView(ec0Var2, qoe.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ec0Var2.addView(imageView, qoe.e(-1, -1, 119));
        l6b l6bVar = new l6b(this, context, gm.p);
        this.f = l6bVar;
        ec0Var2.addView(l6bVar, qoe.e(-2, -2, 17));
        bu5 G = bu5.G(ne6Var, r63Var, ne6Var);
        k57 k57Var = new k57(getContext(), 2131624139, jb6.M0(2131744330, null), 2131624138, jb6.M0(2131744329, null), r63Var);
        this.x = k57Var;
        k57Var.setOnClickListener(new View.OnClickListener(this) {
            public final n6b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                int i2 = i;
                n6b n6bVar = this.b;
                switch (b) {
                    case 0:
                        c66 c66Var = n6bVar.H;
                        boolean z = c66Var.f;
                        c66Var.f = !z;
                        n6bVar.x.a(z, true);
                        n6bVar.f.b(i2, n6bVar.H, true);
                        return;
                    default:
                        c66 c66Var2 = n6bVar.H;
                        boolean z2 = c66Var2.e;
                        c66Var2.e = !z2;
                        n6bVar.y.a(z2, true);
                        n6bVar.f.b(i2, n6bVar.H, true);
                        return;
                }
            }
        });
        G.p(k57Var);
        k57 k57Var2 = new k57(context, 2131624090, jb6.M0(2131748656, null), 2131624087, jb6.M0(2131748655, null), r63Var);
        this.y = k57Var2;
        k57Var2.setOnClickListener(new View.OnClickListener(this) {
            public final n6b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                int i2 = i;
                n6b n6bVar = this.b;
                switch (b) {
                    case 0:
                        c66 c66Var = n6bVar.H;
                        boolean z = c66Var.f;
                        c66Var.f = !z;
                        n6bVar.x.a(z, true);
                        n6bVar.f.b(i2, n6bVar.H, true);
                        return;
                    default:
                        c66 c66Var2 = n6bVar.H;
                        boolean z2 = c66Var2.e;
                        c66Var2.e = !z2;
                        n6bVar.y.a(z2, true);
                        n6bVar.f.b(i2, n6bVar.H, true);
                        return;
                }
            }
        });
        G.p(k57Var2);
        G.j();
        G.b(2131232363, jb6.M0(2131754183, null), new j6b(this, (byte) 2), false);
        G.b(2131232114, jb6.M0(2131751298, null), new j6b(this, (byte) 3), true);
        t1Var.addView(G.A, qoe.p(-2, -2, 0.0f, 85));
        ne6Var.setFitsSystemWindows(true);
        ne6Var.setOnApplyWindowInsetsListener(new m6b(this));
    }

    public final void a(boolean z, j6b j6bVar) {
        float f;
        long j;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.E;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new rha(this, (byte) 17));
        this.F.addListener(new qx(this, z, j6bVar, (byte) 13));
        this.F.setInterpolator(d53.h);
        ValueAnimator valueAnimator2 = this.F;
        if (z) {
            j = 420;
        } else {
            j = 320;
        }
        valueAnimator2.setDuration(j);
        this.F.start();
    }

    public final void b() {
        super.dismiss();
    }

    @Override
    public final void dismiss() {
        if (this.G) {
            return;
        }
        eg9 eg9Var = this.I;
        if (eg9Var != null) {
            eg9Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        a(false, new j6b(this, (byte) 1));
        this.b.invalidate();
    }

    @Override
    public final boolean isShowing() {
        return !this.G;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ne6 ne6Var = this.b;
        setContentView(ne6Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        ne6Var.setSystemUiVisibility(256);
        gm.j3(ne6Var, !cmb.I.o());
    }

    @Override
    public final void show() {
        if (!gm.K1(getContext())) {
            return;
        }
        super.show();
        gm.j2(new eg9(this, (byte) 15), 14.0f);
        a(true, null);
    }
}
