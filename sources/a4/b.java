package a4;

import android.os.HandlerThread;
public final class b implements p8.i {
    public final int f52a;
    public final int f53b;

    public b(int i10, int i11) {
        this.f52a = i11;
        this.f53b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f52a) {
            case 0:
                return new HandlerThread(c.j(this.f53b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.j(this.f53b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
