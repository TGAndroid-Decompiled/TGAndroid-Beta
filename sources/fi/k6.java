package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class k6 extends CameraView {
    public final Path f12274a;
    public final l6 f12275b;

    public k6(l6 l6Var, Context context) {
        super(context, true, false);
        this.f12275b = l6Var;
        this.f12274a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f12274a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((p) this.f12275b).F.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
