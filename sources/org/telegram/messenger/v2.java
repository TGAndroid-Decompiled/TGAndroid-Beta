package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17473a;
    public final FileLoader f17474b;
    public final TLRPC.Document f17475c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17473a = i10;
        this.f17474b = fileLoader;
        this.f17475c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17473a) {
            case 0:
                this.f17474b.lambda$setLoadingVideo$0(this.f17475c, this.d);
                return;
            default:
                this.f17474b.lambda$removeLoadingVideo$1(this.f17475c, this.d);
                return;
        }
    }
}
