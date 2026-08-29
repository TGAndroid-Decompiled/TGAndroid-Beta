package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class x4 implements Runnable {
    public final int f22142a = 0;
    public final long f22143b;
    public final long f22144c;
    public final int d;
    public final String f22145e;

    public x4(int i10, String str, long j10, long j11) {
        this.d = i10;
        this.f22145e = str;
        this.f22143b = j10;
        this.f22144c = j11;
    }

    @Override
    public final void run() {
        switch (this.f22142a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f22145e, this.f22143b, this.f22144c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f22143b, this.f22144c, this.d, this.f22145e);
                return;
        }
    }

    public x4(long j10, long j11, int i10, String str) {
        this.f22143b = j10;
        this.f22144c = j11;
        this.d = i10;
        this.f22145e = str;
    }
}
