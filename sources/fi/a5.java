package fi;

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
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wq;
public final class a5 extends LinearLayout {
    public final int f11608a;
    public Object f11609b;
    public Object f11610c;

    public a5(Activity activity, org.telegram.ui.Components.voip.i1 i1Var) {
        super(activity);
        this.f11608a = 6;
        this.f11609b = new RectF();
        this.f11610c = i1Var;
        i1Var.a(this);
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
        switch (this.f11608a) {
            case 4:
                super.dispatchDraw(canvas);
                ((my0) this.f11609b).e(canvas, ((hb0) this.f11610c).getX() - org.telegram.messenger.g0.L(50.0f), getHeight() / 2.0f);
                return;
            case 5:
                canvas.save();
                l11 l11Var = (l11) this.f11610c;
                float d = ((org.telegram.ui.Components.v5) this.f11609b).d(l11Var.f35496y);
                if (d > 0.0f) {
                    if (l11Var.f35488c == null) {
                        l11Var.f35488c = new en0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    l11Var.f35488c.a(canvas, d);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 6:
                RectF rectF = (RectF) this.f11609b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f11610c;
                i1Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), i1Var.b());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f11608a) {
            case 2:
                int[] iArr = (int[]) this.f11609b;
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
                                        this.f11610c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f11610c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f11610c = null;
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f11608a) {
            case 7:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.m5) this.f11609b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((org.telegram.ui.Wallet.o9) this.f11610c).K);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f11608a) {
            case 7:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.m5) this.f11609b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((org.telegram.ui.Wallet.o9) this.f11610c).K);
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
        switch (this.f11608a) {
            case 0:
                Paint paint = (Paint) this.f11609b;
                super.onDraw(canvas);
                o5 o5Var = (o5) this.f11610c;
                TextView textView3 = (TextView) getChildAt(o5Var.H0);
                int i7 = o5Var.I0;
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
                        interpolation = wq.f40046f.getInterpolation(o5Var.J0);
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
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false);
                Paint paint2 = (Paint) this.f11609b;
                if (paint2.getColor() != x02) {
                    paint2.setColor(x02);
                }
                canvas.drawPath((Path) this.f11610c, paint2);
                super.onDraw(canvas);
                return;
            case 8:
                Paint paint3 = (Paint) this.f11609b;
                super.onDraw(canvas);
                tg.g0 g0Var = (tg.g0) this.f11610c;
                TextView textView4 = (TextView) getChildAt(g0Var.P0);
                int i10 = g0Var.Q0;
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
                    interpolation2 = wq.f40046f.getInterpolation(g0Var.R0);
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
        switch (this.f11608a) {
            case 1:
                View view = (View) this.f11609b;
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f11610c;
                r0Var.f28430b.measure(i7, i10);
                if (r0Var.f28430b.getSwipeBack() != null) {
                    view.getLayoutParams().width = r0Var.f28430b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = r0Var.f28430b.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f);
                }
                super.onMeasure(i7, i10);
                return;
            case 3:
                super.onMeasure(i7, i10);
                Path path = (Path) this.f11610c;
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

    public a5(org.telegram.ui.ActionBar.r0 r0Var, Context context, View view) {
        super(context);
        this.f11608a = 1;
        this.f11610c = r0Var;
        this.f11609b = view;
    }

    public a5(org.telegram.ui.Wallet.o9 o9Var, Context context) {
        super(context);
        this.f11608a = 7;
        this.f11610c = o9Var;
        this.f11609b = new org.telegram.ui.Wallet.m5(3, this);
    }

    public a5(tg.g0 g0Var, Context context) {
        super(context);
        this.f11608a = 8;
        this.f11610c = g0Var;
        Paint paint = new Paint(1);
        this.f11609b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public a5(l11 l11Var, Context context) {
        super(context);
        this.f11608a = 5;
        this.f11610c = l11Var;
        this.f11609b = new org.telegram.ui.Components.v5(this, 360L, wq.h);
    }

    public a5(Context context, int i7) {
        super(context);
        this.f11608a = i7;
        switch (i7) {
            case 3:
                super(context);
                return;
            default:
                this.f11609b = new int[2];
                this.f11610c = null;
                return;
        }
    }

    public a5(o5 o5Var, Context context) {
        super(context);
        this.f11608a = 0;
        this.f11610c = o5Var;
        Paint paint = new Paint(1);
        this.f11609b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public a5(Context context, my0 my0Var, hb0 hb0Var) {
        super(context);
        this.f11608a = 4;
        this.f11609b = my0Var;
        this.f11610c = hb0Var;
    }
}
