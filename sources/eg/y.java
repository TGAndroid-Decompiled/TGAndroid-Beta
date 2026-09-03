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
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.a6;
import org.telegram.ui.n51;
import org.telegram.ui.qy;
import org.telegram.ui.xg0;
public final class y extends FrameLayout {
    public final int f5567a = 0;
    public boolean f5568b;
    public Object f5569c;
    public final Object d;

    public y(wg0 wg0Var, Context context) {
        super(context);
        this.d = wg0Var;
        this.f5568b = false;
        this.f5569c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f5567a;
        Object obj = this.d;
        switch (i10) {
            case 2:
                Paint paint = (Paint) this.f5569c;
                if (this.f5568b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((qy) obj).getThemedColor(j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f5569c;
                if (this.f5568b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((xg0) obj).getThemedColor(j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                n51 n51Var = (n51) obj;
                if (!this.f5568b && n51Var.f35660r > 0.0f) {
                    if (((Paint) this.f5569c) == null) {
                        Paint paint3 = new Paint();
                        this.f5569c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f5569c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f5569c).setAlpha((int) (n51Var.f35660r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f5569c);
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
        switch (this.f5567a) {
            case 0:
                boolean z10 = this.f5568b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    float f10 = limitPreviewView.f23064a;
                    boolean z11 = false;
                    if (f10 != 0.0f && f10 <= 1.0f && z10) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (f10 == 1.0f && !z10) {
                        z11 = true;
                    }
                    if ((z4 || z11) && limitPreviewView.f23067b0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f5569c, 31);
                        x xVar = limitPreviewView.f23067b0;
                        float x10 = getX() + ((ViewGroup) getParent()).getX();
                        float y10 = ((ViewGroup) getParent()).getY();
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((a6) ((org.telegram.ui.c1) xVar).f32975b).t0(x10, getY() + y10));
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
        switch (this.f5567a) {
            case 1:
                RectF rectF = (RectF) this.f5569c;
                int dp = AndroidUtilities.dp(13.0f);
                wg0 wg0Var = (wg0) this.d;
                Drawable drawable = wg0Var.d;
                int u10 = (wg0Var.B - wg0.u(wg0Var)) - dp;
                if (wg0.v(wg0Var) == 1) {
                    u10 = (int) (wg0Var.f30249b.getTranslationY() + u10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + u10;
                int w10 = wg0.w(wg0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (wg0.x(wg0Var) + u10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - u10) - wg0.y(wg0Var)) / dp3);
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
                    j6.f20160t0.setColor(j6.w0(null, j6.f19952h5, false));
                    rectF.set(wg0.A(wg0Var), wg0.B(wg0Var) + i10, getMeasuredWidth() - wg0.C(wg0Var), AndroidUtilities.dp(24.0f) + wg0.D(wg0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, j6.f20160t0);
                }
                if (f10 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int w02 = j6.w0(null, j6.Ii, false);
                    int alpha = Color.alpha(w02);
                    j6.f20160t0.setColor(w02);
                    j6.f20160t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), j6.f20160t0);
                }
                int w03 = j6.w0(null, j6.f19952h5, false);
                j6.f20160t0.setColor(Color.argb((int) (wg0Var.f30251f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                canvas.drawRect(wg0.E(wg0Var), 0.0f, getMeasuredWidth() - wg0.F(wg0Var), AndroidUtilities.statusBarHeight, j6.f20160t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f5567a) {
            case 1:
                wg0 wg0Var = (wg0) this.d;
                if (motionEvent.getAction() == 0 && wg0Var.B != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + wg0Var.B && wg0Var.f30251f.getAlpha() == 0.0f) {
                        wg0Var.dismiss();
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
        switch (this.f5567a) {
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                wg0.t((wg0) this.d);
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
        switch (this.f5567a) {
            case 1:
                int size = View.MeasureSpec.getSize(i11);
                wg0 wg0Var = (wg0) this.d;
                t5 t5Var = wg0Var.f30257y;
                sg0 sg0Var = wg0Var.f30250c;
                qg0 qg0Var = wg0Var.f30249b;
                if (!wg0.K(wg0Var)) {
                    this.f5568b = true;
                    setPadding(wg0.M(wg0Var), AndroidUtilities.statusBarHeight, wg0.N(wg0Var), 0);
                    this.f5568b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) qg0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) wg0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp(15.0f) + wg0.r(wg0Var) + AndroidUtilities.statusBarHeight;
                int R = sg0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        t5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (wg0.s(wg0Var) * 2)), 1073741824), i11);
                        dp = t5Var.getMeasuredHeight();
                    } else {
                        int M = sg0Var.M(i13);
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
                if (qg0Var.getPaddingTop() != dp3) {
                    this.f5568b = true;
                    qg0Var.setPinnedSectionOffsetY(-dp3);
                    qg0Var.setPadding(0, dp3, 0, AndroidUtilities.navigationBarHeight);
                    this.f5568b = false;
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
        switch (this.f5567a) {
            case 1:
                if (!((wg0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f5567a) {
            case 1:
                if (!this.f5568b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public y(xg0 xg0Var, Activity activity, boolean z4) {
        super(activity);
        this.d = xg0Var;
        this.f5568b = z4;
        this.f5569c = new Paint(1);
    }

    public y(LimitPreviewView limitPreviewView, Context context, boolean z4) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f5569c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f5568b = z4;
    }

    public y(n51 n51Var, Context context, boolean z4) {
        super(context);
        this.d = n51Var;
        this.f5568b = z4;
    }

    public y(qy qyVar, Activity activity, boolean z4) {
        super(activity);
        this.d = qyVar;
        this.f5568b = z4;
        this.f5569c = new Paint(1);
    }
}
