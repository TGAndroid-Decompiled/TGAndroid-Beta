package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d2 implements Runnable {
    public final int f18151a;
    public final DownloadController f18152b;
    public final TLRPC.Document f18153c;
    public final MessageObject d;

    public d2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f18151a = i10;
        this.f18152b = downloadController;
        this.f18153c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18151a) {
            case 0:
                this.f18152b.lambda$onDownloadComplete$7(this.f18153c, this.d);
                return;
            default:
                this.f18152b.lambda$startDownloadFile$5(this.f18153c, this.d);
                return;
        }
    }
}
