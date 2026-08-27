package gh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

public final class j6 extends View {

    public final TL_stars.StarGift f7367a;

    public final float f7368b;

    public j6(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f7367a = starGift;
        this.f7368b = f10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f7367a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f7368b), 1073741824), i11);
        }
    }
}
