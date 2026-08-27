package j6;

import android.os.Looper;
import android.util.Log;

public abstract class g {

    public static ClassLoader f12738a;

    public static Thread f12739b;

    public static synchronized ClassLoader a() {
        SecurityException e9;
        Thread thread;
        ThreadGroup threadGroup;
        if (f12738a == null) {
            Thread thread2 = f12739b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f12739b.getContextClassLoader();
                    } catch (SecurityException e10) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e10.getMessage());
                    }
                }
                f12738a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i11];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i10 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i10];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (thread == null) {
                                    try {
                                        f fVar = new f(threadGroup, "GmsDynamite");
                                        try {
                                            fVar.setContextClassLoader(null);
                                            fVar.start();
                                            thread = fVar;
                                        } catch (SecurityException e11) {
                                            e9 = e11;
                                            thread = fVar;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e9.getMessage());
                                        }
                                    } catch (SecurityException e12) {
                                        e9 = e12;
                                    }
                                }
                            } catch (SecurityException e13) {
                                e9 = e13;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f12739b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f12739b.getContextClassLoader();
                    }
                }
                f12738a = contextClassLoader;
            }
        }
        return f12738a;
    }
}
