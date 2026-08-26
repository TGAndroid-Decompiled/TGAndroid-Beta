package kotlin.random;

import com.google.android.gms.dynamite.zzd;
import kotlin.jvm.internal.Intrinsics;

public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {
    public final zzd implStorage = new zzd(2);

    @Override
    public final java.util.Random getImpl() {
        Object obj = this.implStorage.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (java.util.Random) obj;
    }
}
