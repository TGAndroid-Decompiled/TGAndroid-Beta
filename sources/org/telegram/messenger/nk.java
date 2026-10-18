package org.telegram.messenger;

import java.util.ArrayList;
public final class nk implements Runnable {
    public final int f19126a;
    public final TopicsController f19127b;
    public final long f19128c;
    public final ArrayList d;
    public final boolean e;
    public final long f19129f;

    public nk(TopicsController topicsController, long j10, ArrayList arrayList, boolean z10, long j11, int i10) {
        this.f19126a = i10;
        this.f19127b = topicsController;
        this.f19128c = j10;
        this.d = arrayList;
        this.e = z10;
        this.f19129f = j11;
    }

    @Override
    public final void run() {
        switch (this.f19126a) {
            case 0:
                TopicsController.x(this.f19127b, this.f19128c, this.d, this.e, this.f19129f);
                return;
            default:
                TopicsController.s(this.f19127b, this.f19128c, this.d, this.e, this.f19129f);
                return;
        }
    }
}
