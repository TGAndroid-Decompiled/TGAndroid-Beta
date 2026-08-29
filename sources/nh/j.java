package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.uc;
public final class j extends ImageView {
    public final float f17914a;
    public final uc f17915b;

    public j(Context context) {
        super(context);
        this.f17915b = new uc(this);
        this.f17914a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f17915b.a(this.f17914a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f17915b.c(z10);
    }
}
