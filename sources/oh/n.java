package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.n9;

public final class n extends FrameLayout implements x5 {

    public final n9 f19530a;

    public n(Context context) {
        super(context);
        n9 n9Var = new n9(context);
        this.f19530a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(n9Var, z5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = g6.S0;
        n9 n9Var = this.f19530a;
        gf.s.a(canvas, drawable, (n9Var.getWidth() / 2.0f) + n9Var.getLeft(), (n9Var.getHeight() / 2.0f) + n9Var.getTop(), n9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), 1073741824));
    }

    @Override
    public final void d() {
    }
}
