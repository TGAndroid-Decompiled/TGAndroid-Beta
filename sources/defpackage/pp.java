package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
public final class pp extends RatingBar {
    public final tg2 a;

    public pp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968908);
        cnb.a(getContext(), this);
        tg2 tg2Var = new tg2(this, (byte) 1);
        this.a = tg2Var;
        tg2Var.M(attributeSet, 2130968908);
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
