package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class t0 extends View implements org.telegram.ui.ActionBar.a6 {
    public final f6 f18863a;
    public final Paint f18864b;
    public a f18865c;

    public t0(Context context, f6 f6Var) {
        super(context);
        this.f18864b = new Paint();
        this.f18863a = f6Var;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.tl));
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
        this.f18864b.setColor(k6.w0(k6.tl, this.f18863a));
    }
}
