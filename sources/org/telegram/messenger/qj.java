package org.telegram.messenger;

import java.util.List;
public final class qj implements Runnable {
    public final int f18724a;
    public final SendMessagesHelper f18725b;
    public final String f18726c;
    public final List d;

    public qj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18724a = i10;
        this.f18725b = sendMessagesHelper;
        this.f18726c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18724a) {
            case 0:
                this.f18725b.lambda$sendNotificationCallback$31(this.f18726c, this.d);
                return;
            default:
                this.f18725b.lambda$sendCallback$41(this.f18726c, this.d);
                return;
        }
    }
}
