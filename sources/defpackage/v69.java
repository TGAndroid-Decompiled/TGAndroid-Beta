package defpackage;

import org.webrtc.RenderSynchronizer;
public final class v69 implements Runnable {
    public final byte a;
    public final RenderSynchronizer b;

    public v69(RenderSynchronizer renderSynchronizer, byte b) {
        this.a = b;
        this.b = renderSynchronizer;
    }

    @Override
    public final void run() {
        byte b = this.a;
        RenderSynchronizer renderSynchronizer = this.b;
        switch (b) {
            case 0:
                RenderSynchronizer.b(renderSynchronizer);
                return;
            default:
                RenderSynchronizer.c(renderSynchronizer);
                return;
        }
    }
}
