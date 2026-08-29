package bg;

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
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.l21;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.zz0;
public final class l0 extends LinearLayout {
    public final int f2380a;
    public Object f2381b;
    public Object f2382c;

    public l0(Context context, Object obj, LinearLayout linearLayout, int i10) {
        super(context);
        this.f2380a = i10;
        this.f2381b = obj;
        this.f2382c = linearLayout;
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
        switch (this.f2380a) {
            case 5:
                super.dispatchDraw(canvas);
                ((zz0) this.f2381b).e(canvas, ((qc0) this.f2382c).getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
                return;
            case 6:
                canvas.save();
                l21 l21Var = (l21) this.f2382c;
                float e10 = ((d6) this.f2381b).e(l21Var.f30216w);
                if (e10 > 0.0f) {
                    if (l21Var.f30210c == null) {
                        l21Var.f30210c = new so0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    l21Var.f30210c.a(canvas, e10);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 7:
                RectF rectF = (RectF) this.f2381b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f2382c;
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
        switch (this.f2380a) {
            case 3:
                int[] iArr = (int[]) this.f2381b;
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
                                        this.f2382c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f2382c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f2382c = null;
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
        float f9;
        TextView textView2;
        float interpolation2;
        float f10;
        switch (this.f2380a) {
            case 0:
                Paint paint = (Paint) this.f2381b;
                super.onDraw(canvas);
                g1 g1Var = (g1) this.f2382c;
                TextView textView3 = (TextView) getChildAt(g1Var.f2227c1);
                int i10 = g1Var.f2229d1;
                Layout layout = null;
                if (i10 != -1) {
                    textView = (TextView) getChildAt(i10);
                } else {
                    textView = null;
                }
                paint.setColor(textView3.getCurrentTextColor());
                float y8 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout2 = textView3.getLayout();
                if (textView != null) {
                    layout = textView.getLayout();
                }
                float f11 = 0.0f;
                if (layout == null) {
                    interpolation = 0.0f;
                } else {
                    interpolation = jr.f29800f.getInterpolation(g1Var.f2231e1);
                }
                float primaryHorizontal = layout2.getPrimaryHorizontal(layout2.getLineStart(0)) + textView3.getX();
                if (textView != null) {
                    f9 = layout.getPrimaryHorizontal(layout2.getLineStart(0)) + textView.getX();
                } else {
                    f9 = 0.0f;
                }
                float lerp = AndroidUtilities.lerp(primaryHorizontal, f9, interpolation);
                float primaryHorizontal2 = layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0));
                if (layout != null) {
                    f11 = layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0));
                }
                canvas.drawLine(lerp, y8, AndroidUtilities.lerp(primaryHorizontal2, f11, interpolation) + lerp, y8, paint);
                return;
            case 1:
                Paint paint2 = (Paint) this.f2381b;
                super.onDraw(canvas);
                t5 t5Var = (t5) this.f2382c;
                TextView textView4 = (TextView) getChildAt(t5Var.U0);
                int i11 = t5Var.V0;
                Layout layout3 = null;
                if (i11 != -1) {
                    textView2 = (TextView) getChildAt(i11);
                } else {
                    textView2 = null;
                }
                paint2.setColor(textView4.getCurrentTextColor());
                float y10 = ((textView4.getY() + textView4.getHeight()) - textView4.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout4 = textView4.getLayout();
                if (layout4 != null) {
                    if (textView2 != null) {
                        layout3 = textView2.getLayout();
                    }
                    float f12 = 0.0f;
                    if (layout3 == null) {
                        interpolation2 = 0.0f;
                    } else {
                        interpolation2 = jr.f29800f.getInterpolation(t5Var.W0);
                    }
                    float primaryHorizontal3 = layout4.getPrimaryHorizontal(layout4.getLineStart(0)) + textView4.getX();
                    if (layout3 != null) {
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
                }
                return;
            case 2:
            case 3:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                canvas.drawPath((Path) this.f2382c, (Paint) this.f2381b);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f2380a) {
            case 2:
                View view = (View) this.f2381b;
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f2382c;
                w0Var.f23915b.measure(i10, i11);
                if (w0Var.f23915b.getSwipeBack() != null) {
                    view.getLayoutParams().width = w0Var.f23915b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = w0Var.f23915b.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                }
                super.onMeasure(i10, i11);
                return;
            case 4:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f2382c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 8:
                int size = View.MeasureSpec.getSize(i10);
                LinearLayout linearLayout = (LinearLayout) this.f2381b;
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout linearLayout2 = (LinearLayout) this.f2382c;
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

    public l0(Activity activity, org.telegram.ui.Components.voip.o1 o1Var) {
        super(activity);
        this.f2380a = 7;
        this.f2381b = new RectF();
        this.f2382c = o1Var;
        o1Var.a(this);
    }

    public l0(org.telegram.ui.ActionBar.w0 w0Var, Context context, View view) {
        super(context);
        this.f2380a = 2;
        this.f2382c = w0Var;
        this.f2381b = view;
    }

    public l0(l21 l21Var, Context context) {
        super(context);
        this.f2380a = 6;
        this.f2382c = l21Var;
        this.f2381b = new d6(this, 360L, jr.h);
    }

    public l0(g1 g1Var, Context context) {
        super(context);
        this.f2380a = 0;
        this.f2382c = g1Var;
        Paint paint = new Paint(1);
        this.f2381b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public l0(Context context, int i10) {
        super(context);
        this.f2380a = i10;
        switch (i10) {
            case 4:
                super(context);
                return;
            default:
                this.f2381b = new int[2];
                this.f2382c = null;
                return;
        }
    }

    public l0(t5 t5Var, Context context) {
        super(context);
        this.f2380a = 1;
        this.f2382c = t5Var;
        Paint paint = new Paint(1);
        this.f2381b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }
}
