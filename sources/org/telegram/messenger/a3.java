package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a3 implements Runnable {
    public final int f19583a;
    public final FileLoader f19584b;
    public final TLRPC.Document f19585c;
    public final boolean d;

    public a3(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19583a = i10;
        this.f19584b = fileLoader;
        this.f19585c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19583a) {
            case 0:
                this.f19584b.lambda$setLoadingVideo$0(this.f19585c, this.d);
                return;
            default:
                this.f19584b.lambda$removeLoadingVideo$1(this.f19585c, this.d);
                return;
        }
    }
}
