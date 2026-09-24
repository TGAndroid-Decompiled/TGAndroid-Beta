package org.telegram.messenger;

import java.util.ArrayList;
public final class i9 implements Runnable {
    public final int f16625a = 1;
    public final MediaDataController f16626b;
    public final boolean f16627c;
    public final int d;
    public final ArrayList e;

    public i9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f16626b = mediaDataController;
        this.f16627c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16625a) {
            case 0:
                this.f16626b.lambda$loadRecents$48(this.f16627c, this.e, this.d);
                return;
            default:
                this.f16626b.lambda$processLoadedRecentDocuments$53(this.f16627c, this.d, this.e);
                return;
        }
    }

    public i9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f16626b = mediaDataController;
        this.f16627c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
