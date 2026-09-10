package di;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.w6;
public final class y0 extends Drawable implements w6 {
    public final Paint f7022a;
    public final Paint f7023b;
    public final Paint f7024c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public final Drawable f7025f;

    public y0(Context context, TLRPC.User user, TLRPC.User user2) {
        Paint paint = new Paint(1);
        this.f7022a = paint;
        this.f7023b = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f7024c = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.e = imageReceiver2;
        new RectF();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_location).mutate();
        this.f7025f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.L5, false), PorterDuff.Mode.SRC_IN));
        g9 g9Var = new g9((f6) null);
        g9Var.r(user);
        imageReceiver.setForUserOrChat(user, g9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(25.0f));
        g9 g9Var2 = new g9((f6) null);
        g9Var2.r(user2);
        imageReceiver2.setForUserOrChat(user2, g9Var2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(25.0f));
    }

    @Override
    public final void a(kj0 kj0Var) {
        this.e.setParentView(kj0Var);
        this.d.setParentView(kj0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int w02 = j6.w0(null, j6.L5, false);
        Paint paint = this.f7023b;
        paint.setColor(w02);
        float dp = AndroidUtilities.dp(136.0f) / 2.0f;
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(bounds.centerX() - dp, bounds.centerY() - AndroidUtilities.dp(25.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
        imageReceiver.draw(canvas);
        float centerX = (bounds.centerX() - dp) + AndroidUtilities.dp(41.0f);
        float dp2 = AndroidUtilities.dp(16.0f) + bounds.centerY();
        canvas.drawCircle(centerX, dp2, AndroidUtilities.dp(14.0f), paint);
        canvas.drawCircle(centerX, dp2, AndroidUtilities.dp(12.0f), this.f7024c);
        int dp3 = (int) (dp2 + AndroidUtilities.dp(9.0f));
        Drawable drawable = this.f7025f;
        drawable.setBounds((int) (centerX - AndroidUtilities.dp(9.0f)), (int) (dp2 - AndroidUtilities.dp(9.0f)), (int) (centerX + AndroidUtilities.dp(9.0f)), dp3);
        drawable.draw(canvas);
        int centerX2 = bounds.centerX();
        Paint paint2 = this.f7022a;
        canvas.drawLine(bounds.centerX() - AndroidUtilities.dp(3.33f), bounds.centerY() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(3.33f) + centerX2, bounds.centerY(), paint2);
        canvas.drawLine(bounds.centerX() - AndroidUtilities.dp(3.33f), AndroidUtilities.dp(7.0f) + bounds.centerY(), AndroidUtilities.dp(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        ImageReceiver imageReceiver2 = this.e;
        imageReceiver2.setImageCoords((bounds.centerX() + dp) - AndroidUtilities.dp(50.0f), bounds.centerY() - AndroidUtilities.dp(25.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
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
