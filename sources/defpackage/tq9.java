package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class tq9 extends Dialog {
    public static final int P = 0;
    public ViewGroup E;
    public Drawable F;
    public il0 G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public ValueAnimator O;
    public final Context a;
    public final wjb b;
    public Bitmap c;
    public BitmapShader d;
    public Paint e;
    public Matrix f;
    public final hx4 h;
    public final kl0 n;
    public float r;
    public final oc6 s;
    public final cja w;
    public cs5 x;
    public FrameLayout y;

    public tq9(Context context, wjb wjbVar) {
        super(context, 2131755352);
        this.K = 1.0f;
        this.L = 1.0f;
        this.N = false;
        this.a = context;
        this.b = wjbVar;
        oc6 oc6Var = new oc6((byte) 16, context, this);
        this.s = oc6Var;
        oc6Var.setOnClickListener(new ik8(this, (byte) 12));
        cja cjaVar = new cja(context, null);
        this.w = cjaVar;
        cjaVar.setClipToPadding(false);
        oc6Var.addView(cjaVar, nme.e(-1, -1, 119));
        hx4 hx4Var = new hx4();
        this.h = hx4Var;
        kl0 kl0Var = new kl0(hx4Var, hx4Var, hx4Var);
        this.n = kl0Var;
        kl0Var.h = new zec(oc6Var);
        kl0Var.i = oc6Var;
        u39 u39Var = new u39(this, (byte) 8);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(oc6Var, u39Var);
    }

    public static void d(i8c i8cVar) {
        gl.j2(new ae9(i8cVar, (byte) 2), 15.0f);
    }

    public final void a(Runnable runnable, boolean z) {
        float f;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.r;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new x89(this, (byte) 7));
        this.O.addListener(new qw(this, z, runnable, (byte) 11));
        this.O.setInterpolator(s33.h);
        this.O.setDuration(350L);
        this.O.start();
    }

    public final void b() {
        super.dismiss();
    }

    public final void c() {
        super.dismiss();
    }

    @Override
    public final void dismiss() {
        if (this.N) {
            return;
        }
        this.N = true;
        a(new zk1(this, (byte) 3), false);
        this.s.invalidate();
    }

    public final void e(cs5 cs5Var) {
        int i = bkb.D8;
        wjb wjbVar = this.b;
        cs5Var.U(bkb.p1(0.06f, bkb.v0(i, wjbVar)));
        cs5Var.R(this.n, nod.k(wjbVar), false);
        this.x = cs5Var;
        this.E = cs5Var.A;
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.y = frameLayout;
        frameLayout.addView(this.E, nme.c(-2.0f, -2));
        this.w.addView(this.y, nme.c(-2.0f, -2));
    }

    public final void f(defpackage.gb2 r29, android.text.style.CharacterStyle r30, android.text.SpannableString r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq9.f(gb2, android.text.style.CharacterStyle, android.text.SpannableString, boolean):void");
    }

    @Override
    public final boolean isShowing() {
        return !this.N;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        oc6 oc6Var = this.s;
        setContentView(oc6Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        gl.m(attributes);
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
        d(new tf8(this, (byte) 14));
        a(null, true);
    }
}
