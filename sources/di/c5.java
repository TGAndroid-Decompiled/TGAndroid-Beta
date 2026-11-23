package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class c5 extends View {
    public final q5 f8630a;
    public final ImageReceiver f8631b;
    public final Drawable f8632c;

    public c5(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        q5 q5Var = new q5(this, starGift, 60, 0.27f);
        this.f8630a = q5Var;
        q5Var.L = 3;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.l(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f8631b = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(30.0f));
        imageReceiver.i0(tLObject, b9Var, null);
        Drawable mutate = context.getDrawable(2131231001).mutate();
        this.f8632c = mutate;
        org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.f29792z6, null, PorterDuff.Mode.MULTIPLY);
        mutate.setBounds(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8631b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8631b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (org.telegram.messenger.g0.L(156.0f) / 2);
        int height = (getHeight() / 2) - org.telegram.messenger.g0.L(30.0f);
        q5 q5Var = this.f8630a;
        q5Var.setBounds(width, height, org.telegram.messenger.g0.L(60.0f) + width, org.telegram.messenger.g0.L(60.0f) + height);
        q5Var.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.f8632c.draw(canvas);
        canvas.restore();
        ImageReceiver imageReceiver = this.f8631b;
        imageReceiver.y0(org.telegram.messenger.g0.L(96.0f) + width, height, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
    }
}
