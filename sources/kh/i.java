package kh;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i implements DialogInterface.OnDismissListener {
    public final int f10771a;
    public final Object f10772b;
    public final Object f10773c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f10771a = i10;
        this.f10773c = obj;
        this.d = obj2;
        this.f10772b = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10771a) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                Activity activity = (Activity) this.f10772b;
                AndroidUtilities.hideKeyboard((dh.b) this.f10773c);
                if (p2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, p2Var.getClassGuid());
                    return;
                }
                return;
            case 1:
                AndroidUtilities.hideKeyboard((u2) this.d);
                AndroidUtilities.requestAdjustResize((Activity) this.f10772b, ((w3) this.f10773c).f11015a.getClassGuid());
                return;
            case 2:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.d;
                Activity activity2 = (Activity) this.f10772b;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f10773c);
                if (p2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, p2Var2.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f10773c).run(Integer.valueOf(((org.telegram.ui.Components.o3) this.f10772b).getValue() + (((org.telegram.ui.Components.m3) this.d).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f10773c;
                j7 j7Var = (j7) this.f10772b;
                c1Var.getClass();
                if (!((AtomicBoolean) this.d).get()) {
                    c1Var.z(j7Var, "popup_closed", new JSONObject());
                }
                c1Var.W = null;
                c1Var.f39384b0 = System.currentTimeMillis();
                return;
            case 5:
                rh.q0 q0Var = (rh.q0) this.f10773c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.f10772b;
                q0Var.getClass();
                if (!zArr[0]) {
                    q0Var.d = true;
                    q0Var.e = false;
                    q0Var.l();
                    Iterator it = q0Var.f43773f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    rVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f10772b;
                if (!((boolean[]) this.f10773c)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
        }
    }
}
