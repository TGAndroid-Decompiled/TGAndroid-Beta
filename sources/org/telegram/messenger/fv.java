package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;
public final class fv implements Runnable {
    public final int f23553a = 0;
    public final hv f23554b;
    public final iv f23555c;
    public final View d;

    public fv(hv hvVar, View view, iv ivVar) {
        this.f23554b = hvVar;
        this.d = view;
        this.f23555c = ivVar;
    }

    @Override
    public final void run() {
        switch (this.f23553a) {
            case 0:
                hv hvVar = this.f23554b;
                hvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new fv(hvVar, this.f23555c, view));
                    return;
                }
                return;
            default:
                hv hvVar2 = this.f23554b;
                iv ivVar = this.f23555c;
                if (ivVar != null) {
                    hvVar2.getClass();
                    gj gjVar = ivVar.f24441b;
                    if (gjVar != null) {
                        gjVar.N0 = true;
                    }
                    ArrayList arrayList = ivVar.f24451n;
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
        this.f23554b = hvVar;
        this.f23555c = ivVar;
        this.d = view;
    }
}
