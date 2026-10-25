package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.y9;
public final class n extends FrameLayout implements p6 {
    public final y9 f14386a;

    public n(Context context) {
        super(context);
        y9 y9Var = new y9(context);
        this.f14386a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(y9Var, gb1.h(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = y6.S0;
        y9 y9Var = this.f14386a;
        ag.v.a(canvas, drawable, (y9Var.getWidth() / 2.0f) + y9Var.getLeft(), (y9Var.getHeight() / 2.0f) + y9Var.getTop(), y9Var.getHeight());
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
