package f9;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import k9.t0;
import k9.t1;
import kotlin.jvm.internal.j;
import sf.e;
import tc.g;
import tc.i;
import tc.o;
public final class c {
    public static final c f6226a = new Object();

    public static ArrayList a(Context context) {
        ActivityManager activityManager;
        j.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
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
            list = o.f48064a;
        }
        ArrayList f10 = g.f(list);
        ArrayList arrayList = new ArrayList();
        int size = f10.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = f10.get(i12);
            i12++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.d(arrayList));
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            e eVar = new e(6, false);
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                eVar.f47315b = str2;
                eVar.f47316c = Integer.valueOf(runningAppProcessInfo.pid);
                eVar.d = Integer.valueOf(runningAppProcessInfo.importance);
                eVar.f47317e = Boolean.valueOf(j.a(runningAppProcessInfo.processName, str));
                arrayList2.add(eVar.n());
            } else {
                throw new NullPointerException("Null processName");
            }
        }
        return arrayList2;
    }

    public final t1 b(Context context) {
        Object obj;
        String processName;
        j.e(context, "context");
        int myPid = Process.myPid();
        ArrayList a2 = a(context);
        int size = a2.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = a2.get(i10);
                i10++;
                if (((t0) ((t1) obj)).f11010b == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        t1 t1Var = (t1) obj;
        if (t1Var == null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33) {
                processName = Process.myProcessName();
                j.d(processName, "{\n      Process.myProcessName()\n    }");
            } else if (i11 < 28 || (processName = Application.getProcessName()) == null) {
                processName = "";
            }
            j.e(processName, "processName");
            e eVar = new e(6, false);
            eVar.f47315b = processName;
            eVar.f47316c = Integer.valueOf(myPid);
            eVar.d = 0;
            eVar.f47317e = false;
            return eVar.n();
        }
        return t1Var;
    }
}
