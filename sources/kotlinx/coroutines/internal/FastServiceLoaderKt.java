package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED;

    static {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m147constructorimpl = Result.m147constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
        }
        ANDROID_DETECTED = Result.m150isSuccessimpl(m147constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
