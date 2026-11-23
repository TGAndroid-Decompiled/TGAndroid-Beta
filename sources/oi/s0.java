package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class s0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final i6 f22433a;
    public final Paint f22434b;
    public a f22435c;

    public s0(Context context, i6 i6Var) {
        super(context);
        this.f22434b = new Paint();
        this.f22433a = i6Var;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.wl));
    }

    public a getRow() {
        return this.f22435c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, org.telegram.messenger.g0.L(6.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f) + 1, this.f22434b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(6.0f) + 1);
    }

    @Override
    public final void updateColors() {
        this.f22434b.setColor(n6.w0(n6.wl, this.f22433a));
    }
}
