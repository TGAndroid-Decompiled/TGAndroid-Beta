package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class an9 extends CameraView {
    public final Path a;
    public final bn9 b;

    public an9(bn9 bn9Var, Context context) {
        super(context, true, false);
        this.b = bn9Var;
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
        ((wc1) this.b).G.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
