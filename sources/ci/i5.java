package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class i5 extends View {
    public final w5 f5293a;
    public final ImageReceiver f5294b;
    public final Drawable f5295c;

    public i5(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        w5 w5Var = new w5(this, starGift, 60, 0.27f);
        this.f5293a = w5Var;
        w5Var.L = 3;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5294b = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(30.0f));
        imageReceiver.i0(tLObject, u8Var, null);
        Drawable mutate = context.getDrawable(2131231001).mutate();
        this.f5295c = mutate;
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.f28290z6, null, PorterDuff.Mode.MULTIPLY);
        mutate.setBounds(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5294b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5294b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (org.telegram.messenger.g0.L(156.0f) / 2);
        int height = (getHeight() / 2) - org.telegram.messenger.g0.L(30.0f);
        w5 w5Var = this.f5293a;
        w5Var.setBounds(width, height, org.telegram.messenger.g0.L(60.0f) + width, org.telegram.messenger.g0.L(60.0f) + height);
        w5Var.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.f5295c.draw(canvas);
        canvas.restore();
        ImageReceiver imageReceiver = this.f5294b;
        imageReceiver.y0(org.telegram.messenger.g0.L(96.0f) + width, height, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
    }
}
