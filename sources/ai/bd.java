package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.x90;
public final class bd extends LinearLayout {
    public final int f1056a = 1;
    public final Object f1057b;
    public final Object f1058c;
    public final ViewGroup d;
    public final Object e;

    public bd(Context context, org.telegram.ui.ActionBar.d6 d6Var, im0 im0Var) {
        super(context);
        this.f1057b = new Paint(1);
        this.e = new org.telegram.ui.Components.f6(this);
        this.f1058c = d6Var;
        this.d = im0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f1056a) {
            case 2:
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f1057b;
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20929a7, (org.telegram.ui.ActionBar.d6) this.f1058c));
                im0 im0Var = (im0) this.d;
                float f7 = 1.0f;
                if (im0Var != null) {
                    if (!im0Var.canScrollVertically(1)) {
                        f7 = 0.0f;
                    }
                    paint.setAlpha((int) (f6Var.d(f7, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (f6Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public bd(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.z5.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f1057b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.z5.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        x90 x90Var = new x90(context, null);
        this.f1058c = x90Var;
        x90Var.setTextSize(1, 14.0f);
        x90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        x90Var.setGravity(1);
        addView(x90Var, w7.z5.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, w7.z5.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public bd(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        kc kcVar = new kc(context, 70, 0);
        frameLayout.addView(kcVar, w7.z5.c(-1.0f, -1));
        tg.n nVar = new tg.n(context, 1, 2);
        this.f1058c = nVar;
        tg.g gVar = nVar.f47103b;
        gVar.f47087z = org.telegram.ui.ActionBar.h6.fk;
        gVar.A = org.telegram.ui.ActionBar.h6.gk;
        gVar.b();
        nVar.setStarParticlesView(kcVar);
        frameLayout.addView(nVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        ad adVar = new ad(context, i10, d6Var);
        this.d = adVar;
        w7.b6.a(adVar);
        adVar.setOnClickListener(new ah.g0(this, 10));
        frameLayout.addView(adVar, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.z5.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.f1057b = textView;
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.h6.f21093j5;
        org.telegram.ui.Cells.c1.q(i11, d6Var, textView, 17);
        addView(textView, w7.z5.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        textView2.setGravity(17);
        addView(textView2, w7.z5.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
