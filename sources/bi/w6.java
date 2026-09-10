package bi;

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
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.j31;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.wr;
public final class w6 extends LinearLayout {
    public final int f3829a;
    public Object f3830b;
    public Object f3831c;

    public w6(Context context, Object obj, LinearLayout linearLayout, int i10) {
        super(context);
        this.f3829a = i10;
        this.f3830b = obj;
        this.f3831c = linearLayout;
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
        switch (this.f3829a) {
            case 4:
                super.dispatchDraw(canvas);
                ((t01) this.f3830b).e(canvas, ((dd0) this.f3831c).getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
                return;
            case 5:
                canvas.save();
                j31 j31Var = (j31) this.f3831c;
                float e = ((org.telegram.ui.Components.d6) this.f3830b).e(j31Var.f24229w);
                if (e > 0.0f) {
                    if (j31Var.f24224c == null) {
                        j31Var.f24224c = new jp0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    j31Var.f24224c.a(canvas, e);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 6:
                RectF rectF = (RectF) this.f3830b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.p1 p1Var = (org.telegram.ui.Components.voip.p1) this.f3831c;
                p1Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), p1Var.b());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3829a) {
            case 2:
                int[] iArr = (int[]) this.f3830b;
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
                                        this.f3831c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f3831c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f3831c = null;
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
        float f7;
        TextView textView2;
        float interpolation2;
        float f10;
        switch (this.f3829a) {
            case 0:
                Paint paint = (Paint) this.f3830b;
                super.onDraw(canvas);
                r7 r7Var = (r7) this.f3831c;
                TextView textView3 = (TextView) getChildAt(r7Var.Y0);
                int i10 = r7Var.Z0;
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
                        interpolation = wr.f28819f.getInterpolation(r7Var.f3500a1);
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
                canvas.drawPath((Path) this.f3831c, (Paint) this.f3830b);
                super.onDraw(canvas);
                return;
            case 8:
                Paint paint2 = (Paint) this.f3830b;
                super.onDraw(canvas);
                pg.m0 m0Var = (pg.m0) this.f3831c;
                TextView textView4 = (TextView) getChildAt(m0Var.f40134g1);
                int i11 = m0Var.f40136h1;
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
                    interpolation2 = wr.f28819f.getInterpolation(m0Var.f40138i1);
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
        switch (this.f3829a) {
            case 1:
                View view = (View) this.f3830b;
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f3831c;
                w0Var.f18686b.measure(i10, i11);
                if (w0Var.f18686b.getSwipeBack() != null) {
                    view.getLayoutParams().width = w0Var.f18686b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = w0Var.f18686b.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                }
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f3831c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 7:
                int size = View.MeasureSpec.getSize(i10);
                LinearLayout linearLayout = (LinearLayout) this.f3830b;
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout linearLayout2 = (LinearLayout) this.f3831c;
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

    public w6(Activity activity, org.telegram.ui.Components.voip.p1 p1Var) {
        super(activity);
        this.f3829a = 6;
        this.f3830b = new RectF();
        this.f3831c = p1Var;
        p1Var.a(this);
    }

    public w6(org.telegram.ui.ActionBar.w0 w0Var, Context context, View view) {
        super(context);
        this.f3829a = 1;
        this.f3831c = w0Var;
        this.f3830b = view;
    }

    public w6(j31 j31Var, Context context) {
        super(context);
        this.f3829a = 5;
        this.f3831c = j31Var;
        this.f3830b = new org.telegram.ui.Components.d6(this, 360L, wr.h);
    }

    public w6(pg.m0 m0Var, Context context) {
        super(context);
        this.f3829a = 8;
        this.f3831c = m0Var;
        Paint paint = new Paint(1);
        this.f3830b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public w6(Context context, int i10) {
        super(context);
        this.f3829a = i10;
        switch (i10) {
            case 3:
                super(context);
                return;
            default:
                this.f3830b = new int[2];
                this.f3831c = null;
                return;
        }
    }

    public w6(r7 r7Var, Context context) {
        super(context);
        this.f3829a = 0;
        this.f3831c = r7Var;
        Paint paint = new Paint(1);
        this.f3830b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }
}
