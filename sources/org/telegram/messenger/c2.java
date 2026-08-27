package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class c2 implements Runnable {

    public final int f19871a;

    public final DownloadController f19872b;

    public final TLRPC.Document f19873c;
    public final MessageObject d;

    public c2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f19871a = i10;
        this.f19872b = downloadController;
        this.f19873c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19871a) {
            case 0:
                this.f19872b.lambda$onDownloadComplete$7(this.f19873c, this.d);
                break;
            default:
                this.f19872b.lambda$startDownloadFile$5(this.f19873c, this.d);
                break;
        }
    }
}
