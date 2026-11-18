package bi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class w8 extends View {
    public final TL_stars.StarGift f4192a;
    public final float f4193b;

    public w8(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f4192a = starGift;
        this.f4193b = f10;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f4192a == null) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * this.f4193b), 1073741824), i10);
        }
    }
}
