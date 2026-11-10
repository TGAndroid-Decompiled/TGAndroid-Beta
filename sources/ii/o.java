package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.HashSet;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.k9;
public final class o extends FrameLayout implements c6 {
    public final k9 f15581a;

    public o(Context context) {
        super(context);
        k9 k9Var = new k9(context);
        this.f15581a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(k9Var, ha.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = m6.S0;
        k9 k9Var = this.f15581a;
        bg.s.a(canvas, drawable, (k9Var.getWidth() / 2.0f) + k9Var.getLeft(), (k9Var.getHeight() / 2.0f) + k9Var.getTop(), k9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(136.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
