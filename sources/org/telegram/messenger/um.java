package org.telegram.messenger;
public final class um implements Runnable {
    public final int f26841a;
    public final np f26842b;
    public final long f26843c;
    public final Runnable d;

    public um(np npVar, long j3, Runnable runnable, int i7) {
        this.f26841a = i7;
        this.f26842b = npVar;
        this.f26843c = j3;
        this.d = runnable;
    }

    @Override
    public final void run() {
        int i7 = this.f26841a;
        Runnable runnable = this.d;
        long j3 = this.f26843c;
        np npVar = this.f26842b;
        switch (i7) {
            case 0:
                if (runnable != null) {
                    npVar.getClass();
                    runnable.run();
                }
                npVar.getNotificationCenter().k(300, Long.valueOf(j3), 0L);
                return;
            case 1:
                npVar.V2(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                npVar.V2(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public um(np npVar, Runnable runnable, long j3) {
        this.f26841a = 0;
        this.f26842b = npVar;
        this.d = runnable;
        this.f26843c = j3;
    }
}
