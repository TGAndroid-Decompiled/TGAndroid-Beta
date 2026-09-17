package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i9;
public final class d1 extends View {
    public final Drawable f12027a;
    public final ImageReceiver f12028b;

    public d1(e1 e1Var, Context context) {
        super(context);
        this.f12027a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        i9 i9Var = new i9((f6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f12028b = imageReceiver;
        i9Var.r(e1Var.getUserConfig().getCurrentUser());
        imageReceiver.setForUserOrChat(e1Var.getUserConfig().getCurrentUser(), i9Var);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(62.0f);
        int dp2 = AndroidUtilities.dp(85.0f);
        Drawable drawable = this.f12027a;
        drawable.setBounds(0, 0, dp, dp2);
        drawable.draw(canvas);
        int dp3 = AndroidUtilities.dp(62.0f);
        ImageReceiver imageReceiver = this.f12028b;
        imageReceiver.setRoundRadius(dp3);
        imageReceiver.setImageCoords(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(85.0f), 1073741824));
    }
}
