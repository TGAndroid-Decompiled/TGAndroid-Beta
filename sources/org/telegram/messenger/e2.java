package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f16237a;
    public final Utilities.Callback f16238b;
    public final ArrayList f16239c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f16237a = i10;
        this.f16238b = callback;
        this.f16239c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16237a) {
            case 0:
                this.f16238b.run(this.f16239c);
                return;
            case 1:
                this.f16238b.run(this.f16239c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f16238b, this.f16239c);
                return;
            default:
                this.f16238b.run(this.f16239c);
                return;
        }
    }
}
