package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b9;
public final class b1 extends View {
    public final Drawable f18287a;
    public final ImageReceiver f18288b;

    public b1(c1 c1Var, Context context) {
        super(context);
        this.f18287a = getContext().getResources().getDrawable(2131231652).mutate();
        b9 b9Var = new b9((h6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f18288b = imageReceiver;
        b9Var.r(c1Var.getUserConfig().f());
        imageReceiver.i0(c1Var.getUserConfig().f(), b9Var, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(62.0f);
        int L2 = org.telegram.messenger.g0.L(85.0f);
        Drawable drawable = this.f18287a;
        drawable.setBounds(0, 0, L, L2);
        drawable.draw(canvas);
        int L3 = org.telegram.messenger.g0.L(62.0f);
        ImageReceiver imageReceiver = this.f18288b;
        imageReceiver.J0(L3);
        imageReceiver.y0(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(85.0f), 1073741824));
    }
}
