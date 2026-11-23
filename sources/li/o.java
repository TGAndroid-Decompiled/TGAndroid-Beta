package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import java.util.HashSet;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.q9;
public final class o extends FrameLayout implements b6 {
    public final q9 f19973a;

    public o(Context context) {
        super(context);
        q9 q9Var = new q9(context);
        this.f19973a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(q9Var, na.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = m6.S0;
        q9 q9Var = this.f19973a;
        bg.t.a(canvas, drawable, (q9Var.getWidth() / 2.0f) + q9Var.getLeft(), (q9Var.getHeight() / 2.0f) + q9Var.getTop(), q9Var.getHeight());
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
