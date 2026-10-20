package org.telegram.messenger;

import java.util.ArrayList;
public final class g9 implements Runnable {
    public final int f18443a = 1;
    public final MediaDataController f18444b;
    public final boolean f18445c;
    public final int d;
    public final ArrayList e;

    public g9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f18444b = mediaDataController;
        this.f18445c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18443a) {
            case 0:
                this.f18444b.lambda$loadRecents$48(this.f18445c, this.e, this.d);
                return;
            default:
                this.f18444b.lambda$processLoadedRecentDocuments$53(this.f18445c, this.d, this.e);
                return;
        }
    }

    public g9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f18444b = mediaDataController;
        this.f18445c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
