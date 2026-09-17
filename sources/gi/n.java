package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.x9;
import w7.x5;
public final class n extends FrameLayout implements z5 {
    public final x9 f10759a;

    public n(Context context) {
        super(context);
        x9 x9Var = new x9(context);
        this.f10759a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(x9Var, x5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = j6.S0;
        x9 x9Var = this.f10759a;
        yf.p.a(canvas, drawable, (x9Var.getWidth() / 2.0f) + x9Var.getLeft(), (x9Var.getHeight() / 2.0f) + x9Var.getTop(), x9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), 1073741824));
    }

    @Override
    public final void d() {
    }
}
