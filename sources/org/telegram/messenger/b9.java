package org.telegram.messenger;

import android.view.View;
public final class b9 implements View.OnClickListener {
    public final int f21603a;
    public final Object f21604b;

    public b9(Object obj, int i7) {
        this.f21603a = i7;
        this.f21604b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21603a) {
            case 0:
                ((c9) this.f21604b).I0();
                return;
            default:
                boolean[] zArr = (boolean[]) this.f21604b;
                boolean z9 = !zArr[0];
                zArr[0] = z9;
                ((org.telegram.ui.Cells.c2) view).c(z9, true);
                return;
        }
    }
}
