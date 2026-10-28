package hi;

import android.app.Activity;
import android.content.DialogInterface;
import di.x7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.f5;
public final class y0 implements DialogInterface.OnDismissListener {
    public final int f13372a;
    public final Object f13373b;
    public final Object f13374c;
    public final Object d;

    public y0(Object obj, Object obj2, Object obj3, int i10) {
        this.f13372a = i10;
        this.f13374c = obj;
        this.f13373b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f13372a) {
            case 0:
                b1 b1Var = (b1) this.f13374c;
                boolean[] zArr = (boolean[]) this.f13373b;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.d;
                b1Var.getClass();
                if (!zArr[0]) {
                    b1Var.d = true;
                    b1Var.e = false;
                    b1Var.k();
                    Iterator it = b1Var.f12887f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    rVar.run(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f13374c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!((boolean[]) this.f13373b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    callback.run("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f13373b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard((f5) this.f13374c);
                if (r2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, r2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((Utilities.Callback) this.f13374c).run(Integer.valueOf(((org.telegram.ui.Components.u3) this.d).getValue() + (((org.telegram.ui.Components.s3) this.f13373b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f13374c;
                x7 x7Var = (x7) this.d;
                a1Var.getClass();
                if (!((AtomicBoolean) this.f13373b).get()) {
                    a1Var.x(x7Var, "popup_closed", new JSONObject());
                }
                a1Var.f44670c0 = null;
                a1Var.f44672e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.f13373b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard((g6) this.f13374c);
                if (r2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, r2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((zh.y1) this.f13373b);
                AndroidUtilities.requestAdjustResize((Activity) this.d, ((zh.r2) this.f13374c).f53288a.getClassGuid());
                return;
        }
    }

    public y0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.f13372a = 1;
        this.f13373b = zArr;
        this.f13374c = zArr2;
        this.d = callback;
    }
}
