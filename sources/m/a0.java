package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
public final class a0 extends RatingBar {
    public final y f20044a;

    public a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968908);
        z2.a(this, getContext());
        y yVar = new y(this);
        this.f20044a = yVar;
        yVar.b(attributeSet, 2130968908);
    }

    @Override
    public final synchronized void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Bitmap bitmap = (Bitmap) this.f20044a.f20289c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }
}
