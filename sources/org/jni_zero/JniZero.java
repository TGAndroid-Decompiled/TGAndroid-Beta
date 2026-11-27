package org.jni_zero;

import java.util.Collections;
import org.jni_zero.JniPtrImplBase;
@JNINamespace("jni_zero")
public class JniZero {
    static final boolean $assertionsDisabled = false;
    private static boolean sInitialized;
    private static ClassLoader sPendingJniClassLoader;

    public interface Natives {
        void setJniClassLoader(ClassLoader classLoader);
    }

    public interface SafePointersTracker {
        void destroy();
    }

    public interface SafePointersTrackerFactory {
        SafePointersTracker create(Object obj, String str);
    }

    private static void crashIfMultiplexingMisaligned(long j, long j2) {
        try {
            long j3 = Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j4 = Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j3 != j && j3 != j2 && j4 != j) {
                throw new RuntimeException("JNI Zero multiplexing hashes do not align. Native: " + j + " or " + j2 + " Java: " + j3 + " or " + j4);
            }
        } catch (ReflectiveOperationException unused) {
        }
    }

    private static long getNativePtr(JniPtrImplBase<?> jniPtrImplBase) {
        return JniZeroInternal.getNativePtr(jniPtrImplBase);
    }

    private static Object[] init(boolean z) {
        JniPtrImplBase.RawPtrReleaser rawPtrReleaser;
        sInitialized = true;
        if (z) {
            rawPtrReleaser = new Object();
        } else {
            rawPtrReleaser = null;
        }
        JniPtrImplBase.sRawPtrReleaser = rawPtrReleaser;
        ClassLoader classLoader = sPendingJniClassLoader;
        if (classLoader != null) {
            sPendingJniClassLoader = null;
        } else {
            classLoader = JniZero.class.getClassLoader();
        }
        return new Object[]{Collections.EMPTY_LIST, Collections.EMPTY_MAP, classLoader};
    }

    public static void lambda$init$1(long j) {
        CommonApisJni.get().releaseRawPtr(j);
    }

    public static JniPtrImplBase.Tracker lambda$setSafePointersTrackerFactory$0(SafePointersTrackerFactory safePointersTrackerFactory, Object obj, String str) {
        SafePointersTracker create = safePointersTrackerFactory.create(obj, str);
        if (create == null) {
            return null;
        }
        return new a(create);
    }

    public static void setJniClassLoader(ClassLoader classLoader) {
        if (sInitialized) {
            JniZeroJni.get().setJniClassLoader(classLoader);
        } else {
            sPendingJniClassLoader = classLoader;
        }
    }

    public static void setSafePointersTrackerFactory(SafePointersTrackerFactory safePointersTrackerFactory) {
        a aVar;
        if (safePointersTrackerFactory == null) {
            aVar = null;
        } else {
            aVar = new a(safePointersTrackerFactory);
        }
        JniPtrImplBase.sTrackerFactory = aVar;
    }
}
