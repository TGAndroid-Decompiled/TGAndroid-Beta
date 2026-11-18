package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class i6 extends CameraView {
    public final Path f14770a;
    public final j6 f14771b;

    public i6(j6 j6Var, Context context) {
        super(context, true, false);
        this.f14771b = j6Var;
        this.f14770a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f14770a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((q) this.f14771b).G.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
