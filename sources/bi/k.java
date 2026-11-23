package bi;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.y10;
public final class k implements DialogInterface.OnDismissListener {
    public final int f3768a;
    public final Object f3769b;
    public final Object f3770c;
    public final Object d;

    public k(Object obj, Object obj2, Object obj3, int i7) {
        this.f3768a = i7;
        this.f3770c = obj;
        this.d = obj2;
        this.f3769b = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f3768a) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                Activity activity = (Activity) this.f3769b;
                org.telegram.messenger.g0.v1((u) this.f3770c);
                if (g2Var != null) {
                    org.telegram.messenger.g0.Z2(activity, g2Var.getClassGuid());
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.v1((t5) this.d);
                org.telegram.messenger.g0.Z2((Activity) this.f3769b, ((s6) this.f3770c).f4091a.getClassGuid());
                return;
            case 2:
                ki.r0 r0Var = (ki.r0) this.f3770c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.f3769b;
                r0Var.getClass();
                if (!zArr[0]) {
                    r0Var.d = true;
                    r0Var.f18892e = false;
                    r0Var.k();
                    Iterator it = r0Var.f18893f.iterator();
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
                y10 y10Var = (y10) this.f3769b;
                if (!((boolean[]) this.f3770c)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    y10Var.a("USER_DECLINED");
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.d;
                Activity activity2 = (Activity) this.f3769b;
                org.telegram.messenger.g0.v1((org.telegram.ui.Components.b5) this.f3770c);
                if (g2Var2 != null) {
                    org.telegram.messenger.g0.Z2(activity2, g2Var2.getClassGuid());
                    return;
                }
                return;
            case 5:
                ((y10) this.f3770c).a(Integer.valueOf(((org.telegram.ui.Components.x3) this.f3769b).getValue() + (((org.telegram.ui.Components.v3) this.d).getValue() * 60)));
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f3770c;
                fi.f7 f7Var = (fi.f7) this.f3769b;
                v0Var.getClass();
                if (!((AtomicBoolean) this.d).get()) {
                    v0Var.x(f7Var, "popup_closed", new JSONObject());
                }
                v0Var.f53347d0 = null;
                v0Var.f53351f0 = System.currentTimeMillis();
                return;
        }
    }
}
