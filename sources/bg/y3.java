package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.un0;
public class y3 extends LinearLayout {
    public static float f2630b = 1.0f;
    public final int f2631a;

    public y3(Context context, int i10) {
        super(context);
        this.f2631a = i10;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        View childAt;
        boolean z10;
        boolean z11;
        switch (this.f2631a) {
            case 7:
                if (getParent() instanceof un0) {
                    un0 un0Var = (un0) getParent();
                    canvas.save();
                    LinearLayout linearLayout = un0Var.f33278b;
                    Path path = un0Var.f33282n;
                    if (view != null && un0.e(view)) {
                        int indexOfChild = linearLayout.indexOfChild(view);
                        int i10 = indexOfChild - 1;
                        View view2 = null;
                        if (i10 < 0) {
                            childAt = null;
                        } else {
                            childAt = linearLayout.getChildAt(i10);
                        }
                        boolean z12 = true;
                        int i11 = indexOfChild + 1;
                        if (i11 < linearLayout.getChildCount()) {
                            view2 = linearLayout.getChildAt(i11);
                        }
                        if (childAt != null && un0.e(childAt)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (view2 != null && un0.e(view2)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        RectF rectF = AndroidUtilities.rectTmp;
                        float x4 = view.getX();
                        float max = Math.max(un0Var.getScrollY() - AndroidUtilities.dp(16.0f), view.getY() + linearLayout.getY());
                        float x10 = view.getX() + view.getWidth();
                        int height = un0Var.getHeight();
                        rectF.set(x4, max, x10, Math.min(AndroidUtilities.dp(16.0f) + un0Var.getScrollY() + height, view.getY() + linearLayout.getY() + view.getHeight()));
                        if (z10 && z11) {
                            if (view.getY() >= rectF.top) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (view.getY() + view.getHeight() > rectF.bottom) {
                                z12 = false;
                            }
                            if (!z10 || !z12) {
                                z11 = z12;
                            }
                        }
                        if (!z10 && !z11) {
                            path.rewind();
                            float f9 = un0Var.f33279c;
                            path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
                            canvas.clipPath(path);
                        } else if (!z10) {
                            path.rewind();
                            path.addRoundRect(rectF, un0Var.d, Path.Direction.CW);
                            canvas.clipPath(path);
                        } else if (!z11) {
                            path.rewind();
                            path.addRoundRect(rectF, un0Var.f33280e, Path.Direction.CW);
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f2631a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                setPivotX(getWidth());
                return;
            case 6:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                if (getParent() instanceof un0) {
                    ((un0) getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f2631a) {
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

    public y3(Context context) {
        super(context);
        this.f2631a = 7;
        setWillNotDraw(false);
    }
}
