package defpackage;

import android.os.SystemClock;
import org.telegram.tgnet.RequestTimeDelegate;
public final class wt8 implements RequestTimeDelegate {
    public final byte a;
    public final fba b;

    public wt8(fba fbaVar, byte b) {
        this.a = b;
        this.b = fbaVar;
    }

    @Override
    public final void run(final long j) {
        byte b = this.a;
        final fba fbaVar = this.b;
        switch (b) {
            case 0:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        long j2 = j;
                        fba fbaVar2 = fbaVar;
                        switch (b2) {
                            case 0:
                                fbaVar2.e = SystemClock.elapsedRealtime();
                                fbaVar2.c = false;
                                if (j2 == -1) {
                                    fbaVar2.d = false;
                                    fbaVar2.b = 0L;
                                } else {
                                    fbaVar2.b = j2;
                                    fbaVar2.d = true;
                                }
                                kk7.e().k(281, fbaVar2);
                                return;
                            default:
                                fbaVar2.e = SystemClock.elapsedRealtime();
                                fbaVar2.c = false;
                                if (j2 == -1) {
                                    fbaVar2.d = false;
                                    fbaVar2.b = 0L;
                                } else {
                                    fbaVar2.b = j2;
                                    fbaVar2.d = true;
                                }
                                kk7.e().k(281, fbaVar2);
                                return;
                        }
                    }
                });
                return;
            default:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        long j2 = j;
                        fba fbaVar2 = fbaVar;
                        switch (b2) {
                            case 0:
                                fbaVar2.e = SystemClock.elapsedRealtime();
                                fbaVar2.c = false;
                                if (j2 == -1) {
                                    fbaVar2.d = false;
                                    fbaVar2.b = 0L;
                                } else {
                                    fbaVar2.b = j2;
                                    fbaVar2.d = true;
                                }
                                kk7.e().k(281, fbaVar2);
                                return;
                            default:
                                fbaVar2.e = SystemClock.elapsedRealtime();
                                fbaVar2.c = false;
                                if (j2 == -1) {
                                    fbaVar2.d = false;
                                    fbaVar2.b = 0L;
                                } else {
                                    fbaVar2.b = j2;
                                    fbaVar2.d = true;
                                }
                                kk7.e().k(281, fbaVar2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
