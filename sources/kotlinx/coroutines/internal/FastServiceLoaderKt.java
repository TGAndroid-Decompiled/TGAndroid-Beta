package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;

public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED;

    static {
        Object m156constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m156constructorimpl = Result.m156constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m156constructorimpl = Result.m156constructorimpl(ResultKt.createFailure(th));
        }
        ANDROID_DETECTED = Result.m159isSuccessimpl(m156constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
