package org.telegram.messenger;

public final class x4 implements Runnable {

    public final int f22100a = 0;

    public final long f22101b;

    public final long f22102c;
    public final int d;

    public final String f22103e;

    public x4(int i10, String str, long j10, long j11) {
        this.d = i10;
        this.f22103e = str;
        this.f22101b = j10;
        this.f22102c = j11;
    }

    @Override
    public final void run() {
        switch (this.f22100a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f22103e, this.f22101b, this.f22102c);
                break;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f22101b, this.f22102c, this.d, this.f22103e);
                break;
        }
    }

    public x4(long j10, long j11, int i10, String str) {
        this.f22101b = j10;
        this.f22102c = j11;
        this.d = i10;
        this.f22103e = str;
    }
}
