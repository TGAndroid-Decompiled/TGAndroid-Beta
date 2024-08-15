package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED;

    static {
        Object m153constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m153constructorimpl = Result.m153constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m153constructorimpl = Result.m153constructorimpl(ResultKt.createFailure(th));
        }
        ANDROID_DETECTED = Result.m156isSuccessimpl(m153constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
