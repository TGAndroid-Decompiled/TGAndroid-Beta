package ei;

import ai.da;
import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t0 implements DialogInterface.OnDismissListener {
    public final int f8615a;
    public final Object f8616b;
    public final Object f8617c;
    public final Object d;

    public t0(Object obj, Object obj2, Object obj3, int i10) {
        this.f8615a = i10;
        this.f8617c = obj;
        this.f8616b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8615a) {
            case 0:
                w0 w0Var = (w0) this.f8617c;
                boolean[] zArr = (boolean[]) this.f8616b;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.d;
                w0Var.getClass();
                if (!zArr[0]) {
                    w0Var.d = true;
                    w0Var.e = false;
                    w0Var.l();
                    Iterator it = w0Var.f8698f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    rVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f8617c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!((boolean[]) this.f8616b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f8616b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f8617c);
                if (n2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, n2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f8617c).run(Integer.valueOf(((org.telegram.ui.Components.q3) this.d).getValue() + (((org.telegram.ui.Components.o3) this.f8616b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f8617c;
                da daVar = (da) this.d;
                d1Var.getClass();
                if (!((AtomicBoolean) this.f8616b).get()) {
                    d1Var.y(daVar, "popup_closed", new JSONObject());
                }
                d1Var.f38904c0 = null;
                d1Var.f38906e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f8616b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard((c6) this.f8617c);
                if (n2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, n2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((xh.z1) this.f8616b);
                AndroidUtilities.requestAdjustResize((Activity) this.d, ((xh.r2) this.f8617c).f46101a.getClassGuid());
                return;
        }
    }

    public t0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.f8615a = 1;
        this.f8616b = zArr;
        this.f8617c = zArr2;
        this.d = callback;
    }
}
