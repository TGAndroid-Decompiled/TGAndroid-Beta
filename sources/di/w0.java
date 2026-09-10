package di;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class w0 implements DialogInterface.OnDismissListener {
    public final int f6971a;
    public final Object f6972b;
    public final Object f6973c;
    public final Object d;

    public w0(Object obj, Object obj2, Object obj3, int i10) {
        this.f6971a = i10;
        this.f6973c = obj;
        this.f6972b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6971a) {
            case 0:
                z0 z0Var = (z0) this.f6973c;
                boolean[] zArr = (boolean[]) this.f6972b;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.d;
                z0Var.getClass();
                if (!zArr[0]) {
                    z0Var.d = true;
                    z0Var.e = false;
                    z0Var.l();
                    Iterator it = z0Var.f7053f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    rVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f6973c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!((boolean[]) this.f6972b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f6972b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f6973c);
                if (p2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, p2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f6973c).run(Integer.valueOf(((org.telegram.ui.Components.r3) this.d).getValue() + (((org.telegram.ui.Components.p3) this.f6972b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f6973c;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.d;
                c1Var.getClass();
                if (!((AtomicBoolean) this.f6972b).get()) {
                    c1Var.z(a1Var, "popup_closed", new JSONObject());
                }
                c1Var.f37881c0 = null;
                c1Var.f37883e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f6972b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard((d6) this.f6973c);
                if (p2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, p2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((wh.y1) this.f6972b);
                AndroidUtilities.requestAdjustResize((Activity) this.d, ((wh.q2) this.f6973c).f44317a.getClassGuid());
                return;
        }
    }

    public w0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.f6971a = 1;
        this.f6972b = zArr;
        this.f6973c = zArr2;
        this.d = callback;
    }
}
