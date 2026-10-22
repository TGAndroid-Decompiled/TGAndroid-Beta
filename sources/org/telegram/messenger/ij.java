package org.telegram.messenger;

import java.util.List;
public final class ij implements Runnable {
    public final int f18627a;
    public final SendMessagesHelper f18628b;
    public final String f18629c;
    public final List d;

    public ij(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18627a = i10;
        this.f18628b = sendMessagesHelper;
        this.f18629c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18627a) {
            case 0:
                SendMessagesHelper.D(this.f18628b, this.f18629c, this.d);
                return;
            default:
                SendMessagesHelper.a1(this.f18628b, this.f18629c, this.d);
                return;
        }
    }
}
