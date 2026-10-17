package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class y4 implements Runnable {
    public final int f20116a = 0;
    public final boolean f20117b;
    public final long f20118c;
    public final long d;
    public final int e;
    public final Object f20119f;

    public y4(int i10, String str, long j10, long j11, boolean z10) {
        this.e = i10;
        this.f20119f = str;
        this.f20118c = j10;
        this.d = j11;
        this.f20117b = z10;
    }

    @Override
    public final void run() {
        switch (this.f20116a) {
            case 0:
                long j10 = this.d;
                boolean z10 = this.f20117b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.e, (String) this.f20119f, this.f20118c, j10, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f20119f, this.f20117b, this.f20118c, this.d, this.e);
                return;
        }
    }

    public y4(TLObject tLObject, boolean z10, long j10, long j11, int i10) {
        this.f20119f = tLObject;
        this.f20117b = z10;
        this.f20118c = j10;
        this.d = j11;
        this.e = i10;
    }
}
