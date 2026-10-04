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
public final class u0 implements DialogInterface.OnDismissListener {
    public final int f9358a;
    public final Object f9359b;
    public final Object f9360c;
    public final Object d;

    public u0(Object obj, Object obj2, Object obj3, int i10) {
        this.f9358a = i10;
        this.f9360c = obj;
        this.f9359b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9358a) {
            case 0:
                x0 x0Var = (x0) this.f9360c;
                boolean[] zArr = (boolean[]) this.f9359b;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                x0Var.getClass();
                if (!zArr[0]) {
                    x0Var.d = true;
                    x0Var.f9451e = false;
                    x0Var.l();
                    Iterator it = x0Var.f9452f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    qVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f9360c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!((boolean[]) this.f9359b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9359b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f9360c);
                if (n2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, n2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f9360c).run(Integer.valueOf(((org.telegram.ui.Components.s3) this.d).getValue() + (((org.telegram.ui.Components.q3) this.f9359b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f9360c;
                da daVar = (da) this.d;
                c1Var.getClass();
                if (!((AtomicBoolean) this.f9359b).get()) {
                    c1Var.y(daVar, "popup_closed", new JSONObject());
                }
                c1Var.f42124c0 = null;
                c1Var.f42127e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f9359b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard((c6) this.f9360c);
                if (n2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, n2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((xh.a2) this.f9359b);
                AndroidUtilities.requestAdjustResize((Activity) this.d, ((xh.s2) this.f9360c).f50217a.getClassGuid());
                return;
        }
    }

    public u0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.f9358a = 1;
        this.f9359b = zArr;
        this.f9360c = zArr2;
        this.d = callback;
    }
}
