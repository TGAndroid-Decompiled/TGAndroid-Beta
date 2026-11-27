package defpackage;

import android.content.DialogInterface;
public final class cab implements DialogInterface.OnDismissListener {
    public final byte a;
    public final sbb b;

    public cab(sbb sbbVar, byte b) {
        this.a = b;
        this.b = sbbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                hbb hbbVar = sbbVar.Y0;
                if (hbbVar != null) {
                    hbbVar.x(4, false);
                    return;
                }
                return;
            default:
                sbbVar.Y0.x(3, false);
                sbbVar.r0 = null;
                return;
        }
    }
}
