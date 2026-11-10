package hi;

import android.app.Activity;
import android.content.DialogInterface;
import di.p7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.t4;
public final class o0 implements DialogInterface.OnDismissListener {
    public final int f14838a;
    public final Object f14839b;
    public final Object f14840c;
    public final Object d;

    public o0(Object obj, Object obj2, Object obj3, int i7) {
        this.f14838a = i7;
        this.f14840c = obj;
        this.f14839b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14838a) {
            case 0:
                r0 r0Var = (r0) this.f14840c;
                boolean[] zArr = (boolean[]) this.f14839b;
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) this.d;
                r0Var.getClass();
                if (!zArr[0]) {
                    r0Var.d = true;
                    r0Var.f14925e = false;
                    r0Var.k();
                    Iterator it = r0Var.f14926f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    nVar.a(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f14840c;
                c20 c20Var = (c20) this.d;
                if (!((boolean[]) this.f14839b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    c20Var.a("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f14839b;
                Activity activity = (Activity) this.d;
                org.telegram.messenger.g0.v1((t4) this.f14840c);
                if (f2Var != null) {
                    org.telegram.messenger.g0.a3(activity, f2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((c20) this.f14840c).a(Integer.valueOf(((org.telegram.ui.Components.p3) this.d).getValue() + (((org.telegram.ui.Components.n3) this.f14839b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f14840c;
                p7 p7Var = (p7) this.d;
                x0Var.getClass();
                if (!((AtomicBoolean) this.f14839b).get()) {
                    x0Var.x(p7Var, "popup_closed", new JSONObject());
                }
                x0Var.f51300c0 = null;
                x0Var.f51303e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.f14839b;
                Activity activity2 = (Activity) this.d;
                org.telegram.messenger.g0.v1((z5) this.f14840c);
                if (f2Var2 != null) {
                    org.telegram.messenger.g0.a3(activity2, f2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.v1((zh.n1) this.f14839b);
                org.telegram.messenger.g0.a3((Activity) this.d, ((zh.d2) this.f14840c).f60294a.getClassGuid());
                return;
        }
    }

    public o0(boolean[] zArr, boolean[] zArr2, c20 c20Var) {
        this.f14838a = 1;
        this.f14839b = zArr;
        this.f14840c = zArr2;
        this.d = c20Var;
    }
}
