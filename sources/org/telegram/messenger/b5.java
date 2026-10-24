package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class b5 implements Runnable {
    public final int f17973a = 0;
    public final boolean f17974b;
    public final long f17975c;
    public final long d;
    public final int e;
    public final Object f17976f;

    public b5(int i10, String str, long j10, long j11, boolean z10) {
        this.e = i10;
        this.f17976f = str;
        this.f17975c = j10;
        this.d = j11;
        this.f17974b = z10;
    }

    @Override
    public final void run() {
        switch (this.f17973a) {
            case 0:
                long j10 = this.d;
                boolean z10 = this.f17974b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.e, (String) this.f17976f, this.f17975c, j10, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f17976f, this.f17974b, this.f17975c, this.d, this.e);
                return;
        }
    }

    public b5(TLObject tLObject, boolean z10, long j10, long j11, int i10) {
        this.f17976f = tLObject;
        this.f17974b = z10;
        this.f17975c = j10;
        this.d = j11;
        this.e = i10;
    }
}
