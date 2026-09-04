package org.telegram.messenger;

import java.util.List;
public final class tj implements Runnable {
    public final int f19097a;
    public final SendMessagesHelper f19098b;
    public final String f19099c;
    public final List d;

    public tj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f19097a = i10;
        this.f19098b = sendMessagesHelper;
        this.f19099c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f19097a) {
            case 0:
                SendMessagesHelper.M0(this.f19098b, this.f19099c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f19098b, this.f19099c, this.d);
                return;
        }
    }
}
