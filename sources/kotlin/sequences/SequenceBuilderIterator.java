package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Intrinsics;

public final class SequenceBuilderIterator implements Iterator, Continuation {
    public Continuation nextStep;
    public Object nextValue;
    public int state;

    public final RuntimeException exceptionalState() {
        int i = this.state;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.state);
    }

    @Override
    public final CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.state;
            if (i != 0) {
                break;
            }
            this.state = 5;
            Continuation continuation = this.nextStep;
            Intrinsics.checkNotNull(continuation);
            this.nextStep = null;
            continuation.resumeWith(Unit.INSTANCE);
        }
        if (i == 1) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw exceptionalState();
    }

    @Override
    public final Object next() {
        int i = this.state;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.state = 1;
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (i != 3) {
            throw exceptionalState();
        }
        this.state = 0;
        Object obj = this.nextValue;
        this.nextValue = null;
        return obj;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void resumeWith(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.state = 4;
    }

    public final void yield(Object obj, RestrictedSuspendLambda restrictedSuspendLambda) {
        this.nextValue = obj;
        this.state = 3;
        this.nextStep = restrictedSuspendLambda;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
