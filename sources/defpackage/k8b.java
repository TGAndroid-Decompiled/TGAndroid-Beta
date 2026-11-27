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
public final class k8b extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public g66 H;
    public sh9 I;
    public final int a;
    public final h8b b;
    public final u1 c;
    public final gb0 d;
    public final ImageView e;
    public final i8b f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix w;
    public final r57 x;
    public final r57 y;

    public k8b(Context context, final int i) {
        super(context, 2131755352);
        x53 x53Var = new x53();
        this.h = new Rect();
        this.G = false;
        this.a = i;
        h8b h8bVar = new h8b((byte) 0, context, this);
        this.b = h8bVar;
        h8bVar.setOnClickListener(new kla(this, (byte) 13));
        u1 u1Var = new u1((byte) 11, context, false);
        this.c = u1Var;
        u1Var.setOrientation(1);
        h8bVar.addView(u1Var, tre.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        gb0 gb0Var = new gb0(this, context, (byte) 10);
        gb0Var.setWillNotDraw(false);
        u1Var.addView(gb0Var, tre.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        gb0Var.addView(frameLayout, tre.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131744287, null));
        textView.setTextColor(-1);
        bs2.t(textView, 1, 18.0f);
        TextView l = ik8.l(frameLayout, textView, tre.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        l.setText(ob6.M0(2131744288, null));
        l.setTextColor(-8421505);
        l.setTextSize(1, 14.0f);
        frameLayout.addView(l, tre.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        gb0 gb0Var2 = new gb0(this, context, (byte) 11);
        this.d = gb0Var2;
        gb0Var.addView(gb0Var2, tre.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        gb0Var2.addView(imageView, tre.e(-1, -1, 119));
        i8b i8bVar = new i8b(this, context, hl.p);
        this.f = i8bVar;
        gb0Var2.addView(i8bVar, tre.e(-2, -2, 17));
        fu5 G = fu5.G(h8bVar, x53Var, h8bVar);
        r57 r57Var = new r57(getContext(), 2131624139, ob6.M0(2131744298, null), 2131624138, ob6.M0(2131744297, null), x53Var);
        this.x = r57Var;
        r57Var.setOnClickListener(new View.OnClickListener(this) {
            public final k8b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                int i2 = i;
                k8b k8bVar = this.b;
                switch (b) {
                    case 0:
                        g66 g66Var = k8bVar.H;
                        boolean z = g66Var.f;
                        g66Var.f = !z;
                        k8bVar.x.a(z, true);
                        k8bVar.f.b(i2, k8bVar.H, true);
                        return;
                    default:
                        g66 g66Var2 = k8bVar.H;
                        boolean z2 = g66Var2.e;
                        g66Var2.e = !z2;
                        k8bVar.y.a(z2, true);
                        k8bVar.f.b(i2, k8bVar.H, true);
                        return;
                }
            }
        });
        G.p(r57Var);
        r57 r57Var2 = new r57(context, 2131624090, ob6.M0(2131748653, null), 2131624087, ob6.M0(2131748652, null), x53Var);
        this.y = r57Var2;
        r57Var2.setOnClickListener(new View.OnClickListener(this) {
            public final k8b b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                int i2 = i;
                k8b k8bVar = this.b;
                switch (b) {
                    case 0:
                        g66 g66Var = k8bVar.H;
                        boolean z = g66Var.f;
                        g66Var.f = !z;
                        k8bVar.x.a(z, true);
                        k8bVar.f.b(i2, k8bVar.H, true);
                        return;
                    default:
                        g66 g66Var2 = k8bVar.H;
                        boolean z2 = g66Var2.e;
                        g66Var2.e = !z2;
                        k8bVar.y.a(z2, true);
                        k8bVar.f.b(i2, k8bVar.H, true);
                        return;
                }
            }
        });
        G.p(r57Var2);
        G.j();
        G.b(2131232362, ob6.M0(2131754211, null), new f8b(this, (byte) 2), false);
        G.b(2131232113, ob6.M0(2131751326, null), new f8b(this, (byte) 3), true);
        u1Var.addView(G.A, tre.p(-2, -2, 0.0f, 85));
        h8bVar.setFitsSystemWindows(true);
        h8bVar.setOnApplyWindowInsetsListener(new j8b(this));
    }

    public final void a(boolean z, f8b f8bVar) {
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
        ofFloat.addUpdateListener(new ija(this, (byte) 17));
        this.F.addListener(new rw(this, z, f8bVar, (byte) 13));
        this.F.setInterpolator(k43.h);
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
        sh9 sh9Var = this.I;
        if (sh9Var != null) {
            sh9Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        a(false, new f8b(this, (byte) 1));
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
        h8b h8bVar = this.b;
        setContentView(h8bVar, layoutParams);
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
        h8bVar.setSystemUiVisibility(256);
        hl.j3(h8bVar, !aob.I.o());
    }

    @Override
    public final void show() {
        if (!hl.K1(getContext())) {
            return;
        }
        super.show();
        hl.j2(new sh9(this, (byte) 15), 14.0f);
        a(true, null);
    }
}
