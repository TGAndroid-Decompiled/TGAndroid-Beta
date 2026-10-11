package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f17770a = 1;
    public final MediaDataController f17771b;
    public final boolean f17772c;
    public final int d;
    public final ArrayList f17773e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17771b = mediaDataController;
        this.f17772c = z10;
        this.d = i10;
        this.f17773e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17770a) {
            case 0:
                this.f17771b.lambda$loadRecents$48(this.f17772c, this.f17773e, this.d);
                return;
            default:
                this.f17771b.lambda$processLoadedRecentDocuments$53(this.f17772c, this.d, this.f17773e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17771b = mediaDataController;
        this.f17772c = z10;
        this.f17773e = arrayList;
        this.d = i10;
    }
}
