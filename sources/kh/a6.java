package kh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class a6 extends View {
    public final TL_stars.StarGift f10598a;
    public final float f10599b;

    public a6(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f10598a = starGift;
        this.f10599b = f10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f10598a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f10599b), 1073741824), i11);
        }
    }
}
