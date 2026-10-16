package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f2 implements Runnable {
    public final int f16901a;
    public final Utilities.Callback f16902b;
    public final ArrayList f16903c;

    public f2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f16901a = i10;
        this.f16902b = callback;
        this.f16903c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16901a) {
            case 0:
                this.f16902b.run(this.f16903c);
                return;
            case 1:
                this.f16902b.run(this.f16903c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f16902b, this.f16903c);
                return;
            default:
                this.f16902b.run(this.f16903c);
                return;
        }
    }
}
