package org.telegram.messenger;

import java.util.List;
public final class gj implements Runnable {
    public final int f18479a;
    public final SendMessagesHelper f18480b;
    public final String f18481c;
    public final List d;

    public gj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18479a = i10;
        this.f18480b = sendMessagesHelper;
        this.f18481c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18479a) {
            case 0:
                SendMessagesHelper.D(this.f18480b, this.f18481c, this.d);
                return;
            default:
                SendMessagesHelper.Z0(this.f18480b, this.f18481c, this.d);
                return;
        }
    }
}
