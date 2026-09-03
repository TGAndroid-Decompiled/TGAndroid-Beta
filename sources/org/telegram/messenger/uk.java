package org.telegram.messenger;

import java.util.ArrayList;
public final class uk implements Runnable {
    public final int f18596a;
    public final TopicsController f18597b;
    public final long f18598c;
    public final ArrayList d;
    public final boolean e;
    public final long f18599f;

    public uk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z4, long j11, int i10) {
        this.f18596a = i10;
        this.f18597b = topicsController;
        this.f18598c = j10;
        this.d = arrayList;
        this.e = z4;
        this.f18599f = j11;
    }

    @Override
    public final void run() {
        switch (this.f18596a) {
            case 0:
                TopicsController.x(this.f18597b, this.f18598c, this.d, this.e, this.f18599f);
                return;
            default:
                TopicsController.s(this.f18597b, this.f18598c, this.d, this.e, this.f18599f);
                return;
        }
    }
}
