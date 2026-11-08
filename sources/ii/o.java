package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.HashSet;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l9;
public final class o extends FrameLayout implements a6 {
    public final l9 f15582a;

    public o(Context context) {
        super(context);
        l9 l9Var = new l9(context);
        this.f15582a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(l9Var, ha.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = k6.S0;
        l9 l9Var = this.f15582a;
        bg.s.a(canvas, drawable, (l9Var.getWidth() / 2.0f) + l9Var.getLeft(), (l9Var.getHeight() / 2.0f) + l9Var.getTop(), l9Var.getHeight());
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
