package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d2 implements Runnable {
    public final int f18141a;
    public final DownloadController f18142b;
    public final TLRPC.Document f18143c;
    public final MessageObject d;

    public d2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f18141a = i10;
        this.f18142b = downloadController;
        this.f18143c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18141a) {
            case 0:
                this.f18142b.lambda$onDownloadComplete$7(this.f18143c, this.d);
                return;
            default:
                this.f18142b.lambda$startDownloadFile$5(this.f18143c, this.d);
                return;
        }
    }
}
