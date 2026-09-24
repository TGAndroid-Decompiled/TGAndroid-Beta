package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f15931a;
    public final DownloadController f15932b;
    public final TLRPC.Document f15933c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15931a = i10;
        this.f15932b = downloadController;
        this.f15933c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15931a) {
            case 0:
                this.f15932b.lambda$onDownloadComplete$7(this.f15933c, this.d);
                return;
            default:
                this.f15932b.lambda$startDownloadFile$5(this.f15933c, this.d);
                return;
        }
    }
}
