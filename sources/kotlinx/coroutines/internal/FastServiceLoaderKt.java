package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED;

    static {
        Object m159constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m159constructorimpl = Result.m159constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m159constructorimpl = Result.m159constructorimpl(ResultKt.createFailure(th));
        }
        ANDROID_DETECTED = Result.m162isSuccessimpl(m159constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
