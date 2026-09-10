package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.w9;
public final class n extends FrameLayout implements a6 {
    public final w9 f7588a;

    public n(Context context) {
        super(context);
        w9 w9Var = new w9(context);
        this.f7588a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var, w7.a6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = j6.S0;
        w9 w9Var = this.f7588a;
        xf.p.a(canvas, drawable, (w9Var.getWidth() / 2.0f) + w9Var.getLeft(), (w9Var.getHeight() / 2.0f) + w9Var.getTop(), w9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), 1073741824));
    }

    @Override
    public final void e() {
    }
}
