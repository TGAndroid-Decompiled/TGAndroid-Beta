package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f2 implements Runnable {
    public final int f17178a;
    public final Utilities.Callback f17179b;
    public final ArrayList f17180c;

    public f2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.f17178a = i10;
        this.f17179b = callback;
        this.f17180c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17178a) {
            case 0:
                this.f17179b.run(this.f17180c);
                return;
            case 1:
                this.f17179b.run(this.f17180c);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.f17179b, this.f17180c);
                return;
            default:
                this.f17179b.run(this.f17180c);
                return;
        }
    }
}
