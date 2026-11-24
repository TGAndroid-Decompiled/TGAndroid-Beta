package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
public final class op2 implements cq9 {
    public final byte a;
    public final Object b;

    public op2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Bundle c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                qp2 qp2Var = ((wp2) obj).x;
                qp2Var.getClass();
                HashMap hashMap = qp2Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(qp2Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) qp2Var.g.clone());
                return bundle;
            case 1:
                en4 en4Var = (en4) obj;
                do {
                } while (en4.v(en4Var.u()));
                en4Var.L.e(u06.ON_STOP);
                return new Bundle();
            case 2:
                return ((go4) obj).Y();
            default:
                return wp9.a((wp9) obj);
        }
    }
}
