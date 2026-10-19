package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f18270a = 1;
    public final MediaDataController f18271b;
    public final boolean f18272c;
    public final int d;
    public final ArrayList e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f18271b = mediaDataController;
        this.f18272c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18270a) {
            case 0:
                this.f18271b.lambda$loadRecents$48(this.f18272c, this.e, this.d);
                return;
            default:
                this.f18271b.lambda$processLoadedRecentDocuments$53(this.f18272c, this.d, this.e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f18271b = mediaDataController;
        this.f18272c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
