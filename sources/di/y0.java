package di;

import org.telegram.messenger.MessagesStorage;
public final class y0 implements Runnable {
    public final int f8445a;
    public final boolean f8446b;
    public final Object f8447c;
    public final Object d;

    public y0(ig.y yVar, MessagesStorage messagesStorage, boolean z10) {
        this.f8445a = 2;
        this.d = yVar;
        this.f8447c = messagesStorage;
        this.f8446b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.y0.run():void");
    }

    public y0(Object obj, Object obj2, boolean z10, int i10) {
        this.f8445a = i10;
        this.f8447c = obj;
        this.d = obj2;
        this.f8446b = z10;
    }

    public y0(Object obj, boolean z10, Object obj2, int i10) {
        this.f8445a = i10;
        this.f8447c = obj;
        this.f8446b = z10;
        this.d = obj2;
    }
}
