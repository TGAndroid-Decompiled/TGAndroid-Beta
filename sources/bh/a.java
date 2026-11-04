package bh;

import ai.x;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import ci.bb;
import ci.lb;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u5;
public final class a extends LinearLayout {
    public final int f3298a = 1;
    public final Object f3299b;
    public final View f3300c;
    public final Object d;
    public final Object f3301e;

    public a(Context context, e6 e6Var, tj0 tj0Var) {
        super(context);
        this.d = new Paint(1);
        this.f3301e = new u5(this);
        this.f3299b = e6Var;
        this.f3300c = tj0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3298a) {
            case 0:
                u5 u5Var = (u5) this.f3301e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(k6.w0(k6.f27824a7, (e6) this.f3299b));
                tj0 tj0Var = (tj0) this.f3300c;
                float f10 = 1.0f;
                if (tj0Var != null) {
                    if (!tj0Var.canScrollVertically(1)) {
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
        addView(frameLayout, mf.r(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f3299b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(g0.o());
        textView.setGravity(1);
        addView(textView, mf.q(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        s70 s70Var = new s70(context, null);
        this.f3300c = s70Var;
        s70Var.setTextSize(1, 14.0f);
        s70Var.setLineSpacing(g0.L(2.0f), 1.0f);
        s70Var.setGravity(1);
        addView(s70Var, mf.q(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3301e = frameLayout2;
        addView(frameLayout2, mf.r(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public a(Context context, e6 e6Var) {
        super(context);
        setPadding(g0.L(24.0f), g0.L(21.0f), g0.L(24.0f), g0.L(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f3299b = textView;
        int i3 = k6.f28273y6;
        r6.V(textView, i3, e6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, mf.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        x xVar = new x(2, context, e6Var, true);
        this.f3300c = xVar;
        xVar.setMinWidth(g0.L(200.0f));
        xVar.i(bd.M0(2131746723, null), false, true);
        addView(xVar, mf.r(-2, 44, 17));
        fi.j jVar = new fi.j(context, e6Var);
        this.d = jVar;
        r6.V(jVar, i3, e6Var);
        jVar.setText(bd.M0(2131746711, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        addView(jVar, mf.t(165, -2, 17, 0, 17, 0, 12));
        gi.d dVar = new gi.d(context, e6Var, false);
        this.f3301e = dVar;
        dVar.setMinWidth(g0.L(200.0f));
        addView(dVar, mf.r(-2, 44, 17));
    }

    public a(int i3, Context context, e6 e6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        bb bbVar = new bb(context, 70, 0, 0);
        frameLayout.addView(bbVar, mf.c(-1.0f, -1));
        wg.m mVar = new wg.m(context, 1, 2);
        this.f3299b = mVar;
        wg.f fVar = mVar.f57666b;
        fVar.f57650z = k6.Tk;
        fVar.A = k6.Uk;
        fVar.b();
        mVar.setStarParticlesView(bbVar);
        frameLayout.addView(mVar, mf.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        lb lbVar = new lb(i3, context, e6Var);
        this.f3300c = lbVar;
        pf.a(lbVar);
        lbVar.setOnClickListener(new ai.b(this, 15));
        frameLayout.addView(lbVar, mf.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, mf.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        p1.t(textView, 1, 20.0f);
        int i10 = k6.f27988j5;
        r6.V(textView, i10, e6Var);
        textView.setGravity(17);
        addView(textView, mf.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.f3301e = textView2;
        textView2.setTextSize(1, 14.0f);
        r6.V(textView2, i10, e6Var);
        textView2.setGravity(17);
        addView(textView2, mf.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
