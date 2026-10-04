package ai;

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
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.q90;
public final class d1 extends LinearLayout {
    public final int f750a;
    public Object f751b;
    public Object f752c;
    public View d;

    public d1(Context context, int i10) {
        super(context);
        this.f750a = i10;
        switch (i10) {
            case 4:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                this.f751b = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(w9Var, w7.z5.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f752c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, w7.z5.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, w7.z5.n(-1, -2));
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f750a) {
            case 0:
                Path path = (Path) this.f752c;
                if (((h1) this.d).f1005a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((yh.j8) this.f751b) == null) {
                        this.f751b = new yh.j8(1, 250);
                    }
                    ((yh.j8) this.f751b).f(0, 0, getWidth(), getHeight());
                    yh.j8 j8Var = (yh.j8) this.f751b;
                    j8Var.h = 30.0f;
                    j8Var.d();
                    ((yh.j8) this.f751b).b(canvas, -1, 0.85f);
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
        switch (this.f750a) {
            case 3:
                RectF rectF = (RectF) this.f751b;
                Paint paint = (Paint) this.f752c;
                pq pqVar = (pq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20907i5, pqVar.f29714d0));
                int left = pqVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.k0 k0Var = pqVar.F;
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

    public d1(pq pqVar, Context context) {
        super(context);
        this.f750a = 3;
        this.d = pqVar;
        this.f751b = new RectF();
        this.f752c = new Paint(1);
    }

    public d1(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f750a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.addView(new yh.b7(context, 70, 0), w7.z5.c(-1.0f, -1));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                this.f751b = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout.addView(w9Var, w7.z5.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout, w7.z5.c(150.0f, -1));
                TextView textView = new TextView(context);
                this.f752c = textView;
                com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.i6.f20925j5;
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
                textView.setGravity(17);
                addView(textView, w7.z5.t(-2, -2, 1, 0, 2, 0, 0));
                q90 q90Var = new q90(context, d6Var);
                this.d = q90Var;
                q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
                q90Var.setTextSize(1, 14.0f);
                q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
                q90Var.setGravity(17);
                addView(q90Var, w7.z5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                di.g gVar = new di.g(context, 70, 0);
                frameLayout2.addView(gVar, w7.z5.c(-1.0f, -1));
                sg.e eVar = new sg.e(context, 1, 4);
                this.f751b = eVar;
                sg.a aVar = eVar.f46812b;
                aVar.f46800w = org.telegram.ui.ActionBar.i6.fk;
                aVar.f46801x = org.telegram.ui.ActionBar.i6.gk;
                aVar.b();
                eVar.setStarParticlesView(gVar);
                frameLayout2.addView(eVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                eVar.setPaused(false);
                addView(frameLayout2, w7.z5.c(180.0f, -1));
                TextView textView2 = new TextView(context);
                this.f752c = textView2;
                com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView2);
                int i12 = org.telegram.ui.ActionBar.i6.f20925j5;
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
                textView2.setGravity(17);
                addView(textView2, w7.z5.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView3 = new TextView(context);
                this.d = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
                textView3.setGravity(17);
                addView(textView3, w7.z5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }

    public d1(h1 h1Var, Context context) {
        super(context);
        this.f750a = 0;
        this.d = h1Var;
        this.f752c = new Path();
    }
}
