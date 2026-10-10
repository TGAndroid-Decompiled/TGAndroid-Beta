package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class w4 implements Runnable {
    public final int f19665a = 0;
    public final boolean f19666b;
    public final long f19667c;
    public final long d;
    public final int f19668e;
    public final Object f19669f;

    public w4(int i10, String str, long j3, long j10, boolean z10) {
        this.f19668e = i10;
        this.f19669f = str;
        this.f19667c = j3;
        this.d = j10;
        this.f19666b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19665a) {
            case 0:
                long j3 = this.d;
                boolean z10 = this.f19666b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.f19668e, (String) this.f19669f, this.f19667c, j3, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f19669f, this.f19666b, this.f19667c, this.d, this.f19668e);
                return;
        }
    }

    public w4(TLObject tLObject, boolean z10, long j3, long j10, int i10) {
        this.f19669f = tLObject;
        this.f19666b = z10;
        this.f19667c = j3;
        this.d = j10;
        this.f19668e = i10;
    }
}
