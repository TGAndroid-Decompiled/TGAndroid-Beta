package org.telegram.messenger;

import java.util.ArrayList;

public final class f2 implements Runnable {

    public final int f20212a;

    public final Utilities.Callback f20213b;

    public final ArrayList f20214c;

    public f2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f20212a = i10;
        this.f20213b = callback;
        this.f20214c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20212a) {
            case 0:
                this.f20213b.run(this.f20214c);
                break;
            case 1:
                this.f20213b.run(this.f20214c);
                break;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f20213b, this.f20214c);
                break;
            default:
                this.f20213b.run(this.f20214c);
                break;
        }
    }
}
