package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class rl2 extends tk4 {
    public static int W;
    public final byte V;

    public rl2(Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.V = b;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.V) {
            case 1:
            case 3:
                return 3;
            case 2:
            default:
                return super.getColumnsCount();
        }
    }

    @Override
    public final int getViewType() {
        switch (this.V) {
            case 3:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.V) {
            case 0:
                int i3 = 0;
                if (getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int i4 = 0;
                    while (i3 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i3);
                        if ((childAt instanceof ksc) && childAt.getMeasuredHeight() > 0) {
                            i4 = Math.max(i4, childAt.getMeasuredHeight());
                        }
                        i3++;
                    }
                    i3 = i4;
                }
                if (i3 <= 0) {
                    i3 = W;
                }
                if (i3 <= 0) {
                    super.onMeasure(i, i2);
                    return;
                } else {
                    setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
                    return;
                }
            case 1:
            default:
                super.onMeasure(i, i2);
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(104.0f));
                return;
        }
    }
}
