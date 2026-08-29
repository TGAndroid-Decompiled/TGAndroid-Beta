package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class s6 extends CameraView {
    public final Path f18548a;
    public final t6 f18549b;

    public s6(t6 t6Var, Context context) {
        super(context, true, false);
        this.f18549b = t6Var;
        this.f18548a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f18548a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((p) this.f18549b).B.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
