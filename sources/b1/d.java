package b1;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import b8.f1;
import ed.q;
import ed.s;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import k2.p1;
import kotlin.jvm.internal.j;
import od.l;
import od.p;
import v0.h;
public abstract class d {
    public static final a f2329a = new Object();
    public static final Set f2330b;
    public static final int f2331c;
    public static final int d = 0;

    static {
        Set set;
        Integer[] numArr = {7, 20};
        int length = numArr.length;
        if (length != 0) {
            if (length != 1) {
                set = new LinkedHashSet(s.b(numArr.length));
                for (Integer num : numArr) {
                    set.add(num);
                }
            } else {
                set = Collections.singleton(numArr[0]);
                j.d(set, "singleton(...)");
            }
        } else {
            set = q.f9955a;
        }
        f2330b = set;
        f2331c = 1;
    }

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        j.e(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", f2331c);
        Parcel obtain = Parcel.obtain();
        j.d(obtain, "obtain(...)");
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain));
        intent.setFlags(65536);
    }

    public static boolean b(Bundle bundle, p pVar, Executor executor, h callback, CancellationSignal cancellationSignal) {
        j.e(executor, "executor");
        j.e(callback, "callback");
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        f1.a(cancellationSignal, new b(executor, callback, pVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 0));
        return true;
    }

    public static final boolean c(int i3, p pVar, l lVar, CancellationSignal cancellationSignal) {
        if (i3 != -1) {
            ?? obj = new Object();
            obj.f17361a = new w0.c(2, p1.j(i3, "activity with result code: ", " indicating not RESULT_OK"));
            if (i3 == 0) {
                obj.f17361a = new w0.b("activity is cancelled by the user.");
            }
            pVar.invoke(cancellationSignal, new c(lVar, obj, 0));
            return true;
        }
        return false;
    }
}
