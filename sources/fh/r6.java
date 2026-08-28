package fh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class r6 extends View {
    public final TL_stars.StarGift f6744a;
    public final float f6745b;

    public r6(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f6744a = starGift;
        this.f6745b = f10;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (this.f6744a == null) {
            super.onMeasure(i9, i10);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i9) * this.f6745b), 1073741824), i10);
        }
    }
}
