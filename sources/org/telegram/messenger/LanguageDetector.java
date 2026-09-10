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

    public static void detectLanguage(String str, StringCallback stringCallback, ExceptionCallback exceptionCallback, boolean z10) {
        if (z10) {
            try {
                Context context = ApplicationLoader.applicationContext;
                synchronized (qb.g.f40616b) {
                    qb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e) {
                if (!z10) {
                    detectLanguage(str, stringCallback, exceptionCallback, true);
                    return;
                }
                if (exceptionCallback != null) {
                    exceptionCallback.run(e);
                }
                FileLog.e((Throwable) e, false);
                return;
            } catch (Exception e7) {
                if (exceptionCallback != null) {
                    exceptionCallback.run(e7);
                }
                FileLog.e(e7);
                return;
            } catch (Throwable th2) {
                if (exceptionCallback != null) {
                    exceptionCallback.run(null);
                }
                FileLog.e(th2, false);
                return;
            }
        }
        w7.g7.a().g(str).addOnSuccessListener(new c0(stringCallback, 5)).addOnFailureListener(new c0(exceptionCallback, 6));
    }
}
