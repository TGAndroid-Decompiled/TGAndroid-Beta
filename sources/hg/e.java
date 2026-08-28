package hg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import bg.c2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f10572a;
    public final f f10573b;

    public e(f fVar, Context context) {
        super(context);
        this.f10573b = fVar;
        this.f10572a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f10573b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f10572a + 350) {
                return false;
            }
            this.f10572a = System.currentTimeMillis();
            fVar.f10599b = true;
            fVar.f10600c = false;
            AndroidUtilities.runOnUIThread(new c2(fVar, 350, 5), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f10599b = false;
            if (!fVar.f10600c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f10598a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
