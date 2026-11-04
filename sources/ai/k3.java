package ai;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f762a;
    public final Object f763b;
    public final Object f764c;
    public final Object d;

    public k3(Object obj, Object obj2, Object obj3, int i3) {
        this.f762a = i3;
        this.f763b = obj;
        this.f764c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.k3.run():void");
    }

    public k3(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f762a = i3;
        this.f763b = obj2;
        this.f764c = obj3;
        this.d = obj4;
    }

    public k3(Object obj, Object obj2, TLRPC.TL_error tL_error, int i3) {
        this.f762a = i3;
        this.f763b = obj;
        this.d = obj2;
        this.f764c = tL_error;
    }
}
