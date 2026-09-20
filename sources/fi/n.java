package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.v9;
import w7.y5;
public final class n extends FrameLayout implements z5 {
    public final v9 f9144a;

    public n(Context context) {
        super(context);
        v9 v9Var = new v9(context);
        this.f9144a = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(v9Var, y5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = j6.S0;
        v9 v9Var = this.f9144a;
        yf.p.a(canvas, drawable, (v9Var.getWidth() / 2.0f) + v9Var.getLeft(), (v9Var.getHeight() / 2.0f) + v9Var.getTop(), v9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), 1073741824));
    }

    @Override
    public final void e() {
    }
}
