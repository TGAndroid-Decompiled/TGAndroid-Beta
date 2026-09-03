package org.telegram.messenger;

import java.util.ArrayList;
public final class n9 implements Runnable {
    public final int f19448a = 1;
    public final MediaDataController f19449b;
    public final boolean f19450c;
    public final int d;
    public final ArrayList f19451e;

    public n9(MediaDataController mediaDataController, boolean z4, int i10, ArrayList arrayList) {
        this.f19449b = mediaDataController;
        this.f19450c = z4;
        this.d = i10;
        this.f19451e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19448a) {
            case 0:
                this.f19449b.lambda$loadRecents$48(this.f19450c, this.f19451e, this.d);
                return;
            default:
                this.f19449b.lambda$processLoadedRecentDocuments$53(this.f19450c, this.d, this.f19451e);
                return;
        }
    }

    public n9(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10) {
        this.f19449b = mediaDataController;
        this.f19450c = z4;
        this.f19451e = arrayList;
        this.d = i10;
    }
}
