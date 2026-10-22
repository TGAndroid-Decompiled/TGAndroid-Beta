package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class g2 implements Runnable {
    public final int f18397a;
    public final Utilities.Callback f18398b;
    public final ArrayList f18399c;

    public g2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18397a = i10;
        this.f18398b = callback;
        this.f18399c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18397a) {
            case 0:
                this.f18398b.run(this.f18399c);
                return;
            case 1:
                this.f18398b.run(this.f18399c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18398b, this.f18399c);
                return;
            default:
                this.f18398b.run(this.f18399c);
                return;
        }
    }
}
