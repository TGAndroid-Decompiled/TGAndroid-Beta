package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class l6 extends CameraView {
    public final Path f13117a;
    public final m6 f13118b;

    public l6(m6 m6Var, Context context) {
        super(context, true, false);
        this.f13118b = m6Var;
        this.f13117a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f13117a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((p) this.f13118b).G.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
