package org.telegram.messenger;

import android.view.View;
public final class a9 implements View.OnClickListener {
    public final int f22482a;
    public final Object f22483b;

    public a9(Object obj, int i7) {
        this.f22482a = i7;
        this.f22483b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22482a) {
            case 0:
                ((b9) this.f22483b).I0();
                return;
            default:
                boolean[] zArr = (boolean[]) this.f22483b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                return;
        }
    }
}
