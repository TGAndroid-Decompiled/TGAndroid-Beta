package defpackage;

import androidx.appcompat.widget.Toolbar;
public final class cvb implements Runnable {
    public final byte a;
    public final Toolbar b;

    public cvb(Toolbar toolbar, byte b) {
        this.a = b;
        this.b = toolbar;
    }

    @Override
    public final void run() {
        c27 c27Var;
        byte b = this.a;
        Toolbar toolbar = this.b;
        switch (b) {
            case 0:
                evb evbVar = toolbar.f0;
                if (evbVar == null) {
                    c27Var = null;
                } else {
                    c27Var = evbVar.b;
                }
                if (c27Var != null) {
                    c27Var.collapseActionView();
                    return;
                }
                return;
            default:
                toolbar.m();
                return;
        }
    }
}
