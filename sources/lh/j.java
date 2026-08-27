package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;

public final class j extends ImageView {

    public final float f16147a;

    public final org.telegram.ui.Components.nc f16148b;

    public j(Context context) {
        super(context);
        this.f16148b = new org.telegram.ui.Components.nc(this);
        this.f16147a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float fA = this.f16148b.a(this.f16147a);
        canvas.scale(fA, fA, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f16148b.c(z10);
    }
}
