package bi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r extends LinearLayout {
    public static float f5310b = 1.0f;
    public final int f5311a;

    public r(Context context, int i10) {
        super(context);
        this.f5311a = i10;
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f5311a) {
            case 7:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f5311a) {
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                setPivotX(getWidth());
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5311a) {
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
            default:
                super.onMeasure(i10, i11);
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), i11);
                return;
            case 8:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(0.0f);
                return;
            case 9:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(800.0f)), 1073741824));
                return;
        }
    }

    private final void a(boolean z10) {
    }
}
