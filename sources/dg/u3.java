package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eo0;
public class u3 extends LinearLayout {
    public static float f4812b = 1.0f;
    public final int f4813a;

    public u3(Context context, int i10) {
        super(context);
        this.f4813a = i10;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        View childAt;
        boolean z4;
        boolean z10;
        switch (this.f4813a) {
            case 7:
                if (getParent() instanceof eo0) {
                    eo0 eo0Var = (eo0) getParent();
                    canvas.save();
                    LinearLayout linearLayout = eo0Var.f24621b;
                    Path path = eo0Var.f24624n;
                    if (view != null && eo0.e(view)) {
                        int indexOfChild = linearLayout.indexOfChild(view);
                        int i10 = indexOfChild - 1;
                        View view2 = null;
                        if (i10 < 0) {
                            childAt = null;
                        } else {
                            childAt = linearLayout.getChildAt(i10);
                        }
                        boolean z11 = true;
                        int i11 = indexOfChild + 1;
                        if (i11 < linearLayout.getChildCount()) {
                            view2 = linearLayout.getChildAt(i11);
                        }
                        if (childAt != null && eo0.e(childAt)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (view2 != null && eo0.e(view2)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        RectF rectF = AndroidUtilities.rectTmp;
                        float x10 = view.getX();
                        float max = Math.max(eo0Var.getScrollY() - AndroidUtilities.dp(16.0f), view.getY() + linearLayout.getY());
                        float x11 = view.getX() + view.getWidth();
                        int height = eo0Var.getHeight();
                        rectF.set(x10, max, x11, Math.min(AndroidUtilities.dp(16.0f) + eo0Var.getScrollY() + height, view.getY() + linearLayout.getY() + view.getHeight()));
                        if (z4 && z10) {
                            if (view.getY() >= rectF.top) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (view.getY() + view.getHeight() > rectF.bottom) {
                                z11 = false;
                            }
                            if (!z4 || !z11) {
                                z10 = z11;
                            }
                        }
                        if (!z4 && !z10) {
                            path.rewind();
                            float f10 = eo0Var.f24622c;
                            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                            canvas.clipPath(path);
                        } else if (!z4) {
                            path.rewind();
                            path.addRoundRect(rectF, eo0Var.d, Path.Direction.CW);
                            canvas.clipPath(path);
                        } else if (!z10) {
                            path.rewind();
                            path.addRoundRect(rectF, eo0Var.e, Path.Direction.CW);
                            canvas.clipPath(path);
                        }
                    }
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f4813a) {
            case 5:
                super.onLayout(z4, i10, i11, i12, i13);
                setPivotX(getWidth());
                return;
            case 6:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z4, i10, i11, i12, i13);
                if (getParent() instanceof eo0) {
                    ((eo0) getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f4813a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(800.0f)), 1073741824));
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 5:
            case 7:
            case 8:
            default:
                super.onMeasure(i10, i11);
                return;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), i11);
                return;
            case 9:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(0.0f);
                return;
            case 10:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                return;
        }
    }

    public u3(Context context) {
        super(context);
        this.f4813a = 7;
        setWillNotDraw(false);
    }
}
