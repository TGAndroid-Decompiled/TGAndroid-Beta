package org.telegram.messenger;

import java.util.List;
public final class ij implements Runnable {
    public final int f18694a;
    public final SendMessagesHelper f18695b;
    public final String f18696c;
    public final List d;

    public ij(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18694a = i10;
        this.f18695b = sendMessagesHelper;
        this.f18696c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18694a) {
            case 0:
                SendMessagesHelper.D(this.f18695b, this.f18696c, this.d);
                return;
            default:
                SendMessagesHelper.a1(this.f18695b, this.f18696c, this.d);
                return;
        }
    }
}
