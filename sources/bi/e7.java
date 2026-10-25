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
public final class e7 extends View implements org.telegram.ui.ActionBar.p6 {
    public final ImageReceiver f4558a;
    public final ImageReceiver f4559b;
    public final Path f4560c;
    public final Paint d;

    public e7(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.f4560c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.f22625a;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f4558a = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, j9Var);
        org.telegram.ui.Components.j9 j9Var2 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f4559b = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, j9Var2);
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
        this.f4558a.onAttachedToWindow();
        this.f4559b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4558a.onDetachedFromWindow();
        this.f4559b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
        float height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
        ImageReceiver imageReceiver = this.f4558a;
        imageReceiver.setImageCoords(width, height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.f4560c, this.d);
        canvas.restore();
        ImageReceiver imageReceiver2 = this.f4559b;
        imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width, height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver2.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E6, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
