package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class w4 implements Runnable {
    public final int f19694a = 0;
    public final boolean f19695b;
    public final long f19696c;
    public final long d;
    public final int f19697e;
    public final Object f19698f;

    public w4(int i10, String str, long j3, long j10, boolean z10) {
        this.f19697e = i10;
        this.f19698f = str;
        this.f19696c = j3;
        this.d = j10;
        this.f19695b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19694a) {
            case 0:
                long j3 = this.d;
                boolean z10 = this.f19695b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.f19697e, (String) this.f19698f, this.f19696c, j3, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f19698f, this.f19695b, this.f19696c, this.d, this.f19697e);
                return;
        }
    }

    public w4(TLObject tLObject, boolean z10, long j3, long j10, int i10) {
        this.f19698f = tLObject;
        this.f19695b = z10;
        this.f19696c = j3;
        this.d = j10;
        this.f19697e = i10;
    }
}
