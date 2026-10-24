package dh;

import android.graphics.Canvas;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.r6;
public final class f extends d {
    public final gh.a X;

    public f(gh.a aVar) {
        this.X = aVar;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = r6.f21818b;
        if (this.f8026s != i10) {
            this.f8026s = i10;
            try {
                updateColors();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        c(canvas, this.X);
    }

    @Override
    public final gh.a i() {
        return this.X;
    }
}
