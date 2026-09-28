package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f16250a;
    public final Utilities.Callback f16251b;
    public final ArrayList f16252c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f16250a = i10;
        this.f16251b = callback;
        this.f16252c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16250a) {
            case 0:
                this.f16251b.run(this.f16252c);
                return;
            case 1:
                this.f16251b.run(this.f16252c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f16251b, this.f16252c);
                return;
            default:
                this.f16251b.run(this.f16252c);
                return;
        }
    }
}
