package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class b6 extends View implements org.telegram.ui.ActionBar.p6 {
    public final q6 f4340a;
    public final ImageReceiver f4341b;
    public final Path f4342c;
    public final Paint d;

    public b6(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        Path path = new Path();
        this.f4342c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.f22625a;
        q6 q6Var = new q6(this, starGift, 60, 0.27f);
        this.f4340a = q6Var;
        q6Var.K = 3;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f4341b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, j9Var);
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        path.rewind();
        path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
        path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4341b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4341b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
        q6 q6Var = this.f4340a;
        q6Var.setBounds(width, height, AndroidUtilities.dp(60.0f) + width, AndroidUtilities.dp(60.0f) + height);
        q6Var.draw(canvas);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.f4342c, this.d);
        canvas.restore();
        ImageReceiver imageReceiver = this.f4341b;
        imageReceiver.setImageCoords(AndroidUtilities.dp(96.0f) + width, height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        Paint paint = this.d;
        try {
            int i10 = org.telegram.ui.ActionBar.y6.E6;
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public b6(Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(context);
        Path path = new Path();
        this.f4342c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.f22625a;
        q6 q6Var = new q6(this, tL_starGiftUnique, 60, 0.27f);
        this.f4340a = q6Var;
        q6Var.K = 3;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f4341b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setImageBitmap(org.telegram.ui.Cells.z6.a(60, "fragment"));
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.33f));
        path.rewind();
        path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
        path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
