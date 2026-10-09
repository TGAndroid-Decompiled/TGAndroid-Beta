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
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.ea0;
public final class d1 extends LinearLayout {
    public final int f803a;
    public Object f804b;
    public Object f805c;
    public View d;

    public d1(Context context, int i10) {
        super(context);
        this.f803a = i10;
        switch (i10) {
            case 4:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                this.f804b = y9Var;
                y9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(y9Var, w7.x5.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f805c = textView;
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
        switch (this.f803a) {
            case 0:
                Path path = (Path) this.f805c;
                if (((h1) this.d).f1070a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((yh.b8) this.f804b) == null) {
                        this.f804b = new yh.b8(1, 250);
                    }
                    ((yh.b8) this.f804b).f(0, 0, getWidth(), getHeight());
                    yh.b8 b8Var = (yh.b8) this.f804b;
                    b8Var.h = 30.0f;
                    b8Var.d();
                    ((yh.b8) this.f804b).b(canvas, -1, 0.85f);
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
        switch (this.f803a) {
            case 3:
                RectF rectF = (RectF) this.f804b;
                Paint paint = (Paint) this.f805c;
                cr crVar = (cr) this.d;
                paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20887i5, crVar.f25490d0));
                int left = crVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.k0 k0Var = crVar.F;
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

    public d1(cr crVar, Context context) {
        super(context);
        this.f803a = 3;
        this.d = crVar;
        this.f804b = new RectF();
        this.f805c = new Paint(1);
    }

    public d1(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f803a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.addView(new yh.r6(context, 70, 0), w7.x5.d(-1.0f, -1));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                this.f804b = y9Var;
                y9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout.addView(y9Var, w7.x5.a(100.0f, 0.0f, 32.0f, 0.0f, 24.0f, 100, 17));
                addView(frameLayout, w7.x5.d(150.0f, -1));
                TextView textView = new TextView(context);
                this.f805c = textView;
                com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.i6.f20905j5;
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
                textView.setGravity(17);
                addView(textView, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
                ea0 ea0Var = new ea0(context, e6Var);
                this.d = ea0Var;
                ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
                ea0Var.setTextSize(1, 14.0f);
                ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
                ea0Var.setGravity(17);
                addView(ea0Var, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                di.d dVar = new di.d(context, 70, 0);
                frameLayout2.addView(dVar, w7.x5.d(-1.0f, -1));
                org.telegram.ui.Wallet.b6 b6Var = new org.telegram.ui.Wallet.b6(170, context, false);
                this.f804b = b6Var;
                b6Var.setStarParticlesView(dVar);
                frameLayout2.addView(b6Var, w7.x5.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
                b6Var.setPaused(false);
                addView(frameLayout2, w7.x5.d(180.0f, -1));
                TextView textView2 = new TextView(context);
                this.f805c = textView2;
                com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView2);
                int i12 = org.telegram.ui.ActionBar.i6.f20905j5;
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
                textView2.setGravity(17);
                addView(textView2, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView3 = new TextView(context);
                this.d = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
                textView3.setGravity(17);
                addView(textView3, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }

    public d1(h1 h1Var, Context context) {
        super(context);
        this.f803a = 0;
        this.d = h1Var;
        this.f805c = new Path();
    }
}
