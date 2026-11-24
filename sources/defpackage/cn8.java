package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
public final class cn8 {
    public static final cn8 a = new Object();

    public static ArrayList a(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> list;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = n34.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(mm2.c(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            ?? obj4 = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                obj4.e = str2;
                obj4.a = runningAppProcessInfo.pid;
                obj4.b = runningAppProcessInfo.importance;
                obj4.d = (byte) (((byte) (obj4.d | 1)) | 2);
                obj4.c = rr5.a(str2, str);
                obj4.d = (byte) (obj4.d | 4);
                arrayList3.add(obj4.a());
            } else {
                gxc.d("Null processName");
                return null;
            }
        }
        return arrayList3;
    }

    public final h03 b(Context context) {
        Object obj;
        String str;
        context.getClass();
        int myPid = Process.myPid();
        ArrayList a2 = a(context);
        int size = a2.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = a2.get(i);
                i++;
                if (((ba0) ((h03) obj)).b == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        h03 h03Var = (h03) obj;
        if (h03Var == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 33) {
                str = Process.myProcessName();
                str.getClass();
            } else if (i2 < 28 || (str = Application.getProcessName()) == null) {
                str = "";
            }
            ?? obj2 = new Object();
            obj2.e = str;
            obj2.a = myPid;
            obj2.b = 0;
            obj2.c = false;
            obj2.d = (byte) (((byte) (((byte) (obj2.d | 1)) | 2)) | 4);
            return obj2.a();
        }
        return h03Var;
    }
}
