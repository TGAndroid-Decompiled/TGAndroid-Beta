package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.s;
import c8.ja;
import c8.na;
import di.bb;
import di.ra;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
public final class a extends LinearLayout {
    public final int f1054a = 1;
    public final Object f1055b;
    public final View f1056c;
    public final Object d;
    public final Object f1057e;

    public a(Context context, e6 e6Var, uj0 uj0Var) {
        super(context);
        this.d = new Paint(1);
        this.f1057e = new u5(this);
        this.f1055b = e6Var;
        this.f1056c = uj0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f1054a) {
            case 0:
                u5 u5Var = (u5) this.f1057e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(j6.w0(j6.f28792a7, (e6) this.f1055b));
                uj0 uj0Var = (uj0) this.f1056c;
                float f10 = 1.0f;
                if (uj0Var != null) {
                    if (!uj0Var.canScrollVertically(1)) {
                        f10 = 0.0f;
                    }
                    paint.setAlpha((int) (u5Var.e(false, f10) * 255.0f));
                } else {
                    paint.setAlpha((int) (u5Var.e(false, 1.0f) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), g0.f1(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public a(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, ja.r(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f1055b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(g0.o());
        textView.setGravity(1);
        addView(textView, ja.q(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        z70 z70Var = new z70(context, null);
        this.f1056c = z70Var;
        z70Var.setTextSize(1, 14.0f);
        z70Var.setLineSpacing(g0.L(2.0f), 1.0f);
        z70Var.setGravity(1);
        addView(z70Var, ja.q(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f1057e = frameLayout2;
        addView(frameLayout2, ja.r(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public a(Context context, e6 e6Var) {
        super(context);
        setPadding(g0.L(24.0f), g0.L(21.0f), g0.L(24.0f), g0.L(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f1055b = textView;
        int i7 = j6.f29241y6;
        q6.U(textView, i7, e6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, ja.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        s sVar = new s(2, context, e6Var, true);
        this.f1056c = sVar;
        sVar.setMinWidth(g0.L(200.0f));
        sVar.i(hd.M0(2131746715, null), false, true);
        addView(sVar, ja.r(-2, 44, 17));
        gi.j jVar = new gi.j(context, e6Var);
        this.d = jVar;
        q6.U(jVar, i7, e6Var);
        jVar.setText(hd.M0(2131746703, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        addView(jVar, ja.t(165, -2, 17, 0, 17, 0, 12));
        hi.d dVar = new hi.d(context, e6Var, false);
        this.f1057e = dVar;
        dVar.setMinWidth(g0.L(200.0f));
        addView(dVar, ja.r(-2, 44, 17));
    }

    public a(int i7, Context context, e6 e6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ra raVar = new ra(context, 70, 0, 0);
        frameLayout.addView(raVar, ja.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        this.f1055b = mVar;
        vg.f fVar = mVar.f58893b;
        fVar.f58877z = j6.Wk;
        fVar.A = j6.Xk;
        fVar.b();
        mVar.setStarParticlesView(raVar);
        frameLayout.addView(mVar, ja.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        bb bbVar = new bb(i7, context, e6Var);
        this.f1056c = bbVar;
        na.a(bbVar);
        bbVar.setOnClickListener(new d(this, 19));
        frameLayout.addView(bbVar, ja.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, ja.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        i5.c.v(textView, 1, 20.0f);
        int i10 = j6.f28957j5;
        q6.U(textView, i10, e6Var);
        textView.setGravity(17);
        addView(textView, ja.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.f1057e = textView2;
        textView2.setTextSize(1, 14.0f);
        q6.U(textView2, i10, e6Var);
        textView2.setGravity(17);
        addView(textView2, ja.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
