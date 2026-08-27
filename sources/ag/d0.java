package ag;

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
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.gy;
import org.telegram.ui.qg0;
import org.telegram.ui.r41;
import org.telegram.ui.v5;

public final class d0 extends FrameLayout {

    public final int f328a = 0;

    public boolean f329b;

    public Object f330c;
    public final Object d;

    public d0(cg0 cg0Var, Context context) {
        super(context);
        this.d = cg0Var;
        this.f329b = false;
        this.f330c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f328a;
        Object obj = this.d;
        switch (i10) {
            case 2:
                Paint paint = (Paint) this.f330c;
                if (this.f329b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((gy) obj).getThemedColor(g6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.f330c;
                if (this.f329b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((qg0) obj).getThemedColor(g6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                r41 r41Var = (r41) obj;
                if (!this.f329b && r41Var.f41278r > 0.0f) {
                    if (((Paint) this.f330c) == null) {
                        Paint paint3 = new Paint();
                        this.f330c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f330c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f330c).setAlpha((int) (r41Var.f41278r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f330c);
                    canvas.restore();
                } else {
                    super.dispatchDraw(canvas);
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f328a) {
            case 0:
                boolean z10 = this.f329b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (!(view instanceof TextView)) {
                    return super.drawChild(canvas, view, j10);
                }
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                float f10 = limitPreviewView.f26443a;
                boolean z11 = false;
                boolean z12 = f10 != 0.0f && f10 <= 1.0f && z10;
                if (f10 == 1.0f && !z10) {
                    z11 = true;
                }
                if ((!z12 && !z11) || limitPreviewView.f26444a0 == null) {
                    return zDrawChild;
                }
                canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f330c, 31);
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((v5) ((org.telegram.ui.c1) limitPreviewView.f26444a0).f36910b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                canvas.restore();
                invalidate();
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        switch (this.f328a) {
            case 1:
                RectF rectF = (RectF) this.f330c;
                int iDp = AndroidUtilities.dp(13.0f);
                cg0 cg0Var = (cg0) this.d;
                Drawable drawable = cg0Var.d;
                int translationY = (cg0Var.A - ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingTop) - iDp;
                if (((org.telegram.ui.ActionBar.e3) cg0Var).currentSheetAnimationType == 1) {
                    translationY = (int) (cg0Var.f27417b.getTranslationY() + translationY);
                }
                int iDp2 = AndroidUtilities.dp(20.0f) + translationY;
                int iDp3 = ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingTop + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingTop + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float fDp = AndroidUtilities.dp(4.0f) + iDp;
                    float fMin = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingTop) / fDp);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - fDp) * fMin);
                    translationY -= currentActionBarHeight;
                    iDp2 -= currentActionBarHeight;
                    iDp3 += currentActionBarHeight;
                    f10 = 1.0f - fMin;
                } else {
                    f10 = 1.0f;
                }
                int i10 = AndroidUtilities.statusBarHeight;
                int i11 = translationY + i10;
                int i12 = iDp2 + i10;
                drawable.setBounds(0, i11, getMeasuredWidth(), iDp3);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    g6.f23333t0.setColor(g6.w0(null, g6.f23124h5, false));
                    rectF.set(((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingTop + i11, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingTop + i11);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, g6.f23333t0);
                }
                if (f10 != 0.0f) {
                    int iDp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - iDp4) / 2, i12, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int iW0 = g6.w0(null, g6.Ii, false);
                    int iAlpha = Color.alpha(iW0);
                    g6.f23333t0.setColor(iW0);
                    g6.f23333t0.setAlpha((int) (iAlpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), g6.f23333t0);
                }
                int iW1 = g6.w0(null, g6.f23124h5, false);
                g6.f23333t0.setColor(Color.argb((int) (cg0Var.f27420f.getAlpha() * 255.0f), Color.red(iW1), Color.green(iW1), Color.blue(iW1)));
                canvas.drawRect(((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, g6.f23333t0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f328a) {
            case 1:
                cg0 cg0Var = (cg0) this.d;
                if (motionEvent.getAction() == 0 && cg0Var.A != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + cg0Var.A && cg0Var.f27420f.getAlpha() == 0.0f) {
                        cg0Var.dismiss();
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
        switch (this.f328a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                cg0.u((cg0) this.d);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int iM;
        switch (this.f328a) {
            case 1:
                int size = View.MeasureSpec.getSize(i11);
                cg0 cg0Var = (cg0) this.d;
                s5 s5Var = cg0Var.f27426y;
                yf0 yf0Var = cg0Var.f27418c;
                wf0 wf0Var = cg0Var.f27417b;
                if (!((org.telegram.ui.ActionBar.e3) cg0Var).isFullscreen) {
                    this.f329b = true;
                    setPadding(((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingLeft, 0);
                    this.f329b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) wf0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) cg0Var.f27419e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int iDp = AndroidUtilities.dp(15.0f) + ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingTop + AndroidUtilities.statusBarHeight;
                int iR = yf0Var.R();
                for (int i12 = 0; i12 < iR; i12++) {
                    if (i12 == 0) {
                        s5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingLeft * 2)), 1073741824), i11);
                        iM = s5Var.getMeasuredHeight();
                    } else {
                        iM = ((yf0Var.M(i12) - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    iDp = iM + iDp;
                }
                int iDp2 = AndroidUtilities.dp(8.0f) + (iDp < paddingTop ? paddingTop - iDp : paddingTop - ((paddingTop / 5) * 3));
                if (wf0Var.getPaddingTop() != iDp2) {
                    this.f329b = true;
                    wf0Var.setPinnedSectionOffsetY(-iDp2);
                    wf0Var.setPadding(0, iDp2, 0, AndroidUtilities.navigationBarHeight);
                    this.f329b = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f328a) {
            case 1:
                return !((cg0) this.d).isDismissed() && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f328a) {
            case 1:
                if (!this.f329b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    public d0(qg0 qg0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = qg0Var;
        this.f329b = z10;
        this.f330c = new Paint(1);
    }

    public d0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f330c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f329b = z10;
    }

    public d0(r41 r41Var, Context context, boolean z10) {
        super(context);
        this.d = r41Var;
        this.f329b = z10;
    }

    public d0(gy gyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = gyVar;
        this.f329b = z10;
        this.f330c = new Paint(1);
    }
}
