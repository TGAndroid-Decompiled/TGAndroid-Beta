package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f15940a;
    public final DownloadController f15941b;
    public final TLRPC.Document f15942c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15940a = i10;
        this.f15941b = downloadController;
        this.f15942c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15940a) {
            case 0:
                this.f15941b.lambda$onDownloadComplete$7(this.f15942c, this.d);
                return;
            default:
                this.f15941b.lambda$startDownloadFile$5(this.f15942c, this.d);
                return;
        }
    }
}
