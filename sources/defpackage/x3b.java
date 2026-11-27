package defpackage;

import org.telegram.ui.StickersActivity;
public final class x3b implements Runnable {
    public final byte a;
    public final StickersActivity b;

    public x3b(StickersActivity stickersActivity, byte b) {
        this.a = b;
        this.b = stickersActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        StickersActivity stickersActivity = this.b;
        switch (b) {
            case 0:
                stickersActivity.o0();
                return;
            default:
                stickersActivity.n--;
                return;
        }
    }
}
