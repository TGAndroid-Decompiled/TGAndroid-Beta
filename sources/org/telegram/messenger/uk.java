package org.telegram.messenger;

import java.util.ArrayList;
public final class uk implements Runnable {
    public final int f18614a;
    public final TopicsController f18615b;
    public final long f18616c;
    public final ArrayList d;
    public final boolean e;
    public final long f18617f;

    public uk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z4, long j11, int i10) {
        this.f18614a = i10;
        this.f18615b = topicsController;
        this.f18616c = j10;
        this.d = arrayList;
        this.e = z4;
        this.f18617f = j11;
    }

    @Override
    public final void run() {
        switch (this.f18614a) {
            case 0:
                TopicsController.x(this.f18615b, this.f18616c, this.d, this.e, this.f18617f);
                return;
            default:
                TopicsController.s(this.f18615b, this.f18616c, this.d, this.e, this.f18617f);
                return;
        }
    }
}
