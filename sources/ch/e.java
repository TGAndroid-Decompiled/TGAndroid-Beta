package ch;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.c20;
public final class e extends ImageView {
    public long f6232a;
    public final f f6233b;

    public e(f fVar, Context context) {
        super(context);
        this.f6233b = fVar;
        this.f6232a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c20 c20Var;
        int action = motionEvent.getAction();
        f fVar = this.f6233b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f6232a + 350) {
                return false;
            }
            this.f6232a = System.currentTimeMillis();
            fVar.f6242b = true;
            fVar.f6243c = false;
            org.telegram.messenger.g0.i3(new bg.m0(fVar, 350, 2), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f6242b = false;
            if (!fVar.f6243c && (c20Var = fVar.d) != null) {
                c20Var.a(Boolean.FALSE);
                try {
                    fVar.f6241a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
