package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class f2 implements Runnable {
    public final int f20039a;
    public final DownloadController f20040b;
    public final TLRPC.Document f20041c;
    public final MessageObject d;

    public f2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f20039a = i10;
        this.f20040b = downloadController;
        this.f20041c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f20039a) {
            case 0:
                this.f20040b.lambda$onDownloadComplete$7(this.f20041c, this.d);
                return;
            default:
                this.f20040b.lambda$startDownloadFile$5(this.f20041c, this.d);
                return;
        }
    }
}
