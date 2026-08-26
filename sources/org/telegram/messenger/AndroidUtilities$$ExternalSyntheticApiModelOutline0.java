package org.telegram.messenger;

import android.os.Build;
import com.google.android.gms.internal.mlkit_common.zzav;
import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.telegram.DispatchQueuePriority;

public abstract class AndroidUtilities$$ExternalSyntheticApiModelOutline0 {
    public static void m(zzav zzavVar) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || zzavVar != ForkJoinPool.commonPool()) && !(zIsTerminated = zzavVar.isTerminated())) {
            zzavVar.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = zzavVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        zzavVar.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void m(DispatchQueuePriority.AnonymousClass1 anonymousClass1) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || anonymousClass1 != ForkJoinPool.commonPool()) && !(zIsTerminated = anonymousClass1.isTerminated())) {
            anonymousClass1.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = anonymousClass1.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        anonymousClass1.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void m(DelegatingScheduledExecutorService delegatingScheduledExecutorService) {
        if ((Build.VERSION.SDK_INT <= 23 || delegatingScheduledExecutorService != ForkJoinPool.commonPool()) && !delegatingScheduledExecutorService.delegate.isTerminated()) {
            delegatingScheduledExecutorService.shutdown();
            throw null;
        }
    }
}
