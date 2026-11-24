package defpackage;

import android.app.ActivityManager;
import android.os.Build;
public abstract class wu7 {
    public static final boolean a;

    static {
        ClassLoader classLoader;
        char[] cArr = xu7.d;
        boolean z = true;
        if (!smd.a("robolectric", Build.FINGERPRINT) && (((classLoader = xu7.class.getClassLoader()) == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) && !ActivityManager.isRunningInTestHarness())) {
            z = false;
        }
        a = z;
    }
}
