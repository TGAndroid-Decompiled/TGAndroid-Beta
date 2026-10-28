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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.yq;
public final class mc extends LinearLayout {
    public final int f5110a;
    public Object f5111b;
    public Object f5112c;
    public View d;

    public mc(Context context, int i10) {
        super(context);
        this.f5110a = i10;
        switch (i10) {
            case 6:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                this.f5111b = y9Var;
                y9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(y9Var, kb1.u(70, 70, 1));
                TextView textView = new TextView(context);
                this.f5112c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, kb1.v(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, kb1.r(-1, -2));
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5110a) {
            case 1:
                Path path = (Path) this.f5112c;
                if (((di.q0) this.d).f8946a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((td) this.f5111b) == null) {
                        this.f5111b = new td(1, 250);
                    }
                    ((td) this.f5111b).f(0, 0, getWidth(), getHeight());
                    td tdVar = (td) this.f5111b;
                    tdVar.h = 30.0f;
                    tdVar.d();
                    ((td) this.f5111b).b(canvas, -1, 0.85f);
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
        switch (this.f5110a) {
            case 4:
                RectF rectF = (RectF) this.f5111b;
                Paint paint = (Paint) this.f5112c;
                yq yqVar = (yq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23448i5, yqVar.f35135d0));
                int left = yqVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.k0 k0Var = yqVar.F;
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

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f5110a) {
            case 5:
                TextView textView = (TextView) this.f5111b;
                TextView textView2 = (TextView) this.f5112c;
                bk0 bk0Var = (bk0) this.d;
                int size = View.MeasureSpec.getSize(i11);
                if (View.MeasureSpec.getMode(i11) != 0) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), Integer.MIN_VALUE);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    textView2.measure(makeMeasureSpec, makeMeasureSpec2);
                    textView.measure(makeMeasureSpec, makeMeasureSpec2);
                    int g7 = org.telegram.ui.d3.g(24.0f, (((size - getPaddingTop()) - getPaddingBottom()) - textView2.getMeasuredHeight()) - textView.getMeasuredHeight(), AndroidUtilities.dp(130.0f));
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bk0Var.getLayoutParams();
                    if (g7 < AndroidUtilities.dp(56.0f)) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    if (bk0Var.getVisibility() != i12) {
                        bk0Var.setVisibility(i12);
                    }
                    int max = Math.max(0, g7);
                    layoutParams.height = max;
                    layoutParams.width = max;
                }
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public mc(yq yqVar, Context context) {
        super(context);
        this.f5110a = 4;
        this.d = yqVar;
        this.f5111b = new RectF();
        this.f5112c = new Paint(1);
    }

    public mc(Context context, TextView textView, TextView textView2, bk0 bk0Var) {
        super(context);
        this.f5110a = 5;
        this.f5112c = textView;
        this.f5111b = textView2;
        this.d = bk0Var;
    }

    public mc(di.q0 q0Var, Context context) {
        super(context);
        this.f5110a = 1;
        this.d = q0Var;
        this.f5112c = new Path();
    }

    public mc(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f5110a = i10;
        switch (i10) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                gi.d dVar = new gi.d(context, 70, 0);
                frameLayout.addView(dVar, kb1.g(-1.0f, -1));
                org.telegram.ui.Wallet.m6 m6Var = new org.telegram.ui.Wallet.m6(170, context, false);
                this.f5111b = m6Var;
                m6Var.setStarParticlesView(dVar);
                frameLayout.addView(m6Var, kb1.h(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                m6Var.setPaused(false);
                addView(frameLayout, kb1.g(180.0f, -1));
                TextView textView = new TextView(context);
                this.f5112c = textView;
                ic.a.o(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.y6.f23465j5;
                org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
                textView.setGravity(17);
                addView(textView, kb1.x(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView2, i11, u6Var);
                textView2.setGravity(17);
                addView(textView2, kb1.x(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new ec(context, 70, 0), kb1.g(-1.0f, -1));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                this.f5111b = y9Var;
                y9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout2.addView(y9Var, kb1.h(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, kb1.g(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.f5112c = textView3;
                ic.a.o(20.0f, 1, textView3);
                int i12 = org.telegram.ui.ActionBar.y6.f23465j5;
                org.telegram.ui.ActionBar.f7.V(textView3, i12, u6Var);
                textView3.setGravity(17);
                addView(textView3, kb1.x(-2, -2, 1, 0, 2, 0, 0));
                aa0 aa0Var = new aa0(context, u6Var);
                this.d = aa0Var;
                org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
                aa0Var.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(aa0Var, i12, u6Var);
                aa0Var.setGravity(17);
                addView(aa0Var, kb1.x(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }
}
