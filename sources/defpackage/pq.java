package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
public final class pq extends RatingBar {
    public final hi2 a;

    public pq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968908);
        dpb.a(getContext(), this);
        hi2 hi2Var = new hi2(this);
        this.a = hi2Var;
        hi2Var.E(attributeSet, 2130968908);
    }

    @Override
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.a.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
