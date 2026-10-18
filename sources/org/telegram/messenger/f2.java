package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f2 implements Runnable {
    public final int f18312a;
    public final Utilities.Callback f18313b;
    public final ArrayList f18314c;

    public f2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18312a = i10;
        this.f18313b = callback;
        this.f18314c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18312a) {
            case 0:
                this.f18313b.run(this.f18314c);
                return;
            case 1:
                this.f18313b.run(this.f18314c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18313b, this.f18314c);
                return;
            default:
                this.f18313b.run(this.f18314c);
                return;
        }
    }
}
