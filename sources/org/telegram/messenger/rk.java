package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f17239a;
    public final TopicsController f17240b;
    public final long f17241c;
    public final ArrayList d;
    public final boolean e;
    public final long f17242f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f17239a = i10;
        this.f17240b = topicsController;
        this.f17241c = j3;
        this.d = arrayList;
        this.e = z10;
        this.f17242f = j10;
    }

    @Override
    public final void run() {
        switch (this.f17239a) {
            case 0:
                TopicsController.x(this.f17240b, this.f17241c, this.d, this.e, this.f17242f);
                return;
            default:
                TopicsController.s(this.f17240b, this.f17241c, this.d, this.e, this.f17242f);
                return;
        }
    }
}
