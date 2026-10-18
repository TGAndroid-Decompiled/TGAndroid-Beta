package org.telegram.messenger;

import java.util.List;
public final class fj implements Runnable {
    public final int f18396a;
    public final SendMessagesHelper f18397b;
    public final String f18398c;
    public final List d;

    public fj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18396a = i10;
        this.f18397b = sendMessagesHelper;
        this.f18398c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18396a) {
            case 0:
                SendMessagesHelper.D(this.f18397b, this.f18398c, this.d);
                return;
            default:
                SendMessagesHelper.Z0(this.f18397b, this.f18398c, this.d);
                return;
        }
    }
}
