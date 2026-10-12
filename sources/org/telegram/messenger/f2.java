package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f2 implements Runnable {
    public final int f17202a;
    public final Utilities.Callback f17203b;
    public final ArrayList f17204c;

    public f2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17202a = i10;
        this.f17203b = callback;
        this.f17204c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17202a) {
            case 0:
                this.f17203b.run(this.f17204c);
                return;
            case 1:
                this.f17203b.run(this.f17204c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17203b, this.f17204c);
                return;
            default:
                this.f17203b.run(this.f17204c);
                return;
        }
    }
}
