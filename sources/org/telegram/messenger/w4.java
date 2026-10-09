package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class w4 implements Runnable {
    public final int f19661a = 0;
    public final boolean f19662b;
    public final long f19663c;
    public final long d;
    public final int f19664e;
    public final Object f19665f;

    public w4(int i10, String str, long j3, long j10, boolean z10) {
        this.f19664e = i10;
        this.f19665f = str;
        this.f19663c = j3;
        this.d = j10;
        this.f19662b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19661a) {
            case 0:
                long j3 = this.d;
                boolean z10 = this.f19662b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.f19664e, (String) this.f19665f, this.f19663c, j3, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f19665f, this.f19662b, this.f19663c, this.d, this.f19664e);
                return;
        }
    }

    public w4(TLObject tLObject, boolean z10, long j3, long j10, int i10) {
        this.f19665f = tLObject;
        this.f19662b = z10;
        this.f19663c = j3;
        this.d = j10;
        this.f19664e = i10;
    }
}
