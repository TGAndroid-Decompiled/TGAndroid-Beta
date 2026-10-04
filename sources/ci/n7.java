package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class n7 extends CameraView {
    public final Path f5613a;
    public final o7 f5614b;

    public n7(o7 o7Var, Context context) {
        super(context, true, false);
        this.f5614b = o7Var;
        this.f5613a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f5613a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((p) this.f5614b).F.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
