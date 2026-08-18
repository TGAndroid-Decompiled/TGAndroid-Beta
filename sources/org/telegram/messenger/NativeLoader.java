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

    private static boolean loadFromZip(Context context, File file, File file2, String str) throws Throwable {
        InputStream inputStream;
        ZipFile zipFile;
        try {
            for (File file3 : file.listFiles()) {
                file3.delete();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        ZipFile zipFile2 = null;
        inputStream = null;
        inputStream = null;
        InputStream inputStream2 = null;
        try {
            zipFile = new ZipFile(context.getApplicationInfo().sourceDir);
            try {
                ZipEntry entry = zipFile.getEntry("lib/" + str + "/libtmessages.49.so");
                if (entry == null) {
                    throw new Exception("Unable to find file in apk:lib/" + str + "/tmessages.49");
                }
                inputStream2 = zipFile.getInputStream(entry);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream2.read(bArr);
                    if (i <= 0) {
                        break;
                    }
                    Thread.yield();
                    fileOutputStream.write(bArr, 0, i);
                }
                fileOutputStream.close();
                file2.setReadable(true, false);
                file2.setExecutable(true, false);
                file2.setWritable(true);
                try {
                    System.load(file2.getAbsolutePath());
                    nativeLoaded = true;
                } catch (Error e2) {
                    FileLog.e(e2);
                }
                try {
                    inputStream2.close();
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                try {
                    zipFile.close();
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                return true;
            } catch (Exception e5) {
                e = e5;
                try {
                    FileLog.e(e);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    zipFile2 = zipFile;
                    zipFile = zipFile2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception e8) {
                            FileLog.e(e8);
                        }
                    }
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                            throw th;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (zipFile != null) {
                    zipFile.close();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            zipFile = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            zipFile = zipFile2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            if (zipFile != null) {
                zipFile.close();
                throw th;
            }
            throw th;
        }
    }

    public static synchronized void initNativeLibs(Context context) {
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
            } catch (Error e) {
                FileLog.e(e);
                StringBuilder sb = log;
                sb.append("128: ");
                sb.append(e);
                sb.append("\n");
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
                    } catch (Error e2) {
                        StringBuilder sb2 = log;
                        sb2.append(e2);
                        sb2.append("\n");
                        FileLog.e(e2);
                        file2.delete();
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("Library not found, arch = " + abiFolder);
                            StringBuilder sb3 = log;
                            sb3.append("Library not found, arch = " + abiFolder);
                            sb3.append("\n");
                        }
                        if (loadFromZip(context, file, file2, abiFolder)) {
                            return;
                        }
                        try {
                            System.loadLibrary("tmessages.49");
                            nativeLoaded = true;
                        } catch (Error e3) {
                            FileLog.e(e3);
                            StringBuilder sb4 = log;
                            sb4.append("184: ");
                            sb4.append(e3);
                            sb4.append("\n");
                        }
                    }
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("Library not found, arch = " + abiFolder);
                    StringBuilder sb5 = log;
                    sb5.append("Library not found, arch = " + abiFolder);
                    sb5.append("\n");
                }
                if (loadFromZip(context, file, file2, abiFolder)) {
                    return;
                }
                System.loadLibrary("tmessages.49");
                nativeLoaded = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            StringBuilder sb6 = log;
            sb6.append("176: ");
            sb6.append(th);
            sb6.append("\n");
            System.loadLibrary("tmessages.49");
            nativeLoaded = true;
        }
    }

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
            } else {
                if (!str3.equalsIgnoreCase("x86")) {
                    if (!str3.equalsIgnoreCase("mips")) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("Unsupported arch: " + str3);
                        }
                    }
                    String property = System.getProperty("os.arch");
                    return (property == null && property.contains("686")) ? "x86" : str2;
                }
                str = "x86";
            }
            str2 = str;
        } catch (Exception e) {
            FileLog.e(e);
        }
        String property2 = System.getProperty("os.arch");
        if (property2 == null) {
        }
    }

    public static boolean loaded() {
        return nativeLoaded;
    }
}
