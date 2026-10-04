package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f19650a = 0;
    public final long f19651b;
    public final long f19652c;
    public final int d;
    public final String f19653e;

    public w4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.f19653e = str;
        this.f19651b = j3;
        this.f19652c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19650a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f19653e, this.f19651b, this.f19652c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f19651b, this.f19652c, this.d, this.f19653e);
                return;
        }
    }

    public w4(long j3, long j10, int i10, String str) {
        this.f19651b = j3;
        this.f19652c = j10;
        this.d = i10;
        this.f19653e = str;
    }
}
