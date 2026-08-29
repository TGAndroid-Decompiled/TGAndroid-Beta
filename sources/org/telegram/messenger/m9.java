package org.telegram.messenger;

import java.util.ArrayList;
public final class m9 implements Runnable {
    public final int f20937a = 1;
    public final MediaDataController f20938b;
    public final boolean f20939c;
    public final int d;
    public final ArrayList f20940e;

    public m9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f20938b = mediaDataController;
        this.f20939c = z10;
        this.d = i10;
        this.f20940e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20937a) {
            case 0:
                this.f20938b.lambda$loadRecents$48(this.f20939c, this.f20940e, this.d);
                return;
            default:
                this.f20938b.lambda$processLoadedRecentDocuments$53(this.f20939c, this.d, this.f20940e);
                return;
        }
    }

    public m9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f20938b = mediaDataController;
        this.f20939c = z10;
        this.f20940e = arrayList;
        this.d = i10;
    }
}
