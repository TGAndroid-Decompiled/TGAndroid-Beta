package org.telegram.messenger;

import java.util.ArrayList;
public final class i9 implements Runnable {
    public final int f16640a = 1;
    public final MediaDataController f16641b;
    public final boolean f16642c;
    public final int d;
    public final ArrayList e;

    public i9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f16641b = mediaDataController;
        this.f16642c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16640a) {
            case 0:
                this.f16641b.lambda$loadRecents$48(this.f16642c, this.e, this.d);
                return;
            default:
                this.f16641b.lambda$processLoadedRecentDocuments$53(this.f16642c, this.d, this.e);
                return;
        }
    }

    public i9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f16641b = mediaDataController;
        this.f16642c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
