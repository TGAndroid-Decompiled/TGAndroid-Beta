package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f19655a = 0;
    public final long f19656b;
    public final long f19657c;
    public final int d;
    public final String f19658e;

    public w4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.f19658e = str;
        this.f19656b = j3;
        this.f19657c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19655a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f19658e, this.f19656b, this.f19657c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f19656b, this.f19657c, this.d, this.f19658e);
                return;
        }
    }

    public w4(long j3, long j10, int i10, String str) {
        this.f19656b = j3;
        this.f19657c = j10;
        this.d = i10;
        this.f19658e = str;
    }
}
