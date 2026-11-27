package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.o;
public final class lt implements DialogInterface.OnDismissListener {
    public final byte a;
    public final o b;

    public lt(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                oVar.l0 = null;
                return;
            default:
                oVar.c.e(true);
                return;
        }
    }
}
