package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.lq;
public final class v0 extends LinearLayout {
    public final int f3882a;
    public Object f3883b;
    public Object f3884c;
    public View d;

    public v0(Context context, int i10) {
        super(context);
        this.f3882a = i10;
        switch (i10) {
            case 4:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
                this.f3883b = x9Var;
                x9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(x9Var, w7.x5.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f3884c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, w7.x5.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, w7.x5.n(-1, -2));
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3882a) {
            case 0:
                Path path = (Path) this.f3884c;
                if (((z0) this.d).f4032a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((zh.h8) this.f3883b) == null) {
                        this.f3883b = new zh.h8(1, 250);
                    }
                    ((zh.h8) this.f3883b).f(0, 0, getWidth(), getHeight());
                    zh.h8 h8Var = (zh.h8) this.f3883b;
                    h8Var.h = 30.0f;
                    h8Var.d();
                    ((zh.h8) this.f3883b).b(canvas, -1, 0.85f);
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
        float f7;
        switch (this.f3882a) {
            case 3:
                RectF rectF = (RectF) this.f3883b;
                Paint paint = (Paint) this.f3884c;
                lq lqVar = (lq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20752i5, lqVar.f28282d0));
                int left = lqVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.k0 k0Var = lqVar.F;
                if (k0Var.getVisibility() == 0) {
                    f7 = k0Var.getAlpha() * AndroidUtilities.dp(25.0f);
                } else {
                    f7 = 0.0f;
                }
                rectF.set(left, AndroidUtilities.dp(5.0f), left + ((int) (dp + f7)), AndroidUtilities.dp(37.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    public v0(lq lqVar, Context context) {
        super(context);
        this.f3882a = 3;
        this.d = lqVar;
        this.f3883b = new RectF();
        this.f3884c = new Paint(1);
    }

    public v0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f3882a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.addView(new zh.x6(context, 70, 0), w7.x5.c(-1.0f, -1));
                org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
                this.f3883b = x9Var;
                x9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout.addView(x9Var, w7.x5.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout, w7.x5.c(150.0f, -1));
                TextView textView = new TextView(context);
                this.f3884c = textView;
                com.google.android.gms.internal.vision.e2.m(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.j6.f20770j5;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                textView.setGravity(17);
                addView(textView, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
                d90 d90Var = new d90(context, f6Var);
                this.d = d90Var;
                d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
                d90Var.setTextSize(1, 14.0f);
                d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                d90Var.setGravity(17);
                addView(d90Var, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                ei.d dVar = new ei.d(context, 70, 0);
                frameLayout2.addView(dVar, w7.x5.c(-1.0f, -1));
                tg.e eVar = new tg.e(context, 1, 4);
                this.f3883b = eVar;
                tg.a aVar = eVar.f46519b;
                aVar.f46507w = org.telegram.ui.ActionBar.j6.fk;
                aVar.f46508x = org.telegram.ui.ActionBar.j6.gk;
                aVar.b();
                eVar.setStarParticlesView(dVar);
                frameLayout2.addView(eVar, w7.x5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                eVar.setPaused(false);
                addView(frameLayout2, w7.x5.c(180.0f, -1));
                TextView textView2 = new TextView(context);
                this.f3884c = textView2;
                com.google.android.gms.internal.vision.e2.m(20.0f, 1, textView2);
                int i12 = org.telegram.ui.ActionBar.j6.f20770j5;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                textView2.setGravity(17);
                addView(textView2, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView3 = new TextView(context);
                this.d = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                textView3.setGravity(17);
                addView(textView3, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }

    public v0(z0 z0Var, Context context) {
        super(context);
        this.f3882a = 0;
        this.d = z0Var;
        this.f3884c = new Path();
    }
}
