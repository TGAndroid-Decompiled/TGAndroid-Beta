package fg;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.tg0;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.n51;
import org.telegram.ui.py;
import org.telegram.ui.wg0;
import org.telegram.ui.y5;
public final class y extends FrameLayout {
    public final int f6627a = 0;
    public boolean f6628b;
    public Object f6629c;
    public final Object d;

    public y(xg0 xg0Var, Context context) {
        super(context);
        this.d = xg0Var;
        this.f6628b = false;
        this.f6629c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f6627a;
        Object obj = this.d;
        switch (i10) {
            case 2:
                Paint paint = (Paint) this.f6629c;
                if (this.f6628b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((py) obj).getThemedColor(k6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f6629c;
                if (this.f6628b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((wg0) obj).getThemedColor(k6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                n51 n51Var = (n51) obj;
                if (!this.f6628b && n51Var.f38557r > 0.0f) {
                    if (((Paint) this.f6629c) == null) {
                        Paint paint3 = new Paint();
                        this.f6629c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f6629c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f6629c).setAlpha((int) (n51Var.f38557r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f6629c);
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
        switch (this.f6627a) {
            case 0:
                boolean z10 = this.f6628b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    float f10 = limitPreviewView.f24946a;
                    boolean z11 = false;
                    if (f10 != 0.0f && f10 <= 1.0f && z10) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (f10 == 1.0f && !z10) {
                        z11 = true;
                    }
                    if ((z4 || z11) && limitPreviewView.f24949b0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f6629c, 31);
                        x xVar = limitPreviewView.f24949b0;
                        float x10 = getX() + ((ViewGroup) getParent()).getX();
                        float y10 = ((ViewGroup) getParent()).getY();
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((y5) ((org.telegram.ui.a1) xVar).f34976b).t0(x10, getY() + y10));
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
        switch (this.f6627a) {
            case 1:
                RectF rectF = (RectF) this.f6629c;
                int dp = AndroidUtilities.dp(13.0f);
                xg0 xg0Var = (xg0) this.d;
                Drawable drawable = xg0Var.d;
                int u10 = (xg0Var.B - xg0.u(xg0Var)) - dp;
                if (xg0.v(xg0Var) == 1) {
                    u10 = (int) (xg0Var.f33066b.getTranslationY() + u10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + u10;
                int w10 = xg0.w(xg0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (xg0.x(xg0Var) + u10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - u10) - xg0.y(xg0Var)) / dp3);
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
                    k6.f21941t0.setColor(k6.w0(null, k6.f21733h5, false));
                    rectF.set(xg0.A(xg0Var), xg0.B(xg0Var) + i10, getMeasuredWidth() - xg0.C(xg0Var), AndroidUtilities.dp(24.0f) + xg0.D(xg0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, k6.f21941t0);
                }
                if (f10 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int w02 = k6.w0(null, k6.Ii, false);
                    int alpha = Color.alpha(w02);
                    k6.f21941t0.setColor(w02);
                    k6.f21941t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), k6.f21941t0);
                }
                int w03 = k6.w0(null, k6.f21733h5, false);
                k6.f21941t0.setColor(Color.argb((int) (xg0Var.f33069f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                canvas.drawRect(xg0.E(xg0Var), 0.0f, getMeasuredWidth() - xg0.F(xg0Var), AndroidUtilities.statusBarHeight, k6.f21941t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f6627a) {
            case 1:
                xg0 xg0Var = (xg0) this.d;
                if (motionEvent.getAction() == 0 && xg0Var.B != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + xg0Var.B && xg0Var.f33069f.getAlpha() == 0.0f) {
                        xg0Var.dismiss();
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
        switch (this.f6627a) {
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                xg0.t((xg0) this.d);
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
        switch (this.f6627a) {
            case 1:
                int size = View.MeasureSpec.getSize(i11);
                xg0 xg0Var = (xg0) this.d;
                t5 t5Var = xg0Var.f33075y;
                tg0 tg0Var = xg0Var.f33067c;
                rg0 rg0Var = xg0Var.f33066b;
                if (!xg0.K(xg0Var)) {
                    this.f6628b = true;
                    setPadding(xg0.M(xg0Var), AndroidUtilities.statusBarHeight, xg0.N(xg0Var), 0);
                    this.f6628b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) rg0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) xg0Var.f33068e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp(15.0f) + xg0.r(xg0Var) + AndroidUtilities.statusBarHeight;
                int R = tg0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        t5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (xg0.s(xg0Var) * 2)), 1073741824), i11);
                        dp = t5Var.getMeasuredHeight();
                    } else {
                        int M = tg0Var.M(i13);
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
                if (rg0Var.getPaddingTop() != dp3) {
                    this.f6628b = true;
                    rg0Var.setPinnedSectionOffsetY(-dp3);
                    rg0Var.setPadding(0, dp3, 0, AndroidUtilities.navigationBarHeight);
                    this.f6628b = false;
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
        switch (this.f6627a) {
            case 1:
                if (!((xg0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f6627a) {
            case 1:
                if (!this.f6628b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public y(wg0 wg0Var, Activity activity, boolean z4) {
        super(activity);
        this.d = wg0Var;
        this.f6628b = z4;
        this.f6629c = new Paint(1);
    }

    public y(LimitPreviewView limitPreviewView, Context context, boolean z4) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f6629c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f6628b = z4;
    }

    public y(n51 n51Var, Context context, boolean z4) {
        super(context);
        this.d = n51Var;
        this.f6628b = z4;
    }

    public y(py pyVar, Activity activity, boolean z4) {
        super(activity);
        this.d = pyVar;
        this.f6628b = z4;
        this.f6629c = new Paint(1);
    }
}
