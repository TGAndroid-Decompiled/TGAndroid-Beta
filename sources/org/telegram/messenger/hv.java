package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;
public final class hv implements Runnable {
    public final int f22981a = 0;
    public final jv f22982b;
    public final kv f22983c;
    public final View d;

    public hv(jv jvVar, View view, kv kvVar) {
        this.f22982b = jvVar;
        this.d = view;
        this.f22983c = kvVar;
    }

    @Override
    public final void run() {
        switch (this.f22981a) {
            case 0:
                jv jvVar = this.f22982b;
                jvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new hv(jvVar, this.f22983c, view));
                    return;
                }
                return;
            default:
                jv jvVar2 = this.f22982b;
                kv kvVar = this.f22983c;
                if (kvVar != null) {
                    jvVar2.getClass();
                    ij ijVar = kvVar.f23757b;
                    if (ijVar != null) {
                        ijVar.L0 = true;
                    }
                    ArrayList arrayList = kvVar.f23767n;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) obj;
                        if (t9Var instanceof jv) {
                            ((jv) t9Var).f23594x.clear();
                        }
                    }
                } else {
                    jvVar2.f23594x.clear();
                }
                this.d.invalidate();
                return;
        }
    }

    public hv(jv jvVar, kv kvVar, View view) {
        this.f22982b = jvVar;
        this.f22983c = kvVar;
        this.d = view;
    }
}
