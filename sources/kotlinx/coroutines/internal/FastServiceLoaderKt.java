package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED;

    static {
        Object m148constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m148constructorimpl = Result.m148constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m148constructorimpl = Result.m148constructorimpl(ResultKt.createFailure(th));
        }
        ANDROID_DETECTED = Result.m151isSuccessimpl(m148constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
