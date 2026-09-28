package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f17999a = 0;
    public final long f18000b;
    public final long f18001c;
    public final int d;
    public final String e;

    public w4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.e = str;
        this.f18000b = j3;
        this.f18001c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17999a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.e, this.f18000b, this.f18001c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f18000b, this.f18001c, this.d, this.e);
                return;
        }
    }

    public w4(long j3, long j10, int i10, String str) {
        this.f18000b = j3;
        this.f18001c = j10;
        this.d = i10;
        this.e = str;
    }
}
