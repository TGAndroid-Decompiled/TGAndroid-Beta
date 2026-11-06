package hi;

import android.app.Activity;
import android.content.DialogInterface;
import di.o7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.u4;
public final class o0 implements DialogInterface.OnDismissListener {
    public final int f14833a;
    public final Object f14834b;
    public final Object f14835c;
    public final Object d;

    public o0(Object obj, Object obj2, Object obj3, int i7) {
        this.f14833a = i7;
        this.f14835c = obj;
        this.f14834b = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14833a) {
            case 0:
                r0 r0Var = (r0) this.f14835c;
                boolean[] zArr = (boolean[]) this.f14834b;
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) this.d;
                r0Var.getClass();
                if (!zArr[0]) {
                    r0Var.d = true;
                    r0Var.f14920e = false;
                    r0Var.k();
                    Iterator it = r0Var.f14921f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    nVar.a(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) this.f14835c;
                c20 c20Var = (c20) this.d;
                if (!((boolean[]) this.f14834b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    c20Var.a("USER_DECLINED");
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f14834b;
                Activity activity = (Activity) this.d;
                org.telegram.messenger.g0.v1((u4) this.f14835c);
                if (f2Var != null) {
                    org.telegram.messenger.g0.a3(activity, f2Var.getClassGuid());
                    return;
                }
                return;
            case 3:
                ((c20) this.f14835c).a(Integer.valueOf(((org.telegram.ui.Components.q3) this.d).getValue() + (((org.telegram.ui.Components.o3) this.f14834b).getValue() * 60)));
                return;
            case 4:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f14835c;
                o7 o7Var = (o7) this.d;
                x0Var.getClass();
                if (!((AtomicBoolean) this.f14834b).get()) {
                    x0Var.x(o7Var, "popup_closed", new JSONObject());
                }
                x0Var.f51358c0 = null;
                x0Var.f51361e0 = System.currentTimeMillis();
                return;
            case 5:
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.f14834b;
                Activity activity2 = (Activity) this.d;
                org.telegram.messenger.g0.v1((z5) this.f14835c);
                if (f2Var2 != null) {
                    org.telegram.messenger.g0.a3(activity2, f2Var2.getClassGuid());
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.v1((zh.o1) this.f14834b);
                org.telegram.messenger.g0.a3((Activity) this.d, ((zh.f2) this.f14835c).f60211a.getClassGuid());
                return;
        }
    }

    public o0(boolean[] zArr, boolean[] zArr2, c20 c20Var) {
        this.f14833a = 1;
        this.f14834b = zArr;
        this.f14835c = zArr2;
        this.d = c20Var;
    }
}
