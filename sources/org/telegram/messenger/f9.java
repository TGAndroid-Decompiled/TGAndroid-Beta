package org.telegram.messenger;

import java.util.ArrayList;
public final class f9 implements Runnable {
    public final int f18350a = 1;
    public final MediaDataController f18351b;
    public final boolean f18352c;
    public final int d;
    public final ArrayList e;

    public f9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f18351b = mediaDataController;
        this.f18352c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18350a) {
            case 0:
                this.f18351b.lambda$loadRecents$48(this.f18352c, this.e, this.d);
                return;
            default:
                this.f18351b.lambda$processLoadedRecentDocuments$53(this.f18352c, this.d, this.e);
                return;
        }
    }

    public f9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f18351b = mediaDataController;
        this.f18352c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
