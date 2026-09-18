package org.telegram.messenger;

import java.util.ArrayList;
public final class sk implements Runnable {
    public final int f17516a;
    public final TopicsController f17517b;
    public final long f17518c;
    public final ArrayList d;
    public final boolean e;
    public final long f17519f;

    public sk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17516a = i10;
        this.f17517b = topicsController;
        this.f17518c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17519f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17516a) {
            case 0:
                TopicsController.x(this.f17517b, this.f17518c, this.d, this.e, this.f17519f);
                return;
            default:
                TopicsController.s(this.f17517b, this.f17518c, this.d, this.e, this.f17519f);
                return;
        }
    }
}
