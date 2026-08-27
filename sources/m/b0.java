package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public final class b0 extends RatingBar {

    public final z f17275a;

    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968908);
        d3.a(this, getContext());
        z zVar = new z(this);
        this.f17275a = zVar;
        zVar.b(attributeSet, 2130968908);
    }

    @Override
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = (Bitmap) this.f17275a.f17532c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
