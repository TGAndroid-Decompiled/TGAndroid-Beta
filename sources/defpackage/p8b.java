package defpackage;

import android.content.DialogInterface;
public final class p8b implements DialogInterface.OnDismissListener {
    public final byte a;
    public final v9b b;

    public p8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.Y0.x(3, false);
                v9bVar.r0 = null;
                return;
            default:
                k9b k9bVar = v9bVar.Y0;
                if (k9bVar != null) {
                    k9bVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
