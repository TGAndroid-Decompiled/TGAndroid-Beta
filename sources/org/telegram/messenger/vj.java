package org.telegram.messenger;

import java.util.List;
public final class vj implements Runnable {
    public final int f18737a;
    public final SendMessagesHelper f18738b;
    public final String f18739c;
    public final List d;

    public vj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18737a = i10;
        this.f18738b = sendMessagesHelper;
        this.f18739c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18737a) {
            case 0:
                SendMessagesHelper.M0(this.f18738b, this.f18739c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f18738b, this.f18739c, this.d);
                return;
        }
    }
}
