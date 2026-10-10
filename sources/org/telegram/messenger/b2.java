package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f17393a;
    public final DownloadController f17394b;
    public final TLRPC.Document f17395c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17393a = i10;
        this.f17394b = downloadController;
        this.f17395c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17393a) {
            case 0:
                this.f17394b.lambda$onDownloadComplete$7(this.f17395c, this.d);
                return;
            default:
                this.f17394b.lambda$startDownloadFile$5(this.f17395c, this.d);
                return;
        }
    }
}
