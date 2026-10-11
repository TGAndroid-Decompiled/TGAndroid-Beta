package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f19423a;
    public final FileLoader f19424b;
    public final TLRPC.Document f19425c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19423a = i10;
        this.f19424b = fileLoader;
        this.f19425c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19423a) {
            case 0:
                this.f19424b.lambda$setLoadingVideo$0(this.f19425c, this.d);
                return;
            default:
                this.f19424b.lambda$removeLoadingVideo$1(this.f19425c, this.d);
                return;
        }
    }
}
