package org.telegram.messenger;

import android.view.View;
public final class a9 implements View.OnClickListener {
    public final int f22848a;
    public final Object f22849b;

    public a9(Object obj, int i7) {
        this.f22848a = i7;
        this.f22849b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22848a) {
            case 0:
                ((b9) this.f22849b).J0();
                return;
            default:
                boolean[] zArr = (boolean[]) this.f22849b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.d2) view).c(z10, true);
                return;
        }
    }
}
