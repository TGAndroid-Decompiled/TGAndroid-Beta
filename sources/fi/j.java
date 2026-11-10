package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.hc;
public final class j extends ImageView {
    public final float f12199a;
    public final hc f12200b;

    public j(Context context) {
        super(context);
        this.f12200b = new hc(this);
        this.f12199a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a10 = this.f12200b.a(this.f12199a);
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.f12200b.c(z9);
    }
}
