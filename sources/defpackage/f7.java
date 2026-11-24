package defpackage;

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
public final class f7 extends LinearLayout {
    public final byte a;
    public Object b;
    public Object c;

    public f7(rw5 rw5Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = rw5Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
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
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                ((tgb) this.b).e(canvas, ((hn7) this.c).getX() - gl.L(50.0f), getHeight() / 2.0f);
                return;
            case 3:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                lfc lfcVar = (lfc) this.c;
                lfcVar.d(getX(), getY());
                canvas.drawRoundRect(rectF, gl.L(20.0f), gl.L(20.0f), lfcVar.b());
                super.dispatchDraw(canvas);
                return;
            case 7:
                canvas.save();
                jxb jxbVar = (jxb) this.c;
                float d = ((lm) this.b).d(jxbVar.y);
                if (d > 0.0f) {
                    if (jxbVar.c == null) {
                        jxbVar.c = new c9a(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    jxbVar.c.a(canvas, d);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                int[] iArr = (int[]) this.c;
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (!dispatchTouchEvent) {
                    getLocationOnScreen(iArr);
                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        List j = gl.j();
                        if (j != null && j.size() > 1) {
                            for (int size = j.size() - 2; size >= 0; size--) {
                                View view = (View) j.get(size);
                                if (!a(this, view)) {
                                    view.getLocationOnScreen(iArr);
                                    motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                    dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                                    if (dispatchTouchEvent) {
                                        this.b = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.b;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.b = null;
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 8:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((qr1) this.b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((qpc) this.c).L);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 8:
                getViewTreeObserver().removeOnPreDrawListener((qr1) this.b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((qpc) this.c).L);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextView textView;
        float interpolation;
        float f;
        TextView textView2;
        float interpolation2;
        float f2;
        float f3 = 0.0f;
        Layout layout = null;
        switch (this.a) {
            case 2:
                int w0 = bkb.w0(null, bkb.c6, false);
                Paint paint = (Paint) this.c;
                if (paint.getColor() != w0) {
                    paint.setColor(w0);
                }
                canvas.drawPath((Path) this.b, paint);
                super.onDraw(canvas);
                return;
            case 3:
            case 4:
            default:
                super.onDraw(canvas);
                return;
            case 5:
                Paint paint2 = (Paint) this.b;
                super.onDraw(canvas);
                rw5 rw5Var = (rw5) this.c;
                TextView textView3 = (TextView) getChildAt(rw5Var.W0);
                int i = rw5Var.X0;
                if (i != -1) {
                    textView = (TextView) getChildAt(i);
                } else {
                    textView = null;
                }
                paint2.setColor(textView3.getCurrentTextColor());
                float y = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + gl.L(3.0f);
                Layout layout2 = textView3.getLayout();
                if (textView != null) {
                    layout = textView.getLayout();
                }
                if (layout == null) {
                    interpolation = 0.0f;
                } else {
                    interpolation = s33.f.getInterpolation(rw5Var.Y0);
                }
                float primaryHorizontal = layout2.getPrimaryHorizontal(layout2.getLineStart(0)) + textView3.getX();
                if (textView != null) {
                    f = layout.getPrimaryHorizontal(layout2.getLineStart(0)) + textView.getX();
                } else {
                    f = 0.0f;
                }
                float R1 = gl.R1(primaryHorizontal, f, interpolation);
                float primaryHorizontal2 = layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0));
                if (layout != null) {
                    f3 = layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0));
                }
                canvas.drawLine(R1, y, gl.R1(primaryHorizontal2, f3, interpolation) + R1, y, paint2);
                return;
            case 6:
                Paint paint3 = (Paint) this.b;
                super.onDraw(canvas);
                wt7 wt7Var = (wt7) this.c;
                TextView textView4 = (TextView) getChildAt(wt7Var.O0);
                int i2 = wt7Var.P0;
                if (i2 != -1) {
                    textView2 = (TextView) getChildAt(i2);
                } else {
                    textView2 = null;
                }
                paint3.setColor(textView4.getCurrentTextColor());
                float y2 = ((textView4.getY() + textView4.getHeight()) - textView4.getPaddingBottom()) + gl.L(3.0f);
                Layout layout3 = textView4.getLayout();
                if (layout3 != null) {
                    if (textView2 != null) {
                        layout = textView2.getLayout();
                    }
                    if (layout == null) {
                        interpolation2 = 0.0f;
                    } else {
                        interpolation2 = s33.f.getInterpolation(wt7Var.Q0);
                    }
                    float primaryHorizontal3 = layout3.getPrimaryHorizontal(layout3.getLineStart(0)) + textView4.getX();
                    if (layout != null) {
                        f2 = layout.getPrimaryHorizontal(layout3.getLineStart(0)) + textView2.getX();
                    } else {
                        f2 = 0.0f;
                    }
                    float R12 = gl.R1(primaryHorizontal3, f2, interpolation2);
                    float primaryHorizontal4 = layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0));
                    if (layout != null) {
                        f3 = layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0));
                    }
                    canvas.drawLine(R12, y2, gl.R1(primaryHorizontal4, f3, interpolation2) + R12, y2, paint3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.c;
                r7Var.b.measure(i, i2);
                rf8 swipeBack = r7Var.b.getSwipeBack();
                View view = (View) this.b;
                if (swipeBack != null) {
                    view.getLayoutParams().width = r7Var.b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = r7Var.b.getMeasuredWidth() - gl.L(16.0f);
                }
                super.onMeasure(i, i2);
                return;
            case 2:
                super.onMeasure(i, i2);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = gl.P;
                rectF.set(gl.L(12.0f), gl.L(6.0f), getMeasuredWidth() - gl.L(12.0f), getMeasuredHeight() - gl.L(12.0f));
                path.addRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), Path.Direction.CW);
                return;
            case 8:
                super.onMeasure(i, 0);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public f7(r7 r7Var, Context context, View view) {
        super(context);
        this.a = (byte) 0;
        this.c = r7Var;
        this.b = view;
    }

    public f7(qpc qpcVar, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = qpcVar;
        this.b = new qr1(this, (byte) 10);
    }

    public f7(jxb jxbVar, Context context) {
        super(context);
        this.a = (byte) 7;
        this.c = jxbVar;
        this.b = new lm(360L, this, s33.h);
    }

    public f7(Activity activity, lfc lfcVar) {
        super(activity);
        this.a = (byte) 3;
        this.b = new RectF();
        this.c = lfcVar;
        lfcVar.a(this);
    }

    public f7(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 4:
                super(context);
                this.c = new int[2];
                this.b = null;
                return;
            default:
                return;
        }
    }

    public f7(wt7 wt7Var, Context context) {
        super(context);
        this.a = (byte) 6;
        this.c = wt7Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public f7(Context context, tgb tgbVar, hn7 hn7Var) {
        super(context);
        this.a = (byte) 1;
        this.b = tgbVar;
        this.c = hn7Var;
    }
}
