package kh;

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
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.nz0;
public final class n5 extends LinearLayout {
    public final int f15748a;
    public Object f15749b;
    public Object f15750c;

    public n5(Context context, Object obj, LinearLayout linearLayout, int i9) {
        super(context);
        this.f15748a = i9;
        this.f15749b = obj;
        this.f15750c = linearLayout;
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
        switch (this.f15748a) {
            case 4:
                super.dispatchDraw(canvas);
                ((nz0) this.f15749b).e(canvas, ((bc0) this.f15750c).getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
                return;
            case 5:
                canvas.save();
                a21 a21Var = (a21) this.f15750c;
                float e10 = ((org.telegram.ui.Components.y5) this.f15749b).e(a21Var.f26642w);
                if (e10 > 0.0f) {
                    if (a21Var.f26636c == null) {
                        a21Var.f26636c = new ho0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    a21Var.f26636c.a(canvas, e10);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 6:
                RectF rectF = (RectF) this.f15749b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.f15750c;
                n1Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), n1Var.b());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f15748a) {
            case 2:
                int[] iArr = (int[]) this.f15749b;
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
                                        this.f15750c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f15750c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f15750c = null;
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
        switch (this.f15748a) {
            case 0:
                Paint paint = (Paint) this.f15749b;
                super.onDraw(canvas);
                g6 g6Var = (g6) this.f15750c;
                TextView textView3 = (TextView) getChildAt(g6Var.U0);
                int i9 = g6Var.V0;
                Layout layout = null;
                if (i9 != -1) {
                    textView = (TextView) getChildAt(i9);
                } else {
                    textView = null;
                }
                paint.setColor(textView3.getCurrentTextColor());
                float y10 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout2 = textView3.getLayout();
                if (layout2 != null) {
                    if (textView != null) {
                        layout = textView.getLayout();
                    }
                    float f12 = 0.0f;
                    if (layout == null) {
                        interpolation = 0.0f;
                    } else {
                        interpolation = gr.f28844f.getInterpolation(g6Var.W0);
                    }
                    float primaryHorizontal = layout2.getPrimaryHorizontal(layout2.getLineStart(0)) + textView3.getX();
                    if (layout != null) {
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
                }
                return;
            case 3:
                canvas.drawPath((Path) this.f15750c, (Paint) this.f15749b);
                super.onDraw(canvas);
                return;
            case 8:
                Paint paint2 = (Paint) this.f15749b;
                super.onDraw(canvas);
                yf.l0 l0Var = (yf.l0) this.f15750c;
                TextView textView4 = (TextView) getChildAt(l0Var.f49930c1);
                int i10 = l0Var.f49932d1;
                Layout layout3 = null;
                if (i10 != -1) {
                    textView2 = (TextView) getChildAt(i10);
                } else {
                    textView2 = null;
                }
                paint2.setColor(textView4.getCurrentTextColor());
                float y11 = ((textView4.getY() + textView4.getHeight()) - textView4.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout4 = textView4.getLayout();
                if (textView2 != null) {
                    layout3 = textView2.getLayout();
                }
                float f13 = 0.0f;
                if (layout3 == null) {
                    interpolation2 = 0.0f;
                } else {
                    interpolation2 = gr.f28844f.getInterpolation(l0Var.f49934e1);
                }
                float primaryHorizontal3 = layout4.getPrimaryHorizontal(layout4.getLineStart(0)) + textView4.getX();
                if (textView2 != null) {
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
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f15748a) {
            case 1:
                View view = (View) this.f15749b;
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f15750c;
                w0Var.f23901b.measure(i9, i10);
                if (w0Var.f23901b.getSwipeBack() != null) {
                    view.getLayoutParams().width = w0Var.f23901b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = w0Var.f23901b.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                }
                super.onMeasure(i9, i10);
                return;
            case 3:
                super.onMeasure(i9, i10);
                Path path = (Path) this.f15750c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 7:
                int size = View.MeasureSpec.getSize(i9);
                LinearLayout linearLayout = (LinearLayout) this.f15749b;
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout linearLayout2 = (LinearLayout) this.f15750c;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredHeight() + linearLayout.getMeasuredHeight());
                    return;
                }
                setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    public n5(Activity activity, org.telegram.ui.Components.voip.n1 n1Var) {
        super(activity);
        this.f15748a = 6;
        this.f15749b = new RectF();
        this.f15750c = n1Var;
        n1Var.a(this);
    }

    public n5(org.telegram.ui.ActionBar.w0 w0Var, Context context, View view) {
        super(context);
        this.f15748a = 1;
        this.f15750c = w0Var;
        this.f15749b = view;
    }

    public n5(a21 a21Var, Context context) {
        super(context);
        this.f15748a = 5;
        this.f15750c = a21Var;
        this.f15749b = new org.telegram.ui.Components.y5(this, 360L, gr.h);
    }

    public n5(yf.l0 l0Var, Context context) {
        super(context);
        this.f15748a = 8;
        this.f15750c = l0Var;
        Paint paint = new Paint(1);
        this.f15749b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public n5(Context context, int i9) {
        super(context);
        this.f15748a = i9;
        switch (i9) {
            case 3:
                super(context);
                return;
            default:
                this.f15749b = new int[2];
                this.f15750c = null;
                return;
        }
    }

    public n5(g6 g6Var, Context context) {
        super(context);
        this.f15748a = 0;
        this.f15750c = g6Var;
        Paint paint = new Paint(1);
        this.f15749b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }
}
