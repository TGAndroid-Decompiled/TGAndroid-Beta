package defpackage;

import org.telegram.ui.StickersActivity;
public final class b2b implements Runnable {
    public final byte a;
    public final StickersActivity b;

    public b2b(StickersActivity stickersActivity, byte b) {
        this.a = b;
        this.b = stickersActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        StickersActivity stickersActivity = this.b;
        switch (b) {
            case 0:
                stickersActivity.p0();
                return;
            default:
                stickersActivity.n--;
                return;
        }
    }
}
