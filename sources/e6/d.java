package e6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import g7.b8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import x5.l;
public abstract class d {
    public static String f4962a;
    public static int f4963b;
    public static Boolean f4964c;

    public static String a() {
        BufferedReader bufferedReader;
        if (f4962a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f4962a = Application.getProcessName();
            } else {
                int i9 = f4963b;
                if (i9 == 0) {
                    i9 = Process.myPid();
                    f4963b = i9;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i9 > 0) {
                    try {
                        String str2 = "/proc/" + i9 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        bufferedReader = new BufferedReader(new FileReader(str2));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        try {
                            String readLine = bufferedReader.readLine();
                            l.h(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            b.a(bufferedReader2);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    b.a(bufferedReader);
                }
                f4962a = str;
            }
        }
        return f4962a;
    }

    public static boolean b() {
        Boolean bool = f4964c;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (invoke != null) {
                        bool = (Boolean) invoke;
                    } else {
                        throw new RuntimeException(b8.a(objArr));
                    }
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f4964c = bool;
        }
        return bool.booleanValue();
    }
}
