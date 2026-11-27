package defpackage;

import android.content.Context;
import android.view.View;
public final class ocb extends ld6 {
    public final pcb R;

    public ocb(pcb pcbVar, Context context, float f) {
        super(context, f);
        this.R = pcbVar;
    }

    @Override
    public final void invalidate() {
        View view = this.R.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
