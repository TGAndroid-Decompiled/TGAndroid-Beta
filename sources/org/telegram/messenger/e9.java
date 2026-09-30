package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f16292a = 1;
    public final MediaDataController f16293b;
    public final boolean f16294c;
    public final int d;
    public final ArrayList e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f16293b = mediaDataController;
        this.f16294c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16292a) {
            case 0:
                this.f16293b.lambda$loadRecents$48(this.f16294c, this.e, this.d);
                return;
            default:
                this.f16293b.lambda$processLoadedRecentDocuments$53(this.f16294c, this.d, this.e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f16293b = mediaDataController;
        this.f16294c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
