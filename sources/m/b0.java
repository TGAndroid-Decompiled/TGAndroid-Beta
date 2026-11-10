package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
public final class b0 extends RatingBar {
    public final z f19075a;

    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968908);
        a3.a(this, getContext());
        z zVar = new z(this);
        this.f19075a = zVar;
        zVar.b(attributeSet, 2130968908);
    }

    @Override
    public final synchronized void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Bitmap bitmap = (Bitmap) this.f19075a.f19322c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }
}
