package bi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class v8 extends View {
    public final TL_stars.StarGift f4134a;
    public final float f4135b;

    public v8(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f4134a = starGift;
        this.f4135b = f10;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f4134a == null) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * this.f4135b), 1073741824), i10);
        }
    }
}
