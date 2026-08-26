package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

public abstract class CoroutineExceptionHandlerImplKt {
    public static final Collection platformExceptionHandlers;

    static {
        try {
            Iterator it = Arrays.asList(new AndroidExceptionPreHandler()).iterator();
            Intrinsics.checkNotNullParameter(it, "<this>");
            platformExceptionHandlers = SequencesKt.toList(new ConstrainedOnceSequence(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(it, 2)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
