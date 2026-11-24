package defpackage;

import android.os.HandlerThread;
public final class px implements qbb {
    public final byte a;
    public final int b;

    public px(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final Object get() {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new HandlerThread(rx.o(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(rx.o(i, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
