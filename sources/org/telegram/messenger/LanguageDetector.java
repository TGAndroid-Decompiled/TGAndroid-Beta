package org.telegram.messenger;

import android.content.Context;
import com.google.android.gms.tasks.TaskExecutors;
public class LanguageDetector {

    public interface ExceptionCallback {
        void run(Exception exc);
    }

    public interface StringCallback {
        void run(String str);
    }

    public static void detectLanguage(String str, StringCallback stringCallback, ExceptionCallback exceptionCallback) {
        detectLanguage(str, stringCallback, exceptionCallback, false);
    }

    public static boolean hasSupport() {
        return true;
    }

    public static void lambda$detectLanguage$0(StringCallback stringCallback, String str) {
        if (stringCallback != null) {
            stringCallback.run(str);
        }
    }

    public static void lambda$detectLanguage$1(ExceptionCallback exceptionCallback, Exception exc) {
        if (exceptionCallback != null) {
            exceptionCallback.run(exc);
        }
    }

    public static void detectLanguage(String str, StringCallback stringCallback, ExceptionCallback exceptionCallback, boolean z4) {
        if (z4) {
            try {
                Context context = ApplicationLoader.applicationContext;
                synchronized (cb.h.f2410b) {
                    cb.h.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e6) {
                if (!z4) {
                    detectLanguage(str, stringCallback, exceptionCallback, true);
                    return;
                }
                if (exceptionCallback != null) {
                    exceptionCallback.run(e6);
                }
                FileLog.e((Throwable) e6, false);
                return;
            } catch (Exception e10) {
                if (exceptionCallback != null) {
                    exceptionCallback.run(e10);
                }
                FileLog.e(e10);
                return;
            } catch (Throwable th2) {
                if (exceptionCallback != null) {
                    exceptionCallback.run(null);
                }
                FileLog.e(th2, false);
                return;
            }
        }
        j7.i7.a().g(str).addOnSuccessListener(new d0(stringCallback, 5)).addOnFailureListener(new d0(exceptionCallback, 6));
    }
}
