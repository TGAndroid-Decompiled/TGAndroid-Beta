package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17513a;
    public final FileLoader f17514b;
    public final TLRPC.Document f17515c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17513a = i10;
        this.f17514b = fileLoader;
        this.f17515c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17513a) {
            case 0:
                this.f17514b.lambda$setLoadingVideo$0(this.f17515c, this.d);
                return;
            default:
                this.f17514b.lambda$removeLoadingVideo$1(this.f17515c, this.d);
                return;
        }
    }
}
