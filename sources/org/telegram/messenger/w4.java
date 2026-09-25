package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f17989a = 0;
    public final long f17990b;
    public final long f17991c;
    public final int d;
    public final String e;

    public w4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.e = str;
        this.f17990b = j3;
        this.f17991c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17989a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.e, this.f17990b, this.f17991c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f17990b, this.f17991c, this.d, this.e);
                return;
        }
    }

    public w4(long j3, long j10, int i10, String str) {
        this.f17990b = j3;
        this.f17991c = j10;
        this.d = i10;
        this.e = str;
    }
}
