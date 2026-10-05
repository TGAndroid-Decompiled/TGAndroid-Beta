package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f17719a;
    public final Utilities.Callback f17720b;
    public final ArrayList f17721c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17719a = i10;
        this.f17720b = callback;
        this.f17721c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17719a) {
            case 0:
                this.f17720b.run(this.f17721c);
                return;
            case 1:
                this.f17720b.run(this.f17721c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17720b, this.f17721c);
                return;
            default:
                this.f17720b.run(this.f17721c);
                return;
        }
    }
}
