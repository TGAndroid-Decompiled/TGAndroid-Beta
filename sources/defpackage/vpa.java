package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class vpa extends View {
    public final jqa a;
    public final ImageReceiver b;
    public final Drawable c;

    public vpa(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        jqa jqaVar = new jqa(this, starGift, 60, 0.27f);
        this.a = jqaVar;
        jqaVar.L = (byte) 3;
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.q0(gl.L(30.0f));
        imageReceiver.U(tLObject, pb0Var, null);
        Drawable mutate = context.getDrawable(2131231003).mutate();
        this.c = mutate;
        zkb.x(this, mutate, bkb.y6, null, PorterDuff.Mode.MULTIPLY);
        mutate.setBounds(gl.L(-12.0f), gl.L(-12.0f), gl.L(12.0f), gl.L(12.0f));
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
        int width = (getWidth() / 2) - (gl.L(156.0f) / 2);
        int height = (getHeight() / 2) - gl.L(30.0f);
        jqa jqaVar = this.a;
        jqaVar.setBounds(width, height, gl.L(60.0f) + width, gl.L(60.0f) + height);
        jqaVar.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.c.draw(canvas);
        canvas.restore();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(gl.L(96.0f) + width, height, gl.L(60.0f), gl.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), 1073741824));
    }
}
