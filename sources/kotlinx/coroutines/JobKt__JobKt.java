package kotlinx.coroutines;

import androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

abstract class JobKt__JobKt {
    public static final void cancel(CoroutineContext coroutineContext, CancellationException cancellationException) {
        ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(coroutineContext.get(Job.Key));
    }
}
