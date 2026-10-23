package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class a5 implements Runnable {
    public final int f17901a = 0;
    public final boolean f17902b;
    public final long f17903c;
    public final long d;
    public final int e;
    public final Object f17904f;

    public a5(int i10, String str, long j10, long j11, boolean z10) {
        this.e = i10;
        this.f17904f = str;
        this.f17903c = j10;
        this.d = j11;
        this.f17902b = z10;
    }

    @Override
    public final void run() {
        switch (this.f17901a) {
            case 0:
                long j10 = this.d;
                boolean z10 = this.f17902b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.e, (String) this.f17904f, this.f17903c, j10, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f17904f, this.f17902b, this.f17903c, this.d, this.e);
                return;
        }
    }

    public a5(TLObject tLObject, boolean z10, long j10, long j11, int i10) {
        this.f17904f = tLObject;
        this.f17902b = z10;
        this.f17903c = j10;
        this.d = j11;
        this.e = i10;
    }
}
