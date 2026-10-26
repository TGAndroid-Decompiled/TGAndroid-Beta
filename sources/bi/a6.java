package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class a6 extends View {
    public final q6 f4260a;
    public final ImageReceiver f4261b;
    public final Drawable f4262c;

    public a6(Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject) {
        super(context);
        q6 q6Var = new q6(this, tL_starGiftUnique, 60, 0.27f);
        this.f4260a = q6Var;
        q6Var.K = 3;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f4261b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, j9Var);
        Drawable mutate = context.getDrawable(R.drawable.chats_undo).mutate();
        this.f4262c = mutate;
        org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.f23767z6, null, PorterDuff.Mode.MULTIPLY);
        mutate.setBounds(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4261b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4261b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
        q6 q6Var = this.f4260a;
        q6Var.setBounds(width, height, AndroidUtilities.dp(60.0f) + width, AndroidUtilities.dp(60.0f) + height);
        q6Var.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.f4262c.draw(canvas);
        canvas.restore();
        ImageReceiver imageReceiver = this.f4261b;
        imageReceiver.setImageCoords(AndroidUtilities.dp(96.0f) + width, height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
    }
}
