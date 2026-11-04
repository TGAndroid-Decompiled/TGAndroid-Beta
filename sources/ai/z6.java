package ai;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class z6 extends View {
    public final TL_stars.StarGift f1136a;
    public final float f1137b;

    public z6(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f1136a = starGift;
        this.f1137b = f10;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (this.f1136a == null) {
            super.onMeasure(i3, i10);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i3) * this.f1137b), 1073741824), i10);
        }
    }
}
