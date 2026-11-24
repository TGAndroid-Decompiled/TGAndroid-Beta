package defpackage;

import android.content.DialogInterface;
public final class ty0 implements DialogInterface.OnDismissListener {
    public final byte a = 1;
    public final qac b;
    public final boolean[] c;

    public ty0(qac qacVar, boolean[] zArr) {
        this.b = qacVar;
        this.c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    qacVar.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    qacVar.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public ty0(boolean[] zArr, qac qacVar) {
        this.c = zArr;
        this.b = qacVar;
    }
}
