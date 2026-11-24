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

    public static void c(id3 id3Var) {
        if ((Build.VERSION.SDK_INT > 23 && id3Var == ForkJoinPool.commonPool()) || id3Var.a.isTerminated()) {
            return;
        }
        id3Var.shutdown();
        throw null;
    }

    public static void d(fo3 fo3Var) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || fo3Var != ForkJoinPool.commonPool()) && !(isTerminated = fo3Var.isTerminated())) {
            fo3Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = fo3Var.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        fo3Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void e(ce7 ce7Var) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || ce7Var != ForkJoinPool.commonPool()) && !(isTerminated = ce7Var.isTerminated())) {
            ce7Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = ce7Var.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        ce7Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void f(re7 re7Var) {
        boolean isTerminated;
        ExecutorService executorService = re7Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || re7Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            re7Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        re7Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void g(ue7 ue7Var) {
        boolean isTerminated;
        ExecutorService executorService = ue7Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || ue7Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            ue7Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        ue7Var.shutdownNow();
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

    public static void i(ncf ncfVar) {
        boolean isTerminated;
        ExecutorService executorService = ncfVar.a;
        if ((Build.VERSION.SDK_INT <= 23 || ncfVar != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            ncfVar.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        ncfVar.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void j(adf adfVar) {
        boolean isTerminated;
        ExecutorService executorService = adfVar.a;
        if ((Build.VERSION.SDK_INT <= 23 || adfVar != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            adfVar.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        adfVar.shutdownNow();
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
