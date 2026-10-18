package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class d7 extends CameraView {
    public final Path f8897a;
    public final e7 f8898b;

    public d7(e7 e7Var, Context context) {
        super(context, true, false);
        this.f8898b = e7Var;
        this.f8897a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f8897a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((p) this.f8898b).F.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
