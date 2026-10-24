package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class e2 implements Runnable {
    public final int f18290a;
    public final DownloadController f18291b;
    public final TLRPC.Document f18292c;
    public final MessageObject d;

    public e2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f18290a = i10;
        this.f18291b = downloadController;
        this.f18292c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18290a) {
            case 0:
                this.f18291b.lambda$onDownloadComplete$7(this.f18292c, this.d);
                return;
            default:
                this.f18291b.lambda$startDownloadFile$5(this.f18292c, this.d);
                return;
        }
    }
}
