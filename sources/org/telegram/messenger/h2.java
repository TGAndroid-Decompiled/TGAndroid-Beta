package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class h2 implements Runnable {
    public final int f20210a;
    public final Utilities.Callback f20211b;
    public final ArrayList f20212c;

    public h2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f20210a = i10;
        this.f20211b = callback;
        this.f20212c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20210a) {
            case 0:
                this.f20211b.run(this.f20212c);
                return;
            case 1:
                this.f20211b.run(this.f20212c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f20211b, this.f20212c);
                return;
            default:
                this.f20211b.run(this.f20212c);
                return;
        }
    }
}
