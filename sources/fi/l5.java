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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.r11;
public final class l5 extends LinearLayout {
    public final int f11169a;
    public Object f11170b;
    public Object f11171c;

    public l5(Context context, Object obj, LinearLayout linearLayout, int i10) {
        super(context);
        this.f11169a = i10;
        this.f11170b = obj;
        this.f11171c = linearLayout;
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
        switch (this.f11169a) {
            case 4:
                super.dispatchDraw(canvas);
                ((r11) this.f11170b).e(canvas, ((nd0) this.f11171c).getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
                return;
            case 5:
                canvas.save();
                e41 e41Var = (e41) this.f11171c;
                float e = ((org.telegram.ui.Components.h6) this.f11170b).e(e41Var.f27711x);
                if (e > 0.0f) {
                    if (e41Var.f27705c == null) {
                        e41Var.f27705c = new fq0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    e41Var.f27705c.a(canvas, e);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 6:
                RectF rectF = (RectF) this.f11170b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f11171c;
                r1Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), r1Var.b());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f11169a) {
            case 2:
                int[] iArr = (int[]) this.f11170b;
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
                                        this.f11171c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f11171c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f11171c = null;
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f11169a) {
            case 8:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.x4) this.f11170b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((org.telegram.ui.Wallet.i9) this.f11171c).K);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f11169a) {
            case 8:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.x4) this.f11170b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((org.telegram.ui.Wallet.i9) this.f11171c).K);
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
        switch (this.f11169a) {
            case 0:
                Paint paint = (Paint) this.f11170b;
                super.onDraw(canvas);
                e6 e6Var = (e6) this.f11171c;
                TextView textView3 = (TextView) getChildAt(e6Var.N0);
                int i10 = e6Var.O0;
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
                        interpolation = ds.f27530f.getInterpolation(e6Var.P0);
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
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false);
                Paint paint2 = (Paint) this.f11170b;
                if (paint2.getColor() != x02) {
                    paint2.setColor(x02);
                }
                canvas.drawPath((Path) this.f11171c, paint2);
                super.onDraw(canvas);
                return;
            case 9:
                Paint paint3 = (Paint) this.f11170b;
                super.onDraw(canvas);
                sg.m0 m0Var = (sg.m0) this.f11171c;
                TextView textView4 = (TextView) getChildAt(m0Var.V0);
                int i11 = m0Var.W0;
                Layout layout3 = null;
                if (i11 != -1) {
                    textView2 = (TextView) getChildAt(i11);
                } else {
                    textView2 = null;
                }
                paint3.setColor(textView4.getCurrentTextColor());
                float y10 = ((textView4.getY() + textView4.getHeight()) - textView4.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout4 = textView4.getLayout();
                if (textView2 != null) {
                    layout3 = textView2.getLayout();
                }
                float f12 = 0.0f;
                if (layout3 == null) {
                    interpolation2 = 0.0f;
                } else {
                    interpolation2 = ds.f27530f.getInterpolation(m0Var.X0);
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
                canvas.drawLine(lerp2, y10, AndroidUtilities.lerp(primaryHorizontal4, f12, interpolation2) + lerp2, y10, paint3);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f11169a) {
            case 1:
                View view = (View) this.f11170b;
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f11171c;
                w0Var.f23177b.measure(i10, i11);
                if (w0Var.f23177b.getSwipeBack() != null) {
                    view.getLayoutParams().width = w0Var.f23177b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = w0Var.f23177b.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                }
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f11171c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 7:
                int size = View.MeasureSpec.getSize(i10);
                LinearLayout linearLayout = (LinearLayout) this.f11170b;
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout linearLayout2 = (LinearLayout) this.f11171c;
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

    public l5(Activity activity, org.telegram.ui.Components.voip.r1 r1Var) {
        super(activity);
        this.f11169a = 6;
        this.f11170b = new RectF();
        this.f11171c = r1Var;
        r1Var.a(this);
    }

    public l5(org.telegram.ui.ActionBar.w0 w0Var, Context context, View view) {
        super(context);
        this.f11169a = 1;
        this.f11171c = w0Var;
        this.f11170b = view;
    }

    public l5(org.telegram.ui.Wallet.i9 i9Var, Context context) {
        super(context);
        this.f11169a = 8;
        this.f11171c = i9Var;
        this.f11170b = new org.telegram.ui.Wallet.x4(3, this);
    }

    public l5(e41 e41Var, Context context) {
        super(context);
        this.f11169a = 5;
        this.f11171c = e41Var;
        this.f11170b = new org.telegram.ui.Components.h6(this, 360L, ds.h);
    }

    public l5(sg.m0 m0Var, Context context) {
        super(context);
        this.f11169a = 9;
        this.f11171c = m0Var;
        Paint paint = new Paint(1);
        this.f11170b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public l5(Context context, int i10) {
        super(context);
        this.f11169a = i10;
        switch (i10) {
            case 3:
                super(context);
                return;
            default:
                this.f11170b = new int[2];
                this.f11171c = null;
                return;
        }
    }

    public l5(e6 e6Var, Context context) {
        super(context);
        this.f11169a = 0;
        this.f11171c = e6Var;
        Paint paint = new Paint(1);
        this.f11170b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }
}
