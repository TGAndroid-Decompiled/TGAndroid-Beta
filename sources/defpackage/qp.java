package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
public final class qp extends RatingBar {
    public final lh2 a;

    public qp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968908);
        brb.a(getContext(), this);
        lh2 lh2Var = new lh2(this, (byte) 1);
        this.a = lh2Var;
        lh2Var.z(attributeSet, 2130968908);
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
