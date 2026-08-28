package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f20143a;
    public final Utilities.Callback f20144b;
    public final ArrayList f20145c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i9) {
        this.f20143a = i9;
        this.f20144b = callback;
        this.f20145c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20143a) {
            case 0:
                this.f20144b.run(this.f20145c);
                return;
            case 1:
                this.f20144b.run(this.f20145c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f20144b, this.f20145c);
                return;
            default:
                this.f20144b.run(this.f20145c);
                return;
        }
    }
}
