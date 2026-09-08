package org.telegram.messenger;

import java.util.ArrayList;
public final class i9 implements Runnable {
    public final int f17981a = 1;
    public final MediaDataController f17982b;
    public final boolean f17983c;
    public final int d;
    public final ArrayList f17984e;

    public i9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17982b = mediaDataController;
        this.f17983c = z10;
        this.d = i10;
        this.f17984e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17981a) {
            case 0:
                this.f17982b.lambda$loadRecents$48(this.f17983c, this.f17984e, this.d);
                return;
            default:
                this.f17982b.lambda$processLoadedRecentDocuments$53(this.f17983c, this.d, this.f17984e);
                return;
        }
    }

    public i9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17982b = mediaDataController;
        this.f17983c = z10;
        this.f17984e = arrayList;
        this.d = i10;
    }
}
