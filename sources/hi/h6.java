package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class h6 extends CameraView {
    public final Path f14754a;
    public final i6 f14755b;

    public h6(i6 i6Var, Context context) {
        super(context, true, false);
        this.f14755b = i6Var;
        this.f14754a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f14754a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((r) this.f14755b).G.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
