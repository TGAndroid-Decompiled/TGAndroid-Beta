package oi;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f16930a;
    public final k f16931b;

    public g(k kVar, int i10) {
        this.f16930a = i10;
        this.f16931b = kVar;
    }

    private final void a() {
        k kVar = this.f16931b;
        kVar.e();
        synchronized (kVar.f16940a) {
            try {
                if (kVar.f16958u) {
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
