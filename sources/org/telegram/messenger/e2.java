package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f17714a;
    public final Utilities.Callback f17715b;
    public final ArrayList f17716c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17714a = i10;
        this.f17715b = callback;
        this.f17716c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17714a) {
            case 0:
                this.f17715b.run(this.f17716c);
                return;
            case 1:
                this.f17715b.run(this.f17716c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17715b, this.f17716c);
                return;
            default:
                this.f17715b.run(this.f17716c);
                return;
        }
    }
}
