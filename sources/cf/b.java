package cf;

import android.media.MediaCodec;
import android.os.Build;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.cast.o4;
import j9.a0;
import j9.d0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import s9.f;
import t7.m;
public abstract class b {
    public static MediaCodec.CryptoInfo.Pattern a() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static void b() {
        if (Build.VERSION.SDK_INT > 23 && ForkJoinPool.commonPool() == null) {
            return;
        }
        throw null;
    }

    public static void c(k4 k4Var) {
        boolean isTerminated;
        ExecutorService executorService = k4Var.f4691a;
        if ((Build.VERSION.SDK_INT <= 23 || k4Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            k4Var.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        k4Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void d(o4 o4Var) {
        boolean isTerminated;
        ExecutorService executorService = o4Var.f4691a;
        if ((Build.VERSION.SDK_INT <= 23 || o4Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            o4Var.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        o4Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void e(a0 a0Var) {
        boolean isTerminated;
        ExecutorService executorService = a0Var.f9732a;
        if ((Build.VERSION.SDK_INT <= 23 || a0Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            a0Var.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        a0Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void f(d0 d0Var) {
        boolean isTerminated;
        ExecutorService executorService = d0Var.f9732a;
        if ((Build.VERSION.SDK_INT <= 23 || d0Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            d0Var.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        d0Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void g(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        executorService.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void h(f fVar) {
        if ((Build.VERSION.SDK_INT > 23 && fVar == ForkJoinPool.commonPool()) || fVar.f48122a.isTerminated()) {
            return;
        }
        fVar.shutdown();
        throw null;
    }

    public static void i(m mVar) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || mVar != ForkJoinPool.commonPool()) && !(isTerminated = mVar.isTerminated())) {
            mVar.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = mVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        mVar.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void j(ze.a aVar) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || aVar != ForkJoinPool.commonPool()) && !(isTerminated = aVar.isTerminated())) {
            aVar.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = aVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        aVar.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
