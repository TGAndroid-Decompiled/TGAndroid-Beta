package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d2 implements Runnable {
    public final int f18138a;
    public final DownloadController f18139b;
    public final TLRPC.Document f18140c;
    public final MessageObject d;

    public d2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f18138a = i10;
        this.f18139b = downloadController;
        this.f18140c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18138a) {
            case 0:
                this.f18139b.lambda$onDownloadComplete$7(this.f18140c, this.d);
                return;
            default:
                this.f18139b.lambda$startDownloadFile$5(this.f18140c, this.d);
                return;
        }
    }
}
