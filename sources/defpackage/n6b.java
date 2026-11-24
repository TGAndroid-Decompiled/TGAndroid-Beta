package defpackage;

import android.content.DialogInterface;
public final class n6b implements DialogInterface.OnDismissListener {
    public final byte a;
    public final t7b b;

    public n6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.Y0.x(3, false);
                t7bVar.r0 = null;
                return;
            default:
                i7b i7bVar = t7bVar.Y0;
                if (i7bVar != null) {
                    i7bVar.x(4, false);
                    return;
                }
                return;
        }
    }
}
