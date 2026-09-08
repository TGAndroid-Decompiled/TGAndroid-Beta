package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d2 implements Runnable {
    public final int f17465a;
    public final Utilities.Callback f17466b;
    public final ArrayList f17467c;

    public d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17465a = i10;
        this.f17466b = callback;
        this.f17467c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17465a) {
            case 0:
                this.f17466b.run(this.f17467c);
                return;
            case 1:
                this.f17466b.run(this.f17467c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17466b, this.f17467c);
                return;
            default:
                this.f17466b.run(this.f17467c);
                return;
        }
    }
}
