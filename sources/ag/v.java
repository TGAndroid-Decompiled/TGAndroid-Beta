package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import jh.i9;
import jh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.y80;
import org.telegram.ui.th;
public final class v extends LinearLayout {
    public final int f679a;
    public Object f680b;
    public Object f681c;
    public View d;

    public v(Context context, int i10) {
        super(context);
        this.f679a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                t9 t9Var = new t9(context);
                this.f680b = t9Var;
                t9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(t9Var, f6.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f681c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, f6.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, f6.n(-1, -2));
                return;
            default:
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f679a) {
            case 2:
                Path path = (Path) this.f681c;
                if (((lh.n0) this.d).f15949a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((va) this.f680b) == null) {
                        this.f680b = new va(1, 250);
                    }
                    ((va) this.f680b).f(0, 0, getWidth(), getHeight());
                    va vaVar = (va) this.f680b;
                    vaVar.h = 30.0f;
                    vaVar.d();
                    ((va) this.f680b).b(canvas, -1, 0.85f);
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
        float f9;
        switch (this.f679a) {
            case 4:
                RectF rectF = (RectF) this.f680b;
                Paint paint = (Paint) this.f681c;
                gq gqVar = (gq) this.d;
                paint.setColor(g6.v0(g6.f23151i5, gqVar.W));
                int left = gqVar.A[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.m0 m0Var = gqVar.B;
                if (m0Var.getVisibility() == 0) {
                    f9 = m0Var.getAlpha() * AndroidUtilities.dp(25.0f);
                } else {
                    f9 = 0.0f;
                }
                rectF.set(left, AndroidUtilities.dp(5.0f), left + ((int) (dp + f9)), AndroidUtilities.dp(37.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    public v(gq gqVar, Context context) {
        super(context);
        this.f679a = 4;
        this.d = gqVar;
        this.f680b = new RectF();
        this.f681c = new Paint(1);
    }

    public v(lh.n0 n0Var, Context context) {
        super(context);
        this.f679a = 2;
        this.d = n0Var;
        this.f681c = new Path();
    }

    public v(Context context, int i10, c6 c6Var) {
        super(context);
        this.f679a = i10;
        switch (i10) {
            case 3:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                oh.c cVar = new oh.c(context, 70, 0);
                frameLayout.addView(cVar, f6.c(-1.0f, -1));
                dg.i iVar = new dg.i(context, 1, 4);
                this.f680b = iVar;
                dg.a aVar = iVar.f5590b;
                aVar.f5568w = g6.fk;
                aVar.f5569x = g6.gk;
                aVar.b();
                iVar.setStarParticlesView(cVar);
                frameLayout.addView(iVar, f6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                iVar.setPaused(false);
                addView(frameLayout, f6.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.f681c = textView;
                th.n(20.0f, 1, textView);
                int i11 = g6.f23169j5;
                textView.setTextColor(g6.v0(i11, c6Var));
                textView.setGravity(17);
                addView(textView, f6.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(g6.v0(i11, c6Var));
                textView2.setGravity(17);
                addView(textView2, f6.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new i9(context, 70, 0), f6.c(-1.0f, -1));
                t9 t9Var = new t9(context);
                this.f680b = t9Var;
                t9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout2.addView(t9Var, f6.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, f6.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.f681c = textView3;
                th.n(20.0f, 1, textView3);
                int i12 = g6.f23169j5;
                textView3.setTextColor(g6.v0(i12, c6Var));
                textView3.setGravity(17);
                addView(textView3, f6.t(-2, -2, 1, 0, 2, 0, 0));
                y80 y80Var = new y80(context, c6Var);
                this.d = y80Var;
                y80Var.setLinkTextColor(g6.v0(g6.gc, c6Var));
                y80Var.setTextSize(1, 14.0f);
                y80Var.setTextColor(g6.v0(i12, c6Var));
                y80Var.setGravity(17);
                addView(y80Var, f6.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }
}
