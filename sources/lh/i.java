package lh;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i implements DialogInterface.OnDismissListener {
    public final int f12803a;
    public final Object f12804b;
    public final Object f12805c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f12803a = i10;
        this.f12805c = obj;
        this.d = obj2;
        this.f12804b = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12803a) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                Activity activity = (Activity) this.f12804b;
                AndroidUtilities.hideKeyboard((eh.b) this.f12805c);
                if (p2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, p2Var.getClassGuid());
                    return;
                }
                return;
            case 1:
                AndroidUtilities.hideKeyboard((u2) this.d);
                AndroidUtilities.requestAdjustResize((Activity) this.f12804b, ((x3) this.f12805c).f13098a.getClassGuid());
                return;
            case 2:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.d;
                Activity activity2 = (Activity) this.f12804b;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f12805c);
                if (p2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, p2Var2.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f12805c).run(Integer.valueOf(((org.telegram.ui.Components.o3) this.f12804b).getValue() + (((org.telegram.ui.Components.m3) this.d).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f12805c;
                boolean[] zArr = (boolean[]) this.d;
                String str = (String) this.f12804b;
                a1Var.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    a1Var.v("requested_chat_failed", org.telegram.ui.web.a1.x(str, "req_id"));
                    return;
                }
                return;
            case 5:
                sh.q0 q0Var = (sh.q0) this.f12805c;
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f12804b;
                q0Var.getClass();
                if (!zArr2[0]) {
                    q0Var.d = true;
                    q0Var.f47625e = false;
                    q0Var.l();
                    Iterator it = q0Var.f47626f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr2[0] = true;
                    sVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f12804b;
                if (!((boolean[]) this.f12805c)[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
        }
    }
}
