package defpackage;

import android.content.DialogInterface;
public final class ux0 implements DialogInterface.OnDismissListener {
    public final byte a = 1;
    public final pcc b;
    public final boolean[] c;

    public ux0(pcc pccVar, boolean[] zArr) {
        this.b = pccVar;
        this.c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    pccVar.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    pccVar.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public ux0(boolean[] zArr, pcc pccVar) {
        this.c = zArr;
        this.b = pccVar;
    }
}
