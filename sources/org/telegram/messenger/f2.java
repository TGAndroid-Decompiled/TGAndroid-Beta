package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f2 implements Runnable {
    public final int f18620a;
    public final Utilities.Callback f18621b;
    public final ArrayList f18622c;

    public f2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f18620a = i10;
        this.f18621b = callback;
        this.f18622c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18620a) {
            case 0:
                this.f18621b.run(this.f18622c);
                return;
            case 1:
                this.f18621b.run(this.f18622c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f18621b, this.f18622c);
                return;
            default:
                this.f18621b.run(this.f18622c);
                return;
        }
    }
}
