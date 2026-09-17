package org.telegram.messenger;

import java.util.ArrayList;
public final class h9 implements Runnable {
    public final int f17874a = 1;
    public final MediaDataController f17875b;
    public final boolean f17876c;
    public final int d;
    public final ArrayList f17877e;

    public h9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17875b = mediaDataController;
        this.f17876c = z10;
        this.d = i10;
        this.f17877e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17874a) {
            case 0:
                this.f17875b.lambda$loadRecents$48(this.f17876c, this.f17877e, this.d);
                return;
            default:
                this.f17875b.lambda$processLoadedRecentDocuments$53(this.f17876c, this.d, this.f17877e);
                return;
        }
    }

    public h9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17875b = mediaDataController;
        this.f17876c = z10;
        this.f17877e = arrayList;
        this.d = i10;
    }
}
