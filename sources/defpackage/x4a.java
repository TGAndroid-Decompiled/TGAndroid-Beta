package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class x4a extends View {
    public final TL_stars.StarGift a;
    public final float b;

    public x4a(Context context, TL_stars.StarGift starGift, float f) {
        super(context);
        this.a = starGift;
        this.b = f;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.a == null) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.b), 1073741824), i2);
        }
    }
}
