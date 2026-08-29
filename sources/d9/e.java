package d9;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.messaging.s;
import i9.t0;
import i9.t1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import rc.g;
import rc.i;
import rc.o;
public final class e {
    public static final e f5539a = new Object();

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
            list = o.f47121a;
        }
        ArrayList f9 = g.f(list);
        ArrayList arrayList = new ArrayList();
        int size = f9.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = f9.get(i12);
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
            s sVar = new s(10, false);
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                sVar.f5185b = str2;
                sVar.d = Integer.valueOf(runningAppProcessInfo.pid);
                sVar.f5187e = Integer.valueOf(runningAppProcessInfo.importance);
                sVar.f5186c = Boolean.valueOf(j.a(runningAppProcessInfo.processName, str));
                arrayList2.add(sVar.k());
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
                if (((t0) ((t1) obj)).f8790b == myPid) {
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
            s sVar = new s(10, false);
            sVar.f5185b = processName;
            sVar.d = Integer.valueOf(myPid);
            sVar.f5187e = 0;
            sVar.f5186c = false;
            return sVar.k();
        }
        return t1Var;
    }
}
