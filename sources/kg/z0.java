package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.t8;
public final class z0 extends View {
    public final Drawable f18153a;
    public final ImageReceiver f18154b;

    public z0(a1 a1Var, Context context) {
        super(context);
        this.f18153a = getContext().getResources().getDrawable(2131231651).mutate();
        t8 t8Var = new t8((e6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f18154b = imageReceiver;
        t8Var.r(a1Var.getUserConfig().f());
        imageReceiver.i0(a1Var.getUserConfig().f(), t8Var, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(62.0f);
        int L2 = org.telegram.messenger.g0.L(85.0f);
        Drawable drawable = this.f18153a;
        drawable.setBounds(0, 0, L, L2);
        drawable.draw(canvas);
        int L3 = org.telegram.messenger.g0.L(62.0f);
        ImageReceiver imageReceiver = this.f18154b;
        imageReceiver.J0(L3);
        imageReceiver.y0(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(85.0f), 1073741824));
    }
}
