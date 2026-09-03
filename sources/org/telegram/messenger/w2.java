package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class w2 implements Runnable {
    public final int f20508a;
    public final FileLoader f20509b;
    public final TLRPC.Document f20510c;
    public final boolean d;

    public w2(FileLoader fileLoader, TLRPC.Document document, boolean z4, int i10) {
        this.f20508a = i10;
        this.f20509b = fileLoader;
        this.f20510c = document;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f20508a) {
            case 0:
                this.f20509b.lambda$setLoadingVideo$0(this.f20510c, this.d);
                return;
            default:
                this.f20509b.lambda$removeLoadingVideo$1(this.f20510c, this.d);
                return;
        }
    }
}
