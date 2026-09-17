package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class v4 implements Runnable {
    public final int f19200a = 0;
    public final long f19201b;
    public final long f19202c;
    public final int d;
    public final String f19203e;

    public v4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.f19203e = str;
        this.f19201b = j3;
        this.f19202c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19200a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f19203e, this.f19201b, this.f19202c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f19201b, this.f19202c, this.d, this.f19203e);
                return;
        }
    }

    public v4(long j3, long j10, int i10, String str) {
        this.f19201b = j3;
        this.f19202c = j10;
        this.d = i10;
        this.f19203e = str;
    }
}
