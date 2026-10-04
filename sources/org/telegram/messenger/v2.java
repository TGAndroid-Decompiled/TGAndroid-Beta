package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f19376a;
    public final FileLoader f19377b;
    public final TLRPC.Document f19378c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19376a = i10;
        this.f19377b = fileLoader;
        this.f19378c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19376a) {
            case 0:
                this.f19377b.lambda$setLoadingVideo$0(this.f19378c, this.d);
                return;
            default:
                this.f19377b.lambda$removeLoadingVideo$1(this.f19378c, this.d);
                return;
        }
    }
}
