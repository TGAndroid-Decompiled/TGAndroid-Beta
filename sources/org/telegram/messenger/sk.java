package org.telegram.messenger;

import java.util.ArrayList;
public final class sk implements Runnable {
    public final int f17549a;
    public final TopicsController f17550b;
    public final long f17551c;
    public final ArrayList d;
    public final boolean e;
    public final long f17552f;

    public sk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17549a = i10;
        this.f17550b = topicsController;
        this.f17551c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17552f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17549a) {
            case 0:
                TopicsController.x(this.f17550b, this.f17551c, this.d, this.e, this.f17552f);
                return;
            default:
                TopicsController.s(this.f17550b, this.f17551c, this.d, this.e, this.f17552f);
                return;
        }
    }
}
