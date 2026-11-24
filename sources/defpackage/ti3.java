package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ti3 extends ChatActivityEnterView {
    public final nk3 A7;

    public ti3(nk3 nk3Var, Activity activity, gk3 gk3Var) {
        super(activity, gk3Var, null, false, null);
        this.A7 = nk3Var;
    }

    @Override
    public final void c1(float f) {
        nk3 nk3Var = this.A7;
        nk3Var.A1.setInputBubbleHeight(f);
        nk3Var.O2();
        nk3Var.P2();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent.getAction() == 0) {
            nk3 nk3Var = this.A7;
            Activity parentActivity = nk3Var.getParentActivity();
            i = ((d) nk3Var).classGuid;
            gm.V2(parentActivity, i);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        nk3 nk3Var = this.A7;
        int i = nk3Var.U0;
        ti3 ti3Var = nk3Var.D1;
        if (ti3Var == null) {
            fieldText = "";
        } else {
            fieldText = ti3Var.getFieldText();
        }
        return Math.max(1, i + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        nk3 nk3Var = this.A7;
        ArrayList arrayList = nk3Var.K2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i = 0;
        long j = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long longValue = ((Long) obj).longValue();
            long L1 = nk3Var.getMessagesController().L1(longValue);
            if (L1 <= 0 && longValue > 0) {
                L1 = pg3.j(nk3Var.getMessagesController().L2(longValue));
            }
            j += L1;
        }
        return j;
    }
}
