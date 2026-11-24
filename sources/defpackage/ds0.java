package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class ds0 extends LinearLayout {
    public final byte a = 3;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;

    public ds0(int i, ylb ylbVar, Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        uwa uwaVar = new uwa(context, 70, 0);
        frameLayout.addView(uwaVar, qoe.c(-1.0f, -1));
        ft4 ft4Var = new ft4(context, 1, 2);
        this.c = ft4Var;
        vs4 vs4Var = ft4Var.b;
        vs4Var.z = cmb.Vk;
        vs4Var.A = cmb.Wk;
        vs4Var.b();
        ft4Var.setStarParticlesView(uwaVar);
        frameLayout.addView(ft4Var, qoe.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        ft4Var.setPaused(false);
        cxa cxaVar = new cxa(i, ylbVar, context);
        this.d = cxaVar;
        rve.a(cxaVar);
        cxaVar.setOnClickListener(new oha(this, (byte) 9));
        frameLayout.addView(cxaVar, qoe.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, qoe.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.b = textView;
        ts2.s(textView, 1, 20.0f);
        int i2 = cmb.i5;
        anb.X(textView, i2, ylbVar);
        textView.setGravity(17);
        addView(textView, qoe.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, i2, ylbVar);
        textView2.setGravity(17);
        addView(textView2, qoe.t(-2, -2, 1, 0, 9, 0, 18));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                ln lnVar = (ln) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(cmb.v0(cmb.Z6, (ylb) this.b));
                r59 r59Var = (r59) this.c;
                float f = 1.0f;
                if (r59Var != null) {
                    if (!r59Var.canScrollVertically(1)) {
                        f = 0.0f;
                    }
                    paint.setAlpha((int) (lnVar.e(false, f) * 255.0f));
                } else {
                    paint.setAlpha((int) (lnVar.e(false, 1.0f) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), gm.e1(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public ds0(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, qoe.r(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(1);
        addView(textView, qoe.q(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        l66 l66Var = new l66(context, null);
        this.c = l66Var;
        l66Var.setTextSize(1, 14.0f);
        l66Var.setLineSpacing(gm.L(2.0f), 1.0f);
        l66Var.setGravity(1);
        addView(l66Var, qoe.q(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, qoe.r(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public ds0(Context context, ylb ylbVar) {
        super(context);
        setPadding(gm.L(24.0f), gm.L(21.0f), gm.L(24.0f), gm.L(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.b = textView;
        int i = cmb.x6;
        anb.X(textView, i, ylbVar);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, qoe.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        tb tbVar = new tb(context, true, ylbVar, (byte) 2);
        this.c = tbVar;
        tbVar.setMinWidth(gm.L(200.0f));
        tbVar.i(jb6.M0(2131746450, null), false, true);
        addView(tbVar, qoe.r(-2, 44, 17));
        t8 t8Var = new t8(context, ylbVar);
        this.d = t8Var;
        anb.X(t8Var, i, ylbVar);
        t8Var.setText(jb6.M0(2131746436, null));
        t8Var.setTextSize(1, 14.0f);
        t8Var.setTextAlignment(4);
        t8Var.setGravity(17);
        t8Var.setTypeface(gm.o());
        addView(t8Var, qoe.t(165, -2, 17, 0, 17, 0, 12));
        b61 b61Var = new b61(ylbVar, context, false);
        this.e = b61Var;
        b61Var.setMinWidth(gm.L(200.0f));
        addView(b61Var, qoe.r(-2, 44, 17));
    }

    public ds0(Context context, ylb ylbVar, r59 r59Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new ln(this);
        this.b = ylbVar;
        this.c = r59Var;
    }
}
