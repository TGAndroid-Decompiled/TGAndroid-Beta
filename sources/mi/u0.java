package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.k6;
public final class u0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f19960a;
    public final Paint f19961b;
    public a f19962c;

    public u0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f19961b = new Paint();
        this.f19960a = e6Var;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.tl));
    }

    public a getRow() {
        return this.f19962c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, org.telegram.messenger.g0.L(6.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f) + 1, this.f19961b);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(6.0f) + 1);
    }

    @Override
    public final void updateColors() {
        this.f19961b.setColor(k6.w0(k6.tl, this.f19960a));
    }
}
