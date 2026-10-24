package org.telegram.messenger;

import java.util.ArrayList;
public final class j9 implements Runnable {
    public final int f18742a = 1;
    public final MediaDataController f18743b;
    public final boolean f18744c;
    public final int d;
    public final ArrayList e;

    public j9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f18743b = mediaDataController;
        this.f18744c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18742a) {
            case 0:
                this.f18743b.lambda$loadRecents$48(this.f18744c, this.e, this.d);
                return;
            default:
                this.f18743b.lambda$processLoadedRecentDocuments$53(this.f18744c, this.d, this.e);
                return;
        }
    }

    public j9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f18743b = mediaDataController;
        this.f18744c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
