package defpackage;

import org.telegram.ui.ActionBar.e;
public final class re implements Runnable {
    public final byte a;
    public final ij b;
    public final id c;
    public final e d;

    public re(ij ijVar, id idVar, e eVar, byte b) {
        this.a = b;
        this.b = ijVar;
        this.c = idVar;
        this.d = eVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e eVar = this.d;
        id idVar = this.c;
        ij ijVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new re(ijVar, idVar, eVar, (byte) 1));
                return;
            default:
                jj.b0(ijVar, idVar, eVar);
                return;
        }
    }
}
