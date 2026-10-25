package eh;

import android.graphics.Canvas;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.f7;
public final class f extends d {
    public final hh.a Y;

    public f(hh.a aVar) {
        this.Y = aVar;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = f7.f22626b;
        if (this.f9965w != i10) {
            this.f9965w = i10;
            try {
                updateColors();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        m(canvas, this.Y);
    }

    @Override
    public final hh.a s() {
        return this.Y;
    }
}
