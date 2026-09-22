package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17733a;
    public final FileLoader f17734b;
    public final TLRPC.Document f17735c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17733a = i10;
        this.f17734b = fileLoader;
        this.f17735c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17733a) {
            case 0:
                this.f17734b.lambda$setLoadingVideo$0(this.f17735c, this.d);
                return;
            default:
                this.f17734b.lambda$removeLoadingVideo$1(this.f17735c, this.d);
                return;
        }
    }
}
