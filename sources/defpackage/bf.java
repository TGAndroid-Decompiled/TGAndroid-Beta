package defpackage;

import android.content.DialogInterface;
public final class bf implements DialogInterface.OnShowListener {
    public final byte a;
    public final hk b;

    public bf(hk hkVar, byte b) {
        this.a = b;
        this.b = hkVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        hk hkVar = this.b;
        switch (b) {
            case 0:
                hkVar.requestFocus();
                gm.E3(hkVar);
                return;
            case 1:
                hkVar.requestFocus();
                gm.E3(hkVar);
                return;
            default:
                gm.c3(new b1(hkVar, (byte) 12));
                return;
        }
    }
}
