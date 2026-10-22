package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class b5 implements Runnable {
    public final int f17910a = 0;
    public final boolean f17911b;
    public final long f17912c;
    public final long d;
    public final int e;
    public final Object f17913f;

    public b5(int i10, String str, long j10, long j11, boolean z10) {
        this.e = i10;
        this.f17913f = str;
        this.f17912c = j10;
        this.d = j11;
        this.f17911b = z10;
    }

    @Override
    public final void run() {
        switch (this.f17910a) {
            case 0:
                long j10 = this.d;
                boolean z10 = this.f17911b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.e, (String) this.f17913f, this.f17912c, j10, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f17913f, this.f17911b, this.f17912c, this.d, this.e);
                return;
        }
    }

    public b5(TLObject tLObject, boolean z10, long j10, long j11, int i10) {
        this.f17913f = tLObject;
        this.f17911b = z10;
        this.f17912c = j10;
        this.d = j11;
        this.e = i10;
    }
}
