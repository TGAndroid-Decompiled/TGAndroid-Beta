package kh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class b6 extends View {
    public final TL_stars.StarGift f10500a;
    public final float f10501b;

    public b6(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f10500a = starGift;
        this.f10501b = f10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f10500a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f10501b), 1073741824), i11);
        }
    }
}
