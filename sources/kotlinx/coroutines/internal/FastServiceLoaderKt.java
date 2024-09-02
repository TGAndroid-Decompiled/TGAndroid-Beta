package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;

public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED;

    static {
        Object m158constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m158constructorimpl = Result.m158constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m158constructorimpl = Result.m158constructorimpl(ResultKt.createFailure(th));
        }
        ANDROID_DETECTED = Result.m161isSuccessimpl(m158constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
