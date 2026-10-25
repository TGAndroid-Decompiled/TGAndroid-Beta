package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a3 implements Runnable {
    public final int f19584a;
    public final FileLoader f19585b;
    public final TLRPC.Document f19586c;
    public final boolean d;

    public a3(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19584a = i10;
        this.f19585b = fileLoader;
        this.f19586c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19584a) {
            case 0:
                this.f19585b.lambda$setLoadingVideo$0(this.f19586c, this.d);
                return;
            default:
                this.f19585b.lambda$removeLoadingVideo$1(this.f19586c, this.d);
                return;
        }
    }
}
