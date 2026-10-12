package di;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.zp0;
public final class v5 extends LinearLayout {
    public final int f7999a;
    public Object f8000b;
    public Object f8001c;

    public v5(Context context, Object obj, LinearLayout linearLayout, int i10) {
        super(context);
        this.f7999a = i10;
        this.f8000b = obj;
        this.f8001c = linearLayout;
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
        switch (this.f7999a) {
            case 4:
                super.dispatchDraw(canvas);
                ((h11) this.f8000b).e(canvas, ((ud0) this.f8001c).getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
                return;
            case 5:
                canvas.save();
                x31 x31Var = (x31) this.f8001c;
                float e = ((org.telegram.ui.Components.g6) this.f8000b).e(x31Var.f31155w);
                if (e > 0.0f) {
                    if (x31Var.f31150c == null) {
                        x31Var.f31150c = new zp0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    x31Var.f31150c.a(canvas, e);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 6:
                RectF rectF = (RectF) this.f8000b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f8001c;
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
        switch (this.f7999a) {
            case 2:
                int[] iArr = (int[]) this.f8000b;
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
                                        this.f8001c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f8001c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f8001c = null;
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f7999a) {
            case 8:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.l4) this.f8000b);
                getViewTreeObserver().addOnWindowFocusChangeListener(((org.telegram.ui.Wallet.i8) this.f8001c).H);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f7999a) {
            case 8:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.l4) this.f8000b);
                getViewTreeObserver().removeOnWindowFocusChangeListener(((org.telegram.ui.Wallet.i8) this.f8001c).H);
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
        switch (this.f7999a) {
            case 0:
                Paint paint = (Paint) this.f8000b;
                super.onDraw(canvas);
                o6 o6Var = (o6) this.f8001c;
                TextView textView3 = (TextView) getChildAt(o6Var.Y0);
                int i10 = o6Var.Z0;
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
                        interpolation = es.f24771f.getInterpolation(o6Var.f7512a1);
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
                canvas.drawPath((Path) this.f8001c, (Paint) this.f8000b);
                super.onDraw(canvas);
                return;
            case 9:
                Paint paint2 = (Paint) this.f8000b;
                super.onDraw(canvas);
                rg.o0 o0Var = (rg.o0) this.f8001c;
                TextView textView4 = (TextView) getChildAt(o0Var.f44411g1);
                int i11 = o0Var.f44413h1;
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
                    interpolation2 = es.f24771f.getInterpolation(o0Var.f44415i1);
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
        switch (this.f7999a) {
            case 1:
                View view = (View) this.f8000b;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f8001c;
                u0Var.f20675b.measure(i10, i11);
                if (u0Var.f20675b.getSwipeBack() != null) {
                    view.getLayoutParams().width = u0Var.f20675b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = u0Var.f20675b.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                }
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f8001c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 7:
                int size = View.MeasureSpec.getSize(i10);
                LinearLayout linearLayout = (LinearLayout) this.f8000b;
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout linearLayout2 = (LinearLayout) this.f8001c;
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

    public v5(Activity activity, org.telegram.ui.Components.voip.o1 o1Var) {
        super(activity);
        this.f7999a = 6;
        this.f8000b = new RectF();
        this.f8001c = o1Var;
        o1Var.a(this);
    }

    public v5(org.telegram.ui.ActionBar.u0 u0Var, Context context, View view) {
        super(context);
        this.f7999a = 1;
        this.f8001c = u0Var;
        this.f8000b = view;
    }

    public v5(org.telegram.ui.Wallet.i8 i8Var, Context context) {
        super(context);
        this.f7999a = 8;
        this.f8001c = i8Var;
        this.f8000b = new org.telegram.ui.Wallet.l4(this, 2);
    }

    public v5(x31 x31Var, Context context) {
        super(context);
        this.f7999a = 5;
        this.f8001c = x31Var;
        this.f8000b = new org.telegram.ui.Components.g6(this, 360L, es.h);
    }

    public v5(rg.o0 o0Var, Context context) {
        super(context);
        this.f7999a = 9;
        this.f8001c = o0Var;
        Paint paint = new Paint(1);
        this.f8000b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public v5(Context context, int i10) {
        super(context);
        this.f7999a = i10;
        switch (i10) {
            case 3:
                super(context);
                return;
            default:
                this.f8000b = new int[2];
                this.f8001c = null;
                return;
        }
    }

    public v5(o6 o6Var, Context context) {
        super(context);
        this.f7999a = 0;
        this.f8001c = o6Var;
        Paint paint = new Paint(1);
        this.f8000b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }
}
