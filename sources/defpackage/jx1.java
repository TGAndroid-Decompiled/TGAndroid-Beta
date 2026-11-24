package defpackage;

import android.widget.FrameLayout;
public final class jx1 implements Runnable {
    public final byte a;
    public final FrameLayout b;

    public jx1(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override
    public final void run() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                gl.B2(frameLayout);
                return;
            default:
                gl.B2(frameLayout);
                return;
        }
    }
}
