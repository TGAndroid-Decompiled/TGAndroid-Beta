package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class y4 implements Runnable {
    public final int f20672a = 0;
    public final long f20673b;
    public final long f20674c;
    public final int d;
    public final String f20675e;

    public y4(int i10, String str, long j10, long j11) {
        this.d = i10;
        this.f20675e = str;
        this.f20673b = j10;
        this.f20674c = j11;
    }

    @Override
    public final void run() {
        switch (this.f20672a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f20675e, this.f20673b, this.f20674c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f20673b, this.f20674c, this.d, this.f20675e);
                return;
        }
    }

    public y4(long j10, long j11, int i10, String str) {
        this.f20673b = j10;
        this.f20674c = j11;
        this.d = i10;
        this.f20675e = str;
    }
}
