package kg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f13704a;
    public final f f13705b;

    public e(f fVar, Context context) {
        super(context);
        this.f13705b = fVar;
        this.f13704a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f13705b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f13704a + 350) {
                return false;
            }
            this.f13704a = System.currentTimeMillis();
            fVar.f13708b = true;
            fVar.f13709c = false;
            AndroidUtilities.runOnUIThread(new bg.f(fVar, 350, 8), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f13708b = false;
            if (!fVar.f13709c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f13707a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
