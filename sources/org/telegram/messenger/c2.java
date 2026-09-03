package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c2 implements Runnable {
    public final int f16882a;
    public final DownloadController f16883b;
    public final TLRPC.Document f16884c;
    public final MessageObject d;

    public c2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f16882a = i10;
        this.f16883b = downloadController;
        this.f16884c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f16882a) {
            case 0:
                this.f16883b.lambda$onDownloadComplete$7(this.f16884c, this.d);
                return;
            default:
                this.f16883b.lambda$startDownloadFile$5(this.f16884c, this.d);
                return;
        }
    }
}
