package bi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class z8 extends View {
    public final TL_stars.StarGift f4343a;
    public final float f4344b;

    public z8(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f4343a = starGift;
        this.f4344b = f10;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f4343a == null) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * this.f4344b), 1073741824), i10);
        }
    }
}
