package org.telegram.messenger;

import java.util.ArrayList;

public final class k9 implements Runnable {

    public final int f20752a = 1;

    public final MediaDataController f20753b;

    public final boolean f20754c;
    public final int d;

    public final ArrayList f20755e;

    public k9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f20753b = mediaDataController;
        this.f20754c = z10;
        this.d = i10;
        this.f20755e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20752a) {
            case 0:
                this.f20753b.lambda$loadRecents$48(this.f20754c, this.f20755e, this.d);
                break;
            default:
                this.f20753b.lambda$processLoadedRecentDocuments$53(this.f20754c, this.d, this.f20755e);
                break;
        }
    }

    public k9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f20753b = mediaDataController;
        this.f20754c = z10;
        this.f20755e = arrayList;
        this.d = i10;
    }
}
