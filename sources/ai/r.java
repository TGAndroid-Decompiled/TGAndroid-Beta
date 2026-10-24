package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ap0;
public class r extends LinearLayout {
    public static float f2098b = 1.0f;
    public final int f2099a;

    public r(Context context, int i10) {
        super(context);
        this.f2099a = i10;
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f2099a) {
            case 8:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        View childAt;
        boolean z10;
        boolean z11;
        switch (this.f2099a) {
            case 6:
                if (getParent() instanceof ap0) {
                    ap0 ap0Var = (ap0) getParent();
                    canvas.save();
                    LinearLayout linearLayout = ap0Var.f24773b;
                    Path path = ap0Var.f24776n;
                    if (view != null && ap0.e(view)) {
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
                        if (childAt != null && ap0.e(childAt)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (view2 != null && ap0.e(view2)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        RectF rectF = AndroidUtilities.rectTmp;
                        float x10 = view.getX();
                        float max = Math.max(ap0Var.getScrollY() - AndroidUtilities.dp(16.0f), view.getY() + linearLayout.getY());
                        float x11 = view.getX() + view.getWidth();
                        int height = ap0Var.getHeight();
                        rectF.set(x10, max, x11, Math.min(AndroidUtilities.dp(16.0f) + ap0Var.getScrollY() + height, view.getY() + linearLayout.getY() + view.getHeight()));
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
                            float f7 = ap0Var.f24774c;
                            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                            canvas.clipPath(path);
                        } else if (!z10) {
                            path.rewind();
                            path.addRoundRect(rectF, ap0Var.d, Path.Direction.CW);
                            canvas.clipPath(path);
                        } else if (!z11) {
                            path.rewind();
                            path.addRoundRect(rectF, ap0Var.e, Path.Direction.CW);
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
        switch (this.f2099a) {
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                setPivotX(getWidth());
                return;
            case 5:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                if (getParent() instanceof ap0) {
                    ((ap0) getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f2099a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
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
            case 6:
            case 7:
            case 8:
            default:
                super.onMeasure(i10, i11);
                return;
            case 5:
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
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(800.0f)), 1073741824));
                return;
        }
    }

    public r(Context context) {
        super(context);
        this.f2099a = 6;
        setWillNotDraw(false);
    }

    private final void a(boolean z10) {
    }
}
