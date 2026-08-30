package nh;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class h extends org.telegram.ui.Components.k5 {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
