package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d2 implements Runnable {
    public final int f16156a;
    public final Utilities.Callback f16157b;
    public final ArrayList f16158c;

    public d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f16156a = i10;
        this.f16157b = callback;
        this.f16158c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16156a) {
            case 0:
                this.f16157b.run(this.f16158c);
                return;
            case 1:
                this.f16157b.run(this.f16158c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f16157b, this.f16158c);
                return;
            default:
                this.f16157b.run(this.f16158c);
                return;
        }
    }
}
