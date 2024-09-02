package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

public final class CoroutineExceptionHandlerImplKt {
    private static final List<CoroutineExceptionHandler> handlers;

    static {
        Sequence asSequence;
        List<CoroutineExceptionHandler> list;
        asSequence = SequencesKt__SequencesKt.asSequence(CoroutineExceptionHandlerImplKt$$ExternalSyntheticServiceLoad0.m());
        list = SequencesKt___SequencesKt.toList(asSequence);
        handlers = list;
    }

    public static final void handleCoroutineExceptionImpl(CoroutineContext coroutineContext, Throwable th) {
        Iterator<CoroutineExceptionHandler> it = handlers.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, CoroutineExceptionHandlerKt.handlerException(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            Result.Companion companion = Result.Companion;
            ExceptionsKt__ExceptionsKt.addSuppressed(th, new DiagnosticCoroutineContextException(coroutineContext));
            Result.m150constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.Companion;
            Result.m150constructorimpl(ResultKt.createFailure(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
