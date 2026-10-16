package fi;

import android.app.Activity;
import android.content.DialogInterface;
import bi.n9;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f9529a;
    public final Object f9530b;
    public final Object f9531c;
    public final Object d;

    public s0(Object obj, Object obj2, Object obj3, int i10) {
        this.f9529a = i10;
        this.f9531c = obj;
        this.f9530b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9529a) {
            case 0:
                v0 v0Var = (v0) this.f9531c;
                boolean[] zArr = (boolean[]) this.f9530b;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                v0Var.getClass();
                if (!zArr[0]) {
                    v0Var.d = true;
                    v0Var.e = false;
                    v0Var.k();
                    Iterator it = v0Var.f9606f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    qVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f9531c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!((boolean[]) this.f9530b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f9530b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f9531c);
                if (m2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, m2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f9531c).run(Integer.valueOf(((org.telegram.ui.Components.u3) this.d).getValue() + (((org.telegram.ui.Components.s3) this.f9530b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f9531c;
                n9 n9Var = (n9) this.d;
                c1Var.getClass();
                if (!((AtomicBoolean) this.f9530b).get()) {
                    c1Var.x(n9Var, "popup_closed", new JSONObject());
                }
                c1Var.f40986c0 = null;
                c1Var.f40988e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f9530b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard((c6) this.f9531c);
                if (m2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, m2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((yh.y1) this.f9530b);
                AndroidUtilities.requestAdjustResize((Activity) this.d, ((yh.q2) this.f9531c).f49088a.getClassGuid());
                return;
        }
    }

    public s0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.f9529a = 1;
        this.f9530b = zArr;
        this.f9531c = zArr2;
        this.d = callback;
    }
}
