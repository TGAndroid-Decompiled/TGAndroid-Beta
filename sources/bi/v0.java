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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.zq;
public final class v0 extends LinearLayout {
    public final int f3846a;
    public Object f3847b;
    public Object f3848c;
    public View d;

    public v0(Context context, int i10) {
        super(context);
        this.f3846a = i10;
        switch (i10) {
            case 4:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
                this.f3847b = z9Var;
                z9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(z9Var, w7.a6.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f3848c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, w7.a6.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, w7.a6.n(-1, -2));
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3846a) {
            case 0:
                Path path = (Path) this.f3848c;
                if (((z0) this.d).f4046a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((zh.b8) this.f3847b) == null) {
                        this.f3847b = new zh.b8(1, 250);
                    }
                    ((zh.b8) this.f3847b).f(0, 0, getWidth(), getHeight());
                    zh.b8 b8Var = (zh.b8) this.f3847b;
                    b8Var.h = 30.0f;
                    b8Var.d();
                    ((zh.b8) this.f3847b).b(canvas, -1, 0.85f);
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
        switch (this.f3846a) {
            case 3:
                RectF rectF = (RectF) this.f3847b;
                Paint paint = (Paint) this.f3848c;
                zq zqVar = (zq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19989i5, zqVar.f31967d0));
                int left = zqVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.j0 j0Var = zqVar.F;
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

    public v0(zq zqVar, Context context) {
        super(context);
        this.f3846a = 3;
        this.d = zqVar;
        this.f3847b = new RectF();
        this.f3848c = new Paint(1);
    }

    public v0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f3846a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.addView(new zh.r6(context, 70, 0), w7.a6.d(-1.0f, -1));
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
                this.f3847b = z9Var;
                z9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout.addView(z9Var, w7.a6.a(100.0f, 0.0f, 32.0f, 0.0f, 24.0f, 100, 17));
                addView(frameLayout, w7.a6.d(150.0f, -1));
                TextView textView = new TextView(context);
                this.f3848c = textView;
                com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.g6.f20007j5;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
                textView.setGravity(17);
                addView(textView, w7.a6.t(-2, -2, 1, 0, 2, 0, 0));
                da0 da0Var = new da0(context, c6Var);
                this.d = da0Var;
                da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, c6Var));
                da0Var.setTextSize(1, 14.0f);
                da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
                da0Var.setGravity(17);
                addView(da0Var, w7.a6.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                ei.d dVar = new ei.d(context, 70, 0);
                frameLayout2.addView(dVar, w7.a6.d(-1.0f, -1));
                org.telegram.ui.Wallet.b6 b6Var = new org.telegram.ui.Wallet.b6(170, context, false);
                this.f3847b = b6Var;
                b6Var.setStarParticlesView(dVar);
                frameLayout2.addView(b6Var, w7.a6.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
                b6Var.setPaused(false);
                addView(frameLayout2, w7.a6.d(180.0f, -1));
                TextView textView2 = new TextView(context);
                this.f3848c = textView2;
                com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView2);
                int i12 = org.telegram.ui.ActionBar.g6.f20007j5;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
                textView2.setGravity(17);
                addView(textView2, w7.a6.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView3 = new TextView(context);
                this.d = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
                textView3.setGravity(17);
                addView(textView3, w7.a6.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }

    public v0(z0 z0Var, Context context) {
        super(context);
        this.f3846a = 0;
        this.d = z0Var;
        this.f3848c = new Path();
    }
}
