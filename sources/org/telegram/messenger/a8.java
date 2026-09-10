package org.telegram.messenger;

import java.util.ArrayList;
public final class a8 implements Runnable {
    public final int f14692a;
    public final MediaDataController f14693b;
    public final ArrayList f14694c;

    public a8(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f14692a = i10;
        this.f14693b = mediaDataController;
        this.f14694c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f14692a) {
            case 0:
                MediaDataController.d0(this.f14693b, this.f14694c);
                return;
            default:
                MediaDataController.D1(this.f14693b, this.f14694c);
                return;
        }
    }
}
