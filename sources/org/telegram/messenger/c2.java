package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c2 implements Runnable {
    public final int f18315a;
    public final DownloadController f18316b;
    public final TLRPC.Document f18317c;
    public final MessageObject d;

    public c2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f18315a = i10;
        this.f18316b = downloadController;
        this.f18317c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18315a) {
            case 0:
                this.f18316b.lambda$onDownloadComplete$7(this.f18317c, this.d);
                return;
            default:
                this.f18316b.lambda$startDownloadFile$5(this.f18317c, this.d);
                return;
        }
    }
}
