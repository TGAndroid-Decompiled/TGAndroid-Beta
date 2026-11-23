package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;
public final class cv implements Runnable {
    public final int f23339a = 0;
    public final ev f23340b;
    public final fv f23341c;
    public final View d;

    public cv(ev evVar, View view, fv fvVar) {
        this.f23340b = evVar;
        this.d = view;
        this.f23341c = fvVar;
    }

    @Override
    public final void run() {
        switch (this.f23339a) {
            case 0:
                ev evVar = this.f23340b;
                evVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new cv(evVar, this.f23341c, view));
                    return;
                }
                return;
            default:
                ev evVar2 = this.f23340b;
                fv fvVar = this.f23341c;
                if (fvVar != null) {
                    evVar2.getClass();
                    gj gjVar = fvVar.f23941b;
                    if (gjVar != null) {
                        gjVar.N0 = true;
                    }
                    ArrayList arrayList = fvVar.f23951n;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                        if (u9Var instanceof ev) {
                            ((ev) u9Var).f23742x.clear();
                        }
                    }
                } else {
                    evVar2.f23742x.clear();
                }
                this.d.invalidate();
                return;
        }
    }

    public cv(ev evVar, fv fvVar, View view) {
        this.f23340b = evVar;
        this.f23341c = fvVar;
        this.d = view;
    }
}
