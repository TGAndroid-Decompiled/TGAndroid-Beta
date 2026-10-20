package gi;

import android.app.Activity;
import android.content.DialogInterface;
import ci.z7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f11417a;
    public final Object f11418b;
    public final Object f11419c;
    public final Object d;

    public r0(Object obj, Object obj2, Object obj3, int i10) {
        this.f11417a = i10;
        this.f11419c = obj;
        this.f11418b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f11417a) {
            case 0:
                u0 u0Var = (u0) this.f11419c;
                boolean[] zArr = (boolean[]) this.f11418b;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.d;
                u0Var.getClass();
                if (!zArr[0]) {
                    u0Var.d = true;
                    u0Var.e = false;
                    u0Var.k();
                    Iterator it = u0Var.f11497f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    rVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f11419c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!((boolean[]) this.f11418b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f11418b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f11419c);
                if (n2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, n2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f11419c).run(Integer.valueOf(((org.telegram.ui.Components.t3) this.d).getValue() + (((org.telegram.ui.Components.r3) this.f11418b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f11419c;
                z7 z7Var = (z7) this.d;
                a1Var.getClass();
                if (!((AtomicBoolean) this.f11418b).get()) {
                    a1Var.x(z7Var, "popup_closed", new JSONObject());
                }
                a1Var.f42566c0 = null;
                a1Var.f42568e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f11418b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard((b6) this.f11419c);
                if (n2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, n2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((yh.x1) this.f11418b);
                AndroidUtilities.requestAdjustResize((Activity) this.d, ((yh.p2) this.f11419c).f50463a.getClassGuid());
                return;
        }
    }

    public r0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.f11417a = 1;
        this.f11418b = zArr;
        this.f11419c = zArr2;
        this.d = callback;
    }
}
