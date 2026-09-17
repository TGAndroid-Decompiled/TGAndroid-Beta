package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class p7 extends CameraView {
    public final Path f5309a;
    public final q7 f5310b;

    public p7(q7 q7Var, Context context) {
        super(context, true, false);
        this.f5310b = q7Var;
        this.f5309a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f5309a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((p) this.f5310b).F.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
