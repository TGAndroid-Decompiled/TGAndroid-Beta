package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class w2 implements Runnable {
    public final int f18869a;
    public final FileLoader f18870b;
    public final TLRPC.Document f18871c;
    public final boolean d;

    public w2(FileLoader fileLoader, TLRPC.Document document, boolean z4, int i10) {
        this.f18869a = i10;
        this.f18870b = fileLoader;
        this.f18871c = document;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f18869a) {
            case 0:
                this.f18870b.lambda$setLoadingVideo$0(this.f18871c, this.d);
                return;
            default:
                this.f18870b.lambda$removeLoadingVideo$1(this.f18871c, this.d);
                return;
        }
    }
}
