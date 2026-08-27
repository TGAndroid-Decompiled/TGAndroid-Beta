package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kn0;

public class m extends LinearLayout {

    public static float f9702b = 1.0f;

    public final int f9703a;

    public m(Context context, int i10) {
        super(context);
        this.f9703a = i10;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f9703a) {
            case 6:
                if (!(getParent() instanceof kn0)) {
                    return super.drawChild(canvas, view, j10);
                }
                kn0 kn0Var = (kn0) getParent();
                canvas.save();
                LinearLayout linearLayout = kn0Var.f30154b;
                Path path = kn0Var.f30158n;
                if (view != null && kn0.e(view)) {
                    int iIndexOfChild = linearLayout.indexOfChild(view);
                    int i10 = iIndexOfChild - 1;
                    View childAt = i10 < 0 ? null : linearLayout.getChildAt(i10);
                    int i11 = iIndexOfChild + 1;
                    View childAt2 = i11 < linearLayout.getChildCount() ? linearLayout.getChildAt(i11) : null;
                    boolean z10 = childAt != null && kn0.e(childAt);
                    boolean z11 = childAt2 != null && kn0.e(childAt2);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), Math.max(kn0Var.getScrollY() - AndroidUtilities.dp(16.0f), view.getY() + linearLayout.getY()), view.getX() + view.getWidth(), Math.min(AndroidUtilities.dp(16.0f) + kn0Var.getScrollY() + kn0Var.getHeight(), view.getY() + linearLayout.getY() + view.getHeight()));
                    if (z10 && z11) {
                        z10 = view.getY() >= rectF.top;
                        boolean z12 = view.getY() + ((float) view.getHeight()) <= rectF.bottom;
                        if (!z10 || !z12) {
                            z11 = z12;
                            if (!z10) {
                                if (!z10) {
                                    path.rewind();
                                    path.addRoundRect(rectF, kn0Var.d, Path.Direction.CW);
                                    canvas.clipPath(path);
                                } else if (!z11) {
                                    path.rewind();
                                    path.addRoundRect(rectF, kn0Var.f30156e, Path.Direction.CW);
                                    canvas.clipPath(path);
                                }
                            } else if (!z10) {
                                path.rewind();
                                path.addRoundRect(rectF, kn0Var.d, Path.Direction.CW);
                                canvas.clipPath(path);
                            } else if (!z11) {
                                path.rewind();
                                path.addRoundRect(rectF, kn0Var.f30156e, Path.Direction.CW);
                                canvas.clipPath(path);
                            }
                        }
                    } else if (!z10 && !z11) {
                        path.rewind();
                        float f10 = kn0Var.f30155c;
                        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z10) {
                        path.rewind();
                        path.addRoundRect(rectF, kn0Var.d, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z11) {
                        path.rewind();
                        path.addRoundRect(rectF, kn0Var.f30156e, Path.Direction.CW);
                        canvas.clipPath(path);
                    }
                }
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f9703a) {
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                setPivotX(getWidth());
                break;
            case 5:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                if (getParent() instanceof kn0) {
                    ((kn0) getParent()).invalidate();
                }
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9703a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                break;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                break;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                break;
            case 4:
            case 6:
            case 7:
            default:
                super.onMeasure(i10, i11);
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), i11);
                break;
            case 8:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(0.0f);
                break;
            case 9:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(800.0f)), 1073741824));
                break;
        }
    }

    public m(Context context) {
        super(context);
        this.f9703a = 6;
        setWillNotDraw(false);
    }
}
