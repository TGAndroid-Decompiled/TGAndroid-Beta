package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f17713a;
    public final Utilities.Callback f17714b;
    public final ArrayList f17715c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17713a = i10;
        this.f17714b = callback;
        this.f17715c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17713a) {
            case 0:
                this.f17714b.run(this.f17715c);
                return;
            case 1:
                this.f17714b.run(this.f17715c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17714b, this.f17715c);
                return;
            default:
                this.f17714b.run(this.f17715c);
                return;
        }
    }
}
