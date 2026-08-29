package ih;

import android.content.Context;
import android.view.View;
public final class l0 extends View {
    public final float f9270a;

    public l0(Context context, float f9) {
        super(context);
        this.f9270a = f9;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f9270a), 1073741824), i11);
    }
}
