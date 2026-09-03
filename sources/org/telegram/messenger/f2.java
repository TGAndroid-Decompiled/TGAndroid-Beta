package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f2 implements Runnable {
    public final int f17158a;
    public final Utilities.Callback f17159b;
    public final ArrayList f17160c;

    public f2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17158a = i10;
        this.f17159b = callback;
        this.f17160c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17158a) {
            case 0:
                this.f17159b.run(this.f17160c);
                return;
            case 1:
                this.f17159b.run(this.f17160c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17159b, this.f17160c);
                return;
            default:
                this.f17159b.run(this.f17160c);
                return;
        }
    }
}
