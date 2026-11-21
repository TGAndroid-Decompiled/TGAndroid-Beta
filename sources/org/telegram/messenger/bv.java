package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;
public final class bv implements Runnable {
    public final int f23161a = 0;
    public final dv f23162b;
    public final ev f23163c;
    public final View d;

    public bv(dv dvVar, View view, ev evVar) {
        this.f23162b = dvVar;
        this.d = view;
        this.f23163c = evVar;
    }

    @Override
    public final void run() {
        switch (this.f23161a) {
            case 0:
                dv dvVar = this.f23162b;
                dvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new bv(dvVar, this.f23163c, view));
                    return;
                }
                return;
            default:
                dv dvVar2 = this.f23162b;
                ev evVar = this.f23163c;
                if (evVar != null) {
                    dvVar2.getClass();
                    fj fjVar = evVar.f23796b;
                    if (fjVar != null) {
                        fjVar.N0 = true;
                    }
                    ArrayList arrayList = evVar.f23806n;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                        if (u9Var instanceof dv) {
                            ((dv) u9Var).f23613x.clear();
                        }
                    }
                } else {
                    dvVar2.f23613x.clear();
                }
                this.d.invalidate();
                return;
        }
    }

    public bv(dv dvVar, ev evVar, View view) {
        this.f23162b = dvVar;
        this.f23163c = evVar;
        this.d = view;
    }
}
