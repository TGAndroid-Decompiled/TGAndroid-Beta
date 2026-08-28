package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.in0;
public class m extends LinearLayout {
    public static float f8529b = 1.0f;
    public final int f8530a;

    public m(Context context, int i9) {
        super(context);
        this.f8530a = i9;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        View childAt;
        boolean z10;
        boolean z11;
        switch (this.f8530a) {
            case 6:
                if (getParent() instanceof in0) {
                    in0 in0Var = (in0) getParent();
                    canvas.save();
                    LinearLayout linearLayout = in0Var.f29481b;
                    Path path = in0Var.f29485n;
                    if (view != null && in0.e(view)) {
                        int indexOfChild = linearLayout.indexOfChild(view);
                        int i9 = indexOfChild - 1;
                        View view2 = null;
                        if (i9 < 0) {
                            childAt = null;
                        } else {
                            childAt = linearLayout.getChildAt(i9);
                        }
                        boolean z12 = true;
                        int i10 = indexOfChild + 1;
                        if (i10 < linearLayout.getChildCount()) {
                            view2 = linearLayout.getChildAt(i10);
                        }
                        if (childAt != null && in0.e(childAt)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (view2 != null && in0.e(view2)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        RectF rectF = AndroidUtilities.rectTmp;
                        float x10 = view.getX();
                        float max = Math.max(in0Var.getScrollY() - AndroidUtilities.dp(16.0f), view.getY() + linearLayout.getY());
                        float x11 = view.getX() + view.getWidth();
                        int height = in0Var.getHeight();
                        rectF.set(x10, max, x11, Math.min(AndroidUtilities.dp(16.0f) + in0Var.getScrollY() + height, view.getY() + linearLayout.getY() + view.getHeight()));
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
                            float f10 = in0Var.f29482c;
                            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                            canvas.clipPath(path);
                        } else if (!z10) {
                            path.rewind();
                            path.addRoundRect(rectF, in0Var.d, Path.Direction.CW);
                            canvas.clipPath(path);
                        } else if (!z11) {
                            path.rewind();
                            path.addRoundRect(rectF, in0Var.f29483e, Path.Direction.CW);
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
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f8530a) {
            case 4:
                super.onLayout(z10, i9, i10, i11, i12);
                setPivotX(getWidth());
                return;
            case 5:
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
            case 6:
                super.onLayout(z10, i9, i10, i11, i12);
                if (getParent() instanceof in0) {
                    ((in0) getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f8530a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
                return;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
                return;
            case 4:
            case 6:
            case 7:
            default:
                super.onMeasure(i9, i10);
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i9)), View.MeasureSpec.getMode(i9)), i10);
                return;
            case 8:
                super.onMeasure(i9, i10);
                setPivotY(0.0f);
                setPivotX(0.0f);
                return;
            case 9:
                super.onMeasure(i9, i10);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(800.0f)), 1073741824));
                return;
        }
    }

    public m(Context context) {
        super(context);
        this.f8530a = 6;
        setWillNotDraw(false);
    }
}
