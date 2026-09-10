package bi;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class g extends ViewOutlineProvider {
    public final int f2731a;

    public g(int i10) {
        this.f2731a = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f2731a) {
            case 0:
                outline.setRoundRect(0, 0, view.getWidth(), AndroidUtilities.dp(29.0f) + view.getHeight(), AndroidUtilities.dp(29.0f));
                return;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(18.0f));
                return;
            case 2:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                return;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                return;
            case 4:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                return;
            case 5:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                return;
            case 6:
                outline.setRoundRect(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), view.getMeasuredWidth() - AndroidUtilities.dp(1.0f), view.getMeasuredHeight() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(6.0f));
                return;
            case 7:
                int i10 = AndroidUtilities.roundMessageSize;
                outline.setOval(0, 0, i10, i10);
                return;
            case 8:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
                return;
            case 9:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dpf2(6.0f));
                return;
            case 10:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dpf2(6.0f));
                return;
            case 11:
                outline.setOval(0, 0, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
                return;
            case 12:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(12.0f));
                return;
            case 13:
                outline.setRoundRect(0, AndroidUtilities.dp(50.0f), view.getWidth(), AndroidUtilities.dp(24.0f) + view.getHeight(), AndroidUtilities.dp(24.0f));
                return;
            case 14:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
                return;
            case 15:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / view.getScaleX()) * AndroidUtilities.dp(4.0f));
                return;
            case 16:
                outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                return;
            case 17:
                outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                return;
            case 18:
                float dp = AndroidUtilities.dp(12.0f);
                outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + dp), dp);
                return;
            case 19:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
                return;
            case 20:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 21:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
