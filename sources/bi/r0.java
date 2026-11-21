package bi;

import android.content.Context;
import android.view.View;
public final class r0 extends View {
    public final float f4043a;

    public r0(Context context, float f10) {
        super(context);
        this.f4043a = f10;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * this.f4043a), 1073741824), i10);
    }
}
