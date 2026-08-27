package org.telegram.messenger;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class NativeLoader {
    private static final String LIB_NAME = "tmessages.49";
    private static final String LIB_SO_NAME = "libtmessages.49.so";
    private static final int LIB_VERSION = 49;
    private static final String LOCALE_LIB_SO_NAME = "libtmessages.49loc.so";
    public static StringBuilder log = new StringBuilder();
    private static volatile boolean nativeLoaded = false;

    public static String getAbiFolder() {
        String str = "mips";
        String str2 = "armeabi";
        try {
            String str3 = Build.CPU_ABI;
            if (str3.equalsIgnoreCase("x86_64")) {
                str = "x86_64";
            } else if (str3.equalsIgnoreCase("arm64-v8a")) {
                str = "arm64-v8a";
            } else if (str3.equalsIgnoreCase("armeabi-v7a")) {
                str = "armeabi-v7a";
            } else if (str3.equalsIgnoreCase("armeabi")) {
                str = "armeabi";
            } else if (str3.equalsIgnoreCase("x86")) {
                str = "x86";
            } else if (!str3.equalsIgnoreCase("mips")) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("Unsupported arch: " + str3);
                }
                str = "armeabi";
            }
            str2 = str;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        String property = System.getProperty("os.arch");
        return (property == null || !property.contains("686")) ? str2 : "x86";
    }

    private static File getNativeLibraryDir(Context context) {
        File file;
        if (context != null) {
            try {
                file = new File((String) ApplicationInfo.class.getField("nativeLibraryDir").get(context.getApplicationInfo()));
            } catch (Throwable th) {
                th.printStackTrace();
                file = null;
            }
        } else {
            file = null;
        }
        if (file == null) {
            file = new File(context.getApplicationInfo().dataDir, "lib");
        }
        if (file.isDirectory()) {
            return file;
        }
        return null;
    }

    public static synchronized void initNativeLibs(Context context) {
        try {
            if (nativeLoaded) {
                return;
            }
            try {
                try {
                    System.loadLibrary("tmessages.49");
                    nativeLoaded = true;
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("loaded normal lib");
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    StringBuilder sb2 = log;
                    sb2.append("176: ");
                    sb2.append(th);
                    sb2.append("\n");
                    try {
                        System.loadLibrary("tmessages.49");
                        nativeLoaded = true;
                    } catch (Error e9) {
                        FileLog.e(e9);
                        StringBuilder sb3 = log;
                        sb3.append("184: ");
                        sb3.append(e9);
                        sb3.append("\n");
                    }
                }
            } catch (Error e10) {
                FileLog.e(e10);
                StringBuilder sb4 = log;
                sb4.append("128: ");
                sb4.append(e10);
                sb4.append("\n");
                String abiFolder = getAbiFolder();
                File file = new File(context.getFilesDir(), "lib");
                file.mkdirs();
                File file2 = new File(file, "libtmessages.49loc.so");
                if (file2.exists()) {
                    try {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("Load local lib");
                        }
                        System.load(file2.getAbsolutePath());
                        nativeLoaded = true;
                        return;
                    } catch (Error e11) {
                        StringBuilder sb5 = log;
                        sb5.append(e11);
                        sb5.append("\n");
                        FileLog.e(e11);
                        file2.delete();
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("Library not found, arch = " + abiFolder);
                            StringBuilder sb6 = log;
                            sb6.append("Library not found, arch = " + abiFolder);
                            sb6.append("\n");
                        }
                        if (loadFromZip(context, file, file2, abiFolder)) {
                            return;
                        }
                        System.loadLibrary("tmessages.49");
                        nativeLoaded = true;
                    }
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("Library not found, arch = " + abiFolder);
                    StringBuilder sb7 = log;
                    sb7.append("Library not found, arch = " + abiFolder);
                    sb7.append("\n");
                }
                if (loadFromZip(context, file, file2, abiFolder)) {
                    return;
                }
                System.loadLibrary("tmessages.49");
                nativeLoaded = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static boolean loadFromZip(Context context, File file, File file2, String str) throws Throwable {
        ?? r10;
        ZipFile zipFile;
        int length;
        try {
            File[] fileArrListFiles = file.listFiles();
            length = fileArrListFiles.length;
            for (File file3 : fileArrListFiles) {
                file3.delete();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        InputStream inputStream = null;
        try {
            try {
                zipFile = new ZipFile(context.getApplicationInfo().sourceDir);
                try {
                    ZipEntry entry = zipFile.getEntry("lib/" + str + "/libtmessages.49.so");
                    if (entry == null) {
                        throw new Exception("Unable to find file in apk:lib/" + str + "/tmessages.49");
                    }
                    InputStream inputStream2 = zipFile.getInputStream(entry);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = inputStream2.read(bArr);
                        if (i10 <= 0) {
                            break;
                        }
                        Thread.yield();
                        fileOutputStream.write(bArr, 0, i10);
                    }
                    fileOutputStream.close();
                    file2.setReadable(true, false);
                    file2.setExecutable(true, false);
                    file2.setWritable(true);
                    try {
                        System.load(file2.getAbsolutePath());
                        nativeLoaded = true;
                    } catch (Error e10) {
                        FileLog.e(e10);
                    }
                    try {
                        inputStream2.close();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    try {
                        zipFile.close();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    return true;
                } catch (Exception e13) {
                    e = e13;
                    FileLog.e(e);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e14) {
                            FileLog.e(e14);
                        }
                    }
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (Exception e15) {
                            FileLog.e(e15);
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                r10 = length;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Exception e16) {
                        FileLog.e(e16);
                    }
                }
                if (r10 != 0) {
                    throw th;
                }
                try {
                    r10.close();
                    throw th;
                } catch (Exception e17) {
                    FileLog.e(e17);
                    throw th;
                }
            }
        } catch (Exception e18) {
            e = e18;
            zipFile = null;
        } catch (Throwable th2) {
            th = th2;
            r10 = 0;
            if (0 != 0) {
                inputStream.close();
            }
            if (r10 != 0) {
                throw th;
            }
            r10.close();
            throw th;
        }
    }

    public static boolean loaded() {
        return nativeLoaded;
    }
}
