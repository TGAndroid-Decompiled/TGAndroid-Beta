package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;
public final class hv implements Runnable {
    public final int f22976a = 0;
    public final jv f22977b;
    public final kv f22978c;
    public final View d;

    public hv(jv jvVar, View view, kv kvVar) {
        this.f22977b = jvVar;
        this.d = view;
        this.f22978c = kvVar;
    }

    @Override
    public final void run() {
        switch (this.f22976a) {
            case 0:
                jv jvVar = this.f22977b;
                jvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new hv(jvVar, this.f22978c, view));
                    return;
                }
                return;
            default:
                jv jvVar2 = this.f22977b;
                kv kvVar = this.f22978c;
                if (kvVar != null) {
                    jvVar2.getClass();
                    ij ijVar = kvVar.f23768b;
                    if (ijVar != null) {
                        ijVar.L0 = true;
                    }
                    ArrayList arrayList = kvVar.f23778n;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) obj;
                        if (t9Var instanceof jv) {
                            ((jv) t9Var).f23617x.clear();
                        }
                    }
                } else {
                    jvVar2.f23617x.clear();
                }
                this.d.invalidate();
                return;
        }
    }

    public hv(jv jvVar, kv kvVar, View view) {
        this.f22977b = jvVar;
        this.f22978c = kvVar;
        this.d = view;
    }
}
