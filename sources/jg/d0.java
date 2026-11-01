package jg;

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
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o21;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Wallet.n5;
import org.telegram.ui.Wallet.r9;
import vh.b4;
public final class d0 extends LinearLayout {
    public final int f9916a;
    public Object f9917b;
    public Object f9918c;

    public d0(Activity activity, org.telegram.ui.Components.voip.y0 y0Var) {
        super(activity);
        this.f9916a = 6;
        this.f9917b = new RectF();
        this.f9918c = y0Var;
        y0Var.a(this);
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
        switch (this.f9916a) {
            case 4:
                super.dispatchDraw(canvas);
                ((rz0) this.f9917b).e(canvas, ((ac0) this.f9918c).getX() - org.telegram.messenger.i0.L(50.0f), getHeight() / 2.0f);
                return;
            case 5:
                canvas.save();
                o21 o21Var = (o21) this.f9918c;
                float d = ((t5) this.f9917b).d(o21Var.f29016y);
                if (d > 0.0f) {
                    if (o21Var.f29009c == null) {
                        o21Var.f29009c = new go0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    o21Var.f29009c.a(canvas, d);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 6:
                RectF rectF = (RectF) this.f9917b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f9918c;
                y0Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), y0Var.b());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f9916a) {
            case 2:
                int[] iArr = (int[]) this.f9917b;
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (!dispatchTouchEvent) {
                    getLocationOnScreen(iArr);
                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        List j10 = org.telegram.messenger.i0.j();
                        if (j10 != null && j10.size() > 1) {
                            for (int size = j10.size() - 2; size >= 0; size--) {
                                View view = (View) j10.get(size);
                                if (!a(this, view)) {
                                    view.getLocationOnScreen(iArr);
                                    motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                    dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                                    if (dispatchTouchEvent) {
                                        this.f9918c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f9918c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f9918c = null;
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f9916a) {
            case 7:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((n5) this.f9917b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((r9) this.f9918c).K);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f9916a) {
            case 7:
                getViewTreeObserver().removeOnPreDrawListener((n5) this.f9917b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((r9) this.f9918c).K);
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
        switch (this.f9916a) {
            case 0:
                Paint paint = (Paint) this.f9917b;
                super.onDraw(canvas);
                r0 r0Var = (r0) this.f9918c;
                TextView textView3 = (TextView) getChildAt(r0Var.P0);
                int i10 = r0Var.Q0;
                Layout layout = null;
                if (i10 != -1) {
                    textView = (TextView) getChildAt(i10);
                } else {
                    textView = null;
                }
                paint.setColor(textView3.getCurrentTextColor());
                float y3 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + org.telegram.messenger.i0.L(3.0f);
                Layout layout2 = textView3.getLayout();
                if (textView != null) {
                    layout = textView.getLayout();
                }
                float f11 = 0.0f;
                if (layout == null) {
                    interpolation = 0.0f;
                } else {
                    interpolation = gr.f26523f.getInterpolation(r0Var.R0);
                }
                float primaryHorizontal = layout2.getPrimaryHorizontal(layout2.getLineStart(0)) + textView3.getX();
                if (textView != null) {
                    f7 = layout.getPrimaryHorizontal(layout2.getLineStart(0)) + textView.getX();
                } else {
                    f7 = 0.0f;
                }
                float T1 = org.telegram.messenger.i0.T1(primaryHorizontal, f7, interpolation);
                float primaryHorizontal2 = layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0));
                if (layout != null) {
                    f11 = layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0));
                }
                canvas.drawLine(T1, y3, org.telegram.messenger.i0.T1(primaryHorizontal2, f11, interpolation) + T1, y3, paint);
                return;
            case 3:
                int x02 = t6.x0(null, t6.f20930d6, false);
                Paint paint2 = (Paint) this.f9917b;
                if (paint2.getColor() != x02) {
                    paint2.setColor(x02);
                }
                canvas.drawPath((Path) this.f9918c, paint2);
                super.onDraw(canvas);
                return;
            case 8:
                Paint paint3 = (Paint) this.f9917b;
                super.onDraw(canvas);
                b4 b4Var = (b4) this.f9918c;
                TextView textView4 = (TextView) getChildAt(b4Var.H0);
                int i11 = b4Var.I0;
                Layout layout3 = null;
                if (i11 != -1) {
                    textView2 = (TextView) getChildAt(i11);
                } else {
                    textView2 = null;
                }
                paint3.setColor(textView4.getCurrentTextColor());
                float y10 = ((textView4.getY() + textView4.getHeight()) - textView4.getPaddingBottom()) + org.telegram.messenger.i0.L(3.0f);
                Layout layout4 = textView4.getLayout();
                if (layout4 != null) {
                    if (textView2 != null) {
                        layout3 = textView2.getLayout();
                    }
                    float f12 = 0.0f;
                    if (layout3 == null) {
                        interpolation2 = 0.0f;
                    } else {
                        interpolation2 = gr.f26523f.getInterpolation(b4Var.J0);
                    }
                    float primaryHorizontal3 = layout4.getPrimaryHorizontal(layout4.getLineStart(0)) + textView4.getX();
                    if (layout3 != null) {
                        f10 = layout3.getPrimaryHorizontal(layout4.getLineStart(0)) + textView2.getX();
                    } else {
                        f10 = 0.0f;
                    }
                    float T12 = org.telegram.messenger.i0.T1(primaryHorizontal3, f10, interpolation2);
                    float primaryHorizontal4 = layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0));
                    if (layout3 != null) {
                        f12 = layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0));
                    }
                    canvas.drawLine(T12, y10, org.telegram.messenger.i0.T1(primaryHorizontal4, f12, interpolation2) + T12, y10, paint3);
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
        switch (this.f9916a) {
            case 1:
                View view = (View) this.f9917b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f9918c;
                t0Var.f20827b.measure(i10, i11);
                if (t0Var.f20827b.getSwipeBack() != null) {
                    view.getLayoutParams().width = t0Var.f20827b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = t0Var.f20827b.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f);
                }
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f9918c;
                path.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(12.0f));
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), Path.Direction.CW);
                return;
            case 7:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public d0(org.telegram.ui.ActionBar.t0 t0Var, Context context, View view) {
        super(context);
        this.f9916a = 1;
        this.f9918c = t0Var;
        this.f9917b = view;
    }

    public d0(r9 r9Var, Context context) {
        super(context);
        this.f9916a = 7;
        this.f9918c = r9Var;
        this.f9917b = new n5(3, this);
    }

    public d0(r0 r0Var, Context context) {
        super(context);
        this.f9916a = 0;
        this.f9918c = r0Var;
        Paint paint = new Paint(1);
        this.f9917b = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public d0(o21 o21Var, Context context) {
        super(context);
        this.f9916a = 5;
        this.f9918c = o21Var;
        this.f9917b = new t5(this, 360L, gr.h);
    }

    public d0(Context context, int i10) {
        super(context);
        this.f9916a = i10;
        switch (i10) {
            case 3:
                super(context);
                return;
            default:
                this.f9917b = new int[2];
                this.f9918c = null;
                return;
        }
    }

    public d0(b4 b4Var, Context context) {
        super(context);
        this.f9916a = 8;
        this.f9918c = b4Var;
        Paint paint = new Paint(1);
        this.f9917b = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public d0(Context context, rz0 rz0Var, ac0 ac0Var) {
        super(context);
        this.f9916a = 4;
        this.f9917b = rz0Var;
        this.f9918c = ac0Var;
    }
}
