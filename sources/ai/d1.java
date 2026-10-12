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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ia0;
public final class d1 extends LinearLayout {
    public final int f801a;
    public Object f802b;
    public Object f803c;
    public View d;

    public d1(Context context, int i10) {
        super(context);
        this.f801a = i10;
        switch (i10) {
            case 4:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                this.f802b = y9Var;
                y9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(y9Var, w7.w5.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f803c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, w7.w5.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, w7.w5.n(-1, -2));
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f801a) {
            case 0:
                Path path = (Path) this.f803c;
                if (((h1) this.d).f1068a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((yh.b8) this.f802b) == null) {
                        this.f802b = new yh.b8(1, 250);
                    }
                    ((yh.b8) this.f802b).f(0, 0, getWidth(), getHeight());
                    yh.b8 b8Var = (yh.b8) this.f802b;
                    b8Var.h = 30.0f;
                    b8Var.d();
                    ((yh.b8) this.f802b).b(canvas, -1, 0.85f);
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
        switch (this.f801a) {
            case 3:
                RectF rectF = (RectF) this.f802b;
                Paint paint = (Paint) this.f803c;
                er erVar = (er) this.d;
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i5, erVar.f25771d0));
                int left = erVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.j0 j0Var = erVar.F;
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

    public d1(er erVar, Context context) {
        super(context);
        this.f801a = 3;
        this.d = erVar;
        this.f802b = new RectF();
        this.f803c = new Paint(1);
    }

    public d1(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f801a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.addView(new yh.r6(context, 70, 0), w7.w5.d(-1.0f, -1));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                this.f802b = y9Var;
                y9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout.addView(y9Var, w7.w5.a(100.0f, 0.0f, 32.0f, 0.0f, 24.0f, 100, 17));
                addView(frameLayout, w7.w5.d(150.0f, -1));
                TextView textView = new TextView(context);
                this.f803c = textView;
                com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.h6.f20668j5;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
                textView.setGravity(17);
                addView(textView, w7.w5.t(-2, -2, 1, 0, 2, 0, 0));
                ia0 ia0Var = new ia0(context, c6Var);
                this.d = ia0Var;
                ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, c6Var));
                ia0Var.setTextSize(1, 14.0f);
                ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
                ia0Var.setGravity(17);
                addView(ia0Var, w7.w5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                di.d dVar = new di.d(context, 70, 0);
                frameLayout2.addView(dVar, w7.w5.d(-1.0f, -1));
                org.telegram.ui.Wallet.e6 e6Var = new org.telegram.ui.Wallet.e6(170, context, false);
                this.f802b = e6Var;
                e6Var.setStarParticlesView(dVar);
                frameLayout2.addView(e6Var, w7.w5.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
                e6Var.setPaused(false);
                addView(frameLayout2, w7.w5.d(180.0f, -1));
                TextView textView2 = new TextView(context);
                this.f803c = textView2;
                com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView2);
                int i12 = org.telegram.ui.ActionBar.h6.f20668j5;
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
                textView2.setGravity(17);
                addView(textView2, w7.w5.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView3 = new TextView(context);
                this.d = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
                textView3.setGravity(17);
                addView(textView3, w7.w5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }

    public d1(h1 h1Var, Context context) {
        super(context);
        this.f801a = 0;
        this.d = h1Var;
        this.f803c = new Path();
    }
}
