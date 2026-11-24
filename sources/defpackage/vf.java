package defpackage;

import android.content.DialogInterface;
public final class vf implements DialogInterface.OnDismissListener {
    public final byte a = 0;
    public final boolean[] b;
    public final Runnable c;

    public vf(Runnable runnable, boolean[] zArr) {
        this.c = runnable;
        this.b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Runnable runnable = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (runnable != null && zArr[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vf(boolean[] zArr, Runnable runnable) {
        this.b = zArr;
        this.c = runnable;
    }
}
