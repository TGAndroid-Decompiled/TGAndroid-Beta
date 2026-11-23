package org.telegram.messenger;

import android.view.View;
public final class b9 implements View.OnClickListener {
    public final int f23027a;
    public final Object f23028b;

    public b9(Object obj, int i7) {
        this.f23027a = i7;
        this.f23028b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23027a) {
            case 0:
                ((c9) this.f23028b).J0();
                return;
            default:
                boolean[] zArr = (boolean[]) this.f23028b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.d2) view).c(z10, true);
                return;
        }
    }
}
