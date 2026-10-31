package org.telegram.messenger;

import android.view.View;
public final class g9 implements View.OnClickListener {
    public final int f15687a;
    public final Object f15688b;

    public g9(Object obj, int i10) {
        this.f15687a = i10;
        this.f15688b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f15687a) {
            case 0:
                ((h9) this.f15688b).I0();
                return;
            default:
                boolean[] zArr = (boolean[]) this.f15688b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                return;
        }
    }
}
