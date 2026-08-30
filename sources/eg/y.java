package eg;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.g51;
import org.telegram.ui.oy;
import org.telegram.ui.y5;
public final class y extends FrameLayout {
    public final int f5578a = 0;
    public boolean f5579b;
    public Object f5580c;
    public final Object d;

    public y(vg0 vg0Var, Context context) {
        super(context);
        this.d = vg0Var;
        this.f5579b = false;
        this.f5580c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f5578a;
        Object obj = this.d;
        switch (i10) {
            case 2:
                Paint paint = (Paint) this.f5580c;
                if (this.f5579b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((oy) obj).getThemedColor(j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f5580c;
                if (this.f5579b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.vg0) obj).getThemedColor(j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                g51 g51Var = (g51) obj;
                if (!this.f5579b && g51Var.f33907r > 0.0f) {
                    if (((Paint) this.f5580c) == null) {
                        Paint paint3 = new Paint();
                        this.f5580c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f5580c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f5580c).setAlpha((int) (g51Var.f33907r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f5580c);
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
        boolean z4;
        switch (this.f5578a) {
            case 0:
                boolean z10 = this.f5579b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    float f10 = limitPreviewView.f23091a;
                    boolean z11 = false;
                    if (f10 != 0.0f && f10 <= 1.0f && z10) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (f10 == 1.0f && !z10) {
                        z11 = true;
                    }
                    if ((z4 || z11) && limitPreviewView.f23094b0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f5580c, 31);
                        x xVar = limitPreviewView.f23094b0;
                        float x10 = getX() + ((ViewGroup) getParent()).getX();
                        float y10 = ((ViewGroup) getParent()).getY();
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((y5) ((org.telegram.ui.a1) xVar).f32428b).t0(x10, getY() + y10));
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
        float f10;
        int i10;
        switch (this.f5578a) {
            case 1:
                RectF rectF = (RectF) this.f5580c;
                int dp = AndroidUtilities.dp(13.0f);
                vg0 vg0Var = (vg0) this.d;
                Drawable drawable = vg0Var.d;
                int u10 = (vg0Var.B - vg0.u(vg0Var)) - dp;
                if (vg0.v(vg0Var) == 1) {
                    u10 = (int) (vg0Var.f29461b.getTranslationY() + u10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + u10;
                int w10 = vg0.w(vg0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (vg0.x(vg0Var) + u10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - u10) - vg0.y(vg0Var)) / dp3);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
                    u10 -= currentActionBarHeight;
                    dp2 -= currentActionBarHeight;
                    w10 += currentActionBarHeight;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i11 = AndroidUtilities.statusBarHeight;
                int i12 = dp2 + i11;
                drawable.setBounds(0, u10 + i11, getMeasuredWidth(), w10);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    j6.f20185t0.setColor(j6.w0(null, j6.f19977h5, false));
                    rectF.set(vg0.A(vg0Var), vg0.B(vg0Var) + i10, getMeasuredWidth() - vg0.C(vg0Var), AndroidUtilities.dp(24.0f) + vg0.D(vg0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, j6.f20185t0);
                }
                if (f10 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int w02 = j6.w0(null, j6.Ii, false);
                    int alpha = Color.alpha(w02);
                    j6.f20185t0.setColor(w02);
                    j6.f20185t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), j6.f20185t0);
                }
                int w03 = j6.w0(null, j6.f19977h5, false);
                j6.f20185t0.setColor(Color.argb((int) (vg0Var.f29463f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                canvas.drawRect(vg0.E(vg0Var), 0.0f, getMeasuredWidth() - vg0.F(vg0Var), AndroidUtilities.statusBarHeight, j6.f20185t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f5578a) {
            case 1:
                vg0 vg0Var = (vg0) this.d;
                if (motionEvent.getAction() == 0 && vg0Var.B != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + vg0Var.B && vg0Var.f29463f.getAlpha() == 0.0f) {
                        vg0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f5578a) {
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                vg0.t((vg0) this.d);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        switch (this.f5578a) {
            case 1:
                int size = View.MeasureSpec.getSize(i11);
                vg0 vg0Var = (vg0) this.d;
                t5 t5Var = vg0Var.f29469y;
                rg0 rg0Var = vg0Var.f29462c;
                pg0 pg0Var = vg0Var.f29461b;
                if (!vg0.K(vg0Var)) {
                    this.f5579b = true;
                    setPadding(vg0.M(vg0Var), AndroidUtilities.statusBarHeight, vg0.N(vg0Var), 0);
                    this.f5579b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) pg0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) vg0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp(15.0f) + vg0.r(vg0Var) + AndroidUtilities.statusBarHeight;
                int R = rg0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        t5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (vg0.s(vg0Var) * 2)), 1073741824), i11);
                        dp = t5Var.getMeasuredHeight();
                    } else {
                        int M = rg0Var.M(i13);
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
                if (pg0Var.getPaddingTop() != dp3) {
                    this.f5579b = true;
                    pg0Var.setPinnedSectionOffsetY(-dp3);
                    pg0Var.setPadding(0, dp3, 0, AndroidUtilities.navigationBarHeight);
                    this.f5579b = false;
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
        switch (this.f5578a) {
            case 1:
                if (!((vg0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f5578a) {
            case 1:
                if (!this.f5579b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public y(org.telegram.ui.vg0 vg0Var, Activity activity, boolean z4) {
        super(activity);
        this.d = vg0Var;
        this.f5579b = z4;
        this.f5580c = new Paint(1);
    }

    public y(LimitPreviewView limitPreviewView, Context context, boolean z4) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f5580c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f5579b = z4;
    }

    public y(g51 g51Var, Context context, boolean z4) {
        super(context);
        this.d = g51Var;
        this.f5579b = z4;
    }

    public y(oy oyVar, Activity activity, boolean z4) {
        super(activity);
        this.d = oyVar;
        this.f5579b = z4;
        this.f5580c = new Paint(1);
    }
}
