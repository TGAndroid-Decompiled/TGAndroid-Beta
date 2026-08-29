package b9;

import android.media.MediaCodec;
import android.os.Build;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.q4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
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

    public static void c(h hVar) {
        if ((Build.VERSION.SDK_INT > 23 && hVar == ForkJoinPool.commonPool()) || hVar.f2012a.isTerminated()) {
            return;
        }
        hVar.shutdown();
        throw null;
    }

    public static void d(m4 m4Var) {
        boolean isTerminated;
        ExecutorService executorService = m4Var.f4198a;
        if ((Build.VERSION.SDK_INT <= 23 || m4Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            m4Var.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        m4Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void e(q4 q4Var) {
        boolean isTerminated;
        ExecutorService executorService = q4Var.f4198a;
        if ((Build.VERSION.SDK_INT <= 23 || q4Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            q4Var.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        q4Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void f(f7.m mVar) {
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

    public static void h(pe.a aVar) {
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
