package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f16276a = 1;
    public final MediaDataController f16277b;
    public final boolean f16278c;
    public final int d;
    public final ArrayList e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f16277b = mediaDataController;
        this.f16278c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16276a) {
            case 0:
                this.f16277b.lambda$loadRecents$48(this.f16278c, this.e, this.d);
                return;
            default:
                this.f16277b.lambda$processLoadedRecentDocuments$53(this.f16278c, this.d, this.e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f16277b = mediaDataController;
        this.f16278c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
