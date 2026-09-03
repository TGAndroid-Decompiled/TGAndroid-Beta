package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class w2 implements Runnable {
    public final int f18852a;
    public final FileLoader f18853b;
    public final TLRPC.Document f18854c;
    public final boolean d;

    public w2(FileLoader fileLoader, TLRPC.Document document, boolean z4, int i10) {
        this.f18852a = i10;
        this.f18853b = fileLoader;
        this.f18854c = document;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f18852a) {
            case 0:
                this.f18853b.lambda$setLoadingVideo$0(this.f18854c, this.d);
                return;
            default:
                this.f18853b.lambda$removeLoadingVideo$1(this.f18854c, this.d);
                return;
        }
    }
}
