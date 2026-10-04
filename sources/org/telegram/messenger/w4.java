package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f19662a = 0;
    public final long f19663b;
    public final long f19664c;
    public final int d;
    public final String f19665e;

    public w4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.f19665e = str;
        this.f19663b = j3;
        this.f19664c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19662a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f19665e, this.f19663b, this.f19664c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f19663b, this.f19664c, this.d, this.f19665e);
                return;
        }
    }

    public w4(long j3, long j10, int i10, String str) {
        this.f19663b = j3;
        this.f19664c = j10;
        this.d = i10;
        this.f19665e = str;
    }
}
