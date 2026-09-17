package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class v4 implements Runnable {
    public final int f19227a = 0;
    public final long f19228b;
    public final long f19229c;
    public final int d;
    public final String f19230e;

    public v4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.f19230e = str;
        this.f19228b = j3;
        this.f19229c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19227a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f19230e, this.f19228b, this.f19229c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f19228b, this.f19229c, this.d, this.f19230e);
                return;
        }
    }

    public v4(long j3, long j10, int i10, String str) {
        this.f19228b = j3;
        this.f19229c = j10;
        this.d = i10;
        this.f19230e = str;
    }
}
