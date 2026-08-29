package cg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.fy;
import org.telegram.ui.ng0;
import org.telegram.ui.u41;
import org.telegram.ui.v5;
public final class y extends FrameLayout {
    public final int f3462a = 0;
    public boolean f3463b;
    public Object f3464c;
    public final Object d;

    public y(lg0 lg0Var, Context context) {
        super(context);
        this.d = lg0Var;
        this.f3463b = false;
        this.f3464c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f3462a;
        Object obj = this.d;
        switch (i10) {
            case 2:
                Paint paint = (Paint) this.f3464c;
                if (this.f3463b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((fy) obj).getThemedColor(g6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f3464c;
                if (this.f3463b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((ng0) obj).getThemedColor(g6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                u41 u41Var = (u41) obj;
                if (!this.f3463b && u41Var.f42277r > 0.0f) {
                    if (((Paint) this.f3464c) == null) {
                        Paint paint3 = new Paint();
                        this.f3464c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f3464c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f3464c).setAlpha((int) (u41Var.f42277r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f3464c);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        switch (this.f3462a) {
            case 0:
                boolean z11 = this.f3463b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    float f9 = limitPreviewView.f26458a;
                    boolean z12 = false;
                    if (f9 != 0.0f && f9 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f9 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f26459a0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f3464c, 31);
                        x xVar = limitPreviewView.f26459a0;
                        float x4 = getX() + ((ViewGroup) getParent()).getX();
                        float y8 = ((ViewGroup) getParent()).getY();
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((v5) ((org.telegram.ui.c1) xVar).f36955b).t0(x4, getY() + y8));
                        canvas.restore();
                        invalidate();
                        return drawChild;
                    }
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f9;
        int i10;
        switch (this.f3462a) {
            case 1:
                RectF rectF = (RectF) this.f3464c;
                int dp = AndroidUtilities.dp(13.0f);
                lg0 lg0Var = (lg0) this.d;
                Drawable drawable = lg0Var.d;
                int u10 = (lg0Var.A - lg0.u(lg0Var)) - dp;
                if (lg0.v(lg0Var) == 1) {
                    u10 = (int) (lg0Var.f30315b.getTranslationY() + u10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + u10;
                int w10 = lg0.w(lg0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (lg0.x(lg0Var) + u10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - u10) - lg0.y(lg0Var)) / dp3);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp3) * min);
                    u10 -= currentActionBarHeight;
                    dp2 -= currentActionBarHeight;
                    w10 += currentActionBarHeight;
                    f9 = 1.0f - min;
                } else {
                    f9 = 1.0f;
                }
                int i11 = AndroidUtilities.statusBarHeight;
                int i12 = dp2 + i11;
                drawable.setBounds(0, u10 + i11, getMeasuredWidth(), w10);
                drawable.draw(canvas);
                if (f9 != 1.0f) {
                    g6.f23340t0.setColor(g6.w0(null, g6.f23133h5, false));
                    rectF.set(lg0.A(lg0Var), lg0.B(lg0Var) + i10, getMeasuredWidth() - lg0.C(lg0Var), AndroidUtilities.dp(24.0f) + lg0.D(lg0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f9, AndroidUtilities.dp(12.0f) * f9, g6.f23340t0);
                }
                if (f9 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int w02 = g6.w0(null, g6.Ii, false);
                    int alpha = Color.alpha(w02);
                    g6.f23340t0.setColor(w02);
                    g6.f23340t0.setAlpha((int) (alpha * 1.0f * f9));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), g6.f23340t0);
                }
                int w03 = g6.w0(null, g6.f23133h5, false);
                g6.f23340t0.setColor(Color.argb((int) (lg0Var.f30318f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                canvas.drawRect(lg0.E(lg0Var), 0.0f, getMeasuredWidth() - lg0.F(lg0Var), AndroidUtilities.statusBarHeight, g6.f23340t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3462a) {
            case 1:
                lg0 lg0Var = (lg0) this.d;
                if (motionEvent.getAction() == 0 && lg0Var.A != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + lg0Var.A && lg0Var.f30318f.getAlpha() == 0.0f) {
                        lg0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f3462a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                lg0.t((lg0) this.d);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        switch (this.f3462a) {
            case 1:
                int size = View.MeasureSpec.getSize(i11);
                lg0 lg0Var = (lg0) this.d;
                x5 x5Var = lg0Var.f30324y;
                hg0 hg0Var = lg0Var.f30316c;
                fg0 fg0Var = lg0Var.f30315b;
                if (!lg0.K(lg0Var)) {
                    this.f3463b = true;
                    setPadding(lg0.L(lg0Var), AndroidUtilities.statusBarHeight, lg0.M(lg0Var), 0);
                    this.f3463b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) fg0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) lg0Var.f30317e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp(15.0f) + lg0.r(lg0Var) + AndroidUtilities.statusBarHeight;
                int R = hg0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        x5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (lg0.s(lg0Var) * 2)), 1073741824), i11);
                        dp = x5Var.getMeasuredHeight();
                    } else {
                        int M = hg0Var.M(i13);
                        dp = ((M - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp2 = dp + dp2;
                }
                if (dp2 < paddingTop) {
                    i12 = paddingTop - dp2;
                } else {
                    i12 = paddingTop - ((paddingTop / 5) * 3);
                }
                int dp3 = AndroidUtilities.dp(8.0f) + i12;
                if (fg0Var.getPaddingTop() != dp3) {
                    this.f3463b = true;
                    fg0Var.setPinnedSectionOffsetY(-dp3);
                    fg0Var.setPadding(0, dp3, 0, AndroidUtilities.navigationBarHeight);
                    this.f3463b = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3462a) {
            case 1:
                if (!((lg0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f3462a) {
            case 1:
                if (!this.f3463b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public y(ng0 ng0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = ng0Var;
        this.f3463b = z10;
        this.f3464c = new Paint(1);
    }

    public y(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f3464c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f3463b = z10;
    }

    public y(u41 u41Var, Context context, boolean z10) {
        super(context);
        this.d = u41Var;
        this.f3463b = z10;
    }

    public y(fy fyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = fyVar;
        this.f3463b = z10;
        this.f3464c = new Paint(1);
    }
}
