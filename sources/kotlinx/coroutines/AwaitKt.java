package kotlinx.coroutines;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public abstract class AwaitKt {

    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitKt.joinAll((Job[]) null, this);
        }
    }

    static final class AnonymousClass3 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;

        AnonymousClass3(Continuation continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitKt.joinAll((Collection) null, this);
        }
    }

    public static final Object awaitAll(Deferred[] deferredArr, Continuation continuation) {
        return deferredArr.length == 0 ? CollectionsKt.emptyList() : new AwaitAll(deferredArr).await(continuation);
    }

    public static final java.lang.Object joinAll(kotlinx.coroutines.Job[] r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AwaitKt.joinAll(kotlinx.coroutines.Job[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object joinAll(java.util.Collection r4, kotlin.coroutines.Continuation r5) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AwaitKt.joinAll(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
