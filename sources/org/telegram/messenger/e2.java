package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 implements Runnable {
    public final int f20087a;
    public final Utilities.Callback f20088b;
    public final ArrayList f20089c;

    public e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f20087a = i10;
        this.f20088b = callback;
        this.f20089c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20087a) {
            case 0:
                this.f20088b.run(this.f20089c);
                return;
            case 1:
                this.f20088b.run(this.f20089c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f20088b, this.f20089c);
                return;
            default:
                this.f20088b.run(this.f20089c);
                return;
        }
    }
}
