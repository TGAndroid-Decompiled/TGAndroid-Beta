package org.telegram.messenger;

import java.util.ArrayList;
public final class k9 implements Runnable {
    public final int f20508a = 1;
    public final MediaDataController f20509b;
    public final boolean f20510c;
    public final int d;
    public final ArrayList e;

    public k9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f20509b = mediaDataController;
        this.f20510c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20508a) {
            case 0:
                this.f20509b.lambda$loadRecents$48(this.f20510c, this.e, this.d);
                return;
            default:
                this.f20509b.lambda$processLoadedRecentDocuments$53(this.f20510c, this.d, this.e);
                return;
        }
    }

    public k9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f20509b = mediaDataController;
        this.f20510c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
