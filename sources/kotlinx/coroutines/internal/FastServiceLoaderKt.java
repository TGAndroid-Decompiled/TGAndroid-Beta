package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;

public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED;

    static {
        Object m150constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m150constructorimpl = Result.m150constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m150constructorimpl = Result.m150constructorimpl(ResultKt.createFailure(th));
        }
        ANDROID_DETECTED = Result.m153isSuccessimpl(m150constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
