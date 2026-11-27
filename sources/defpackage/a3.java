package defpackage;

import android.icu.util.ULocale;
import android.media.MediaCodec;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
public abstract class a3 {
    public static ULocale a(String str) {
        return new ULocale(str);
    }

    public static MediaCodec.CryptoInfo.Pattern b() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static void c(be3 be3Var) {
        if ((Build.VERSION.SDK_INT > 23 && be3Var == ForkJoinPool.commonPool()) || be3Var.a.isTerminated()) {
            return;
        }
        be3Var.shutdown();
        throw null;
    }

    public static void d(wo3 wo3Var) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || wo3Var != ForkJoinPool.commonPool()) && !(isTerminated = wo3Var.isTerminated())) {
            wo3Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = wo3Var.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        wo3Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void e(lg7 lg7Var) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || lg7Var != ForkJoinPool.commonPool()) && !(isTerminated = lg7Var.isTerminated())) {
            lg7Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = lg7Var.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        lg7Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void f(ah7 ah7Var) {
        boolean isTerminated;
        ExecutorService executorService = ah7Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || ah7Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            ah7Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        ah7Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void g(dh7 dh7Var) {
        boolean isTerminated;
        ExecutorService executorService = dh7Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || dh7Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            dh7Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        dh7Var.shutdownNow();
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

    public static void i(dhf dhfVar) {
        boolean isTerminated;
        ExecutorService executorService = dhfVar.a;
        if ((Build.VERSION.SDK_INT <= 23 || dhfVar != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            dhfVar.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        dhfVar.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void j(qhf qhfVar) {
        boolean isTerminated;
        ExecutorService executorService = qhfVar.a;
        if ((Build.VERSION.SDK_INT <= 23 || qhfVar != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            qhfVar.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        qhfVar.shutdownNow();
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
