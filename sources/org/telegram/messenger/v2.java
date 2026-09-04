package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f19196a;
    public final FileLoader f19197b;
    public final TLRPC.Document f19198c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19196a = i10;
        this.f19197b = fileLoader;
        this.f19198c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19196a) {
            case 0:
                this.f19197b.lambda$setLoadingVideo$0(this.f19198c, this.d);
                return;
            default:
                this.f19197b.lambda$removeLoadingVideo$1(this.f19198c, this.d);
                return;
        }
    }
}
