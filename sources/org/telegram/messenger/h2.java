package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class h2 implements Runnable {
    public final int f15324a;
    public final Utilities.Callback f15325b;
    public final ArrayList f15326c;

    public h2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f15324a = i10;
        this.f15325b = callback;
        this.f15326c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15324a) {
            case 0:
                this.f15325b.run(this.f15326c);
                return;
            case 1:
                this.f15325b.run(this.f15326c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f15325b, this.f15326c);
                return;
            default:
                this.f15325b.run(this.f15326c);
                return;
        }
    }
}
