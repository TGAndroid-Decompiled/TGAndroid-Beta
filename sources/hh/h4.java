package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

public final class h4 extends View {

    public final v4 f9381a;

    public final ImageReceiver f9382b;

    public final Drawable f9383c;

    public h4(Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject) {
        super(context);
        v4 v4Var = new v4(this, tL_starGiftUnique, 60, 0.27f);
        this.f9381a = v4Var;
        v4Var.f10227t = 3;
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f9382b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, y8Var);
        Drawable drawableMutate = context.getDrawable(R.drawable.chats_undo).mutate();
        this.f9383c = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false), PorterDuff.Mode.MULTIPLY));
        drawableMutate.setBounds(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9382b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9382b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
        int iDp = AndroidUtilities.dp(60.0f) + width;
        int iDp2 = AndroidUtilities.dp(60.0f) + height;
        v4 v4Var = this.f9381a;
        v4Var.setBounds(width, height, iDp, iDp2);
        v4Var.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.f9383c.draw(canvas);
        canvas.restore();
        float fDp = AndroidUtilities.dp(60.0f);
        float fDp2 = AndroidUtilities.dp(60.0f);
        ImageReceiver imageReceiver = this.f9382b;
        imageReceiver.setImageCoords(AndroidUtilities.dp(96.0f) + width, height, fDp, fDp2);
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
    }
}
