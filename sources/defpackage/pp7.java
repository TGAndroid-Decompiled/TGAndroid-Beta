package defpackage;

import android.content.DialogInterface;
public final class pp7 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final boolean[] b;
    public final long c;

    public pp7(boolean[] zArr, long j, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = j;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        long j = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    vp7.g(j);
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    vp7.g(j);
                    return;
                }
                return;
        }
    }
}
