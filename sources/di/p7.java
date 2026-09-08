package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class p7 extends CameraView {
    public final Path f7859a;
    public final q7 f7860b;

    public p7(q7 q7Var, Context context) {
        super(context, true, false);
        this.f7860b = q7Var;
        this.f7859a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f7859a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((p) this.f7860b).F.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
