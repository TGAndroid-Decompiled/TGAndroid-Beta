package defpackage;

import android.os.SystemClock;
import org.telegram.tgnet.RequestTimeDelegate;
public final class fx8 implements RequestTimeDelegate {
    public final byte a;
    public final wea b;

    public fx8(wea weaVar, byte b) {
        this.a = b;
        this.b = weaVar;
    }

    @Override
    public final void run(final long j) {
        byte b = this.a;
        final wea weaVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        long j2 = j;
                        wea weaVar2 = weaVar;
                        switch (b2) {
                            case 0:
                                weaVar2.e = SystemClock.elapsedRealtime();
                                weaVar2.c = false;
                                if (j2 == -1) {
                                    weaVar2.d = false;
                                    weaVar2.b = 0L;
                                } else {
                                    weaVar2.b = j2;
                                    weaVar2.d = true;
                                }
                                jn7.e().k(282, weaVar2);
                                return;
                            default:
                                weaVar2.e = SystemClock.elapsedRealtime();
                                weaVar2.c = false;
                                if (j2 == -1) {
                                    weaVar2.d = false;
                                    weaVar2.b = 0L;
                                } else {
                                    weaVar2.b = j2;
                                    weaVar2.d = true;
                                }
                                jn7.e().k(282, weaVar2);
                                return;
                        }
                    }
                });
                return;
            default:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        long j2 = j;
                        wea weaVar2 = weaVar;
                        switch (b2) {
                            case 0:
                                weaVar2.e = SystemClock.elapsedRealtime();
                                weaVar2.c = false;
                                if (j2 == -1) {
                                    weaVar2.d = false;
                                    weaVar2.b = 0L;
                                } else {
                                    weaVar2.b = j2;
                                    weaVar2.d = true;
                                }
                                jn7.e().k(282, weaVar2);
                                return;
                            default:
                                weaVar2.e = SystemClock.elapsedRealtime();
                                weaVar2.c = false;
                                if (j2 == -1) {
                                    weaVar2.d = false;
                                    weaVar2.b = 0L;
                                } else {
                                    weaVar2.b = j2;
                                    weaVar2.d = true;
                                }
                                jn7.e().k(282, weaVar2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
