package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;
public final class tv implements Runnable {
    public final int f18310a = 0;
    public final vv f18311b;
    public final wv f18312c;
    public final View d;

    public tv(vv vvVar, View view, wv wvVar) {
        this.f18311b = vvVar;
        this.d = view;
        this.f18312c = wvVar;
    }

    @Override
    public final void run() {
        switch (this.f18310a) {
            case 0:
                vv vvVar = this.f18311b;
                vvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new tv(vvVar, this.f18312c, view));
                    return;
                }
                return;
            default:
                vv vvVar2 = this.f18311b;
                wv wvVar = this.f18312c;
                if (wvVar != null) {
                    vvVar2.getClass();
                    kj kjVar = wvVar.f19330b;
                    if (kjVar != null) {
                        kjVar.L0 = true;
                    }
                    ArrayList arrayList = wvVar.f19339n;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                        if (u9Var instanceof vv) {
                            ((vv) u9Var).f18911x.clear();
                        }
                    }
                } else {
                    vvVar2.f18911x.clear();
                }
                this.d.invalidate();
                return;
        }
    }

    public tv(vv vvVar, wv wvVar, View view) {
        this.f18311b = vvVar;
        this.f18312c = wvVar;
        this.d = view;
    }
}
