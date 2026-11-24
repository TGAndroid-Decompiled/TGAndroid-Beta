package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hh3 extends ChatActivityEnterView {
    public final cj3 s7;

    public hh3(cj3 cj3Var, Activity activity, vi3 vi3Var) {
        super(activity, vi3Var, null, false, null);
        this.s7 = cj3Var;
    }

    @Override
    public final void a1(float f) {
        cj3 cj3Var = this.s7;
        cj3Var.A1.setInputBubbleHeight(f);
        cj3Var.M2();
        cj3Var.N2();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent.getAction() == 0) {
            cj3 cj3Var = this.s7;
            Activity parentActivity = cj3Var.getParentActivity();
            i = ((d) cj3Var).classGuid;
            gl.V2(parentActivity, i);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        cj3 cj3Var = this.s7;
        int i = cj3Var.U0;
        hh3 hh3Var = cj3Var.D1;
        if (hh3Var == null) {
            fieldText = "";
        } else {
            fieldText = hh3Var.getFieldText();
        }
        return Math.max(1, i + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        cj3 cj3Var = this.s7;
        ArrayList arrayList = cj3Var.K2;
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
            long K1 = cj3Var.getMessagesController().K1(longValue);
            if (K1 <= 0 && longValue > 0) {
                K1 = cf3.j(cj3Var.getMessagesController().J2(longValue));
            }
            j += K1;
        }
        return j;
    }
}
