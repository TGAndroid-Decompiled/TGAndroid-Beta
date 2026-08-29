package ih;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j implements DialogInterface.OnDismissListener {
    public final int f9245a;
    public final Object f9246b;
    public final Object f9247c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f9245a = i10;
        this.f9247c = obj;
        this.d = obj2;
        this.f9246b = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9245a) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                Activity activity = (Activity) this.f9246b;
                AndroidUtilities.hideKeyboard((bh.b) this.f9247c);
                if (o2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, o2Var.getClassGuid());
                    return;
                }
                return;
            case 1:
                AndroidUtilities.hideKeyboard((v2) this.d);
                AndroidUtilities.requestAdjustResize((Activity) this.f9246b, ((x3) this.f9247c).f9501a.getClassGuid());
                return;
            case 2:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.d;
                Activity activity2 = (Activity) this.f9246b;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f9247c);
                if (o2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, o2Var2.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f9247c).run(Integer.valueOf(((org.telegram.ui.Components.r3) this.f9246b).getValue() + (((org.telegram.ui.Components.p3) this.d).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f9247c;
                boolean[] zArr = (boolean[]) this.d;
                String str = (String) this.f9246b;
                z0Var.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    z0Var.v("requested_chat_failed", org.telegram.ui.web.z0.x(str, "req_id"));
                    return;
                }
                return;
            case 5:
                ph.q0 q0Var = (ph.q0) this.f9247c;
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f9246b;
                q0Var.getClass();
                if (!zArr2[0]) {
                    q0Var.d = true;
                    q0Var.f46000e = false;
                    q0Var.l();
                    Iterator it = q0Var.f46001f.iterator();
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
                Utilities.Callback callback = (Utilities.Callback) this.f9246b;
                if (!((boolean[]) this.f9247c)[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
        }
    }
}
