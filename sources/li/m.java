package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import java.util.HashSet;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.i9;
public final class m extends FrameLayout implements z5 {
    public final i9 f19608a;

    public m(Context context) {
        super(context);
        i9 i9Var = new i9(context);
        this.f19608a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(i9Var, ja.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = j6.S0;
        i9 i9Var = this.f19608a;
        bg.s.a(canvas, drawable, (i9Var.getWidth() / 2.0f) + i9Var.getLeft(), (i9Var.getHeight() / 2.0f) + i9Var.getTop(), i9Var.getHeight());
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
