package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d2 implements Runnable {
    public final int f18148a;
    public final DownloadController f18149b;
    public final TLRPC.Document f18150c;
    public final MessageObject d;

    public d2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f18148a = i10;
        this.f18149b = downloadController;
        this.f18150c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18148a) {
            case 0:
                this.f18149b.lambda$onDownloadComplete$7(this.f18150c, this.d);
                return;
            default:
                this.f18149b.lambda$startDownloadFile$5(this.f18150c, this.d);
                return;
        }
    }
}
