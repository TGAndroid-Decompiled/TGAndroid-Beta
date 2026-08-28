package fh;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j implements DialogInterface.OnDismissListener {
    public final int f6523a;
    public final Object f6524b;
    public final Object f6525c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i9) {
        this.f6523a = i9;
        this.f6525c = obj;
        this.d = obj2;
        this.f6524b = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6523a) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                Activity activity = (Activity) this.f6524b;
                AndroidUtilities.hideKeyboard((s) this.f6525c);
                if (o2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, o2Var.getClassGuid());
                    return;
                }
                return;
            case 1:
                AndroidUtilities.hideKeyboard((g3) this.d);
                AndroidUtilities.requestAdjustResize((Activity) this.f6524b, ((j4) this.f6525c).f6545a.getClassGuid());
                return;
            case 2:
                mh.u0 u0Var = (mh.u0) this.f6525c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.f6524b;
                u0Var.getClass();
                if (!zArr[0]) {
                    u0Var.d = true;
                    u0Var.f18152e = false;
                    u0Var.l();
                    Iterator it = u0Var.f18153f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    rVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f6524b;
                if (!((boolean[]) this.f6525c)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.d;
                Activity activity2 = (Activity) this.f6524b;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f6525c);
                if (o2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, o2Var2.getClassGuid());
                    return;
                }
                return;
            case 5:
                ((Utilities.Callback) this.f6525c).run(Integer.valueOf(((org.telegram.ui.Components.n3) this.f6524b).getValue() + (((org.telegram.ui.Components.l3) this.d).getValue() * 60)));
                return;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f6525c;
                boolean[] zArr3 = (boolean[]) this.d;
                String str = (String) this.f6524b;
                y0Var.getClass();
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    y0Var.v("requested_chat_failed", org.telegram.ui.web.y0.x(str, "req_id"));
                    return;
                }
                return;
        }
    }
}
