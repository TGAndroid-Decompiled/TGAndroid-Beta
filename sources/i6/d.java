package i6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import b6.m;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public abstract class d {
    public static String f7349a;
    public static int f7350b;
    public static Boolean f7351c;

    public static String a() {
        BufferedReader bufferedReader;
        if (f7349a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f7349a = Application.getProcessName();
            } else {
                int i10 = f7350b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f7350b = i10;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        String str2 = "/proc/" + i10 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        bufferedReader = new BufferedReader(new FileReader(str2));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        try {
                            String readLine = bufferedReader.readLine();
                            m.h(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            b.a(bufferedReader2);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    b.a(bufferedReader);
                }
                f7349a = str;
            }
        }
        return f7349a;
    }

    public static boolean b() {
        Boolean bool = f7351c;
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
                        throw new RuntimeException(a.a.a(objArr));
                    }
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f7351c = bool;
        }
        return bool.booleanValue();
    }
}
