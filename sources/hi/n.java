package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.u9;
import w7.z5;
public final class n extends FrameLayout implements b6 {
    public final u9 f12218a;

    public n(Context context) {
        super(context);
        u9 u9Var = new u9(context);
        this.f12218a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(u9Var, z5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = k6.S0;
        u9 u9Var = this.f12218a;
        zf.p.a(canvas, drawable, (u9Var.getWidth() / 2.0f) + u9Var.getLeft(), (u9Var.getHeight() / 2.0f) + u9Var.getTop(), u9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), 1073741824));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void updateColors() {
    }
}
