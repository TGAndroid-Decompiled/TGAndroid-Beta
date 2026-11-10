package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.gc;
import bi.sc;
import bi.w;
import c8.ha;
import c8.ka;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.w70;
public final class a extends LinearLayout {
    public final int f1056a = 1;
    public final Object f1057b;
    public final View f1058c;
    public final Object d;
    public final Object f1059e;

    public a(Context context, h6 h6Var, pj0 pj0Var) {
        super(context);
        this.d = new Paint(1);
        this.f1059e = new v5(this);
        this.f1057b = h6Var;
        this.f1058c = pj0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f1056a) {
            case 0:
                v5 v5Var = (v5) this.f1059e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(m6.w0(m6.f27834a7, (h6) this.f1057b));
                pj0 pj0Var = (pj0) this.f1058c;
                float f10 = 1.0f;
                if (pj0Var != null) {
                    if (!pj0Var.canScrollVertically(1)) {
                        f10 = 0.0f;
                    }
                    paint.setAlpha((int) (v5Var.e(false, f10) * 255.0f));
                } else {
                    paint.setAlpha((int) (v5Var.e(false, 1.0f) * 255.0f));
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
        addView(frameLayout, ha.r(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f1057b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(g0.o());
        textView.setGravity(1);
        addView(textView, ha.q(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        w70 w70Var = new w70(context, null);
        this.f1058c = w70Var;
        w70Var.setTextSize(1, 14.0f);
        w70Var.setLineSpacing(g0.L(2.0f), 1.0f);
        w70Var.setGravity(1);
        addView(w70Var, ha.q(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f1059e = frameLayout2;
        addView(frameLayout2, ha.r(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public a(Context context, h6 h6Var) {
        super(context);
        setPadding(g0.L(24.0f), g0.L(21.0f), g0.L(24.0f), g0.L(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f1057b = textView;
        int i7 = m6.f28282y6;
        t6.U(textView, i7, h6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, ha.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        w wVar = new w(1, context, h6Var, true);
        this.f1058c = wVar;
        wVar.setMinWidth(g0.L(200.0f));
        wVar.i(id.M0(2131746715, null), false, true);
        addView(wVar, ha.r(-2, 44, 17));
        ei.k kVar = new ei.k(context, h6Var);
        this.d = kVar;
        t6.U(kVar, i7, h6Var);
        kVar.setText(id.M0(2131746703, null));
        kVar.setTextSize(1, 14.0f);
        kVar.setTextAlignment(4);
        kVar.setGravity(17);
        kVar.setTypeface(g0.o());
        addView(kVar, ha.t(165, -2, 17, 0, 17, 0, 12));
        fi.d dVar = new fi.d(context, h6Var, false);
        this.f1059e = dVar;
        dVar.setMinWidth(g0.L(200.0f));
        addView(dVar, ha.r(-2, 44, 17));
    }

    public a(int i7, Context context, h6 h6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        gc gcVar = new gc(context, 70, 0, 0);
        frameLayout.addView(gcVar, ha.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        this.f1057b = mVar;
        vg.f fVar = mVar.f57420b;
        fVar.f57404z = m6.Tk;
        fVar.A = m6.Uk;
        fVar.b();
        mVar.setStarParticlesView(gcVar);
        frameLayout.addView(mVar, ha.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        sc scVar = new sc(i7, context, h6Var);
        this.f1058c = scVar;
        ka.a(scVar);
        scVar.setOnClickListener(new d(this, 12));
        frameLayout.addView(scVar, ha.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, ha.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        int i10 = m6.f27998j5;
        t6.U(textView, i10, h6Var);
        textView.setGravity(17);
        addView(textView, ha.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.f1059e = textView2;
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, i10, h6Var);
        textView2.setGravity(17);
        addView(textView2, ha.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
