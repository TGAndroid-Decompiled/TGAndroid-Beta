package org.telegram.messenger;

import java.util.ArrayList;
public final class ti implements Runnable {
    public final int f17410a;
    public final SendMessagesHelper f17411b;
    public final long f17412c;
    public final ArrayList d;

    public ti(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f17410a = i10;
        this.f17411b = sendMessagesHelper;
        this.f17412c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17410a) {
            case 0:
                SendMessagesHelper.u(this.f17411b, this.f17412c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f17411b, this.f17412c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f17411b, this.f17412c, this.d);
                return;
        }
    }
}
