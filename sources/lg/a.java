package lg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import k7.e6;
import mh.j9;
import mh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.yh;
public final class a extends LinearLayout {
    public final int f12528a = 2;
    public final Object f12529b;
    public final View f12530c;
    public final Object d;
    public final Object f12531e;

    public a(Context context, g6 g6Var, tl0 tl0Var) {
        super(context);
        this.d = new Paint(1);
        this.f12531e = new z5(this);
        this.f12529b = g6Var;
        this.f12530c = tl0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f12528a) {
            case 0:
                z5 z5Var = (z5) this.f12531e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(k6.v0(k6.f21605a7, (g6) this.f12529b));
                tl0 tl0Var = (tl0) this.f12530c;
                float f10 = 1.0f;
                if (tl0Var != null) {
                    if (!tl0Var.canScrollVertically(1)) {
                        f10 = 0.0f;
                    }
                    paint.setAlpha((int) (z5Var.d(f10, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (z5Var.d(1.0f, false) * 255.0f));
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
        addView(frameLayout, c6.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f12529b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, c6.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        g90 g90Var = new g90(context, null);
        this.f12530c = g90Var;
        g90Var.setTextSize(1, 14.0f);
        g90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        g90Var.setGravity(1);
        addView(g90Var, c6.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12531e = frameLayout2;
        addView(frameLayout2, c6.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public a(Context context, int i10, g6 g6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        j9 j9Var = new j9(context, 70, 0);
        frameLayout.addView(j9Var, c6.c(-1.0f, -1));
        gg.i iVar = new gg.i(context, 1, 2);
        this.f12529b = iVar;
        gg.a aVar = iVar.f7087b;
        aVar.f7065w = k6.fk;
        aVar.f7066x = k6.gk;
        aVar.b();
        iVar.setStarParticlesView(j9Var);
        frameLayout.addView(iVar, c6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        y9 y9Var = new y9(context, i10, g6Var);
        this.f12530c = y9Var;
        e6.a(y9Var);
        y9Var.setOnClickListener(new androidx.mediarouter.app.c(this, 23));
        frameLayout.addView(y9Var, c6.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, c6.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        yh.p(20.0f, 1, textView);
        int i11 = k6.f21766j5;
        textView.setTextColor(k6.v0(i11, g6Var));
        textView.setGravity(17);
        addView(textView, c6.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.f12531e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(k6.v0(i11, g6Var));
        textView2.setGravity(17);
        addView(textView2, c6.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
