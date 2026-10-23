package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.y90;
public final class cd extends LinearLayout {
    public final int f1111a = 1;
    public final Object f1112b;
    public final Object f1113c;
    public final ViewGroup d;
    public final Object e;

    public cd(Context context, org.telegram.ui.ActionBar.g6 g6Var, mm0 mm0Var) {
        super(context);
        this.f1112b = new Paint(1);
        this.e = new org.telegram.ui.Components.f6(this);
        this.f1113c = g6Var;
        this.d = mm0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f1111a) {
            case 2:
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f1112b;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21125a7, (org.telegram.ui.ActionBar.g6) this.f1113c));
                mm0 mm0Var = (mm0) this.d;
                float f7 = 1.0f;
                if (mm0Var != null) {
                    if (!mm0Var.canScrollVertically(1)) {
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

    public cd(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.z5.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f1112b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.z5.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        y90 y90Var = new y90(context, null);
        this.f1113c = y90Var;
        y90Var.setTextSize(1, 14.0f);
        y90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        y90Var.setGravity(1);
        addView(y90Var, w7.z5.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, w7.z5.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public cd(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        lc lcVar = new lc(context, 70, 0);
        frameLayout.addView(lcVar, w7.z5.c(-1.0f, -1));
        tg.n nVar = new tg.n(context, 1, 2);
        this.f1113c = nVar;
        tg.g gVar = nVar.f47547b;
        gVar.f47531z = org.telegram.ui.ActionBar.k6.fk;
        gVar.A = org.telegram.ui.ActionBar.k6.gk;
        gVar.b();
        nVar.setStarParticlesView(lcVar);
        frameLayout.addView(nVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        bd bdVar = new bd(context, i10, g6Var);
        this.d = bdVar;
        w7.b6.a(bdVar);
        bdVar.setOnClickListener(new ah.g0(this, 10));
        frameLayout.addView(bdVar, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.z5.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.f1112b = textView;
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setGravity(17);
        addView(textView, w7.z5.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, i11, g6Var);
        textView2.setGravity(17);
        addView(textView2, w7.z5.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
