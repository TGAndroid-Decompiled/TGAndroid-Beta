package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y2 implements Runnable {
    public final int f20115a;
    public final FileLoader f20116b;
    public final TLRPC.Document f20117c;
    public final boolean d;

    public y2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f20115a = i10;
        this.f20116b = fileLoader;
        this.f20117c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20115a) {
            case 0:
                this.f20116b.lambda$setLoadingVideo$0(this.f20117c, this.d);
                return;
            default:
                this.f20116b.lambda$removeLoadingVideo$1(this.f20117c, this.d);
                return;
        }
    }
}
