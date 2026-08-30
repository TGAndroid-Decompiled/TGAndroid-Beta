package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class y4 implements Runnable {
    public final int f19018a = 0;
    public final long f19019b;
    public final long f19020c;
    public final int d;
    public final String e;

    public y4(int i10, String str, long j10, long j11) {
        this.d = i10;
        this.e = str;
        this.f19019b = j10;
        this.f19020c = j11;
    }

    @Override
    public final void run() {
        switch (this.f19018a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.e, this.f19019b, this.f19020c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f19019b, this.f19020c, this.d, this.e);
                return;
        }
    }

    public y4(long j10, long j11, int i10, String str) {
        this.f19019b = j10;
        this.f19020c = j11;
        this.d = i10;
        this.e = str;
    }
}
