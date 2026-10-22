package org.telegram.messenger;

import java.util.ArrayList;
public final class j9 implements Runnable {
    public final int f18674a = 1;
    public final MediaDataController f18675b;
    public final boolean f18676c;
    public final int d;
    public final ArrayList e;

    public j9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f18675b = mediaDataController;
        this.f18676c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18674a) {
            case 0:
                this.f18675b.lambda$loadRecents$48(this.f18676c, this.e, this.d);
                return;
            default:
                this.f18675b.lambda$processLoadedRecentDocuments$53(this.f18676c, this.d, this.e);
                return;
        }
    }

    public j9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f18675b = mediaDataController;
        this.f18676c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
