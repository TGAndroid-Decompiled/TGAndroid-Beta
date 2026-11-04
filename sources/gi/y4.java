package gi;

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
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
public final class y4 extends LinearLayout {
    public final int f13933a;
    public Object f13934b;
    public Object f13935c;

    public y4(Activity activity, org.telegram.ui.Components.voip.x0 x0Var) {
        super(activity);
        this.f13933a = 6;
        this.f13934b = new RectF();
        this.f13935c = x0Var;
        x0Var.a(this);
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
        switch (this.f13933a) {
            case 4:
                super.dispatchDraw(canvas);
                ((ly0) this.f13934b).e(canvas, ((cb0) this.f13935c).getX() - org.telegram.messenger.g0.L(50.0f), getHeight() / 2.0f);
                return;
            case 5:
                canvas.save();
                f11 f11Var = (f11) this.f13935c;
                float d = ((org.telegram.ui.Components.u5) this.f13934b).d(f11Var.f33661y);
                if (d > 0.0f) {
                    if (f11Var.f33653c == null) {
                        f11Var.f33653c = new hn0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    f11Var.f33653c.a(canvas, d);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 6:
                RectF rectF = (RectF) this.f13934b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f13935c;
                x0Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), x0Var.b());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f13933a) {
            case 2:
                int[] iArr = (int[]) this.f13934b;
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (!dispatchTouchEvent) {
                    getLocationOnScreen(iArr);
                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        List j10 = org.telegram.messenger.g0.j();
                        if (j10 != null && j10.size() > 1) {
                            for (int size = j10.size() - 2; size >= 0; size--) {
                                View view = (View) j10.get(size);
                                if (!a(this, view)) {
                                    view.getLocationOnScreen(iArr);
                                    motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                    dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                                    if (dispatchTouchEvent) {
                                        this.f13935c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f13935c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f13935c = null;
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f13933a) {
            case 7:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.j5) this.f13934b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((org.telegram.ui.Wallet.m9) this.f13935c).L);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f13933a) {
            case 7:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.j5) this.f13934b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((org.telegram.ui.Wallet.m9) this.f13935c).L);
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
        switch (this.f13933a) {
            case 0:
                Paint paint = (Paint) this.f13934b;
                super.onDraw(canvas);
                m5 m5Var = (m5) this.f13935c;
                TextView textView3 = (TextView) getChildAt(m5Var.I0);
                int i3 = m5Var.J0;
                Layout layout = null;
                if (i3 != -1) {
                    textView = (TextView) getChildAt(i3);
                } else {
                    textView = null;
                }
                paint.setColor(textView3.getCurrentTextColor());
                float y9 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + org.telegram.messenger.g0.L(3.0f);
                Layout layout2 = textView3.getLayout();
                if (layout2 != null) {
                    if (textView != null) {
                        layout = textView.getLayout();
                    }
                    float f12 = 0.0f;
                    if (layout == null) {
                        interpolation = 0.0f;
                    } else {
                        interpolation = xq.f40452f.getInterpolation(m5Var.K0);
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
                    canvas.drawLine(T1, y9, org.telegram.messenger.g0.T1(primaryHorizontal2, f12, interpolation) + T1, y9, paint);
                    return;
                }
                return;
            case 3:
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false);
                Paint paint2 = (Paint) this.f13934b;
                if (paint2.getColor() != x02) {
                    paint2.setColor(x02);
                }
                canvas.drawPath((Path) this.f13935c, paint2);
                super.onDraw(canvas);
                return;
            case 8:
                Paint paint3 = (Paint) this.f13934b;
                super.onDraw(canvas);
                ug.f0 f0Var = (ug.f0) this.f13935c;
                TextView textView4 = (TextView) getChildAt(f0Var.Q0);
                int i10 = f0Var.R0;
                Layout layout3 = null;
                if (i10 != -1) {
                    textView2 = (TextView) getChildAt(i10);
                } else {
                    textView2 = null;
                }
                paint3.setColor(textView4.getCurrentTextColor());
                float y10 = ((textView4.getY() + textView4.getHeight()) - textView4.getPaddingBottom()) + org.telegram.messenger.g0.L(3.0f);
                Layout layout4 = textView4.getLayout();
                if (textView2 != null) {
                    layout3 = textView2.getLayout();
                }
                float f13 = 0.0f;
                if (layout3 == null) {
                    interpolation2 = 0.0f;
                } else {
                    interpolation2 = xq.f40452f.getInterpolation(f0Var.S0);
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
                canvas.drawLine(T12, y10, org.telegram.messenger.g0.T1(primaryHorizontal4, f13, interpolation2) + T12, y10, paint3);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f13933a) {
            case 1:
                View view = (View) this.f13934b;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f13935c;
                q0Var.f28440b.measure(i3, i10);
                if (q0Var.f28440b.getSwipeBack() != null) {
                    view.getLayoutParams().width = q0Var.f28440b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = q0Var.f28440b.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f);
                }
                super.onMeasure(i3, i10);
                return;
            case 3:
                super.onMeasure(i3, i10);
                Path path = (Path) this.f13935c;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f));
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                return;
            case 7:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    public y4(org.telegram.ui.ActionBar.q0 q0Var, Context context, View view) {
        super(context);
        this.f13933a = 1;
        this.f13935c = q0Var;
        this.f13934b = view;
    }

    public y4(org.telegram.ui.Wallet.m9 m9Var, Context context) {
        super(context);
        this.f13933a = 7;
        this.f13935c = m9Var;
        this.f13934b = new org.telegram.ui.Wallet.j5(3, this);
    }

    public y4(ug.f0 f0Var, Context context) {
        super(context);
        this.f13933a = 8;
        this.f13935c = f0Var;
        Paint paint = new Paint(1);
        this.f13934b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public y4(f11 f11Var, Context context) {
        super(context);
        this.f13933a = 5;
        this.f13935c = f11Var;
        this.f13934b = new org.telegram.ui.Components.u5(this, 360L, xq.h);
    }

    public y4(Context context, int i3) {
        super(context);
        this.f13933a = i3;
        switch (i3) {
            case 3:
                super(context);
                return;
            default:
                this.f13934b = new int[2];
                this.f13935c = null;
                return;
        }
    }

    public y4(m5 m5Var, Context context) {
        super(context);
        this.f13933a = 0;
        this.f13935c = m5Var;
        Paint paint = new Paint(1);
        this.f13934b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public y4(Context context, ly0 ly0Var, cb0 cb0Var) {
        super(context);
        this.f13933a = 4;
        this.f13934b = ly0Var;
        this.f13935c = cb0Var;
    }
}
