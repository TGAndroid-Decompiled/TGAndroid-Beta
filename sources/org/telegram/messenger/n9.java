package org.telegram.messenger;

import java.util.ArrayList;
public final class n9 implements Runnable {
    public final int f19446a = 1;
    public final MediaDataController f19447b;
    public final boolean f19448c;
    public final int d;
    public final ArrayList f19449e;

    public n9(MediaDataController mediaDataController, boolean z4, int i10, ArrayList arrayList) {
        this.f19447b = mediaDataController;
        this.f19448c = z4;
        this.d = i10;
        this.f19449e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19446a) {
            case 0:
                this.f19447b.lambda$loadRecents$48(this.f19448c, this.f19449e, this.d);
                return;
            default:
                this.f19447b.lambda$processLoadedRecentDocuments$53(this.f19448c, this.d, this.f19449e);
                return;
        }
    }

    public n9(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10) {
        this.f19447b = mediaDataController;
        this.f19448c = z4;
        this.f19449e = arrayList;
        this.d = i10;
    }
}
