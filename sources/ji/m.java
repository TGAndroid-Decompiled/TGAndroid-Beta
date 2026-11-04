package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
public final class m extends FrameLayout implements z5 {
    public final k9 f16341a;

    public m(Context context) {
        super(context);
        k9 k9Var = new k9(context);
        this.f16341a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(k9Var, mf.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = k6.S0;
        k9 k9Var = this.f16341a;
        cg.r.a(canvas, drawable, (k9Var.getWidth() / 2.0f) + k9Var.getLeft(), (k9Var.getHeight() / 2.0f) + k9Var.getTop(), k9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(136.0f), 1073741824));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void updateColors() {
    }
}
