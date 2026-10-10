package oi;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f17182a;
    public final k f17183b;

    public g(k kVar, int i10) {
        this.f17182a = i10;
        this.f17183b = kVar;
    }

    private final void a() {
        k kVar = this.f17183b;
        kVar.e();
        synchronized (kVar.f17192a) {
            try {
                if (kVar.f17210u) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(kVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: oi.g.run():void");
    }
}
