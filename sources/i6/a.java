package i6;

import dalvik.system.DelegateLastClassLoader;
public abstract class a {
    public static DelegateLastClassLoader a(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    public static void b() {
    }
}
