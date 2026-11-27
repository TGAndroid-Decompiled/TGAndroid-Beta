package defpackage;

import dalvik.system.DelegateLastClassLoader;
public abstract class rs3 {
    public static DelegateLastClassLoader a(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    public static void b() {
    }
}
