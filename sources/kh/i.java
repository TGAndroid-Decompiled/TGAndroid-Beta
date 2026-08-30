package kh;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i implements DialogInterface.OnDismissListener {
    public final int f10664a;
    public final Object f10665b;
    public final Object f10666c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f10664a = i10;
        this.f10666c = obj;
        this.d = obj2;
        this.f10665b = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10664a) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                Activity activity = (Activity) this.f10665b;
                AndroidUtilities.hideKeyboard((dh.b) this.f10666c);
                if (p2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, p2Var.getClassGuid());
                    return;
                }
                return;
            case 1:
                AndroidUtilities.hideKeyboard((v2) this.d);
                AndroidUtilities.requestAdjustResize((Activity) this.f10665b, ((x3) this.f10666c).f10939a.getClassGuid());
                return;
            case 2:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.d;
                Activity activity2 = (Activity) this.f10665b;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f10666c);
                if (p2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, p2Var2.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f10666c).run(Integer.valueOf(((org.telegram.ui.Components.o3) this.f10665b).getValue() + (((org.telegram.ui.Components.m3) this.d).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f10666c;
                boolean[] zArr = (boolean[]) this.d;
                String str = (String) this.f10665b;
                a1Var.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    a1Var.v("requested_chat_failed", org.telegram.ui.web.a1.x(str, "req_id"));
                    return;
                }
                return;
            case 5:
                rh.r0 r0Var = (rh.r0) this.f10666c;
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f10665b;
                r0Var.getClass();
                if (!zArr2[0]) {
                    r0Var.d = true;
                    r0Var.e = false;
                    r0Var.l();
                    Iterator it = r0Var.f43721f.iterator();
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
                Utilities.Callback callback = (Utilities.Callback) this.f10665b;
                if (!((boolean[]) this.f10666c)[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
        }
    }
}
