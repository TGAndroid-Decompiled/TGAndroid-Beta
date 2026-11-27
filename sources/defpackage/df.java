package defpackage;

import android.content.DialogInterface;
public final class df implements DialogInterface.OnShowListener {
    public final byte a;
    public final ij b;

    public df(ij ijVar, byte b) {
        this.a = b;
        this.b = ijVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        ij ijVar = this.b;
        switch (b) {
            case 0:
                ijVar.requestFocus();
                hl.E3(ijVar);
                return;
            case 1:
                ijVar.requestFocus();
                hl.E3(ijVar);
                return;
            default:
                hl.c3(new c1(ijVar, (byte) 10));
                return;
        }
    }
}
