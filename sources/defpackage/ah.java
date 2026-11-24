package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.ui.ActionBar.d;
public final class ah implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ah(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                d dVar = (d) obj2;
                Activity activity = (Activity) obj;
                gm.t1((hk) obj3);
                if (dVar != null) {
                    gm.V2(activity, dVar.getClassGuid());
                    return;
                }
                return;
            case 1:
                ((qac) obj3).a(Integer.valueOf(((aj) obj).getValue() + (((yi) obj2).getValue() * 60)));
                return;
            case 2:
                d dVar2 = (d) obj2;
                Activity activity2 = (Activity) obj;
                gm.t1((pz) obj3);
                if (dVar2 != null) {
                    gm.V2(activity2, dVar2.getClassGuid());
                    return;
                }
                return;
            case 3:
                tr0 tr0Var = (tr0) obj3;
                boolean[] zArr = (boolean[]) obj2;
                yu0 yu0Var = (yu0) obj;
                tr0Var.getClass();
                if (!zArr[0]) {
                    tr0Var.d = true;
                    tr0Var.e = false;
                    tr0Var.j();
                    Iterator it = tr0Var.f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    yu0Var.a(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            case 4:
                qw0 qw0Var = (qw0) obj3;
                ow0 ow0Var = (ow0) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    qw0Var.u(ow0Var, "popup_closed", new JSONObject());
                }
                qw0Var.d0 = null;
                qw0Var.f0 = System.currentTimeMillis();
                return;
            case 5:
                lh6 lh6Var = (lh6) obj3;
                boolean[] zArr2 = (boolean[]) obj;
                if (lh6Var.d0 == ((he) obj2)) {
                    lh6Var.d0 = null;
                }
                if (!zArr2[0] && lh6Var.o()) {
                    lh6Var.t(false);
                    return;
                }
                return;
            case 6:
                gm.t1((fs8) obj2);
                gm.V2((Activity) obj, ((vs8) obj3).a.getClassGuid());
                return;
            default:
                boolean[] zArr3 = (boolean[]) obj2;
                qac qacVar = (qac) obj;
                if (!((boolean[]) obj3)[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    qacVar.a("USER_DECLINED");
                    return;
                }
                return;
        }
    }
}
