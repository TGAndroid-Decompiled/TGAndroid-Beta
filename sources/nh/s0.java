package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.y8;

public final class s0 extends Drawable implements r6 {

    public final Paint f18940a;

    public final Paint f18941b;

    public final Paint f18942c;
    public final ImageReceiver d;

    public final ImageReceiver f18943e;

    public final Drawable f18944f;

    public s0(Context context, TLRPC.User user, TLRPC.User user2) {
        Paint paint = new Paint(1);
        this.f18940a = paint;
        this.f18941b = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f18942c = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.f18943e = imageReceiver2;
        new RectF();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.filled_location).mutate();
        this.f18944f = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.L5, false), PorterDuff.Mode.SRC_IN));
        y8 y8Var = new y8((c6) null);
        y8Var.r(user);
        imageReceiver.setForUserOrChat(user, y8Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(25.0f));
        y8 y8Var2 = new y8((c6) null);
        y8Var2.r(user2);
        imageReceiver2.setForUserOrChat(user2, y8Var2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(25.0f));
    }

    @Override
    public final void a(ri0 ri0Var) {
        this.f18943e.setParentView(ri0Var);
        this.d.setParentView(ri0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.d.onDetachedFromWindow();
        this.f18943e.onDetachedFromWindow();
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.d.onAttachedToWindow();
        this.f18943e.onAttachedToWindow();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iW0 = g6.w0(null, g6.L5, false);
        Paint paint = this.f18941b;
        paint.setColor(iW0);
        float fDp = AndroidUtilities.dp(136.0f) / 2.0f;
        float fCenterX = bounds.centerX() - fDp;
        float fCenterY = bounds.centerY() - AndroidUtilities.dp(25.0f);
        float fDp2 = AndroidUtilities.dp(50.0f);
        float fDp3 = AndroidUtilities.dp(50.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(fCenterX, fCenterY, fDp2, fDp3);
        imageReceiver.draw(canvas);
        float fCenterX2 = (bounds.centerX() - fDp) + AndroidUtilities.dp(41.0f);
        float fDp4 = AndroidUtilities.dp(16.0f) + bounds.centerY();
        canvas.drawCircle(fCenterX2, fDp4, AndroidUtilities.dp(14.0f), paint);
        canvas.drawCircle(fCenterX2, fDp4, AndroidUtilities.dp(12.0f), this.f18942c);
        int iDp = (int) (fCenterX2 - AndroidUtilities.dp(9.0f));
        int iDp2 = (int) (fDp4 - AndroidUtilities.dp(9.0f));
        int iDp3 = (int) (fCenterX2 + AndroidUtilities.dp(9.0f));
        int iDp4 = (int) (fDp4 + AndroidUtilities.dp(9.0f));
        Drawable drawable = this.f18944f;
        drawable.setBounds(iDp, iDp2, iDp3, iDp4);
        drawable.draw(canvas);
        float fCenterX3 = bounds.centerX() - AndroidUtilities.dp(3.33f);
        float fCenterY2 = bounds.centerY() - AndroidUtilities.dp(7.0f);
        float fDp5 = AndroidUtilities.dp(3.33f) + bounds.centerX();
        float fCenterY3 = bounds.centerY();
        Paint paint2 = this.f18940a;
        canvas.drawLine(fCenterX3, fCenterY2, fDp5, fCenterY3, paint2);
        canvas.drawLine(bounds.centerX() - AndroidUtilities.dp(3.33f), AndroidUtilities.dp(7.0f) + bounds.centerY(), AndroidUtilities.dp(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        float fCenterX4 = (bounds.centerX() + fDp) - AndroidUtilities.dp(50.0f);
        float fCenterY4 = bounds.centerY() - AndroidUtilities.dp(25.0f);
        float fDp6 = AndroidUtilities.dp(50.0f);
        float fDp7 = AndroidUtilities.dp(50.0f);
        ImageReceiver imageReceiver2 = this.f18943e;
        imageReceiver2.setImageCoords(fCenterX4, fCenterY4, fDp6, fDp7);
        imageReceiver2.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
