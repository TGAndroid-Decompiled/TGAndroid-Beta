package org.telegram.messenger;

import android.view.View;
public final class a9 implements View.OnClickListener {
    public final int f22876a;
    public final Object f22877b;

    public a9(Object obj, int i7) {
        this.f22876a = i7;
        this.f22877b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22876a) {
            case 0:
                ((b9) this.f22877b).J0();
                return;
            default:
                boolean[] zArr = (boolean[]) this.f22877b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.d2) view).c(z10, true);
                return;
        }
    }
}
