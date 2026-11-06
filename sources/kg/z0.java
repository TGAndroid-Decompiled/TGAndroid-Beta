package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.w8;
public final class z0 extends View {
    public final Drawable f17586a;
    public final ImageReceiver f17587b;

    public z0(a1 a1Var, Context context) {
        super(context);
        this.f17586a = getContext().getResources().getDrawable(2131231651).mutate();
        w8 w8Var = new w8((f6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f17587b = imageReceiver;
        w8Var.r(a1Var.getUserConfig().f());
        imageReceiver.i0(a1Var.getUserConfig().f(), w8Var, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(62.0f);
        int L2 = org.telegram.messenger.g0.L(85.0f);
        Drawable drawable = this.f17586a;
        drawable.setBounds(0, 0, L, L2);
        drawable.draw(canvas);
        int L3 = org.telegram.messenger.g0.L(62.0f);
        ImageReceiver imageReceiver = this.f17587b;
        imageReceiver.J0(L3);
        imageReceiver.y0(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(85.0f), 1073741824));
    }
}
