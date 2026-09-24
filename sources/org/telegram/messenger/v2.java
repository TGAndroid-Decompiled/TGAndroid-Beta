package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17713a;
    public final FileLoader f17714b;
    public final TLRPC.Document f17715c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17713a = i10;
        this.f17714b = fileLoader;
        this.f17715c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17713a) {
            case 0:
                this.f17714b.lambda$setLoadingVideo$0(this.f17715c, this.d);
                return;
            default:
                this.f17714b.lambda$removeLoadingVideo$1(this.f17715c, this.d);
                return;
        }
    }
}
