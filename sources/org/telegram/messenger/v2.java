package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f19387a;
    public final FileLoader f19388b;
    public final TLRPC.Document f19389c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19387a = i10;
        this.f19388b = fileLoader;
        this.f19389c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19387a) {
            case 0:
                this.f19388b.lambda$setLoadingVideo$0(this.f19389c, this.d);
                return;
            default:
                this.f19388b.lambda$removeLoadingVideo$1(this.f19389c, this.d);
                return;
        }
    }
}
