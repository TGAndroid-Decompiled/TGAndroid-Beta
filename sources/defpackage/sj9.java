package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class sj9 implements Runnable {
    public final byte a = 0;
    public final tj9 b;
    public final uj9 c;
    public final View d;

    public sj9(tj9 tj9Var, uj9 uj9Var, View view) {
        this.b = tj9Var;
        this.c = uj9Var;
        this.d = view;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = this.d;
        uj9 uj9Var = this.c;
        tj9 tj9Var = this.b;
        switch (b) {
            case 0:
                tj9Var.getClass();
                if (view != null) {
                    view.post(new sj9(tj9Var, uj9Var, view));
                    return;
                }
                return;
            default:
                if (uj9Var != null) {
                    tj9Var.getClass();
                    k47 k47Var = uj9Var.b;
                    if (k47Var != null) {
                        k47Var.N0 = true;
                    }
                    ArrayList arrayList = uj9Var.n;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        qkb qkbVar = (qkb) obj;
                        if (qkbVar instanceof tj9) {
                            ((tj9) qkbVar).x.clear();
                        }
                    }
                } else {
                    tj9Var.x.clear();
                }
                view.invalidate();
                return;
        }
    }

    public sj9(tj9 tj9Var, View view, uj9 uj9Var) {
        this.b = tj9Var;
        this.d = view;
        this.c = uj9Var;
    }
}
