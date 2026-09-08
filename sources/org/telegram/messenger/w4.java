package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class w4 implements Runnable {
    public final int f19486a = 0;
    public final long f19487b;
    public final long f19488c;
    public final int d;
    public final String f19489e;

    public w4(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.f19489e = str;
        this.f19487b = j3;
        this.f19488c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19486a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f19489e, this.f19487b, this.f19488c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f19487b, this.f19488c, this.d, this.f19489e);
                return;
        }
    }

    public w4(long j3, long j10, int i10, String str) {
        this.f19487b = j3;
        this.f19488c = j10;
        this.d = i10;
        this.f19489e = str;
    }
}
