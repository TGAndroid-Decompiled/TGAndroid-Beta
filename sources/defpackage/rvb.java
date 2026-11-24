package defpackage;

import org.telegram.ui.ActionBar.d;
public final class rvb implements Runnable {
    public final byte a;
    public final wvb b;

    public rvb(wvb wvbVar, byte b) {
        this.a = b;
        this.b = wvbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wvb wvbVar = this.b;
        switch (b) {
            case 0:
                new kj8((d) wvbVar, 11, false).show();
                return;
            default:
                wvbVar.e.requestFocus();
                gm.E3(wvbVar.e);
                return;
        }
    }
}
