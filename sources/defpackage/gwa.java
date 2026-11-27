package defpackage;

import android.content.DialogInterface;
public final class gwa implements DialogInterface.OnDismissListener {
    public final byte a;
    public final icc b;
    public final boolean[] c;

    public gwa(byte b, icc iccVar, boolean[] zArr) {
        this.a = b;
        this.b = iccVar;
        this.c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    iccVar.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                if (!zArr[0]) {
                    iccVar.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    iccVar.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
