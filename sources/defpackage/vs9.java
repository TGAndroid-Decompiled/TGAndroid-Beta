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
public final class vs9 extends Dialog {
    public static final int P = 0;
    public ViewGroup E;
    public Drawable F;
    public im0 G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public ValueAnimator O;
    public final Context a;
    public final ylb b;
    public Bitmap c;
    public BitmapShader d;
    public Paint e;
    public Matrix f;
    public final jz4 h;
    public final km0 n;
    public float r;
    public final ne6 s;
    public final ela w;
    public bu5 x;
    public FrameLayout y;

    public vs9(Context context, ylb ylbVar) {
        super(context, 2131755352);
        this.K = 1.0f;
        this.L = 1.0f;
        this.N = false;
        this.a = context;
        this.b = ylbVar;
        ne6 ne6Var = new ne6((byte) 16, context, this);
        this.s = ne6Var;
        ne6Var.setOnClickListener(new wk8(this, (byte) 15));
        ela elaVar = new ela(context, null);
        this.w = elaVar;
        elaVar.setClipToPadding(false);
        ne6Var.addView(elaVar, qoe.e(-1, -1, 119));
        jz4 jz4Var = new jz4();
        this.h = jz4Var;
        km0 km0Var = new km0(jz4Var, jz4Var, jz4Var);
        this.n = km0Var;
        km0Var.h = new zgc(ne6Var);
        km0Var.i = ne6Var;
        x59 x59Var = new x59(this, (byte) 8);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(ne6Var, x59Var);
    }

    public static void d(jac jacVar) {
        gm.j2(new eg9(jacVar, (byte) 2), 15.0f);
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
        ofFloat.addUpdateListener(new p29(this, (byte) 9));
        this.O.addListener(new qx(this, z, runnable, (byte) 11));
        this.O.setInterpolator(d53.h);
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
        a(new hm1(this, (byte) 3), false);
        this.s.invalidate();
    }

    public final void e(bu5 bu5Var) {
        int i = cmb.D8;
        ylb ylbVar = this.b;
        bu5Var.U(cmb.p1(0.06f, cmb.v0(i, ylbVar)));
        bu5Var.R(this.n, qqd.k(ylbVar), false);
        this.x = bu5Var;
        this.E = bu5Var.A;
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.y = frameLayout;
        frameLayout.addView(this.E, qoe.c(-2.0f, -2));
        this.w.addView(this.y, qoe.c(-2.0f, -2));
    }

    public final void f(defpackage.rc2 r29, android.text.style.CharacterStyle r30, android.text.SpannableString r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs9.f(rc2, android.text.style.CharacterStyle, android.text.SpannableString, boolean):void");
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
        ne6 ne6Var = this.s;
        setContentView(ne6Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        gm.m(attributes);
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
        d(new vh8(this, (byte) 14));
        a(null, true);
    }
}
