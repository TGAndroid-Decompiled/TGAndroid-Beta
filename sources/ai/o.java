package ai;

import android.app.Activity;
import android.content.DialogInterface;
import ei.p7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.u10;
public final class o implements DialogInterface.OnDismissListener {
    public final int f845a;
    public final Object f846b;
    public final Object f847c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i3) {
        this.f845a = i3;
        this.f847c = obj;
        this.d = obj2;
        this.f846b = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f845a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                Activity activity = (Activity) this.f846b;
                org.telegram.messenger.g0.v1((z) this.f847c);
                if (d2Var != null) {
                    org.telegram.messenger.g0.a3(activity, d2Var.getClassGuid());
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.v1((u3) this.d);
                org.telegram.messenger.g0.a3((Activity) this.f846b, ((u4) this.f847c).f1010a.getClassGuid());
                return;
            case 2:
                ii.s0 s0Var = (ii.s0) this.f847c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f846b;
                s0Var.getClass();
                if (!zArr[0]) {
                    s0Var.d = true;
                    s0Var.f15214e = false;
                    s0Var.k();
                    Iterator it = s0Var.f15215f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    pVar.a(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                boolean[] zArr2 = (boolean[]) this.d;
                u10 u10Var = (u10) this.f846b;
                if (!((boolean[]) this.f847c)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    u10Var.a("USER_DECLINED");
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.d;
                Activity activity2 = (Activity) this.f846b;
                org.telegram.messenger.g0.v1((org.telegram.ui.Components.s4) this.f847c);
                if (d2Var2 != null) {
                    org.telegram.messenger.g0.a3(activity2, d2Var2.getClassGuid());
                    return;
                }
                return;
            case 5:
                ((u10) this.f847c).a(Integer.valueOf(((org.telegram.ui.Components.o3) this.f846b).getValue() + (((org.telegram.ui.Components.m3) this.d).getValue() * 60)));
                return;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f847c;
                p7 p7Var = (p7) this.f846b;
                w0Var.getClass();
                if (!((AtomicBoolean) this.d).get()) {
                    w0Var.x(p7Var, "popup_closed", new JSONObject());
                }
                w0Var.f51066d0 = null;
                w0Var.f51070f0 = System.currentTimeMillis();
                return;
        }
    }
}
