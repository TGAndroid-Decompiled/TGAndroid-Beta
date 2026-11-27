package defpackage;

import org.telegram.ui.ActionBar.e;
public final class rxb implements Runnable {
    public final byte a;
    public final wxb b;

    public rxb(wxb wxbVar, byte b) {
        this.a = b;
        this.b = wxbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wxb wxbVar = this.b;
        switch (b) {
            case 0:
                new xk8((e) wxbVar, 11, false).show();
                return;
            default:
                wxbVar.e.requestFocus();
                hl.E3(wxbVar.e);
                return;
        }
    }
}
