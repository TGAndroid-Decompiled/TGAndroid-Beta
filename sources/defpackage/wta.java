package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class wta extends View {
    public final kua a;
    public final ImageReceiver b;
    public final Drawable c;

    public wta(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        kua kuaVar = new kua(this, starGift, 60, 0.27f);
        this.a = kuaVar;
        kuaVar.L = (byte) 3;
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.q0(hl.L(30.0f));
        imageReceiver.U(tLObject, rb0Var, null);
        Drawable mutate = context.getDrawable(2131231003).mutate();
        this.c = mutate;
        yob.x(this, mutate, aob.z6, null, PorterDuff.Mode.MULTIPLY);
        mutate.setBounds(hl.L(-12.0f), hl.L(-12.0f), hl.L(12.0f), hl.L(12.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (hl.L(156.0f) / 2);
        int height = (getHeight() / 2) - hl.L(30.0f);
        kua kuaVar = this.a;
        kuaVar.setBounds(width, height, hl.L(60.0f) + width, hl.L(60.0f) + height);
        kuaVar.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.c.draw(canvas);
        canvas.restore();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(hl.L(96.0f) + width, height, hl.L(60.0f), hl.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), 1073741824));
    }
}
