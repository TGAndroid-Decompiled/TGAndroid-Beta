package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19085a;
    public final TopicsController f19086b;
    public final long f19087c;
    public final ArrayList d;
    public final boolean f19088e;
    public final long f19089f;

    public rk(TopicsController topicsController, long j3, ArrayList arrayList, boolean z10, long j10, int i10) {
        this.f19085a = i10;
        this.f19086b = topicsController;
        this.f19087c = j3;
        this.d = arrayList;
        this.f19088e = z10;
        this.f19089f = j10;
    }

    @Override
    public final void run() {
        switch (this.f19085a) {
            case 0:
                TopicsController.x(this.f19086b, this.f19087c, this.d, this.f19088e, this.f19089f);
                return;
            default:
                TopicsController.s(this.f19086b, this.f19087c, this.d, this.f19088e, this.f19089f);
                return;
        }
    }
}
