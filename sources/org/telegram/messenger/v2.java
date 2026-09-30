package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17755a;
    public final FileLoader f17756b;
    public final TLRPC.Document f17757c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17755a = i10;
        this.f17756b = fileLoader;
        this.f17757c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17755a) {
            case 0:
                this.f17756b.lambda$setLoadingVideo$0(this.f17757c, this.d);
                return;
            default:
                this.f17756b.lambda$removeLoadingVideo$1(this.f17757c, this.d);
                return;
        }
    }
}
