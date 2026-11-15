package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;
public final class fv implements Runnable {
    public final int f23555a = 0;
    public final hv f23556b;
    public final iv f23557c;
    public final View d;

    public fv(hv hvVar, View view, iv ivVar) {
        this.f23556b = hvVar;
        this.d = view;
        this.f23557c = ivVar;
    }

    @Override
    public final void run() {
        switch (this.f23555a) {
            case 0:
                hv hvVar = this.f23556b;
                hvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new fv(hvVar, this.f23557c, view));
                    return;
                }
                return;
            default:
                hv hvVar2 = this.f23556b;
                iv ivVar = this.f23557c;
                if (ivVar != null) {
                    hvVar2.getClass();
                    gj gjVar = ivVar.f24446b;
                    if (gjVar != null) {
                        gjVar.N0 = true;
                    }
                    ArrayList arrayList = ivVar.f24456n;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) obj;
                        if (s9Var instanceof hv) {
                            ((hv) s9Var).f24230x.clear();
                        }
                    }
                } else {
                    hvVar2.f24230x.clear();
                }
                this.d.invalidate();
                return;
        }
    }

    public fv(hv hvVar, iv ivVar, View view) {
        this.f23556b = hvVar;
        this.f23557c = ivVar;
        this.d = view;
    }
}
