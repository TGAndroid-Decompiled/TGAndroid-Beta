package defpackage;

import android.view.View;
public final class xu1 implements nac {
    public final byte a;
    public final v9b b;
    public final View c;
    public final my0 d;

    public xu1(my0 my0Var, v9b v9bVar, View view, byte b) {
        this.a = b;
        this.d = my0Var;
        this.b = v9bVar;
        this.c = view;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        o9b o9bVar = null;
        View view = this.c;
        v9b v9bVar = this.b;
        my0 my0Var = this.d;
        switch (b) {
            case 0:
                cv1 cv1Var = (cv1) my0Var;
                Long l = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l2 = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    gm.c3(new uj1(cv1Var, l2, (byte) 24));
                    cv1Var.dismiss();
                    v9bVar.X(null);
                } else {
                    if ((view instanceof wca) && view.isAttachedToWindow()) {
                        o9bVar = q9b.b((wca) view);
                    }
                    v9bVar.X(o9bVar);
                }
                gm.c3(runnable);
                return;
            default:
                wsa wsaVar = (wsa) my0Var;
                Long l3 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Long l4 = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    gm.c3(new e6a(wsaVar, l4, (byte) 13));
                    v9bVar.X(null);
                    yqa yqaVar = wsaVar.U2;
                    if (yqaVar != null) {
                        yqaVar.dismiss();
                        wsaVar.U2 = null;
                    }
                } else {
                    if ((view instanceof wca) && view.isAttachedToWindow()) {
                        o9bVar = q9b.b((wca) view);
                    }
                    v9bVar.X(o9bVar);
                }
                gm.c3(runnable2);
                return;
        }
    }
}
