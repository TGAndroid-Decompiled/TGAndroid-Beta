package defpackage;

import android.os.HandlerThread;
public final class qy implements sdb {
    public final byte a;
    public final int b;

    public qy(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final Object get() {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new HandlerThread(sy.o(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(sy.o(i, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
