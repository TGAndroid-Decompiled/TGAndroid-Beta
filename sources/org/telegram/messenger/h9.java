package org.telegram.messenger;

import android.view.View;
public final class h9 implements View.OnClickListener {
    public final int f16036a;
    public final Object f16037b;

    public h9(Object obj, int i10) {
        this.f16036a = i10;
        this.f16037b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f16036a) {
            case 0:
                ((i9) this.f16037b).I0();
                return;
            default:
                boolean[] zArr = (boolean[]) this.f16037b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                return;
        }
    }
}
