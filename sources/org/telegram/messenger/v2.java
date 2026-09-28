package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17738a;
    public final FileLoader f17739b;
    public final TLRPC.Document f17740c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17738a = i10;
        this.f17739b = fileLoader;
        this.f17740c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17738a) {
            case 0:
                this.f17739b.lambda$setLoadingVideo$0(this.f17740c, this.d);
                return;
            default:
                this.f17739b.lambda$removeLoadingVideo$1(this.f17740c, this.d);
                return;
        }
    }
}
