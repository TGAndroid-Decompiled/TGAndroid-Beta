package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17685a;
    public final FileLoader f17686b;
    public final TLRPC.Document f17687c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17685a = i10;
        this.f17686b = fileLoader;
        this.f17687c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17685a) {
            case 0:
                this.f17686b.lambda$setLoadingVideo$0(this.f17687c, this.d);
                return;
            default:
                this.f17686b.lambda$removeLoadingVideo$1(this.f17687c, this.d);
                return;
        }
    }
}
