package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.ic;
public final class j extends ImageView {
    public final float f12195a;
    public final ic f12196b;

    public j(Context context) {
        super(context);
        this.f12196b = new ic(this);
        this.f12195a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a10 = this.f12196b.a(this.f12195a);
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.f12196b.c(z9);
    }
}
