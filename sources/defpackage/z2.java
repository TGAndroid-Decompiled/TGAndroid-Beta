package defpackage;

import android.icu.util.ULocale;
import android.media.MediaCodec;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
public abstract class z2 {
    public static ULocale a(String str) {
        return new ULocale(str);
    }

    public static MediaCodec.CryptoInfo.Pattern b() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static void c(ue3 ue3Var) {
        if ((Build.VERSION.SDK_INT > 23 && ue3Var == ForkJoinPool.commonPool()) || ue3Var.a.isTerminated()) {
            return;
        }
        ue3Var.shutdown();
        throw null;
    }

    public static void d(pp3 pp3Var) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || pp3Var != ForkJoinPool.commonPool()) && !(isTerminated = pp3Var.isTerminated())) {
            pp3Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = pp3Var.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        pp3Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void e(eg7 eg7Var) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || eg7Var != ForkJoinPool.commonPool()) && !(isTerminated = eg7Var.isTerminated())) {
            eg7Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = eg7Var.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        eg7Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void f(tg7 tg7Var) {
        boolean isTerminated;
        ExecutorService executorService = tg7Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || tg7Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            tg7Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        tg7Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void g(wg7 wg7Var) {
        boolean isTerminated;
        ExecutorService executorService = wg7Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || wg7Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            wg7Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        wg7Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void h(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void i(oef oefVar) {
        boolean isTerminated;
        ExecutorService executorService = oefVar.a;
        if ((Build.VERSION.SDK_INT <= 23 || oefVar != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            oefVar.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        oefVar.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void j(bff bffVar) {
        boolean isTerminated;
        ExecutorService executorService = bffVar.a;
        if ((Build.VERSION.SDK_INT <= 23 || bffVar != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            bffVar.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        bffVar.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void k(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
