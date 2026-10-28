package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j9;
public final class c1 extends View {
    public final Drawable f15655a;
    public final ImageReceiver f15656b;

    public c1(d1 d1Var, Context context) {
        super(context);
        this.f15655a = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();
        j9 j9Var = new j9((u6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f15656b = imageReceiver;
        j9Var.r(d1Var.getUserConfig().getCurrentUser());
        imageReceiver.setForUserOrChat(d1Var.getUserConfig().getCurrentUser(), j9Var);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(62.0f);
        int dp2 = AndroidUtilities.dp(85.0f);
        Drawable drawable = this.f15655a;
        drawable.setBounds(0, 0, dp, dp2);
        drawable.draw(canvas);
        int dp3 = AndroidUtilities.dp(62.0f);
        ImageReceiver imageReceiver = this.f15656b;
        imageReceiver.setRoundRadius(dp3);
        imageReceiver.setImageCoords(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(85.0f), 1073741824));
    }
}
