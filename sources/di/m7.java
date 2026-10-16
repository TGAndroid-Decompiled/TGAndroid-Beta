package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class m7 extends CameraView {
    public final Path f7429a;
    public final n7 f7430b;

    public m7(n7 n7Var, Context context) {
        super(context, true, false);
        this.f7430b = n7Var;
        this.f7429a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f7429a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((p) this.f7430b).F.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
