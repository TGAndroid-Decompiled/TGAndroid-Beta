package ch;

import ai.w0;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.z10;
public final class e extends ImageView {
    public long f5057a;
    public final f f5058b;

    public e(f fVar, Context context) {
        super(context);
        this.f5058b = fVar;
        this.f5057a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z10 z10Var;
        int action = motionEvent.getAction();
        f fVar = this.f5058b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f5057a + 350) {
                return false;
            }
            this.f5057a = System.currentTimeMillis();
            fVar.f5065b = true;
            fVar.f5066c = false;
            org.telegram.messenger.g0.i3(new w0(fVar, 350, 2), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f5065b = false;
            if (!fVar.f5066c && (z10Var = fVar.d) != null) {
                z10Var.a(Boolean.FALSE);
                try {
                    fVar.f5064a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
