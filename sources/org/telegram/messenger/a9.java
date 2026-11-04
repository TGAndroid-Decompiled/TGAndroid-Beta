package org.telegram.messenger;

import android.view.View;
public final class a9 implements View.OnClickListener {
    public final int f21481a;
    public final Object f21482b;

    public a9(Object obj, int i3) {
        this.f21481a = i3;
        this.f21482b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21481a) {
            case 0:
                ((b9) this.f21482b).I0();
                return;
            default:
                boolean[] zArr = (boolean[]) this.f21482b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                return;
        }
    }
}
