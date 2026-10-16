package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
public final class c0 extends RatingBar {
    public final a0 f14805a;

    public c0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968908);
        d3.a(this, getContext());
        a0 a0Var = new a0(this);
        this.f14805a = a0Var;
        a0Var.b(attributeSet, 2130968908);
    }

    @Override
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = (Bitmap) this.f14805a.f14789c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
