package mg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f13982a;
    public final f f13983b;

    public e(f fVar, Context context) {
        super(context);
        this.f13983b = fVar;
        this.f13982a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f13983b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f13982a + 350) {
                return false;
            }
            this.f13982a = System.currentTimeMillis();
            fVar.f13985b = true;
            fVar.f13986c = false;
            AndroidUtilities.runOnUIThread(new ah.b(fVar, 350, 9), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f13985b = false;
            if (!fVar.f13986c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f13984a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
