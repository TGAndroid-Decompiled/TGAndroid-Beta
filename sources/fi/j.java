package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.xc;
public final class j extends ImageView {
    public final float f11021a;
    public final xc f11022b;

    public j(Context context) {
        super(context);
        this.f11022b = new xc(this);
        this.f11021a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f11022b.a(this.f11021a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f11022b.c(z10);
    }
}
