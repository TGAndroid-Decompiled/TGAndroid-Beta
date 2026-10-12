package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d2 implements Runnable {
    public final int f17038a;
    public final DownloadController f17039b;
    public final TLRPC.Document f17040c;
    public final MessageObject d;

    public d2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17038a = i10;
        this.f17039b = downloadController;
        this.f17040c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17038a) {
            case 0:
                this.f17039b.lambda$onDownloadComplete$7(this.f17040c, this.d);
                return;
            default:
                this.f17039b.lambda$startDownloadFile$5(this.f17040c, this.d);
                return;
        }
    }
}
