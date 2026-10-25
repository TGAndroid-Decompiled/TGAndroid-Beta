package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;
public final class a7 extends CameraView {
    public final Path f10512a;
    public final b7 f10513b;

    public a7(b7 b7Var, Context context) {
        super(context, true, false);
        this.f10513b = b7Var;
        this.f10512a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f10512a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void receivedAmplitude(double d) {
        ((p) this.f10513b).F.setAmplitude(d);
    }

    @Override
    public final boolean square() {
        return true;
    }
}
