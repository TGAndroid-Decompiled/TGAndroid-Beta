package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f19195a;
    public final FileLoader f19196b;
    public final TLRPC.Document f19197c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19195a = i10;
        this.f19196b = fileLoader;
        this.f19197c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19195a) {
            case 0:
                this.f19196b.lambda$setLoadingVideo$0(this.f19197c, this.d);
                return;
            default:
                this.f19196b.lambda$removeLoadingVideo$1(this.f19197c, this.d);
                return;
        }
    }
}
