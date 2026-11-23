package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class r6 extends CameraView {
    public final Path f15296a;
    public final s6 f15297b;

    public r6(s6 s6Var, Context context) {
        super(context, true, false);
        this.f15297b = s6Var;
        this.f15296a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f15296a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((q) this.f15297b).G.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
