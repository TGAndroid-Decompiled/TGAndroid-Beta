package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f17734a = 1;
    public final MediaDataController f17735b;
    public final boolean f17736c;
    public final int d;
    public final ArrayList f17737e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17735b = mediaDataController;
        this.f17736c = z10;
        this.d = i10;
        this.f17737e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17734a) {
            case 0:
                this.f17735b.lambda$loadRecents$48(this.f17736c, this.f17737e, this.d);
                return;
            default:
                this.f17735b.lambda$processLoadedRecentDocuments$53(this.f17736c, this.d, this.f17737e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17735b = mediaDataController;
        this.f17736c = z10;
        this.f17737e = arrayList;
        this.d = i10;
    }
}
