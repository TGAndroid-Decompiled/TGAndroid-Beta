package ha;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
public abstract class r {
    public static ArrayList a(Context context) {
        ActivityManager activityManager;
        kotlin.jvm.internal.i.e(context, "context");
        int i9 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = pc.o.f45540a;
        }
        ArrayList f10 = pc.g.f(list);
        ArrayList arrayList = new ArrayList();
        int size = f10.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = f10.get(i11);
            i11++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i9) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(pc.i.d(arrayList));
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.i.d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new q(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.i.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static q b(Context context) {
        Object obj;
        kotlin.jvm.internal.i.e(context, "context");
        int myPid = Process.myPid();
        ArrayList a2 = a(context);
        int size = a2.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                obj = a2.get(i9);
                i9++;
                if (((q) obj).f10362b == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        q qVar = (q) obj;
        if (qVar == null) {
            return new q(c(), myPid, 0, false);
        }
        return qVar;
    }

    public static String c() {
        String processName;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            String myProcessName = Process.myProcessName();
            kotlin.jvm.internal.i.d(myProcessName, "myProcessName()");
            return myProcessName;
        } else if (i9 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        } else {
            String a2 = e6.d.a();
            if (a2 != null) {
                return a2;
            }
            return "";
        }
    }
}
