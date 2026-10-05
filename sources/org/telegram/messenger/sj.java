package org.telegram.messenger;

import java.util.List;
public final class sj implements Runnable {
    public final int f19181a;
    public final SendMessagesHelper f19182b;
    public final String f19183c;
    public final List d;

    public sj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f19181a = i10;
        this.f19182b = sendMessagesHelper;
        this.f19183c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f19181a) {
            case 0:
                SendMessagesHelper.M0(this.f19182b, this.f19183c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f19182b, this.f19183c, this.d);
                return;
        }
    }
}
