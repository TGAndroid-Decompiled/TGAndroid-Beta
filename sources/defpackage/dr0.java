package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class dr0 extends LinearLayout {
    public final byte a = 3;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;

    public dr0(int i, vnb vnbVar, Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        uya uyaVar = new uya(context, 70, 0);
        frameLayout.addView(uyaVar, tre.c(-1.0f, -1));
        it4 it4Var = new it4(context, 1, 2);
        this.c = it4Var;
        ys4 ys4Var = it4Var.b;
        ys4Var.z = aob.Wk;
        ys4Var.A = aob.Xk;
        ys4Var.b();
        it4Var.setStarParticlesView(uyaVar);
        frameLayout.addView(it4Var, tre.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        it4Var.setPaused(false);
        cza czaVar = new cza(i, vnbVar, context);
        this.d = czaVar;
        iye.a(czaVar);
        czaVar.setOnClickListener(new kla(this, (byte) 7));
        frameLayout.addView(czaVar, tre.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, tre.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.b = textView;
        bs2.t(textView, 1, 20.0f);
        int i2 = aob.j5;
        yob.X(textView, i2, vnbVar);
        textView.setGravity(17);
        addView(textView, tre.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, i2, vnbVar);
        textView2.setGravity(17);
        addView(textView2, tre.t(-2, -2, 1, 0, 9, 0, 18));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                mm mmVar = (mm) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(aob.v0(aob.a7, (vnb) this.b));
                d79 d79Var = (d79) this.c;
                float f = 1.0f;
                if (d79Var != null) {
                    if (!d79Var.canScrollVertically(1)) {
                        f = 0.0f;
                    }
                    paint.setAlpha((int) (mmVar.e(false, f) * 255.0f));
                } else {
                    paint.setAlpha((int) (mmVar.e(false, 1.0f) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), hl.e1(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public dr0(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, tre.r(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(1);
        addView(textView, tre.q(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        p66 p66Var = new p66(context, null);
        this.c = p66Var;
        p66Var.setTextSize(1, 14.0f);
        p66Var.setLineSpacing(hl.L(2.0f), 1.0f);
        p66Var.setGravity(1);
        addView(p66Var, tre.q(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, tre.r(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public dr0(Context context, vnb vnbVar) {
        super(context);
        setPadding(hl.L(24.0f), hl.L(21.0f), hl.L(24.0f), hl.L(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.b = textView;
        int i = aob.y6;
        yob.X(textView, i, vnbVar);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, tre.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        ub ubVar = new ub(context, true, vnbVar, (byte) 2);
        this.c = ubVar;
        ubVar.setMinWidth(hl.L(200.0f));
        ubVar.i(ob6.M0(2131746444, null), false, true);
        addView(ubVar, tre.r(-2, 44, 17));
        u8 u8Var = new u8(context, vnbVar);
        this.d = u8Var;
        yob.X(u8Var, i, vnbVar);
        u8Var.setText(ob6.M0(2131746430, null));
        u8Var.setTextSize(1, 14.0f);
        u8Var.setTextAlignment(4);
        u8Var.setGravity(17);
        u8Var.setTypeface(hl.o());
        addView(u8Var, tre.t(165, -2, 17, 0, 17, 0, 12));
        c51 c51Var = new c51(vnbVar, context, false);
        this.e = c51Var;
        c51Var.setMinWidth(hl.L(200.0f));
        addView(c51Var, tre.r(-2, 44, 17));
    }

    public dr0(Context context, vnb vnbVar, d79 d79Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new mm(this);
        this.b = vnbVar;
        this.c = d79Var;
    }
}
