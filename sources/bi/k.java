package bi;

import android.app.Activity;
import android.content.DialogInterface;
import fi.i7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.z10;
public final class k implements DialogInterface.OnDismissListener {
    public final int f3640a;
    public final Object f3641b;
    public final Object f3642c;
    public final Object d;

    public k(Object obj, Object obj2, Object obj3, int i7) {
        this.f3640a = i7;
        this.f3642c = obj;
        this.d = obj2;
        this.f3641b = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f3640a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                Activity activity = (Activity) this.f3641b;
                org.telegram.messenger.g0.v1((u) this.f3642c);
                if (e2Var != null) {
                    org.telegram.messenger.g0.a3(activity, e2Var.getClassGuid());
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.v1((j3) this.d);
                org.telegram.messenger.g0.a3((Activity) this.f3641b, ((i4) this.f3642c).f3610a.getClassGuid());
                return;
            case 2:
                ki.s0 s0Var = (ki.s0) this.f3642c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.f3641b;
                s0Var.getClass();
                if (!zArr[0]) {
                    s0Var.d = true;
                    s0Var.f18541e = false;
                    s0Var.k();
                    Iterator it = s0Var.f18542f.iterator();
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
                z10 z10Var = (z10) this.f3641b;
                if (!((boolean[]) this.f3642c)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    z10Var.a("USER_DECLINED");
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.d;
                Activity activity2 = (Activity) this.f3641b;
                org.telegram.messenger.g0.v1((org.telegram.ui.Components.s4) this.f3642c);
                if (e2Var2 != null) {
                    org.telegram.messenger.g0.a3(activity2, e2Var2.getClassGuid());
                    return;
                }
                return;
            case 5:
                ((z10) this.f3642c).a(Integer.valueOf(((org.telegram.ui.Components.o3) this.f3641b).getValue() + (((org.telegram.ui.Components.m3) this.d).getValue() * 60)));
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f3642c;
                i7 i7Var = (i7) this.f3641b;
                v0Var.getClass();
                if (!((AtomicBoolean) this.d).get()) {
                    v0Var.x(i7Var, "popup_closed", new JSONObject());
                }
                v0Var.f52820d0 = null;
                v0Var.f52824f0 = System.currentTimeMillis();
                return;
        }
    }
}
