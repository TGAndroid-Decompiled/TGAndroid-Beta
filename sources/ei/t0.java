package ei;

import ai.ea;
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
    public final int f9357a;
    public final Object f9358b;
    public final Object f9359c;
    public final Object d;

    public t0(Object obj, Object obj2, Object obj3, int i10) {
        this.f9357a = i10;
        this.f9359c = obj;
        this.f9358b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9357a) {
            case 0:
                w0 w0Var = (w0) this.f9359c;
                boolean[] zArr = (boolean[]) this.f9358b;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                w0Var.getClass();
                if (!zArr[0]) {
                    w0Var.d = true;
                    w0Var.f9452e = false;
                    w0Var.k();
                    Iterator it = w0Var.f9453f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    qVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f9359c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!((boolean[]) this.f9358b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f9358b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f9359c);
                if (m2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, m2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f9359c).run(Integer.valueOf(((org.telegram.ui.Components.u3) this.d).getValue() + (((org.telegram.ui.Components.s3) this.f9358b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f9359c;
                ea eaVar = (ea) this.d;
                b1Var.getClass();
                if (!((AtomicBoolean) this.f9358b).get()) {
                    b1Var.x(eaVar, "popup_closed", new JSONObject());
                }
                b1Var.f43186c0 = null;
                b1Var.f43189e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f9358b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard((c6) this.f9359c);
                if (m2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, m2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((xh.z1) this.f9358b);
                AndroidUtilities.requestAdjustResize((Activity) this.d, ((xh.r2) this.f9359c).f51729a.getClassGuid());
                return;
        }
    }

    public t0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.f9357a = 1;
        this.f9358b = zArr;
        this.f9359c = zArr2;
        this.d = callback;
    }
}
