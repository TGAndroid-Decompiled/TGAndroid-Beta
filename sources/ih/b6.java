package ih;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class b6 extends View {
    public final TL_stars.StarGift f9062a;
    public final float f9063b;

    public b6(Context context, TL_stars.StarGift starGift, float f9) {
        super(context);
        this.f9062a = starGift;
        this.f9063b = f9;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f9062a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f9063b), 1073741824), i11);
        }
    }
}
