package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class vra extends View {
    public final jsa a;
    public final ImageReceiver b;
    public final Drawable c;

    public vra(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        jsa jsaVar = new jsa(this, starGift, 60, 0.27f);
        this.a = jsaVar;
        jsaVar.L = (byte) 3;
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.q0(gm.L(30.0f));
        imageReceiver.U(tLObject, pc0Var, null);
        Drawable mutate = context.getDrawable(2131231004).mutate();
        this.c = mutate;
        anb.x(this, mutate, cmb.y6, null, PorterDuff.Mode.MULTIPLY);
        mutate.setBounds(gm.L(-12.0f), gm.L(-12.0f), gm.L(12.0f), gm.L(12.0f));
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
        int width = (getWidth() / 2) - (gm.L(156.0f) / 2);
        int height = (getHeight() / 2) - gm.L(30.0f);
        jsa jsaVar = this.a;
        jsaVar.setBounds(width, height, gm.L(60.0f) + width, gm.L(60.0f) + height);
        jsaVar.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.c.draw(canvas);
        canvas.restore();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(gm.L(96.0f) + width, height, gm.L(60.0f), gm.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(100.0f), 1073741824));
    }
}
