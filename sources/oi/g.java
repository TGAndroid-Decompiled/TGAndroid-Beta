package oi;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f17178a;
    public final k f17179b;

    public g(k kVar, int i10) {
        this.f17178a = i10;
        this.f17179b = kVar;
    }

    private final void a() {
        k kVar = this.f17179b;
        kVar.e();
        synchronized (kVar.f17188a) {
            try {
                if (kVar.f17206u) {
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
