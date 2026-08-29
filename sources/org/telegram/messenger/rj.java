package org.telegram.messenger;

import java.util.List;
public final class rj implements Runnable {
    public final int f21471a;
    public final SendMessagesHelper f21472b;
    public final String f21473c;
    public final List d;

    public rj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f21471a = i10;
        this.f21472b = sendMessagesHelper;
        this.f21473c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f21471a) {
            case 0:
                SendMessagesHelper.M0(this.f21472b, this.f21473c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f21472b, this.f21473c, this.d);
                return;
        }
    }
}
