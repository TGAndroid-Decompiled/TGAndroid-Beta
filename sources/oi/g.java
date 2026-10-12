package oi;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f16929a;
    public final k f16930b;

    public g(k kVar, int i10) {
        this.f16929a = i10;
        this.f16930b = kVar;
    }

    private final void a() {
        k kVar = this.f16930b;
        kVar.e();
        synchronized (kVar.f16939a) {
            try {
                if (kVar.f16957u) {
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
