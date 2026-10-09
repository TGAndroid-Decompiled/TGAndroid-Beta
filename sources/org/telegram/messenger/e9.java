package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f17732a = 1;
    public final MediaDataController f17733b;
    public final boolean f17734c;
    public final int d;
    public final ArrayList f17735e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17733b = mediaDataController;
        this.f17734c = z10;
        this.d = i10;
        this.f17735e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17732a) {
            case 0:
                this.f17733b.lambda$loadRecents$48(this.f17734c, this.f17735e, this.d);
                return;
            default:
                this.f17733b.lambda$processLoadedRecentDocuments$53(this.f17734c, this.d, this.f17735e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17733b = mediaDataController;
        this.f17734c = z10;
        this.f17735e = arrayList;
        this.d = i10;
    }
}
