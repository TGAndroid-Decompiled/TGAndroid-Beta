package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.w9;
import w7.a6;
import xh.b7;
import xh.l8;
import zh.f0;
public final class h extends LinearLayout {
    public final int f4706a;
    public Object f4707b;
    public View f4708c;
    public Object d;

    public h(Context context, int i10) {
        super(context);
        this.f4706a = i10;
        switch (i10) {
            case 2:
                super(context);
                return;
            default:
                setOrientation(1);
                w9 w9Var = new w9(context);
                this.d = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(w9Var, a6.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f4707b = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, a6.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.f4708c = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, a6.n(-1, -2));
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f4706a) {
            case 5:
                Path path = (Path) this.f4707b;
                if (((f0) this.f4708c).f48388a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((l8) this.d) == null) {
                        this.d = new l8(1, 250);
                    }
                    ((l8) this.d).f(0, 0, getWidth(), getHeight());
                    l8 l8Var = (l8) this.d;
                    l8Var.h = 30.0f;
                    l8Var.d();
                    ((l8) this.d).b(canvas, -1, 0.85f);
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
        switch (this.f4706a) {
            case 3:
                RectF rectF = (RectF) this.d;
                Paint paint = (Paint) this.f4707b;
                sq sqVar = (sq) this.f4708c;
                paint.setColor(j6.v0(j6.f18016i5, sqVar.f27157d0));
                int left = sqVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                l0 l0Var = sqVar.F;
                if (l0Var.getVisibility() == 0) {
                    f7 = l0Var.getAlpha() * AndroidUtilities.dp(25.0f);
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

    public h(sq sqVar, Context context) {
        super(context);
        this.f4706a = 3;
        this.f4708c = sqVar;
        this.d = new RectF();
        this.f4707b = new Paint(1);
    }

    public h(Context context, int i10, f6 f6Var) {
        super(context);
        this.f4706a = i10;
        switch (i10) {
            case 4:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.addView(new b7(context, 70, 0), a6.c(-1.0f, -1));
                w9 w9Var = new w9(context);
                this.d = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout.addView(w9Var, a6.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout, a6.c(150.0f, -1));
                TextView textView = new TextView(context);
                this.f4707b = textView;
                e2.k(20.0f, 1, textView);
                int i11 = j6.f18034j5;
                textView.setTextColor(j6.v0(i11, f6Var));
                textView.setGravity(17);
                addView(textView, a6.t(-2, -2, 1, 0, 2, 0, 0));
                m90 m90Var = new m90(context, f6Var);
                this.f4708c = m90Var;
                m90Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
                m90Var.setTextSize(1, 14.0f);
                m90Var.setTextColor(j6.v0(i11, f6Var));
                m90Var.setGravity(17);
                addView(m90Var, a6.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                d dVar = new d(context, 70, 0);
                frameLayout2.addView(dVar, a6.c(-1.0f, -1));
                rg.f fVar = new rg.f(context, 1, 4);
                this.d = fVar;
                rg.a aVar = fVar.f41485b;
                aVar.f41471w = j6.fk;
                aVar.f41472x = j6.gk;
                aVar.b();
                fVar.setStarParticlesView(dVar);
                frameLayout2.addView(fVar, a6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                fVar.setPaused(false);
                addView(frameLayout2, a6.c(180.0f, -1));
                TextView textView2 = new TextView(context);
                this.f4707b = textView2;
                e2.k(20.0f, 1, textView2);
                int i12 = j6.f18034j5;
                textView2.setTextColor(j6.v0(i12, f6Var));
                textView2.setGravity(17);
                addView(textView2, a6.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView3 = new TextView(context);
                this.f4708c = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(j6.v0(i12, f6Var));
                textView3.setGravity(17);
                addView(textView3, a6.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }

    public h(f0 f0Var, Context context) {
        super(context);
        this.f4706a = 5;
        this.f4708c = f0Var;
        this.f4707b = new Path();
    }
}
