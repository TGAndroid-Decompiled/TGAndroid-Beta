package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class al9 extends CameraView {
    public final Path a;
    public final bl9 b;

    public al9(bl9 bl9Var, Context context) {
        super(context, true, false);
        this.b = bl9Var;
        this.a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((pb1) this.b).G.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
