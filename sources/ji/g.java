package ji;

import org.telegram.messenger.i0;
public final class g implements Runnable {
    public final int f10443a;
    public final k f10444b;

    public g(k kVar, int i10) {
        this.f10443a = i10;
        this.f10444b = kVar;
    }

    private final void a() {
        k kVar = this.f10444b;
        kVar.g();
        synchronized (kVar.f10452a) {
            try {
                if (kVar.f10469u) {
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
