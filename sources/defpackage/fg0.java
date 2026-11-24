package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;
public final class fg0 extends RippleDrawable {
    @Override
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            try {
                super.draw(canvas);
            } catch (Exception e) {
                fc4.e("probably forgot to put setCallback", e);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
