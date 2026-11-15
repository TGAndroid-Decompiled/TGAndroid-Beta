package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class r0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final e6 f21969a;
    public final Paint f21970b;
    public a f21971c;

    public r0(Context context, e6 e6Var) {
        super(context);
        this.f21970b = new Paint();
        this.f21969a = e6Var;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.wl));
    }

    public a getRow() {
        return this.f21971c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, org.telegram.messenger.g0.L(6.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f) + 1, this.f21970b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(6.0f) + 1);
    }

    @Override
    public final void updateColors() {
        this.f21970b.setColor(j6.w0(j6.wl, this.f21969a));
    }
}
