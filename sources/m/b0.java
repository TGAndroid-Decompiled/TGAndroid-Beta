package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
public final class b0 extends RatingBar {
    public final z f16900a;

    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968908);
        d3.a(this, getContext());
        z zVar = new z(this);
        this.f16900a = zVar;
        zVar.b(attributeSet, 2130968908);
    }

    @Override
    public final synchronized void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        Bitmap bitmap = (Bitmap) this.f16900a.f17157c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i9, 0), getMeasuredHeight());
        }
    }
}
