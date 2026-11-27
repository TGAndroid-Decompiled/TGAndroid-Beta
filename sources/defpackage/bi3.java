package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class bi3 extends ChatActivityEnterView {
    public final uj3 Y7;

    public bi3(uj3 uj3Var, Activity activity, nj3 nj3Var) {
        super(activity, nj3Var, null, false, null);
        this.Y7 = uj3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            uj3 uj3Var = this.Y7;
            hl.V2(uj3Var.getParentActivity(), uj3.i2(uj3Var));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f1(float f) {
        uj3 uj3Var = this.Y7;
        uj3Var.A1.setInputBubbleHeight(f);
        uj3Var.O2();
        uj3Var.P2();
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        uj3 uj3Var = this.Y7;
        int i = uj3Var.U0;
        bi3 bi3Var = uj3Var.D1;
        if (bi3Var == null) {
            fieldText = "";
        } else {
            fieldText = bi3Var.getFieldText();
        }
        return Math.max(1, i + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        uj3 uj3Var = this.Y7;
        ArrayList arrayList = uj3Var.K2;
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
            long M1 = uj3Var.getMessagesController().M1(longValue);
            if (M1 <= 0 && longValue > 0) {
                M1 = wf3.j(uj3Var.getMessagesController().P2(longValue));
            }
            j += M1;
        }
        return j;
    }
}
