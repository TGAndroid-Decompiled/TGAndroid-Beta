package org.telegram.messenger;

import java.util.ArrayList;
public final class g9 implements Runnable {
    public final int f18436a = 1;
    public final MediaDataController f18437b;
    public final boolean f18438c;
    public final int d;
    public final ArrayList e;

    public g9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f18437b = mediaDataController;
        this.f18438c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18436a) {
            case 0:
                this.f18437b.lambda$loadRecents$48(this.f18438c, this.e, this.d);
                return;
            default:
                this.f18437b.lambda$processLoadedRecentDocuments$53(this.f18438c, this.d, this.e);
                return;
        }
    }

    public g9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f18437b = mediaDataController;
        this.f18438c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
