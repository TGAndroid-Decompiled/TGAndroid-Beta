package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class e6 extends View {
    public final u6 f3759a;
    public final ImageReceiver f3760b;
    public final Drawable f3761c;

    public e6(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        u6 u6Var = new u6(this, starGift, 60, 0.27f);
        this.f3759a = u6Var;
        u6Var.K = 3;
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.l(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f3760b = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(30.0f));
        imageReceiver.i0(tLObject, v8Var, null);
        Drawable mutate = context.getDrawable(2131231001).mutate();
        this.f3761c = mutate;
        org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.f28300z6, null, PorterDuff.Mode.MULTIPLY);
        mutate.setBounds(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3760b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3760b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (org.telegram.messenger.g0.L(156.0f) / 2);
        int height = (getHeight() / 2) - org.telegram.messenger.g0.L(30.0f);
        u6 u6Var = this.f3759a;
        u6Var.setBounds(width, height, org.telegram.messenger.g0.L(60.0f) + width, org.telegram.messenger.g0.L(60.0f) + height);
        u6Var.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.f3761c.draw(canvas);
        canvas.restore();
        ImageReceiver imageReceiver = this.f3760b;
        imageReceiver.y0(org.telegram.messenger.g0.L(96.0f) + width, height, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
    }
}
