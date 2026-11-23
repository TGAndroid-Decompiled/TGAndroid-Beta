package hi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.vz;
public final class z2 extends vz {
    public static int W;
    public final int V;

    public z2(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.V = i7;
    }

    @Override
    public int getColumnsCount() {
        switch (this.V) {
            case 0:
                return 3;
            case 1:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override
    public int getViewType() {
        switch (this.V) {
            case 1:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.V) {
            case 2:
                int i11 = 0;
                if (getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int i12 = 0;
                    while (i11 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Wallet.f8) && childAt.getMeasuredHeight() > 0) {
                            i12 = Math.max(i12, childAt.getMeasuredHeight());
                        }
                        i11++;
                    }
                    i11 = i12;
                }
                if (i11 <= 0) {
                    i11 = W;
                }
                if (i11 <= 0) {
                    super.onMeasure(i7, i10);
                    return;
                } else {
                    setMeasuredDimension(View.MeasureSpec.getSize(i7), i11);
                    return;
                }
            case 3:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(104.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
