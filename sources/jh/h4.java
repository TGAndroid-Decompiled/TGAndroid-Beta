package jh;

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
    public final u4 f12159a;
    public final ImageReceiver f12160b;
    public final Drawable f12161c;

    public h4(Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject) {
        super(context);
        u4 u4Var = new u4(this, tL_starGiftUnique, 60, 0.27f);
        this.f12159a = u4Var;
        u4Var.f12910t = 3;
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f12160b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, e9Var);
        Drawable mutate = context.getDrawable(R.drawable.chats_undo).mutate();
        this.f12161c = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23450z6, false), PorterDuff.Mode.MULTIPLY));
        mutate.setBounds(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12160b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12160b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
        u4 u4Var = this.f12159a;
        u4Var.setBounds(width, height, AndroidUtilities.dp(60.0f) + width, AndroidUtilities.dp(60.0f) + height);
        u4Var.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.f12161c.draw(canvas);
        canvas.restore();
        ImageReceiver imageReceiver = this.f12160b;
        imageReceiver.setImageCoords(AndroidUtilities.dp(96.0f) + width, height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
    }
}
