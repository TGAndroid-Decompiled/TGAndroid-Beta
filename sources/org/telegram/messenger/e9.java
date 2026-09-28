package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f16275a = 1;
    public final MediaDataController f16276b;
    public final boolean f16277c;
    public final int d;
    public final ArrayList e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f16276b = mediaDataController;
        this.f16277c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16275a) {
            case 0:
                this.f16276b.lambda$loadRecents$48(this.f16277c, this.e, this.d);
                return;
            default:
                this.f16276b.lambda$processLoadedRecentDocuments$53(this.f16277c, this.d, this.e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f16276b = mediaDataController;
        this.f16277c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
