package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
final class WeakMapCtorCache extends CtorCache {
    public static final WeakMapCtorCache INSTANCE = new WeakMapCtorCache();
    private static final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> exceptionCtors = new WeakHashMap<>();

    private WeakMapCtorCache() {
    }

    @Override
    public Function1<Throwable, Throwable> get(Class<? extends Throwable> cls) {
        Function1<Throwable, Throwable> createConstructor;
        ReentrantReadWriteLock reentrantReadWriteLock = cacheLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            Function1<Throwable, Throwable> function1 = exceptionCtors.get(cls);
            if (function1 == null) {
                readLock = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                int i2 = 0;
                while (i2 < readHoldCount) {
                    i2++;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> weakHashMap = exceptionCtors;
                    Function1<Throwable, Throwable> function12 = weakHashMap.get(cls);
                    if (function12 == null) {
                        createConstructor = ExceptionsConstructorKt.createConstructor(cls);
                        weakHashMap.put(cls, createConstructor);
                        return createConstructor;
                    }
                    while (i < readHoldCount) {
                        i++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                    return function12;
                } finally {
                    while (i < readHoldCount) {
                        i++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                }
            }
            return function1;
        } finally {
            readLock.unlock();
        }
    }
}
