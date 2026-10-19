package org.telegram.messenger;

import java.util.List;
public final class gj implements Runnable {
    public final int f18472a;
    public final SendMessagesHelper f18473b;
    public final String f18474c;
    public final List d;

    public gj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18472a = i10;
        this.f18473b = sendMessagesHelper;
        this.f18474c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18472a) {
            case 0:
                SendMessagesHelper.D(this.f18473b, this.f18474c, this.d);
                return;
            default:
                SendMessagesHelper.Z0(this.f18473b, this.f18474c, this.d);
                return;
        }
    }
}
