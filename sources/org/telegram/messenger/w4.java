package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f17974a = 0;
    public final long f17975b;
    public final long f17976c;
    public final int d;
    public final String e;

    public w4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.e = str;
        this.f17975b = j3;
        this.f17976c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17974a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.e, this.f17975b, this.f17976c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f17975b, this.f17976c, this.d, this.e);
                return;
        }
    }

    public w4(long j3, long j10, int i10, String str) {
        this.f17975b = j3;
        this.f17976c = j10;
        this.d = i10;
        this.e = str;
    }
}
