package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
public final class c18 extends LinearLayout {
    public boolean a;
    public final int b;
    public final int[] c;
    public final int[] d;

    public c18(Context context, int i, int[] iArr, int[] iArr2) {
        super(context);
        this.b = i;
        this.c = iArr;
        this.d = iArr2;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        View childAt;
        int size = View.MeasureSpec.getSize(i);
        this.a = true;
        int L = gm.L(9.0f);
        int i3 = this.b;
        int i4 = i3 - 1;
        int i5 = L * i4;
        int[] iArr = this.c;
        int i6 = (iArr[0] * i3) + i5;
        float f = 1.0f;
        if (i6 <= size) {
            setWeightSum(1.0f);
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                getChildAt(i7).getLayoutParams().width = 0;
                ((LinearLayout.LayoutParams) getChildAt(i7).getLayoutParams()).weight = 1.0f / childCount;
            }
        } else if (this.d[0] + i5 <= size) {
            setWeightSum(1.0f);
            int i8 = size - i5;
            int childCount2 = getChildCount();
            for (int i9 = 0; i9 < childCount2; i9++) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i9).getLayoutParams();
                layoutParams.width = 0;
                float intValue = ((Integer) childAt.getTag(2131296741)).intValue() / i8;
                layoutParams.weight = intValue;
                f -= intValue;
            }
            float f2 = f / i4;
            if (f2 > 0.0f) {
                int childCount3 = getChildCount();
                for (int i10 = 0; i10 < childCount3; i10++) {
                    View childAt2 = getChildAt(i10);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    if (((Integer) childAt2.getTag(2131296741)).intValue() != iArr[0]) {
                        layoutParams2.weight += f2;
                    }
                }
            }
        } else {
            setWeightSum(0.0f);
            int childCount4 = getChildCount();
            for (int i11 = 0; i11 < childCount4; i11++) {
                getChildAt(i11).getLayoutParams().width = -2;
                ((LinearLayout.LayoutParams) getChildAt(i11).getLayoutParams()).weight = 0.0f;
            }
        }
        this.a = false;
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
