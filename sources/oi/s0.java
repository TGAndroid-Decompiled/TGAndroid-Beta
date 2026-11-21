package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class s0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final h6 f22362a;
    public final Paint f22363b;
    public a f22364c;

    public s0(Context context, h6 h6Var) {
        super(context);
        this.f22363b = new Paint();
        this.f22362a = h6Var;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.wl));
    }

    public a getRow() {
        return this.f22364c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, org.telegram.messenger.g0.L(6.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f) + 1, this.f22363b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(6.0f) + 1);
    }

    @Override
    public final void updateColors() {
        this.f22363b.setColor(m6.w0(m6.wl, this.f22362a));
    }
}
