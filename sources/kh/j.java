package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
public final class j extends ImageView {
    public final float f15448a;
    public final org.telegram.ui.Components.pc f15449b;

    public j(Context context) {
        super(context);
        this.f15449b = new org.telegram.ui.Components.pc(this);
        this.f15448a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f15449b.a(this.f15448a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f15449b.c(z10);
    }
}
