package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class v4 implements Runnable {
    public final int f21723a = 0;
    public final long f21724b;
    public final long f21725c;
    public final int d;
    public final String f21726e;

    public v4(int i9, String str, long j10, long j11) {
        this.d = i9;
        this.f21726e = str;
        this.f21724b = j10;
        this.f21725c = j11;
    }

    @Override
    public final void run() {
        switch (this.f21723a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, this.f21726e, this.f21724b, this.f21725c);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$1(this.f21724b, this.f21725c, this.d, this.f21726e);
                return;
        }
    }

    public v4(long j10, long j11, int i9, String str) {
        this.f21724b = j10;
        this.f21725c = j11;
        this.d = i9;
        this.f21726e = str;
    }
}
