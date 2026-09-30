package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f15960a;
    public final DownloadController f15961b;
    public final TLRPC.Document f15962c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15960a = i10;
        this.f15961b = downloadController;
        this.f15962c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15960a) {
            case 0:
                this.f15961b.lambda$onDownloadComplete$7(this.f15962c, this.d);
                return;
            default:
                this.f15961b.lambda$startDownloadFile$5(this.f15962c, this.d);
                return;
        }
    }
}
