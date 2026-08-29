package gg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class q extends ViewOutlineProvider {
    @Override
    public final void getOutline(View view, Outline outline) {
        float dp = AndroidUtilities.dp(12.0f);
        outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + dp), dp);
    }
}
