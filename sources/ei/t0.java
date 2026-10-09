package ei;

import ai.ea;
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
    public final int f9360a;
    public final Object f9361b;
    public final Object f9362c;
    public final Object d;

    public t0(Object obj, Object obj2, Object obj3, int i10) {
        this.f9360a = i10;
        this.f9362c = obj;
        this.f9361b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9360a) {
            case 0:
                w0 w0Var = (w0) this.f9362c;
                boolean[] zArr = (boolean[]) this.f9361b;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                w0Var.getClass();
                if (!zArr[0]) {
                    w0Var.d = true;
                    w0Var.f9455e = false;
                    w0Var.k();
                    Iterator it = w0Var.f9456f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    qVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f9362c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!((boolean[]) this.f9361b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9361b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f9362c);
                if (n2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, n2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f9362c).run(Integer.valueOf(((org.telegram.ui.Components.u3) this.d).getValue() + (((org.telegram.ui.Components.s3) this.f9361b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f9362c;
                ea eaVar = (ea) this.d;
                b1Var.getClass();
                if (!((AtomicBoolean) this.f9361b).get()) {
                    b1Var.x(eaVar, "popup_closed", new JSONObject());
                }
                b1Var.f43240c0 = null;
                b1Var.f43243e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f9361b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard((c6) this.f9362c);
                if (n2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, n2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((xh.a2) this.f9361b);
                AndroidUtilities.requestAdjustResize((Activity) this.d, ((xh.s2) this.f9362c).f51509a.getClassGuid());
                return;
        }
    }

    public t0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.f9360a = 1;
        this.f9361b = zArr;
        this.f9362c = zArr2;
        this.d = callback;
    }
}
