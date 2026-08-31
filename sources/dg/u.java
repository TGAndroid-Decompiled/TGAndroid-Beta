package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import mh.j9;
import mh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.yh;
public final class u extends LinearLayout {
    public final int f4678a;
    public Object f4679b;
    public Object f4680c;
    public View d;

    public u(Context context, int i10) {
        super(context);
        this.f4678a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                p9 p9Var = new p9(context);
                this.f4679b = p9Var;
                p9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(p9Var, c6.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f4680c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, c6.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, c6.n(-1, -2));
                return;
            default:
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f4678a) {
            case 2:
                Path path = (Path) this.f4680c;
                if (((oh.o0) this.d).f17527a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((wa) this.f4679b) == null) {
                        this.f4679b = new wa(1, 250);
                    }
                    ((wa) this.f4679b).f(0, 0, getWidth(), getHeight());
                    wa waVar = (wa) this.f4679b;
                    waVar.h = 30.0f;
                    waVar.d();
                    ((wa) this.f4679b).b(canvas, -1, 0.85f);
                    invalidate();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        switch (this.f4678a) {
            case 3:
                RectF rectF = (RectF) this.f4679b;
                Paint paint = (Paint) this.f4680c;
                mq mqVar = (mq) this.d;
                paint.setColor(k6.v0(k6.f21749i5, mqVar.f29185a0));
                int left = mqVar.B[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.l0 l0Var = mqVar.C;
                if (l0Var.getVisibility() == 0) {
                    f10 = l0Var.getAlpha() * AndroidUtilities.dp(25.0f);
                } else {
                    f10 = 0.0f;
                }
                rectF.set(left, AndroidUtilities.dp(5.0f), left + ((int) (dp + f10)), AndroidUtilities.dp(37.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    public u(mq mqVar, Context context) {
        super(context);
        this.f4678a = 3;
        this.d = mqVar;
        this.f4679b = new RectF();
        this.f4680c = new Paint(1);
    }

    public u(oh.o0 o0Var, Context context) {
        super(context);
        this.f4678a = 2;
        this.d = o0Var;
        this.f4680c = new Path();
    }

    public u(Context context, int i10, g6 g6Var) {
        super(context);
        this.f4678a = i10;
        switch (i10) {
            case 4:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                rh.c cVar = new rh.c(context, 70, 0);
                frameLayout.addView(cVar, c6.c(-1.0f, -1));
                gg.i iVar = new gg.i(context, 1, 4);
                this.f4679b = iVar;
                gg.a aVar = iVar.f7087b;
                aVar.f7065w = k6.fk;
                aVar.f7066x = k6.gk;
                aVar.b();
                iVar.setStarParticlesView(cVar);
                frameLayout.addView(iVar, c6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                iVar.setPaused(false);
                addView(frameLayout, c6.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.f4680c = textView;
                yh.p(20.0f, 1, textView);
                int i11 = k6.f21766j5;
                textView.setTextColor(k6.v0(i11, g6Var));
                textView.setGravity(17);
                addView(textView, c6.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(k6.v0(i11, g6Var));
                textView2.setGravity(17);
                addView(textView2, c6.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new j9(context, 70, 0), c6.c(-1.0f, -1));
                p9 p9Var = new p9(context);
                this.f4679b = p9Var;
                p9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout2.addView(p9Var, c6.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, c6.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.f4680c = textView3;
                yh.p(20.0f, 1, textView3);
                int i12 = k6.f21766j5;
                textView3.setTextColor(k6.v0(i12, g6Var));
                textView3.setGravity(17);
                addView(textView3, c6.t(-2, -2, 1, 0, 2, 0, 0));
                g90 g90Var = new g90(context, g6Var);
                this.d = g90Var;
                g90Var.setLinkTextColor(k6.v0(k6.f21720gc, g6Var));
                g90Var.setTextSize(1, 14.0f);
                g90Var.setTextColor(k6.v0(i12, g6Var));
                g90Var.setGravity(17);
                addView(g90Var, c6.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }
}
