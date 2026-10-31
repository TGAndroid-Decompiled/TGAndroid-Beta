package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;
public final class sv implements Runnable {
    public final int f17959a = 0;
    public final uv f17960b;
    public final vv f17961c;
    public final View d;

    public sv(uv uvVar, View view, vv vvVar) {
        this.f17960b = uvVar;
        this.d = view;
        this.f17961c = vvVar;
    }

    @Override
    public final void run() {
        switch (this.f17959a) {
            case 0:
                uv uvVar = this.f17960b;
                uvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new sv(uvVar, this.f17961c, view));
                    return;
                }
                return;
            default:
                uv uvVar2 = this.f17960b;
                vv vvVar = this.f17961c;
                if (vvVar != null) {
                    uvVar2.getClass();
                    jj jjVar = vvVar.f18987b;
                    if (jjVar != null) {
                        jjVar.L0 = true;
                    }
                    ArrayList arrayList = vvVar.f18996n;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                        if (u9Var instanceof uv) {
                            ((uv) u9Var).f18403x.clear();
                        }
                    }
                } else {
                    uvVar2.f18403x.clear();
                }
                this.d.invalidate();
                return;
        }
    }

    public sv(uv uvVar, vv vvVar, View view) {
        this.f17960b = uvVar;
        this.f17961c = vvVar;
        this.d = view;
    }
}
