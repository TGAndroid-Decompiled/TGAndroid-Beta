package org.telegram.messenger;

import android.os.Build;

public class NativeLoader {
    private static final String LIB_NAME = "tmessages.49";
    private static final String LIB_SO_NAME = "libtmessages.49.so";
    private static final int LIB_VERSION = 49;
    private static final String LOCALE_LIB_SO_NAME = "libtmessages.49loc.so";
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
        String str;
        String str2 = "mips";
        String str3 = "armeabi";
        try {
            str = Build.CPU_ABI;
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (str.equalsIgnoreCase("x86_64")) {
            str2 = "x86_64";
        } else if (str.equalsIgnoreCase("arm64-v8a")) {
            str2 = "arm64-v8a";
        } else if (str.equalsIgnoreCase("armeabi-v7a")) {
            str2 = "armeabi-v7a";
        } else if (str.equalsIgnoreCase("armeabi")) {
            str2 = "armeabi";
        } else if (str.equalsIgnoreCase("x86")) {
            str2 = "x86";
        } else if (!str.equalsIgnoreCase("mips")) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Unsupported arch: " + str);
            }
            String property = System.getProperty("os.arch");
            return (property == null && property.contains("686")) ? "x86" : str3;
        }
        str3 = str2;
        String property2 = System.getProperty("os.arch");
        if (property2 == null) {
        }
    }

    public static boolean loaded() {
        return nativeLoaded;
    }
}
