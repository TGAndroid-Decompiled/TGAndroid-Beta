package bi;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.x10;
public final class k implements DialogInterface.OnDismissListener {
    public final int f3770a;
    public final Object f3771b;
    public final Object f3772c;
    public final Object d;

    public k(Object obj, Object obj2, Object obj3, int i7) {
        this.f3770a = i7;
        this.f3772c = obj;
        this.d = obj2;
        this.f3771b = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f3770a) {
            case 0:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.d;
                Activity activity = (Activity) this.f3771b;
                org.telegram.messenger.g0.v1((u) this.f3772c);
                if (h2Var != null) {
                    org.telegram.messenger.g0.Z2(activity, h2Var.getClassGuid());
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.v1((q5) this.d);
                org.telegram.messenger.g0.Z2((Activity) this.f3771b, ((p6) this.f3772c).f3941a.getClassGuid());
                return;
            case 2:
                ki.s0 s0Var = (ki.s0) this.f3772c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.f3771b;
                s0Var.getClass();
                if (!zArr[0]) {
                    s0Var.d = true;
                    s0Var.f18879e = false;
                    s0Var.k();
                    Iterator it = s0Var.f18880f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    oVar.a(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                boolean[] zArr2 = (boolean[]) this.d;
                x10 x10Var = (x10) this.f3771b;
                if (!((boolean[]) this.f3772c)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    x10Var.a("USER_DECLINED");
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.d;
                Activity activity2 = (Activity) this.f3771b;
                org.telegram.messenger.g0.v1((org.telegram.ui.Components.a5) this.f3772c);
                if (h2Var2 != null) {
                    org.telegram.messenger.g0.Z2(activity2, h2Var2.getClassGuid());
                    return;
                }
                return;
            case 5:
                ((x10) this.f3772c).a(Integer.valueOf(((org.telegram.ui.Components.w3) this.f3771b).getValue() + (((org.telegram.ui.Components.u3) this.d).getValue() * 60)));
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f3772c;
                fi.f7 f7Var = (fi.f7) this.f3771b;
                v0Var.getClass();
                if (!((AtomicBoolean) this.d).get()) {
                    v0Var.x(f7Var, "popup_closed", new JSONObject());
                }
                v0Var.f53300d0 = null;
                v0Var.f53304f0 = System.currentTimeMillis();
                return;
        }
    }
}
