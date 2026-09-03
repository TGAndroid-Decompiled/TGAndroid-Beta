package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class y4 implements Runnable {
    public final int f20674a = 0;
    public final long f20675b;
    public final long f20676c;
    public final int d;
    public final String f20677e;

    public y4(int i10, String str, long j10, long j11) {
        this.d = i10;
        this.f20677e = str;
        this.f20675b = j10;
        this.f20676c = j11;
    }

    @Override
    public final void run() {
        switch (this.f20674a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f20677e, this.f20675b, this.f20676c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f20675b, this.f20676c, this.d, this.f20677e);
                return;
        }
    }

    public y4(long j10, long j11, int i10, String str) {
        this.f20675b = j10;
        this.f20676c = j11;
        this.d = i10;
        this.f20677e = str;
    }
}
