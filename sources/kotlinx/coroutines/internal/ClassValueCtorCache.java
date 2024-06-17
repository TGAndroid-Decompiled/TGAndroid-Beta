package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function1;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
final class ClassValueCtorCache extends CtorCache {
    public static final ClassValueCtorCache INSTANCE = new ClassValueCtorCache();
    private static final ClassValueCtorCache$cache$1 cache = new ClassValue<Function1<? super Throwable, ? extends Throwable>>() {
    };

    private ClassValueCtorCache() {
    }

    @Override
    public Function1<Throwable, Throwable> get(Class<? extends Throwable> cls) {
        return (Function1) cache.get(cls);
    }
}
