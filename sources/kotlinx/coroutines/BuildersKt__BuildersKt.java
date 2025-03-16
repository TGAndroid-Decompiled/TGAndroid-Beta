package kotlinx.coroutines;

import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;

public abstract class BuildersKt__BuildersKt {
    public static final Object runBlocking(CoroutineContext coroutineContext, Function2 function2) {
        EventLoop currentOrNull$kotlinx_coroutines_core;
        GlobalScope globalScope;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key);
        if (continuationInterceptor == null) {
            currentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
            globalScope = GlobalScope.INSTANCE;
            coroutineContext = coroutineContext.plus(currentOrNull$kotlinx_coroutines_core);
        } else {
            EventLoop eventLoop = continuationInterceptor instanceof EventLoop ? (EventLoop) continuationInterceptor : null;
            if (eventLoop != null) {
                EventLoop eventLoop2 = eventLoop.shouldBeProcessedFromContext() ? eventLoop : null;
                if (eventLoop2 != null) {
                    currentOrNull$kotlinx_coroutines_core = eventLoop2;
                    globalScope = GlobalScope.INSTANCE;
                }
            }
            currentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
            globalScope = GlobalScope.INSTANCE;
        }
        BlockingCoroutine blockingCoroutine = new BlockingCoroutine(CoroutineContextKt.newCoroutineContext(globalScope, coroutineContext), currentThread, currentOrNull$kotlinx_coroutines_core);
        blockingCoroutine.start(CoroutineStart.DEFAULT, blockingCoroutine, function2);
        return blockingCoroutine.joinBlocking();
    }

    public static Object runBlocking$default(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return BuildersKt.runBlocking(coroutineContext, function2);
    }
}
