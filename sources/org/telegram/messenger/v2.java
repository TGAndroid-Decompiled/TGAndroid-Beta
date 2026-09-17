package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f19222a;
    public final FileLoader f19223b;
    public final TLRPC.Document f19224c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19222a = i10;
        this.f19223b = fileLoader;
        this.f19224c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19222a) {
            case 0:
                this.f19223b.lambda$setLoadingVideo$0(this.f19224c, this.d);
                return;
            default:
                this.f19223b.lambda$removeLoadingVideo$1(this.f19224c, this.d);
                return;
        }
    }
}
