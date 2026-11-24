package defpackage;

import android.content.DialogInterface;
public final class be implements DialogInterface.OnShowListener {
    public final byte a;
    public final hj b;

    public be(hj hjVar, byte b) {
        this.a = b;
        this.b = hjVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        hj hjVar = this.b;
        switch (b) {
            case 0:
                hjVar.requestFocus();
                gl.E3(hjVar);
                return;
            case 1:
                hjVar.requestFocus();
                gl.E3(hjVar);
                return;
            default:
                gl.c3(new b1(hjVar, (byte) 10));
                return;
        }
    }
}
