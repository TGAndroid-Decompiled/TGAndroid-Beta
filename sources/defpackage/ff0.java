package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;
public final class ff0 extends RippleDrawable {
    @Override
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            try {
                super.draw(canvas);
            } catch (Exception e) {
                fa4.e("probably forgot to put setCallback", e);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
