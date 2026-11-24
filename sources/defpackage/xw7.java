package defpackage;

import android.app.ActivityManager;
import android.os.Build;
public abstract class xw7 {
    public static final boolean a;

    static {
        ClassLoader classLoader;
        char[] cArr = yw7.d;
        boolean z = true;
        if (!vod.a("robolectric", Build.FINGERPRINT) && (((classLoader = yw7.class.getClassLoader()) == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) && !ActivityManager.isRunningInTestHarness())) {
            z = false;
        }
        a = z;
    }
}
