package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.z9;
import w7.z5;
public final class n extends FrameLayout implements x5 {
    public final z9 f10223a;

    public n(Context context) {
        super(context);
        z9 z9Var = new z9(context);
        this.f10223a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(z9Var, z5.a(72.0f, 0.0f, 0.0f, 0.0f, 28.0f, 72, 81));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = g6.S0;
        z9 z9Var = this.f10223a;
        zf.q.a(canvas, drawable, (z9Var.getWidth() / 2.0f) + z9Var.getLeft(), (z9Var.getHeight() / 2.0f) + z9Var.getTop(), z9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), 1073741824));
    }

    @Override
    public final void d() {
    }
}
