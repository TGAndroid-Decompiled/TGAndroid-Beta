package bi;

import org.telegram.messenger.MessagesStorage;
public final class c1 implements Runnable {
    public final int f2396a;
    public final boolean f2397b;
    public final Object f2398c;
    public final Object d;

    public c1(gg.b0 b0Var, MessagesStorage messagesStorage, boolean z10) {
        this.f2396a = 2;
        this.d = b0Var;
        this.f2398c = messagesStorage;
        this.f2397b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.c1.run():void");
    }

    public c1(Object obj, Object obj2, boolean z10, int i10) {
        this.f2396a = i10;
        this.f2398c = obj;
        this.d = obj2;
        this.f2397b = z10;
    }

    public c1(Object obj, boolean z10, Object obj2, int i10) {
        this.f2396a = i10;
        this.f2398c = obj;
        this.f2397b = z10;
        this.d = obj2;
    }
}
