package org.telegram.messenger;

import java.util.ArrayList;
public final class i9 implements Runnable {
    public final int f18607a = 1;
    public final MediaDataController f18608b;
    public final boolean f18609c;
    public final int d;
    public final ArrayList e;

    public i9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f18608b = mediaDataController;
        this.f18609c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18607a) {
            case 0:
                this.f18608b.lambda$loadRecents$48(this.f18609c, this.e, this.d);
                return;
            default:
                this.f18608b.lambda$processLoadedRecentDocuments$53(this.f18609c, this.d, this.e);
                return;
        }
    }

    public i9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f18608b = mediaDataController;
        this.f18609c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
