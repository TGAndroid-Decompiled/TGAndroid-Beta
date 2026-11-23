package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;
public final class bv implements Runnable {
    public final int f23258a = 0;
    public final dv f23259b;
    public final ev f23260c;
    public final View d;

    public bv(dv dvVar, View view, ev evVar) {
        this.f23259b = dvVar;
        this.d = view;
        this.f23260c = evVar;
    }

    @Override
    public final void run() {
        switch (this.f23258a) {
            case 0:
                dv dvVar = this.f23259b;
                dvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new bv(dvVar, this.f23260c, view));
                    return;
                }
                return;
            default:
                dv dvVar2 = this.f23259b;
                ev evVar = this.f23260c;
                if (evVar != null) {
                    dvVar2.getClass();
                    fj fjVar = evVar.f23873b;
                    if (fjVar != null) {
                        fjVar.N0 = true;
                    }
                    ArrayList arrayList = evVar.f23883n;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) obj;
                        if (t9Var instanceof dv) {
                            ((dv) t9Var).f23714x.clear();
                        }
                    }
                } else {
                    dvVar2.f23714x.clear();
                }
                this.d.invalidate();
                return;
        }
    }

    public bv(dv dvVar, ev evVar, View view) {
        this.f23259b = dvVar;
        this.f23260c = evVar;
        this.d = view;
    }
}
