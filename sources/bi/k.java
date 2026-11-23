package bi;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.w10;
public final class k implements DialogInterface.OnDismissListener {
    public final int f3732a;
    public final Object f3733b;
    public final Object f3734c;
    public final Object d;

    public k(Object obj, Object obj2, Object obj3, int i7) {
        this.f3732a = i7;
        this.f3734c = obj;
        this.d = obj2;
        this.f3733b = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f3732a) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                Activity activity = (Activity) this.f3733b;
                org.telegram.messenger.g0.v1((u) this.f3734c);
                if (g2Var != null) {
                    org.telegram.messenger.g0.Z2(activity, g2Var.getClassGuid());
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.v1((w5) this.d);
                org.telegram.messenger.g0.Z2((Activity) this.f3733b, ((v6) this.f3734c).f4148a.getClassGuid());
                return;
            case 2:
                ki.r0 r0Var = (ki.r0) this.f3734c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.f3733b;
                r0Var.getClass();
                if (!zArr[0]) {
                    r0Var.d = true;
                    r0Var.f18966e = false;
                    r0Var.k();
                    Iterator it = r0Var.f18967f.iterator();
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
                w10 w10Var = (w10) this.f3733b;
                if (!((boolean[]) this.f3734c)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    w10Var.a("USER_DECLINED");
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.d;
                Activity activity2 = (Activity) this.f3733b;
                org.telegram.messenger.g0.v1((org.telegram.ui.Components.a5) this.f3734c);
                if (g2Var2 != null) {
                    org.telegram.messenger.g0.Z2(activity2, g2Var2.getClassGuid());
                    return;
                }
                return;
            case 5:
                ((w10) this.f3734c).a(Integer.valueOf(((org.telegram.ui.Components.w3) this.f3733b).getValue() + (((org.telegram.ui.Components.u3) this.d).getValue() * 60)));
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f3734c;
                fi.f7 f7Var = (fi.f7) this.f3733b;
                v0Var.getClass();
                if (!((AtomicBoolean) this.d).get()) {
                    v0Var.x(f7Var, "popup_closed", new JSONObject());
                }
                v0Var.f53581d0 = null;
                v0Var.f53585f0 = System.currentTimeMillis();
                return;
        }
    }
}
