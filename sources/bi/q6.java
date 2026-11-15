package bi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class q6 extends View {
    public final TL_stars.StarGift f3810a;
    public final float f3811b;

    public q6(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f3810a = starGift;
        this.f3811b = f10;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f3810a == null) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * this.f3811b), 1073741824), i10);
        }
    }
}
