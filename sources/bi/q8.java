package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class q8 extends CameraView {
    public final Path f3461a;
    public final r8 f3462b;

    public q8(r8 r8Var, Context context) {
        super(context, true, false);
        this.f3462b = r8Var;
        this.f3461a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f3461a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((t) this.f3462b).F.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
