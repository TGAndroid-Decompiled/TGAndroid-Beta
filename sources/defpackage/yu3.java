package defpackage;

import org.webrtc.EglThread;
public final class yu3 implements Runnable {
    public final byte a;
    public final EglThread b;

    public yu3(EglThread eglThread, byte b) {
        this.a = b;
        this.b = eglThread;
    }

    @Override
    public final void run() {
        byte b = this.a;
        EglThread eglThread = this.b;
        switch (b) {
            case 0:
                EglThread.c(eglThread);
                return;
            default:
                EglThread.d(eglThread);
                return;
        }
    }
}
