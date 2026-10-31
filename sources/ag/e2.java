package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.r8;
public final class e2 extends View {
    public final Drawable f497a;
    public final ImageReceiver f498b;

    public e2(f2 f2Var, Context context) {
        super(context);
        this.f497a = getContext().getResources().getDrawable(2131231650).mutate();
        r8 r8Var = new r8((p6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f498b = imageReceiver;
        r8Var.r(f2Var.getUserConfig().f());
        imageReceiver.i0(f2Var.getUserConfig().f(), r8Var, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(62.0f);
        int L2 = org.telegram.messenger.i0.L(85.0f);
        Drawable drawable = this.f497a;
        drawable.setBounds(0, 0, L, L2);
        drawable.draw(canvas);
        int L3 = org.telegram.messenger.i0.L(62.0f);
        ImageReceiver imageReceiver = this.f498b;
        imageReceiver.J0(L3);
        imageReceiver.y0(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(85.0f), 1073741824));
    }
}
