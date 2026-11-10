package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class t0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final h6 f18866a;
    public final Paint f18867b;
    public a f18868c;

    public t0(Context context, h6 h6Var) {
        super(context);
        this.f18867b = new Paint();
        this.f18866a = h6Var;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.tl));
    }

    public a getRow() {
        return this.f18868c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, org.telegram.messenger.g0.L(6.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f) + 1, this.f18867b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(6.0f) + 1);
    }

    @Override
    public final void updateColors() {
        this.f18867b.setColor(m6.w0(m6.tl, this.f18866a));
    }
}
