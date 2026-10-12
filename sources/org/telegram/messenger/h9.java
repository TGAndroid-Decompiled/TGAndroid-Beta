package org.telegram.messenger;

import java.util.ArrayList;
public final class h9 implements Runnable {
    public final int f17397a = 1;
    public final MediaDataController f17398b;
    public final boolean f17399c;
    public final int d;
    public final ArrayList e;

    public h9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17398b = mediaDataController;
        this.f17399c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17397a) {
            case 0:
                this.f17398b.lambda$loadRecents$48(this.f17399c, this.e, this.d);
                return;
            default:
                this.f17398b.lambda$processLoadedRecentDocuments$53(this.f17399c, this.d, this.e);
                return;
        }
    }

    public h9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17398b = mediaDataController;
        this.f17399c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
