package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d2 implements Runnable {
    public final int f17464a;
    public final Utilities.Callback f17465b;
    public final ArrayList f17466c;

    public d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17464a = i10;
        this.f17465b = callback;
        this.f17466c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17464a) {
            case 0:
                this.f17465b.run(this.f17466c);
                return;
            case 1:
                this.f17465b.run(this.f17466c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17465b, this.f17466c);
                return;
            default:
                this.f17465b.run(this.f17466c);
                return;
        }
    }
}
