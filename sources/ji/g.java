package ji;

import org.telegram.messenger.i0;
public final class g implements Runnable {
    public final int f10444a;
    public final k f10445b;

    public g(k kVar, int i10) {
        this.f10444a = i10;
        this.f10445b = kVar;
    }

    private final void a() {
        k kVar = this.f10445b;
        kVar.g();
        synchronized (kVar.f10453a) {
            try {
                if (kVar.f10470u) {
                    return;
                }
                i0.h3(new g(kVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ji.g.run():void");
    }
}
