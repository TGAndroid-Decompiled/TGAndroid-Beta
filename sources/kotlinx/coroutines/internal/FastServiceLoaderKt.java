package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED;

    static {
        Object m151constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m151constructorimpl = Result.m151constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m151constructorimpl = Result.m151constructorimpl(ResultKt.createFailure(th));
        }
        ANDROID_DETECTED = Result.m154isSuccessimpl(m151constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
