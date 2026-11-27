package defpackage;

import android.os.HandlerThread;
public final class qx implements mfb {
    public final byte a;
    public final int b;

    public qx(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final Object get() {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new HandlerThread(sx.o(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(sx.o(i, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
