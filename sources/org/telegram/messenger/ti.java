package org.telegram.messenger;

import java.util.ArrayList;
public final class ti implements Runnable {
    public final int f19094a;
    public final SendMessagesHelper f19095b;
    public final long f19096c;
    public final ArrayList d;

    public ti(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f19094a = i10;
        this.f19095b = sendMessagesHelper;
        this.f19096c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19094a) {
            case 0:
                SendMessagesHelper.u(this.f19095b, this.f19096c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f19095b, this.f19096c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f19095b, this.f19096c, this.d);
                return;
        }
    }
}
