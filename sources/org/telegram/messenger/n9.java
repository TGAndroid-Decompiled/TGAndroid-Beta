package org.telegram.messenger;

import java.util.ArrayList;
public final class n9 implements Runnable {
    public final int f17920a = 1;
    public final MediaDataController f17921b;
    public final boolean f17922c;
    public final int d;
    public final ArrayList e;

    public n9(MediaDataController mediaDataController, boolean z4, int i10, ArrayList arrayList) {
        this.f17921b = mediaDataController;
        this.f17922c = z4;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17920a) {
            case 0:
                this.f17921b.lambda$loadRecents$48(this.f17922c, this.e, this.d);
                return;
            default:
                this.f17921b.lambda$processLoadedRecentDocuments$53(this.f17922c, this.d, this.e);
                return;
        }
    }

    public n9(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10) {
        this.f17921b = mediaDataController;
        this.f17922c = z4;
        this.e = arrayList;
        this.d = i10;
    }
}
