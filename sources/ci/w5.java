package ci;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.vd0;
public final class w5 extends LinearLayout {
    public final int f6207a;
    public Object f6208b;
    public Object f6209c;

    public w5(Context context, Object obj, LinearLayout linearLayout, int i10) {
        super(context);
        this.f6207a = i10;
        this.f6208b = obj;
        this.f6209c = linearLayout;
    }

    public static boolean a(View view, View view2) {
        if (view != view2) {
            if (view.getParent() != null) {
                if (view.getParent() instanceof View) {
                    return a((View) view.getParent(), view2);
                }
                if (view.getParent() == view2 || view.getRootView() == view2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f6207a) {
            case 4:
                super.dispatchDraw(canvas);
                ((m11) this.f6208b).e(canvas, ((vd0) this.f6209c).getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
                return;
            case 5:
                canvas.save();
                c41 c41Var = (c41) this.f6209c;
                float e7 = ((org.telegram.ui.Components.g6) this.f6208b).e(c41Var.f25185w);
                if (e7 > 0.0f) {
                    if (c41Var.f25179c == null) {
                        c41Var.f25179c = new eq0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    c41Var.f25179c.a(canvas, e7);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 6:
                RectF rectF = (RectF) this.f6208b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f6209c;
                q1Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), q1Var.b());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f6207a) {
            case 2:
                int[] iArr = (int[]) this.f6208b;
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (!dispatchTouchEvent) {
                    getLocationOnScreen(iArr);
                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        List<View> allGlobalViews = AndroidUtilities.allGlobalViews();
                        if (allGlobalViews != null && allGlobalViews.size() > 1) {
                            for (int size = allGlobalViews.size() - 2; size >= 0; size--) {
                                View view = allGlobalViews.get(size);
                                if (!a(this, view)) {
                                    view.getLocationOnScreen(iArr);
                                    motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                    dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                                    if (dispatchTouchEvent) {
                                        this.f6209c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f6209c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f6209c = null;
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f6207a) {
            case 8:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.m4) this.f6208b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((org.telegram.ui.Wallet.k8) this.f6209c).H);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f6207a) {
            case 8:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.m4) this.f6208b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((org.telegram.ui.Wallet.k8) this.f6209c).H);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        TextView textView;
        float interpolation;
        float f7;
        TextView textView2;
        float interpolation2;
        float f10;
        switch (this.f6207a) {
            case 0:
                Paint paint = (Paint) this.f6208b;
                super.onDraw(canvas);
                q6 q6Var = (q6) this.f6209c;
                TextView textView3 = (TextView) getChildAt(q6Var.Y0);
                int i10 = q6Var.Z0;
                Layout layout = null;
                if (i10 != -1) {
                    textView = (TextView) getChildAt(i10);
                } else {
                    textView = null;
                }
                paint.setColor(textView3.getCurrentTextColor());
                float y3 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout2 = textView3.getLayout();
                if (layout2 != null) {
                    if (textView != null) {
                        layout = textView.getLayout();
                    }
                    float f11 = 0.0f;
                    if (layout == null) {
                        interpolation = 0.0f;
                    } else {
                        interpolation = is.f27443f.getInterpolation(q6Var.f5790a1);
                    }
                    float primaryHorizontal = layout2.getPrimaryHorizontal(layout2.getLineStart(0)) + textView3.getX();
                    if (layout != null) {
                        f7 = layout.getPrimaryHorizontal(layout2.getLineStart(0)) + textView.getX();
                    } else {
                        f7 = 0.0f;
                    }
                    float lerp = AndroidUtilities.lerp(primaryHorizontal, f7, interpolation);
                    float primaryHorizontal2 = layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0));
                    if (layout != null) {
                        f11 = layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0));
                    }
                    canvas.drawLine(lerp, y3, AndroidUtilities.lerp(primaryHorizontal2, f11, interpolation) + lerp, y3, paint);
                    return;
                }
                return;
            case 3:
                canvas.drawPath((Path) this.f6209c, (Paint) this.f6208b);
                super.onDraw(canvas);
                return;
            case 9:
                Paint paint2 = (Paint) this.f6208b;
                super.onDraw(canvas);
                qg.m0 m0Var = (qg.m0) this.f6209c;
                TextView textView4 = (TextView) getChildAt(m0Var.f46415g1);
                int i11 = m0Var.f46417h1;
                Layout layout3 = null;
                if (i11 != -1) {
                    textView2 = (TextView) getChildAt(i11);
                } else {
                    textView2 = null;
                }
                paint2.setColor(textView4.getCurrentTextColor());
                float y10 = ((textView4.getY() + textView4.getHeight()) - textView4.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout4 = textView4.getLayout();
                if (textView2 != null) {
                    layout3 = textView2.getLayout();
                }
                float f12 = 0.0f;
                if (layout3 == null) {
                    interpolation2 = 0.0f;
                } else {
                    interpolation2 = is.f27443f.getInterpolation(m0Var.f46419i1);
                }
                float primaryHorizontal3 = layout4.getPrimaryHorizontal(layout4.getLineStart(0)) + textView4.getX();
                if (textView2 != null) {
                    f10 = layout3.getPrimaryHorizontal(layout4.getLineStart(0)) + textView2.getX();
                } else {
                    f10 = 0.0f;
                }
                float lerp2 = AndroidUtilities.lerp(primaryHorizontal3, f10, interpolation2);
                float primaryHorizontal4 = layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0));
                if (layout3 != null) {
                    f12 = layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0));
                }
                canvas.drawLine(lerp2, y10, AndroidUtilities.lerp(primaryHorizontal4, f12, interpolation2) + lerp2, y10, paint2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f6207a) {
            case 1:
                View view = (View) this.f6208b;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f6209c;
                v0Var.f21583b.measure(i10, i11);
                if (v0Var.f21583b.getSwipeBack() != null) {
                    view.getLayoutParams().width = v0Var.f21583b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = v0Var.f21583b.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                }
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f6209c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 7:
                int size = View.MeasureSpec.getSize(i10);
                LinearLayout linearLayout = (LinearLayout) this.f6208b;
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout linearLayout2 = (LinearLayout) this.f6209c;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredHeight() + linearLayout.getMeasuredHeight());
                    return;
                }
                setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
                return;
            case 8:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public w5(Activity activity, org.telegram.ui.Components.voip.q1 q1Var) {
        super(activity);
        this.f6207a = 6;
        this.f6208b = new RectF();
        this.f6209c = q1Var;
        q1Var.a(this);
    }

    public w5(org.telegram.ui.ActionBar.v0 v0Var, Context context, View view) {
        super(context);
        this.f6207a = 1;
        this.f6209c = v0Var;
        this.f6208b = view;
    }

    public w5(org.telegram.ui.Wallet.k8 k8Var, Context context) {
        super(context);
        this.f6207a = 8;
        this.f6209c = k8Var;
        this.f6208b = new org.telegram.ui.Wallet.m4(this, 2);
    }

    public w5(c41 c41Var, Context context) {
        super(context);
        this.f6207a = 5;
        this.f6209c = c41Var;
        this.f6208b = new org.telegram.ui.Components.g6(this, 360L, is.h);
    }

    public w5(qg.m0 m0Var, Context context) {
        super(context);
        this.f6207a = 9;
        this.f6209c = m0Var;
        Paint paint = new Paint(1);
        this.f6208b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public w5(Context context, int i10) {
        super(context);
        this.f6207a = i10;
        switch (i10) {
            case 3:
                super(context);
                return;
            default:
                this.f6208b = new int[2];
                this.f6209c = null;
                return;
        }
    }

    public w5(q6 q6Var, Context context) {
        super(context);
        this.f6207a = 0;
        this.f6209c = q6Var;
        Paint paint = new Paint(1);
        this.f6208b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }
}
