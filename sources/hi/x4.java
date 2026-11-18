package hi;

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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.y11;
public final class x4 extends LinearLayout {
    public final int f15723a;
    public Object f15724b;
    public Object f15725c;

    public x4(Activity activity, org.telegram.ui.Components.voip.l1 l1Var) {
        super(activity);
        this.f15723a = 6;
        this.f15724b = new RectF();
        this.f15725c = l1Var;
        l1Var.a(this);
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
        switch (this.f15723a) {
            case 4:
                super.dispatchDraw(canvas);
                ((vy0) this.f15724b).e(canvas, ((sb0) this.f15725c).getX() - org.telegram.messenger.g0.L(50.0f), getHeight() / 2.0f);
                return;
            case 5:
                canvas.save();
                y11 y11Var = (y11) this.f15725c;
                float d = ((org.telegram.ui.Components.c6) this.f15724b).d(y11Var.f42271y);
                if (d > 0.0f) {
                    if (y11Var.f42263c == null) {
                        y11Var.f42263c = new rn0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    y11Var.f42263c.a(canvas, d);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 6:
                RectF rectF = (RectF) this.f15724b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.l1 l1Var = (org.telegram.ui.Components.voip.l1) this.f15725c;
                l1Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), l1Var.b());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f15723a) {
            case 2:
                int[] iArr = (int[]) this.f15724b;
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (!dispatchTouchEvent) {
                    getLocationOnScreen(iArr);
                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        List j3 = org.telegram.messenger.g0.j();
                        if (j3 != null && j3.size() > 1) {
                            for (int size = j3.size() - 2; size >= 0; size--) {
                                View view = (View) j3.get(size);
                                if (!a(this, view)) {
                                    view.getLocationOnScreen(iArr);
                                    motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                    dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                                    if (dispatchTouchEvent) {
                                        this.f15725c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f15725c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f15725c = null;
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f15723a) {
            case 7:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.a6) this.f15724b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((org.telegram.ui.Wallet.da) this.f15725c).L);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f15723a) {
            case 7:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.a6) this.f15724b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((org.telegram.ui.Wallet.da) this.f15725c).L);
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
        float f10;
        TextView textView2;
        float interpolation2;
        float f11;
        switch (this.f15723a) {
            case 0:
                Paint paint = (Paint) this.f15724b;
                super.onDraw(canvas);
                l5 l5Var = (l5) this.f15725c;
                TextView textView3 = (TextView) getChildAt(l5Var.I0);
                int i7 = l5Var.J0;
                Layout layout = null;
                if (i7 != -1) {
                    textView = (TextView) getChildAt(i7);
                } else {
                    textView = null;
                }
                paint.setColor(textView3.getCurrentTextColor());
                float y10 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + org.telegram.messenger.g0.L(3.0f);
                Layout layout2 = textView3.getLayout();
                if (layout2 != null) {
                    if (textView != null) {
                        layout = textView.getLayout();
                    }
                    float f12 = 0.0f;
                    if (layout == null) {
                        interpolation = 0.0f;
                    } else {
                        interpolation = lr.f37208f.getInterpolation(l5Var.K0);
                    }
                    float primaryHorizontal = layout2.getPrimaryHorizontal(layout2.getLineStart(0)) + textView3.getX();
                    if (layout != null) {
                        f10 = layout.getPrimaryHorizontal(layout2.getLineStart(0)) + textView.getX();
                    } else {
                        f10 = 0.0f;
                    }
                    float T1 = org.telegram.messenger.g0.T1(primaryHorizontal, f10, interpolation);
                    float primaryHorizontal2 = layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0));
                    if (layout != null) {
                        f12 = layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0));
                    }
                    canvas.drawLine(T1, y10, org.telegram.messenger.g0.T1(primaryHorizontal2, f12, interpolation) + T1, y10, paint);
                    return;
                }
                return;
            case 3:
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false);
                Paint paint2 = (Paint) this.f15724b;
                if (paint2.getColor() != x02) {
                    paint2.setColor(x02);
                }
                canvas.drawPath((Path) this.f15725c, paint2);
                super.onDraw(canvas);
                return;
            case 8:
                Paint paint3 = (Paint) this.f15724b;
                super.onDraw(canvas);
                tg.g0 g0Var = (tg.g0) this.f15725c;
                TextView textView4 = (TextView) getChildAt(g0Var.Q0);
                int i10 = g0Var.R0;
                Layout layout3 = null;
                if (i10 != -1) {
                    textView2 = (TextView) getChildAt(i10);
                } else {
                    textView2 = null;
                }
                paint3.setColor(textView4.getCurrentTextColor());
                float y11 = ((textView4.getY() + textView4.getHeight()) - textView4.getPaddingBottom()) + org.telegram.messenger.g0.L(3.0f);
                Layout layout4 = textView4.getLayout();
                if (textView2 != null) {
                    layout3 = textView2.getLayout();
                }
                float f13 = 0.0f;
                if (layout3 == null) {
                    interpolation2 = 0.0f;
                } else {
                    interpolation2 = lr.f37208f.getInterpolation(g0Var.S0);
                }
                float primaryHorizontal3 = layout4.getPrimaryHorizontal(layout4.getLineStart(0)) + textView4.getX();
                if (textView2 != null) {
                    f11 = layout3.getPrimaryHorizontal(layout4.getLineStart(0)) + textView2.getX();
                } else {
                    f11 = 0.0f;
                }
                float T12 = org.telegram.messenger.g0.T1(primaryHorizontal3, f11, interpolation2);
                float primaryHorizontal4 = layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0));
                if (layout3 != null) {
                    f13 = layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0));
                }
                canvas.drawLine(T12, y11, org.telegram.messenger.g0.T1(primaryHorizontal4, f13, interpolation2) + T12, y11, paint3);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f15723a) {
            case 1:
                View view = (View) this.f15724b;
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f15725c;
                r0Var.f29916b.measure(i7, i10);
                if (r0Var.f29916b.getSwipeBack() != null) {
                    view.getLayoutParams().width = r0Var.f29916b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = r0Var.f29916b.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f);
                }
                super.onMeasure(i7, i10);
                return;
            case 3:
                super.onMeasure(i7, i10);
                Path path = (Path) this.f15725c;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f));
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                return;
            case 7:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public x4(org.telegram.ui.ActionBar.r0 r0Var, Context context, View view) {
        super(context);
        this.f15723a = 1;
        this.f15725c = r0Var;
        this.f15724b = view;
    }

    public x4(org.telegram.ui.Wallet.da daVar, Context context) {
        super(context);
        this.f15723a = 7;
        this.f15725c = daVar;
        this.f15724b = new org.telegram.ui.Wallet.a6(3, this);
    }

    public x4(tg.g0 g0Var, Context context) {
        super(context);
        this.f15723a = 8;
        this.f15725c = g0Var;
        Paint paint = new Paint(1);
        this.f15724b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public x4(y11 y11Var, Context context) {
        super(context);
        this.f15723a = 5;
        this.f15725c = y11Var;
        this.f15724b = new org.telegram.ui.Components.c6(this, 360L, lr.h);
    }

    public x4(Context context, int i7) {
        super(context);
        this.f15723a = i7;
        switch (i7) {
            case 3:
                super(context);
                return;
            default:
                this.f15724b = new int[2];
                this.f15725c = null;
                return;
        }
    }

    public x4(l5 l5Var, Context context) {
        super(context);
        this.f15723a = 0;
        this.f15725c = l5Var;
        Paint paint = new Paint(1);
        this.f15724b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public x4(Context context, vy0 vy0Var, sb0 sb0Var) {
        super(context);
        this.f15723a = 4;
        this.f15724b = vy0Var;
        this.f15725c = sb0Var;
    }
}
