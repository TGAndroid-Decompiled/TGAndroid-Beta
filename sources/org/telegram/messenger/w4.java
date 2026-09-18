package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f17929a = 0;
    public final long f17930b;
    public final long f17931c;
    public final int d;
    public final String e;

    public w4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.e = str;
        this.f17930b = j3;
        this.f17931c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17929a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.e, this.f17930b, this.f17931c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f17930b, this.f17931c, this.d, this.e);
                return;
        }
    }

    public w4(long j3, long j10, int i10, String str) {
        this.f17930b = j3;
        this.f17931c = j10;
        this.d = i10;
        this.e = str;
    }
}
