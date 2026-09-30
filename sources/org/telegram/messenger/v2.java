package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17739a;
    public final FileLoader f17740b;
    public final TLRPC.Document f17741c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17739a = i10;
        this.f17740b = fileLoader;
        this.f17741c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17739a) {
            case 0:
                this.f17740b.lambda$setLoadingVideo$0(this.f17741c, this.d);
                return;
            default:
                this.f17740b.lambda$removeLoadingVideo$1(this.f17741c, this.d);
                return;
        }
    }
}
