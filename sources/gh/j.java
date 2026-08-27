package gh;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class j implements DialogInterface.OnDismissListener {

    public final int f7342a;

    public final Object f7343b;

    public final Object f7344c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f7342a = i10;
        this.f7344c = obj;
        this.d = obj2;
        this.f7343b = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f7342a) {
            case 0:
                r rVar = (r) this.f7344c;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                Activity activity = (Activity) this.f7343b;
                AndroidUtilities.hideKeyboard(rVar);
                if (n2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, n2Var.getClassGuid());
                }
                break;
            case 1:
                d4 d4Var = (d4) this.f7344c;
                b3 b3Var = (b3) this.d;
                Activity activity2 = (Activity) this.f7343b;
                AndroidUtilities.hideKeyboard(b3Var);
                AndroidUtilities.requestAdjustResize(activity2, d4Var.f7197a.getClassGuid());
                break;
            case 2:
                nh.t0 t0Var = (nh.t0) this.f7344c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f7343b;
                t0Var.getClass();
                if (!zArr[0]) {
                    t0Var.d = true;
                    t0Var.f18967e = false;
                    t0Var.l();
                    Iterator it = t0Var.f18968f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    sVar.run(Boolean.TRUE, Boolean.FALSE);
                }
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) this.f7344c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f7343b;
                if (!zArr2[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    callback.run("USER_DECLINED");
                    break;
                }
                break;
            case 4:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f7344c;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.d;
                Activity activity3 = (Activity) this.f7343b;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                if (n2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity3, n2Var2.getClassGuid());
                }
                break;
            case 5:
                Utilities.Callback callback2 = (Utilities.Callback) this.f7344c;
                org.telegram.ui.Components.l3 l3Var = (org.telegram.ui.Components.l3) this.d;
                org.telegram.ui.Components.n3 n3Var = (org.telegram.ui.Components.n3) this.f7343b;
                callback2.run(Integer.valueOf(n3Var.getValue() + (l3Var.getValue() * 60)));
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f7344c;
                boolean[] zArr4 = (boolean[]) this.d;
                String str = (String) this.f7343b;
                z0Var.getClass();
                if (!zArr4[0]) {
                    zArr4[0] = true;
                    z0Var.v("requested_chat_failed", org.telegram.ui.web.z0.x(str, "req_id"));
                }
                break;
        }
    }
}
