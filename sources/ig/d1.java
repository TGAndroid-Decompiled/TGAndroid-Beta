package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.k9;
public final class d1 extends View {
    public final Drawable f11470a;
    public final ImageReceiver f11471b;

    public d1(e1 e1Var, Context context) {
        super(context);
        this.f11470a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        k9 k9Var = new k9((c6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f11471b = imageReceiver;
        k9Var.r(e1Var.getUserConfig().getCurrentUser());
        imageReceiver.setForUserOrChat(e1Var.getUserConfig().getCurrentUser(), k9Var);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(62.0f);
        int dp2 = AndroidUtilities.dp(85.0f);
        Drawable drawable = this.f11470a;
        drawable.setBounds(0, 0, dp, dp2);
        drawable.draw(canvas);
        int dp3 = AndroidUtilities.dp(62.0f);
        ImageReceiver imageReceiver = this.f11471b;
        imageReceiver.setRoundRadius(dp3);
        imageReceiver.setImageCoords(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(85.0f), 1073741824));
    }
}
