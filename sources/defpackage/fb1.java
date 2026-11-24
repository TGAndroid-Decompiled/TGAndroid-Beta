package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
public final class fb1 extends ImageView {
    public final float a;
    public final n41 b;

    public fb1(Context context) {
        super(context);
        this.b = new n41(this);
        this.a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a = this.b.a(this.a);
        canvas.scale(a, a, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.b.c(z);
    }
}
