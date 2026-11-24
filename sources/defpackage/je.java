package defpackage;

import org.telegram.ui.ActionBar.d;
public final class je implements Runnable {
    public final byte a;
    public final hj b;
    public final hd c;
    public final d d;

    public je(hj hjVar, hd hdVar, d dVar, byte b) {
        this.a = b;
        this.b = hjVar;
        this.c = hdVar;
        this.d = dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d dVar = this.d;
        hd hdVar = this.c;
        hj hjVar = this.b;
        switch (b) {
            case 0:
                gl.d3(new je(hjVar, hdVar, dVar, (byte) 1));
                return;
            default:
                ij.b0(hjVar, hdVar, dVar);
                return;
        }
    }
}
