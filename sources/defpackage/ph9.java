package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class ph9 implements Runnable {
    public final byte a = 0;
    public final qh9 b;
    public final rh9 c;
    public final View d;

    public ph9(qh9 qh9Var, rh9 rh9Var, View view) {
        this.b = qh9Var;
        this.c = rh9Var;
        this.d = view;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = this.d;
        rh9 rh9Var = this.c;
        qh9 qh9Var = this.b;
        switch (b) {
            case 0:
                qh9Var.getClass();
                if (view != null) {
                    view.post(new ph9(qh9Var, rh9Var, view));
                    return;
                }
                return;
            default:
                if (rh9Var != null) {
                    qh9Var.getClass();
                    k27 k27Var = rh9Var.b;
                    if (k27Var != null) {
                        k27Var.N0 = true;
                    }
                    ArrayList arrayList = rh9Var.n;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        pib pibVar = (pib) obj;
                        if (pibVar instanceof qh9) {
                            ((qh9) pibVar).x.clear();
                        }
                    }
                } else {
                    qh9Var.x.clear();
                }
                view.invalidate();
                return;
        }
    }

    public ph9(qh9 qh9Var, View view, rh9 rh9Var) {
        this.b = qh9Var;
        this.d = view;
        this.c = rh9Var;
    }
}
