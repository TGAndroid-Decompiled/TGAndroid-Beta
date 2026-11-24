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
public final class m4b extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public c46 H;
    public ae9 I;
    public final int a;
    public final oc6 b;
    public final t1 c;
    public final eb0 d;
    public final ImageView e;
    public final k4b f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix w;
    public final k37 x;
    public final k37 y;

    public m4b(Context context, final int i) {
        super(context, 2131755352);
        f53 f53Var = new f53();
        this.h = new Rect();
        this.G = false;
        this.a = i;
        oc6 oc6Var = new oc6((byte) 28, context, this);
        this.b = oc6Var;
        oc6Var.setOnClickListener(new bna(this, (byte) 12));
        t1 t1Var = new t1((byte) 11, context, false);
        this.c = t1Var;
        t1Var.setOrientation(1);
        oc6Var.addView(t1Var, nme.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        eb0 eb0Var = new eb0(this, context, (byte) 10);
        eb0Var.setWillNotDraw(false);
        t1Var.addView(eb0Var, nme.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        eb0Var.addView(frameLayout, nme.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131744393, null));
        textView.setTextColor(-1);
        ir2.t(textView, 1, 18.0f);
        TextView l = ug8.l(frameLayout, textView, nme.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        l.setText(k96.M0(2131744394, null));
        l.setTextColor(-8421505);
        l.setTextSize(1, 14.0f);
        frameLayout.addView(l, nme.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        eb0 eb0Var2 = new eb0(this, context, (byte) 11);
        this.d = eb0Var2;
        eb0Var.addView(eb0Var2, nme.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        eb0Var2.addView(imageView, nme.e(-1, -1, 119));
        k4b k4bVar = new k4b(this, context, gl.p);
        this.f = k4bVar;
        eb0Var2.addView(k4bVar, nme.e(-2, -2, 17));
        cs5 G = cs5.G(oc6Var, f53Var, oc6Var);
        k37 k37Var = new k37(getContext(), 2131624139, k96.M0(2131744404, null), 2131624138, k96.M0(2131744403, null), f53Var);
        this.x = k37Var;
        k37Var.setOnClickListener(new View.OnClickListener(this) {
            public final m4b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                int i2 = i;
                m4b m4bVar = this.b;
                switch (b) {
                    case 0:
                        c46 c46Var = m4bVar.H;
                        boolean z = c46Var.f;
                        c46Var.f = !z;
                        m4bVar.x.a(z, true);
                        m4bVar.f.b(i2, m4bVar.H, true);
                        return;
                    default:
                        c46 c46Var2 = m4bVar.H;
                        boolean z2 = c46Var2.e;
                        c46Var2.e = !z2;
                        m4bVar.y.a(z2, true);
                        m4bVar.f.b(i2, m4bVar.H, true);
                        return;
                }
            }
        });
        G.p(k37Var);
        k37 k37Var2 = new k37(context, 2131624090, k96.M0(2131748707, null), 2131624087, k96.M0(2131748706, null), f53Var);
        this.y = k37Var2;
        k37Var2.setOnClickListener(new View.OnClickListener(this) {
            public final m4b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                int i2 = i;
                m4b m4bVar = this.b;
                switch (b) {
                    case 0:
                        c46 c46Var = m4bVar.H;
                        boolean z = c46Var.f;
                        c46Var.f = !z;
                        m4bVar.x.a(z, true);
                        m4bVar.f.b(i2, m4bVar.H, true);
                        return;
                    default:
                        c46 c46Var2 = m4bVar.H;
                        boolean z2 = c46Var2.e;
                        c46Var2.e = !z2;
                        m4bVar.y.a(z2, true);
                        m4bVar.f.b(i2, m4bVar.H, true);
                        return;
                }
            }
        });
        G.p(k37Var2);
        G.j();
        G.b(2131232362, k96.M0(2131754215, null), new i4b(this, (byte) 2), false);
        G.b(2131232113, k96.M0(2131751349, null), new i4b(this, (byte) 3), true);
        t1Var.addView(G.A, nme.p(-2, -2, 0.0f, 85));
        oc6Var.setFitsSystemWindows(true);
        oc6Var.setOnApplyWindowInsetsListener(new l4b(this));
    }

    public final void a(boolean z, i4b i4bVar) {
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
        ofFloat.addUpdateListener(new gja(this, (byte) 15));
        this.F.addListener(new qw(this, z, i4bVar, (byte) 13));
        this.F.setInterpolator(s33.h);
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
        ae9 ae9Var = this.I;
        if (ae9Var != null) {
            ae9Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        a(false, new i4b(this, (byte) 1));
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
        oc6 oc6Var = this.b;
        setContentView(oc6Var, layoutParams);
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
        oc6Var.setSystemUiVisibility(256);
        gl.j3(oc6Var, !bkb.I.o());
    }

    @Override
    public final void show() {
        if (!gl.K1(getContext())) {
            return;
        }
        super.show();
        gl.j2(new ae9(this, (byte) 15), 14.0f);
        a(true, null);
    }
}
