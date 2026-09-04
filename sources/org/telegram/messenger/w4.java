package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f19459a = 0;
    public final long f19460b;
    public final long f19461c;
    public final int d;
    public final String f19462e;

    public w4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.f19462e = str;
        this.f19460b = j3;
        this.f19461c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19459a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f19462e, this.f19460b, this.f19461c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f19460b, this.f19461c, this.d, this.f19462e);
                return;
        }
    }

    public w4(long j3, long j10, int i10, String str) {
        this.f19460b = j3;
        this.f19461c = j10;
        this.d = i10;
        this.f19462e = str;
    }
}
