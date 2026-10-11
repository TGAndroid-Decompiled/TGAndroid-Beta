package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class w4 implements Runnable {
    public final int f19658a = 0;
    public final boolean f19659b;
    public final long f19660c;
    public final long d;
    public final int f19661e;
    public final Object f19662f;

    public w4(int i10, String str, long j3, long j10, boolean z10) {
        this.f19661e = i10;
        this.f19662f = str;
        this.f19660c = j3;
        this.d = j10;
        this.f19659b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19658a) {
            case 0:
                long j3 = this.d;
                boolean z10 = this.f19659b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.f19661e, (String) this.f19662f, this.f19660c, j3, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f19662f, this.f19659b, this.f19660c, this.d, this.f19661e);
                return;
        }
    }

    public w4(TLObject tLObject, boolean z10, long j3, long j10, int i10) {
        this.f19662f = tLObject;
        this.f19659b = z10;
        this.f19660c = j3;
        this.d = j10;
        this.f19661e = i10;
    }
}
