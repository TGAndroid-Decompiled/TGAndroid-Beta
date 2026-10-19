package org.telegram.messenger;

import java.util.List;
public final class fj implements Runnable {
    public final int f18393a;
    public final SendMessagesHelper f18394b;
    public final String f18395c;
    public final List d;

    public fj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18393a = i10;
        this.f18394b = sendMessagesHelper;
        this.f18395c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18393a) {
            case 0:
                SendMessagesHelper.D(this.f18394b, this.f18395c, this.d);
                return;
            default:
                SendMessagesHelper.Z0(this.f18394b, this.f18395c, this.d);
                return;
        }
    }
}
