package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d2 implements Runnable {
    public final int f17609a;
    public final Utilities.Callback f17610b;
    public final ArrayList f17611c;

    public d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17609a = i10;
        this.f17610b = callback;
        this.f17611c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17609a) {
            case 0:
                this.f17610b.run(this.f17611c);
                return;
            case 1:
                this.f17610b.run(this.f17611c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17610b, this.f17611c);
                return;
            default:
                this.f17610b.run(this.f17611c);
                return;
        }
    }
}
