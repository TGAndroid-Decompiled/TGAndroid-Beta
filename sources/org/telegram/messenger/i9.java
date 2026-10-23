package org.telegram.messenger;

import java.util.ArrayList;
public final class i9 implements Runnable {
    public final int f18675a = 1;
    public final MediaDataController f18676b;
    public final boolean f18677c;
    public final int d;
    public final ArrayList e;

    public i9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f18676b = mediaDataController;
        this.f18677c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18675a) {
            case 0:
                this.f18676b.lambda$loadRecents$48(this.f18677c, this.e, this.d);
                return;
            default:
                this.f18676b.lambda$processLoadedRecentDocuments$53(this.f18677c, this.d, this.e);
                return;
        }
    }

    public i9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f18676b = mediaDataController;
        this.f18677c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
