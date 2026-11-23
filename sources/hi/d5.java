package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class d5 extends tg.d1 {
    public final Path f14312o3;
    public final pa f14313p3;

    public d5(pa paVar, Context context) {
        super(context);
        this.f14313p3 = paVar;
        this.f14312o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        pa paVar = this.f14313p3;
        barView = paVar.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(paVar.n1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(paVar.n1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(paVar.n1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(paVar.n1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f14312o3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
