package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.o;
public final class at implements DialogInterface.OnDismissListener {
    public final byte a;
    public final o b;

    public at(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                oVar.c.e(true);
                return;
            default:
                oVar.l0 = null;
                return;
        }
    }
}
