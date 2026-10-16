package org.telegram.messenger;

import java.util.ArrayList;
public final class h9 implements Runnable {
    public final int f17094a = 1;
    public final MediaDataController f17095b;
    public final boolean f17096c;
    public final int d;
    public final ArrayList e;

    public h9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17095b = mediaDataController;
        this.f17096c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17094a) {
            case 0:
                this.f17095b.lambda$loadRecents$48(this.f17096c, this.e, this.d);
                return;
            default:
                this.f17095b.lambda$processLoadedRecentDocuments$53(this.f17096c, this.d, this.e);
                return;
        }
    }

    public h9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17095b = mediaDataController;
        this.f17096c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
