package defpackage;

import android.content.DialogInterface;
public final class cab implements DialogInterface.OnDismissListener {
    public final byte a;
    public final rbb b;

    public cab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                gbb gbbVar = rbbVar.Y0;
                if (gbbVar != null) {
                    gbbVar.x(4, false);
                    return;
                }
                return;
            default:
                rbbVar.Y0.x(3, false);
                rbbVar.r0 = null;
                return;
        }
    }
}
