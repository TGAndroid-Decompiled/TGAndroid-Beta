package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class g2 implements Runnable {
    public final int f18402a;
    public final Utilities.Callback f18403b;
    public final ArrayList f18404c;

    public g2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18402a = i10;
        this.f18403b = callback;
        this.f18404c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18402a) {
            case 0:
                this.f18403b.run(this.f18404c);
                return;
            case 1:
                this.f18403b.run(this.f18404c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18403b, this.f18404c);
                return;
            default:
                this.f18403b.run(this.f18404c);
                return;
        }
    }
}
