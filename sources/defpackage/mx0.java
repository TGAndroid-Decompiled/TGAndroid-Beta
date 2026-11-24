package defpackage;

import android.content.DialogInterface;
public final class mx0 implements DialogInterface.OnDismissListener {
    public final byte a = 1;
    public final p8c b;
    public final boolean[] c;

    public mx0(p8c p8cVar, boolean[] zArr) {
        this.b = p8cVar;
        this.c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    p8cVar.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    p8cVar.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public mx0(boolean[] zArr, p8c p8cVar) {
        this.c = zArr;
        this.b = p8cVar;
    }
}
