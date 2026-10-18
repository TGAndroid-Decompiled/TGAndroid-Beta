package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f18273a = 1;
    public final MediaDataController f18274b;
    public final boolean f18275c;
    public final int d;
    public final ArrayList e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f18274b = mediaDataController;
        this.f18275c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18273a) {
            case 0:
                this.f18274b.lambda$loadRecents$48(this.f18275c, this.e, this.d);
                return;
            default:
                this.f18274b.lambda$processLoadedRecentDocuments$53(this.f18275c, this.d, this.e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f18274b = mediaDataController;
        this.f18275c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
