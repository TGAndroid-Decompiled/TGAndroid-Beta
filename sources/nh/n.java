package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.o9;
public final class n extends FrameLayout implements w5 {
    public final o9 f18681a;

    public n(Context context) {
        super(context);
        o9 o9Var = new o9(context);
        this.f18681a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(o9Var, e6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = f6.S0;
        o9 o9Var = this.f18681a;
        ff.s.a(canvas, drawable, (o9Var.getWidth() / 2.0f) + o9Var.getLeft(), (o9Var.getHeight() / 2.0f) + o9Var.getTop(), o9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), 1073741824));
    }

    @Override
    public final void d() {
    }
}
