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
    public final int f8612a;
    public final Object f8613b;
    public final Object f8614c;
    public final Object d;

    public t0(Object obj, Object obj2, Object obj3, int i10) {
        this.f8612a = i10;
        this.f8614c = obj;
        this.f8613b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8612a) {
            case 0:
                w0 w0Var = (w0) this.f8614c;
                boolean[] zArr = (boolean[]) this.f8613b;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                w0Var.getClass();
                if (!zArr[0]) {
                    w0Var.d = true;
                    w0Var.e = false;
                    w0Var.l();
                    Iterator it = w0Var.f8695f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    qVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f8614c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!((boolean[]) this.f8613b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f8613b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f8614c);
                if (m2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, m2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f8614c).run(Integer.valueOf(((org.telegram.ui.Components.s3) this.d).getValue() + (((org.telegram.ui.Components.q3) this.f8613b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f8614c;
                da daVar = (da) this.d;
                b1Var.getClass();
                if (!((AtomicBoolean) this.f8613b).get()) {
                    b1Var.y(daVar, "popup_closed", new JSONObject());
                }
                b1Var.f39091c0 = null;
                b1Var.f39093e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f8613b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard((c6) this.f8614c);
                if (m2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, m2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((xh.a2) this.f8613b);
                AndroidUtilities.requestAdjustResize((Activity) this.d, ((xh.s2) this.f8614c).f46504a.getClassGuid());
                return;
        }
    }

    public t0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.f8612a = 1;
        this.f8613b = zArr;
        this.f8614c = zArr2;
        this.d = callback;
    }
}
