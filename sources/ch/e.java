package ch;

import ai.w0;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.x10;
public final class e extends ImageView {
    public long f5340a;
    public final f f5341b;

    public e(f fVar, Context context) {
        super(context);
        this.f5341b = fVar;
        this.f5340a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x10 x10Var;
        int action = motionEvent.getAction();
        f fVar = this.f5341b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f5340a + 350) {
                return false;
            }
            this.f5340a = System.currentTimeMillis();
            fVar.f5348b = true;
            fVar.f5349c = false;
            org.telegram.messenger.g0.h3(new w0(fVar, 350, 4), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f5348b = false;
            if (!fVar.f5349c && (x10Var = fVar.d) != null) {
                x10Var.a(Boolean.FALSE);
                try {
                    fVar.f5347a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
