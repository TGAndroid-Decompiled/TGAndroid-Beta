package org.telegram.messenger;

import android.os.Build;
public class NativeLoader {
    private static final String LIB_NAME = "tmessages.46";
    private static final String LIB_SO_NAME = "libtmessages.46.so";
    private static final int LIB_VERSION = 46;
    private static final String LOCALE_LIB_SO_NAME = "libtmessages.46loc.so";
    public static StringBuilder log = new StringBuilder();
    private static volatile boolean nativeLoaded = false;

    private static native void init(String str, boolean z);

    private static java.io.File getNativeLibraryDir(android.content.Context r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NativeLoader.getNativeLibraryDir(android.content.Context):java.io.File");
    }

    @android.annotation.SuppressLint({"UnsafeDynamicallyLoadedCode", "SetWorldReadable"})
    private static boolean loadFromZip(android.content.Context r5, java.io.File r6, java.io.File r7, java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NativeLoader.loadFromZip(android.content.Context, java.io.File, java.io.File, java.lang.String):boolean");
    }

    @android.annotation.SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public static synchronized void initNativeLibs(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NativeLoader.initNativeLibs(android.content.Context):void");
    }

    public static String getAbiFolder() {
        String str = "x86_64";
        String str2 = "armeabi";
        try {
            String str3 = Build.CPU_ABI;
            if (!str3.equalsIgnoreCase("x86_64")) {
                if (str3.equalsIgnoreCase("arm64-v8a")) {
                    str = "arm64-v8a";
                } else if (str3.equalsIgnoreCase("armeabi-v7a")) {
                    str = "armeabi-v7a";
                } else {
                    if (!str3.equalsIgnoreCase("armeabi")) {
                        if (str3.equalsIgnoreCase("x86")) {
                            str = "x86";
                        } else if (str3.equalsIgnoreCase("mips")) {
                            str = "mips";
                        } else if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("Unsupported arch: " + str3);
                        }
                    }
                    str = "armeabi";
                }
            }
            str2 = str;
        } catch (Exception e) {
            FileLog.e(e);
        }
        String property = System.getProperty("os.arch");
        return (property == null || !property.contains("686")) ? str2 : "x86";
    }

    public static boolean loaded() {
        return nativeLoaded;
    }
}
