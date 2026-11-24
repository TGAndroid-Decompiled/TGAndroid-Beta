package defpackage;

import android.os.SystemClock;
import org.telegram.tgnet.RequestTimeDelegate;
public final class xv8 implements RequestTimeDelegate {
    public final byte a;
    public final fda b;

    public xv8(fda fdaVar, byte b) {
        this.a = b;
        this.b = fdaVar;
    }

    @Override
    public final void run(final long j) {
        byte b = this.a;
        final fda fdaVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        long j2 = j;
                        fda fdaVar2 = fdaVar;
                        switch (b2) {
                            case 0:
                                fdaVar2.e = SystemClock.elapsedRealtime();
                                fdaVar2.c = false;
                                if (j2 == -1) {
                                    fdaVar2.d = false;
                                    fdaVar2.b = 0L;
                                } else {
                                    fdaVar2.b = j2;
                                    fdaVar2.d = true;
                                }
                                nm7.e().k(283, fdaVar2);
                                return;
                            default:
                                fdaVar2.e = SystemClock.elapsedRealtime();
                                fdaVar2.c = false;
                                if (j2 == -1) {
                                    fdaVar2.d = false;
                                    fdaVar2.b = 0L;
                                } else {
                                    fdaVar2.b = j2;
                                    fdaVar2.d = true;
                                }
                                nm7.e().k(283, fdaVar2);
                                return;
                        }
                    }
                });
                return;
            default:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        long j2 = j;
                        fda fdaVar2 = fdaVar;
                        switch (b2) {
                            case 0:
                                fdaVar2.e = SystemClock.elapsedRealtime();
                                fdaVar2.c = false;
                                if (j2 == -1) {
                                    fdaVar2.d = false;
                                    fdaVar2.b = 0L;
                                } else {
                                    fdaVar2.b = j2;
                                    fdaVar2.d = true;
                                }
                                nm7.e().k(283, fdaVar2);
                                return;
                            default:
                                fdaVar2.e = SystemClock.elapsedRealtime();
                                fdaVar2.c = false;
                                if (j2 == -1) {
                                    fdaVar2.d = false;
                                    fdaVar2.b = 0L;
                                } else {
                                    fdaVar2.b = j2;
                                    fdaVar2.d = true;
                                }
                                nm7.e().k(283, fdaVar2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
