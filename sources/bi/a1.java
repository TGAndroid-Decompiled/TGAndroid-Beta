package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
public final class a1 extends View implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f2835a;
    public final Paint f2836b;
    public a f2837c;

    public a1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f2836b = new Paint();
        this.f2835a = p6Var;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tl));
    }

    public a getRow() {
        return this.f2837c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, org.telegram.messenger.i0.L(6.0f), getMeasuredWidth(), org.telegram.messenger.i0.L(6.0f) + 1, this.f2836b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(6.0f) + 1);
    }

    @Override
    public final void updateColors() {
        this.f2836b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tl, this.f2835a));
    }
}
