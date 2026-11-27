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
public final class mu9 extends Dialog {
    public static final int P = 0;
    public ViewGroup E;
    public Drawable F;
    public jl0 G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public ValueAnimator O;
    public final Context a;
    public final vnb b;
    public Bitmap c;
    public BitmapShader d;
    public Paint e;
    public Matrix f;
    public final nz4 h;
    public final ll0 n;
    public float r;
    public final d26 s;
    public final wma w;
    public fu5 x;
    public FrameLayout y;

    public mu9(Context context, vnb vnbVar) {
        super(context, 2131755352);
        this.K = 1.0f;
        this.L = 1.0f;
        this.N = false;
        this.a = context;
        this.b = vnbVar;
        d26 d26Var = new d26((byte) 18, context, this);
        this.s = d26Var;
        d26Var.setOnClickListener(new jn8(this, (byte) 14));
        wma wmaVar = new wma(context, null);
        this.w = wmaVar;
        wmaVar.setClipToPadding(false);
        d26Var.addView(wmaVar, tre.e(-1, -1, 119));
        nz4 nz4Var = new nz4();
        this.h = nz4Var;
        ll0 ll0Var = new ll0(nz4Var, nz4Var, nz4Var);
        this.n = ll0Var;
        ll0Var.h = new yic(d26Var);
        ll0Var.i = d26Var;
        ve9 ve9Var = new ve9(this, (byte) 5);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(d26Var, ve9Var);
    }

    public static void d(icc iccVar) {
        hl.j2(new sh9(iccVar, (byte) 2), 15.0f);
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
        ofFloat.addUpdateListener(new b49(this, (byte) 9));
        this.O.addListener(new rw(this, z, runnable, (byte) 11));
        this.O.setInterpolator(k43.h);
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
        a(new dm1(this, (byte) 3), false);
        this.s.invalidate();
    }

    public final void e(fu5 fu5Var) {
        int i = aob.E8;
        vnb vnbVar = this.b;
        fu5Var.U(aob.p1(0.06f, aob.v0(i, vnbVar)));
        fu5Var.R(this.n, dtd.k(vnbVar), false);
        this.x = fu5Var;
        this.E = fu5Var.A;
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.y = frameLayout;
        frameLayout.addView(this.E, tre.c(-2.0f, -2));
        this.w.addView(this.y, tre.c(-2.0f, -2));
    }

    public final void f(defpackage.wb2 r29, android.text.style.CharacterStyle r30, android.text.SpannableString r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu9.f(wb2, android.text.style.CharacterStyle, android.text.SpannableString, boolean):void");
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
        d26 d26Var = this.s;
        setContentView(d26Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        hl.m(attributes);
        window.setAttributes(attributes);
        d26Var.setSystemUiVisibility(256);
        hl.j3(d26Var, !aob.I.o());
    }

    @Override
    public final void show() {
        if (!hl.K1(getContext())) {
            return;
        }
        super.show();
        d(new hj8(this, (byte) 14));
        a(null, true);
    }
}
