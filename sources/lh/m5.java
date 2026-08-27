package lh;

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
import org.telegram.ui.Components.c21;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.pz0;

public final class m5 extends LinearLayout {

    public final int f16382a;

    public Object f16383b;

    public Object f16384c;

    public m5(Context context, Object obj, LinearLayout linearLayout, int i10) {
        super(context);
        this.f16382a = i10;
        this.f16383b = obj;
        this.f16384c = linearLayout;
    }

    public static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view.getParent() == null) {
            return false;
        }
        if (view.getParent() instanceof View) {
            return a((View) view.getParent(), view2);
        }
        return view.getParent() == view2 || view.getRootView() == view2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f16382a) {
            case 4:
                super.dispatchDraw(canvas);
                ((pz0) this.f16383b).e(canvas, ((fc0) this.f16384c).getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
                break;
            case 5:
                canvas.save();
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) this.f16383b;
                c21 c21Var = (c21) this.f16384c;
                float fE = y5Var.e(c21Var.f27309w);
                if (fE > 0.0f) {
                    if (c21Var.f27303c == null) {
                        c21Var.f27303c = new io0(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    c21Var.f27303c.a(canvas, fE);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 6:
                RectF rectF = (RectF) this.f16383b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.f16384c;
                n1Var.d(getX(), getY());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), n1Var.b());
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f16382a) {
            case 2:
                int[] iArr = (int[]) this.f16383b;
                boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (!zDispatchTouchEvent) {
                    getLocationOnScreen(iArr);
                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        List<View> listAllGlobalViews = AndroidUtilities.allGlobalViews();
                        if (listAllGlobalViews != null && listAllGlobalViews.size() > 1) {
                            for (int size = listAllGlobalViews.size() - 2; size >= 0; size--) {
                                View view = listAllGlobalViews.get(size);
                                if (!a(this, view)) {
                                    view.getLocationOnScreen(iArr);
                                    motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                    zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                                    if (zDispatchTouchEvent) {
                                        this.f16384c = view;
                                        return true;
                                    }
                                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = (View) this.f16384c;
                        if (view2 != null) {
                            view2.getLocationOnScreen(iArr);
                            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                            zDispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f16384c = null;
                }
                return zDispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f16382a) {
            case 0:
                Paint paint = (Paint) this.f16383b;
                super.onDraw(canvas);
                f6 f6Var = (f6) this.f16384c;
                TextView textView = (TextView) getChildAt(f6Var.U0);
                int i10 = f6Var.V0;
                TextView textView2 = i10 != -1 ? (TextView) getChildAt(i10) : null;
                paint.setColor(textView.getCurrentTextColor());
                float y10 = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout = textView.getLayout();
                if (layout != null) {
                    Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                    float interpolation = layout2 == null ? 0.0f : er.f28122f.getInterpolation(f6Var.W0);
                    float fLerp = AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineStart(0)) + textView.getX(), layout2 != null ? layout2.getPrimaryHorizontal(layout.getLineStart(0)) + textView2.getX() : 0.0f, interpolation);
                    canvas.drawLine(fLerp, y10, AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)) : 0.0f, interpolation) + fLerp, y10, paint);
                    break;
                }
                break;
            case 3:
                canvas.drawPath((Path) this.f16384c, (Paint) this.f16383b);
                super.onDraw(canvas);
                break;
            case 8:
                Paint paint2 = (Paint) this.f16383b;
                super.onDraw(canvas);
                zf.l0 l0Var = (zf.l0) this.f16384c;
                TextView textView3 = (TextView) getChildAt(l0Var.f50508c1);
                int i11 = l0Var.f50510d1;
                TextView textView4 = i11 != -1 ? (TextView) getChildAt(i11) : null;
                paint2.setColor(textView3.getCurrentTextColor());
                float y11 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout3 = textView3.getLayout();
                Layout layout4 = textView4 != null ? textView4.getLayout() : null;
                float interpolation2 = layout4 == null ? 0.0f : er.f28122f.getInterpolation(l0Var.f50512e1);
                float fLerp2 = AndroidUtilities.lerp(layout3.getPrimaryHorizontal(layout3.getLineStart(0)) + textView3.getX(), textView4 != null ? layout4.getPrimaryHorizontal(layout3.getLineStart(0)) + textView4.getX() : 0.0f, interpolation2);
                canvas.drawLine(fLerp2, y11, AndroidUtilities.lerp(layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0)), layout4 != null ? layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0)) : 0.0f, interpolation2) + fLerp2, y11, paint2);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f16382a) {
            case 1:
                View view = (View) this.f16383b;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f16384c;
                v0Var.f23854b.measure(i10, i11);
                if (v0Var.f23854b.getSwipeBack() != null) {
                    view.getLayoutParams().width = v0Var.f23854b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    view.getLayoutParams().width = v0Var.f23854b.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                }
                super.onMeasure(i10, i11);
                break;
            case 3:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f16384c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            case 7:
                int size = View.MeasureSpec.getSize(i10);
                LinearLayout linearLayout = (LinearLayout) this.f16383b;
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout linearLayout2 = (LinearLayout) this.f16384c;
                if (linearLayout2 == null) {
                    setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
                } else {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredHeight() + linearLayout.getMeasuredHeight());
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    public m5(Activity activity, org.telegram.ui.Components.voip.n1 n1Var) {
        super(activity);
        this.f16382a = 6;
        this.f16383b = new RectF();
        this.f16384c = n1Var;
        n1Var.a(this);
    }

    public m5(org.telegram.ui.ActionBar.v0 v0Var, Context context, View view) {
        super(context);
        this.f16382a = 1;
        this.f16384c = v0Var;
        this.f16383b = view;
    }

    public m5(c21 c21Var, Context context) {
        super(context);
        this.f16382a = 5;
        this.f16384c = c21Var;
        this.f16383b = new org.telegram.ui.Components.y5(this, 360L, er.h);
    }

    public m5(zf.l0 l0Var, Context context) {
        super(context);
        this.f16382a = 8;
        this.f16384c = l0Var;
        Paint paint = new Paint(1);
        this.f16383b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public m5(Context context, int i10) {
        super(context);
        this.f16382a = i10;
        switch (i10) {
            case 3:
                super(context);
                break;
            default:
                this.f16383b = new int[2];
                this.f16384c = null;
                break;
        }
    }

    public m5(f6 f6Var, Context context) {
        super(context);
        this.f16382a = 0;
        this.f16384c = f6Var;
        Paint paint = new Paint(1);
        this.f16383b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }
}
