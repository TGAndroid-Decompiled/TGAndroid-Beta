package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;

public final class c7 extends CameraView {

    public final Path f15754a;

    public final d7 f15755b;

    public c7(d7 d7Var, Context context) {
        super(context, true, false);
        this.f15755b = d7Var;
        this.f15754a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f15754a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((q) this.f15755b).B.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
