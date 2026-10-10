package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f17736a = 1;
    public final MediaDataController f17737b;
    public final boolean f17738c;
    public final int d;
    public final ArrayList f17739e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17737b = mediaDataController;
        this.f17738c = z10;
        this.d = i10;
        this.f17739e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17736a) {
            case 0:
                this.f17737b.lambda$loadRecents$48(this.f17738c, this.f17739e, this.d);
                return;
            default:
                this.f17737b.lambda$processLoadedRecentDocuments$53(this.f17738c, this.d, this.f17739e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17737b = mediaDataController;
        this.f17738c = z10;
        this.f17739e = arrayList;
        this.d = i10;
    }
}
