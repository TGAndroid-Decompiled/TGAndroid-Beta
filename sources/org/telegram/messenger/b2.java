package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f19763a;
    public final DownloadController f19764b;
    public final TLRPC.Document f19765c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f19763a = i10;
        this.f19764b = downloadController;
        this.f19765c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19763a) {
            case 0:
                this.f19764b.lambda$onDownloadComplete$7(this.f19765c, this.d);
                return;
            default:
                this.f19764b.lambda$startDownloadFile$5(this.f19765c, this.d);
                return;
        }
    }
}
