package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
public final class a0 extends RatingBar {
    public final y f15473a;

    public a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968908);
        a3.a(this, getContext());
        y yVar = new y(this);
        this.f15473a = yVar;
        yVar.b(attributeSet, 2130968908);
    }

    @Override
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = (Bitmap) this.f15473a.f15719c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
