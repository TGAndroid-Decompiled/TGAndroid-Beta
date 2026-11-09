package ch;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.c20;
public final class e extends ImageView {
    public long f6227a;
    public final f f6228b;

    public e(f fVar, Context context) {
        super(context);
        this.f6228b = fVar;
        this.f6227a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c20 c20Var;
        int action = motionEvent.getAction();
        f fVar = this.f6228b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f6227a + 350) {
                return false;
            }
            this.f6227a = System.currentTimeMillis();
            fVar.f6237b = true;
            fVar.f6238c = false;
            org.telegram.messenger.g0.i3(new bg.m0(fVar, 350, 2), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f6237b = false;
            if (!fVar.f6238c && (c20Var = fVar.d) != null) {
                c20Var.a(Boolean.FALSE);
                try {
                    fVar.f6236a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
