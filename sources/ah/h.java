package ah;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h extends ImageView {
    public long f769a;
    public final i f770b;

    public h(i iVar, Context context) {
        super(context);
        this.f770b = iVar;
        this.f769a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        i iVar = this.f770b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f769a + 350) {
                return false;
            }
            this.f769a = System.currentTimeMillis();
            iVar.f776b = true;
            iVar.f777c = false;
            AndroidUtilities.runOnUIThread(new g(iVar, 350, 0), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            iVar.f776b = false;
            if (!iVar.f777c && (callback = iVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    iVar.f775a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
