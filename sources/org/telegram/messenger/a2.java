package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a2 implements Runnable {
    public final int f15822a;
    public final DownloadController f15823b;
    public final TLRPC.Document f15824c;
    public final MessageObject d;

    public a2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15822a = i10;
        this.f15823b = downloadController;
        this.f15824c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15822a) {
            case 0:
                this.f15823b.lambda$onDownloadComplete$7(this.f15824c, this.d);
                return;
            default:
                this.f15823b.lambda$startDownloadFile$5(this.f15824c, this.d);
                return;
        }
    }
}
