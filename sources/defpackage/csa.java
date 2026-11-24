package defpackage;

import android.content.DialogInterface;
public final class csa implements DialogInterface.OnDismissListener {
    public final byte a;
    public final i8c b;
    public final boolean[] c;

    public csa(byte b, i8c i8cVar, boolean[] zArr) {
        this.a = b;
        this.b = i8cVar;
        this.c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        i8c i8cVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    i8cVar.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                if (!zArr[0]) {
                    i8cVar.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    i8cVar.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
