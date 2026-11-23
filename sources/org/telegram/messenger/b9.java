package org.telegram.messenger;

import android.view.View;
public final class b9 implements View.OnClickListener {
    public final int f23063a;
    public final Object f23064b;

    public b9(Object obj, int i7) {
        this.f23063a = i7;
        this.f23064b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23063a) {
            case 0:
                ((c9) this.f23064b).J0();
                return;
            default:
                boolean[] zArr = (boolean[]) this.f23064b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.d2) view).c(z10, true);
                return;
        }
    }
}
