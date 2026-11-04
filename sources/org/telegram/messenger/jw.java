package org.telegram.messenger;

import java.util.ArrayList;
public final class jw implements Runnable {
    public final int f23730a;
    public final yy f23731b;
    public final long f23732c;
    public final ArrayList d;

    public jw(yy yyVar, long j10, ArrayList arrayList, int i3) {
        this.f23730a = i3;
        this.f23731b = yyVar;
        this.f23732c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f23730a) {
            case 0:
                this.f23731b.getMessagesController().l3(this.d, this.f23732c);
                return;
            case 1:
                this.f23731b.getMessagesController().l3(this.d, this.f23732c);
                return;
            default:
                this.f23731b.getMessagesController().l3(this.d, this.f23732c);
                return;
        }
    }
}
