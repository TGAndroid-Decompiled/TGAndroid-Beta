package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f2 implements Runnable {
    public final int f18334a;
    public final Utilities.Callback f18335b;
    public final ArrayList f18336c;

    public f2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18334a = i10;
        this.f18335b = callback;
        this.f18336c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18334a) {
            case 0:
                this.f18335b.run(this.f18336c);
                return;
            case 1:
                this.f18335b.run(this.f18336c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18335b, this.f18336c);
                return;
            default:
                this.f18335b.run(this.f18336c);
                return;
        }
    }
}
