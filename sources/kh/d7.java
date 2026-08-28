package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class d7 extends CameraView {
    public final Path f15113a;
    public final e7 f15114b;

    public d7(e7 e7Var, Context context) {
        super(context, true, false);
        this.f15114b = e7Var;
        this.f15113a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f15113a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((q) this.f15114b).B.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
