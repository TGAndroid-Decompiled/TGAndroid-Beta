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

    public dr0(int i, wjb wjbVar, Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        qua quaVar = new qua(context, 70, 0);
        frameLayout.addView(quaVar, nme.c(-1.0f, -1));
        er4 er4Var = new er4(context, 1, 2);
        this.c = er4Var;
        uq4 uq4Var = er4Var.b;
        uq4Var.z = bkb.Vk;
        uq4Var.A = bkb.Wk;
        uq4Var.b();
        er4Var.setStarParticlesView(quaVar);
        frameLayout.addView(er4Var, nme.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        er4Var.setPaused(false);
        yua yuaVar = new yua(i, wjbVar, context);
        this.d = yuaVar;
        ote.a(yuaVar);
        yuaVar.setOnClickListener(new bna(this, (byte) 6));
        frameLayout.addView(yuaVar, nme.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, nme.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.b = textView;
        ir2.t(textView, 1, 20.0f);
        int i2 = bkb.i5;
        zkb.X(textView, i2, wjbVar);
        textView.setGravity(17);
        addView(textView, nme.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, i2, wjbVar);
        textView2.setGravity(17);
        addView(textView2, nme.t(-2, -2, 1, 0, 9, 0, 18));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                lm lmVar = (lm) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(bkb.v0(bkb.Z6, (wjb) this.b));
                o39 o39Var = (o39) this.c;
                float f = 1.0f;
                if (o39Var != null) {
                    if (!o39Var.canScrollVertically(1)) {
                        f = 0.0f;
                    }
                    paint.setAlpha((int) (lmVar.e(false, f) * 255.0f));
                } else {
                    paint.setAlpha((int) (lmVar.e(false, 1.0f) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), gl.e1(), paint);
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
        addView(frameLayout, nme.r(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(1);
        addView(textView, nme.q(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        l46 l46Var = new l46(context, null);
        this.c = l46Var;
        l46Var.setTextSize(1, 14.0f);
        l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
        l46Var.setGravity(1);
        addView(l46Var, nme.q(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, nme.r(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public dr0(Context context, wjb wjbVar) {
        super(context);
        setPadding(gl.L(24.0f), gl.L(21.0f), gl.L(24.0f), gl.L(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.b = textView;
        int i = bkb.x6;
        zkb.X(textView, i, wjbVar);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, nme.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        tb tbVar = new tb(context, true, wjbVar, (byte) 2);
        this.c = tbVar;
        tbVar.setMinWidth(gl.L(200.0f));
        tbVar.i(k96.M0(2131746524, null), false, true);
        addView(tbVar, nme.r(-2, 44, 17));
        t8 t8Var = new t8(context, wjbVar);
        this.d = t8Var;
        zkb.X(t8Var, i, wjbVar);
        t8Var.setText(k96.M0(2131746510, null));
        t8Var.setTextSize(1, 14.0f);
        t8Var.setTextAlignment(4);
        t8Var.setGravity(17);
        t8Var.setTypeface(gl.o());
        addView(t8Var, nme.t(165, -2, 17, 0, 17, 0, 12));
        u41 u41Var = new u41(wjbVar, context, false);
        this.e = u41Var;
        u41Var.setMinWidth(gl.L(200.0f));
        addView(u41Var, nme.r(-2, 44, 17));
    }

    public dr0(Context context, wjb wjbVar, o39 o39Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new lm(this);
        this.b = wjbVar;
        this.c = o39Var;
    }
}
