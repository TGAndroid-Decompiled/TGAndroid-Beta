package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f15946a;
    public final DownloadController f15947b;
    public final TLRPC.Document f15948c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15946a = i10;
        this.f15947b = downloadController;
        this.f15948c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15946a) {
            case 0:
                this.f15947b.lambda$onDownloadComplete$7(this.f15948c, this.d);
                return;
            default:
                this.f15947b.lambda$startDownloadFile$5(this.f15948c, this.d);
                return;
        }
    }
}
