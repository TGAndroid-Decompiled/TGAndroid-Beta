package defpackage;

import org.telegram.ui.ActionBar.d;
public final class qtb implements Runnable {
    public final byte a;
    public final vtb b;

    public qtb(vtb vtbVar, byte b) {
        this.a = b;
        this.b = vtbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vtb vtbVar = this.b;
        switch (b) {
            case 0:
                new jh8((d) vtbVar, 11, false).show();
                return;
            default:
                vtbVar.e.requestFocus();
                gl.E3(vtbVar.e);
                return;
        }
    }
}
