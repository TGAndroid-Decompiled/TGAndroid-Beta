package eg;

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
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v21;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z5;
import qh.a5;
public final class i0 extends LinearLayout {
    public final int f5244a;
    public Object f5245b;
    public Object f5246c;

    public i0(Context context, Object obj, LinearLayout linearLayout, int i10) {
        super(context);
        this.f5244a = i10;
        this.f5245b = obj;
        this.f5246c = linearLayout;
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
        switch (this.f5244a) {
            case 4:
                super.dispatchDraw(canvas);
                ((k01) this.f5245b).e(canvas, ((yc0) this.f5246c).getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
                return;
            case 5:
                canvas.save();
                v21 v21Var = (v21) this.f5246c;
                float e6 = ((z5) this.f5245b).e(v21Var.f31761w);
                if (e6 > 0.0f) {
                    if (v21Var.f31755c == null) {
                        v21Var.f31755c = new cp0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    v21Var.f31755c.a(canvas, e6);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 6:
                RectF rectF = (RectF) this.f5245b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f5246c;
                o1Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), o1Var.b());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f5244a) {
            case 2:
                int[] iArr = (int[]) this.f5245b;
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
                                        this.f5246c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f5246c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f5246c = null;
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        TextView textView;
        float interpolation;
        float f10;
        TextView textView2;
        float interpolation2;
        float f11;
        switch (this.f5244a) {
            case 0:
                Paint paint = (Paint) this.f5245b;
                super.onDraw(canvas);
                c1 c1Var = (c1) this.f5246c;
                TextView textView3 = (TextView) getChildAt(c1Var.f5106d1);
                int i10 = c1Var.f5108e1;
                Layout layout = null;
                if (i10 != -1) {
                    textView = (TextView) getChildAt(i10);
                } else {
                    textView = null;
                }
                paint.setColor(textView3.getCurrentTextColor());
                float y10 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout2 = textView3.getLayout();
                if (textView != null) {
                    layout = textView.getLayout();
                }
                float f12 = 0.0f;
                if (layout == null) {
                    interpolation = 0.0f;
                } else {
                    interpolation = pr.f30168f.getInterpolation(c1Var.f5110f1);
                }
                float primaryHorizontal = layout2.getPrimaryHorizontal(layout2.getLineStart(0)) + textView3.getX();
                if (textView != null) {
                    f10 = layout.getPrimaryHorizontal(layout2.getLineStart(0)) + textView.getX();
                } else {
                    f10 = 0.0f;
                }
                float lerp = AndroidUtilities.lerp(primaryHorizontal, f10, interpolation);
                float primaryHorizontal2 = layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0));
                if (layout != null) {
                    f12 = layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0));
                }
                canvas.drawLine(lerp, y10, AndroidUtilities.lerp(primaryHorizontal2, f12, interpolation) + lerp, y10, paint);
                return;
            case 3:
                canvas.drawPath((Path) this.f5246c, (Paint) this.f5245b);
                super.onDraw(canvas);
                return;
            case 8:
                Paint paint2 = (Paint) this.f5245b;
                super.onDraw(canvas);
                a5 a5Var = (a5) this.f5246c;
                TextView textView4 = (TextView) getChildAt(a5Var.V0);
                int i11 = a5Var.W0;
                Layout layout3 = null;
                if (i11 != -1) {
                    textView2 = (TextView) getChildAt(i11);
                } else {
                    textView2 = null;
                }
                paint2.setColor(textView4.getCurrentTextColor());
                float y11 = ((textView4.getY() + textView4.getHeight()) - textView4.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout4 = textView4.getLayout();
                if (layout4 != null) {
                    if (textView2 != null) {
                        layout3 = textView2.getLayout();
                    }
                    float f13 = 0.0f;
                    if (layout3 == null) {
                        interpolation2 = 0.0f;
                    } else {
                        interpolation2 = pr.f30168f.getInterpolation(a5Var.X0);
                    }
                    float primaryHorizontal3 = layout4.getPrimaryHorizontal(layout4.getLineStart(0)) + textView4.getX();
                    if (layout3 != null) {
                        f11 = layout3.getPrimaryHorizontal(layout4.getLineStart(0)) + textView2.getX();
                    } else {
                        f11 = 0.0f;
                    }
                    float lerp2 = AndroidUtilities.lerp(primaryHorizontal3, f11, interpolation2);
                    float primaryHorizontal4 = layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0));
                    if (layout3 != null) {
                        f13 = layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0));
                    }
                    canvas.drawLine(lerp2, y11, AndroidUtilities.lerp(primaryHorizontal4, f13, interpolation2) + lerp2, y11, paint2);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5244a) {
            case 1:
                View view = (View) this.f5245b;
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f5246c;
                w0Var.f22346b.measure(i10, i11);
                if (w0Var.f22346b.getSwipeBack() != null) {
                    view.getLayoutParams().width = w0Var.f22346b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = w0Var.f22346b.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                }
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f5246c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 7:
                int size = View.MeasureSpec.getSize(i10);
                LinearLayout linearLayout = (LinearLayout) this.f5245b;
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout linearLayout2 = (LinearLayout) this.f5246c;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredHeight() + linearLayout.getMeasuredHeight());
                    return;
                }
                setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public i0(Activity activity, org.telegram.ui.Components.voip.o1 o1Var) {
        super(activity);
        this.f5244a = 6;
        this.f5245b = new RectF();
        this.f5246c = o1Var;
        o1Var.a(this);
    }

    public i0(org.telegram.ui.ActionBar.w0 w0Var, Context context, View view) {
        super(context);
        this.f5244a = 1;
        this.f5246c = w0Var;
        this.f5245b = view;
    }

    public i0(v21 v21Var, Context context) {
        super(context);
        this.f5244a = 5;
        this.f5246c = v21Var;
        this.f5245b = new z5(this, 360L, pr.h);
    }

    public i0(c1 c1Var, Context context) {
        super(context);
        this.f5244a = 0;
        this.f5246c = c1Var;
        Paint paint = new Paint(1);
        this.f5245b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public i0(Context context, int i10) {
        super(context);
        this.f5244a = i10;
        switch (i10) {
            case 3:
                super(context);
                return;
            default:
                this.f5245b = new int[2];
                this.f5246c = null;
                return;
        }
    }

    public i0(a5 a5Var, Context context) {
        super(context);
        this.f5244a = 8;
        this.f5246c = a5Var;
        Paint paint = new Paint(1);
        this.f5245b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }
}
