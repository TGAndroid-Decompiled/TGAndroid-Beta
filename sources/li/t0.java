package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
public final class t0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final g6 f18863a;
    public final Paint f18864b;
    public a f18865c;

    public t0(Context context, g6 g6Var) {
        super(context);
        this.f18864b = new Paint();
        this.f18863a = g6Var;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.tl));
    }

    public a getRow() {
        return this.f18865c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, org.telegram.messenger.g0.L(6.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f) + 1, this.f18864b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(6.0f) + 1);
    }

    @Override
    public final void updateColors() {
        this.f18864b.setColor(l6.w0(l6.tl, this.f18863a));
    }
}
