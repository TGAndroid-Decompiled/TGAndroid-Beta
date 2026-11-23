package org.telegram.messenger;
public final class sm implements Runnable {
    public final int f26877a;
    public final np f26878b;
    public final long f26879c;
    public final Runnable d;

    public sm(np npVar, long j3, Runnable runnable, int i7) {
        this.f26877a = i7;
        this.f26878b = npVar;
        this.f26879c = j3;
        this.d = runnable;
    }

    @Override
    public final void run() {
        int i7 = this.f26877a;
        Runnable runnable = this.d;
        long j3 = this.f26879c;
        np npVar = this.f26878b;
        switch (i7) {
            case 0:
                if (runnable != null) {
                    npVar.getClass();
                    runnable.run();
                }
                npVar.getNotificationCenter().k(303, Long.valueOf(j3), 0L);
                return;
            case 1:
                npVar.b3(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                npVar.b3(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public sm(np npVar, Runnable runnable, long j3) {
        this.f26877a = 0;
        this.f26878b = npVar;
        this.d = runnable;
        this.f26879c = j3;
    }
}
