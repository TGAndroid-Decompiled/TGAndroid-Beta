package org.telegram.messenger;

import java.util.ArrayList;
public final class ni implements Runnable {
    public final int f20801a;
    public final SendMessagesHelper f20802b;
    public final long f20803c;
    public final ArrayList d;

    public ni(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f20801a = i10;
        this.f20802b = sendMessagesHelper;
        this.f20803c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20801a) {
            case 0:
                SendMessagesHelper.h0(this.f20802b, this.f20803c, this.d);
                return;
            case 1:
                SendMessagesHelper.v(this.f20802b, this.f20803c, this.d);
                return;
            default:
                SendMessagesHelper.A1(this.f20802b, this.f20803c, this.d);
                return;
        }
    }
}
