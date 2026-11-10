package gb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
public abstract class g0 {
    public static ArrayList a(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> list;
        kotlin.jvm.internal.j.e(context, "context");
        int i7 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = hd.n.f14476a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i7) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(hd.h.d(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            String processName = runningAppProcessInfo.processName;
            kotlin.jvm.internal.j.d(processName, "processName");
            arrayList3.add(new f0(runningAppProcessInfo.pid, runningAppProcessInfo.importance, processName, kotlin.jvm.internal.j.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList3;
    }

    public static f0 b(Context context) {
        Object obj;
        String a10;
        kotlin.jvm.internal.j.e(context, "context");
        int myPid = Process.myPid();
        ArrayList a11 = a(context);
        int size = a11.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                obj = a11.get(i7);
                i7++;
                if (((f0) obj).f13676b == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        f0 f0Var = (f0) obj;
        if (f0Var == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 > 33) {
                a10 = Process.myProcessName();
                kotlin.jvm.internal.j.d(a10, "myProcessName(...)");
            } else if ((i10 < 28 || (a10 = Application.getProcessName()) == null) && (a10 = x6.d.a()) == null) {
                a10 = "";
            }
            return new f0(myPid, 0, a10, false);
        }
        return f0Var;
    }
}
