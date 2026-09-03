package org.telegram.messenger;

import java.util.List;
public final class vj implements Runnable {
    public final int f18719a;
    public final SendMessagesHelper f18720b;
    public final String f18721c;
    public final List d;

    public vj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18719a = i10;
        this.f18720b = sendMessagesHelper;
        this.f18721c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18719a) {
            case 0:
                SendMessagesHelper.M0(this.f18720b, this.f18721c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f18720b, this.f18721c, this.d);
                return;
        }
    }
}
