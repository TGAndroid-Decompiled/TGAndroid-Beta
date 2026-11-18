package org.telegram.messenger;

import android.view.View;
public final class a9 implements View.OnClickListener {
    public final int f22851a;
    public final Object f22852b;

    public a9(Object obj, int i7) {
        this.f22851a = i7;
        this.f22852b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22851a) {
            case 0:
                ((b9) this.f22852b).J0();
                return;
            default:
                boolean[] zArr = (boolean[]) this.f22852b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                return;
        }
    }
}
