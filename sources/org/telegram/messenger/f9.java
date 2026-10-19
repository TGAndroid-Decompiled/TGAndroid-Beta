package org.telegram.messenger;

import java.util.ArrayList;
public final class f9 implements Runnable {
    public final int f18353a = 1;
    public final MediaDataController f18354b;
    public final boolean f18355c;
    public final int d;
    public final ArrayList e;

    public f9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f18354b = mediaDataController;
        this.f18355c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18353a) {
            case 0:
                this.f18354b.lambda$loadRecents$48(this.f18355c, this.e, this.d);
                return;
            default:
                this.f18354b.lambda$processLoadedRecentDocuments$53(this.f18355c, this.d, this.e);
                return;
        }
    }

    public f9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f18354b = mediaDataController;
        this.f18355c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
