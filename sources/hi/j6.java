package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class j6 extends CameraView {
    public final Path f14469a;
    public final k6 f14470b;

    public j6(k6 k6Var, Context context) {
        super(context, true, false);
        this.f14470b = k6Var;
        this.f14469a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f14469a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((p) this.f14470b).G.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
