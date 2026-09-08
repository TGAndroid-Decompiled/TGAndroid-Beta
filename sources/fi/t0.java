package fi;

import android.app.Activity;
import android.content.DialogInterface;
import bi.k9;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t0 implements DialogInterface.OnDismissListener {
    public final int f9992a;
    public final Object f9993b;
    public final Object f9994c;
    public final Object d;

    public t0(Object obj, Object obj2, Object obj3, int i10) {
        this.f9992a = i10;
        this.f9994c = obj;
        this.f9993b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9992a) {
            case 0:
                w0 w0Var = (w0) this.f9994c;
                boolean[] zArr = (boolean[]) this.f9993b;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.d;
                w0Var.getClass();
                if (!zArr[0]) {
                    w0Var.d = true;
                    w0Var.f10083e = false;
                    w0Var.l();
                    Iterator it = w0Var.f10084f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    sVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f9994c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!((boolean[]) this.f9993b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9993b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f9994c);
                if (n2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, n2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f9994c).run(Integer.valueOf(((org.telegram.ui.Components.s3) this.d).getValue() + (((org.telegram.ui.Components.q3) this.f9993b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f9994c;
                k9 k9Var = (k9) this.d;
                d1Var.getClass();
                if (!((AtomicBoolean) this.f9993b).get()) {
                    d1Var.y(k9Var, "popup_closed", new JSONObject());
                }
                d1Var.f42067c0 = null;
                d1Var.f42070e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f9993b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard((b6) this.f9994c);
                if (n2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, n2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((yh.y1) this.f9993b);
                AndroidUtilities.requestAdjustResize((Activity) this.d, ((yh.q2) this.f9994c).f50544a.getClassGuid());
                return;
        }
    }

    public t0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.f9992a = 1;
        this.f9993b = zArr;
        this.f9994c = zArr2;
        this.d = callback;
    }
}
