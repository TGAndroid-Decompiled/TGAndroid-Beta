package defpackage;

import android.content.DialogInterface;
public final class eua implements DialogInterface.OnDismissListener {
    public final byte a;
    public final jac b;
    public final boolean[] c;

    public eua(byte b, jac jacVar, boolean[] zArr) {
        this.a = b;
        this.b = jacVar;
        this.c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        jac jacVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    jacVar.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                if (!zArr[0]) {
                    jacVar.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    jacVar.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
