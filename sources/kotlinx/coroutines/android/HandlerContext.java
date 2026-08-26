package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import androidx.datastore.core.SimpleActor$1;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.mlkit.common.sdkinternal.zzb;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonDisposableHandle;
import kotlinx.coroutines.TimeoutCoroutine;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

public final class HandlerContext extends CoroutineDispatcher implements Delay {
    public final Handler handler;
    public final HandlerContext immediate;
    public final boolean invokeImmediately;

    public HandlerContext(Handler handler, boolean z) {
        this.handler = handler;
        this.invokeImmediately = z;
        this.immediate = z ? this : new HandlerContext(handler, true);
    }

    public final void cancelOnRejection(CoroutineContext coroutineContext, Runnable runnable) {
        JobKt.cancel(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Dispatchers.IO.dispatch(coroutineContext, runnable);
    }

    @Override
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.handler.post(runnable)) {
            return;
        }
        cancelOnRejection(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) obj;
        return handlerContext.handler == this.handler && handlerContext.invokeImmediately == this.invokeImmediately;
    }

    public final int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override
    public final DisposableHandle invokeOnTimeout(long j, final TimeoutCoroutine timeoutCoroutine, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.handler.postDelayed(timeoutCoroutine, j)) {
            return new DisposableHandle() {
                @Override
                public final void dispose() {
                    this.f$0.handler.removeCallbacks(timeoutCoroutine);
                }
            };
        }
        cancelOnRejection(coroutineContext, timeoutCoroutine);
        return NonDisposableHandle.INSTANCE;
    }

    @Override
    public final boolean isDispatchNeeded() {
        return (this.invokeImmediately && Intrinsics.areEqual(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override
    public final void scheduleResumeAfterDelay(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        zzb zzbVar = new zzb(cancellableContinuationImpl, this, false, 7);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.handler.postDelayed(zzbVar, j)) {
            cancellableContinuationImpl.invokeOnCancellation(new SimpleActor$1(1, this, zzbVar));
        } else {
            cancelOnRejection(cancellableContinuationImpl.context, zzbVar);
        }
    }

    @Override
    public final String toString() {
        HandlerContext handlerContext;
        String str;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        HandlerContext handlerContext2 = MainDispatcherLoader.dispatcher;
        if (this == handlerContext2) {
            str = "Dispatchers.Main";
        } else {
            try {
                handlerContext = handlerContext2.immediate;
            } catch (UnsupportedOperationException unused) {
                handlerContext = null;
            }
            str = this == handlerContext ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.handler.toString();
        return this.invokeImmediately ? Fragment$$ExternalSyntheticOutline0.m$1(string, ".immediate") : string;
    }
}
