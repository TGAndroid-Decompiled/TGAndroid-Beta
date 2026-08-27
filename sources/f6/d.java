package f6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import h7.c8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import y5.l;

public abstract class d {

    public static String f5891a;

    public static int f5892b;

    public static Boolean f5893c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f5891a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f5891a = Application.getProcessName();
            } else {
                int iMyPid = f5892b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f5892b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                l.h(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                b.a(bufferedReader2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    b.a(bufferedReader);
                }
                f5891a = strTrim;
            }
        }
        return f5891a;
    }

    public static boolean b() {
        Boolean boolValueOf = f5893c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new a7.c(c8.a(objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f5893c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
