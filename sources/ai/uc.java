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
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x90;
public final class uc extends LinearLayout {
    public final int f2276a;
    public Object f2277b;
    public Object f2278c;
    public View d;

    public uc(Context context, int i10) {
        super(context);
        this.f2276a = i10;
        switch (i10) {
            case 5:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                this.f2277b = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(w9Var, w7.z5.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f2278c = textView;
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
        switch (this.f2276a) {
            case 1:
                Path path = (Path) this.f2278c;
                if (((ci.q0) this.d).f5748a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((de) this.f2277b) == null) {
                        this.f2277b = new de(1, 250);
                    }
                    ((de) this.f2277b).f(0, 0, getWidth(), getHeight());
                    de deVar = (de) this.f2277b;
                    deVar.h = 30.0f;
                    deVar.d();
                    ((de) this.f2277b).b(canvas, -1, 0.85f);
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
        switch (this.f2276a) {
            case 4:
                RectF rectF = (RectF) this.f2277b;
                Paint paint = (Paint) this.f2278c;
                wq wqVar = (wq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i5, wqVar.f32193d0));
                int left = wqVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.j0 j0Var = wqVar.F;
                if (j0Var.getVisibility() == 0) {
                    f7 = j0Var.getAlpha() * AndroidUtilities.dp(25.0f);
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

    public uc(wq wqVar, Context context) {
        super(context);
        this.f2276a = 4;
        this.d = wqVar;
        this.f2277b = new RectF();
        this.f2278c = new Paint(1);
    }

    public uc(ci.q0 q0Var, Context context) {
        super(context);
        this.f2276a = 1;
        this.d = q0Var;
        this.f2278c = new Path();
    }

    public uc(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f2276a = i10;
        switch (i10) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                fi.c cVar = new fi.c(context, 70, 0);
                frameLayout.addView(cVar, w7.z5.c(-1.0f, -1));
                org.telegram.ui.Wallet.m6 m6Var = new org.telegram.ui.Wallet.m6(170, context, false);
                this.f2277b = m6Var;
                m6Var.setStarParticlesView(cVar);
                frameLayout.addView(m6Var, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                m6Var.setPaused(false);
                addView(frameLayout, w7.z5.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.f2278c = textView;
                com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.h6.f21093j5;
                org.telegram.ui.Cells.c1.q(i11, d6Var, textView, 17);
                addView(textView, w7.z5.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
                textView2.setGravity(17);
                addView(textView2, w7.z5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new kc(context, 70, 0), w7.z5.c(-1.0f, -1));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                this.f2277b = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout2.addView(w9Var, w7.z5.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, w7.z5.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.f2278c = textView3;
                com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView3);
                int i12 = org.telegram.ui.ActionBar.h6.f21093j5;
                org.telegram.ui.Cells.c1.q(i12, d6Var, textView3, 17);
                addView(textView3, w7.z5.t(-2, -2, 1, 0, 2, 0, 0));
                x90 x90Var = new x90(context, d6Var);
                this.d = x90Var;
                x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21046gc, d6Var));
                x90Var.setTextSize(1, 14.0f);
                x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
                x90Var.setGravity(17);
                addView(x90Var, w7.z5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }
}
