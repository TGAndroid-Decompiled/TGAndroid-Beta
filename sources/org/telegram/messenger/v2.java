package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17722a;
    public final FileLoader f17723b;
    public final TLRPC.Document f17724c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17722a = i10;
        this.f17723b = fileLoader;
        this.f17724c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17722a) {
            case 0:
                this.f17723b.lambda$setLoadingVideo$0(this.f17724c, this.d);
                return;
            default:
                this.f17723b.lambda$removeLoadingVideo$1(this.f17724c, this.d);
                return;
        }
    }
}
