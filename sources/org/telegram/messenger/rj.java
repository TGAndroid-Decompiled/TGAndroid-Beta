package org.telegram.messenger;

import java.util.List;
public final class rj implements Runnable {
    public final int f19095a;
    public final SendMessagesHelper f19096b;
    public final String f19097c;
    public final List d;

    public rj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f19095a = i10;
        this.f19096b = sendMessagesHelper;
        this.f19097c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f19095a) {
            case 0:
                SendMessagesHelper.M0(this.f19096b, this.f19097c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f19096b, this.f19097c, this.d);
                return;
        }
    }
}
