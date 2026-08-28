package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import g7.g6;
import gh.da;
import gh.n9;
import j3.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.y5;
public final class a extends LinearLayout {
    public final int f6273a = 2;
    public final Object f6274b;
    public final View f6275c;
    public final Object d;
    public final Object f6276e;

    public a(Context context, b6 b6Var, wk0 wk0Var) {
        super(context);
        this.d = new Paint(1);
        this.f6276e = new y5(this);
        this.f6274b = b6Var;
        this.f6275c = wk0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f6273a) {
            case 0:
                y5 y5Var = (y5) this.f6276e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(f6.v0(f6.f22947a7, (b6) this.f6274b));
                wk0 wk0Var = (wk0) this.f6275c;
                float f10 = 1.0f;
                if (wk0Var != null) {
                    if (!wk0Var.canScrollVertically(1)) {
                        f10 = 0.0f;
                    }
                    paint.setAlpha((int) (y5Var.d(f10, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (y5Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
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
        addView(frameLayout, e6.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f6274b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, e6.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        l80 l80Var = new l80(context, null);
        this.f6275c = l80Var;
        l80Var.setTextSize(1, 14.0f);
        l80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        l80Var.setGravity(1);
        addView(l80Var, e6.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f6276e = frameLayout2;
        addView(frameLayout2, e6.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public a(Context context, int i9, b6 b6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        n9 n9Var = new n9(context, 70, 0);
        frameLayout.addView(n9Var, e6.c(-1.0f, -1));
        ag.j jVar = new ag.j(context, 1, 2);
        this.f6274b = jVar;
        ag.a aVar = jVar.f205b;
        aVar.f181w = f6.fk;
        aVar.f182x = f6.gk;
        aVar.b();
        jVar.setStarParticlesView(n9Var);
        frameLayout.addView(jVar, e6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        jVar.setPaused(false);
        da daVar = new da(context, i9, b6Var);
        this.f6275c = daVar;
        g6.a(daVar);
        daVar.setOnClickListener(new androidx.mediarouter.app.c(this, 17));
        frameLayout.addView(daVar, e6.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, e6.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        r0.u(20.0f, 1, textView);
        int i10 = f6.f23108j5;
        textView.setTextColor(f6.v0(i10, b6Var));
        textView.setGravity(17);
        addView(textView, e6.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.f6276e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(f6.v0(i10, b6Var));
        textView2.setGravity(17);
        addView(textView2, e6.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
