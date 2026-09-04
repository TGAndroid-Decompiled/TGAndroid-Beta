package ah;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h extends ImageView {
    public long f548a;
    public final i f549b;

    public h(i iVar, Context context) {
        super(context);
        this.f549b = iVar;
        this.f548a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        i iVar = this.f549b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f548a + 350) {
                return false;
            }
            this.f548a = System.currentTimeMillis();
            iVar.f584b = true;
            iVar.f585c = false;
            AndroidUtilities.runOnUIThread(new g(iVar, 350, 0), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            iVar.f584b = false;
            if (!iVar.f585c && (callback = iVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    iVar.f583a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
