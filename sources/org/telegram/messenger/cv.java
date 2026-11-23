package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;
public final class cv implements Runnable {
    public final int f23375a = 0;
    public final ev f23376b;
    public final fv f23377c;
    public final View d;

    public cv(ev evVar, View view, fv fvVar) {
        this.f23376b = evVar;
        this.d = view;
        this.f23377c = fvVar;
    }

    @Override
    public final void run() {
        switch (this.f23375a) {
            case 0:
                ev evVar = this.f23376b;
                evVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new cv(evVar, this.f23377c, view));
                    return;
                }
                return;
            default:
                ev evVar2 = this.f23376b;
                fv fvVar = this.f23377c;
                if (fvVar != null) {
                    evVar2.getClass();
                    gj gjVar = fvVar.f23977b;
                    if (gjVar != null) {
                        gjVar.N0 = true;
                    }
                    ArrayList arrayList = fvVar.f23987n;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                        if (u9Var instanceof ev) {
                            ((ev) u9Var).f23778x.clear();
                        }
                    }
                } else {
                    evVar2.f23778x.clear();
                }
                this.d.invalidate();
                return;
        }
    }

    public cv(ev evVar, fv fvVar, View view) {
        this.f23376b = evVar;
        this.f23377c = fvVar;
        this.d = view;
    }
}
