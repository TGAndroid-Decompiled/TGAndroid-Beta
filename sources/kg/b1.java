package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.a9;
public final class b1 extends View {
    public final Drawable f18352a;
    public final ImageReceiver f18353b;

    public b1(c1 c1Var, Context context) {
        super(context);
        this.f18352a = getContext().getResources().getDrawable(2131231655).mutate();
        a9 a9Var = new a9((i6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f18353b = imageReceiver;
        a9Var.r(c1Var.getUserConfig().f());
        imageReceiver.j0(c1Var.getUserConfig().f(), a9Var, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(62.0f);
        int L2 = org.telegram.messenger.g0.L(85.0f);
        Drawable drawable = this.f18352a;
        drawable.setBounds(0, 0, L, L2);
        drawable.draw(canvas);
        int L3 = org.telegram.messenger.g0.L(62.0f);
        ImageReceiver imageReceiver = this.f18353b;
        imageReceiver.K0(L3);
        imageReceiver.z0(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(85.0f), 1073741824));
    }
}
