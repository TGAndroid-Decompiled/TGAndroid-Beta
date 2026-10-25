package bh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g extends ImageView {
    public long f4030a;
    public final h f4031b;

    public g(h hVar, Context context) {
        super(context);
        this.f4031b = hVar;
        this.f4030a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        h hVar = this.f4031b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f4030a + 350) {
                return false;
            }
            this.f4030a = System.currentTimeMillis();
            hVar.f4035b = true;
            hVar.f4036c = false;
            AndroidUtilities.runOnUIThread(new ag.r0(hVar, 350, 1), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            hVar.f4035b = false;
            if (!hVar.f4036c && (callback = hVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    hVar.f4034a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
